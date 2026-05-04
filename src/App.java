public class App {
    public static void main(String[] args) {
        ;
        System.out.println(encode("hello"));
        System.out.println(encode("cipher"));

    }

    public static String encode(String word) {
        String start = "";
        String middle = "";
        String end = "";
        int count = 0;
        for (int index = 0; index < word.length(); index++) {
            char letter = word.charAt(index);
            // System.out.println(letter);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
                if (count % 2 == 0) {
                    end += letter;

                } else if (count % 2 == 1) {
                    start += letter;

                }

            } else {
                middle += letter;
            }
        }

        return start + middle + end;
    }
}
