import java.util.List;

public class ListComparer {
    public static <T> boolean areListsEqual(List<T> list1, List<T> list2) {
        // بررسی اندازه لیست‌ها
        if (list1.size() != list2.size()) {
            return false;
        }

        // مقایسه اعضای متناظر لیست‌ها
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true; // اگر همه اعضا برابر بودند
    }
}
