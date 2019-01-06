package com.evolutions.jabar.videoyoutube.view;

public class Soal2PilihanGanda {
    public String pertanyaan[]= {
            "1. 12m = ... mm",
            "2. 500cm = ... hm",
            "3. 7ons =  ... kg",
            "4. 10 ton = ... kg",
            "5. 3 menit = ... sekon",

    };
    private String pilihanJawaban[][]= {
            {"A.120mm","B.1.200mm","C.12.000mm","D.12mm","E.120.000mm"},
            {"A.5hm","B.0,5hm","C.0,05hm","D.5,0","E.5,00"},
            {"A.7kg","B.0,7kg","C.0,07kg","D.70,0kg","E.7,00kg"},
            {"A.100kg","B.1.000kg","C.10.000kg","D.10kg","E.100.000kg"},
            {"A.180sekon","B.1.800sekon","C.18.000sekon","D.180.000sekon","E.18sekon"},

         };
    private String jawabanBenar[]={
            "C.12.000mm",
            "C.0,05hm",
            "B.0,7kg",
            "C.10.000kg",
            "A.180sekon",

    };
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    } public String getPilihanJawaban4(int x){
        String jawaban4 = pilihanJawaban[x][3];
        return jawaban4;
    } public String getPilihanJawaban5(int x){
        String jawaban5 = pilihanJawaban[x][4];
        return jawaban5;
    }
    //membuat getter untuk
    public String getJawabanBenar(int x) {
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
