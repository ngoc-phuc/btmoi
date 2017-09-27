package example.com.btmoi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Fragment2 extends Fragment {

    ImageView iv1,iv2,iv3,iv4,iv5;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment2,container,false);
        iv1= view.findViewById(R.id.i1);
        iv2= view.findViewById(R.id.i2);
        iv3= view.findViewById(R.id.i3);
        iv4= view.findViewById(R.id.i4);
        iv5= view.findViewById(R.id.i5);
        Picasso.with(getContext()).load("https://image.tmdb.org/t/p//w154/q0R4crx2SehcEEQEkYObktdeFy.jpg").into(iv1);
        Picasso.with(getContext()).load("https://image.tmdb.org/t/p//w154/tWqifoYuwLETmmasnGHO7xBjEtt.jpg").into(iv2);
        Picasso.with(getContext()).load("https://image.tmdb.org/t/p//w154/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg").into(iv3);
        Picasso.with(getContext()).load("https://image.tmdb.org/t/p//w154/y31QB9kn3XSudA15tV7UWQ9XLuW.jpg").into(iv4);
        Picasso.with(getContext()).load("https://image.tmdb.org/t/p//w154/inVq3FRqcYIRl2la8iZikYYxFNR.jpg").into(iv5);
        return view;
    }
}
