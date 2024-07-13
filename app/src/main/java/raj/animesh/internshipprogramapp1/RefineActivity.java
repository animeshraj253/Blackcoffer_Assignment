package raj.animesh.internshipprogramapp1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultRegistry;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import raj.animesh.internshipprogramapp1.databinding.ActivityRefineBinding;

public class RefineActivity extends AppCompatActivity {
ActivityRefineBinding binding;

    Spinner mySpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRefineBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Data source
        String [] listItems = { "Available | Hey Let Us Connect", "Away | Stay Discrete And Watch", "Busy | Do Not Disturb | Will Catch Up Later", "SOS | Emergency! Need Assistance! Help" };

        // Getting access to spinner
        mySpinner = binding.spinnerRefine;

        // making bridge between Data source and view
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                R.layout.item_list_layout,
                listItems);

        // connecting Array Adapter to spinner
        mySpinner.setAdapter(arrayAdapter);


        // Back to main activity
        binding.backImageBtn.setOnClickListener(v -> {
           finish();
           startActivity(new Intent(this, MainActivity.class));
        });

        // Back to main activity
        binding.saveBtn.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });

        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                binding.seekzBarDistanceTxtRefine.setText(""+progress + " KM");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // code here
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //code here
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}