package be.abstraction.bankapp.screens

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import be.abstraction.bankapp.R
import be.abstraction.core.interfaces.IBankProvider
import be.abstraction.core.models.Bank
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val bankProvider: IBankProvider by inject()
    private lateinit var banks: List<Bank>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        banks = bankProvider.getBanks()

        val bankNameList: List<String> = banks.map { it.name }
        bankListView.adapter = ArrayAdapter(this, R.layout.bank_list_view_item, bankNameList)
    }
}
