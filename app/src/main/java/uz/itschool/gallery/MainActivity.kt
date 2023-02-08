package uz.itschool.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var images = mutableListOf<ImageView>();
    var k = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        images.add(apr1)
        images.add(apr2)
        images.add(apr3)
        images.add(apr4)
        images.add(apr5)
        images.add(apr6)
        images.add(apr7)
        images.add(apr8)
        images.add(apr9)

        img1.setOnClickListener{
           imageOpen(apr1)
           k=0
        }
        img2.setOnClickListener{
            imageOpen(apr2)
            k = 1
        }
        img3.setOnClickListener {
            imageOpen(apr3)
            k=2
        }
        img4.setOnClickListener {
            imageOpen(apr4)
            k=3
        }
        img5.setOnClickListener {
            imageOpen(apr5)
            k=4
        }
        img6.setOnClickListener {
            imageOpen(apr6)
            k=5
        }
        img7.setOnClickListener {
            imageOpen(apr7)
            k=6
        }
        img8.setOnClickListener {
            imageOpen(apr8)
            k=7
        }
        img9.setOnClickListener {
            imageOpen(apr9)
            k=8
        }


        button.setOnClickListener{
            if(k < 8){
                k++
                images[k].setVisibility(View.VISIBLE)

            }
            else{
                k=0
                images[k].setVisibility(View.VISIBLE)
                for(i in 1 until images.size){
                    images[i].setVisibility(View.INVISIBLE)
                }
            }
            button2.setOnClickListener{
                if(k > 0){
                    images[k].setVisibility(View.INVISIBLE)
                    k--
                    images[k].setVisibility(View.VISIBLE)
                }
                else{
                    k=8
                    images[k].setVisibility(View.VISIBLE)
                }
            }

        apr1.setOnClickListener{
            imageClose(apr1)
        }
        apr2.setOnClickListener{
            imageClose(apr2)
        }
        apr3.setOnClickListener {
            imageClose(apr3)
        }
        apr4.setOnClickListener {
            imageClose(apr4)
        }
        apr5.setOnClickListener {
            imageClose(apr5)
        }
            apr6.setOnClickListener {
                imageClose(apr6)
            }
        apr7.setOnClickListener {
            imageClose(apr7)
        }
            apr8.setOnClickListener {
                imageClose(apr8)
            }
            apr9.setOnClickListener {
                imageClose(apr9)
            }
        }
    }
    fun imageClose(imageView: ImageView){
        imageView.setVisibility(View.INVISIBLE);
        switchOff(button, button2)
    }
    fun imageOpen(apr2: ImageView){
        apr2.setVisibility(View.VISIBLE);
        switchOn(button, button2)
    }
    fun switchOn(button1: Button, button2: Button){
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
    }
    fun switchOff(button1: Button, button2: Button){
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
    }

}
