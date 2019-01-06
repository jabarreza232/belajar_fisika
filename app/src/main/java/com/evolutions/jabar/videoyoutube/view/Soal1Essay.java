package com.evolutions.jabar.videoyoutube.view;

import com.evolutions.jabar.videoyoutube.R;

import java.util.Arrays;

public class Soal1Essay {
    //membuat array untuk pertanyaan

    public String pertanyaan[]={
            "1. 12m = ... mm",
            "2. 500cm = ... hm",
            "3. 7ons =  ... kg",
            "4. 10 ton = ... kg",
            "5. 3 menit = ... sekon",
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1


    private String image[] ={
        "https://www.elegantthemes.com/blog/wp-content/uploads/2015/10/client-questions-featured.png",
        "https://www.elegantthemes.com/blog/wp-content/uploads/2015/10/client-questions-featured.png",
        "https://www.elegantthemes.com/blog/wp-content/uploads/2015/10/client-questions-featured.png",
        "https://www.elegantthemes.com/blog/wp-content/uploads/2015/10/client-questions-featured.png",
        "https://www.elegantthemes.com/blog/wp-content/uploads/2015/10/client-questions-featured.png"
    };

private String jawabanBenar[] = {
        "12000",
        "0,05",
        "0,7",
        "10000",
        "180",
};
public String getPertanyaan(int x){
    String soal = pertanyaan[x];
    return soal;
}
public String getStringGambar(int x){
    String gambar = image[x];
    return gambar;
}
public String getJawabanBenar(int x){
    String jawaban = jawabanBenar[x];
    return jawaban;
}
    }

