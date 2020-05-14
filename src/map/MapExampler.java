package map;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MapExampler {
    public static void main(String[] args) {
        List<String> users = new LinkedList<>();
        users.add("Вася");
        users.add("Миша");
        users.add("Петя");

//        for (String user : users) {
//            if(user.startsWith("В")) {
//                users.remove(user);
//            }
//        }

//        Iterator<String> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            iterator.remove();
//        }
        System.out.println(users);
    }
}
