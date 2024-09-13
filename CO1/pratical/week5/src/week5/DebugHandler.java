package week5;
public class DebugHandler extends LogHandler {
    @Override
    public void handleLog(String message, LogLevel level) {
        if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleLog(message, level);
        }
    }
}

