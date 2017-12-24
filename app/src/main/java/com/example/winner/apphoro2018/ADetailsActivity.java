package com.example.winner.apphoro2018;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.example.winner.apphoro2018.A;


        import java.util.Locale;


public class ADetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_details);

        ImageView aImageView = (ImageView) findViewById(R.id.a_image_view);
        TextView nameTextView = (TextView) findViewById(R.id.name_text_view);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        AData aData = AData.getInstance();
        A a = aData.alList.get(position);

        nameTextView.setText(a.details);
        aImageView.setImageResource(a.picture);

        getSupportActionBar().setTitle(
                String.format(
                        Locale.getDefault(),
                        "%s (%s)",
                        a.thaiName,
                        a.englishName
                )
        );
    }
}