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

    }
}
