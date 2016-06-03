package com.example.omar.orderin.General;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

import java.io.ByteArrayOutputStream;


/**
 * Created by th on 02/06/2016.
 */
public class Soura {

    String imageString;
    Bitmap image;

    public Soura(String imageString)
    {
        this.imageString = imageString;
        convertStringToImage();
    }

    private void convertStringToImage()
    {
        try {
            byte [] encodeByte= Base64.decode(imageString, Base64.DEFAULT);
            image = BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.length);
        } catch(Exception e) {
            e.getMessage();
            //TODO: add default image if this fails
        }
    }

    public Soura(Bitmap image)
    {
        this.image = image;
        convertImageToString();
    }

    private void convertImageToString()
    {
        ByteArrayOutputStream baos=new  ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.PNG,100, baos);
        byte [] b=baos.toByteArray();
        imageString =Base64.encodeToString(b, Base64.DEFAULT);
    }

    public Bitmap getImage() {
        return image;
    }

    public String getImageString() {
        return imageString;
    }


}
