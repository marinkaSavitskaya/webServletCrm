package by.savitskaya.dao;

import by.savitskaya.model.Client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClientDao {

    private static Map<Integer, Client> clientList = new ConcurrentHashMap<>();

    public static Map<Integer, Client> getClientList() {
        return clientList;
    }

    public static Client getClientById(Integer id){
        return clientList.get(id);
    }

    public static void addClient(Client client){
        client.setId(clientList.size()+1);
        clientList.put(client.getId(), client);
    }

    public static void updateClient(Client client){
        clientList.get(client.getId()).setFirstName(client.getFirstName());
        clientList.get(client.getId()).setLastName(client.getLastName());
        clientList.get(client.getId()).setAge(client.getAge());
        clientList.get(client.getId()).setNameCompany(client.getNameCompany());
    }

    public static void deleteClient(Integer id){
        clientList.remove(id);
    }
}
