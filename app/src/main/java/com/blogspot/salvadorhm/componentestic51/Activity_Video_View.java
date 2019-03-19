package com.blogspot.salvadorhm.componentestic51;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class Activity_Video_View extends AppCompatActivity {

    VideoView videoViewAAHR; // Crea un objeto del tipo VideoView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__video__view);

        videoViewAAHR = (VideoView) findViewById(R.id.vv_aahr); // Enlaza el objeto creado con el componente de la vista (layout)
        Uri url = Uri.parse("http://www.html5videoplayer.net/videos/toystory.mp4"); // Define una url (Uri) para cargar el recurso de video mediante internet
        videoViewAAHR.setMediaController(new MediaController(this)); // Coloca controles de reproducción para la vista de video
        videoViewAAHR.setVideoURI(url);
        videoViewAAHR.start();
    }
}
