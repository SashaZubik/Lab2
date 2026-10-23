import model.CorporateRent;
import model.SleepingBag;
import model.UserRent;
import service.NotificationService;
import service.impl.EmailNotification;
import service.impl.SMSNotification;
import billing.CampingStore;
import model.Rent;

public class Main{
    public static void main(String[] args){

        NotificationService SMSservice= new SMSNotification();
        NotificationService Emailservice= new EmailNotification();

        CampingStore SMSBilling = new CampingStore(SMSservice);

        Rent userSub = new UserRent("Иван Петров", 300.0, "Large");
        SMSBilling.ProcessPayment(userSub, "+7-999-123-45-67");

        System.out.println();

        CampingStore emailBilling = new CampingStore(Emailservice);

        Rent corpSub = new CorporateRent("ООО Тмыв денег", 300.0, "Small", 10);
        SMSBilling.ProcessPayment(corpSub, "financeOOO@Money.ru");

        CampingStore.printGlobalStat();


    }
}