package com.example.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variabel;
    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //panggil variabel berdasar id
        TextNama=(EditText)findViewById(R.id.TxtNama);
        Hasil=(TextView)findViewById(R.id.Lbl_Nama);
    }

    //Buat Method Tampilkan Nama Sesuai Dengan Property Onclick pada button
    public void TampilNama(View v){
        Hasil.setText("Nama anda: "+TextNama.getText());
    }
}
