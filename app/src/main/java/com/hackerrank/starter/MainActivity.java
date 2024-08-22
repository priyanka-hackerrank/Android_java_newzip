/*
 ******** Guidelines ********

 Click: Run > Build & Run
 Refer to README.md for additional information
 */
package com.hackerrank.starter;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.hackerrank.starter.databinding.ActivityMainBinding;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    // Initialize the count to 0
    private Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the view hierarchy and bind the object to it
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        // Set the view hierarchy as the current layout for the activity
        setContentView(binding.getRoot());
        // Setup and add the HackerRank logo in the toolbar
        setSupportActionBar(binding.toolbar);
        Objects.requireNonNull(getSupportActionBar()).setHomeAsUpIndicator(R.drawable.ic_logo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Initially, update the textview to display the contents in the textview with count as 0
        this.updateTextView();

    }


    /**
     * Method to update the contents of the textview with the updated count property
     */
    public void updateTextView() {
        this.binding.textview.setText("Change This");
    }


}

