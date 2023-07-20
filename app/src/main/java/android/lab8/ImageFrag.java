package android.lab8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ImageFrag extends Fragment {

    private static String ARG_POSITION = "position";

    private int position;

    public static ImageFrag newInstance(int position) {
        ImageFrag fragment = new ImageFrag();
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(ARG_POSITION);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_image, container, false);

        ImageView imageView = rootView.findViewById(R.id.imageView);
        switch (position) {
            case 0:
                imageView.setImageResource(R.drawable.scenery);
                break;
            case 1:
                imageView.setImageResource(R.drawable.internet);
                break;
            case 2:
                imageView.setImageResource(R.drawable.music);
                break;
        }
        return rootView;
    }
}
