package com.example.winner.apphoro2018;


        import android.content.Context;
        import android.support.annotation.LayoutRes;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.example.winner.apphoro2018.R;
        import com.example.winner.apphoro2018.A;


        import java.util.ArrayList;
        import java.util.Locale;

public class AListAdapter extends ArrayAdapter<A> {

    private Context mContext;
    private ArrayList<A> mAList;
    private int mLayoutResId;

    public AListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<A> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mLayoutResId = resource;
        this.mAList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(mLayoutResId, null);

        ImageView iv = v.findViewById(R.id.imageView);
        TextView tv = v.findViewById(R.id.textView);

        A a = mAList.get(position);

        iv.setImageResource(a.picture);
        tv.setText(
                String.format(
                        Locale.getDefault(),
                        "%s (%s)",
                        a.thaiName,
                        a.englishName
                )
        );
        return v;
    }
}