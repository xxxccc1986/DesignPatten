package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 符合单身的过滤条件
 * @date 2022/10/8 0:18
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> people = new ArrayList<>();
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("single")){
                people.add(person);
            }
        }
        return people;
    }
}
