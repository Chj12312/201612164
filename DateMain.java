import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {
    public static void main(String[] args){

        Date today = new Date();

        SimpleDateFormat format1, format2, format3;

        format1 = new SimpleDateFormat("yyyy년 MM월 dd일");
        format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format3 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일 입니다");

        System.out.println(format1.format(today));
        System.out.println(format2.format(today));
        System.out.println(format3.format(today));
    }
}