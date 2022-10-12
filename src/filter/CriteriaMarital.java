package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 符合已婚的过滤条件
 * @date 2022/10/8 0:19
 */
public class CriteriaMarital implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> people = new ArrayList<>();
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("marital")){
                people.add(person);
            }
        }
        return people;
    }
}
