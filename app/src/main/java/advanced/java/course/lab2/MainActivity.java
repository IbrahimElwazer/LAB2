package advanced.java.course.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final int[] counter = {0};
        final Button gameButton = new Button(this);

        setContentView(gameButton);

        super.onCreate(savedInstanceState);

        gameButton.setText("Click Me !");

        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter[0]++;
                gameButton.setText("You clicked me " + String.valueOf(counter[0]) + " times");
            }
        });

    }
}
