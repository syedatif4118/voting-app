package com.example.voting_app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText edName,edAdhar,edAge;
    TextView ansName,ansAdhar,ansage;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName = findViewById(R.id.edName);
        edAdhar = findViewById(R.id.edAdhar);
        edAge= findViewById(R.id.edAge);
        ansName = findViewById(R.id.ansName);
        ansAdhar = findViewById(R.id.ansAdhar);
        ansage =findViewById(R.id.ansAge);
        b1 = findViewById(R.id.btnvote);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int age;
                age = Integer.parseInt(edAge.getText().toString());
                b1 = (Button) findViewById(R.id.btnvote);
                b1.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(age>=18){
                            String str1 = edName.getText().toString();
                            String str2 = edAdhar.getText().toString();
                            String str3 = edAge.getText().toString();
                            Intent i =new Intent(MainActivity.this,Output.class);
                            i.putExtra("keyName",str1);
                            i.putExtra("keyAdhar",str2);
                            i.putExtra("keyAge",str3);
                            startActivity(i);

                        }
                        else{
                            Toast.makeText(MainActivity.this, "Not eligible for voting",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}
