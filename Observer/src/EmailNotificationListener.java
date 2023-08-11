public class EmailNotificationListener implements EventListener{
    @Override
    public void notify(String eventType, String file) {
        System.out.println("Email notification listener: " + eventType + " performed on file " + file);
    }
}
