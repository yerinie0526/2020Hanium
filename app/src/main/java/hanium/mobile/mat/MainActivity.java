package hanium.mobile.mat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){

        Intent intent = null;


        switch (v.getId()){
            case R.id.button:
                intent = new Intent(this, BrandViewActivity.class);
                break;
        }

        if (intent != null) startActivity(intent);
    }
}
