import java.time.ZonedDateTime;

/**
 * @auther keer
 * @data 2021/9/16
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
    }
}
