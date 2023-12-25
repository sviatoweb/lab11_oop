package apps.ucu.edu.ua;

import apps.ucu.edu.ua.Strategies.MailStrategy;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MailInfo {
    private Client client;
    private MailStrategy mailStrategy;

    public MailInfo(Client client, MailStrategy mailStrategy) {
        this.client = client;
        this.mailStrategy = mailStrategy;
    }

    public String generateMail() {
        return mailStrategy.generateMail(client);
    }

    public void setMailStrategy(MailStrategy mailStrategy) {
        this.mailStrategy = mailStrategy;
    }
}    
