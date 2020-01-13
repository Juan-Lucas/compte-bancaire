import dao.ClientDAO;
import entities.Client;

public class Test {
    public static void main(String[] args) {
        Client client = new Client("toto","ppp","ddd","ddd");
        ClientDAO.save(client);
    }
}
