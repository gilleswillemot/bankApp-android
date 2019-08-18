package be.abstraction.bankapp.moduleAssembler

import be.abstraction.core.interfaces.IBankProvider
import be.abstraction.providers.BankProvider
import org.koin.dsl.module

// just declare it
val myModule = module {
    single { BankProvider() as IBankProvider }
//    factory { MySimplePresenter(get()) }
}