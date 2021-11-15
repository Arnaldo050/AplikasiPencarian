package com.example.kel3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SMPActivity extends AppCompatActivity {

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

        textView1.add("SMP Negeri 1 Surabaya");
        textView2.add("Jl. Pacar No.4-6, Ketabang, Kec. Genteng, Kota SBY, Jawa Timur 60272");
        imageView.add("https://i.ibb.co/MSd1Jm1/SMP01.png");
        imageviewdetail.add("https://i.ibb.co/fx3v8Y6/SMP01.jpg");
        detail.add("SMP NEGERI 1 SURABAYA adalah Sekolah Menengah Pertama favorit yang berada di kota Surabaya, Jawa Timur, Indonesia. SMPN 1 Surabaya memiliki staf pengajar guru yang kompeten pada bidang pelajarannya sehingga berkualitas dan menjadi salah satu yang terbaik di Kota Surabaya. Tersedia juga berbagai fasilitas sekolah seperti ruang kelas yang nyaman, perpustakaan, lapangan olahraga, kantin dan lainnya.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Pacar No.4-6, Ketabang, Kec. Genteng, Kota SBY, Jawa Timur 60272\n" +
                "\n" +
                "Telepon: 0315470111\n" +
                "\n" +
                "Website: http://20532613.siap-sekolah.com/sekolah-profil/ \n");

        textView1.add("SMP Negeri 11 Surabaya");
        textView2.add("Jl. Sawah Pulo No.1, Ujung, Kec. Semampir, Kota SBY, Jawa Timur 60155");
        imageView.add("https://i.ibb.co/20ryNNk/SMP02.png");
        imageviewdetail.add("https://i.ibb.co/ssdpPXJ/SMP02.jpg");
        detail.add("Alamat: Jl. Sawah Pulo No.1, Ujung, Kec. Semampir, Kota SBY, Jawa Timur 60155\n" +
                "\n" +
                "Telepon: 0313293017\n" +
                "\n" +
                "Website: http://20532583.siap-sekolah.com/sekolah-profil/ \n");

        textView1.add("SMP Negeri 6 Surabaya");
        textView2.add("Jl. Jawa No.24, Gubeng, Kec. Gubeng, Kota SBY, Jawa Timur 60281");
        imageView.add("https://i.ibb.co/kcS6JCc/SMP03.png");
        imageviewdetail.add("https://i.ibb.co/ZgX2zgW/SMP03.jpg");
        detail.add("SMP Negeri 6 Surabaya merupakan sekolah yang pernah memiliki status sebagai Rintisan Sekolah Berstandar Internasional (RSBI). Beralamat di Jalan Jawa No. 24 Surabaya 60281, sekolah ini termasuk sekolah yang berukuran kecil dan memiliki tiga lantai. SMP Negeri 6 Surabaya lebih dikenal dengan nama Spensix. Sekolah ini juga sering mendapat penghargaan. Salah satu penghargaan yang membanggakan adalah juara 1 dalam kompetisi paduan suara yang dilaksanakan di Guangzhou, China.[1] Selain itu, sekolah ini masih mempunyai sangat banyak penghargaan yang bisa dilihat di lobby sekolah, aula, ruang guru, dan di ruang lain seperti ruang BK dan ruang TU. Sekolah ini juga terkenal karena ciptaan salah satu siswa, yaitu celana dalam anti pelecehan seksual yang sempat diangkat oleh 12 stasiun televisi.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Jawa No.24, Gubeng, Kec. Gubeng, Kota SBY, Jawa Timur 60281\n" +
                "\n" +
                "Telepon: 0315013602\n" +
                "\n" +
                "Website: http://20532564.siap-sekolah.com/sekolah-profil/#.YXvuHEQxdzA\n");

        textView1.add("SMP Negeri 3 Surabaya");
        textView2.add("Jl. Praban No.3, Genteng, Kec. Genteng, Kota SBY, Jawa Timur 60275");
        imageView.add("https://i.ibb.co/80tdMBT/SMP04.png");
        imageviewdetail.add("https://i.ibb.co/x3Pcb4z/SMP04.jpg");
        detail.add("Sejak RSBI dihapus dari sistem pendidikan, SMP Negeri 3 Surabaya ber-status Sekolah Kawasan sejak tahun 2013. Untuk mengikuti TPA (Tes Potensi Akademik) di sekolah kawasan, diperlukan standar nilai total UN minimal untuk SMP: 25,50 (rata-rata 8,50) serta tidak ada nilai di bawah 7,50 dengan bobot nilai UN 40% dan bobot nilai TPA 60%.\n" +
                "\n" +
                "Sekolah ini merupakan sekolah kebangsaan yang dapat dilihat saat pagi hari selalu ada kegiatan bersalaman dengan guru, menyanyikan lagu wajib setelah do'a awal pelajaran, memutarkan lagu-lagu nasional saat jam istirahat pertama maupun kedua, terdapat lorong kebangsaan berisi foto-foto pahlawan.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Praban No.3, Genteng, Kec. Genteng, Kota SBY, Jawa Timur 60275\n" +
                "\n" +
                "Telepon: 0315341021\n" +
                "\n" +
                "Website: https://sekolah.data.kemdikbud.go.id/index.php/chome/profil/e0e4057a-8d18-e111-bd26-e53013566214\n");

        textView1.add("SMP Negeri 12 Surabaya");
        textView2.add("Jl. Ngagel Kebonsari no 1, Surabaya, Jawa Timur");
        imageView.add("https://i.ibb.co/kJQ5rFW/SMP05.png");
        imageviewdetail.add("https://i.ibb.co/YkwpfP6/SMP05.jpg");
        detail.add("SMP Negeri 12 Surabaya merupakan salah satu sekolah menengah pertama Negeri yang ada di Provinsi Jawa Timur, Indonesia. SMP ini dibangun pada tanggal 11 November 1974, dan dikenal dengan sebutan Rholas. Rholas mempunyai banyak prestasi di setiap bidang, mulai dari akademik dan non akademik\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Ngagel Kebonsari no 1, Surabaya, Jawa Timur, Indonesia\n" +
                "\n" +
                "Telepon: 0315041591\n" +
                "\n" +
                "Website: https://sekolah.data.kemdikbud.go.id/index.php/chome/profil/40787c79-8d18-e111-a8fb-f10e9df6c06f \n");

        textView1.add("SMP Negeri 26 Surabaya");
        textView2.add("Jl. Banjar Sugihan Baru No.21, Banjar Sugihan, Kec. Tandes, Kota SBY, Jawa Timur 60185");
        imageView.add("https://i.ibb.co/6ZsKxKM/SMP06.png");
        imageviewdetail.add("https://i.ibb.co/mGN1NR3/SMP06.jpg");
        detail.add("SMP Negeri (SMPN) 26 Surabaya atau yang dikenal dengan akronim spentwosix, merupakan sebuah Sekolah Menengah Pertama Negeri yang ada di Kota Surabaya, Provinsi Jawa Timur, Indonesia. Sama dengan SMP pada umumnya di Indonesia masa pendidikan sekolah di SMPN 26 Surabaya ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas VII sampai Kelas IX. Sekolah ini terletak di kecamatan Tandes, kota Surabaya.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Banjar Sugihan Baru No.21, Banjar Sugihan, Kec. Tandes, Kota SBY, Jawa Timur 60185\n" +
                "\n" +
                "Telepon: 0317405214\n" +
                "\n" +
                "Website: http://www.smpn26sby.sch.id/ \n");

        textView1.add("SMP Negeri 22 Surabaya");
        textView2.add("Jl. Gayungsari Bar. X No. 38, Gayungan, Kec. Gayungan, Kota SBY, Jawa Timur 60235");
        imageView.add("https://i.ibb.co/2W0YHRJ/SMP07.png");
        imageviewdetail.add("https://i.ibb.co/pf1JB0t/SMP07.jpg");
        detail.add("SMP Negeri 22 Surabaya, merupakan salah satu Sekolah Menengah Pertama Negeri Favorit yang ada di Provinsi Jawa Timur, Indonesia. SMP Negeri 22 Surabaya merupakan salah satu sekolah adiwiyata, karena merupakan sekolah yang peduli dan berbudaya lingkungan. SMPN 22 Surabaya atau yang biasa disingkat Dapuda Surabaya dikenal berkat prestasi akademik maupun non-akademik para pelajarnya. Berada di sebelah timur Masjid Nasional Al-Akbar Surabaya. Sama dengan SMP pada umumnya di Indonesia masa pendidikan sekolah di SMPN 22 Surabaya ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas VII sampai Kelas IX.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Gayungsari Bar. X No. 38, Gayungan, Kec. Gayungan, Kota SBY, Jawa Timur 60235\n" +
                "\n" +
                "Telepon: 0318290075\n" +
                "\n" +
                "Website: http://www.smpn22sby.sch.id/ \n");

        textView1.add("SMP Negeri 7 Surabaya");
        textView2.add("Jl. Tanjung Sadari No.17, Perak Bar, Kec. Krembangan, Kota SBY, Jawa Timur 60177");
        imageView.add("https://i.ibb.co/5KfKCLJ/SMP08.png");
        imageviewdetail.add("https://i.ibb.co/xX4JCjy/SMP08.jpg");
        detail.add("Alamat: Jl. Tanjung Sadari No.17, Perak Bar, Kec. Krembangan, Kota SBY, Jawa Timur 60177\n" +
                "\n" +
                "Telepon: 0313541603\n" +
                "\n" +
                "Website: http://smpn7surabaya.sch.id/ \n");

        textView1.add("SMP Negeri 2 Surabaya");
        textView2.add("Jl. Kepanjen No.1, Krembengan Sel., Kec Krembengan, Kota SBY, Jawa Timur 60175");
        imageView.add("https://i.ibb.co/7Gx9V8v/SMP09.png");
        imageviewdetail.add("https://i.ibb.co/XFN1sn8/SMP09.jpg");
        detail.add("SMP Negeri 2 Surabaya adalah sekolah menengah pertama negeri yang berada di kota Surabaya, Jawa Timur, Indonesia, bertempat di jalan Jl. Kepanjen 1 Krembangan Surabaya, masuk wilayah Kelurahan Krembangan Selatan, Kecamatan Krembangan, Kotamadya Surabaya, merupakan Sekolah Menengah Pertama Negeri yang pertama kali benar di Surabaya. Saat ini SMP Negeri 2 surabaya, memiliki 27 kelas, kelas VIII dan IX masuk pagi sedangkan kelas VII masuk siang. Jumlah murid pada tahum nasihat 2009-2010 berjumlah 1041 siswa yang dibina oleh 68 guru dan 1 orang Kepala Sekolah dan dibantu oleh 2 Wakil kepala sekolah, 2 orang urusan kurikulum, 1 orang urusan kesiswaan, 1 orang urusan humas, 1 orang urusan fasilitas prasarana serta 21 staf Kelola Usaha dan pramusekolah. SMP Negeri 2 Surabaya dikenal juga dengan akronim Spendabaya.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Kepanjen No.1, Krembengan Sel., Kec Krembengan, Kota SBY, Jawa Timur 60175\n" +
                "\n" +
                "Telepon: 0313522836\n" +
                "\n" +
                "Website: https://id.m.wikipedia.org/wiki/SMP_Negeri_2_Surabaya \n");

        textView1.add("SMP Negeri 5 Surabaya");
        textView2.add("Jl. Rajawali No.57, Krembangan Sel., Kec. Krembengan, Kota SBY, Jawa Timur 60175");
        imageView.add("https://i.ibb.co/rFPrQ9d/SMP10.png");
        imageviewdetail.add("https://i.ibb.co/XFkGxX2/SMP10.jpg");
        detail.add("Alamat: Jl. Rajawali No.57, Krembangan Sel., Kec. Krembengan, Kota SBY, Jawa Timur 60175\n" +
                "\n" +
                "Telepon: 0313550149\n" +
                "\n" +
                "Website: http://www.smpn5sby.sch.id/ \n");

        textView1.add("SMP Negeri 10 Surabaya");
        textView2.add("Jl. Kupang Panjaan V No.2 DR. Soetomo, Kec. Tegalsari, Kota SBY, Jawa Timur 60264");
        imageView.add("https://i.ibb.co/KxDnSm3/SMP11.png");
        imageviewdetail.add("https://i.ibb.co/7y6Zz2Z/SMP11.jpg");
        detail.add("Alamat: Jl. Kupang Panjaan V No.2 DR. Soetomo, Kec. Tegalsari, Kota SBY, Jawa Timur 60264\n" +
                "\n" +
                "Telepon: 0315632861\n" +
                "\n" +
                "Website: http://smpn10surabaya.sch.id/ \n");

        textView1.add("SMP Negeri 9 Surabaya");
        textView2.add("Jl. Taman Putro Agung No.1, Rangkah, Kec. Tambaksari, Kota SBY, Jawa Timur 60135");
        imageView.add("https://i.ibb.co/9HrDWgq/SMP12.png");
        imageviewdetail.add("https://i.ibb.co/BtGR3Lt/SMP12.jpg");
        detail.add("SMP Negeri (SMPN) 9 Surabaya, merupakan salah satu Sekolah Menengah Pertama Negeri yang ada di Provinsi Jawa Timur, Indonesia. SMP Negeri 9 Surabaya merupakan salah satu Sekolah Adiwiyata / Sekolah berwawasan Lingkungan Hidup di Kota Surabaya. Kepala SMP Negeri 9 Surabaya adalah Ibu Yulia Krisnawati, M.Pd. Sebelumnya, Kepala SMP Negeri 9 adalah Ibu Dra. Ni Ketut Rohani, M.Pd. Sekolah ini terletak di Jl. Taman Potro Agung No.1, Kecamatan Tambaksari, Kota Surabaya. Motto SMP Negeri 9 Surabaya adalah TIADA HARI TANPA PRESTASI. Dalam Pembelajaran, SMP Negeri 9 Surabaya menggunakan sistem zonasi untuk awal tahun ajaran baru ini dimana sistem zonasi membuat lahan smpn 9 surabaya semakin kecil akibat lonjakan pada jumlah kelas.adapun Kurikulum lain yang digunakan yakni Kurikulum 2013. Sama dengan SMP pada umumnya di Indonesia masa pendidikan sekolah di SMP Negeri 9 Surabaya ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas VII sampai Kelas IX.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Taman Putro Agung No.1, Rangkah, Kec. Tambaksari, Kota SBY, Jawa Timur 60135\n" +
                "\n" +
                "Telepon: 0313714196\n" +
                "\n" +
                "Website: http://smpnegeri9surabaya.com/ \n");

        textView1.add("SMP Negeri 15 Surabaya");
        textView2.add("Jl. H. Moh. Noer No.352, RW.2, Tanah Kali Kedinding, Kec. Kenjeran, Kota SBY, Jawa Timur 60129");
        imageView.add("https://i.ibb.co/hCMjdJp/SMP13.png");
        imageviewdetail.add("https://i.ibb.co/mt7Jx60/SMP13.jpg");
        detail.add("Alamat: Jl. H. Moh. Noer No.352, RW.2, Tanah Kali Kedinding, Kec. Kenjeran, Kota SBY, Jawa Timur 60129\n" +
                "\n" +
                "Telepon: 03151504543\n" +
                "\n" +
                "Website: http://sman15-sby.sch.id/ \n");

        textView1.add("SMP Negeri 19 Surabaya");
        textView2.add("Jl. Arief Rahman Hakim No.103-B, Klampis Ngasem, Kec. Sukolilo, Kota SBY, Jawa Timur 60117");
        imageView.add("https://i.ibb.co/2tdCGms/SMP14.png");
        imageviewdetail.add("https://i.ibb.co/0fZJ3np/SMP14.jpg");
        detail.add("Alamat: Jl. Arief Rahman Hakim No.103-B, Klampis Ngasem, Kec. Sukolilo, Kota SBY, Jawa Timur 60117\n" +
                "\n" +
                "Telepon: 0315940410\n" +
                "\n" +
                "Website: http://www.smpn19surabaya.sch.id/ \n");

        textView1.add("SMP Negeri 23 Surabaya");
        textView2.add("Jl. Kedung Baruk Bar. No. 1, Kedung Baruk, Kec. Rungkut, Kota SBY, Jawa Timur 60298");
        imageView.add("https://i.ibb.co/9TzcHHG/SMP15.png");
        imageviewdetail.add("https://i.ibb.co/qjwk09d/SMP15.jpg");
        detail.add("Alamat: Jl. Kedung Baruk Bar. No. 1, Kedung Baruk, Kec. Rungkut, Kota SBY, Jawa Timur 60298\n" +
                "\n" +
                "Telepon: 0318701324\n" +
                "\n" +
                "Website: http://www.smpnegeri23surabaya.blogspot.com/ \n");

        prosesRecyclerViewAdapter();
    }


}