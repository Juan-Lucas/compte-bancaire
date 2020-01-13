package dao;

import entities.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompteDAO {
    private static Connection connection = null;
    public static int save(Client client)
    {
        connection = ConnexionDAO.getConnexion();
        String query = "INSERT INTO client(nom, postnom, adresse, mail) VALUES(?,?,?,?)";
        int state = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,client.getNom());
            preparedStatement.setString(2,client.getPostnom());
            preparedStatement.setString(3,client.getAdresse());
            preparedStatement.setString(4,client.getMail());
            state = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return state;
    }
    public static int update(Client client)
    {
        connection = ConnexionDAO.getConnexion();
        String query = "UPDATE client SET nom=?, postnom=?, adresse=?, mail=? WHERE id=?";
        int state = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,client.getNom());
            preparedStatement.setString(2,client.getPostnom());
            preparedStatement.setString(3,client.getAdresse());
            preparedStatement.setString(4,client.getMail());
            preparedStatement.setInt(5,client.getId());
            state = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return state;
    }
    public static int delete(int idClient)
    {
        connection = ConnexionDAO.getConnexion();
        String query = "DELETE FROM client WHERE id=?";
        int state = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,idClient);
            state = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return state;
    }

    public static Client getClient(int idClient)
    {
        Client client = new Client();
        connection = ConnexionDAO.getConnexion();
        String query = "SELECT  * FROM client WHERE id=?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,idClient);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                client.setNom(resultSet.getString("nom"));
                client.setPostnom(resultSet.getString("postnom"));
                client.setAdresse(resultSet.getString("adresse"));
                client.setMail(resultSet.getString("mail"));
                client.setId(resultSet.getInt("idclient"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }
    public static List<Client> getClients()
    {
        Client client = new Client();
        connection = ConnexionDAO.getConnexion();
        List<Client> clients = new ArrayList<>();
        String query = "SELECT  * FROM client";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                client.setNom(resultSet.getString("nom"));
                client.setPostnom(resultSet.getString("postnom"));
                client.setAdresse(resultSet.getString("adresse"));
                client.setMail(resultSet.getString("mail"));
                client.setId(resultSet.getInt("idclient"));
                clients.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }
}
