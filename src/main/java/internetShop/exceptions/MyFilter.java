package internetShop.exceptions;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class MyFilter implements Filter {
    public boolean isLoggable(LogRecord lr) {
        return false;
    }
}
