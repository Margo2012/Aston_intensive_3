package com.example.flagsandloadingpictures

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.flagsandloadingpictures.databinding.ActivityPicturesBinding

class PicturesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPicturesBinding
    private lateinit var mImageView: ImageView
    private lateinit var mLink: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPicturesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mImageView = binding.imagePicture
        mLink = binding.linkPicture

        val buttonLoadPicture: Button = binding.loadPicture
        buttonLoadPicture.setOnClickListener {
            val link = mLink.text.toString()
            Glide
                .with(this)
                .load(link)
                .into(mImageView)

            //Toast показывается внизу! Нужно свернуть клавиатуру, чтобы увидеть
            //сообщение об ошибке
            if (mImageView == null)
            {
                Toast.makeText(this, "Image didn`t load!", Toast.LENGTH_LONG).show()
            }
        }
    }


    companion object {
        //Ссылки на картинки, на которых можно проверить загрузку
        //на сайте rickandmortyapi.com, перебором можно посмотреть и другие картинки
        //1.jpeg, 2.jpeg, etc.
        const val PICTURE_LINK = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
        const val RESIZE_IMAGE =
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRe0O0260hzKyKursZUTtZAxECP0gSVJ2JXwQ&usqp=CAU"
    }
}