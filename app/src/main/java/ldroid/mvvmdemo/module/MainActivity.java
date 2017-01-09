package ldroid.mvvmdemo.module;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ldroid.mvvmdemo.R;
import ldroid.mvvmdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding mMainBinding;
    private MainViewModel mMainViewModel ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }



    public void reqExpress(View v){
        mMainViewModel = new MainViewModel() ;
        mMainViewModel.reqExpress("shentong", "123123");
    }
}
