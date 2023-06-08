package homework9;

import java.util.Comparator;

public class ExpComparator implements Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        // 1 0 -1
        return Integer.compare(o2.experience, o1.experience);
    }






}
