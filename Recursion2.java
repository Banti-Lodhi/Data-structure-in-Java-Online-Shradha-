import java.util.HashSet;

public class Recursion2 {
    /*
     * public static void towerOfHonoi(int n, String src, String helper, String
     * dest) {
     * if(n == 1){
     * System.out.println("transfer disk " + n + " form " + src + " to " + dest);
     * return;
     * }
     * towerOfHonoi(n-1, src, dest, helper);
     * System.out.println("transfer disk " + n + " form " + src + " to " + dest);
     * towerOfHonoi(n-1, helper, src, dest);
     * }
     * public static void main(String[] args) {
     * 
     * int n = 1;
     * 
     * towerOfHonoi(n, "S", "H", "D");
     * 
     * }
     * 
     * 
     * public static void printRev(String str, int idx) {
     * 
     * if(idx == 0){
     * System.out.println(str.charAt(idx));
     * return;
     * }
     * 
     * System.out.print(str.charAt(idx));
     * printRev(str, idx-1);
     * }
     * 
     * public static void main(String[] args) {
     * 
     * String str = "Ruchi";
     * 
     * printRev(str, str.length() - 1);
     * 
     * }
     * public static int first = -1;
     * public static int last = -1;
     * 
     * public static void findOccurence(String str, int idx, char element) {
     * 
     * if(idx == str.length()){
     * System.out.println(first);
     * System.err.println(last);
     * return;
     * }
     * 
     * char currChar = str.charAt(idx);
     * if(currChar == element ){
     * if(first == -1){
     * first = idx;
     * }else{
     * last = idx;
     * }
     * }
     * findOccurence(str, idx+1, element);
     * }
     * public static void main(String[] args) {
     * String str = "abaacdaeaah";
     * 
     * findOccurence(str, 0, 'b');
     * 
     * }
     *
     * 
     * public static boolean isSorted(int arr[], int idx) {
     * if (idx == arr.length - 1) {
     * return true;
     * }
     * 
     * if (arr[idx] < arr[idx + 1]) {
     * // array is sorted till now
     * return isSorted(arr, idx+1);
     * } else {
     * return false;
     * }
     * }
     * 
     * public static void main(String[] args) {
     * 
     * int arr[] = { 1, 2, 2, 4, 5 };
     * 
     * System.out.println(isSorted(arr, 0));
     * }
     * }
     * /
     * 
     * public static void moveAllx(String str, int idx, int count, String newString)
     * {
     * 
     * if(idx == str.length()) {
     * for(int i=0; i<count; i++) {
     * newString += 'x';
     * }
     * System.out.println(newString);
     * return;
     * }
     * 
     * char currChar = str.charAt(idx);
     * if(currChar == 'x') {
     * count++;
     * 
     * moveAllx(str, idx+1, count, newString);
     * }else {
     * newString += currChar;
     * moveAllx(str, idx+1, count, newString);
     * }
     * }
     * public static void main(String[] args) {
     * 
     * String str = "bxcxdsx";
     * 
     * moveAllx(str, 0, 0, " ");
     * }
     * }
     *
     * 
     * public static boolean[] map = new boolean[26];
     * 
     * public static void removeDuplicates(String str, int idx, String newString) {
     * 
     * if(idx == str.length()) {
     * System.out.println(newString);
     * return;
     * }
     * char currChar = str.charAt(idx);
     * 
     * if(map[currChar - 'a'] == true) {
     * removeDuplicates(str, idx+1, newString);
     * }else{
     * newString += currChar;
     * map[currChar - 'a'] = true;
     * removeDuplicates(str, idx+1, newString);
     * }
     * }
     * public static void main(String[] args) {
     * String str = "absaab";
     * 
     * removeDuplicates(str, 0, " ");
     * }
     * 
     * 
     * public static void subSequence(String str, int idx, String newString) {
     * if(idx == str.length()) {
     * System.err.println(newString);
     * return;
     * }
     * char currChar = str.charAt(idx);
     * //to be
     * subSequence(str, idx+1, newString+currChar);
     * 
     * //or not to be
     * subSequence(str, idx+1, newString);
     * }
     * public static void main(String[] args) {
     * 
     * String str = "abc";
     * 
     * subSequence(str, 0, " ");
     * }
     * 
     * 
     * 
     * public static void printSubseq(String str, int idx, String newString,
     * HashSet<String>AllSubseq) {
     * if(idx == str.length()) {
     * if(AllSubseq.contains(newString)) {
     * return;
     * }
     * AllSubseq.add(newString);
     * System.out.println(newString);
     * return;
     * }
     * //choose
     * printSubseq(str, idx+1, newString + str.charAt(idx), AllSubseq);
     * 
     * //don`t choose
     * printSubseq(str, idx+1, newString, AllSubseq);
     * 
     * }
     * public static void main(String[] args) {
     * 
     * String str1 = "abc";
     * String str2 = "aaa";
     * HashSet<String>AllSubseq = new HashSet<>();
     * printSubseq(str2, 0, " ", AllSubseq);
     * 
     * printSubseq(str1, 0, " ", AllSubseq);
     * 
     * }
     * 
     */

    public static String[] Keypad = { " . ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb(String str, int idx, String Combination) {
        if (idx == str.length()) {
            System.out.println(Combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = Keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, Combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "79";
        printComb(str, 0, " ");
    }
}
