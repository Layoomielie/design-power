package com.example.filter.criteria;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 16:03
 */

import com.example.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class CriteriaFemale implements Criteria {


    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
