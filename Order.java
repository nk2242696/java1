package org.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Order {
private Map<Integer,Integer> orderList=new HashMap<>();
   public Map<Integer,Integer> takeOrder()
    {
        Scanner sc=new Scanner(System.in );

        System.out.println("Enter your choices separated by comma");
        String s=sc.next();
        String arr[]=s.split(",");
        for (String str:arr)
        {
            Integer k=Integer.parseInt(str);
            Integer count = orderList.get(k);
            if (count == null) {
                orderList.put(k, 1);
            }
            else {
                orderList.put(k, count + 1);
            }
        }
        return orderList;
    }
}
