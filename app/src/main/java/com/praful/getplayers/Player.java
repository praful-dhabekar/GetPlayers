package com.praful.getplayers;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Praful Dhabekar on 7/11/2017.
 */

public class Player {


    ImageView imageView;
    TextView name;
    String url;
    public Player(ImageView imageView, TextView name, String url) {

        this.imageView = imageView;
        this.name = name;
        this.url = url;

    }
}
