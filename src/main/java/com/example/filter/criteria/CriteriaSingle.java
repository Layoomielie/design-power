package com.example.filter.criteria;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 16:05
 */

import com.example.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class CriteriaSingle implements Criteria {


    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
