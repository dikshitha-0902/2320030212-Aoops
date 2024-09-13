package week5;
public class InfoHandler extends LogHandler {
    @Override
    public void handleLog(String message, LogLevel level) {
        if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleLog(message, level);
        }
    }
}

