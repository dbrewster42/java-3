import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
// import java.math.BigInteger;

class Numbers {
    static List<Integer> nums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250,
            2500);
    // static List<BigInteger> bigNums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25,
    //         250, 2500);

    public static void main(String[] args) {
        //Part I :complete the static class methods that have been set up in this Numbers class java file.  Use streams to 
        // compute the results wheever possible.
        //*************************     Part II - Numbers2.java    ****************************************** 
        System.out.println(nums);
        System.out.println(added(nums));
        System.out.println(isOdd(29));
        System.out.println(isEven(29));
        System.out.println(isPrime(29));
        System.out.println(isPrime(39));
        System.out.println(subtracted(nums));
        System.out.println(multipled(nums));
        System.out.println(divided(nums));
        System.out.println(findMax(nums));
        System.out.println(findMin(nums));
        System.out.println(Math.pow(10, 5));
        System.out.println(compare(0, 1, nums));
        // System.out.println(append(42, nums));

    }

    static boolean isOdd(int i) {
        //determine if the value at the index i is odd.  return true if yes, return false if  no.
        if (i % 2 == 0)
            return false;
        else
            return true;
    }

    static boolean isEven(int i) {
        //determine if the value at the index i is even.  return true if yes, return false if  no.
        if (i % 2 == 0)
            return true;
        else
            return false;
    }

    static boolean isPrime(int i) {
        //determine if the value at the index i is a prime number.  return true if yes, return false if no.
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0)
                return false;
        }
        return true;

    }

    static int added(List<Integer> arr) {
        // add all the elements in the list.  return the sum. 
        int sum = 0;
        for (Integer i : arr) {
            sum += i.intValue();
        }
        return sum;
        // int sum = 0;
        // // Stream.of(arr).forEach((x) -> sum = sum + x);
        // arr.stream().map((x) -> sum += x);
    }

    static int subtracted(List<Integer> arr) {
        int answer = added(arr);
        //subtract all the elements in the list. return the remainder.
        return (answer * -1);
    }

    static double multipled(List<Integer> arr) {
        //multiply all the elements in the list. and return the product.
        double product = 1;
        for (Integer i : arr) {
            product *= i.intValue();
            // if (i.intValue() == 7) {
            //     product = product / 1000;
            // }
        }
        return product;
    }

    static double divided(List<Integer> arr) {
        double answer = multipled(arr);
        // answer *= 1000;
        //multiply all the elements in the list. and return the product.
        return (1 / answer);
    }

    static int findMax(List<Integer> arr) {
        int max = arr.get(0).intValue();
        for (Integer i : arr) {
            if (i.intValue() > max)
                max = i;
        }
        return max;
    }

    static int findMin(List<Integer> arr) {
        int min = arr.get(0).intValue();
        for (Integer i : arr) {
            if (i.intValue() < min)
                min = i;
        }
        return min;
    }

    static int compare(int i, int j, List<Integer> arr) {
        //compare the values stored in the array at index position i and j.  
        //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.
        if (arr.get(i).intValue() > arr.get(j).intValue())
            return 1;
        else if (arr.get(i).intValue() < arr.get(j).intValue())
            return -1;
        else
            return 0;
    }

    static int append(int n, List<Integer> arr) {
        //add a new value to the values list. return that value after adding it to the list.
        Integer iInteger = Integer.valueOf(n);
        arr.add(iInteger);
        return n;
    }

}
