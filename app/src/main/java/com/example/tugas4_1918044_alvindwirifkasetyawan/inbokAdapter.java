package com.example.tugas4_1918044_alvindwirifkasetyawan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class inbokAdapter extends RecyclerView.Adapter<inbokAdapter.inbokViewHolder>{
    private ArrayList<inbok> dataList;
    public inbokAdapter(ArrayList<inbok> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public inbokAdapter.inbokViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.item_inbox, parent, false);
        return new inbokViewHolder(view);
    }
    public void onBindViewHolder(inbokViewHolder holder, int
            position) {
        holder.pic.setImageResource(dataList.get(position).getpic());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtchat.setText(dataList.get(position).getChat());

    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class inbokViewHolder extends
            RecyclerView.ViewHolder{
        private TextView txtNama, txtchat;
        private ImageView pic;
        public inbokViewHolder(View itemView) {
            super(itemView);
            pic = (ImageView)
                    itemView.findViewById(R.id.img_logo);
            txtNama = (TextView)
                    itemView.findViewById(R.id.txt_nama);
            txtchat = (TextView)
                    itemView.findViewById(R.id.txt_chat);
        }
    }
}
