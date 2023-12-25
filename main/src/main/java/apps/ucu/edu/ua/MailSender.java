package apps.ucu.edu.ua;

class MailSender {
    public void sendMail(MailInfo mailInfo) {
        String mailContent = mailInfo.generateMail();
        System.out.println("Sending mail to Client " + mailInfo.getClient().getId() + ": " + mailContent);
    }

}
