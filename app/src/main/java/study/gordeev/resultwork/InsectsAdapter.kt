package study.gordeev.resultwork

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class InsectsAdapter(private val insectsList: List<Data>) :
    RecyclerView.Adapter<InsectsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InsectsViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return InsectsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: InsectsViewHolder, position: Int) {
        val animals = insectsList[position]
        holder.bind(animals)
    }

    override fun getItemCount(): Int {
        return insectsList.size
    }
}