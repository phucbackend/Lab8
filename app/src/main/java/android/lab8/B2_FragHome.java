package android.lab8;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class B2_FragHome extends Fragment {
    ListView LV_Page1 ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.b2_frag_home, container, false);

        LV_Page1 = view.findViewById(R.id.LV_Flag);
        List<B2_FlagPage1> ListFlag =new ArrayList<>();
        // Dữ liệu mẫu
        ListFlag.add(new B2_FlagPage1(R.drawable.hoaky , "Hoa Kỳ") );
        ListFlag.add(new B2_FlagPage1(R.drawable.france, "Pháp" ) );
        ListFlag.add(new B2_FlagPage1(R.drawable.japan, "Nhật Bản" ) );
        ListFlag.add(new B2_FlagPage1(R.drawable.korea, "Hàn Quốc" ) );

        // Tạo adapter và gán cho ListView
        B2_CusAdapterFlag1 itemAdapter = new B2_CusAdapterFlag1(getContext(), R.layout.b2_layout_item_page1 , (ArrayList<B2_FlagPage1>) ListFlag);
        LV_Page1.setAdapter(itemAdapter);

        return view;
    }
}