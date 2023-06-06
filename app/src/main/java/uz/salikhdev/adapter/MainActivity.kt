package uz.salikhdev.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import uz.salikhdev.adapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapter by lazy { MyAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setAdapter()
        setDataToAdapter()

    }

    private fun setDataToAdapter() {

        val data = ArrayList<String>()
        data.add("John")
        data.add("Alex")
        data.add("Steve")
        data.add("Ahmad")
        data.add("Joe")
        data.add("Iln")
        data.add("Musk")
        adapter.setData(data)

    }

    private fun setAdapter() {
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }


}