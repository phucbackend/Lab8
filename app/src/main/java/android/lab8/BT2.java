package android.lab8;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BT2 extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FrameLayout frameFragment;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitybai2);

        bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottom_nav);
        frameFragment=(FrameLayout)findViewById(R.id.frameFragment);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.navigation_home) {
                    // Thay thế fragment tương ứng với FragShop
                    loadFragment(new B2_FragHome());
                    return true;
                } else if (itemId == R.id.navigation_notification) {
                    loadFragment(new B2_FragNotification());
                    return true;
                }   else if (itemId == R.id.navigation_search) {
                    loadFragment(new B2_FragSearch());
                    return true; // k có true này click item khác k đc
                }
                else if (itemId == R.id.navigation_cafe) {
                    loadFragment(new Frag_TabLayout());
                    return true;
                }
                return false;
            }
        });
        // Mặc định chọn fragment Home khi mở ứng dụng
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().
        replace(R.id.frameFragment, fragment).commit();
    }
}
