package com.example.madassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputValue;
    private Spinner fromUnitSpinner;
    private Spinner toUnitSpinner;
    private Button convertButton;
    private TextView resultTextView;

    private String[] units = {"Feet", "Inches", "Centimeters", "Meters", "Yards"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        inputValue = findViewById(R.id.inputValue);
        fromUnitSpinner = findViewById(R.id.fromUnitSpinner);
        toUnitSpinner = findViewById(R.id.toUnitSpinner);
        convertButton = findViewById(R.id.convertButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Set up spinners with units
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, units);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        fromUnitSpinner.setAdapter(adapter);
        toUnitSpinner.setAdapter(adapter);

        // Set up convert button click listener
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertUnits();
            }
        });
    }

    private void convertUnits() {
        // Get input value
        String inputValueStr = inputValue.getText().toString();
        if (inputValueStr.isEmpty()) {
            Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show();
            return;
        }

        double value;
        try {
            value = Double.parseDouble(inputValueStr);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid number format", Toast.LENGTH_SHORT).show();
            return;
        }

        // Get selected units
        String fromUnit = units[fromUnitSpinner.getSelectedItemPosition()];
        String toUnit = units[toUnitSpinner.getSelectedItemPosition()];

        // Convert to meters first (as our intermediate unit)
        double valueInMeters = convertToMeters(value, fromUnit);

        // Then convert from meters to target unit
        double result = convertFromMeters(valueInMeters, toUnit);

        // Display result
        String resultText = String.format("%.4f %s = %.4f %s", value, fromUnit, result, toUnit);
        resultTextView.setText(resultText);
    }

    private double convertToMeters(double value, String fromUnit) {
        switch (fromUnit) {
            case "Feet":
                return value * 0.3048;
            case "Inches":
                return value * 0.0254;
            case "Centimeters":
                return value * 0.01;
            case "Meters":
                return value;
            case "Yards":
                return value * 0.9144;
            default:
                return 0;
        }
    }

    private double convertFromMeters(double meters, String toUnit) {
        switch (toUnit) {
            case "Feet":
                return meters / 0.3048;
            case "Inches":
                return meters / 0.0254;
            case "Centimeters":
                return meters / 0.01;
            case "Meters":
                return meters;
            case "Yards":
                return meters / 0.9144;
            default:
                return 0;
        }
    }
}