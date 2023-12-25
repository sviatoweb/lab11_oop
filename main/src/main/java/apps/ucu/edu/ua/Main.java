package apps.ucu.edu.ua;

import apps.ucu.edu.ua.Strategies.BirthdayMailStrategy;
import apps.ucu.edu.ua.Strategies.GiftMailStrategy;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("John", 25, "Male");
        Client client2 = new Client("Jane", 30, "Female");

        MailInfo birthdayMailInfo = new MailInfo(client1, new BirthdayMailStrategy());
        MailInfo giftMailInfo = new MailInfo(client2, new GiftMailStrategy());

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(birthdayMailInfo);
        mailBox.addMailInfo(giftMailInfo);

        mailBox.sendAll();
    }
}