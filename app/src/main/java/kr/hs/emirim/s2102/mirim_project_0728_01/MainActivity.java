package kr.hs.emirim.s2102.mirim_project_0728_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {
    RatingBar rb1, rb2, rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = findViewById(R.id.rating_small);
        rb2 = findViewById(R.id.rating_medium);
        rb3 = findViewById(R.id.rating_basic);

        Button btnInc= findViewById(R.id.btn_inc);
        Button btnDec = findViewById(R.id.btn_dec);
        btnInc.setOnClickListener(btnListenter);
        btnDec.setOnClickListener(btnListenter);
    }

    View.OnClickListener btnListenter = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_inc:
                    rb1.setRating(rb1.getRating()+rb1.getStepSize());
                    rb2.setRating(rb2.getRating()+rb2.getStepSize());
                    rb3.setRating(rb3.getRating()+rb3.getStepSize());
                    break;
                case R.id.btn_dec:
                    rb1.setRating(rb1.getRating()-rb1.getStepSize());
                    rb2.setRating(rb2.getRating()-rb2.getStepSize());
                    rb3.setRating(rb3.getRating()-rb3.getStepSize());
                    break;
            }
        }
    };
}