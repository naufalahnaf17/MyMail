package app.android.mymail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    DataAdapter adapter;
    private ArrayList<Mail> listMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        adapter = new DataAdapter(listMail);
        rv=(RecyclerView)findViewById(R.id.myMail);
        RecyclerView.LayoutManager layout = new LinearLayoutManager(MainActivity.this);
        rv.setLayoutManager(layout);
        rv.setAdapter(adapter);

    }

    private void addData() {
        listMail = new ArrayList<>();
        listMail.add(new Mail("Rudi","Belajar Bersama" , "Hallo Ayo Kita Belajar " , "11:20 AM" , R.drawable.ic_school_black_24dp));
        listMail.add(new Mail("Google","Lowongan Kerja" , "Bekerja di Google Yuk" , "08:45 AM" , R.drawable.ic_assignment_ind_black_24dp));
        listMail.add(new Mail("Hire.Co","Informasi" , "Lihat Internet Lebih Luas" , "12:00 AM" , R.drawable.ic_public_black_24dp));
        listMail.add(new Mail("Jordan","Liburan Bersama","Mari kita liburan ke Bali","04:32pm",R.drawable.ic_beach_access_black_24dp));
        listMail.add(new Mail("Samsul","Latihan Futsal","Latihan futsal hari ini","01.00pm",R.drawable.ic_person_outline_black_24dp));
        listMail.add(new Mail("Budiman","Berfoto Bersama","Mari kita berfoto di Taman","06:02am",R.drawable.ic_photo_camera_black_24dp));
        listMail.add(new Mail("Gatot","Berenang Bersama","Mari berenang di kali","04:50pm",R.drawable.ic_pool_black_24dp));

    }
}
