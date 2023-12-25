package apps.ucu.edu.ua.Strategies;

import apps.ucu.edu.ua.Client;

public class BirthdayMailStrategy implements MailStrategy {
    @Override
    public String generateMail(Client client) {
        return "Happy Birthday, " + client.getName() + "!";
    }
}
