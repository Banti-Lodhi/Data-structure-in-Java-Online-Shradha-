import java.lang.Character.Subset;
import java.util.ArrayList;

public class Recursion3 {
    /*
     * public static void printPerm(String str, String permutation) {
     * if(str.length() == 0){
     * System.out.println(permutation);
     * System.out.println();
     * return;
     * }
     * for(int i=0; i<str.length(); i++){
     * char currchar = str.charAt(i);
     * //abc -> ab
     * String newStr = str.substring(0, i) + str.substring(i+1);
     * printPerm(newStr, permutation+currchar);
     * }
     * }
     * public static void main(String[] args) {
     * 
     * String str = "ab";
     * 
     * printPerm(str, " ");
     * }
     * 
     * 
     * 
     * public static int countPaths(int i, int j, int n, int m) {
     * 
     * if (i == n || j == m) {
     * 
     * return 0;
     * }
     * if (i == n - 1 && j == m - 1) {
     * return 1;
     * }
     * // downwards
     * int downPaths = countPaths(i + 1, j, n, m);
     * // rightpaths
     * int rightPaths = countPaths(i, j + 1, n, m);
     * return downPaths + rightPaths;
     * }
     * 
     * public static void main(String[] args) {
     * int n=3, m=3;
     * 
     * int totalPaths = countPaths(0, 0, n, m);
     * System.out.println(totalPaths);
     * }
     *
     * 
     * public static int placeTiles(int n, int m) {
     * 
     * if (n == m) {
     * return 2;
     * }
     * if (n < m) {
     * return 1;
     * 
     * }
     * 
     * int VertPlace = placeTiles(n - m, m);
     * int Horzplace = placeTiles(n - 1, m);
     * return VertPlace + Horzplace;
     * }
     * 
     * public static void main(String[] args) {
     * 
     * int n = 12, m = 10;
     * 
     * System.out.println(placeTiles(n, m));
     * }
     *

    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }
        // single guest
        int ways1 = callGuests(n - 1);
        int ways2 = (n - 1) * callGuests(n - 2);
        return ways1 + ways2;

    }

    public static void main(String[] args) {

        int n = 4;
        System.out.println(callGuests(n));
    }

    */

    public static void PrintSubset(ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if(n == 0){
            PrintSubset(subset);
            return;
        }
        //add to
        subset.add(n);
        findSubsets(n-1, subset);
        //not add to
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
        }

        public static void main(String[] args) {

            int n=3;
            findSubsets(n, new ArrayList<Integer> ());
        }    
    }