package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by jiang on 16/7/11.
 */
public class Random {
    public static void main(String [] args){
        List<Double> sortOrignalRates = new ArrayList<Double>();
        List<Double> sortOrignalRates2 = new ArrayList<Double>();
        for(int i=0;i<100;i++) {
            double nextDouble = 0.1;
            sortOrignalRates.add(nextDouble);
        }
        double sumRate = 0;
        for(double dou : sortOrignalRates){
            sumRate += dou;
        }
        System.out.println(sumRate);
        double tempSumRate = 0;
        for(double dou : sortOrignalRates){
            tempSumRate += dou;
            sortOrignalRates2.add(tempSumRate/sumRate);
            System.out.println(tempSumRate/sumRate);
        }
        Collections.sort(sortOrignalRates2);
        for(int i=0 ; i < 100 ; i ++) {
            double nextDouble = Math.random();
            int indexOf = sortOrignalRates2.indexOf(nextDouble);
            System.out.println(nextDouble);
            System.out.println(indexOf);
            if(indexOf>0)
                break;
        }
    }
}
