package com.example.kel3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SMAActivity extends AppCompatActivity {

    private ArrayList<String> imageView = new ArrayList<>();
    private ArrayList<String> imageviewdetail = new ArrayList<>();
    private ArrayList<String> textView1 = new ArrayList<>();
    private ArrayList<String> textView2 = new ArrayList<>();
    private ArrayList<String> detail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smp);

        getDataFromInternet();
    }
    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(imageView, imageviewdetail, textView1, textView2, detail, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void getDataFromInternet(){

        textView1.add("SMA Negeri 5 Surabaya");
        textView2.add("Jl. Kusumabangsa 21 SBY Kec. Genteng");
        imageView.add("https://i.ibb.co/m9JN8kn/SMA01.png");
        imageviewdetail.add("https://i.ibb.co/YhSymPg/SMA01.jpg");
        detail.add("Sekolah Menengah Atas Negeri 5 Surabaya, yang juga dikenal dengan nama Smalabaya, merupakan sebuah Sekolah Menengah Atas Negeri di Surabaya. SMA Negeri 5 Surabaya dibuat sebagai aib satu Sekolah Adiwiyata di Surabaya. Sekolah ini berlokasi di pusat kota Surabaya, tepatnya Perlintasan Kusumabangsa no. 21, di kawasan yang dikenal dengan istilah SMA kompleks bersama SMA Negeri 1 Surabaya, SMA Negeri 2 Surabaya, dan SMA Negeri 9 Surabaya.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. KUSUMA BANGSA NO.21, KETABANG, KEC. GENTENG. KOTA SBY, JAWA TIMUR 60272.\n" +
                "\n" +
                "Telepon: 0315345155\n" +
                "\n" +
                "Website: http://www.sma5-sby.sch.id/\n");

        textView1.add("SMA Negeri 15 Surabaya");
        textView2.add("Jl. Dukuh Menanggal Sel. No. 103, Duku Menanggal, Kec. Gayungan, Kota SBY, Jawa Timur 60234");
        imageView.add("https://i.ibb.co/Lk472xV/SMA02.png");
        imageviewdetail.add("https://i.ibb.co/Y7285gg/SMA02.jpg");
        detail.add("SMA Negeri (SMAN) 15 Surabaya atau disingkat dengan Libels, merupakan aib satu Sekolah Menengah Atas Negeri berstatus Sekolah Kawasan yang telah tersedia di Provinsi Jawa Timur, Indonesia. Sama dengan SMA pada umumnya di Indonesia masa pendidikan sekolah di SMAN 15 Surabaya ditempuh dalam saat tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Dukuh Menanggal Sel. No. 103, Dukuh Menanggal, Kec. Gayungan, Kota SBY, Jawa Timur 60234\n" +
                "\n" +
                "Telepon: 0318290473\n" +
                "\n" +
                "Website: http://www.sman15-sby.sch.id/\n");

        textView1.add("SMA Muhammadiyah 2 Surabaya");
        textView2.add("Jl. Pucang Anom No. 91, Kertajaya, Kec. Gubeng, Kota SBY, Jawa Timur 60282");
        imageView.add("https://i.ibb.co/w7KkGWm/SMA03.png");
        imageviewdetail.add("https://i.ibb.co/yFdvRT6/SMA03.jpg");
        detail.add("Alamat: Jl. Pucang Anom No. 91, Kertajaya, Kec. Gubeng, Kota SBY, Jawa Timur 60282\n" +
                "\n" +
                "Telepon: 0315021316\n" +
                "\n" +
                "Website: http://www.smamda.net/\n");

        textView1.add("SMA Negeri 1 Surabaya");
        textView2.add("Jl. Wijaya Kusuma No. 48, Ketabang, Kec. Genteng, Kota SBY, Jawa TImur 60272");
        imageView.add("https://i.ibb.co/nRhy1sw/SMA04.png");
        imageviewdetail.add("https://i.ibb.co/r2N57Cy/SMA04.jpg");
        detail.add("Alamat: Jl. Wijaya Kusuma No. 48, Ketabang, Kec. Genteng, Kota SBY, Jawa TImur 60272\n" +
                "\n" +
                "Telepon: 0315345670\n" +
                "\n" +
                "Website: http://www.sman1sby.sch.id/ \n");

        textView1.add("SMA Negeri 16 Surabaya");
        textView2.add("Jl. Raya Prapen No.59, Panjang Jiwo, Kec. Tenggillis Mejoyo, Kota SBY, Jawa Timur 60299");
        imageView.add("https://i.ibb.co/WkLV2xw/SMA05.png");
        imageviewdetail.add("https://i.ibb.co/W54Hb21/SMA05.jpg");
        detail.add("Sekolah Menengah Atas Negeri 16 Surabaya atau kerap disapa Sixteen adalah Salah satu Sekolah Menengah Atas Negeri favorit di Surabaya. Sekolah ini terletak di Jalan Raya Prapen Surabaya. Sekolah ini dulunya adalah SMPP (Sekolah Menengah Pembangunan Persiapan) yang dibangun tahun 1974 dan ditempati tanggal 26 November 1975. Kemudian pada tanggal 9 Agustus 1985, SMPP berubah menjadi SMA Negeri 16 Surabaya berdasarkan SK. No. 0353/0/85.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Raya Prapen No.59, Panjang Jiwo, Kec. Tenggillis Mejoyo, Kota SBY, Jawa Timur 60299\n" +
                "\n" +
                "Telepon: 0318415492\n" +
                "\n" +
                "Website: http://www.sman16sby.sch.id/\n");

        textView1.add("SMA Negeri 11 Surabaya");
        textView2.add("Jl. Perumnas Jl. Manukan Adi No. 1, Manukan Kulon, Kec. Tandes, Kota SBY, Jawa Timur 60185");
        imageView.add("https://i.ibb.co/VYfm7gT/SMA06.png");
        imageviewdetail.add("https://i.ibb.co/4Zdh1Tz/SMA06.jpg");
        detail.add("Alamat: Jl. Perumnas Jl. Manukan Adi No. 1, Manukan Kulon, Kec. Tandes, Kota SBY, Jawa Timur 60185 \n" +
                "\n" +
                "Telepon: 0317441037\n" +
                "\n" +
                "Website: http://www.sman11sby.com/ \n");

        textView1.add("SMA Negeri 6 Surabaya");
        textView2.add("Jl. Gubernur Suryo No. 11, Embong Kaliasin, Kec. Genteng, Kota SBY, Jawa Timur 60271");
        imageView.add("https://i.ibb.co/5rKJfVM/SMA07.jpg");
        imageviewdetail.add("https://i.ibb.co/vZX5dDS/SMA07.jpg");
        detail.add("Alamat: Jl. Gubernur Suryo No. 11, Embong Kaliasin, Kec. Genteng, Kota SBY, Jawa Timur 60271\n" +
                "\n" +
                "Telepon: 0315345974\n" +
                "\n" +
                "Website: http://www.sman6sby.sch.id/\n");

        textView1.add("SMA Santa Maria Surabaya");
        textView2.add("Jl. Raya Darmo No.49, Keputran, Kec. Tegalsari, Kota SBY, Jawa Timur 60265");
        imageView.add("https://i.ibb.co/T8NK2NY/SMA08.png");
        imageviewdetail.add("https://i.ibb.co/G5CwhHz/SMA08.jpg");
        detail.add("Alamat: Jl. Raya Darmo No.49, Keputran, Kec. Tegalsari, Kota SBY, Jawa Timur 60265\n" +
                "\n" +
                "Telepon: 0315661996\n" +
                "\n" +
                "Website: http://www.smasanmarosu.sch.id/\n");

        textView1.add("SMA Negeri 3 Surabaya");
        textView2.add("Jl. Memet Sastrowiryo Komplek TNI AL, Kenjeran, Komplek Kenjeran, Kec. Bulak, Kota SBY, Jawa Timur 60121");
        imageView.add("https://i.ibb.co/42Wp5cM/SMA09.png");
        imageviewdetail.add("https://i.ibb.co/d61h8SV/SMA09.jpg");
        detail.add("Alamat: Jl. Memet Sastrowiryo Komplek TNI AL, Kenjeran, Komplek Kenjeran, Kec. Bulak, Kota SBY, Jawa Timur 60121\n" +
                "\n" +
                "Telepon: 0313812356\n" +
                "\n" +
                "Website: http://www.sman3surabaya.sch.id/\n");

        textView1.add("SMA Negeri 13 Surabaya");
        textView2.add("Jl. Menganti Lidah Kulon, Lidah Kulon, Kec. Lakarsantri, Kota SBY, Jawa Timur 60213");
        imageView.add("https://i.ibb.co/HnMVKVk/SMA10.png");
        imageviewdetail.add("https://i.ibb.co/D4sFHQS/SMA10.jpg");
        detail.add("Alamat: Jl. Menganti Lidah Kulon, Lidah Kulon, Kec. Lakarsantri, Kota SBY, Jawa Timur 60213\n" +
                "\n" +
                "Telepon: 0317531770\n" +
                "\n" +
                "Website: http://sman13surabaya.sch.id/ \n");

        textView1.add("SMA Negeri 7 Surabaya");
        textView2.add("Jl. Ngaglik No.27-29, Kapasari, Kec. Genteng, Kota SBY, Jawa Timur 60273");
        imageView.add("https://i.ibb.co/bKqYYzH/SMA11.png");
        imageviewdetail.add("https://i.ibb.co/D4sFHQS/SMA10.jpg");
        detail.add("Alamat: Jl. Ngaglik No.27-29, Kapasari, Kec. Genteng, Kota SBY, Jawa Timur 60273\n" +
                "\n" +
                "Telepon: 0313732716\n" +
                "\n" +
                "Website: http://www.sman7surabaya.sch.id/\n");

        textView1.add("SMA Negeri 4 Surabaya");
        textView2.add("Jl. Mayjen Prof.DR. Moestopo No. 04, Pacar Keling, Kec. Tambaksari, Kota SBY, Jawa Timur 60131");
        imageView.add("https://i.ibb.co/mTRKJnf/SMA12.png");
        imageviewdetail.add("https://i.ibb.co/ZMZSRb7/SMA12.jpg");
        detail.add("Alamat: Jl. Mayjen Prof.DR. Moestopo No. 04, Pacar Keling, Kec. Tambaksari, Kota SBY, Jawa Timur 60131\n" +
                "\n" +
                "Telepon: 0315013588\n" +
                "\n" +
                "Website: http://sman4sby.sch.id/ \n");

        textView1.add("SMA Negeri 19 Surabaua");
        textView2.add("Jl. Kedung Cowek No.390, Tanah Kali Kedinding, Kec. Kenjeran, Kota SBY, Jawa Timur 60134");
        imageView.add("https://i.ibb.co/LvXQjTs/SMA13.png");
        imageviewdetail.add("https://i.ibb.co/1Jk1xP7/SMA13.jpg");
        detail.add("Alamat: Jl. Kedung Cowek No.390, Tanah Kali Kedinding, Kec. Kenjeran, Kota SBY, Jawa Timur 60134\n" +
                "\n" +
                "Telepon: 03151504844\n" +
                "\n" +
                "Website: http://sman19sby.sch.id/ \n");

        textView1.add("SMA Katolik Frateran");
        textView2.add("Jl. Kepanjen No.8, Krembangan Sel., Kec. Krembangan, Kota SBY, Jawa Timur 60175");
        imageView.add("https://i.ibb.co/yfY1q74/SMA14.png");
        imageviewdetail.add("https://i.ibb.co/PFNPTVZ/SMA14.jpg");
        detail.add("Alamat: Jl. Kepanjen No.8, Krembangan Sel., Kec. Krembangan, Kota SBY, Jawa Timur 60175\n" +
                "\n" +
                "Telepon: 0313524901\n" +
                "\n" +
                "Website: http://frateran.sch.id/ \n");

        textView1.add("SMA Muhammadiyah 4 Surabaya");
        textView2.add("Jl. Kemlaten Baru Utara No.41-43, Kebraon, Kec. Karang Pilang, Kota SBY, Jawa Timur 60222");
        imageView.add("https://i.ibb.co/qD8y2V6/SMA15.png");
        imageviewdetail.add("https://i.ibb.co/YN7z04L/SMA15.jpg");
        detail.add("Alamat: Jl. Kemlaten Baru Utara No.41-43, Kebraon, Kec. Karang Pilang, Kota SBY, Jawa Timur 60222\n" +
                "\n" +
                "Telepon: 0317664220\n");

        prosesRecyclerViewAdapter();
    }
}