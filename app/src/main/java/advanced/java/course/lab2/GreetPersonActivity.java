package advanced.java.course.lab2;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class GreetPersonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLinearLayout = new LinearLayout(this);
        mainLinearLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams mainLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        mainLinearLayout.setLayoutParams(mainLayoutParams);

        final EditText editText = new EditText(this);
        editText.setHint("Enter your name...");
        mainLinearLayout.addView(editText);

        LinearLayout horizontalLinearLayout = new LinearLayout(this);
        horizontalLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams horizontalLayoutParams = new LinearLayout.LayoutParams( LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        horizontalLinearLayout.setGravity(Gravity.CENTER);
        horizontalLinearLayout.setLayoutParams(horizontalLayoutParams);


        Button englishButton = new Button(this);
        englishButton.setText("ENGLISH");
        horizontalLinearLayout.addView(englishButton);


        Button sverigeButton = new Button(this);
        sverigeButton.setText("SVERIGE");
        horizontalLinearLayout.addView(sverigeButton);

        mainLinearLayout.addView(horizontalLinearLayout);


        LinearLayout secondHorizontalLinearLayout = new LinearLayout(this);
        secondHorizontalLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams secondHorizontalLayoutParams = new LinearLayout.LayoutParams( LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        secondHorizontalLinearLayout.setGravity(Gravity.CENTER);
        secondHorizontalLinearLayout.setLayoutParams(secondHorizontalLayoutParams);



        Button suomeksiButton = new Button(this);
        suomeksiButton.setText("SUOMEKSI");
        secondHorizontalLinearLayout.addView(suomeksiButton);


        Button surpriseButton = new Button(this);
        surpriseButton.setText("SURPRISE");
        secondHorizontalLinearLayout.addView(surpriseButton);

        mainLinearLayout.addView(secondHorizontalLinearLayout);


        LinearLayout textViewLayout = new LinearLayout(this);
        textViewLayout.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams textViewLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        textViewLayout.setGravity(Gravity.CENTER);
        textViewLayout.setLayoutParams(textViewLayoutParams);

        final TextView name = new TextView(this);
        name.setTextSize(25);
        name.setText("What's your name?");

        textViewLayout.addView(name);
        mainLinearLayout.addView(textViewLayout);

        setContentView(mainLinearLayout);


        englishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();
                name.setText("Hi " + userInput);
            }
        });

        sverigeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();
                name.setText("Hejjsan " + userInput);
            }
        });

        suomeksiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();
                name.setText("Terve " + userInput);
            }
        });

        surpriseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();
                name.setText("Hola " + userInput);
            }
        });

    }
}
