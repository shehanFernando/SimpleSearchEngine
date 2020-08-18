package search;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Person insert(){
        Scanner s = new Scanner(System.in);

        String line = s.nextLine();
        String [] array =line.split(" ");
        int len = array.length;

        if(len  == 2){
            return new Person(array[0],array[1]);
        }

        else if(len ==1){
            return new Person(array[0]);
        }

        else{
            return new Person(array[0],array[1],array[2]);
        }

    }

    public static boolean isIn(Person p, String q){
        if(p.getFirst().toLowerCase().equals(q) || p.getLast().toLowerCase().equals(q) ||p.getEmail().toLowerCase().equals(q))
            return true;
        else
        return false;
    }

    public static String Csearch(ArrayList<Person> p, String q){
        q =  q.toLowerCase();
        String s="";
        int counter = 0;
        for(Person i:p){
            if(isIn(i,q)){
                s += i.toString()+"\n";
                counter++;
            }
        }
        if(counter == 0 )
            return "No matching people found.";

        else
        return s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of people: \n");
        int nPeople = s.nextInt();
        ArrayList<Person> list = new ArrayList<>();

        System.out.println("Enter all people:");
        for(int i=0;  i  <nPeople;i++){
            list.add(insert());
        }
        System.out.print("Enter the number of search queries:");
        int query = s.nextInt();

        for(int i = 0; i < query; i++){
            System.out.println("Enter data to search people:");
            String q = s.nextLine();
            System.out.println(Csearch(list,q)); //issue is here
        }


    }
}
