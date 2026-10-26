public class Abecedarian {

   public static void main(String[] args) {
        System.out.println(isAbecedarian("abdest"));
        System.out.println(isAbecedarian("biopsy"));
    }
    public static boolean isAbecedarian(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
