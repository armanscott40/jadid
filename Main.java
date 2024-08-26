import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ایجاد دو لیست از نوع Integer
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(5);
        list2.add(3);

        // فراخوانی متد areListsEqual از کلاس ListComparer
        boolean result = ListComparer.areListsEqual(list1, list2);

        // نمایش نتیجه
        if (result) {
            System.out.println("لیست‌ها برابر هستند.");
        } else {
            System.out.println("لیست‌ها برابر نیستند.");
        }

        // ایجاد دو لیست دیگر با مقادیر متفاوت
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(4);

        // فراخوانی مجدد متد
        boolean result2 = ListComparer.areListsEqual(list1, list3);
    }
}
