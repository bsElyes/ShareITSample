package workshop.com.abcd.Activities;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import workshop.com.abcd.Fragments.HelloFragment;
import workshop.com.abcd.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new HelloFragment());
        fragmentTransaction.commitAllowingStateLoss();

    }
}
