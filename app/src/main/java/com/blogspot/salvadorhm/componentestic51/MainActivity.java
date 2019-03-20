package com.blogspot.salvadorhm.componentestic51;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(@NonNull View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_button) {
            Intent intent = new Intent(getApplicationContext(),Activity_Button.class);
            startActivity(intent);
        } else if (id == R.id.nav_calendar_view) {
            Intent intent = new Intent(getApplicationContext(),Activity_Calendar_View.class);
            startActivity(intent);
        } else if (id == R.id.nav_card_view) {
            Intent intent = new Intent(getApplicationContext(),activity_cardview.class);
            startActivity(intent);
        } else if (id == R.id.nav_check_box) {
            Intent intent = new Intent(getApplicationContext(),Activity_Check_Box.class);
            startActivity(intent);
        } else if (id == R.id.nav_edit_text) {
            Intent intent = new Intent(getApplicationContext(),Activity_edittext.class);
            startActivity(intent);
        } else if (id == R.id.nav_floating_button) {
            Intent intent = new Intent(getApplicationContext(),Activity_Floating_Button.class);
            startActivity(intent);
        } else if (id == R.id.nav_image_button) {
            Intent intent = new Intent(getApplicationContext(),activity_image_button.class);
            startActivity(intent);
        } else if (id == R.id.nav_image_view) {
            Intent intent = new Intent(getApplicationContext(),Activity_Image_View.class);
            startActivity(intent);
        } else if (id == R.id.nav_map_view) {
            Intent intent = new Intent(getApplicationContext(),Activity_Map_View.class);
            startActivity(intent);
        } else if (id == R.id.nav_progress_bar) {
            Intent intent = new Intent(getApplicationContext(),activity_progress_bar.class);
            startActivity(intent);
        } else if (id == R.id.nav_radio_button) {
            Intent intent = new Intent(getApplicationContext(),Activity_Radio_Button.class);
            startActivity(intent);
        } else if (id == R.id.nav_rating_bar) {
            Intent intent = new Intent(getApplicationContext(),Activity_Rating_Bar.class);
            startActivity(intent);
        } else if (id == R.id.nav_scroll_view) {
            Intent intent = new Intent(getApplicationContext(),Activity_Scroll_View.class);
            startActivity(intent);
        } else if (id == R.id.nav_seek_bar) {
            Intent intent = new Intent(getApplicationContext(),Activity_Seek_Bar.class);
            startActivity(intent);
        } else if (id == R.id.nav_spinner) {
            Intent intent = new Intent(getApplicationContext(), activity_spinner.class);
            startActivity(intent);
        }else if (id == R.id.nav_switch) {
            Intent intent = new Intent(getApplicationContext(), Activity_Switch.class);
            startActivity(intent);
        }else if (id == R.id.nav_tab_layout) {
            Intent intent = new Intent(getApplicationContext(), Activity_List_View.class);
            startActivity(intent);
        }else if (id == R.id.nav_toggle_button) {
            Intent intent = new Intent(getApplicationContext(), Activity_Toggle_Button.class);
            startActivity(intent);
        }else if (id == R.id.nav_video_view) {
            Intent intent = new Intent(getApplicationContext(), Activity_Video_View.class);
            startActivity(intent);
        }else if (id == R.id.nav_web_view) {
            Intent intent = new Intent(getApplicationContext(),Activity_Web_View.class);
            startActivity(intent);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
