package com.itcroc.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView;
    private MultiAutoCompleteTextView multiAutoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        multiAutoCompleteTextView=(MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);

        String[] countries=getResources().getStringArray(R.array.countries);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,countries);

        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

        multiAutoCompleteTextView.setThreshold(1);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        multiAutoCompleteTextView.setAdapter(adapter);

    }
}
