public class TitleCaseConverter {
    public static void main(String[] args) {
        String input = "this is a sample title or sentence";

        String titleCase = convertToTitleCase(input);
        System.out.println(titleCase); // Output: This Is A Sample Title Or Sentence
    }

    private static String convertToTitleCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c) || c == '-' || c == '_') {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            } else {
                c = Character.toLowerCase(c);
            }
            titleCase.append(c);
        }

        return titleCase.toString();
    }
}
