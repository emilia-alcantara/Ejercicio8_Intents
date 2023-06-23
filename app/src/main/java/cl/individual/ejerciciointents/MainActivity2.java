package cl.individual.ejerciciointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "MainActivity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initListener();
    }

    private void initListener() {
        Button botonUrl = findViewById(R.id.botonPaginaWeb);
        Button botonVolver = findViewById(R.id.botonAtras);

        botonUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irPagWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html"));
                startActivity(irPagWeb);
            }
        });

        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
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