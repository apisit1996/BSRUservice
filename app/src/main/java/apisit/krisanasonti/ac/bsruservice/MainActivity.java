package apisit.krisanasonti.ac.bsruservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        add Fragment to Activity
        getSupportFragmentManager().beginTransaction().add(R.id.layoutMainFragment, new MainFragment()).commit();




    }   //Main Method

}   //Main Class
