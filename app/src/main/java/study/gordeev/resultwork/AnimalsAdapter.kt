package study.gordeev.resultwork

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AnimalsAdapter(private val animalsList: List<Data>) :
    RecyclerView.Adapter<AnimalsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalsViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return AnimalsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AnimalsViewHolder, position: Int) {
        val animals = animalsList[position]
        holder.bind(animals)
    }

    override fun getItemCount(): Int {
        return animalsList.size
    }
}