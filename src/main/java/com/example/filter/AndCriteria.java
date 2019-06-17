package com.example.filter;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 16:14
 */

import com.example.filter.criteria.Criteria;

import java.util.List;

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }


    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
