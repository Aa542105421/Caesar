import java.util.*;
import java.lang.*;

/**
 * Caesar
 */
public class Caesar {

    public static void main(String[] args) {
        System.out.println("請輸入5~10個小寫英文字母abcde");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char char1[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char char2[] = {'d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c'};
        char[] ch = new char[str.length()];
        ch = str.toCharArray();
        char[] ch2 = new char[str.length()];
        if(ch.length < 5 || ch.length >10){
            System.out.println("錯誤:請輸入5~10個小寫英文字母");
        }
        else{
            for (int i=0;i<ch.length;i++){
                for(int j=0;j<26;j++){
                    if(ch[i] == char1[j]){
                        ch2[j] =char2[j];
                        break;
                    }
                }
            }
            System.out.print(ch2);
        }
    }
}
