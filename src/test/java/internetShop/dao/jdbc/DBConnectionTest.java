package internetShop.dao.jdbc;

import internetShop.db.DBConnectionHandler;
import org.junit.Test;

public class DBConnectionTest {

    @Test
    public void dbConnectTesting() {
        DBConnectionHandler.connect();
    }
}
