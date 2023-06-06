package uz.salikhdev.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private val data: ArrayList<String> = ArrayList()

    //Malumotlarni qo'shish uchun funksya
    fun setData(data: ArrayList<String>) {
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    // XML fayldan elementlarni olish va ViewHolderga bog'lash
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    // Ma'lumotlarni RecyclerView elementlari bilan bog'lash
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.textView.text = item
    }

    // Ma'lumotlar sonini qaytarish
    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView = itemView.findViewById(R.id.textView)
    }

}