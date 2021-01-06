package internetShop.config;

import internetShop.exceptions.ProductIsNotAddedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

@ControllerAdvice
public class DefaultExceptionHandler {

    private static final Logger LOGGER = Logger.getLogger(DefaultExceptionHandler.class.getName());

    public DefaultExceptionHandler() throws IOException {
        Handler fileHandler = new FileHandler("MyLog.txt", true);
        fileHandler.setFormatter(new SimpleFormatter() {
            private static final String format = "%1$tb %1$td, %1$tY %1$tl:%1$tM:%1$tS %1$Tp %2$s%n%4$s: %3$s%n";

            @Override
            public synchronized String format(LogRecord record) {
                return String.format(format,
                        new Date(record.getMillis()),
                        record.getLevel().getLocalizedName(),
                        record.getLoggerName(),
                        record.getMessage()
                );
            }
        });
        //LOGGER.setFilter(new MyFilter());
        LOGGER.addHandler(fileHandler);
        LOGGER.addHandler(new ConsoleHandler());
    }

    //@ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ProductIsNotAddedException.class)
    public ModelAndView handleProdAdding(ProductIsNotAddedException e) {
        LOGGER.info("HandMadeProduct is not added exception occurred.." + e);
        return new ModelAndView("error").addObject("exc", "HandMadeProduct is not added exception occurred..");
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllException(Exception e) {
        LOGGER.info("unhandled exception.." + e.getMessage());
        return new ModelAndView("error").addObject("exc", "Sorry..unhandled exception.." + e.getLocalizedMessage());
    }
}
