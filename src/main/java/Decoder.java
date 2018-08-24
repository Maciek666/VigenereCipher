public enum Decoder {
    INSTACNE;

    public String translate(char[][] szyfr, String pass, String string) {
        int tmp;
        int ilosc_spacji = 0;

        String orginal = "";

        String text = string.replace(" ", "");

        for (int i = 0; i < text.length(); i++) {

            if (string.charAt(i + ilosc_spacji) == ' ') {
                orginal += " ";
                ilosc_spacji++;
            }


            tmp = i;
            while (tmp > pass.length() - 1) {
                tmp = tmp - pass.length();
            }

            int kolumna = (int) pass.charAt(tmp) - 65;


            for (int j = 0; j < szyfr.length; j++) {

                if (text.charAt(i) == szyfr[kolumna][j]) {

                    orginal += szyfr[0][j];

                }

            }
        }


        return orginal;
    }

}
