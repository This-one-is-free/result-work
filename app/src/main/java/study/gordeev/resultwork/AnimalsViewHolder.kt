package study.gordeev.resultwork

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class AnimalsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val animalsImageView: ImageView = itemView.findViewById(R.id.item_image_view)
    private val answerTextView: TextView = itemView.findViewById(R.id.answer_text_view)
    private val button: Button = itemView.findViewById(R.id.item_answer_button)

    fun bind(data: Data) {
        animalsImageView.setImageResource(data.image)
        answerTextView.text = data.answer

        button.setOnClickListener {
            Toast.makeText(itemView.context, data.answer, Toast.LENGTH_SHORT).show()
        }

    }


}