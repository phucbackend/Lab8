package android.lab8;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class B2_FragNotification extends Fragment {
    List<B2_MessagePage2> movieList = new ArrayList<>();
    RecyclerView recyclerView;
    CusAdapterMessage mAdapter;

    public void prepareMovieData() {
        movieList.add(new B2_MessagePage2(R.drawable.people_one, "Girl", "18:30", "Em ăn cơm chưa"));
        movieList.add(new B2_MessagePage2(R.drawable.people_two, "Boy", "18:35", "Rồi"));
        movieList.add(new B2_MessagePage2(R.drawable.people_one, "Girl", "19:30", "Giờ mới rep thì chắc ăn rồi nhỉ hihi"));
        movieList.add(new B2_MessagePage2(R.drawable.people_two, "Boy", "20:30", "Dạ"));
        movieList.add(new B2_MessagePage2(R.drawable.people_one ,"Girl", "21:30", "E mắc ngủ chưa"));
        movieList.add(new B2_MessagePage2(R.drawable.people_two, "Boy", "22:30", "Đã seen"));
        movieList.add(new B2_MessagePage2(R.drawable.people_one, "Girl", "23:30", "Em ăn cơm chưa"));
        movieList.add(new B2_MessagePage2(R.drawable.people_two, "Boy", "01:30", "Rồi"));
        movieList.add(new B2_MessagePage2(R.drawable.people_one, "Girl", "05:30", "Đi chơi không"));
        movieList.add(new B2_MessagePage2(R.drawable.people_two, "Boy", "06:30", "......."));

        mAdapter.notifyDataSetChanged();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recyclerview, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);

        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mAdapter = new CusAdapterMessage(movieList);

        recyclerView.setAdapter(mAdapter);

        prepareMovieData();

        return view;
    }
}
