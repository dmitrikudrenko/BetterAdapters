package io.github.dmitrikudrenko.betteradapters.ui.viewmodel

import io.github.dmitrikudrenko.betteradapters.ui.TypesFactory


abstract class ViewModel {
    abstract fun type(typesFactory: TypesFactory): Int
}