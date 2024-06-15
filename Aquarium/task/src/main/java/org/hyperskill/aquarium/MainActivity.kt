package org.hyperskill.aquarium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.squareup.picasso.Picasso
import java.io.Serializable

/*class YourAdapterName : RecyclerView.Adapter<PageViewHolder>() {
    /*val bundle: Bundle? = intent.extras
    var animalimage = bundle?.getSerializable("imageAnimals") as List<String>?
    var animalname = bundle?.getSerializable("nameAnimals") as List<String>?
    var animaldesc = bundle?.getSerializable("descriptionAnimals") as List<String>?
    fun helpfun1(animalimage:List<String>,animalname:List<String>,animaldesc:List<String>,imageview: ImageView,textviewname:TextView,textviewdesc:TextView,ctr0:Int,ctr1:Int,ctr2:Int){
        if (animalimage != null) {
            Picasso.get()
                .load(animalimage[ctr0])
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into(imageview)
        } else{

        }
        if (animalname != null) {
            textviewname.setText(animalname[ctr1])
        }
        else {

        }

        if(animaldesc!=null){

            textviewdesc.setText(animaldesc[ctr2])

        }
        else{

        }
    }
    fun helpfun2(imageview: ImageView,textviewname:TextView,textviewdesc:TextView,ctr0:Int,ctr1:Int,ctr2:Int){
        var help1 = listOf(

            //Koi Carp
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

            // Spiny dogfish
            "The spiny dogfish is a type of shark with venomous spines in front of its dorsal fins." +
                    " Not only is it an aggressive hunter, but these fish are known to hunt in packs!" +
                    " Like many shark species, these fish grow slowly, " +
                    "and some females don’t reach full maturity until they’re over 30 years old.\n" +
                    "\n" +
                    "While the lifespan of the spiny dogfish is already impressive, " +
                    "some fish live for far longer than average. " +
                    "Spiny dogfish in the Pacific Ocean tend to live longer than fish in the Atlantic," +
                    " with some fish living longer than 80 years. " +
                    "Females tend to mature later than males, and they usually live longer too.",

            //Kaluga
            "Sometimes called the river beluga, the kaluga is a type of predatory sturgeon." +
                    " While these fish spend the majority of their time in freshwater, " +
                    "they’re also able to survive in salt water. " +
                    "The kaluga is one of the world’s largest freshwater fish species and can grow to be more than 18 feet long, " +
                    "with a weight of over 2,200 pounds.\n" +
                    "\n" +
                    "Kalugas are overfished, which has left the species vulnerable to extinction. " +
                    "Although many kaluga are killed before they fully mature, " +
                    "these fish have the potential to live very long lives. " +
                    "One kaluga that was caught in China is estimated to be over 100 years old."
        )
        textviewdesc.setText(help1[ctr0])
        var animalname1 = listOf("Koi Carp", "Spiny Dogfish", "Kaluga");
        textviewname.setText(animalname1[ctr1])

        var animalimage1=listOf(
            "https://ucarecdn.com/42045846-b968-4a88-81ec-df73bec4fcb7/",

            "https://ucarecdn.com/5aa10eb3-fc49-4304-9057-adf1d29a9b4c/",

            "https://ucarecdn.com/c5fd39b9-7690-4616-b7dc-d3f8da883146/"
        )

        Picasso.get()
            .load(animalimage1[ctr2])
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .into(imageview)
    }*/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewHolder {

           return PageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.page_item, parent, false))

    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PageViewHolder, position: Int) {
        //TODO("Not yet implemented")
        holder.itemView.run {
            /*val bundle: Bundle? = intent.extras
            var animalimage = bundle?.getSerializable("imageAnimals") as List<String>?
            var animalname = bundle?.getSerializable("nameAnimals") as List<String>?
            var animaldesc = bundle?.getSerializable("descriptionAnimals") as List<String>?*/

        }
    }

}*/
class PageViewHolder(iV: View) : RecyclerView.ViewHolder(iV){
    var imageview = iV.findViewById<ImageView>(R.id.image_view)
    var textviewname = iV.findViewById<TextView>(R.id.tv_name)
    var textviewdesc = iV.findViewById<TextView>(R.id.tv_description)

