public class Main {
    private static final String text = "THIS IS SECRET TEXT";

    public static void main(String[] args) {


        String translatedText = Chiper.INSTACNE.code(Chiper.INSTACNE.vigenereBoard(), text, "KEY");

        System.out.println(translatedText);

        System.out.println(Decoder.INSTACNE.translate(Chiper.INSTACNE.vigenereBoard(),"KEY",translatedText));

    }

}
