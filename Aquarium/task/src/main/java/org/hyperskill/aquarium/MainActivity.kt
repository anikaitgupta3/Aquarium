package org.hyperskill.aquarium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import java.io.Serializable


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageview = findViewById<ImageView>(R.id.image_view)
        var textviewname = findViewById<TextView>(R.id.tv_name)
        var textviewdesc = findViewById<TextView>(R.id.tv_description)

        var help1 = listOf(
            "These colorful, ornamental fish are a variety of the Amur carp. " +
                    "They were originally found in Central Europe and Asia, " +
                    "but they’ve spread to many other parts of the world. " +
                    "Koi carp are popular with breeders, and there are currently over 100 varieties " +
                    "created through breeding.\n" +
                    "\n" +
                    "The average age of a koi carp can vary based on the part of the world it’s bred in. " +
                    "Carps bred outside of Japan have an average lifespan of around 15 years," +
                    " while carps bred in Japan can live 40 years or more. The oldest koi carp on record," +
                    " which was a fish named Hanako, reportedly lived for 226 years!",
        )
        textviewdesc.setText(help1[0])
        var animalname1 = listOf("Koi Carp")
        textviewname.setText(animalname1[0])
        val bundle: Bundle? = intent.extras
        imageview.setImageResource(R.drawable.image1)
        //bundle?.let{
        //bundle.apply {
        var animalimage = bundle?.getSerializable("imageAnimals") as List<Int>?
        var animalname = bundle?.getSerializable("nameAnimals") as List<String>?
        var animaldesc = bundle?.getSerializable("descriptionAnimals") as List<String>?
        if (animalimage != null) {
            //imageview.setImageResource(animalimage[0])
            imageview.setImageResource(animalimage[0])
        } else{
            Log.i("Gets into here","1")
        //var animalimage1=listOf(R.drawable.image1)

              }
                if (animalname != null) {
                    //textviewname.text=animalname[0]
                    textviewname.setText(animalname[0])

                }
                else {
                    Log.i("Gets into here","2")
                }

                if(animaldesc!=null){
                    //imageview.setImageResource(animalimage[0])
                    textviewdesc.setText(animaldesc[0])
                }
                else{
                    /*var help1=listOf(
                        "These colorful, ornamental fish are a variety of the Amur carp. " +
                                "They were originally found in Central Europe and Asia, " +
                                "but they’ve spread to many other parts of the world. " +
                                "Koi carp are popular with breeders, and there are currently over 100 varieties " +
                                "created through breeding.\n" +
                                "\n" +
                                "The average age of a koi carp can vary based on the part of the world it’s bred in. " +
                                "Carps bred outside of Japan have an average lifespan of around 15 years," +
                                " while carps bred in Japan can live 40 years or more. The oldest koi carp on record," +
                                " which was a fish named Hanako, reportedly lived for 226 years!",
                    )
                    textviewdesc.setText(help1[0])*/
                    Log.i("Gets into here","3")
                }
                //imageview.setImageResource(animalimage[0])
                //textviewname.text=animalname[0]
                //textviewdesc.text=animaldesc[0]
            //}
        //}

    }
}
