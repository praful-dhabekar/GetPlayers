package com.praful.getplayers;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1,imageView2,imageView3,imageView4;
    TextView textView1,textView2,textView3,textView4;

    ArrayList<Player> arrayList = new ArrayList<Player>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Getting the control of all ImageViews
        imageView1 = (ImageView)findViewById(R.id.profile_pic_1);
        imageView2 = (ImageView)findViewById(R.id.profile_pic_2);
        imageView3 = (ImageView)findViewById(R.id.profile_pic_3);
        imageView4 = (ImageView)findViewById(R.id.profile_pic_4);

        //Getting control of all TextViews
        textView1 = (TextView)findViewById(R.id.profile_name_1);
        textView2 = (TextView)findViewById(R.id.profile_name_2);
        textView3 = (TextView)findViewById(R.id.profile_name_3);
        textView4 = (TextView)findViewById(R.id.profile_name_4);

        Player player1 = new Player(imageView1,textView1,"http://static.goal.com/4321800/4321812_news.jpg");
        Player player2 = new Player(imageView2,textView2,"http://static.goal.com/4254500/4254572_news.jpg");
        Player player3 = new Player(imageView3,textView3,"http://img.uefa.com/imgml/TP/players/9/2015/324x324/106375.jpg");
        Player player4 = new Player(imageView4,textView4,"http://static.goal.com/113800/113802_news.jpg");

        arrayList.add(player1);
        arrayList.add(player2);
        arrayList.add(player3);
        arrayList.add(player4);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Getting Players..", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                for(int i=0;i<=3;i++){
                    Picasso.with(MainActivity.this).load(arrayList.get(i).url).into(arrayList.get(i).imageView);

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
