package com.evolutions.jabar.videoyoutube.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.evolutions.jabar.videoyoutube.model.Fisika;
import com.evolutions.jabar.videoyoutube.R;

import java.util.ArrayList;

public class GridFisikaAdapter extends RecyclerView.Adapter<GridFisikaAdapter.GridViewHolder>{
    private Context context;
    private ArrayList<Fisika>listfisika;

    public ArrayList<Fisika>getListfisika(){
        return listfisika;
    }
    public void setListfisika(ArrayList<Fisika>listfisika){
        this.listfisika= listfisika;
    }
    public GridFisikaAdapter(Context context){
        this.context =context;
    }
    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
GridViewHolder gridViewHolder = new GridViewHolder(view);
return gridViewHolder;
        }
        @Override
    public void onBindViewHolder(GridViewHolder holder,int position){
            holder.txt_judul.setText(getListfisika().get(position).getJudul());
            holder.txt_isi_materi.setText(getListfisika().get(position).getIsi_materi());
            Glide.with(context).load(getListfisika().get(position).getGambar()).override(55,55).into(holder.imgPhoto);

    }
    @Override
    public int getItemCount(){
        return getListfisika().size();
    }
    public class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView txt_judul,txt_isi_materi;

        public GridViewHolder(View view){
            super(view);
            txt_judul = (TextView)view.findViewById(R.id.judul_materi);
            txt_isi_materi = (TextView)view.findViewById(R.id.isi_materi);

            imgPhoto = (ImageView)view.findViewById(R.id.img_list);
        }
    }
}
