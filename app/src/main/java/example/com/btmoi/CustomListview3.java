package example.com.btmoi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 27/09/2017.
 */

public class CustomListview3 extends ArrayAdapter<String> {
private LayoutInflater mLayoutInflater;
public CustomListview3(Context context, List<String> object){
        super(context,0,object);
        mLayoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

@NonNull
@Override
public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=null;
        if((position%2)==0 )
        view = mLayoutInflater.inflate(R.layout.layout_fragment3_0,parent,false);//inflate:dua view con vao view cha
        else view = mLayoutInflater.inflate(R.layout.layout_fragment3_1,parent,false);
        String item = getItem(position);
        TextView textView1 = (TextView) view.findViewById(R.id.t1);
        textView1.setText(item);
        TextView textView2 = (TextView) view.findViewById(R.id.t2);
        textView2.setText(item);
        return view;
        }
        }
