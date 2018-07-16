package org.hashmap;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class App{
    public  static  void main(String args[]){
        Cafe c=new Cafe();
        c.addBeverage(new Beverages(Type.HOT,SubType.Coffee,1,"Latte",40,18));
        c.addBeverage(new Beverages(Type.HOT,SubType.Coffee,2,"Cappucino",50,18));
        c.addBeverage(new Beverages(Type.HOT,SubType.Coffee,3,"Expresso",30,18));
        c.addBeverage(new Beverages(Type.HOT,SubType.Tea,4,"Masala",15,15));
        c.addBeverage(new Beverages(Type.HOT,SubType.Tea,5,"Black",10,15));
        c.addBeverage(new Beverages(Type.COLD,SubType.Coffee,6,"Oreo",110,18));
        c.addBeverage(new Beverages(Type.COLD,SubType.Coffee,7,"Frape",125,18));
        c.addBeverage(new Beverages(Type.COLD,SubType.ColdDrink,8,"Pepsi",45,21));
        c.addBeverage(new Beverages(Type.COLD,SubType.ColdDrink,9,"CocaCola",45,21));
        c.addBeverage(new Beverages(Type.COLD,SubType.ColdDrink,10,"Mirinda",45,21));


        Map<Integer,Beverages>  IdCard=new HashMap<>();
        for(Beverages b:c.getBeverageList())
        {
            IdCard.put(b.getid(),b);
            //System.out.println(b.getType()+b.getName());
        }

        System.out.println("MENU");
        for(Beverages b:c.getBeverageList())
        {
            System.out.println(b.getid()+"."+b.getType()+"."+b.getSubType()+"."+b.getName()+"Price   "+b.getPrice());
        }
        Order order=new Order();
        Map<Integer,Integer> orderlist=order.takeOrder();
       Bill b=new Bill();
               double total=b.generateBill(IdCard,orderlist);
        System.out.print("Net "+total);



    }

}