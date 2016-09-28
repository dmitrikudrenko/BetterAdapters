package io.github.dmitrikudrenko.betteradapters.ui

import android.view.View
import io.github.dmitrikudrenko.betteradapters.R
import io.github.dmitrikudrenko.betteradapters.model.Duck
import io.github.dmitrikudrenko.betteradapters.model.Mouse
import io.github.dmitrikudrenko.betteradapters.ui.holder.BetterViewHolder
import io.github.dmitrikudrenko.betteradapters.ui.holder.DuckHolder
import io.github.dmitrikudrenko.betteradapters.ui.holder.MouseHolder


class TypesFactoryImpl : TypesFactory {
    override fun type(duck: Duck): Int {
        return R.layout.v_item_duck
    }

    override fun type(mouse: Mouse): Int {
        return R.layout.v_item_mouse
    }

    override fun holder(type: Int, view: View): BetterViewHolder<*> {
        when(type) {
            R.layout.v_item_duck -> return DuckHolder(view)
            R.layout.v_item_mouse -> return MouseHolder(view)
            else -> throw RuntimeException("Illegal view type")
        }
    }
}