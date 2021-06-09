
import java.io.FileReader;
import java.util.*;

enum status {
    PAID, UNPAID
}

public class MobileBillManagement {
    public final class sendWarningSMS {//can this one be considered as nested class?
        public void warnings(){

            System.out.println("please pay your bills on time so that you wont get charged extra for paying late");
        }

    }
    public void finalize() {
        System.out.println("Done");

    }


    public static void main(String[] args) {

        MobileBillManagement mb = new MobileBillManagement();
        MobileBillManagement.sendWarningSMS sms =mb.new sendWarningSMS();

        Map<Integer, String> employee = new HashMap<>();
        employee.put(01, "Shah");
        employee.put(02, "Rahim"); //** when i tried t use this Map it didn't worked at all
        employee.put(03, "Ema");     //  it was preventing the application to run properly
        employee.put(04, "Begum");
        Scanner scanner = new Scanner(System.in);
        System.out.println("|||||||PLease enter Your ID|||||||");
        System.out.println("Employee Name: " + employee.get(scanner.nextInt()));

        System.out.println("MOBILE BILL TRACKING!!! ");
        System.out.println("Our Users ");

        ArrayList users = new ArrayList();
        users.add("Ashraf");
        users.add("Ahab");
        users.add("Ehsan");
        users.add("Asana");
        users.add("Anwar");

        System.out.println(users);
        System.out.println("XXX User below Must pay bills before they get disconnected! XXX ");
        HashMap<String, Integer> payList = new HashMap<String, Integer>();
        payList.put("Ashraf", 90);
        payList.put("Ahab", 45);
        payList.put("Ehsan", 50);
        payList.put("Asana", 30);
        payList.put("Anwar", 40);
        System.out.println(payList);
        System.out.println("This is the list of our current users with Payment due");
        System.out.println("<<<<<enter members name!!>>>>>");

        Scanner scan = new Scanner(System.in);
        String members = scan.nextLine();
        switch (members) {
            case "Ashraf":
                if (mb.totalDue(80, 30) - mb.payment(0, 0) == 0) {
                    System.out.println(status.PAID + " " + "*No more payment required*");
                } else {
                    System.out.println(status.UNPAID + " " + "Please pay the remaining balance");
                }
                break;
            case "Ahab":
                if (mb.totalDue(40, 5) - mb.payment(0, 45) == 0) {
                    System.out.println(status.PAID + " " + " *No more payment required*");
                } else {
                    System.out.println(status.UNPAID + " " + "Please pay the remaining balance");
                }
                break;

            case "Ehsan":
                if (mb.totalDue(40, 10) - mb.payment(40, 0) == 0) {
                    System.out.println(status.PAID + " " + " *No more payment required*");
                } else {
                    System.out.println(status.UNPAID + " " + "Please pay the remaining balance");
                }
                break;

            case "Asana":
                if (mb.totalDue(25, 5) - mb.payment(10, 10) == 0) {
                    System.out.println(status.PAID + " " + " *No more payment required*");
                } else {
                    System.out.println(status.UNPAID + " " + "Please pay the remaining balance");
                }
                break;
            case "Anwar":
                if (mb.totalDue(35, 5) - mb.payment(10, 15) == 0) {
                    System.out.println(status.PAID + " " + " *No more payment required*");
                } else {
                    System.out.println(status.UNPAID + " " + "Please pay the remaining balance");
                }
                break;

            default:
                System.out.println("this member is not on our list");
                return;

        }
        sms.warnings();


        try {
            FileReader fileReader = new FileReader("/Users/anharuzzaman/Desktop/sample3.txt");
            Scanner sc = new Scanner(fileReader);
            String line = null;
            while ((line = sc.nextLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Well Done ;)!!");
        }
        System.gc();

    }


    public int totalDue(int dueB, int tax) {
        int remaining;
        return remaining = dueB + tax;
    }

    public int payment(int cash, int card) {
        int amount;
        return amount = cash + card;

    }


}
