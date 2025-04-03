public class DBConnection {
    boolean connectedToDb;
    public void connectToDb(){
        connectedToDb=true;
    }

    public void disconnectDB(){
        connectedToDb=false;
    }

    public boolean isConnectedToDb(){
        return connectedToDb;
    }
}
