package com.company;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
   /*Car деген класс тузунуз (Id, номер авто)
Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
HashMap тузунуз ключ - машина, маани - машинанын данныйлары
HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.*/
    public static void main(String[] args) {
        Map<Car, InfoOfCar>map = new HashMap<>();
        map.put(new Car(777,"01KG111NNN"),new InfoOfCar(2022,"maybach",70000,"black"));
        map.put(new Car(935,"01KG239IDH"),new InfoOfCar(2009,"TOYOTA",9500,"YELLOW"));
        map.put(new Car(123,"01KG529OEJ"),new InfoOfCar(2005,"HONDA",13000,"WHITE"));
        map.put(new Car(123,"01KG987QPM"),new InfoOfCar(2003,"VOLKSVAGEN",2002,"PINK"));
        map.put(new Car(123,"01KG989ADI"),new InfoOfCar(2021,"PORCH",50000,"black"));
        map.put(new Car(123,"01KG789ASD"),new InfoOfCar(2005,"LADA",7500,"brown"));
        map.put(new Car(123,"01KG999BMW"),new InfoOfCar(2020,"BMW",20000,"black"));
        map.put(new Car(123,"02KG243JIR"),new InfoOfCar(2000,"MITSUBISHI",7000,"red"));


        for(Map.Entry s : map.entrySet()) {
            System.out.println(s.getKey()+" "+s.getValue());
        }




    }

}
