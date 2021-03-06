package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Toast appToast;

    public void showToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "";
        int duration = Toast.LENGTH_SHORT;

        switch (view.getId()) {
            case R.id.button_spotify:
                text = "This button will launch my Spotify App!";
                break;
            case R.id.button_scores:
                text = "This button will launch my Scores App!";
                break;
            case R.id.button_library:
                text = "This button will launch my Library App!";
                break;
            case R.id.button_bigger:
                text = "This button will launch my Build It Bigger App!";
                break;
            case R.id.button_reader:
                text = "This button will launch my XYZ Reader App!";
                break;
            case R.id.button_capstone:
                text = "This button will launch my Capstone App!";
                break;
        }

        if (appToast != null) {
            appToast.cancel();
        }
        appToast = Toast.makeText(context, text, duration);
        appToast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
