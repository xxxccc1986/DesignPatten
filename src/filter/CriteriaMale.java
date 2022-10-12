package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 符合男性的过滤条件
 * @date 2022/10/8 0:08
 */
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> people = new ArrayList<>();
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("male")){
                people.add(person);
            }
        }
        return people;
    }
}
