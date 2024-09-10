import java.util.Scanner;

public class Curmulative {
 public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();

    // String array[] = new String[size];
    // int totLength = 0;
    // for(int i=0; i<size; i++){
    //     array[i] = sc.nextLine();
    //     totLength = array[i].length();
    // }
    // System.out.println(totLength);
    // String str = sc.next();
    // String result = "";

    // for(int i=0; i<str.length(); i++){
        // if(str.charAt(i) == 'e'){
            // result += 'i';
        // }
// 
    //     // else{
    //         result += str.charAt(i);
    //     }
    // }
    // System.out.println(result);

  String email = sc.next();
  String userName = " ";
  
  for(int i=0; i<email.length(); i++){
    if(email.charAt(i) =='@'){
        break;
    }

    else{
        userName += email.charAt(i);
    }
  }
  System.out.println(userName);
 }   
}
