package com.sweetmay.advancedcryptoindicators.data.di

import org.koin.dsl.module

val dataModule = module {
    single { Car() }
}

class Car(){

}