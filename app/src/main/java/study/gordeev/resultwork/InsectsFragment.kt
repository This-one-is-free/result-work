package study.gordeev.resultwork

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class InsectsFragment : Fragment() {

    lateinit var insectsRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_insects, container, false)

        val insectsList: List<Data> = listOf(
            Data(R.drawable.ant_picture, "Муравей"),
            Data(R.drawable.bee_picture, "Пчела"),
            Data(R.drawable.butterfly_picture, "Бабочка"),
            Data(R.drawable.dragonfly_picture, "Стрекоза"),
            Data(R.drawable.grasshopper_picture, "Кузнечик"),
            Data(R.drawable.spider_picture, "Паук")
        )

        insectsRecyclerView = view.findViewById(R.id.insects_recycler_view)
        insectsRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        insectsRecyclerView.adapter = InsectsAdapter(insectsList)

        return view
    }
}