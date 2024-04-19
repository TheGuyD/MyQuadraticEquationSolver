package il.theguyd.myquadraticequationsolver;

import android.app.Activity;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.util.ArrayList;

import il.theguyd.myquadraticequationsolver.databinding.ActivityMainBinding;

public class QuadraticEquation extends BaseObservable {
    private String a;
    private String b;
    private String c;

    private String x1;
    private String x2;

    private ActivityMainBinding activityMainBinding;

    public QuadraticEquation(ActivityMainBinding activityMainBinding) {
        this.activityMainBinding = activityMainBinding;
    }

    public QuadraticEquation() {

    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
        notifyPropertyChanged(BR.a);
    }

    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
        notifyPropertyChanged(BR.b);
    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
        notifyPropertyChanged(BR.c);
    }

    @Bindable
    public String getX1() {
        return x1;
    }

    public void setX1(String x1) {
        this.x1 = x1;
        notifyPropertyChanged(BR.x1);
    }

    @Bindable
    public String getX2() {
        return x2;
    }

    public void setX2(String x2) {
        this.x2 = x2;
        notifyPropertyChanged(BR.x2);
    }

    public void solveEquation() {
        int a = Integer.parseInt(this.a);
        int b = Integer.parseInt(this.b);
        int c = Integer.parseInt(this.c);

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            setX2(String.valueOf(b - Math.sqrt(discriminant) / (2 * a)));
            setX1(String.valueOf(b + Math.sqrt(discriminant) / (2 * a)));
        } else if (discriminant == 0) {
            setX1(String.valueOf((double) b / (2 * a)));
            setX2(null);
        } else if (discriminant < 0) {
            setX1(null);
            setX2(null);
        }

    }
}
