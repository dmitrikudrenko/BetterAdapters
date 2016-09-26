package io.github.dmitrikudrenko.betteradapters.ui.viewmodel

import io.github.dmitrikudrenko.betteradapters.model.Duck
import io.github.dmitrikudrenko.betteradapters.ui.TypesFactory


class DuckViewModel(val duck: Duck): ViewModel() {
    override fun type(typesFactory: TypesFactory): Int {
        return typesFactory.type(duck)
    }
}