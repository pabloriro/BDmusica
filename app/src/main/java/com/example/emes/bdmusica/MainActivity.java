package com.example.emes.bdmusica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button all, delete;
    EditText editText;
    ListView listView;
    List<producto> productoList;
    DataSource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        all = findViewById(R.id.all);
        delete = findViewById(R.id.delete);
        editText = findViewById(R.id.editText);
        listView = findViewById(R.id.listview);

        dataSource = new DataSource(this);
        dataSource.open();
        createData();

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void createData()
    {
        dataSource.create(new producto(1, "Metallica", "Master of Puppets", "Master of Puppets"));
        dataSource.create(new producto(2, "Metallica", "Master of Puppets", "Orion"));
        dataSource.create(new producto(3, "Megadeth", "Train of Consecuences", "Addicted to Chaos"));
        dataSource.create(new producto(4, "Megadeth", "Countdown to Extincion", "Arquiteture of Agression"));
        dataSource.create(new producto(5, "The Smashing Pumpkins", "Adore", "Perfect"));
        dataSource.create(new producto(6, "The Smashing Pumpkins", "Adore", "Tear"));
        Log.i("LOGTAG", "DATO RECIBIDO" );

    }
}
