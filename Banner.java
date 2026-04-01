import java.util.HashMap;
import java.util.Map;

public class Banner {

    // Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create character pattern mappings
        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*       ",
                "*       ",
                "*       "
        }));

       patternMap.put('S', new CharacterPatternMap('S', new String[]{
        " ***** ",
        "*      ",
        "*      ",
        " ***** ",
        "      *",
        "      *",
        " ***** "
        }));

        displayBanner("OOPS", patternMap);
    }

    public static void displayBanner(String word, Map<Character, CharacterPatternMap> patternMap) {

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPatternMap patternObj = patternMap.get(ch);
                if (patternObj != null) {
                    lineBuilder.append(patternObj.getPattern()[i]).append("  ");
                }
            }

            System.out.println(lineBuilder);
        }
    }
}
