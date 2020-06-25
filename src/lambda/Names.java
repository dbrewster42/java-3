package lambda;

import java.util.*;

public class Names {

    public static void main(String[] args) {
        //create a list of names of at least 10 people, in the format, "firstname lastname"
    }


    String addName(String name, List<String> namesList) {
        //add a name to the namesList
        return "";
    };

    List<String> sortNames(ArrayList<String> names, Stringable sorter) {
        return names;
    }

    String flipName(String name, List<String> names) {
        //If the name is not in the names list, add it to the list.
        // Change "firstname lastname" to "lastname, firstname".
        return "";
    }

    String capsFirst(String name, List<String> names) {
    //If the name is not in the names list, add it to the list.
    //Capitalize the first letter of the first and last name.
    //If the last name starts with "Mc", capitalize the third letter
        return "";
    };

    String lowerRest(String name, List<String> names) {
    //If the name is not in the names list, add it to the list.
    //make sure all letters besides the first letter are lowercased.
        return "";
    }

    List<String> cleanNames(List<String> names) {
        //run all transform methods on the list of names.
        return names;
    }

}


//@FunctionalInterface
interface Stringable {

}
