package be.abstraction.bankapp.moduleAssembler

import be.abstraction.bank.implementations.BankProvider
import be.abstraction.core.interfaces.IBankProvider
import org.koin.dsl.module

// Given some classes
class BankController(val bankProvider: IBankProvider)

// just declare it
val myModule = module {
    single { BankController(BankProvider()) }
//    factory { MySimplePresenter(get()) }
}