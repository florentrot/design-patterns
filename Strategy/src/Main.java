public class Main {
    public static void main(String[] args) {

        LowerCaseStrategy str1 = new LowerCaseStrategy();
        UpperCaseStrategy str2 = new UpperCaseStrategy();
        RandomCaseStrategy str3 = new RandomCaseStrategy();
        String input = "LOREM ipsum coco ipSUM";

        Executor executor = new Executor(str1);
        executor.printString(input);

        executor.strategy = str2;
        executor.printString(input);

        executor.strategy = str3;
        executor.printString(input);
    }
}