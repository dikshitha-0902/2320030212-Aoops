package week5;
public class ErrorHandler extends LogHandler {
    @Override
    public void handleLog(String message, LogLevel level) {
        if (level == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleLog(message, level);
        }
    }
}
