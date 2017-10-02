package example.com.btmoi;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/*interface Click{
        public void back();
        }*/

public class MainActivity extends AppCompatActivity /*implements Click*/{
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add();

    }
    private void add(){
        viewPager = (ViewPager) findViewById(R.id.vp1);
        tabLayout = (TabLayout) findViewById(R.id.tl1);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentAdapter fragmentAdapter= new FragmentAdapter(fragmentManager);
        fragmentAdapter.insertFragment(new FragmentRoot());
        fragmentAdapter.insertFragment(new Fragment2());
        fragmentAdapter.insertFragment(new Fragment3());
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    /*@Override
    public void back() {
        finish();
    }*/
}
