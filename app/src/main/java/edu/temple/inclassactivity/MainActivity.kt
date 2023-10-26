package edu.temple.inclassactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.lifecycle.ViewModelProvider as ViewModelProvider
import androidx.lifecycle.ViewModelProvider as ViewModelProvider1

class MainActivity : AppCompatActivity() {

    lateinit var someVar : Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //if(::someVar.isInitialized)


        //val mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]


        // Fetch images into IntArray called imageArray
        val typedArray = resources.obtainTypedArray(R.array.image_ids)
        val imageArray = IntArray(typedArray.length()) {typedArray.getResourceId(it, 0)}
        typedArray.recycle()

        val myButton = findViewById<Button>(R.id.button)

//        (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as ImageDisplayFragment).setImages(imageArray)

        myButton.setOnClickListener{
            (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as ImageDisplayFragment).setImages(imageArray)
        }




        // Attach an instance of ImageDisplayFragment using factory method
        //val fragment = ImageDisplayFragment.newInstance(imageArray)
//

//        if (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) !is ImageDisplayFragment) {
//            supportFragmentManager
//                .beginTransaction()
//                .add(R.id.fragmentContainerView, ImageDisplayFragment())
//                .addToBackStack(null)
//                .setReorderingAllowed(true)
//                .commit()
//        }







    }

    fun imageSelected(itemId : Int){
        Toast.makeText(this,"You selected $itemId", Toast.LENGTH_SHORT).show()
    }

//    fun setImages(_images : IntArray){
//        images = _images
//
//        (view as RecyclerView).adapter = CustomRecyclerAdapter(images)
//    }

}