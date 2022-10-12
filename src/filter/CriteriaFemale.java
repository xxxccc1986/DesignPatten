package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 符合女性的过滤条件
 * @date 2022/10/8 0:15
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> people = new ArrayList<>();
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("female")){
                people.add(person);
            }
        }
        return people;
    }
}
