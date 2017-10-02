package example.com.btmoi;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 27/09/2017.
 */

public class CustomListview extends ArrayAdapter<ThongTin> {
        private Activity activity;
        private int idLayout;
        private ArrayList<ThongTin> list;

        public CustomListview(Activity activity, int idLayout, ArrayList<ThongTin> list) {
                super(activity, idLayout, list);
                this.activity = activity;
                this.idLayout = idLayout;
                this.list = list;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                ThongTin thongTin = getItem(position);
                LayoutInflater inflater = activity.getLayoutInflater();
                convertView = inflater.inflate(idLayout,null);
                ImageView imageView = (ImageView)convertView.findViewById(R.id.im1) ;
                Picasso.with(getContext()).load(thongTin.getAnh()).into(imageView);
                TextView textView =(TextView) convertView.findViewById(R.id.noidung);
                textView.setText(list.get(position).getNoidung());
                TextView textView1 =(TextView) convertView.findViewById(R.id.tieude);
                textView1.setText(list.get(position).getTieude());
                return convertView;
        }
}