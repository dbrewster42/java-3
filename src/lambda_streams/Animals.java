import java.util.*;
import java.util.stream.Collectors;

class Animals {
    //This class will be using streams.
    static List<String> animals = Arrays.asList("peacoCK", "rabbit", "chiwawa", "OranguTAN", "vipeR", "cobra", "paNDa",
            "bUffalo", "DeeR", "maLLard");

    public static void main(String[] args) {
        System.out.println("original animals : " + animals);

        lambdaUpperFirst doIt = animaList -> {
            animals = animaList.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                    .collect(Collectors.toList());
            return animals;
        };
        List<String> lambdaAnimal = capsFirst2(animals, doIt);

        // System.out.println(lambdaAnimal);

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

        lambdaLower backwards = animaList -> {
            animals = animaList.stream().map(s -> s.substring(0, 1).toLowerCase() + s.substring(1).toUpperCase())
                    .collect(Collectors.toList());
            return animals;
        };
        lambdaAnimal = lowerFirst2(animals, backwards);
    }

    static List<String> capsFirst2(List<String> animaList, lambdaUpperFirst doIt) {
        System.out.println("Uppercased lambda: " + doIt.upper(animaList));
        return animaList;
    }

    static List<String> lowerFirst2(List<String> animaList, lambdaLower backwards) {
        System.out.println("Lowercase lambda: " + backwards.lower(animaList));
        return animaList;
    }

    static List<String> capsFirst(List<String> animaList, boolean mutate) {
        if (mutate) {
            animals = animaList.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                    .collect(Collectors.toList());
        } else {
            List<String> newList = new ArrayList<String>();
            for (String j : animaList) {
                newList.add(j);
            }
            animals = newList.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                    .collect(Collectors.toList());
        }
        return animals;
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
            List<String> newList = new ArrayList<String>();
            for (String j : animaList) {
                newList.add(j);
            }
            animals = newList.stream().map(s -> s.substring(0, 1).toLowerCase() + s.substring(1).toUpperCase())
                    .collect(Collectors.toList());
        }
        return animals;
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

    interface lambdaUpperFirst {
        List<String> upper(List<String> list);
    }

    interface lambdaLower {
        List<String> lower(List<String> list);
    }

}
