package advanced.java.course.lab2;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MoreComplexUIProgrammatically extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        LinearLayout containerLinearLayout = new LinearLayout(this);
        containerLinearLayout.setOrientation(LinearLayout.VERTICAL);
        LayoutParams containerLayoutParams = new LayoutParams( LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        containerLinearLayout.setLayoutParams(containerLayoutParams);


        LinearLayout horizontalLinearLayout = new LinearLayout(this);
        horizontalLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        LayoutParams layoutParams = new LayoutParams( LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        horizontalLinearLayout.setGravity(Gravity.CENTER);
        horizontalLinearLayout.setLayoutParams(layoutParams);



        Button addButton = new Button(this);
        addButton.setText("ADD");
        horizontalLinearLayout.addView(addButton);


        Button editButton = new Button(this);
        editButton.setText("EDIT");
        horizontalLinearLayout.addView(editButton);


        Button removeButton = new Button(this);
        removeButton.setText("REMOVE");
        horizontalLinearLayout.addView(removeButton);

        containerLinearLayout.addView(horizontalLinearLayout);

        final EditText editText = new EditText(this);
        editText.setHint("Enter name of the country...");
        containerLinearLayout.addView(editText);


        ListView countriesList = new ListView(this);
        final ArrayList<String> arrayList = new ArrayList<String>();
        final String[] countries = new String[] {
                "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra",
                "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina",
                "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan" };
        arrayList.addAll(0, Arrays.asList(countries));
        final ArrayAdapter<String> countriesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        countriesList.setAdapter(countriesAdapter);


        containerLinearLayout.addView(countriesList);

        setContentView(containerLinearLayout);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                arrayList.add(text);
                countriesAdapter.notifyDataSetChanged();
            }
        });

        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                arrayList.remove(text);
                countriesAdapter.notifyDataSetChanged();
            }
        });



    }
}
