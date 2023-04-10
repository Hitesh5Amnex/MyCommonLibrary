package com.amnex.mylibrary;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

public class HiteshCommonMethod {
    public static int addValue(Context c, ArrayList<Integer> addNumbers){
        int total=0;
        if (addNumbers.size()>0){
            for (int i=0;i<addNumbers.size();i++){
                total=total+addNumbers.get(i);

            }
            return total;
        }
        return total;
    }
    public static void showToast(Context context,String message){
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show();
    }
}
