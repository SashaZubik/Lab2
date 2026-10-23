package billing;
import model.Rent;
import service.NotificationService;

public class CampingStore{
    private static int totalOrdersCount;
    private static double totalRevenue;
    private final service.NotificationService notificationservice;

    public CampingStore(NotificationService notificationservice){
        this.notificationservice=notificationservice;
    }

    public void ProcessPayment(Rent rent, String Contact){
        double FinalPrice=rent.cost();
        RegisterOrder(FinalPrice);
        String message = String.format("Счет оплачен. Тариф [%s]. Списано: %.2f руб.", rent.Getcategory(), FinalPrice);
        notificationservice.sendNotification(message, Contact);
    }

    public static int GetTotalOrderCount(){
        return totalOrdersCount;
    }

    public static double GetTotalRevenue(){
        return totalRevenue;
    }

    public static void RegisterOrder(double amount){//выручка
        totalOrdersCount++;
        totalRevenue+=amount;
    }

    public static void printGlobalStat(){
        System.out.println("Всего заказов оформлено: " + totalOrdersCount);
        System.out.println("Выручка : " + totalRevenue);
    }

}