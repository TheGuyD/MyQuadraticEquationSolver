package il.theguyd.myquadraticequationsolver;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import il.theguyd.myquadraticequationsolver.databinding.ActivityMainBinding;

public class MyOnClickHandler {
    private QuadraticEquation quadraticEquation;
    private ActivityMainBinding activityMainBinding;

    public MyOnClickHandler(QuadraticEquation quadraticEquation, ActivityMainBinding activityMainBinding) {
        this.quadraticEquation = quadraticEquation;
        this.activityMainBinding = activityMainBinding;
    }

    public void onClickHandler(View view) {
        try {
            quadraticEquation.solveEquation();
        } catch (Exception e) {
            Toast.makeText(view.getContext(), "enter values in a,b,c", Toast.LENGTH_SHORT).show();
        }


    }
}
