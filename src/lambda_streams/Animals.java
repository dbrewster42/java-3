// package lambda_streams;

import java.util.*;
import java.util.stream.Collectors;

class Animals {
    //This class will be using streams.
    static List<String> animals = Arrays.asList("peacoCK", "rabbit", "chiwawa", "OranguTAN", "vipeR", "cobra", "paNDa",
            "bUffalo", "DeeR", "maLLard");

    public static void main(String[] args) {
        System.out.println("original animals : " + animals);
        animals = lowerFirst(animals, true);
        System.out.println(animals);
        //clean up the animals array by using the capsFirst() method. follow instructions in the method definition. 
        List<String> cleaned = capsFirst(animals, false);
        System.out.println(cleaned);

        //do not modify these addAnimal() method invocations
        addAnimal("rEIndeeR");
        addAnimal("Platypus");
        addAnimal("frOg");
        addAnimal("lEOpArD");
        //---------------------------------------

        List<String> animals2 = lowerFirst(animals, false);
        System.out.println(animals2);

        animals = capsFirst(animals, true);
        System.out.println(animals);

        flipAnimals(true);
        System.out.println(" ");
        flipAnimals(false);
        System.out.println(" ");

        animals = sortAnimals(true);
        System.out.println(animals);

    }

    static List<String> capsFirst(List<String> animaList, boolean mutate) {
        //clean up the animals list so that the first letter is capitalized, and all the other letters are lowercased. Use a stream to accomplish
        // this task.  Also, the 2nd parameter of this function is a boolean.  use this boolean 'flag' to determine whether or not to 'mutate' the
        // original animals array stored as a static class field.  if the flag is set to 'true', mutate the animals and return the animals out of
        // the function.  if it is false, create a copy of the animals, perform your stream operations on the copy, and return the copy of animals
        // out of the function, WITHOUT modifying the original animals array.  
        if (mutate) {
            animals = animaList.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                    .collect(Collectors.toList());
        } else {
            List<String> newList = animaList;
            animals = newList.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                    .collect(Collectors.toList());
        }
        return animals;

        // if (mutate) {
        //     animaList.stream().map(s -> {
        //         String cF = "";
        //         cF += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        //         return cF;
        //     }).collect(Collectors.toList());
        //     for (String j : animaList) {
        //         System.out.println(j);
        //     }
        //     return animaList;
        // } else {
        //     List<String> animalCopy = new ArrayList<String>();
        //     for (String i : animaList) {
        //         animalCopy.add(i);
        //     }
        //     animalCopy.stream().map(s -> {
        //         String cF;
        //         cF = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        //         return cF;
        //     }).collect(Collectors.toList());
        //     return animalCopy;
        // }

        // return animals;
    }

    static String addAnimal(String animal) {
        //add an animal to the animal list.
        List<String> newAnimals = new ArrayList<>(animals);
        newAnimals.add(animal);
        animals = newAnimals;
        return animal;
    };

    static List<String> lowerFirst(List<String> animaList, boolean mutate) {
        //lowercase the first letter, and uppercase the rest of the letters, using streams.  Also, depending on the value of the boolean flag
        // 'mutate', mutate the original animals list, or perform your stream operations on a 'copy' of the animals list.  return the list 
        // of hte function in both cases.  
        if (mutate) {
            animals = animaList.stream().map(s -> s.substring(0, 1).toLowerCase() + s.substring(1).toUpperCase())
                    .collect(Collectors.toList());
        } else {
            List<String> newList = animaList;
            animals = newList.stream().map(s -> s.substring(0, 1).toLowerCase() + s.substring(1).toUpperCase())
                    .collect(Collectors.toList());
        }
        return animals;

        // if (mutate) {
        //     animaList.stream().map(a -> {
        //         String newAnimal;
        //         newAnimal = a.substring(0, 1).toLowerCase() + a.substring(1).toUpperCase();
        //         return newAnimal;
        //     }).collect(Collectors.toList());
        //     return animaList;
        // } else {
        //     List<String> animalCopy = new ArrayList<String>();
        //     animaList.stream().map(a -> {
        //         String newAnimal;
        //         newAnimal = a.substring(0, 1).toLowerCase() + a.substring(1).toUpperCase();
        //         animalCopy.add(newAnimal);
        //         return animalCopy;
        //     }).collect(Collectors.toList());
        //     return animaList;
        // }

    }

    static List<String> flipAnimals(boolean mutate) {
        //reverse the order of the animals in the animal list.  If the booleaen parameter is true, reverse the static animals array list by 
        //mutating the array.  if the mutate boolean is false, flip a 'copy' of the animals list, then return that list of flipped animals,
        // WITHOUT mutating the static animals array. return the flipped list in both cases.

        List<String> instructions = Arrays.asList("Flip", "the", "animals", "list", ".", " ", "Mutate", "the",
                "animals", "only", "if", "flag", "true");
        if (mutate) {
            Collections.reverse(instructions);
            for (String j : instructions) {
                System.out.print(j + " ");
            }
            return instructions;
        } else {
            List<String> instructionsCopy = new ArrayList<String>();
            for (int i = instructions.size() - 1; i >= 0; i--) {
                String newInstruction = instructions.get(i);
                System.out.print(newInstruction + " ");
                instructionsCopy.add(newInstruction);
            }
            return instructionsCopy;
        }

    }

    static List<String> sortAnimals(boolean mutate) {
        //sort the animals in alphabetical order.  If the booleaen parameter is true, mutating the animals list.  if the mutate boolean
        // is false, sort a 'copy' of the animals list, then return that list of sorted animals, WITHOUT mutating the static animals array.
        // return the sorted list in both cases.
        if (mutate) {
            Collections.sort(animals);
            return animals;
        } else {
            List<String> animalCopy = new ArrayList<String>();
            for (String i : animals) {
                animalCopy.add(i);
            }
            return animalCopy;
        }

    }

    static void otherMethod() {
        animals.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

}
