package be.abstraction.bankapp.screens

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import be.abstraction.bankapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var bankProvider: IBankProvider
    lateinit var banks: List<Bank>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bankProvider = BankProvider() // todo: inject via Koin
        banks = bankProvider.getBanks()

        val bankNameList: List<String> = banks.map { it.name }
        bankListView.adapter = ArrayAdapter(this, R.layout.bank_list_view_item, bankNameList)
    }
}
