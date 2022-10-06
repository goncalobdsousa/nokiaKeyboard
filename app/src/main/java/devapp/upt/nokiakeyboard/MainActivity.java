package devapp.upt.nokiakeyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View v){

        Button Brecebido = (Button) v;
        String BtnText = Brecebido.getText().toString();
        TextView testarView = findViewById(R.id.parcelaEscrever);
        testarView.setText(BtnText);
    }
}