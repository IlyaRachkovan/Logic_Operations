import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by student on 05.07.2018.
 */
public class SwitchCaseOpeartions {
    public void ageResult(int age) {
        switch (age) {
            case 10:
                System.out.println("Age is: " + age);
                break;
            case 20:
                System.out.println("Age is: " + age);
                break;
            case 30:
                System.out.println("Age is: " + age);
                break;
            case 40:
                System.out.println("Age is: " + age);
                break;
            default:
                System.out.println("Other value" + " " + age);

        }
    }
}
