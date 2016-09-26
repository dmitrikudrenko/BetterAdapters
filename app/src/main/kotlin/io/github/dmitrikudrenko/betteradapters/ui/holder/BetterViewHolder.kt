package io.github.dmitrikudrenko.betteradapters.ui.holder

import android.support.v7.widget.RecyclerView
import android.view.View


abstract class BetterViewHolder<in T>(view: View): RecyclerView.ViewHolder(view) {
    abstract fun bind(item: T)
}