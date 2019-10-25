package homework_7.task4;

public class Task4 {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        System.out.println("the presence of words in the text:\n" + "alert\t" +
                "add\t" + "good\t" + "plan\t\n" + text.contains("alert") + "\t" +
                text.contains("add") + "\t" + text.contains("good") + "\t" + text.contains("plan") + "\t");
    }
}
