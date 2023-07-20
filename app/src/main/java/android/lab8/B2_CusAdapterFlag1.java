package android.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class B2_CusAdapterFlag1 extends ArrayAdapter {
    Context context;
    int layoutItem;
    ArrayList<B2_FlagPage1> ListFlag;

    public B2_CusAdapterFlag1(@NonNull Context context, int layoutItem , ArrayList<B2_FlagPage1> ListFlag ) {
        super(context, layoutItem, ListFlag);
        this.context=context;
        this.layoutItem=layoutItem;
        this.ListFlag=ListFlag;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        B2_FlagPage1 flag = ListFlag.get(position);
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layoutItem,null);
        }
        ImageView img = convertView.findViewById(R.id.ImgItemPage1);
        img.setImageResource(flag.getImgFlag());
        TextView txt = convertView.findViewById(R.id.TV_ItemPage1);
        txt.setText(flag.getNameCountry());
        return convertView;
    }
}

