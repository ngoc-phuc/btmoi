package example.com.btmoi;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Fragment3 extends Fragment {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fragment3);
        final ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<8;i++) list.add("Beautiful Girl");

        ListView listView = (ListView) findViewById(R.id.l1);
        CustomListview3 c1 = new CustomListview3(this,list);
        listView.setAdapter(c1);
        //ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,Array);
        //listView.setAdapter(adapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(Fragment3.this,"hello "+list ,Toast.LENGTH_LONG).show();
                    }
                }
        );
    }*/
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment3,container,false);
        final ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<8;i++) list.add("Beautiful Girl");
        ListView listView = (ListView) getActivity().findViewById(R.id.l1);
        CustomListview3 c1 = new CustomListview3(getActivity(),list);
        listView.setAdapter(c1);
        return view;
    }
}

