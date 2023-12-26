import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.example.task2.Client;
import com.example.task2.Gender;
import com.example.task2.MailBox;
import com.example.task2.MailInfo;
import com.example.task2.MailSender;
import com.example.task3.Proxy;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public class Task2Tests {
    @Test
    public void testClasses() {
        Client client = new Client("Bob", "mishaemail211@gmail.com", 43, Gender.MALE);
        MailInfo mailInfo = new MailInfo(client, 1);
        Assertions.assertEquals(client.getAge(), 43);
        Assertions.assertEquals(client.getId(), 0);
        Assertions.assertEquals(client.getEmail(), "mishaemail211@gmail.com");
        Assertions.assertEquals(client.getSex(),  Gender.MALE);
        Assertions.assertEquals(mailInfo.getMailCode(),  1);
        Client client2 = new Client("Bob", "mishaemail211@gmail.com", 43, Gender.MALE);
        Assertions.assertEquals(client2.getId(), 1);

    }
    // !!!!!!!!!!!!!!!!!!!!! -----Uncoment this for Tests-------!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // @Test
    // public void testEmail() throws MailjetException, MailjetSocketTimeoutException {
    //     Client client = new Client("Bob", "mishaemail211@gmail.com", 43, Gender.MALE);
    //     MailInfo mailInfo = new MailInfo(client, 1);
    //     MailSender mailSender = new MailSender();
    //     mailSender.sendMail(mailInfo);
    // }
    // @Test
    // public void testBoxEmail() throws MailjetException, MailjetSocketTimeoutException {
    //     Client client = new Client("Bob", "buleshnyi.pn@ucu.edu.ua", 43, Gender.MALE);
    //     MailInfo mailInfo = new MailInfo(client, 1);
    //     Client client2 = new Client("Bob2", "mishaemail211@gmail.com", 123, Gender.FEMALE);
    //     MailInfo mailInfo2 = new MailInfo(client2, 0);
    //     MailBox box = new MailBox();
    //     box.addMailInfo(mailInfo);
    //     box.addMailInfo(mailInfo2);
    //     box.sendAll();
    // }
   
}
