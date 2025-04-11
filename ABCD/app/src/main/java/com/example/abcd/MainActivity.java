package com.example.abcd;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "myTag";
    private boolean isVertical = true;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.txt_name);
        Button button = findViewById(R.id.btn_click_me);
        ImageView imageView = findViewById(R.id.img_flashlight);
        ImageButton imageButton = findViewById(R.id.img_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Hello " + name, Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Button clicked with name: " + name);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isVertical) {
                    imageView.setRotation(90);
                    Toast.makeText(MainActivity.this, "Image is now Vertical", Toast.LENGTH_SHORT).show();
                } else {
                    imageView.setRotation(0);
                    Toast.makeText(MainActivity.this, "Image is now Horizontal", Toast.LENGTH_SHORT).show();
                }
                isVertical = !isVertical;
                Log.d(TAG, "Image Button clicked, ImageView rotated");
            }
        });
    }
}