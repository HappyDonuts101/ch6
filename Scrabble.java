public class Scrabble {
 
    public static void main(String[] args) {
        System.out.println(canSpell("quijibo", "jib"));
        System.out.println(canSpell("quijibo", "whosagooooooodboi"));
 
    }
 
    public static boolean canSpell(String tiles, String word) {
        for (int i = 0; i < word.length(); i++) {
           char letter = word.charAt(i);
 
            int Word = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == letter) {
                  Word = Word + 1;
                }
            }
 
            int Tiles = 0;
      for (int j = 0; j < tiles.length(); j++) {
                if (tiles.charAt(j) == letter) {
                    Tiles = Tiles + 1;
                }
            }
 
            if (Word > Tiles) {
                return false;
       }
        }
        return true;
    }
}
