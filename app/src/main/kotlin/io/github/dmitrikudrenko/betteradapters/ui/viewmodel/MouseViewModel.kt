package io.github.dmitrikudrenko.betteradapters.ui.viewmodel

import io.github.dmitrikudrenko.betteradapters.model.Mouse
import io.github.dmitrikudrenko.betteradapters.ui.TypesFactory


class MouseViewModel(val mouse: Mouse): ViewModel() {
    override fun type(typesFactory: TypesFactory): Int {
        return typesFactory.type(mouse)
    }
}