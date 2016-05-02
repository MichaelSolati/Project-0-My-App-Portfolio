package com.michaelsolati.myappportfolio;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View v) {
        String buttonText = ((Button) v).getText().toString();
        Toast.makeText(this, "This button will launch the " + buttonText + " app", Toast.LENGTH_LONG).show();
    }

    public void launchPopularMovies(View v) {
        String buttonText = ((Button) v).getText().toString();
        Toast.makeText(this, "Launching the " + buttonText + " app", Toast.LENGTH_LONG).show();
        openApp(this, "com.michaelsolati.popularmovies");
    }

    /** Open another app.
     * @param context current Context, like Activity, App, or Service
     * @param packageName the full package name of the app to open
     * @return true if likely successful, false if unsuccessful
     */
    public static boolean openApp(Context context, String packageName) {
        PackageManager manager = context.getPackageManager();
        try {
            Intent i = manager.getLaunchIntentForPackage(packageName);
            if (i == null) {
                return false;
                //throw new PackageManager.NameNotFoundException();
            }
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            context.startActivity(i);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
