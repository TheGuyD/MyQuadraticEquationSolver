package il.theguyd.myquadraticequationsolver;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import il.theguyd.myquadraticequationsolver.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private QuadraticEquation quadraticEquation;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup data binding
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //initialize quadraticEquation Object
        quadraticEquation = new QuadraticEquation();

        //initialize onClickHandler
        MyOnClickHandler myOnClickHandler = new MyOnClickHandler(quadraticEquation, activityMainBinding);

        //bind variables (bind the data)
        activityMainBinding.setQuadraticEquation(quadraticEquation);
        activityMainBinding.setMyOnClickHandler(myOnClickHandler);


    }
}