public class DummyLogger {
    
    public void logMessages() {
        System.out.println("This should be flagged by the script");

        System.err.println("This error message should also be flagged");

        log.info("Informational log without internationalization");
        log.warn("Warning message without internationalization");
        log.error("Error message without internationalization");
        log.fatal("Fatal message without internationalization");
        log.info("This should not be flagged");
        try {
            throw new Exception("Sample Exception");
        } catch (Exception e) {
            e.printStackTrace(); // This should be flagged
        }
    }
}

