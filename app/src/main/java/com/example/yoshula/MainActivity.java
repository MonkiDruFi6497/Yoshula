package com.example.yoshula;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager index_page;
    private TabItem angel_page, evil_page;
             boolean logon = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.menu_button);
        bottomNavigationView.setOnNavigationItemReselectedListener(navListener);

//        if(logon) {
//            Intent intent = new Intent(this, LoginActivity.class);
//            startActivity(intent);
//        }

        //tabLlayout 建立元件
        tabLayout = findViewById(R.id.tab_layout);
        angel_page = findViewById(R.id.angel_page);
        evil_page = findViewById(R.id.evil_page);

        //顯示起始頁面
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemReselectedListener navListener =
            new BottomNavigationView.OnNavigationItemReselectedListener() {

                @Override
                public void onNavigationItemReselected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_people:
                            selectedFragment = new LoginFragment();
                            break;
                        case R.id.nav_ring:
                            selectedFragment = new RingFragment();
                            break;
                        case R.id.nav_board:
                            selectedFragment = new BoardFragment();
                            break;
                        case R.id.nav_setting:
                            selectedFragment = new SeetingFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                        //return true;
                }
            };
}
