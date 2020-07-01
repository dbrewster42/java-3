import java.util.Arrays;
import java.util.List;

class Numbers2 {
    static List<Integer> nums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250,
            2500);

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

        lambdaAdd lambda = (list) -> {
            int sum = 0;
            for (Integer i : list) {
                sum += i.intValue();
            }
            return sum;
        };
        System.out.println("added : " + lambda.added(nums));

        lambdaSubtract sub = list -> {
            int sum = 0;
            for (Integer i : list) {
                sum -= i.intValue();
            }
            return sum;
        };
        System.out.println("subtract : " + sub.subtract(nums));

        lambdaFindMax find = arr -> {
            int max = arr.get(0).intValue();
            for (Integer i : arr) {
                if (i.intValue() > max)
                    max = i;
            }
            return max;
        };
        System.out.println("Max : " + find.max(nums));

        lambdaFindMin find2 = arr -> {
            int min = arr.get(0).intValue();
            for (Integer i : arr) {
                if (i.intValue() < min)
                    min = i;
            }
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
        double multiply(List<Integer> list);
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
        double divide(List<Integer> list)
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