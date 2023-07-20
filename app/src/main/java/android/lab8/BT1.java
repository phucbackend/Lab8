package android.lab8;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BT1 extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FrameLayout frameFragment;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitybai1);

        bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottom_nav);
        frameFragment=(FrameLayout)findViewById(R.id.frameFragment);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.navigation_shop) {
                    // Thay thế fragment tương ứng với FragShop
                    replaceFragment(new B1_FragShop());
                    return true;
                } else if (itemId == R.id.navigation_gifts) {
                    replaceFragment(new B1_FragGift());
                    return true;
                }   else if (itemId == R.id.navigation_cart) {
                    replaceFragment(new B1_FragCart());
                    return true; // k có true này click item khác k đc
                }
                else if (itemId == R.id.navigation_profile) {
                    replaceFragment(new B1_FragProfile());
                    return true;
                }
                return false;
            }
        });
        // Mặc định chọn fragment Home khi mở ứng dụng
        bottomNavigationView.setSelectedItemId(R.id.navigation_shop);
    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().
        replace(R.id.frameFragment, fragment).commit();
    }
}