    //var buttonprev=iV.findViewById<Button>(R.id.btn_previous)
    //var buttonnext=iV.findViewById<Button>(R.id.btn_next)
}
class MainActivity : AppCompatActivity() {
    /*fun helpfun1(animalimage:List<String>,animalname:List<String>,animaldesc:List<String>,imageview: ImageView,textviewname:TextView,textviewdesc:TextView,ctr0:Int,ctr1:Int,ctr2:Int){
        if (animalimage != null) {
            Picasso.get()
                .load(animalimage[ctr0])
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into(imageview)
        } else{

        }
        if (animalname != null) {
            textviewname.setText(animalname[ctr1])
        }
        else {

        }

        if(animaldesc!=null){

            textviewdesc.setText(animaldesc[ctr2])

        }
        else{

        }
    }
    fun helpfun2(imageview: ImageView,textviewname:TextView,textviewdesc:TextView,ctr0:Int,ctr1:Int,ctr2:Int){
        var help1 = listOf(

            //Koi Carp
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

            // Spiny dogfish
            "The spiny dogfish is a type of shark with venomous spines in front of its dorsal fins." +
                    " Not only is it an aggressive hunter, but these fish are known to hunt in packs!" +
                    " Like many shark species, these fish grow slowly, " +
                    "and some females don’t reach full maturity until they’re over 30 years old.\n" +
                    "\n" +
                    "While the lifespan of the spiny dogfish is already impressive, " +
                    "some fish live for far longer than average. " +
                    "Spiny dogfish in the Pacific Ocean tend to live longer than fish in the Atlantic," +
                    " with some fish living longer than 80 years. " +
                    "Females tend to mature later than males, and they usually live longer too.",

            //Kaluga
            "Sometimes called the river beluga, the kaluga is a type of predatory sturgeon." +
                    " While these fish spend the majority of their time in freshwater, " +
                    "they’re also able to survive in salt water. " +
                    "The kaluga is one of the world’s largest freshwater fish species and can grow to be more than 18 feet long, " +
                    "with a weight of over 2,200 pounds.\n" +
                    "\n" +
                    "Kalugas are overfished, which has left the species vulnerable to extinction. " +
                    "Although many kaluga are killed before they fully mature, " +
                    "these fish have the potential to live very long lives. " +
                    "One kaluga that was caught in China is estimated to be over 100 years old."
        )
        textviewdesc.setText(help1[ctr0])
        var animalname1 = listOf("Koi Carp", "Spiny Dogfish", "Kaluga");
        textviewname.setText(animalname1[ctr1])

        var animalimage1=listOf(
            "https://ucarecdn.com/42045846-b968-4a88-81ec-df73bec4fcb7/",

            "https://ucarecdn.com/5aa10eb3-fc49-4304-9057-adf1d29a9b4c/",

            "https://ucarecdn.com/c5fd39b9-7690-4616-b7dc-d3f8da883146/"
        )

        Picasso.get()
            .load(animalimage1[ctr2])
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .into(imageview)
    }*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager2 = findViewById<ViewPager2>(R.id.viewpager2)
        val pagerAdapter = YourAdapterName()
        viewPager2.adapter = pagerAdapter
        val tabLayout=findViewById<TabLayout>(R.id.tab_layout)



        /*var imageview = findViewById<ImageView>(R.id.image_view)
        var textviewname = findViewById<TextView>(R.id.tv_name)
        var textviewdesc = findViewById<TextView>(R.id.tv_description)
        var buttonprev=findViewById<Button>(R.id.btn_previous)
        var buttonnext=findViewById<Button>(R.id.btn_next)*/

        /*var ctr0=0
        var ctr1=0
        var ctr2=0
        var flag0=0
        var flag1=0
        var flag2=0
        var help1 = listOf(

            //Koi Carp
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

            // Spiny dogfish
            "The spiny dogfish is a type of shark with venomous spines in front of its dorsal fins." +
                    " Not only is it an aggressive hunter, but these fish are known to hunt in packs!" +
                    " Like many shark species, these fish grow slowly, " +
                    "and some females don’t reach full maturity until they’re over 30 years old.\n" +
                    "\n" +
                    "While the lifespan of the spiny dogfish is already impressive, " +
                    "some fish live for far longer than average. " +
                    "Spiny dogfish in the Pacific Ocean tend to live longer than fish in the Atlantic," +
                    " with some fish living longer than 80 years. " +
                    "Females tend to mature later than males, and they usually live longer too.",

            //Kaluga
            "Sometimes called the river beluga, the kaluga is a type of predatory sturgeon." +
                    " While these fish spend the majority of their time in freshwater, " +
                    "they’re also able to survive in salt water. " +
                    "The kaluga is one of the world’s largest freshwater fish species and can grow to be more than 18 feet long, " +
                    "with a weight of over 2,200 pounds.\n" +
                    "\n" +
                    "Kalugas are overfished, which has left the species vulnerable to extinction. " +
                    "Although many kaluga are killed before they fully mature, " +
                    "these fish have the potential to live very long lives. " +
                    "One kaluga that was caught in China is estimated to be over 100 years old."
        )
        textviewdesc.setText(help1[ctr0])
        var animalname1 = listOf("Koi Carp", "Spiny Dogfish", "Kaluga");
        textviewname.setText(animalname1[ctr1])

        var animalimage1=listOf(
            "https://ucarecdn.com/42045846-b968-4a88-81ec-df73bec4fcb7/",

            "https://ucarecdn.com/5aa10eb3-fc49-4304-9057-adf1d29a9b4c/",

            "https://ucarecdn.com/c5fd39b9-7690-4616-b7dc-d3f8da883146/"
        )
        //imageview.setImageResource(R.drawable.image1)
        Picasso.get()
            .load(animalimage1[ctr2])
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .into(imageview)*/

