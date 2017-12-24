package com.example.winner.apphoro2018;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button button;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.input);
        button = (Button) findViewById(R.id.btn_intent);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                if(!data.isEmpty()){
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("data",data);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }
}
