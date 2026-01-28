import java.util.*;
public class LexicalTwist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word");
        String str1 = sc.nextLine();
        if(str1.contains(" ")){
            System.out.println(str1 + " is a invalid word"); 
            sc.close();
            return;  
        }
        System.out.println("Enter the second word");
        String str2 = sc.nextLine();
        if (str2.contains(" ")) {
            System.out.println(str2 + " is a invalid word");
            sc.close();
            return;
        }
        int i=0;
        int j=str1.length()-1;
        boolean isreverse = true;
        if(str1.length()!=str2.length()){
            isreverse=false;
        }
        else{
            while(i<str1.length()){
                if(str1.charAt(i)!=str2.charAt(j)){
                    isreverse=false;
                    break;
                }
                i++;
                j--;
            }
        }
        if(isreverse){
            String rev="";
            for(int k=str1.length()-1;k>=0;k--){
                char ch= Character.toLowerCase(str1.charAt(k));
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    rev=rev+"@";
                }
                else{
                    rev=rev+ch;
                }
            }
            System.out.println(rev);
        }
        else{
            String combined = (str1+str2).toUpperCase();
            int v=0;
            int c=0;
            for(int p=0;p<combined.length();p++){
                if(combined.charAt(p)=='A' || combined.charAt(p)=='E' || combined.charAt(p)=='I' || combined.charAt(p)=='O' || combined.charAt(p)=='U'){
                    v++;
                }
                else{
                    c++;
                }
            }
            if(v==c){
                System.out.println("Vowels and Consonants are equal");
            }
            else if(v>c){
                String printed="";
                for(int k=0;k<combined.length();k++){
                    char ch=combined.charAt(k);
                    if("AEIOU".indexOf(ch)!=-1 && printed.indexOf(ch)==-1){
                        System.out.print(ch);
                        printed+=ch;
                        if (printed.length() == 2) {
                            break;
                        }
                    }
                   
                }
            }
            else{
                String printed="";
                for(int k=0;k<combined.length();k++){
                    char ch=combined.charAt(k);
                    if("AEIOU".indexOf(ch)==-1 && printed.indexOf(ch)==-1){
                        System.out.print(ch);
                        printed+=ch;
                        if(printed.length()==2) break;
                    }
                }
            }
        }
        sc.close();
    }
    
}

