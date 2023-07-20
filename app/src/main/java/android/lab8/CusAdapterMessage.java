package android.lab8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CusAdapterMessage extends RecyclerView.Adapter<CusAdapterMessage.MyViewHolder> {
    List<B2_MessagePage2> listB2MessagePage2;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView TV_Message , TV_NameUser , TV_TimeLine ;
        ImageView ID_Avatar ;
        public MyViewHolder(@NonNull View view) {
            super(view);
            ID_Avatar = view.findViewById(R.id.imageUser);
            TV_Message = view.findViewById(R.id.message);
            TV_NameUser = view.findViewById(R.id.nameUser);
            TV_TimeLine = view.findViewById(R.id.timeLine);
        }
    }
    public CusAdapterMessage(List<B2_MessagePage2> listB2MessagePage2) {
        this.listB2MessagePage2 = listB2MessagePage2;
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent , int ViewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.b2_layout_item_page2 , parent , false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
       B2_MessagePage2 movie = listB2MessagePage2.get(position);
       holder.ID_Avatar.setImageResource(movie.getIdImg());
       holder.TV_Message.setText(movie.getMessageChat());
       holder.TV_NameUser.setText(movie.getNameUser());
       holder.TV_TimeLine.setText(movie.getTimeLine());
    }

    @Override
    public int getItemCount() {
        return listB2MessagePage2.size();
    }

}
