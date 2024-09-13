package week5;

public class Client {
    public static void main(String[] args) {
        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();
        
        // Set up chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create commands
        LogCommand logCommandInfo = new LogCommand(infoHandler);
        LogCommand logCommandDebug = new LogCommand(infoHandler);  // All commands start with the infoHandler
        LogCommand logCommandError = new LogCommand(infoHandler);

        // Create logger and add commands
        Logger logger = new Logger();
        logger.addCommand(logCommandInfo);
        logger.addCommand(logCommandDebug);
        logger.addCommand(logCommandError);

        // Process the log messages
        logger.processLogs();
    }
}

