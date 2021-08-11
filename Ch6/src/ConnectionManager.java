class Connection {
    public Connection() {
        ip = "localhost";
        port = 21;
        System.out.println("It is a default Connection constructor");
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    private String  ip;
    private int     port;
}

public class ConnectionManager {
    private static int i = 0;
    private static Connection[] array = new Connection[] {new Connection(), new Connection(), new Connection(), new Connection(), new Connection()};

    public static Connection getConnection() {
        if (i < 5) {
            return array[i++];
        }
        return (null);
    }
}
