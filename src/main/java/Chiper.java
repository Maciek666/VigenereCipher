public enum Chiper {
    INSTACNE;

    public char[][] vigenereBoard() {


        int b = 65;     // asci A
        int a = 65;

        char[][] cipher = new char[26][26];

        for (int i = 0; i < 26; i++) {
            b = a + i;
            for (int j = 0; j < 26; j++) {

                if (b >= 91) {
                    b = 65;
                }

                cipher[i][j] = (char) b;

                ++b;
            }

        }
        return cipher;
    }

    public String code(char[][] tab, String text, String keys) {

        text = text.toUpperCase();

        StringBuilder changedText = new StringBuilder();

        char[] key = keys.toCharArray();

        char[] chars = text.replace(" ", "").toCharArray();

        int column = 0;
        int line = 0;
        int tmp;
        int number_OfSpaces = 0;


        for (int i = 0; i < chars.length; i++) {

            if (text.charAt(i + number_OfSpaces) == ' ') {
                changedText.append(" ");
                number_OfSpaces++;
            }


            for (int j = 0; j < tab.length; j++) {

                if (chars[i] == tab[j][0]) {
                    column = j;
                }

            }

            for (int k = 0; k < tab.length; k++) {
                tmp = i;
                while (tmp > keys.length() - 1) {
                    tmp = tmp - keys.length();
                }
                if (keys.charAt(tmp) == tab[0][k]) {
                    line = k;
                }


            }

            changedText.append(tab[line][column]);

        }


        return changedText.toString();
    }
}
