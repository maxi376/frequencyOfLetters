import java.util.Arrays;
public class FrequencyOfLetters {
    public static void main(String[] args){
        String s="abrxkbassdfirsdqapqoiuwrapjaoc";
        int n = 30;
        int[] F=new int[52];
        Arrays.fill(F,0);
        
        F= FrequencyOfLetters.frequencyOfLetters(s,n);
        for(int i=0;i<26;i++)
            System.out.print((char)(i+65)+" ");
        System.out.println();
        for(int i=0;i<26;i++)
            System.out.print(F[i]+" ");
        System.out.println();
        for(int i=0;i<26;i++)
            System.out.print((char)(i+97)+" ");
        System.out.println();
        for(int i=26;i<52;i++)
            System.out.print(F[i]+" ");
    }
    public static int[]  frequencyOfLetters(String s, int n){
        int[] F=new int[52];
        char a;
        for(int i=0; i<s.length(); i++){
            a=s.charAt(i);
            if (Character.isLetter(a)) {
                if (Character.isUpperCase(a)){
                    F[(int)a - 65]++;
                }else if (Character.isLowerCase(a)){//26 pt upper-> 97-26=71
                    F[(int)a - 71]++;
                }
            }
        }
        return F;
    }
}
