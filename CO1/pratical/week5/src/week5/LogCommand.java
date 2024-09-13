package week5;
public class LogCommand implements Command {
    private LogHandler handler;

    public LogCommand(LogHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute(String message, LogLevel level) {
        handler.handleLog(message, level);
    }
}

