package com.evolutions.jabar.videoyoutube.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.evolutions.jabar.videoyoutube.model.Fisika;
import com.evolutions.jabar.videoyoutube.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class FisikaAdapter extends BaseAdapter {
ArrayList listitem;
Activity activity;

public FisikaAdapter(Activity activity, ArrayList listitem){
    this.activity= activity;
    this.listitem = listitem;
}
@Override
    public int getCount(){
    return listitem.size();
}
@Override
    public Object getItem(int position){
    return listitem.get(position);

}
@Override
    public long getItemId(int position){
    return 0;
}
@Override
    public View getView(int position,View convertView,ViewGroup parent){
    View view = convertView;
    Viewholder holder = null;
    if (view == null){
        holder = new Viewholder();
        LayoutInflater inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.list_item,null);
        holder.txt_judul =(TextView)view.findViewById(R.id.judul_materi);
                holder.txt_isi_materi = (TextView)view.findViewById(R.id.isi_materi);
              holder.txt_isi_materi2 = (TextView)view.findViewById(R.id.isi_materi2);
                holder.imgPhoto = (ImageView)view.findViewById(R.id.img_list);
                view.setTag(holder);
    }else{
        holder= (Viewholder)view.getTag();
    }
    Fisika fisika = (Fisika)getItem(position);
holder.txt_judul.setText(fisika.getJudul());
holder.txt_isi_materi.setText(fisika.getIsi_materi());
holder.txt_isi_materi2.setText(fisika.getIsi_materi2());
    Picasso.with(activity).load(fisika.getGambar()).into(holder.imgPhoto);
    return view;
}
static class Viewholder{
    TextView txt_judul,txt_isi_materi,txt_isi_materi2;
    ImageView imgPhoto;
}
}