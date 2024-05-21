import enums.Person;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        personSet.add(Person.SASHA1);
        personSet.add(Person.SASHA2);
        personSet.add(Person.SASHA3);
        personSet.add(Person.SASHA4);
        personSet.add(Person.SASHA5);
        personSet.add(Person.SASHA6);
        

        Map<String, Integer> occupationAndSalary = new HashMap<>(); //[должность:сумма зарплат]
        Map<String, Integer> occupationAndQuantity = new HashMap<>(); //[должность:кол-во]
        Map<String, Integer> occupationAndAverSalary = new HashMap<>(); //[должность:средняя зарплата]

        for (Person occup : personSet) { //добавление в occupationAndSalary [должность:сумма зарплат]
            if(!occupationAndSalary.containsKey(occup.getOccupation())){
                occupationAndSalary.put(occup.getOccupation(), occup.getSalary());
            }
            else{
                occupationAndSalary.put(occup.getOccupation(), occupationAndSalary.get(occup.getOccupation())+occup.getSalary());
            }
        }
        System.out.println("Сумма зарплат: "+occupationAndSalary);


        for (Person occup : personSet) { //добавление в occupationAndQuantity [должность:количество]
            if(!occupationAndQuantity.containsKey(occup.getOccupation())){
                occupationAndQuantity.put(occup.getOccupation(), 1);
            }
            else{
                occupationAndQuantity.put(occup.getOccupation(), occupationAndQuantity.get(occup.getOccupation())+1);
            }
        }
        System.out.println("Кол-во: "+occupationAndQuantity);

        for (Map.Entry<String, Integer> entry : occupationAndSalary.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            occupationAndAverSalary.put(key, value/occupationAndQuantity.get(key));
        }

        System.out.println("Средняя зарплата: "+occupationAndAverSalary);


    }
}