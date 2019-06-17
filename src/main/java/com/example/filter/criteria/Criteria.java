package com.example.filter.criteria;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 16:00
 */

import com.example.filter.Person;

import java.util.List;

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
