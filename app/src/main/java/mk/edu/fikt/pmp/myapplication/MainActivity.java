package mk.edu.fikt.pmp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Klik(View view) {

        Button batanot = (Button) findViewById(R.id.btn2);
        batanot.setText("proba");
    }

    public void zgolemi(View view) {

        ImageView sliceto = (ImageView) findViewById(R.id.imageViewto);
        //sliceto.setVisibility(View);
        sliceto.setImageDrawable();
    }
}
