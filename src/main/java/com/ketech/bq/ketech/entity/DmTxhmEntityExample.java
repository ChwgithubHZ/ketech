package com.ketech.bq.ketech.entity;

import java.util.ArrayList;
import java.util.List;

public class DmTxhmEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmTxhmEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHmlxIsNull() {
            addCriterion("hmlx is null");
            return (Criteria) this;
        }

        public Criteria andHmlxIsNotNull() {
            addCriterion("hmlx is not null");
            return (Criteria) this;
        }

        public Criteria andHmlxEqualTo(String value) {
            addCriterion("hmlx =", value, "hmlx");
            return (Criteria) this;
        }

        public Criteria andHmlxNotEqualTo(String value) {
            addCriterion("hmlx <>", value, "hmlx");
            return (Criteria) this;
        }

        public Criteria andHmlxGreaterThan(String value) {
            addCriterion("hmlx >", value, "hmlx");
            return (Criteria) this;
        }

        public Criteria andHmlxGreaterThanOrEqualTo(String value) {
            addCriterion("hmlx >=", value, "hmlx");
            return (Criteria) this;
        }

        public Criteria andHmlxLessThan(String value) {
            addCriterion("hmlx <", value, "hmlx");
            return (Criteria) this;
        }

        public Criteria andHmlxLessThanOrEqualTo(String value) {
            addCriterion("hmlx <=", value, "hmlx");
            return (Criteria) this;
        }

        public Criteria andHmlxLike(String value) {
            addCriterion("hmlx like", value, "hmlx");
            return (Criteria) this;
        }

        public Criteria andHmlxNotLike(String value) {
            addCriterion("hmlx not like", value, "hmlx");
            return (Criteria) this;
        }

        public Criteria andHmlxIn(List<String> values) {
            addCriterion("hmlx in", values, "hmlx");
            return (Criteria) this;
        }

        public Criteria andHmlxNotIn(List<String> values) {
            addCriterion("hmlx not in", values, "hmlx");
            return (Criteria) this;
        }

        public Criteria andHmlxBetween(String value1, String value2) {
            addCriterion("hmlx between", value1, value2, "hmlx");
            return (Criteria) this;
        }

        public Criteria andHmlxNotBetween(String value1, String value2) {
            addCriterion("hmlx not between", value1, value2, "hmlx");
            return (Criteria) this;
        }

        public Criteria andGmtjIsNull() {
            addCriterion("gmtj is null");
            return (Criteria) this;
        }

        public Criteria andGmtjIsNotNull() {
            addCriterion("gmtj is not null");
            return (Criteria) this;
        }

        public Criteria andGmtjEqualTo(String value) {
            addCriterion("gmtj =", value, "gmtj");
            return (Criteria) this;
        }

        public Criteria andGmtjNotEqualTo(String value) {
            addCriterion("gmtj <>", value, "gmtj");
            return (Criteria) this;
        }

        public Criteria andGmtjGreaterThan(String value) {
            addCriterion("gmtj >", value, "gmtj");
            return (Criteria) this;
        }

        public Criteria andGmtjGreaterThanOrEqualTo(String value) {
            addCriterion("gmtj >=", value, "gmtj");
            return (Criteria) this;
        }

        public Criteria andGmtjLessThan(String value) {
            addCriterion("gmtj <", value, "gmtj");
            return (Criteria) this;
        }

        public Criteria andGmtjLessThanOrEqualTo(String value) {
            addCriterion("gmtj <=", value, "gmtj");
            return (Criteria) this;
        }

        public Criteria andGmtjLike(String value) {
            addCriterion("gmtj like", value, "gmtj");
            return (Criteria) this;
        }

        public Criteria andGmtjNotLike(String value) {
            addCriterion("gmtj not like", value, "gmtj");
            return (Criteria) this;
        }

        public Criteria andGmtjIn(List<String> values) {
            addCriterion("gmtj in", values, "gmtj");
            return (Criteria) this;
        }

        public Criteria andGmtjNotIn(List<String> values) {
            addCriterion("gmtj not in", values, "gmtj");
            return (Criteria) this;
        }

        public Criteria andGmtjBetween(String value1, String value2) {
            addCriterion("gmtj between", value1, value2, "gmtj");
            return (Criteria) this;
        }

        public Criteria andGmtjNotBetween(String value1, String value2) {
            addCriterion("gmtj not between", value1, value2, "gmtj");
            return (Criteria) this;
        }

        public Criteria andSyqxIsNull() {
            addCriterion("syqx is null");
            return (Criteria) this;
        }

        public Criteria andSyqxIsNotNull() {
            addCriterion("syqx is not null");
            return (Criteria) this;
        }

        public Criteria andSyqxEqualTo(String value) {
            addCriterion("syqx =", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotEqualTo(String value) {
            addCriterion("syqx <>", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxGreaterThan(String value) {
            addCriterion("syqx >", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxGreaterThanOrEqualTo(String value) {
            addCriterion("syqx >=", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxLessThan(String value) {
            addCriterion("syqx <", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxLessThanOrEqualTo(String value) {
            addCriterion("syqx <=", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxLike(String value) {
            addCriterion("syqx like", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotLike(String value) {
            addCriterion("syqx not like", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxIn(List<String> values) {
            addCriterion("syqx in", values, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotIn(List<String> values) {
            addCriterion("syqx not in", values, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxBetween(String value1, String value2) {
            addCriterion("syqx between", value1, value2, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotBetween(String value1, String value2) {
            addCriterion("syqx not between", value1, value2, "syqx");
            return (Criteria) this;
        }

        public Criteria andRjmcIsNull() {
            addCriterion("rjmc is null");
            return (Criteria) this;
        }

        public Criteria andRjmcIsNotNull() {
            addCriterion("rjmc is not null");
            return (Criteria) this;
        }

        public Criteria andRjmcEqualTo(String value) {
            addCriterion("rjmc =", value, "rjmc");
            return (Criteria) this;
        }

        public Criteria andRjmcNotEqualTo(String value) {
            addCriterion("rjmc <>", value, "rjmc");
            return (Criteria) this;
        }

        public Criteria andRjmcGreaterThan(String value) {
            addCriterion("rjmc >", value, "rjmc");
            return (Criteria) this;
        }

        public Criteria andRjmcGreaterThanOrEqualTo(String value) {
            addCriterion("rjmc >=", value, "rjmc");
            return (Criteria) this;
        }

        public Criteria andRjmcLessThan(String value) {
            addCriterion("rjmc <", value, "rjmc");
            return (Criteria) this;
        }

        public Criteria andRjmcLessThanOrEqualTo(String value) {
            addCriterion("rjmc <=", value, "rjmc");
            return (Criteria) this;
        }

        public Criteria andRjmcLike(String value) {
            addCriterion("rjmc like", value, "rjmc");
            return (Criteria) this;
        }

        public Criteria andRjmcNotLike(String value) {
            addCriterion("rjmc not like", value, "rjmc");
            return (Criteria) this;
        }

        public Criteria andRjmcIn(List<String> values) {
            addCriterion("rjmc in", values, "rjmc");
            return (Criteria) this;
        }

        public Criteria andRjmcNotIn(List<String> values) {
            addCriterion("rjmc not in", values, "rjmc");
            return (Criteria) this;
        }

        public Criteria andRjmcBetween(String value1, String value2) {
            addCriterion("rjmc between", value1, value2, "rjmc");
            return (Criteria) this;
        }

        public Criteria andRjmcNotBetween(String value1, String value2) {
            addCriterion("rjmc not between", value1, value2, "rjmc");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsIsNull() {
            addCriterion("dltxsbgs is null");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsIsNotNull() {
            addCriterion("dltxsbgs is not null");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsEqualTo(String value) {
            addCriterion("dltxsbgs =", value, "dltxsbgs");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsNotEqualTo(String value) {
            addCriterion("dltxsbgs <>", value, "dltxsbgs");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsGreaterThan(String value) {
            addCriterion("dltxsbgs >", value, "dltxsbgs");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsGreaterThanOrEqualTo(String value) {
            addCriterion("dltxsbgs >=", value, "dltxsbgs");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsLessThan(String value) {
            addCriterion("dltxsbgs <", value, "dltxsbgs");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsLessThanOrEqualTo(String value) {
            addCriterion("dltxsbgs <=", value, "dltxsbgs");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsLike(String value) {
            addCriterion("dltxsbgs like", value, "dltxsbgs");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsNotLike(String value) {
            addCriterion("dltxsbgs not like", value, "dltxsbgs");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsIn(List<String> values) {
            addCriterion("dltxsbgs in", values, "dltxsbgs");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsNotIn(List<String> values) {
            addCriterion("dltxsbgs not in", values, "dltxsbgs");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsBetween(String value1, String value2) {
            addCriterion("dltxsbgs between", value1, value2, "dltxsbgs");
            return (Criteria) this;
        }

        public Criteria andDltxsbgsNotBetween(String value1, String value2) {
            addCriterion("dltxsbgs not between", value1, value2, "dltxsbgs");
            return (Criteria) this;
        }

        public Criteria andZhlxdhIsNull() {
            addCriterion("zhlxdh is null");
            return (Criteria) this;
        }

        public Criteria andZhlxdhIsNotNull() {
            addCriterion("zhlxdh is not null");
            return (Criteria) this;
        }

        public Criteria andZhlxdhEqualTo(String value) {
            addCriterion("zhlxdh =", value, "zhlxdh");
            return (Criteria) this;
        }

        public Criteria andZhlxdhNotEqualTo(String value) {
            addCriterion("zhlxdh <>", value, "zhlxdh");
            return (Criteria) this;
        }

        public Criteria andZhlxdhGreaterThan(String value) {
            addCriterion("zhlxdh >", value, "zhlxdh");
            return (Criteria) this;
        }

        public Criteria andZhlxdhGreaterThanOrEqualTo(String value) {
            addCriterion("zhlxdh >=", value, "zhlxdh");
            return (Criteria) this;
        }

        public Criteria andZhlxdhLessThan(String value) {
            addCriterion("zhlxdh <", value, "zhlxdh");
            return (Criteria) this;
        }

        public Criteria andZhlxdhLessThanOrEqualTo(String value) {
            addCriterion("zhlxdh <=", value, "zhlxdh");
            return (Criteria) this;
        }

        public Criteria andZhlxdhLike(String value) {
            addCriterion("zhlxdh like", value, "zhlxdh");
            return (Criteria) this;
        }

        public Criteria andZhlxdhNotLike(String value) {
            addCriterion("zhlxdh not like", value, "zhlxdh");
            return (Criteria) this;
        }

        public Criteria andZhlxdhIn(List<String> values) {
            addCriterion("zhlxdh in", values, "zhlxdh");
            return (Criteria) this;
        }

        public Criteria andZhlxdhNotIn(List<String> values) {
            addCriterion("zhlxdh not in", values, "zhlxdh");
            return (Criteria) this;
        }

        public Criteria andZhlxdhBetween(String value1, String value2) {
            addCriterion("zhlxdh between", value1, value2, "zhlxdh");
            return (Criteria) this;
        }

        public Criteria andZhlxdhNotBetween(String value1, String value2) {
            addCriterion("zhlxdh not between", value1, value2, "zhlxdh");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsIsNull() {
            addCriterion("zjyzthcs is null");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsIsNotNull() {
            addCriterion("zjyzthcs is not null");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsEqualTo(String value) {
            addCriterion("zjyzthcs =", value, "zjyzthcs");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsNotEqualTo(String value) {
            addCriterion("zjyzthcs <>", value, "zjyzthcs");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsGreaterThan(String value) {
            addCriterion("zjyzthcs >", value, "zjyzthcs");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsGreaterThanOrEqualTo(String value) {
            addCriterion("zjyzthcs >=", value, "zjyzthcs");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsLessThan(String value) {
            addCriterion("zjyzthcs <", value, "zjyzthcs");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsLessThanOrEqualTo(String value) {
            addCriterion("zjyzthcs <=", value, "zjyzthcs");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsLike(String value) {
            addCriterion("zjyzthcs like", value, "zjyzthcs");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsNotLike(String value) {
            addCriterion("zjyzthcs not like", value, "zjyzthcs");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsIn(List<String> values) {
            addCriterion("zjyzthcs in", values, "zjyzthcs");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsNotIn(List<String> values) {
            addCriterion("zjyzthcs not in", values, "zjyzthcs");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsBetween(String value1, String value2) {
            addCriterion("zjyzthcs between", value1, value2, "zjyzthcs");
            return (Criteria) this;
        }

        public Criteria andZjyzthcsNotBetween(String value1, String value2) {
            addCriterion("zjyzthcs not between", value1, value2, "zjyzthcs");
            return (Criteria) this;
        }

        public Criteria andZjyythcsIsNull() {
            addCriterion("zjyythcs is null");
            return (Criteria) this;
        }

        public Criteria andZjyythcsIsNotNull() {
            addCriterion("zjyythcs is not null");
            return (Criteria) this;
        }

        public Criteria andZjyythcsEqualTo(String value) {
            addCriterion("zjyythcs =", value, "zjyythcs");
            return (Criteria) this;
        }

        public Criteria andZjyythcsNotEqualTo(String value) {
            addCriterion("zjyythcs <>", value, "zjyythcs");
            return (Criteria) this;
        }

        public Criteria andZjyythcsGreaterThan(String value) {
            addCriterion("zjyythcs >", value, "zjyythcs");
            return (Criteria) this;
        }

        public Criteria andZjyythcsGreaterThanOrEqualTo(String value) {
            addCriterion("zjyythcs >=", value, "zjyythcs");
            return (Criteria) this;
        }

        public Criteria andZjyythcsLessThan(String value) {
            addCriterion("zjyythcs <", value, "zjyythcs");
            return (Criteria) this;
        }

        public Criteria andZjyythcsLessThanOrEqualTo(String value) {
            addCriterion("zjyythcs <=", value, "zjyythcs");
            return (Criteria) this;
        }

        public Criteria andZjyythcsLike(String value) {
            addCriterion("zjyythcs like", value, "zjyythcs");
            return (Criteria) this;
        }

        public Criteria andZjyythcsNotLike(String value) {
            addCriterion("zjyythcs not like", value, "zjyythcs");
            return (Criteria) this;
        }

        public Criteria andZjyythcsIn(List<String> values) {
            addCriterion("zjyythcs in", values, "zjyythcs");
            return (Criteria) this;
        }

        public Criteria andZjyythcsNotIn(List<String> values) {
            addCriterion("zjyythcs not in", values, "zjyythcs");
            return (Criteria) this;
        }

        public Criteria andZjyythcsBetween(String value1, String value2) {
            addCriterion("zjyythcs between", value1, value2, "zjyythcs");
            return (Criteria) this;
        }

        public Criteria andZjyythcsNotBetween(String value1, String value2) {
            addCriterion("zjyythcs not between", value1, value2, "zjyythcs");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmIsNull() {
            addCriterion("zjyzclxhm is null");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmIsNotNull() {
            addCriterion("zjyzclxhm is not null");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmEqualTo(String value) {
            addCriterion("zjyzclxhm =", value, "zjyzclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmNotEqualTo(String value) {
            addCriterion("zjyzclxhm <>", value, "zjyzclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmGreaterThan(String value) {
            addCriterion("zjyzclxhm >", value, "zjyzclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmGreaterThanOrEqualTo(String value) {
            addCriterion("zjyzclxhm >=", value, "zjyzclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmLessThan(String value) {
            addCriterion("zjyzclxhm <", value, "zjyzclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmLessThanOrEqualTo(String value) {
            addCriterion("zjyzclxhm <=", value, "zjyzclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmLike(String value) {
            addCriterion("zjyzclxhm like", value, "zjyzclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmNotLike(String value) {
            addCriterion("zjyzclxhm not like", value, "zjyzclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmIn(List<String> values) {
            addCriterion("zjyzclxhm in", values, "zjyzclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmNotIn(List<String> values) {
            addCriterion("zjyzclxhm not in", values, "zjyzclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmBetween(String value1, String value2) {
            addCriterion("zjyzclxhm between", value1, value2, "zjyzclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyzclxhmNotBetween(String value1, String value2) {
            addCriterion("zjyzclxhm not between", value1, value2, "zjyzclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmIsNull() {
            addCriterion("zjyyclxhm is null");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmIsNotNull() {
            addCriterion("zjyyclxhm is not null");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmEqualTo(String value) {
            addCriterion("zjyyclxhm =", value, "zjyyclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmNotEqualTo(String value) {
            addCriterion("zjyyclxhm <>", value, "zjyyclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmGreaterThan(String value) {
            addCriterion("zjyyclxhm >", value, "zjyyclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmGreaterThanOrEqualTo(String value) {
            addCriterion("zjyyclxhm >=", value, "zjyyclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmLessThan(String value) {
            addCriterion("zjyyclxhm <", value, "zjyyclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmLessThanOrEqualTo(String value) {
            addCriterion("zjyyclxhm <=", value, "zjyyclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmLike(String value) {
            addCriterion("zjyyclxhm like", value, "zjyyclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmNotLike(String value) {
            addCriterion("zjyyclxhm not like", value, "zjyyclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmIn(List<String> values) {
            addCriterion("zjyyclxhm in", values, "zjyyclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmNotIn(List<String> values) {
            addCriterion("zjyyclxhm not in", values, "zjyyclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmBetween(String value1, String value2) {
            addCriterion("zjyyclxhm between", value1, value2, "zjyyclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyyclxhmNotBetween(String value1, String value2) {
            addCriterion("zjyyclxhm not between", value1, value2, "zjyyclxhm");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsIsNull() {
            addCriterion("zjyzbddhgs is null");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsIsNotNull() {
            addCriterion("zjyzbddhgs is not null");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsEqualTo(String value) {
            addCriterion("zjyzbddhgs =", value, "zjyzbddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsNotEqualTo(String value) {
            addCriterion("zjyzbddhgs <>", value, "zjyzbddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsGreaterThan(String value) {
            addCriterion("zjyzbddhgs >", value, "zjyzbddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsGreaterThanOrEqualTo(String value) {
            addCriterion("zjyzbddhgs >=", value, "zjyzbddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsLessThan(String value) {
            addCriterion("zjyzbddhgs <", value, "zjyzbddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsLessThanOrEqualTo(String value) {
            addCriterion("zjyzbddhgs <=", value, "zjyzbddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsLike(String value) {
            addCriterion("zjyzbddhgs like", value, "zjyzbddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsNotLike(String value) {
            addCriterion("zjyzbddhgs not like", value, "zjyzbddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsIn(List<String> values) {
            addCriterion("zjyzbddhgs in", values, "zjyzbddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsNotIn(List<String> values) {
            addCriterion("zjyzbddhgs not in", values, "zjyzbddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsBetween(String value1, String value2) {
            addCriterion("zjyzbddhgs between", value1, value2, "zjyzbddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyzbddhgsNotBetween(String value1, String value2) {
            addCriterion("zjyzbddhgs not between", value1, value2, "zjyzbddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsIsNull() {
            addCriterion("zjyybddhgs is null");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsIsNotNull() {
            addCriterion("zjyybddhgs is not null");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsEqualTo(String value) {
            addCriterion("zjyybddhgs =", value, "zjyybddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsNotEqualTo(String value) {
            addCriterion("zjyybddhgs <>", value, "zjyybddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsGreaterThan(String value) {
            addCriterion("zjyybddhgs >", value, "zjyybddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsGreaterThanOrEqualTo(String value) {
            addCriterion("zjyybddhgs >=", value, "zjyybddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsLessThan(String value) {
            addCriterion("zjyybddhgs <", value, "zjyybddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsLessThanOrEqualTo(String value) {
            addCriterion("zjyybddhgs <=", value, "zjyybddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsLike(String value) {
            addCriterion("zjyybddhgs like", value, "zjyybddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsNotLike(String value) {
            addCriterion("zjyybddhgs not like", value, "zjyybddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsIn(List<String> values) {
            addCriterion("zjyybddhgs in", values, "zjyybddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsNotIn(List<String> values) {
            addCriterion("zjyybddhgs not in", values, "zjyybddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsBetween(String value1, String value2) {
            addCriterion("zjyybddhgs between", value1, value2, "zjyybddhgs");
            return (Criteria) this;
        }

        public Criteria andZjyybddhgsNotBetween(String value1, String value2) {
            addCriterion("zjyybddhgs not between", value1, value2, "zjyybddhgs");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsIsNull() {
            addCriterion("zyyzdctxhmgs is null");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsIsNotNull() {
            addCriterion("zyyzdctxhmgs is not null");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsEqualTo(String value) {
            addCriterion("zyyzdctxhmgs =", value, "zyyzdctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsNotEqualTo(String value) {
            addCriterion("zyyzdctxhmgs <>", value, "zyyzdctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsGreaterThan(String value) {
            addCriterion("zyyzdctxhmgs >", value, "zyyzdctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsGreaterThanOrEqualTo(String value) {
            addCriterion("zyyzdctxhmgs >=", value, "zyyzdctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsLessThan(String value) {
            addCriterion("zyyzdctxhmgs <", value, "zyyzdctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsLessThanOrEqualTo(String value) {
            addCriterion("zyyzdctxhmgs <=", value, "zyyzdctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsLike(String value) {
            addCriterion("zyyzdctxhmgs like", value, "zyyzdctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsNotLike(String value) {
            addCriterion("zyyzdctxhmgs not like", value, "zyyzdctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsIn(List<String> values) {
            addCriterion("zyyzdctxhmgs in", values, "zyyzdctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsNotIn(List<String> values) {
            addCriterion("zyyzdctxhmgs not in", values, "zyyzdctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsBetween(String value1, String value2) {
            addCriterion("zyyzdctxhmgs between", value1, value2, "zyyzdctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZyyzdctxhmgsNotBetween(String value1, String value2) {
            addCriterion("zyyzdctxhmgs not between", value1, value2, "zyyzdctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsIsNull() {
            addCriterion("zjyydctxhmgs is null");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsIsNotNull() {
            addCriterion("zjyydctxhmgs is not null");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsEqualTo(String value) {
            addCriterion("zjyydctxhmgs =", value, "zjyydctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsNotEqualTo(String value) {
            addCriterion("zjyydctxhmgs <>", value, "zjyydctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsGreaterThan(String value) {
            addCriterion("zjyydctxhmgs >", value, "zjyydctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsGreaterThanOrEqualTo(String value) {
            addCriterion("zjyydctxhmgs >=", value, "zjyydctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsLessThan(String value) {
            addCriterion("zjyydctxhmgs <", value, "zjyydctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsLessThanOrEqualTo(String value) {
            addCriterion("zjyydctxhmgs <=", value, "zjyydctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsLike(String value) {
            addCriterion("zjyydctxhmgs like", value, "zjyydctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsNotLike(String value) {
            addCriterion("zjyydctxhmgs not like", value, "zjyydctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsIn(List<String> values) {
            addCriterion("zjyydctxhmgs in", values, "zjyydctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsNotIn(List<String> values) {
            addCriterion("zjyydctxhmgs not in", values, "zjyydctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsBetween(String value1, String value2) {
            addCriterion("zjyydctxhmgs between", value1, value2, "zjyydctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjyydctxhmgsNotBetween(String value1, String value2) {
            addCriterion("zjyydctxhmgs not between", value1, value2, "zjyydctxhmgs");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhIsNull() {
            addCriterion("zjbnbdyhkhdh is null");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhIsNotNull() {
            addCriterion("zjbnbdyhkhdh is not null");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhEqualTo(String value) {
            addCriterion("zjbnbdyhkhdh =", value, "zjbnbdyhkhdh");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhNotEqualTo(String value) {
            addCriterion("zjbnbdyhkhdh <>", value, "zjbnbdyhkhdh");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhGreaterThan(String value) {
            addCriterion("zjbnbdyhkhdh >", value, "zjbnbdyhkhdh");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhGreaterThanOrEqualTo(String value) {
            addCriterion("zjbnbdyhkhdh >=", value, "zjbnbdyhkhdh");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhLessThan(String value) {
            addCriterion("zjbnbdyhkhdh <", value, "zjbnbdyhkhdh");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhLessThanOrEqualTo(String value) {
            addCriterion("zjbnbdyhkhdh <=", value, "zjbnbdyhkhdh");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhLike(String value) {
            addCriterion("zjbnbdyhkhdh like", value, "zjbnbdyhkhdh");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhNotLike(String value) {
            addCriterion("zjbnbdyhkhdh not like", value, "zjbnbdyhkhdh");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhIn(List<String> values) {
            addCriterion("zjbnbdyhkhdh in", values, "zjbnbdyhkhdh");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhNotIn(List<String> values) {
            addCriterion("zjbnbdyhkhdh not in", values, "zjbnbdyhkhdh");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhBetween(String value1, String value2) {
            addCriterion("zjbnbdyhkhdh between", value1, value2, "zjbnbdyhkhdh");
            return (Criteria) this;
        }

        public Criteria andZjbnbdyhkhdhNotBetween(String value1, String value2) {
            addCriterion("zjbnbdyhkhdh not between", value1, value2, "zjbnbdyhkhdh");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyIsNull() {
            addCriterion("zjbnsfchjzy is null");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyIsNotNull() {
            addCriterion("zjbnsfchjzy is not null");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyEqualTo(String value) {
            addCriterion("zjbnsfchjzy =", value, "zjbnsfchjzy");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyNotEqualTo(String value) {
            addCriterion("zjbnsfchjzy <>", value, "zjbnsfchjzy");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyGreaterThan(String value) {
            addCriterion("zjbnsfchjzy >", value, "zjbnsfchjzy");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyGreaterThanOrEqualTo(String value) {
            addCriterion("zjbnsfchjzy >=", value, "zjbnsfchjzy");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyLessThan(String value) {
            addCriterion("zjbnsfchjzy <", value, "zjbnsfchjzy");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyLessThanOrEqualTo(String value) {
            addCriterion("zjbnsfchjzy <=", value, "zjbnsfchjzy");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyLike(String value) {
            addCriterion("zjbnsfchjzy like", value, "zjbnsfchjzy");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyNotLike(String value) {
            addCriterion("zjbnsfchjzy not like", value, "zjbnsfchjzy");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyIn(List<String> values) {
            addCriterion("zjbnsfchjzy in", values, "zjbnsfchjzy");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyNotIn(List<String> values) {
            addCriterion("zjbnsfchjzy not in", values, "zjbnsfchjzy");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyBetween(String value1, String value2) {
            addCriterion("zjbnsfchjzy between", value1, value2, "zjbnsfchjzy");
            return (Criteria) this;
        }

        public Criteria andZjbnsfchjzyNotBetween(String value1, String value2) {
            addCriterion("zjbnsfchjzy not between", value1, value2, "zjbnsfchjzy");
            return (Criteria) this;
        }

        public Criteria andHmhydIsNull() {
            addCriterion("hmhyd is null");
            return (Criteria) this;
        }

        public Criteria andHmhydIsNotNull() {
            addCriterion("hmhyd is not null");
            return (Criteria) this;
        }

        public Criteria andHmhydEqualTo(String value) {
            addCriterion("hmhyd =", value, "hmhyd");
            return (Criteria) this;
        }

        public Criteria andHmhydNotEqualTo(String value) {
            addCriterion("hmhyd <>", value, "hmhyd");
            return (Criteria) this;
        }

        public Criteria andHmhydGreaterThan(String value) {
            addCriterion("hmhyd >", value, "hmhyd");
            return (Criteria) this;
        }

        public Criteria andHmhydGreaterThanOrEqualTo(String value) {
            addCriterion("hmhyd >=", value, "hmhyd");
            return (Criteria) this;
        }

        public Criteria andHmhydLessThan(String value) {
            addCriterion("hmhyd <", value, "hmhyd");
            return (Criteria) this;
        }

        public Criteria andHmhydLessThanOrEqualTo(String value) {
            addCriterion("hmhyd <=", value, "hmhyd");
            return (Criteria) this;
        }

        public Criteria andHmhydLike(String value) {
            addCriterion("hmhyd like", value, "hmhyd");
            return (Criteria) this;
        }

        public Criteria andHmhydNotLike(String value) {
            addCriterion("hmhyd not like", value, "hmhyd");
            return (Criteria) this;
        }

        public Criteria andHmhydIn(List<String> values) {
            addCriterion("hmhyd in", values, "hmhyd");
            return (Criteria) this;
        }

        public Criteria andHmhydNotIn(List<String> values) {
            addCriterion("hmhyd not in", values, "hmhyd");
            return (Criteria) this;
        }

        public Criteria andHmhydBetween(String value1, String value2) {
            addCriterion("hmhyd between", value1, value2, "hmhyd");
            return (Criteria) this;
        }

        public Criteria andHmhydNotBetween(String value1, String value2) {
            addCriterion("hmhyd not between", value1, value2, "hmhyd");
            return (Criteria) this;
        }

        public Criteria andKhrIsNull() {
            addCriterion("khr is null");
            return (Criteria) this;
        }

        public Criteria andKhrIsNotNull() {
            addCriterion("khr is not null");
            return (Criteria) this;
        }

        public Criteria andKhrEqualTo(String value) {
            addCriterion("khr =", value, "khr");
            return (Criteria) this;
        }

        public Criteria andKhrNotEqualTo(String value) {
            addCriterion("khr <>", value, "khr");
            return (Criteria) this;
        }

        public Criteria andKhrGreaterThan(String value) {
            addCriterion("khr >", value, "khr");
            return (Criteria) this;
        }

        public Criteria andKhrGreaterThanOrEqualTo(String value) {
            addCriterion("khr >=", value, "khr");
            return (Criteria) this;
        }

        public Criteria andKhrLessThan(String value) {
            addCriterion("khr <", value, "khr");
            return (Criteria) this;
        }

        public Criteria andKhrLessThanOrEqualTo(String value) {
            addCriterion("khr <=", value, "khr");
            return (Criteria) this;
        }

        public Criteria andKhrLike(String value) {
            addCriterion("khr like", value, "khr");
            return (Criteria) this;
        }

        public Criteria andKhrNotLike(String value) {
            addCriterion("khr not like", value, "khr");
            return (Criteria) this;
        }

        public Criteria andKhrIn(List<String> values) {
            addCriterion("khr in", values, "khr");
            return (Criteria) this;
        }

        public Criteria andKhrNotIn(List<String> values) {
            addCriterion("khr not in", values, "khr");
            return (Criteria) this;
        }

        public Criteria andKhrBetween(String value1, String value2) {
            addCriterion("khr between", value1, value2, "khr");
            return (Criteria) this;
        }

        public Criteria andKhrNotBetween(String value1, String value2) {
            addCriterion("khr not between", value1, value2, "khr");
            return (Criteria) this;
        }

        public Criteria andCyrIsNull() {
            addCriterion("cyr is null");
            return (Criteria) this;
        }

        public Criteria andCyrIsNotNull() {
            addCriterion("cyr is not null");
            return (Criteria) this;
        }

        public Criteria andCyrEqualTo(String value) {
            addCriterion("cyr =", value, "cyr");
            return (Criteria) this;
        }

        public Criteria andCyrNotEqualTo(String value) {
            addCriterion("cyr <>", value, "cyr");
            return (Criteria) this;
        }

        public Criteria andCyrGreaterThan(String value) {
            addCriterion("cyr >", value, "cyr");
            return (Criteria) this;
        }

        public Criteria andCyrGreaterThanOrEqualTo(String value) {
            addCriterion("cyr >=", value, "cyr");
            return (Criteria) this;
        }

        public Criteria andCyrLessThan(String value) {
            addCriterion("cyr <", value, "cyr");
            return (Criteria) this;
        }

        public Criteria andCyrLessThanOrEqualTo(String value) {
            addCriterion("cyr <=", value, "cyr");
            return (Criteria) this;
        }

        public Criteria andCyrLike(String value) {
            addCriterion("cyr like", value, "cyr");
            return (Criteria) this;
        }

        public Criteria andCyrNotLike(String value) {
            addCriterion("cyr not like", value, "cyr");
            return (Criteria) this;
        }

        public Criteria andCyrIn(List<String> values) {
            addCriterion("cyr in", values, "cyr");
            return (Criteria) this;
        }

        public Criteria andCyrNotIn(List<String> values) {
            addCriterion("cyr not in", values, "cyr");
            return (Criteria) this;
        }

        public Criteria andCyrBetween(String value1, String value2) {
            addCriterion("cyr between", value1, value2, "cyr");
            return (Criteria) this;
        }

        public Criteria andCyrNotBetween(String value1, String value2) {
            addCriterion("cyr not between", value1, value2, "cyr");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andZffsIsNull() {
            addCriterion("zffs is null");
            return (Criteria) this;
        }

        public Criteria andZffsIsNotNull() {
            addCriterion("zffs is not null");
            return (Criteria) this;
        }

        public Criteria andZffsEqualTo(String value) {
            addCriterion("zffs =", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsNotEqualTo(String value) {
            addCriterion("zffs <>", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsGreaterThan(String value) {
            addCriterion("zffs >", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsGreaterThanOrEqualTo(String value) {
            addCriterion("zffs >=", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsLessThan(String value) {
            addCriterion("zffs <", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsLessThanOrEqualTo(String value) {
            addCriterion("zffs <=", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsLike(String value) {
            addCriterion("zffs like", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsNotLike(String value) {
            addCriterion("zffs not like", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsIn(List<String> values) {
            addCriterion("zffs in", values, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsNotIn(List<String> values) {
            addCriterion("zffs not in", values, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsBetween(String value1, String value2) {
            addCriterion("zffs between", value1, value2, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsNotBetween(String value1, String value2) {
            addCriterion("zffs not between", value1, value2, "zffs");
            return (Criteria) this;
        }

        public Criteria andBdzhbIsNull() {
            addCriterion("bdzhb is null");
            return (Criteria) this;
        }

        public Criteria andBdzhbIsNotNull() {
            addCriterion("bdzhb is not null");
            return (Criteria) this;
        }

        public Criteria andBdzhbEqualTo(String value) {
            addCriterion("bdzhb =", value, "bdzhb");
            return (Criteria) this;
        }

        public Criteria andBdzhbNotEqualTo(String value) {
            addCriterion("bdzhb <>", value, "bdzhb");
            return (Criteria) this;
        }

        public Criteria andBdzhbGreaterThan(String value) {
            addCriterion("bdzhb >", value, "bdzhb");
            return (Criteria) this;
        }

        public Criteria andBdzhbGreaterThanOrEqualTo(String value) {
            addCriterion("bdzhb >=", value, "bdzhb");
            return (Criteria) this;
        }

        public Criteria andBdzhbLessThan(String value) {
            addCriterion("bdzhb <", value, "bdzhb");
            return (Criteria) this;
        }

        public Criteria andBdzhbLessThanOrEqualTo(String value) {
            addCriterion("bdzhb <=", value, "bdzhb");
            return (Criteria) this;
        }

        public Criteria andBdzhbLike(String value) {
            addCriterion("bdzhb like", value, "bdzhb");
            return (Criteria) this;
        }

        public Criteria andBdzhbNotLike(String value) {
            addCriterion("bdzhb not like", value, "bdzhb");
            return (Criteria) this;
        }

        public Criteria andBdzhbIn(List<String> values) {
            addCriterion("bdzhb in", values, "bdzhb");
            return (Criteria) this;
        }

        public Criteria andBdzhbNotIn(List<String> values) {
            addCriterion("bdzhb not in", values, "bdzhb");
            return (Criteria) this;
        }

        public Criteria andBdzhbBetween(String value1, String value2) {
            addCriterion("bdzhb between", value1, value2, "bdzhb");
            return (Criteria) this;
        }

        public Criteria andBdzhbNotBetween(String value1, String value2) {
            addCriterion("bdzhb not between", value1, value2, "bdzhb");
            return (Criteria) this;
        }

        public Criteria andBdwxIsNull() {
            addCriterion("bdwx is null");
            return (Criteria) this;
        }

        public Criteria andBdwxIsNotNull() {
            addCriterion("bdwx is not null");
            return (Criteria) this;
        }

        public Criteria andBdwxEqualTo(String value) {
            addCriterion("bdwx =", value, "bdwx");
            return (Criteria) this;
        }

        public Criteria andBdwxNotEqualTo(String value) {
            addCriterion("bdwx <>", value, "bdwx");
            return (Criteria) this;
        }

        public Criteria andBdwxGreaterThan(String value) {
            addCriterion("bdwx >", value, "bdwx");
            return (Criteria) this;
        }

        public Criteria andBdwxGreaterThanOrEqualTo(String value) {
            addCriterion("bdwx >=", value, "bdwx");
            return (Criteria) this;
        }

        public Criteria andBdwxLessThan(String value) {
            addCriterion("bdwx <", value, "bdwx");
            return (Criteria) this;
        }

        public Criteria andBdwxLessThanOrEqualTo(String value) {
            addCriterion("bdwx <=", value, "bdwx");
            return (Criteria) this;
        }

        public Criteria andBdwxLike(String value) {
            addCriterion("bdwx like", value, "bdwx");
            return (Criteria) this;
        }

        public Criteria andBdwxNotLike(String value) {
            addCriterion("bdwx not like", value, "bdwx");
            return (Criteria) this;
        }

        public Criteria andBdwxIn(List<String> values) {
            addCriterion("bdwx in", values, "bdwx");
            return (Criteria) this;
        }

        public Criteria andBdwxNotIn(List<String> values) {
            addCriterion("bdwx not in", values, "bdwx");
            return (Criteria) this;
        }

        public Criteria andBdwxBetween(String value1, String value2) {
            addCriterion("bdwx between", value1, value2, "bdwx");
            return (Criteria) this;
        }

        public Criteria andBdwxNotBetween(String value1, String value2) {
            addCriterion("bdwx not between", value1, value2, "bdwx");
            return (Criteria) this;
        }

        public Criteria andBdqqIsNull() {
            addCriterion("bdqq is null");
            return (Criteria) this;
        }

        public Criteria andBdqqIsNotNull() {
            addCriterion("bdqq is not null");
            return (Criteria) this;
        }

        public Criteria andBdqqEqualTo(String value) {
            addCriterion("bdqq =", value, "bdqq");
            return (Criteria) this;
        }

        public Criteria andBdqqNotEqualTo(String value) {
            addCriterion("bdqq <>", value, "bdqq");
            return (Criteria) this;
        }

        public Criteria andBdqqGreaterThan(String value) {
            addCriterion("bdqq >", value, "bdqq");
            return (Criteria) this;
        }

        public Criteria andBdqqGreaterThanOrEqualTo(String value) {
            addCriterion("bdqq >=", value, "bdqq");
            return (Criteria) this;
        }

        public Criteria andBdqqLessThan(String value) {
            addCriterion("bdqq <", value, "bdqq");
            return (Criteria) this;
        }

        public Criteria andBdqqLessThanOrEqualTo(String value) {
            addCriterion("bdqq <=", value, "bdqq");
            return (Criteria) this;
        }

        public Criteria andBdqqLike(String value) {
            addCriterion("bdqq like", value, "bdqq");
            return (Criteria) this;
        }

        public Criteria andBdqqNotLike(String value) {
            addCriterion("bdqq not like", value, "bdqq");
            return (Criteria) this;
        }

        public Criteria andBdqqIn(List<String> values) {
            addCriterion("bdqq in", values, "bdqq");
            return (Criteria) this;
        }

        public Criteria andBdqqNotIn(List<String> values) {
            addCriterion("bdqq not in", values, "bdqq");
            return (Criteria) this;
        }

        public Criteria andBdqqBetween(String value1, String value2) {
            addCriterion("bdqq between", value1, value2, "bdqq");
            return (Criteria) this;
        }

        public Criteria andBdqqNotBetween(String value1, String value2) {
            addCriterion("bdqq not between", value1, value2, "bdqq");
            return (Criteria) this;
        }

        public Criteria andBdyxIsNull() {
            addCriterion("bdyx is null");
            return (Criteria) this;
        }

        public Criteria andBdyxIsNotNull() {
            addCriterion("bdyx is not null");
            return (Criteria) this;
        }

        public Criteria andBdyxEqualTo(String value) {
            addCriterion("bdyx =", value, "bdyx");
            return (Criteria) this;
        }

        public Criteria andBdyxNotEqualTo(String value) {
            addCriterion("bdyx <>", value, "bdyx");
            return (Criteria) this;
        }

        public Criteria andBdyxGreaterThan(String value) {
            addCriterion("bdyx >", value, "bdyx");
            return (Criteria) this;
        }

        public Criteria andBdyxGreaterThanOrEqualTo(String value) {
            addCriterion("bdyx >=", value, "bdyx");
            return (Criteria) this;
        }

        public Criteria andBdyxLessThan(String value) {
            addCriterion("bdyx <", value, "bdyx");
            return (Criteria) this;
        }

        public Criteria andBdyxLessThanOrEqualTo(String value) {
            addCriterion("bdyx <=", value, "bdyx");
            return (Criteria) this;
        }

        public Criteria andBdyxLike(String value) {
            addCriterion("bdyx like", value, "bdyx");
            return (Criteria) this;
        }

        public Criteria andBdyxNotLike(String value) {
            addCriterion("bdyx not like", value, "bdyx");
            return (Criteria) this;
        }

        public Criteria andBdyxIn(List<String> values) {
            addCriterion("bdyx in", values, "bdyx");
            return (Criteria) this;
        }

        public Criteria andBdyxNotIn(List<String> values) {
            addCriterion("bdyx not in", values, "bdyx");
            return (Criteria) this;
        }

        public Criteria andBdyxBetween(String value1, String value2) {
            addCriterion("bdyx between", value1, value2, "bdyx");
            return (Criteria) this;
        }

        public Criteria andBdyxNotBetween(String value1, String value2) {
            addCriterion("bdyx not between", value1, value2, "bdyx");
            return (Criteria) this;
        }

        public Criteria andBdyhkIsNull() {
            addCriterion("bdyhk is null");
            return (Criteria) this;
        }

        public Criteria andBdyhkIsNotNull() {
            addCriterion("bdyhk is not null");
            return (Criteria) this;
        }

        public Criteria andBdyhkEqualTo(String value) {
            addCriterion("bdyhk =", value, "bdyhk");
            return (Criteria) this;
        }

        public Criteria andBdyhkNotEqualTo(String value) {
            addCriterion("bdyhk <>", value, "bdyhk");
            return (Criteria) this;
        }

        public Criteria andBdyhkGreaterThan(String value) {
            addCriterion("bdyhk >", value, "bdyhk");
            return (Criteria) this;
        }

        public Criteria andBdyhkGreaterThanOrEqualTo(String value) {
            addCriterion("bdyhk >=", value, "bdyhk");
            return (Criteria) this;
        }

        public Criteria andBdyhkLessThan(String value) {
            addCriterion("bdyhk <", value, "bdyhk");
            return (Criteria) this;
        }

        public Criteria andBdyhkLessThanOrEqualTo(String value) {
            addCriterion("bdyhk <=", value, "bdyhk");
            return (Criteria) this;
        }

        public Criteria andBdyhkLike(String value) {
            addCriterion("bdyhk like", value, "bdyhk");
            return (Criteria) this;
        }

        public Criteria andBdyhkNotLike(String value) {
            addCriterion("bdyhk not like", value, "bdyhk");
            return (Criteria) this;
        }

        public Criteria andBdyhkIn(List<String> values) {
            addCriterion("bdyhk in", values, "bdyhk");
            return (Criteria) this;
        }

        public Criteria andBdyhkNotIn(List<String> values) {
            addCriterion("bdyhk not in", values, "bdyhk");
            return (Criteria) this;
        }

        public Criteria andBdyhkBetween(String value1, String value2) {
            addCriterion("bdyhk between", value1, value2, "bdyhk");
            return (Criteria) this;
        }

        public Criteria andBdyhkNotBetween(String value1, String value2) {
            addCriterion("bdyhk not between", value1, value2, "bdyhk");
            return (Criteria) this;
        }

        public Criteria andBdhmIsNull() {
            addCriterion("bdhm is null");
            return (Criteria) this;
        }

        public Criteria andBdhmIsNotNull() {
            addCriterion("bdhm is not null");
            return (Criteria) this;
        }

        public Criteria andBdhmEqualTo(String value) {
            addCriterion("bdhm =", value, "bdhm");
            return (Criteria) this;
        }

        public Criteria andBdhmNotEqualTo(String value) {
            addCriterion("bdhm <>", value, "bdhm");
            return (Criteria) this;
        }

        public Criteria andBdhmGreaterThan(String value) {
            addCriterion("bdhm >", value, "bdhm");
            return (Criteria) this;
        }

        public Criteria andBdhmGreaterThanOrEqualTo(String value) {
            addCriterion("bdhm >=", value, "bdhm");
            return (Criteria) this;
        }

        public Criteria andBdhmLessThan(String value) {
            addCriterion("bdhm <", value, "bdhm");
            return (Criteria) this;
        }

        public Criteria andBdhmLessThanOrEqualTo(String value) {
            addCriterion("bdhm <=", value, "bdhm");
            return (Criteria) this;
        }

        public Criteria andBdhmLike(String value) {
            addCriterion("bdhm like", value, "bdhm");
            return (Criteria) this;
        }

        public Criteria andBdhmNotLike(String value) {
            addCriterion("bdhm not like", value, "bdhm");
            return (Criteria) this;
        }

        public Criteria andBdhmIn(List<String> values) {
            addCriterion("bdhm in", values, "bdhm");
            return (Criteria) this;
        }

        public Criteria andBdhmNotIn(List<String> values) {
            addCriterion("bdhm not in", values, "bdhm");
            return (Criteria) this;
        }

        public Criteria andBdhmBetween(String value1, String value2) {
            addCriterion("bdhm between", value1, value2, "bdhm");
            return (Criteria) this;
        }

        public Criteria andBdhmNotBetween(String value1, String value2) {
            addCriterion("bdhm not between", value1, value2, "bdhm");
            return (Criteria) this;
        }

        public Criteria andQqhmIsNull() {
            addCriterion("qqhm is null");
            return (Criteria) this;
        }

        public Criteria andQqhmIsNotNull() {
            addCriterion("qqhm is not null");
            return (Criteria) this;
        }

        public Criteria andQqhmEqualTo(String value) {
            addCriterion("qqhm =", value, "qqhm");
            return (Criteria) this;
        }

        public Criteria andQqhmNotEqualTo(String value) {
            addCriterion("qqhm <>", value, "qqhm");
            return (Criteria) this;
        }

        public Criteria andQqhmGreaterThan(String value) {
            addCriterion("qqhm >", value, "qqhm");
            return (Criteria) this;
        }

        public Criteria andQqhmGreaterThanOrEqualTo(String value) {
            addCriterion("qqhm >=", value, "qqhm");
            return (Criteria) this;
        }

        public Criteria andQqhmLessThan(String value) {
            addCriterion("qqhm <", value, "qqhm");
            return (Criteria) this;
        }

        public Criteria andQqhmLessThanOrEqualTo(String value) {
            addCriterion("qqhm <=", value, "qqhm");
            return (Criteria) this;
        }

        public Criteria andQqhmLike(String value) {
            addCriterion("qqhm like", value, "qqhm");
            return (Criteria) this;
        }

        public Criteria andQqhmNotLike(String value) {
            addCriterion("qqhm not like", value, "qqhm");
            return (Criteria) this;
        }

        public Criteria andQqhmIn(List<String> values) {
            addCriterion("qqhm in", values, "qqhm");
            return (Criteria) this;
        }

        public Criteria andQqhmNotIn(List<String> values) {
            addCriterion("qqhm not in", values, "qqhm");
            return (Criteria) this;
        }

        public Criteria andQqhmBetween(String value1, String value2) {
            addCriterion("qqhm between", value1, value2, "qqhm");
            return (Criteria) this;
        }

        public Criteria andQqhmNotBetween(String value1, String value2) {
            addCriterion("qqhm not between", value1, value2, "qqhm");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}