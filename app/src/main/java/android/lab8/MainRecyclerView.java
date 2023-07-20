package android.lab8;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainRecyclerView extends AppCompatActivity {
    List<B2_MessagePage2> movieList = new ArrayList<>();
    RecyclerView recyclerView;
    CusAdapterMessage mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);
        recyclerView = findViewById(R.id.recycler_view);

        // Thiết lập DividerItemDecoration cho RecyclerView
        recyclerView.addItemDecoration(new DividerItemDecoration(this , LinearLayoutManager.VERTICAL));
        // Thiết lập layout manager cho RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        //Thiết lập animation cho RecyclerView
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mAdapter = new CusAdapterMessage(movieList);
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();

    }

    public void prepareMovieData() {
        movieList.add(new B2_MessagePage2(R.drawable.hoaky, "Khoa", "18:30", "Anh đẹp trai quá"));
        movieList.add(new B2_MessagePage2(R.drawable.france, "Pháp", "18:30", "Pháp đẹp quá"));
        movieList.add(new B2_MessagePage2(R.drawable.hoaky, "Khoa", "18:30", "Anh đẹp trai quá"));
        movieList.add(new B2_MessagePage2(R.drawable.france, "Pháp", "18:30", "Pháp đẹp quá"));
        movieList.add(new B2_MessagePage2(R.drawable.hoaky, "Khoa", "18:30", "Anh đẹp trai quá"));
        movieList.add(new B2_MessagePage2(R.drawable.france, "Pháp", "18:30", "Pháp đẹp quá"));
        movieList.add(new B2_MessagePage2(R.drawable.hoaky, "Khoa", "18:30", "Anh đẹp trai quá"));
        movieList.add(new B2_MessagePage2(R.drawable.france, "Pháp", "18:30", "Pháp đẹp quá"));
        movieList.add(new B2_MessagePage2(R.drawable.hoaky, "Khoa", "18:30", "Anh đẹp trai quá"));
        movieList.add(new B2_MessagePage2(R.drawable.france, "Pháp", "18:30", "Pháp đẹp quá"));

//         Gọi notifyDataSetChanged() sau khi thêm dữ liệu vào danh sách
        mAdapter.notifyDataSetChanged();
    }
}
