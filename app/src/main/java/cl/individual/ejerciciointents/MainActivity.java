package cl.individual.ejerciciointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "----onCreate----");

        initListeners();
    }

    private void initListeners() {
        Button botonSegundaActividad = findViewById(R.id.botonSegundaActividad);

        botonSegundaActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "----onStart----");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "----onResume----");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "----onPause----");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "----onStop----");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "----onDestroy----");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "----onRestart----");
    }
}