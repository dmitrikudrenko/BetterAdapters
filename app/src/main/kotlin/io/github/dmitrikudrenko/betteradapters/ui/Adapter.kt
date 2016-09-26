package io.github.dmitrikudrenko.betteradapters.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.dmitrikudrenko.betteradapters.ui.holder.BetterViewHolder
import io.github.dmitrikudrenko.betteradapters.ui.viewmodel.ViewModel


class Adapter(val items: Array<ViewModel>) : RecyclerView.Adapter<BetterViewHolder<ViewModel>>() {
    private val typeFactory = TypesFactoryImpl()

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: BetterViewHolder<ViewModel>?, position: Int) {
        holder?.bind(items[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BetterViewHolder<ViewModel> {
        if (parent != null) {
            val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
            return typeFactory.holder(viewType, view)
        }
        throw RuntimeException("Parent is null")
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].type(typeFactory)
    }
}