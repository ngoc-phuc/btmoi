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
    private ListView listView;
    private CustomListview adapter=null;
    private ArrayList<ThongTin> list;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment1,container,false);
        final ListView listView=(ListView) view.findViewById(R.id.lv);
        list =new ArrayList<ThongTin>();
        listView.setAdapter(adapter);
        list.add(new ThongTin("https://s24.postimg.org/e6kj7c7qt/Music_Top_Logo.jpg","Nhạc âu mĩ hot nhất","Nghe bài hát Sugar 320kbps ca sĩ Maroon 5 nghe nhạc 320 lời bài hát sugar maroon 5 album nhạc mp3 hay nhất | eZqJdBiX1raA."));
        list.add(new ThongTin("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSyHLrpbamfgozLWSxY40pAoBaZhkdUg1bffkRmkJM0lVw60UpCdA","Facebook-Đăng nhập,đăng ký,tìm hiểu","Tạo một tài khoản để đăng nhập Facebook. Kết nối với bạn bè, gia đình và những người mà bạn biết. Chia sẻ ảnh và video, gửi tin nhắn và nhận cập nhật."));
        final MainActivity mainActivity= (MainActivity) getActivity();
        adapter=new CustomListview(mainActivity,R.layout.custom_listview,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                listView.setVisibility(View.GONE);
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fr1, new Fragment2());
                    fragmentTransaction.commit();
                }
        });
        return view;
    }



}
