package com.example.kel3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SdActivity extends AppCompatActivity {

    private ArrayList<String> imageView = new ArrayList<>();
    private ArrayList<String> imageviewdetail = new ArrayList<>();
    private ArrayList<String> textView1 = new ArrayList<>();
    private ArrayList<String> textView2 = new ArrayList<>();
    private ArrayList<String> detail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd);

        getDataFromInternet();
    }
    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(imageView, imageviewdetail, textView1, textView2, detail, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void getDataFromInternet(){

        textView1.add("SD Ahmad Yani Surabaya");
        textView2.add("Jl. Gubeng Airlangga III No.41, Airlangga, Kec. Gubeng, Kota SBY, Jawa Timur 60286");
        imageView.add("https://i.ibb.co/wp7wtjk/SD1.png");
        imageviewdetail.add("https://i.ibb.co/ssZ75Fr/SD01.jpg");
        detail.add("SD AHMAD YANI memiliki kode NPSN 20531835 . Pada 2021, SD AHMAD YANI memiliki 62 pelajar lelaki dan 70 pelajar perempuan, menjadikan jumlah keseluruhan murid seramai 132 orang. Dengan 6 ruang kelas,1 perpustakaan, dan 9 guru. \n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Gubeng Airlangga III No.41, Airlangga, Kec. Gubeng, Kota SBY, Jawa Timur 60286\n" +
                "\n" +
                "Telepon: 031-5034598\n");

        textView1.add("SD Muhammadiyah 11 Surabaya");
        textView2.add("Jl. Dupak Bangunsari No.35-41, Dupak, Kec. Krembangan, Kota SBY, Jawa Timur 60179");
        imageView.add("https://i.ibb.co/9HFqhk3/SD2.png");
        imageviewdetail.add("https://i.ibb.co/pbHzM7j/SD02.jpg");
        detail.add("Sekolah Dasar Swasta Muhammadiyah 11 merupakan sebuah Sekolah Dasar Swasta Swasta yang terletak di Jl. DUPAK BANGUNSARI 50-54 SURABAYA  Sekolah Dasar Swasta Muhammadiyah 11 memiliki kod NPSN 20533077. Pada 2021, SDS Muhammadiyah 11 memiliki 389 pelajar lelaki dan 352 pelajar perempuan, menjadikan jumlah keseluruhan murid seramai 741 orang. Dengan 26 ruang kelas,1 laboratorium ,1 perpustakaan, dan 33 guru\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Dupak Bangunsari No.35-41, Dupak, Kec. Krembangan, Kota SBY, Jawa Timur 60179\n" +
                "\n" +
                "Telepon: 031-3573643\n" +
                "\n" +
                "Website: http://www.sdmuhammadiyah11sby.sch.id/ \n");

        textView1.add("SD Bisma Dua");
        textView2.add("Jl. Kutisari Indah Bar. Gg. VI No.15, Kutisari, Kec. Tenggilis Mejoyo, Kota SBY, Jawa Timur 60291");
        imageView.add("https://i.ibb.co/T16Jzw9/SD3.png");
        imageviewdetail.add("https://i.ibb.co/yNpGpqH/SD03.jpg");
        detail.add("SD Bisma Dua merupakan sebuah Sekolah Dasar Swasta Swasta yang terletak di Jl. KUTISARI INDAH BARAT VI/15 SURABAYA SD Bisma Dua memiliki kode NPSN 20531908 . Pada 2021, SD Bisma Dua  memiliki 80 pelajar lelaki dan 89 pelajar perempuan, menjadikan jumlah keseluruhan murid seramai 169 orang. Dengan 8 ruang kelas,1 laboratorium ,1 perpustakaan, dan 13 guru. \n" +
                "\n" +
                "\n" +
                "Alamat: \n" +
                "\n" +
                "Telepon: \n" +
                "\n" +
                "Website: \n");

        textView1.add("SD Trisula");
        textView2.add("Jl. Johor No.3, Perak Tim., Kec. Pabean Cantian, Kota SBY, Jawa Timur 60164");
        imageView.add("https://i.ibb.co/7NfJJMq/SD4.png");
        imageviewdetail.add("https://i.ibb.co/qYTjnD1/SD04.jpg");
        detail.add("SD Trisula Surabaya merupakan sebuah Sekolah Dasar Swasta Swasta yang terletak di Jl .Johor No.03 Surabaya SD Trisula Surabaya memiliki kod NPSN 20532874 . Pada 2021, SD Trisula Surabaya memiliki 66 pelajar lelaki dan 38 pelajar perempuan, menjadikan jumlah keseluruhan murid seramai 104 orang. Dengan 6 ruang kelas,1 perpustakaan, dan 10 guru.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Johor No.3, Perak Tim., Kec. Pabean Cantian, Kota SBY, Jawa Timur 60164\n" +
                "\n" +
                "Telepon: 085732078246 \n" +
                "\n" +
                "Website: http://20532874.siap-sekolah.com\n");

        textView1.add("SDN Wonokusumo IV");
        textView2.add("Jl. Wonokusumo Tengah No.4, Wonokusumo, Kec. Semampir, Kota SBY, Jawa Timur 60154");
        imageView.add("https://i.ibb.co/rx2Nbvs/SD5.png");
        imageviewdetail.add("https://i.ibb.co/xzVbn4c/SD05.jpg");
        detail.add("SDN Wonokusumo IV merupakan sebuah Sekolah Dasar Swasta Swasta yang terletak di Jl. Wonokusumo Tengah No.4 Surabaya\n" +
                "SDN Wonokusumo IV memiliki kode NPSN 20531908 . Pada 2021, SDN Wonokusumo IV memiliki 296 pelajar lelaki dan 269 pelajar perempuan, menjadikan jumlah keseluruhan murid seramai 565 orang. Dengan 15 ruang kelas,1 perpustakaan, dan 26 guru.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Wonokusumo Tengah No.4, Wonokusumo, Kec. Semampir, Kota SBY, Jawa Timur 60154\n" +
                "\n" +
                "Telepon: 0313769568 \n" +
                "\n" +
                "Website: https://www.sdnwonokusumo443.wordpress.com \n");

        textView1.add("SD Pancasila 45 Surabaya");
        textView2.add("Jl. Tembok Dukuh 6 No.10, Tembok Dukuh, Kec. Bubutan, Kota SBY, Jawa Timur 60173");
        imageView.add("https://i.ibb.co/0BN6yCB/SD6.png");
        imageviewdetail.add("");
        detail.add("SD Pancasila 45 Surabaya merupakan sebuah Sekolah Dasar Swasta Swasta yang terletak di Jl. Wonokusumo Tengah NO.4 Surabaya. SD Pancasila 45 Surabaya memiliki kod NPSN 20533088 . Pada 2021, SD Pancasila 45 Surabaya memiliki 52 pelajar lelaki dan 37 pelajar perempuan, menjadikan jumlah keseluruhan murid seramai 89 orang. Dengan 3 ruang kelas,1 laboratorium ,1 perpustakaan, dan 9 guru.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Tembok Dukuh 6 No.10, Tembok Dukuh, Kec. Bubutan, Kota SBY, Jawa Timur 60173\n" +
                "\n" +
                "Telepon: https://www.sdnwonokusumo443.wordpress.com\n" +
                "\n" +
                "Website: sdpancasila45.blogspot.com\n");

        textView1.add("SD Kreatif Annur Surabaya");
        textView2.add("Jl. Semolowaru No.96, Semolowaru, Kec. Sukolilo, Kota SBY, Jawa Timur 60119");
        imageView.add("https://i.ibb.co/x65Nyfy/SD7.png");
        imageviewdetail.add("https://i.ibb.co/brJPjSN/SD07.jpg");
        detail.add("SD Kreatif An Nur adalah salah satu satuan pendidikan dengan jenjang SD di Semolowaru, Kec. Sukolilo, Kota Surabaya, Jawa Timur. Dalam menjalankan kegiatannya, SD Kreatif An Nur berada di bawah naungan Kementerian Pendidikan dan Kebudayaan\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Semolowaru No.96, Semolowaru, Kec. Sukolilo, Kota SBY, Jawa Timur 60119\n" +
                "\n" +
                "Telepon: 60413 \n");

        textView1.add("SD Budi Yakin");
        textView2.add("Jl. Rangkah Besar No.20, RT.001/RW.04, Rangkah, Kec. Tambaksari, Kota SBY, Jawa Timur 60135");
        imageView.add("https://i.ibb.co/Rhz2wJt/SD8.png");
        imageviewdetail.add("https://i.ibb.co/6yqxrYB/SD08.jpg");
        detail.add("SD Budi Yakin Surabaya merupakan sebuah Sekolah Dasar Swasta yang terletak di Jl. RANGKAH BESAR 22 SURABAYA SD Budi Yakin Surabaya  memiliki kode NPSN 20531903  . Pada 2021, SD Budi Yakin Surabaya  memiliki 36 pelajar lelaki dan 27 pelajar perempuan, menjadikan jumlah keseluruhan murid seramai 63 orang. Dengan 7 ruang kelas , 0 perpustakaan, dan 6 guru.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Rangkah Besar No.20, RT.001/RW.04, Rangkah, Kec. Tambaksari, Kota SBY, Jawa Timur 60135\n" +
                "\n" +
                "Telepon: 0313734475 \n");

        textView1.add("SDN Tembok Dukuh I");
        textView2.add("Jl. Demak No.45, Tembok Dukuh, Kec. Bubutan, Kota SBY, Jawa Timur 60173");
        imageView.add("https://i.ibb.co/W6vnWrh/SD9.png");
        imageviewdetail.add("https://i.ibb.co/D1Js4yn/SD09.jpg");
        detail.add("SDN Tembok Dukuh Surabaya merupakan sebuah Sekolah Dasar Swasta Swasta yang terletak di Jl. Demak No 45 Surabaya. SDN Tembok Dukuh Surabaya memiliki kod NPSN 20532286. Pada 2021, SDN Tembok Dukuh Surabaya memiliki 359 pelajar lelaki dan 336 pelajar perempuan, menjadikan jumlah keseluruhan murid seramai 695 orang. Dengan 14 ruang kelas,0 laboratorium ,1 perpustakaan, dan 31 guru.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Demak No.45, Tembok Dukuh, Kec. Bubutan, Kota SBY, Jawa Timur 60173\n" +
                "\n" +
                "Telepon: (031) 5472064\n" +
                "\n" +
                "Website: sdntembokdukuh.blogspot.com\n");

        textView1.add("SD Putra Indonesia Surabaya");
        textView2.add("Jl. Kyai Satari, Rungkut Menanggal, Kec. Gn. Anyar, Kota SBY, Jawa Timur 60293");
        imageView.add("https://i.ibb.co/8bJQRTv/SD10.png");
        imageviewdetail.add("https://i.ibb.co/BK9fKFm/SD10.jpg");
        detail.add("SD Putra Indonesia Surabaya merupakan sebuah Sekolah Dasar Swasta Swasta yang terletak di Jl. Kyai Satari NO. 27. Surabaya. Sd Putra Indonesia Surabaya memiliki kode NPSN 20532859 . Pada 2021, Sd Putra Indonesia Surabaya memiliki 57 pelajar lelaki dan 51 pelajar perempuan, menjadikan jumlah keseluruhan murid seramai 108 orang. Dengan 6 ruang kelas,0 laboratorium ,2 perpustakaan, dan 8 guru.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Kyai Satari, Rungkut Menanggal, Kec. Gn. Anyar, Kota SBY, Jawa Timur 60293\n" +
                "\n" +
                "Telepon: 0318498623 \n");

        textView1.add("SD Al Ichsan");
        textView2.add("Jl. Dukuh Bulak Banteng No.32, Bulak Banteng, Kec. Kenjeran, Kota SBY, Jawa Timur 60127");
        imageView.add("https://i.ibb.co/Sx6S61w/SD11.png");
        imageviewdetail.add("https://i.ibb.co/zSr02b8/SD11.jpg");
        detail.add("SD Al Ichsan Surabaya merupakan sebuah Sekolah Dasar Swasta. yang terletak di Jl. Dukuh Bulak Banteng No.32 Surabaya. SD Al Ichsan Surabaya memiliki kod NPSN 20531853 . Pada 2021, SD Al Ichsan Surabaya memiliki 199 pelajar lelaki dan 162 pelajar perempuan, menjadikan jumlah keseluruhan murid seramai 361 orang. Dengan 13 ruang kelas,1 laboratorium ,1 perpustakaan, dan 18 guru.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Dukuh Bulak Banteng No.32, Bulak Banteng, Kec. Kenjeran, Kota SBY, Jawa Timur 60127\n" +
                "\n" +
                "Telepon: 031-3729286 \n");

        textView1.add("SD Attarbiyah");
        textView2.add("Jl. Raya Hangtuah No.7, Ujung, Kec. Semampir, Kota SBY, Jawa Timur 60155");
        imageView.add("https://i.ibb.co/Bjf4MM1/SD12.png");
        imageviewdetail.add("https://i.ibb.co/bLzR5Db/SD12.jpg");
        detail.add("MI Attarbiyah merupakan sebuah Sekolah Dasar Swasta Swasta yang terletak di Kp. Cintarasa RT 01/17. MI Attarbiyah memiliki kod NPSN 60707711 . Pada 2021, MI Attarbiyah memiliki 296 murid , 7 guru, 6 kelas , 326 pelajaran dan 2 ekstra.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Raya Hangtuah No.7, Ujung, Kec. Semampir, Kota SBY, Jawa Timur 60155\n" +
                "\n" +
                "Telepon: 085221871189 \n");

        textView1.add("MIS H. Achmad Ali");
        textView2.add("Jl. Sememi Kidul, Sememi, Kec. Benowo, Kota SBY, Jawa Timur 60198");
        imageView.add("https://i.ibb.co/GxJY3xw/SD13.png");
        imageviewdetail.add("https://i.ibb.co/7WKrShb/SD13.jpg");
        detail.add("MIS H. Achmad Ali  MIS H. Achmad Ali adalah salah satu satuan pendidikan dengan jenjang MI di Sememi, Kec. Benowo, Kota Surabaya, Jawa Timur. Dalam menjalankan kegiatannya, MIS H. Achmad Ali berada di bawah naungan Kementerian Agama.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Sememi Kidul, Sememi, Kec. Benowo, Kota SBY, Jawa Timur 60198\n" +
                "\n" +
                "Telepon: 0317405901 \n");

        textView1.add("SD Putra Harapan Bangsa");
        textView2.add("Jl. Wonosari Lor No.60, Wonokusumo, Kec. Semampir, Kota SBY, Jawa Timur 60154");
        imageView.add("https://i.ibb.co/HDvftr8/SD14.png");
        imageviewdetail.add("https://i.ibb.co/9tHGqym/SD14.jpg");
        detail.add("SD Putra Harapan Bangsa adalah salah satu satuan pendidikan dengan jenjang SD di Wonokusumo, Kec. Semampir, Kota Surabaya, Jawa Timur. Dalam menjalankan kegiatannya, SD Putra Harapan Bangsa berada di bawah naungan Kementerian Pendidikan dan Kebudayaan.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Wonosari Lor No.60, Wonokusumo, Kec. Semampir, Kota SBY, Jawa Timur 60154\n" +
                "\n" +
                "Telepon: (031) 3728672 \n");

        textView1.add("SDN Petemon XIII/361 Surabaya");
        textView2.add("Jl. Simo Sidomulyo XI No.7, Simomulyo, Kec. Sukomanunggal, Kota SBY, Jawa Timur 60252");
        imageView.add("https://i.ibb.co/Zcf2tnG/SD15.png");
        imageviewdetail.add("https://i.ibb.co/41cvXJQ/SD15.jpg");
        detail.add("15.\tSD Negeri Petemon XIII361 adalah salah satu satuan pendidikan dengan jenjang SD di Petemon, Kec. Sawahan, Kota Surabaya, Jawa Timur. Dalam menjalankan kegiatannya, SD Negeri Petemon XIII361 berada di bawah naungan Kementerian Pendidikan dan Kebudayaan.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Simo Sidomulyo XI No.7, Simomulyo, Kec. Sukomanunggal, Kota SBY, Jawa Timur 60252\n" +
                "\n" +
                "Telepon: 0315351371 \n");

        prosesRecyclerViewAdapter();
    }


}