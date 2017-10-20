package br.com.wapp.cursoandroid.wapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import br.com.wapp.cursoandroid.wapp.R;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference dbFireBase = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbFireBase.child("pontos").setValue("100");
    }
}
