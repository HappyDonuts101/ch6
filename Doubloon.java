public class Doubloon {
 
    public static void main(String[] args) {
        System.out.println(isDoubloon("Abba"));       
        System.out.println(isDoubloon("Shanghaiings")); 
    }
 
    public static boolean isDoubloon(String word) {
        word = word.toLowerCase();
 
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
 
         for (int j = 0; j < word.length(); j++) {
         if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
 
            if (count != 2) {
                return false;
            }
        }
 
        return true;
    }
}
