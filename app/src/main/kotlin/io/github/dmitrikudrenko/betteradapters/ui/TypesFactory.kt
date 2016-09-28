package io.github.dmitrikudrenko.betteradapters.ui

import android.view.View
import io.github.dmitrikudrenko.betteradapters.model.Duck
import io.github.dmitrikudrenko.betteradapters.model.Mouse
import io.github.dmitrikudrenko.betteradapters.ui.holder.BetterViewHolder


interface TypesFactory {
    fun type(duck: Duck): Int
    fun type(mouse: Mouse): Int

    fun holder(type: Int, view: View): BetterViewHolder<*>
}
