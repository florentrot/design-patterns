public class LogOpenListener implements EventListener{
    @Override
    public void notify(String eventType, String file) {
        System.out.println("Log open listener: " + eventType + " performed on file " + file);
    }
}
