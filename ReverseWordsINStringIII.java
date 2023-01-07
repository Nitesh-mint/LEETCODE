public class ReverseWordsINStringIII {
    public static void main(String[] args) {
        String s= "Nitesh raya is dont't";
        char c[] = s.toCharArray();
        for(int i=0;i<c.length;i++){
            int j = i;
            while(j+1<c.length && c[j+1]!=' '){//j lai move garera point to the last of the word
                j++; 
            }
            reverse(c,i,j);
            i = j;
        }
        System.out.print(c);
    }
    private static void reverse(char c[],int i, int j){
        for(;i<j;){
            char swap = c[i];
            c[i] = c[j];
            c[j] = swap;
            i++;
            j--;
        }
    }
}
