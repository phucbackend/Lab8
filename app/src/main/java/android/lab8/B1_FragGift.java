package android.lab8;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link B1_FragGift#newInstance} factory method to
 * create an instance of this fragment.
 */
public class B1_FragGift extends Fragment {

    TextView tvFrgGift;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public B1_FragGift() {
        // Required empty public constructor
    }

    public static B1_FragGift newInstance(String param1, String param2) {
        B1_FragGift fragment = new B1_FragGift();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        FragmentManager fm=getParentFragmentManager();
        fm.setFragmentResultListener("keyM", this, new
            FragmentResultListener() {
                @Override
                public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                    tvFrgGift.setText(result.getString("key"));
                }
            });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.b1_frag_gift, container, false);
        tvFrgGift=(TextView) view.findViewById(R.id.tvFragGift);
        return view;
    }
}