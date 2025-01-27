package SoftUni;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> guests = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayList::new));
        String input = sc.nextLine();
        while (!input.equals("Party!")){
            Predicate<String> predicate = null;
            String condition = input.split("\\s+")[2];
            if(input.contains("Length")){
                predicate = x -> x.length() == Integer.parseInt(condition);
            }else if(input.contains("StartsWith")){
                predicate = x -> x.startsWith(condition);
            }else{
                predicate = x -> x.endsWith(condition);
            }

            if(input.contains("Remove")){
                ArrayList<String> toRemove = new ArrayList<>();
                for (String guest : guests) {
                    if(predicate.test(guest)){
                        toRemove.add(guest);
                    }
                }
                guests.removeAll(toRemove);
            }else{
                ArrayList<String> toAdd = new ArrayList<>();
                for (String guest : guests) {
                    if(predicate.test(guest)){
                        toAdd.add(guest);
                    }
                }
                guests.addAll(toAdd);
            }

            input = sc.nextLine();
        }

        if(guests.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else{
            System.out.println(guests.stream().sorted().collect(Collectors.toCollection(ArrayList::new)).toString().replaceAll("([\\[\\]])", "") + " are going to the party!");
        }

    }
}