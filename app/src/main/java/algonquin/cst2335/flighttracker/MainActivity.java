package algonquin.cst2335.flighttracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import algonquin.cst2335.flighttracker.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding MainBinding;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.airline_app) {
            Intent aviationPage = new Intent(MainActivity.this, AviationActivity.class);
            startActivity(aviationPage);
            return true;
        }

        // Add more if statements here for other activities

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(MainBinding.getRoot());

        Intent aviationPage = new Intent( MainActivity.this, AviationActivity.class);

        Button aviation_Button = MainBinding.button1;

        aviation_Button.setOnClickListener( clk-> {
            startActivity( aviationPage);
        } );

    }
}