import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class RandomTest {

    public static void main(String[] args){
        Date dt1= new Date(2020,03,06);
        Date dt2= new Date(2019,03,06);

        dt1.getMonth()
        List<Date> list = new ArrayList<>();
        list.add(dt1);list.add(dt2);

        Map<Integer, Integer> map = findMap(list);
    }

    private static Map<Integer,Integer> findMap(List<Date> listOfDates){

    }
}
