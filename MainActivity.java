package example.com.prince.demophone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNum = findViewById(R.id.tvNum);

        if(getIntent().getData()!=null)
        {
            tvNum.setText(getIntent().getData().toString());
        }
        else
        {
            tvNum.setText("No Data Received.");
        }
    }
}
