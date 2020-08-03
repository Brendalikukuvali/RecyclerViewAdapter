package layout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.row_age_item.view.*


class AgeRecyclerViewAdapter (val ageList: List<Int>) :
    RecyclerView.Adapter<AgeRecyclerViewAdapter.NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_age_item, parent, false)
        return NamesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return ageList.size
    }
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.tvAge.text = ageList[position].toString()
    }
    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)

    fun onBindViewHolder(holder: NamesRecyclerViewAdapter.NamesViewHolder, position: Int) {

    }

}