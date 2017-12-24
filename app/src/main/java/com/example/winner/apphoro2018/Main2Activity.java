package com.example.winner.apphoro2018;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.winner.apphoro2018.ADetailsActivity;
        import com.example.winner.apphoro2018.AListAdapter;
        import com.example.winner.apphoro2018.A;

        import java.util.ArrayList;



public class Main2Activity extends AppCompatActivity{


    TextView text;
    String data;


    private ListView mListView;
    //private ArrayList<A> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = (TextView) findViewById(R.id.text);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            data = bundle.getString("data");
            text.setText(data);

        }



        mListView = (ListView) findViewById(R.id.list_view);

        final AData aData = AData.getInstance();

        aData.alList = new ArrayList<>();

        aData.alList.add(new A("(14 มกราคม – 13 กุมภาพันธ์)", "ราศีมังกร", R.drawable.a1, getString(R.string.details_a1)));
        aData.alList.add(new A("(14 กุมภาพันธ์ – 13 มีนาคม)", "ราศีกุมภ์", R.drawable.a2, getString(R.string.details_a2)));
        aData.alList.add(new A("(14 มีนาคม – 14 เมษายน)", "ราศีมีน", R.drawable.a3, getString(R.string.details_a3)));
        aData.alList.add(new A("(15 เมษายน – 14 พฤษภาคม)", "ราศีเมษ", R.drawable.a4, getString(R.string.details_a4)));
        aData.alList.add(new A("(15 พฤษภาคม – 14 มิถุนายน)", "ราศีพฤษภ", R.drawable.a5, getString(R.string.details_a5)));
        aData.alList.add(new A("(15 มิถุนายน – 15 กรกฎาคม)", "ราศีเมถุน", R.drawable.a6, getString(R.string.details_a6)));
        aData.alList.add(new A("(16 กรกฎาคม – 16 สิงหาคม)", "ราศีกรกฎ", R.drawable.a7, getString(R.string.details_a7)));
        aData.alList.add(new A("(17 สิงหาคม – 15 กันยายน)", "ราศีสิงห์", R.drawable.a8, getString(R.string.details_a8)));
        aData.alList.add(new A("(16 กันยายน – 16 ตุลาคม)", "ราศีกันย์", R.drawable.a9, getString(R.string.details_a9)));
        aData.alList.add(new A("(17 ตุลาคม – 15 พฤศจิกายน)", "ราศีตุลย์", R.drawable.a10, getString(R.string.details_a10)));
        aData.alList.add(new A("(16 พฤศจิกายน – 14 ธันวาคม)", "ราศีพิจิก", R.drawable.a11, getString(R.string.details_a11)));
        aData.alList.add(new A("(15 ธันวาคม – 13 มกราคม)", "ราศีธนู", R.drawable.a12, getString(R.string.details_a12)));


        AListAdapter adapter = new AListAdapter(
                this,
                R.layout.item,
                aData.alList
        );

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                A a = aData.alList.get(i);
                Toast.makeText(Main2Activity.this, a.englishName, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Main2Activity.this, ADetailsActivity.class);
                //intent.putExtra("englishName", animal.englishName);
                //intent.putExtra("picture", animal.picture);
                intent.putExtra("position", i);
                startActivity(intent);
            }
        });

    }
}