        val bundle: Bundle? = intent.extras
        var animalimage = bundle?.getSerializable("imageAnimals") as List<String>?
        var animalname = bundle?.getSerializable("nameAnimals") as List<String>?
        var animaldesc = bundle?.getSerializable("descriptionAnimals") as List<String>?
        var animalname2 = listOf("Koi Carp", "Spiny Dogfish", "Kaluga");
        pagerAdapter.setData(animalimage,animalname,animaldesc)
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text="${animalname2[position]}"
            if(animalname!=null) {
                tab.text = "${animalname[position]}"
            }
            //else{

            //}
        }.attach()
        /*val intent1= Intent(this,YourAdapterName::class.java)
        intent1.putExtra("animalimage", animalimage as Serializable)
        intent1.putExtra("animalname",animalname as Serializable)
        intent1.putExtra("animaldesc",animaldesc as Serializable)
        startActivity(intent1)



        if (animalimage != null) {

            flag0=1
            Picasso.get()
                .load(animalimage[ctr0])
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into(imageview)
        } else{

              }
                if (animalname != null) {
                    textviewname.setText(animalname[ctr1])
                    flag1=1

                }
                else {

                }

                if(animaldesc!=null){
                    textviewdesc.setText(animaldesc[ctr2])
                    flag2=1
                }
                else{

                }*/
                /*buttonprev.setOnClickListener {
                    ctr0--
                    ctr1--
                    ctr2--
                    if(ctr0<0){
                        if(flag0==0){
                            ctr0=2
                        }
                        else{
                            if (animalimage != null) {
                                ctr0=animalimage.size-1
                            }
                        }
                    }
                    if(ctr1<0){
                        if(flag1==0){
                            ctr1=2
                        }
                        else{
                            if (animalname != null) {
                                ctr1=animalname.size-1
                            }
                        }
                    }
                    if(ctr2<0){
                        if(flag2==0){
                            ctr2=2
                        }
                        else{
                            if (animaldesc != null) {
                                ctr2=animaldesc.size-1
                            }
                        }
                    }
                    if(flag0==1 && flag1==1 && flag2==1){
                        if (animalimage != null && animalname!=null && animaldesc!=null) {
                            helpfun1(animalimage,animalname,animaldesc,imageview,textviewname,textviewdesc,ctr0,ctr1,ctr2)
                        }
                    }
                    else if(flag0==0 && flag1==0 && flag2==0){
                        helpfun2(imageview,textviewname,textviewdesc,ctr0,ctr1,ctr2)
                    }

                }
                buttonnext.setOnClickListener {
                     ctr0++
                    ctr1++
                    ctr2++
                    if(flag0==0){
                        if(ctr0>2){
                            ctr0=0
                        }
                    }
                    else if(flag0==1){
                        if (animalimage != null) {
                            if(ctr0>animalimage.size-1){
                                ctr0=0
                            }

                        }
                    }
                    if(flag1==0){
                        if(ctr1>2){
                            ctr1=0
                        }
                    }
                    else if(flag1==1){
                        if (animalname != null) {
                            if(ctr1>animalname.size-1){
                                ctr1=0
                            }

                        }
                    }
                    if(flag2==0){
                        if(ctr2>2){
                            ctr2=0
                        }
                    }
                    else if(flag2==1){
                        if (animaldesc != null) {
                            if(ctr2>animaldesc.size-1){
                                ctr2=0
                            }

                        }
                    }
                    if(flag0==1 && flag1==1 && flag2==1){
                        if (animalimage != null && animalname!=null && animaldesc!=null) {
                            helpfun1(animalimage,animalname,animaldesc,imageview,textviewname,textviewdesc,ctr0,ctr1,ctr2)
                        }
                    }
                    else if(flag0==0 && flag1==0 && flag2==0){
                        helpfun2(imageview,textviewname,textviewdesc,ctr0,ctr1,ctr2)
                    }

                 }*/

    }
}
