package com.evolutions.jabar.videoyoutube.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.evolutions.jabar.videoyoutube.adapter.FisikaAdapter;
import com.evolutions.jabar.videoyoutube.model.Fisika;
import com.evolutions.jabar.videoyoutube.R;
import com.evolutions.jabar.videoyoutube.view.ScrollingActivity;

import java.util.ArrayList;


public class fragment_materi extends Fragment {
    public static String[][] data = new String[][]{
            {
                    "Konversi satuan",
                    "Konversi satuan secara umum berarti mengubah nilai suatu sistem satuan ke nilai satuan lain. Konversi satuan umumnya tidak pernah mengubah nilai dari suatu besaran. ... Pengubahan satuan seperti ini dapat dilakukan dengan menggunakan faktor konversi satuan."
                    , "A. Konversi Satuan Ukuran Panjang \r\n Untuk satuan ukuran panjang konversi dari suatu tingkat menjadi satu tingkat di bawahnya adalah dikalikan dengan 10 sedangkan untuk konversi satu tingkat di atasnya dibagi dengan angka 10. Contoh :\n  - 1 km sama dengan 1.000 m\n - 1 km sama dengan 100.000 cm\n- 1 km sama dengan 1.000.000 mm\n - 1 m sama dengan 0,1 dam\n - 1 m sama dengan 0,001 km\n - 1 m sama dengan 10 dm\n - 1 m sama dengan 1.000 mm",
                    "https://3.bp.blogspot.com/-oM7Urjrvl7I/VK_IEcEfk8I/AAAAAAAAHB0/29hdEgTDSQ8/s1600/Tangga%2BKonversi%2BPengukuran%2BSatuan%2BBerat%2BMatematika.jpg"
            },

    };

    private ListView rv_fisika;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_materi, container, false);
        rv_fisika = view.findViewById(R.id.rv_fisika);

        return view;

    }
    private ArrayList list;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = new ArrayList<>();
        Fisika fisika = new Fisika();
        for (int i = 0; i < data.length; i++) {
            fisika.setJudul(data[i][0]);
            fisika.setIsi_materi(data[i][1]);
            fisika.setIsi_materi2(data[i][2]);
            fisika.setGambar(data[i][3]);
            list.add(fisika);

            FisikaAdapter adapter = new FisikaAdapter(getActivity(), list);
            rv_fisika.setAdapter(adapter);
            rv_fisika.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Fisika fisika = (Fisika) list.get(position);
                    Intent intent = new Intent(getActivity(), ScrollingActivity.class);
                    intent.putExtra(ScrollingActivity.KEY_ITEM, fisika);
                    startActivity(intent);
                }
            });


        }
    }
}


