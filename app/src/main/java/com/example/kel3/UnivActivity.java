package com.example.kel3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class UnivActivity extends AppCompatActivity {

    private ArrayList<String> imageView = new ArrayList<>();
    private ArrayList<String> imageviewdetail = new ArrayList<>();
    private ArrayList<String> textView1 = new ArrayList<>();
    private ArrayList<String> textView2 = new ArrayList<>();
    private ArrayList<String> detail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univ);

        getDataFromInternet();
    }
    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(imageView, imageviewdetail, textView1, textView2, detail,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void getDataFromInternet(){

        textView1.add("Institut Teknologi Sepuluh Nopember");
        textView2.add("Jl. Teknik Kimia, Keputih, Kec. Sukolilo, Kota SBY, Jawa Timur 60111");
        imageView.add("https://www.its.ac.id/wp-content/uploads/2020/07/Lambang-ITS-2-300x300.png");
        imageviewdetail.add("https://i.ibb.co/ftW6WHk/UNIV01.jpg");
        detail.add("Institut Teknologi Sepuluh Nopember adalah perguruan tinggi negeri yang terletak di Surabaya. Pada awalnya, ITS didirikan oleh Yayasan Perguruan Tinggi Teknik yang diketuai oleh dr. Angka Nitisastro pada 10 November 1957.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Teknik Kimia, Keputih, Kec. Sukolilo, Kota SBY, Jawa Timur 60111\n" +
                "\n" +
                "Telepon: (031) 5994251\n" +
                "\n" +
                "Website: www.its.ac.id\n" +
                "\n" +
                "Rektor: Mochamad Ashari\n" +
                "\n" +
                "Didirikan: 10 November 1957\n" +
                "\n" +
                "Provinsi: Jawa Timur\n" +
                "\n" +
                "Presiden: Ir. Triyogi Yuwono\n");

        textView1.add("Universitas Airlangga");
        textView2.add("Jl. Airlangga No.4-6, Airlangga, Kec. Gubeng, Kota SBY, Jawa Timur 60115");
        imageView.add("https://unair.ac.id/uploads/file/074aa51449f5ba410014c0a90fe2df44.png");
        imageviewdetail.add("https://i.ibb.co/phKVMQJ/UNIV02.jpg");
        detail.add("Universitas Airlangga adalah sebuah perguruan tinggi negeri yang terletak di Surabaya, Jawa Timur. Universitas ini didirikan tanggal 10 November 1954 bertepatan dengan hari pahlawan yang ke-9. Berdasarkan data 30 September 2015, terdapat 38.047 mahasiswa yang terdaftar di Unair.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Airlangga No.4 - 6, Airlangga, Kec. Gubeng, Kota SBY, Jawa Timur 60115\n" +
                "\n" +
                "Telepon: (031) 5915551\n" +
                "\n" +
                "Website: www.unair.ac.id\n" +
                "\n" +
                "Didirikan: 10 November 1954\n" +
                "\n" +
                "Provinsi: Jawa Timur\n");

        textView1.add("Universitas Negeri Surabaya");
        textView2.add("Jl. Lidah Wetan, Kec. Lakarsantri, Kota SBY, Jawa Timur 60213");
        imageView.add("https://upload.wikimedia.org/wikipedia/commons/7/75/Unesa.png");
        imageviewdetail.add("https://i.ibb.co/y42wBS4/UNIV03.jpg");
        detail.add("Universitas Negeri Surabaya adalah sebuah Perguruan Tinggi Negeri yang terletak di Surabaya, Jawa Timur, Indonesia. UNESA didirikan pada 19 Desember 1964.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Lidah Wetan, Lidah Wetan, Kec. Lakarsantri, Kota SBY, Jawa Timur 60213\n" +
                "\n" +
                "Telepon: (031) 8280009\n" +
                "\n" +
                "Website: www.unesa.ac.id\n" +
                "\n" +
                "Rektor: Prof. Dr. H. Nurhasan, M.Kes\n" +
                "\n" +
                "Didirikan: 19 Desember 1964\n" +
                "\n" +
                "Provinsi: Jawa Timur\n" +
                "\n" +
                "Jumlah mahasiswa: 31.364\n" +
                "\n" +
                "Staf akademik: 83\n");

        textView1.add("Universitas Pembangunan Nasional Veteran");
        textView2.add("Jl. Rungkut Madya No.1, Gn. Anyar, Kec. Gn. Anyar, Kota SBY, Jawa Timur 60294");
        imageView.add("https://www.upnjatim.ac.id/wp-content/uploads/2018/05/logoupnbaru.png");
        imageviewdetail.add("https://i.ibb.co/6YK8Dfn/UNIV04.jpg");
        detail.add("Universitas Pembangunan Nasional \"Veteran\" Jawa Timur, disingkat UPN \"Veteran\" Jatim atau UPN Veteran Jatim merupakan salah satu Perguruan Tinggi Negeri di Indonesia terakreditasi Institusi \"A\" yang berlokasi di Surabaya, Jawa Timur. UPN Veteran Jatim berdiri sejak 5 Juli 1959\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Rungkut Madya No.1, Gn. Anyar, Kec. Gn. Anyar, Kota SBY, Jawa Timur 60294\n" +
                "\n" +
                "Telepon: (0623) 18706369\n" +
                "\n" +
                "Website: www.upnjatim.ac.id\n" +
                "\n" +
                "Rektor: Prof. Dr. Ir. Akhmad Fauzi, M.MT, IPU.\n" +
                "\n" +
                "Didirikan: 5 Juli 1959\n");

        textView1.add("Universitas 17 Agustus 1945");
        textView2.add("Jl. Semolowaru No.45, Menur Pumpungan, Kec. Sukolilo, Kota SBY, Jawa Timur 60118");
        imageView.add("https://akupintar.id/documents/20143/0/UNTAG.png/d5f369aa-170d-6739-a6cf-6546cfe41c62?version=1.0&t=1517868058537&imageThumbnail=1");
        imageviewdetail.add("https://i.ibb.co/GRJ2MrP/UNIV05.jpg");
        detail.add("Universitas 17 Agustus 1945 Surabaya adalah perguruan tinggi swasta di Surabaya, Indonesia yang didirikan pada 17 Agustus 1958.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Semolowaru No.45, Menur Pumpungan, Kec. Sukolilo, Kota SBY, Jawa Timur 60118\n" +
                "\n" +
                "Telepon: (031) 5931800\n" +
                "\n" +
                "Website: www.untag-sby.ac.id\n" +
                "\n" +
                "Rektor: Dr. Mulyanto Nugroho, MM, CMA, CPA\n" +
                "\n" +
                "Didirikan: 17 Agustus 1954\n" +
                "\n" +
                "Provinsi: Jawa Timur\n");

        textView1.add("Universitas Ciputra");
        textView2.add("CitraLand CBD Boulevard, Made, Kec. Sambikerep, Kota SBY, Jawa Timur 60219");
        imageView.add("https://www.uc.ac.id/wp-content/uploads/2015/07/LOGO-ROUND-LOGO.png");
        imageviewdetail.add("https://i.ibb.co/PZD7mkQ/UNIV06.jpg");
        detail.add("Universitas Ciputra atau Universitas Ciputra Surabaya adalah salah satu perguruan tinggi swasta di Surabaya, Indonesia. Universitas ini didirikan pada 7 Februari 1990 dan diberikan SK PT tertanggal 31 Mei 2006. UC terletak di UC Town Citra Land, Sambi Kerep, Surabaya.\n" +
                "\n" +
                "\n" +
                "Alamat: CitraLand CBD Boulevard, Made, Kec. Sambikerep, Kota SBY, Jawa Timur 60219\n" +
                "\n" +
                "Telepon: (031) 7451699\n" +
                "\n" +
                "Website: www.uc.ac.id\n" +
                "\n" +
                "Rektor: Yohannes Somawihardja\n" +
                "\n" +
                "Didirikan: 7 Februari 1990\n" +
                "\n" +
                "Provinsi: Jawa Timur\n");

        textView1.add("Universitas Hang Tuah");
        textView2.add("Jl. Arief Rahman Hakim, Keputih, Kec. Sukolilo, Kota SBY, Jawa Timur 60111");
        imageView.add("https://upload.wikimedia.org/wikipedia/ms/b/bb/Lambang_Universiti_Hang_Tuah.png");
        imageviewdetail.add("https://i.ibb.co/Xyg0B2N/UNIV07.jpg");
        detail.add("Universitas Hang Tuah yang berwawasan kelautan, dapat menunjukkan secara jelas Pola Ilmiah Pokok (PIP), yakni ilmu dan teknologi kelautan, sesuai dengan aspirasi TNI AL dalam ikut serta mencerdaskan kehidupan bangsa. Program studi S-1 dan program diploma III yang ada di Universitas Hang Tuah antara lain: Fakultas Teknologi kelautan memiliki program studi S-1 Oseanografi, program diploma III nautika, (MPB-III) dan teknika (AMK-A). Fakultas Teknik dengan program studi S-1 Teknik perkapalan, Teknik Sistem Pekapalan, dan Teknik Elektro pad tahun 1993 . Fakultas Perikanan dengan program studi S-1 Budidaya Perairan, Pemanfaatan Sumber Daya Perikanan, Teknologi Hasil Perikanan. Fakultas Kedokteran Umum dengan muatan lokal kesehatan maritim. Fakultas Ilmu Administrasi dengan program studi Ilmu Administrasi Negara dan Ilmu Administrasi Niaga. Fakultas Hukum dengan program studi ilmu hukum dengan penekanan pada hukum internasional. Fakultas Kedokteran Gigi dengan Program studi ilmu kedokteran gigi.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Arief Rahman Hakim No.150, Keputih, Kec. Sukolilo, Kota SBY, Jawa Timur 60111\n" +
                "\n" +
                "Telepon: (031) 5945864\n" +
                "\n" +
                "Website: www.hangtuah.ac.id\n" +
                "\n" +
                "Rektor: Prof Dr Ir Supartono MM CIQaR\n" +
                "\n" +
                "Didirikan: 1987\n" +
                "\n" +
                "Provinsi: Jawa Timur\n");

        textView1.add("Universitas Kartini");
        textView2.add("Jl. Raya Nginden No.19-23, Nginden Jangungan, Kec. Sukolilo, Kota SBY, Jawa Timur 60118");
        imageView.add("https://universitaskartini.ac.id/wp-content/uploads/2019/11/icon.png");
        imageviewdetail.add("https://i.ibb.co/9VjjGmg/UNIV08.jpg");
        detail.add("Universitas Widya Kartika Surabaya merupakan salah satu kampus favorit calon mahasiswa baru di Jawa Timur. Lokasinya berada di Jl. Sutorejo Prima Utara II/1, Mulyorejo, Surabaya, Provinsi Jawa Timur, Indonesia. Setiap tahunnya, kampus ini selalu ramai dipadati calon mahasiswa baru. Sebagai informasi umum, Universitas Widya Kartika Surabaya berdiri pada tanggal 14 Agustus 1986.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Raya Nginden No.19-23, Nginden Jangungan, Kec. Sukolilo, Kota SBY, Jawa Timur 60118\n" +
                "\n" +
                "Telepon: (031) 5944462\n" +
                "\n" +
                "Website: www.universitaskartini.ac.id\n" +
                "\n" +
                "Rektor: Husni Mubarok\n" +
                "\n" +
                "Didirikan: 13 Agustus 1982\n" +
                "\n" +
                "Provinsi: Jawa Timur\n");

        textView1.add("Universitas Kristen Petra");
        textView2.add("Jl. Siwalankerto No.121-131, Siwalankerto, Kec. Wonocolo, Kota SBY, Jawa Timur 60236");
        imageView.add("https://upload.wikimedia.org/wikipedia/en/thumb/4/40/Logo-Petra-Universitas-Kristen-Petra-Original.svg/1200px-Logo-Petra-Universitas-Kristen-Petra-Original.svg.png");
        imageviewdetail.add("https://i.ibb.co/dPw8LWv/UNIV09.jpg");
        detail.add("Universitas Kristen Petra adalah sebuah perguruan tinggi swasta nasional di Surabaya, Jawa Timur, Indonesia. Universitas ini didirikan pada tahun 1961 atas prakarsa dari beberapa pendiri PPPK Petra, sebuah yayasan pendidikan Kristen di Surabaya yang telah didirikan pada tahun 1951.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Siwalankerto No.121-131, Siwalankerto, Kec. Wonocolo, Kota SBY, Jawa Timur 60236\n" +
                "\n" +
                "Telepon: (031) 8439040\n" +
                "\n" +
                "Website: www.petra.ac.id\n" +
                "\n" +
                "Rektor: Prof. Dr. Ir. Djwantoro Hardjito, M.Eng\n" +
                "\n" +
                "Didirikan: 8 Agustus 1961\n" +
                "\n" +
                "Provinsi: Jawa Timur\n");

        textView1.add("Universitas PGRI Adi Buana");
        textView2.add("Jl. Dukuh Menanggal XII, Dukuh Menanggal, Kec. Gayungan, Kota SBY, Jawa Timur 60234");
        imageView.add("https://himabkunipa.files.wordpress.com/2020/01/logo-corel-unipa-sbyx.png");
        imageviewdetail.add("https://i.ibb.co/qpBy53d/UNIV10.jpg");
        detail.add("Universitas PGRI Adi Buana (UNIPA) Surabaya, merupakan penggabungan dari IKIP PGRI Surabaya dengan Sekolah Tinggi Teknik Lingkungan Adi Buana Surabaya (STTL Adi Buana Surabaya). Hasil klasterisasi Kemenristekdikti terhadap semua perguruan tinggi baik swasta maupun negeri Tahun 2018, Universitas IKIP PGRI Surabaya masuk 100 besar universitas terbaik dengan duduk di peringkat 92. Saat ini Universitas PGRI Adi Buana Surabaya memiliki 6 fakultas, 2 program studi pascasarjana, dan 1 program kebidanan, program studi yang ada seluruhnya berjumlah 22 program studi.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Dukuh Menanggal XII, Dukuh Menanggal, Kec. Gayungan, Kota SBY, Jawa Timur 60234\n" +
                "\n" +
                "Telepon: (031) 8281183\n" +
                "\n" +
                "Website: www.unipasby.ac.id\n" +
                "\n" +
                "Rektor: Marianus Subandowo\n" +
                "\n" +
                "Didirikan: 23 Juni 1998\n" +
                "\n" +
                "Provinsi: Jawa Timur\n");

        textView1.add("Universitas Surabaya");
        textView2.add("Jl. Raya Rungkut, Kali Rungkut, Kec. Rungkut, Kota SBY, Jawa Timur 60293");
        imageView.add("https://rekreartive.com/wp-content/uploads/2018/10/Logo-Ubaya-Universitas-Surabaya-PNG.png");
        imageviewdetail.add("https://i.ibb.co/nsWT1zb/UNIV11.jpg");
        detail.add("Universitas Surabaya adalah sebuah universitas di Surabaya, Jawa Timur. UBAYA merupakan penerus Universitas Trisakti Surabaya yang didirikan pada tahun 1966. Namanya diganti menjadi Universitas Surabaya pada 1968. Hari jadi UBAYA ditetapkan pada 11 Maret 1968.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Raya Rungkut, Kali Rungkut, Kec. Rungkut, Kota SBY, Jawa Timur 60293\n" +
                "\n" +
                "Telepon: (031) 2981005\n" +
                "\n" +
                "Website: www.ubaya.ac.id\n" +
                "\n" +
                "Rektor: Dr. Ir. Benny Lianto, MMBAT.\n" +
                "\n" +
                "Didirikan: 11 Maret 1968\n" +
                "\n" +
                "Provinsi: Jawa Timur\n");

        textView1.add("Universitas Sunan Giri");
        textView2.add("Jl. Brigjen Katamso II, Bandilan, Kedungrejo, Kec. Waru, Kabupaten Sidoarjo, Jawa Timur 61256");
        imageView.add("https://unsuri.ac.id/wp-content/uploads/2020/09/cropped-LOGO.png");
        imageviewdetail.add("https://i.ibb.co/hcrV9QC/UNIV12.jpg");
        detail.add("Universitas Sunan Giri Surabaya merupakan perguruan tinggi keagamaan islam swasta binaan Nahdlatul Ulama yang berawal dari adanya Universitas Nahdlatul Ulama yang didirikan pada tahun 1960.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Brigjen Katamso II, Bandilan, Kedungrejo, Kec. Waru, Kabupaten Sidoarjo, Jawa Timur 61256\n" +
                "\n" +
                "Telepon: (031) 8532477\n" +
                "\n" +
                "Website: www.unsuri.ac.id\n" +
                "\n" +
                "Rektor: H. Sudja'i SH. MH.\n" +
                "\n" +
                "Didirikan: 5 November 1960\n" +
                "\n" +
                "Provinsi: Jawa Timur\n");

        textView1.add("Universitas Wijaya Kusuma");
        textView2.add("Jl. Dukuh Kupang XXV No.54, Dukuh Kupang, Kec. Dukuhpakis, Kota SBY, Jawa Timur 60225");
        imageView.add("https://upload.wikimedia.org/wikipedia/id/a/ab/Logo-uwks.png");
        imageviewdetail.add("https://i.ibb.co/x7Vknnc/UNIV13.jpg");
        detail.add("Universitas Wijaya Kusuma Surabaya adalah salah satu perguruan tinggi swasta di Surabaya yang didirikan pada 19 Juni 1981. Universitas ini memiliki program untuk tingkat sarjana, pasca sarjana, serta diploma 3.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Dukuh Kupang XXV No.54, Dukuh Kupang, Kec. Dukuhpakis, Kota SBY, Jawa Timur 60225\n" +
                "\n" +
                "Telepon: (031) 5677577\n" +
                "\n" +
                "Website: www.uwks.ac.id\n" +
                "\n" +
                "Rektor: Prof. Dr. H. Widodo Ario Kentjono, dr. Sp.THT-KL (K),FICS\n" +
                "\n" +
                "Didirikan: 19 Juni 1980\n" +
                "\n" +
                "Provinsi: Jawa Timur\n");

        textView1.add("Universitas Muhammadiyah Surabaya");
        textView2.add("Jl. Raya Sutorejo No.59, Dukuh Sutorejo, Kec. Mulyorejo, Kota SBY, Jawa Timur 60113");
        imageView.add("https://um-surabaya.ac.id/assets/photos/3a2d433e-355e-11e8-8ac5-cced40789894_Logo%20UMSurabaya%20icon%20by%20(mascitra.com).png");
        imageviewdetail.add("https://i.ibb.co/p1tbTsS/UNIV14.jpg");
        detail.add("Universitas Muhammadiyah Surabaya merupakan salah satu perguruan tinggi swasta di bawah naungan amal usaha Muhammadiyah.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Raya Sutorejo No.59, Dukuh Sutorejo, Kec. Mulyorejo, Kota SBY, Jawa Timur 60113\n" +
                "\n" +
                "Telepon: (031) 3811966\n" +
                "\n" +
                "Website: www.um-surabaya.ac.id\n" +
                "\n" +
                "Rektor: Dr. Sukadiono, dr. MM\n" +
                "\n" +
                "Didirikan: 9 Maret 1984\n" +
                "\n" +
                "Provinsi: Jawa Timur\n");

        textView1.add("Universitas Dr. Soetomo");
        textView2.add("Jl. Semolowaru No.84, Menur Pumpungan, Kec. Sukolilo, Kota SBY, Jawa Timur 60118");
        imageView.add("https://www.unitomo.ac.id/style/images/logo-unitomo.png");
        imageviewdetail.add("https://i.ibb.co/J76WJR2/UNIV15.png");
        detail.add("Universitas Dr. Soetomo, disingkat Unitomo, adalah perguruan tinggi swasta di Indonesia, kampusnya terletak di bagian timur Surabaya, tepatnya di kecamatan Sukolilo ini berdiri pada tahun 1981.\n" +
                "\n" +
                "\n" +
                "Alamat: Jl. Semolowaru No.84, Menur Pumpungan, Kec. Sukolilo, Kota SBY, Jawa Timur 60118\n" +
                "\n" +
                "Telepon: (031) 5925970\n" +
                "\n" +
                "Website: www.unitomo.ac.id\n" +
                "\n" +
                "Rektor: Dr. Drs. Amirul Mustofa, M.Si.\n" +
                "\n" +
                "Didirikan: 1981\n" +
                "\n" +
                "Provinsi: Jawa Timur\n");

        prosesRecyclerViewAdapter();
    }


}