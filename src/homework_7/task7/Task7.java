package homework_7.task7;

public class Task7 {
    public static void main(String[] args) {
        int count = 100000;
        String text = " ";
        String addText = "hello";

        // выноси такие куси кода в отдельные методы, которые будут возвращать время выполнения
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            text = text.concat(addText);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Execution time" + (start - finish)); // finish - start

                // выноси такие куси кода в отдельные методы, которые будут возвращать время выполнения
        StringBuilder testStringBuilder = new StringBuilder("Test");
        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            testStringBuilder.append(addText);
        }
        finish = System.currentTimeMillis();
        System.out.println("Execution time StringBuilder " + (start - finish));// finish - start

                // выноси такие куси кода в отдельные методы, которые будут возвращать время выполнения
        StringBuffer testStringBuffer = new StringBuffer("Test");
        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            testStringBuffer.append(addText);
        }
        finish = System.currentTimeMillis();
        System.out.println("Execution time StringBuffer " + (start - finish));// finish - start
    }
}
