package com.evolutions.jabar.videoyoutube.data;

import com.evolutions.jabar.videoyoutube.model.Fisika;

import java.util.ArrayList;

public class FisikaData {
   public static String [][]data = new String[][]{

   {"Konversi satuan","Konversi satuan adalah konversi antara unit pengukuran yang berbeda untuk jumlah yang sama, biasanya melalui faktor konversi perkalian. Dan untuk lebih jelasnya lagi di bawah ini merupakan ulasan lebih jauh lagi tentang konversi satuan, bagi yang ingin mengetahuinya silahkan baca uraian di bawah ini.\n" +
           "\n" +
           "Satuan merupakan ukuran yang mendefinisikan suatu besaran. Konversi sendiri berarti perubahan. Jadi, bisa dikatakan konversi satuan adalah perubahan dari suatu sistem satuan ke sistem satuan yang lain. Konversi satuan tidak pernah merubah nilai dari suatu besaran.\n" +
           "\n" +
           "\n" +
           " \n" +
           "Untuk satuan yang umum seperti kg, m, liter, newton, mungkin kita sudah familiar, apalagi untuk meter sama kilogram, pasti hampir semua kita sudah tahu. Anda juga bisa dengan mudah menemukan konversi satuan-satuan yang lazim seperti meter dan kilogram lewat tangga satuan.\n" +
           "\n" +
           "Akan tetapi ada satuan-satuan yang cukup khusus dalam jenis satuan tertentu sebut saja kalau besaran waktu ada yang namanya windu, volume ada yang namanya barrel, panjang ada yang namanya inchi, dll. Berikut ini konversi satuan dari berbagai besaran yang rumushitung kumpulkan",
           "https://3.bp.blogspot.com/-oM7Urjrvl7I/VK_IEcEfk8I/AAAAAAAAHB0/29hdEgTDSQ8/s1600/Tangga%2BKonversi%2BPengukuran%2BSatuan%2BBerat%2BMatematika.jpg"

    }, {"Konversi satuan","Bodo amat",  "https://3.bp.blogspot.com/-oM7Urjrvl7I/VK_IEcEfk8I/AAAAAAAAHB0/29hdEgTDSQ8/s1600/Tangga%2BKonversi%2BPengukuran%2BSatuan%2BBerat%2BMatematika.jpg"

    },
           {"Konversi satuan","Konversi satuan adalah konversi antara unit pengukuran yang berbeda untuk jumlah yang sama, biasanya melalui faktor konversi perkalian. Dan untuk lebih jelasnya lagi di bawah ini merupakan ulasan lebih jauh lagi tentang konversi satuan, bagi yang ingin mengetahuinya silahkan baca uraian di bawah ini.\n" +
                   "\n" +
                   "Satuan merupakan ukuran yang mendefinisikan suatu besaran. Konversi sendiri berarti perubahan. Jadi, bisa dikatakan konversi satuan adalah perubahan dari suatu sistem satuan ke sistem satuan yang lain. Konversi satuan tidak pernah merubah nilai dari suatu besaran.\n" +
                   "\n" +
                   "\n" +
                   " \n" +
                   "Untuk satuan yang umum seperti kg, m, liter, newton, mungkin kita sudah familiar, apalagi untuk meter sama kilogram, pasti hampir semua kita sudah tahu. Anda juga bisa dengan mudah menemukan konversi satuan-satuan yang lazim seperti meter dan kilogram lewat tangga satuan.\n" +
                   "\n" +
                   "Akan tetapi ada satuan-satuan yang cukup khusus dalam jenis satuan tertentu sebut saja kalau besaran waktu ada yang namanya windu, volume ada yang namanya barrel, panjang ada yang namanya inchi, dll. Berikut ini konversi satuan dari berbagai besaran yang rumushitung kumpulkan",
                   "https://3.bp.blogspot.com/-oM7Urjrvl7I/VK_IEcEfk8I/AAAAAAAAHB0/29hdEgTDSQ8/s1600/Tangga%2BKonversi%2BPengukuran%2BSatuan%2BBerat%2BMatematika.jpg"

           },
           {"Konversi satuan","Konversi satuan adalah konversi antara unit pengukuran yang berbeda untuk jumlah yang sama, biasanya melalui faktor konversi perkalian. Dan untuk lebih jelasnya lagi di bawah ini merupakan ulasan lebih jauh lagi tentang konversi satuan, bagi yang ingin mengetahuinya silahkan baca uraian di bawah ini.\n" +
                   "\n" +
                   "Satuan merupakan ukuran yang mendefinisikan suatu besaran. Konversi sendiri berarti perubahan. Jadi, bisa dikatakan konversi satuan adalah perubahan dari suatu sistem satuan ke sistem satuan yang lain. Konversi satuan tidak pernah merubah nilai dari suatu besaran.\n" +
                   "\n" +
                   "\n" +
                   " \n" +
                   "Untuk satuan yang umum seperti kg, m, liter, newton, mungkin kita sudah familiar, apalagi untuk meter sama kilogram, pasti hampir semua kita sudah tahu. Anda juga bisa dengan mudah menemukan konversi satuan-satuan yang lazim seperti meter dan kilogram lewat tangga satuan.\n" +
                   "\n" +
                   "Akan tetapi ada satuan-satuan yang cukup khusus dalam jenis satuan tertentu sebut saja kalau besaran waktu ada yang namanya windu, volume ada yang namanya barrel, panjang ada yang namanya inchi, dll. Berikut ini konversi satuan dari berbagai besaran yang rumushitung kumpulkan",
                   "https://3.bp.blogspot.com/-oM7Urjrvl7I/VK_IEcEfk8I/AAAAAAAAHB0/29hdEgTDSQ8/s1600/Tangga%2BKonversi%2BPengukuran%2BSatuan%2BBerat%2BMatematika.jpg"

           },
};
   public static ArrayList<Fisika>getListData(){
       Fisika fisikaData = null;
       ArrayList<Fisika>list = new ArrayList<>();
       for(int i=0; i<data.length;i++){
           fisikaData = new Fisika();
           fisikaData.setJudul(data[i][0]);
           fisikaData.setIsi_materi(data[i][1]);
           fisikaData.setGambar(data[i][2]);
       list.add(fisikaData);
       }
   return list;
   }
}
