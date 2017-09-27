package example.com.btmoi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Administrator on 19/09/2017.
 */

public class Fragment1 extends Fragment {
     String Array[]={"phuc","huong","dang","tai","tram","trang","hung","cuong","nhu"};
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment1,container,false);
        ListView listView=(ListView) view.findViewById(R.id.lv1);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getContext(),android.R.layout.simple_expandable_list_item_1,Array);
        listView.setAdapter(adapter);
        final MainActivity mainActivity= (MainActivity) getActivity();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        return view;
    }



}
