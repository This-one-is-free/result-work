package study.gordeev.resultwork

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AnimalsFragment : Fragment() {

    lateinit var animalsRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_animals, container, false)

        val animalsList: List<Data> = listOf(
            Data(R.drawable.cow_picture, "Корова"),
            Data(R.drawable.dog_picture, "Собака"),
            Data(R.drawable.cat_picture, "Кошка"),
            Data(R.drawable.bear_picture, "Медведь"),
            Data(R.drawable.elephant_picture, "Слон"),
            Data(R.drawable.wolf_picture, "Волк")
        )

        animalsRecyclerView = view.findViewById(R.id.animals_recycler_view)
        animalsRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        animalsRecyclerView.adapter = AnimalsAdapter(animalsList)

        return view
    }
}