package org.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private int i=1;
    private double  total=0;

    double tax=0;

    public double generateBill(Map<Integer,Beverages> IdCard,Map<Integer,Integer> orderList)
    {
        for (Map.Entry<Integer, Integer> entry2 : orderList.entrySet()) {
            System.out.println(i + " " + IdCard.get(entry2.getKey()).getName() + " " + entry2.getValue() +"  " +IdCard.get(entry2.getKey()).getPrice() * entry2.getValue());
            total+= IdCard.get(entry2.getKey()).getPrice() * entry2.getValue();
            tax +=(IdCard.get(entry2.getKey()).getTax()*entry2.getValue()*IdCard.get(entry2.getKey()).getPrice());
            i++;
        }
        tax=tax/100.0;
        System.out.println("Total "+total);
        return total+tax;
    }
}
