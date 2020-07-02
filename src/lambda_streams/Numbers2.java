import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class Numbers2 {
    static List<Integer> nums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250,
            2500);
    static List<Integer> nums2 = Arrays.asList(2, 5, 5, 1, 3, 7, 6, 1, 2, 3);

    public static void main(String[] args) {
        System.out.println(nums);
        //Part II - refactor all of the class methods to accept lambda expressions. You can put the lambda functions directly inside
        // the method calls, or defined them first, then pass them into the methods. give them the same names as the static methods,
        // but add the word 'lambda' in front of every lambda function:
        /* e.g.
        
        added(() -> {});
        
        OR
        
        lambdaAdd = () -> {};
        added(lambdaAdd);
        
        isOdd(() -> {});
        
        OR
        
        lambdaOdd = () -> {};
        isOdd(lambdaOdd);
        etc...
        
        */
        lambdaIsOdd odd = (i) -> {
            if (i % 2 == 0)
                return false;
            else
                return true;
        };
        System.out.println("Is 29 odd? " + odd.odd(29));
        int j = 29;
        int k = 39;

        lambdaIsEven lam = i -> {
            if (i % 2 == 0)
                return true;
            else
                return false;
        };
        System.out.println("Is " + j + " even? " + lam.even(j));

        lambdaIsPrime pri = i -> {
            for (int n = 2; n <= i / 2; n++) {
                if (i % n == 0)
                    return false;
            }
            return true;
        };
        System.out.println("Is " + j + " a prime? " + pri.prime(j));
        System.out.println("Is " + k + " a prime? " + pri.prime(k));

        lambdaAdd lambda = (nums) -> {
            // Integer sum = nums.stream().reduce(0, Integer::sum);
            Integer sum = nums.stream().reduce(0, (a, b) -> a + b);
            return sum;
        };
        System.out.println("added : " + lambda.added(nums));

        lambdaSubtract sub = (nums) -> {
            Integer result = nums.stream().reduce(0, (a, b) -> a - b);
            return result;
        };
        System.out.println("subtract : " + sub.subtract(nums));

        lambdaMultipled mult = (nums2) -> {
            Integer multipled = nums2.stream().reduce(1, (a, b) -> a * b);
            return multipled;
        };
        System.out.println("multiplied : " + mult.multiply(nums2));

        lambdaFindMax find = arr -> {
            Integer max = (int) Collections.max(nums);
            return max;
        };
        System.out.println("Max : " + find.max(nums));

        lambdaDivide div = nums2 -> {
            double division = nums2.stream().reduce(756000, (a, b) -> a / b);
            return division;
        };
        System.out.println("756000 divided by rest of list : " + div.divide(nums2));
        System.out.println(
                "I can't figure out how to get multiply or divide to work with the stream so I made a new list. I solved it the right way in the other file(with no stream)");

        lambdaFindMin find2 = arr -> {
            Integer min = (int) Collections.min(nums);
            return min;
        };
        System.out.println("Min : " + find2.min(nums));
    }

    interface lambdaAdd {
        int added(List<Integer> list);
    }

    interface lambdaIsOdd {
        boolean odd(int i);
    }

    interface lambdaIsEven {
        boolean even(int i);
    }

    interface lambdaIsPrime {
        boolean prime(int i);
    }

    interface lambdaSubtract {
        int subtract(List<Integer> list);
    }

    interface lambdaMultipled {
        int multiply(List<Integer> list);
    }

    // static int multipled(List<Integer> arr) {
    //     //multiply all the elements in the list. and return the product.
    //     int product = 1;
    //     for (Integer i : arr) {
    //         product *= i.intValue();
    //     }
    //     return product;
    // }
    interface lambdaDivide {
        double divide(List<Integer> list);
    }

    // static int divided(List<Integer> arr) {
    //     int answer = multipled(arr);
    //     //multiply all the elements in the list. and return the product.
    //     return (1 / answer);
    // }
    interface lambdaFindMax {
        int max(List<Integer> list);
    }

    interface lambdaFindMin {
        int min(List<Integer> list);
    }

    interface compare {
        int comp(List<Integer> list);
    }

    interface append {
        Integer add(List<Integer> list);
    }

}