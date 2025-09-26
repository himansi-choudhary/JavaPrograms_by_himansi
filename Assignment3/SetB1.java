package assignment3;

import java.util.*;

public class SetB1 {
    public static void main(String[] args) {
        // Initial LinkedList
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        // i. Display using Iterator
        System.out.println("Colors using Iterator:");
        Iterator<String> it = colors.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ii. Display in reverse using ListIterator
        System.out.println("\nColors in reverse order using ListIterator:");
        ListIterator<String> lit = colors.listIterator(colors.size());
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        // iii. Create another list with pink and green
        List<String> newColors = Arrays.asList("pink", "green");

        // Find index of "yellow" to insert before it
        int index = colors.indexOf("yellow");
        if (index != -1) {
            colors.addAll(index, newColors);
        } else {
            System.out.println("Yellow not found in the list!");
        }

        // Display list after insertion
        System.out.println("\nList after inserting pink and green between blue and yellow:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
