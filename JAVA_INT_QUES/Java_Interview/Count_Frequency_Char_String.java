package Java_Interview;
public class Count_Frequency_Char_String {
    static int [] countFrequency(String str ){
        int[] freq = new int[str.length()];  
        int i, j;  
          
        //Converts given string into character array  
        char string[] = str.toCharArray();  
          
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            } 
        }

        return freq;
    }
    public static void main(String[] args) {
        String str = "My picture";
        int [] freq = countFrequency(str);
        for(int i : freq){
            System.out.print(i+" ");
        }

    }
}
