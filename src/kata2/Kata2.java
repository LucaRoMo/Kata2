package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Rosa","Pepe","Maria","Pepe","Pepe","Rosa"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        for (Map.Entry<String,Integer> entry : histogr.entrySet()) {

            System.out.println ("M1: Key =" + entry.getKey () + ", Value = " + entry.getValue());

        }
    }
    
}
