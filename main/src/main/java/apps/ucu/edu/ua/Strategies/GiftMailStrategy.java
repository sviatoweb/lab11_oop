package apps.ucu.edu.ua.Strategies;

import apps.ucu.edu.ua.Client;

public class GiftMailStrategy implements MailStrategy {
    @Override
    public String generateMail(Client client) {
        return "Dear " + client.getName() + ", you have a special gift waiting for you!";
    }
}
