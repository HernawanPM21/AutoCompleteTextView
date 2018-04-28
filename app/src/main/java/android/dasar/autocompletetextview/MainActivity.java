package android.dasar.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView actv;
    Button lihat;
    String [] nKota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actv = findViewById(R.id.actv_kota);
        lihat = findViewById(R.id.btn_lihat);
        nKota=getResources().getStringArray(R.array.nama_kota);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nKota);
        actv.setAdapter(adapter);
        lihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, actv.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
