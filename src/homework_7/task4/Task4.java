package homework_7.task4;

public class Task4 {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        wordSearch(text, "alert");
        wordSearch(text, "add");
        wordSearch(text, "good");
        wordSearch(text, "plan");
    }

    public static void wordSearch(String sourceText, String searchWord) {
        int count = 0;
        String intermediateText = sourceText.replace(".", " ");
        String textToCheck = intermediateText.replace(",", " ");
        String[] textToCheckArray = textToCheck.split(" ");
        for (int i = 0; i < textToCheckArray.length; i++) {
            if (textToCheckArray[i].equalsIgnoreCase(searchWord)) {
                count++;
            }
        }
        System.out.println("The word " + searchWord + " occurs in the text " + count + " times");
    }
}