package com.ketech.bq.ketech.entity;

import java.util.ArrayList;
import java.util.List;

public class DmBqBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmBqBeanExample() {
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

        public Criteria andYhkhIsNull() {
            addCriterion("yhkh is null");
            return (Criteria) this;
        }

        public Criteria andYhkhIsNotNull() {
            addCriterion("yhkh is not null");
            return (Criteria) this;
        }

        public Criteria andYhkhEqualTo(String value) {
            addCriterion("yhkh =", value, "yhkh");
            return (Criteria) this;
        }

        public Criteria andYhkhNotEqualTo(String value) {
            addCriterion("yhkh <>", value, "yhkh");
            return (Criteria) this;
        }

        public Criteria andYhkhGreaterThan(String value) {
            addCriterion("yhkh >", value, "yhkh");
            return (Criteria) this;
        }

        public Criteria andYhkhGreaterThanOrEqualTo(String value) {
            addCriterion("yhkh >=", value, "yhkh");
            return (Criteria) this;
        }

        public Criteria andYhkhLessThan(String value) {
            addCriterion("yhkh <", value, "yhkh");
            return (Criteria) this;
        }

        public Criteria andYhkhLessThanOrEqualTo(String value) {
            addCriterion("yhkh <=", value, "yhkh");
            return (Criteria) this;
        }

        public Criteria andYhkhLike(String value) {
            addCriterion("yhkh like", value, "yhkh");
            return (Criteria) this;
        }

        public Criteria andYhkhNotLike(String value) {
            addCriterion("yhkh not like", value, "yhkh");
            return (Criteria) this;
        }

        public Criteria andYhkhIn(List<String> values) {
            addCriterion("yhkh in", values, "yhkh");
            return (Criteria) this;
        }

        public Criteria andYhkhNotIn(List<String> values) {
            addCriterion("yhkh not in", values, "yhkh");
            return (Criteria) this;
        }

        public Criteria andYhkhBetween(String value1, String value2) {
            addCriterion("yhkh between", value1, value2, "yhkh");
            return (Criteria) this;
        }

        public Criteria andYhkhNotBetween(String value1, String value2) {
            addCriterion("yhkh not between", value1, value2, "yhkh");
            return (Criteria) this;
        }

        public Criteria andZhhmlxIsNull() {
            addCriterion("zhhmlx is null");
            return (Criteria) this;
        }

        public Criteria andZhhmlxIsNotNull() {
            addCriterion("zhhmlx is not null");
            return (Criteria) this;
        }

        public Criteria andZhhmlxEqualTo(String value) {
            addCriterion("zhhmlx =", value, "zhhmlx");
            return (Criteria) this;
        }

        public Criteria andZhhmlxNotEqualTo(String value) {
            addCriterion("zhhmlx <>", value, "zhhmlx");
            return (Criteria) this;
        }

        public Criteria andZhhmlxGreaterThan(String value) {
            addCriterion("zhhmlx >", value, "zhhmlx");
            return (Criteria) this;
        }

        public Criteria andZhhmlxGreaterThanOrEqualTo(String value) {
            addCriterion("zhhmlx >=", value, "zhhmlx");
            return (Criteria) this;
        }

        public Criteria andZhhmlxLessThan(String value) {
            addCriterion("zhhmlx <", value, "zhhmlx");
            return (Criteria) this;
        }

        public Criteria andZhhmlxLessThanOrEqualTo(String value) {
            addCriterion("zhhmlx <=", value, "zhhmlx");
            return (Criteria) this;
        }

        public Criteria andZhhmlxLike(String value) {
            addCriterion("zhhmlx like", value, "zhhmlx");
            return (Criteria) this;
        }

        public Criteria andZhhmlxNotLike(String value) {
            addCriterion("zhhmlx not like", value, "zhhmlx");
            return (Criteria) this;
        }

        public Criteria andZhhmlxIn(List<String> values) {
            addCriterion("zhhmlx in", values, "zhhmlx");
            return (Criteria) this;
        }

        public Criteria andZhhmlxNotIn(List<String> values) {
            addCriterion("zhhmlx not in", values, "zhhmlx");
            return (Criteria) this;
        }

        public Criteria andZhhmlxBetween(String value1, String value2) {
            addCriterion("zhhmlx between", value1, value2, "zhhmlx");
            return (Criteria) this;
        }

        public Criteria andZhhmlxNotBetween(String value1, String value2) {
            addCriterion("zhhmlx not between", value1, value2, "zhhmlx");
            return (Criteria) this;
        }

        public Criteria andKhlxIsNull() {
            addCriterion("khlx is null");
            return (Criteria) this;
        }

        public Criteria andKhlxIsNotNull() {
            addCriterion("khlx is not null");
            return (Criteria) this;
        }

        public Criteria andKhlxEqualTo(String value) {
            addCriterion("khlx =", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxNotEqualTo(String value) {
            addCriterion("khlx <>", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxGreaterThan(String value) {
            addCriterion("khlx >", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxGreaterThanOrEqualTo(String value) {
            addCriterion("khlx >=", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxLessThan(String value) {
            addCriterion("khlx <", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxLessThanOrEqualTo(String value) {
            addCriterion("khlx <=", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxLike(String value) {
            addCriterion("khlx like", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxNotLike(String value) {
            addCriterion("khlx not like", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxIn(List<String> values) {
            addCriterion("khlx in", values, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxNotIn(List<String> values) {
            addCriterion("khlx not in", values, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxBetween(String value1, String value2) {
            addCriterion("khlx between", value1, value2, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxNotBetween(String value1, String value2) {
            addCriterion("khlx not between", value1, value2, "khlx");
            return (Criteria) this;
        }

        public Criteria andZhztIsNull() {
            addCriterion("zhzt is null");
            return (Criteria) this;
        }

        public Criteria andZhztIsNotNull() {
            addCriterion("zhzt is not null");
            return (Criteria) this;
        }

        public Criteria andZhztEqualTo(String value) {
            addCriterion("zhzt =", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztNotEqualTo(String value) {
            addCriterion("zhzt <>", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztGreaterThan(String value) {
            addCriterion("zhzt >", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztGreaterThanOrEqualTo(String value) {
            addCriterion("zhzt >=", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztLessThan(String value) {
            addCriterion("zhzt <", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztLessThanOrEqualTo(String value) {
            addCriterion("zhzt <=", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztLike(String value) {
            addCriterion("zhzt like", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztNotLike(String value) {
            addCriterion("zhzt not like", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztIn(List<String> values) {
            addCriterion("zhzt in", values, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztNotIn(List<String> values) {
            addCriterion("zhzt not in", values, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztBetween(String value1, String value2) {
            addCriterion("zhzt between", value1, value2, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztNotBetween(String value1, String value2) {
            addCriterion("zhzt not between", value1, value2, "zhzt");
            return (Criteria) this;
        }

        public Criteria andSfgzkIsNull() {
            addCriterion("sfgzk is null");
            return (Criteria) this;
        }

        public Criteria andSfgzkIsNotNull() {
            addCriterion("sfgzk is not null");
            return (Criteria) this;
        }

        public Criteria andSfgzkEqualTo(String value) {
            addCriterion("sfgzk =", value, "sfgzk");
            return (Criteria) this;
        }

        public Criteria andSfgzkNotEqualTo(String value) {
            addCriterion("sfgzk <>", value, "sfgzk");
            return (Criteria) this;
        }

        public Criteria andSfgzkGreaterThan(String value) {
            addCriterion("sfgzk >", value, "sfgzk");
            return (Criteria) this;
        }

        public Criteria andSfgzkGreaterThanOrEqualTo(String value) {
            addCriterion("sfgzk >=", value, "sfgzk");
            return (Criteria) this;
        }

        public Criteria andSfgzkLessThan(String value) {
            addCriterion("sfgzk <", value, "sfgzk");
            return (Criteria) this;
        }

        public Criteria andSfgzkLessThanOrEqualTo(String value) {
            addCriterion("sfgzk <=", value, "sfgzk");
            return (Criteria) this;
        }

        public Criteria andSfgzkLike(String value) {
            addCriterion("sfgzk like", value, "sfgzk");
            return (Criteria) this;
        }

        public Criteria andSfgzkNotLike(String value) {
            addCriterion("sfgzk not like", value, "sfgzk");
            return (Criteria) this;
        }

        public Criteria andSfgzkIn(List<String> values) {
            addCriterion("sfgzk in", values, "sfgzk");
            return (Criteria) this;
        }

        public Criteria andSfgzkNotIn(List<String> values) {
            addCriterion("sfgzk not in", values, "sfgzk");
            return (Criteria) this;
        }

        public Criteria andSfgzkBetween(String value1, String value2) {
            addCriterion("sfgzk between", value1, value2, "sfgzk");
            return (Criteria) this;
        }

        public Criteria andSfgzkNotBetween(String value1, String value2) {
            addCriterion("sfgzk not between", value1, value2, "sfgzk");
            return (Criteria) this;
        }

        public Criteria andSfzzkIsNull() {
            addCriterion("sfzzk is null");
            return (Criteria) this;
        }

        public Criteria andSfzzkIsNotNull() {
            addCriterion("sfzzk is not null");
            return (Criteria) this;
        }

        public Criteria andSfzzkEqualTo(String value) {
            addCriterion("sfzzk =", value, "sfzzk");
            return (Criteria) this;
        }

        public Criteria andSfzzkNotEqualTo(String value) {
            addCriterion("sfzzk <>", value, "sfzzk");
            return (Criteria) this;
        }

        public Criteria andSfzzkGreaterThan(String value) {
            addCriterion("sfzzk >", value, "sfzzk");
            return (Criteria) this;
        }

        public Criteria andSfzzkGreaterThanOrEqualTo(String value) {
            addCriterion("sfzzk >=", value, "sfzzk");
            return (Criteria) this;
        }

        public Criteria andSfzzkLessThan(String value) {
            addCriterion("sfzzk <", value, "sfzzk");
            return (Criteria) this;
        }

        public Criteria andSfzzkLessThanOrEqualTo(String value) {
            addCriterion("sfzzk <=", value, "sfzzk");
            return (Criteria) this;
        }

        public Criteria andSfzzkLike(String value) {
            addCriterion("sfzzk like", value, "sfzzk");
            return (Criteria) this;
        }

        public Criteria andSfzzkNotLike(String value) {
            addCriterion("sfzzk not like", value, "sfzzk");
            return (Criteria) this;
        }

        public Criteria andSfzzkIn(List<String> values) {
            addCriterion("sfzzk in", values, "sfzzk");
            return (Criteria) this;
        }

        public Criteria andSfzzkNotIn(List<String> values) {
            addCriterion("sfzzk not in", values, "sfzzk");
            return (Criteria) this;
        }

        public Criteria andSfzzkBetween(String value1, String value2) {
            addCriterion("sfzzk between", value1, value2, "sfzzk");
            return (Criteria) this;
        }

        public Criteria andSfzzkNotBetween(String value1, String value2) {
            addCriterion("sfzzk not between", value1, value2, "sfzzk");
            return (Criteria) this;
        }

        public Criteria andSfhjkIsNull() {
            addCriterion("sfhjk is null");
            return (Criteria) this;
        }

        public Criteria andSfhjkIsNotNull() {
            addCriterion("sfhjk is not null");
            return (Criteria) this;
        }

        public Criteria andSfhjkEqualTo(String value) {
            addCriterion("sfhjk =", value, "sfhjk");
            return (Criteria) this;
        }

        public Criteria andSfhjkNotEqualTo(String value) {
            addCriterion("sfhjk <>", value, "sfhjk");
            return (Criteria) this;
        }

        public Criteria andSfhjkGreaterThan(String value) {
            addCriterion("sfhjk >", value, "sfhjk");
            return (Criteria) this;
        }

        public Criteria andSfhjkGreaterThanOrEqualTo(String value) {
            addCriterion("sfhjk >=", value, "sfhjk");
            return (Criteria) this;
        }

        public Criteria andSfhjkLessThan(String value) {
            addCriterion("sfhjk <", value, "sfhjk");
            return (Criteria) this;
        }

        public Criteria andSfhjkLessThanOrEqualTo(String value) {
            addCriterion("sfhjk <=", value, "sfhjk");
            return (Criteria) this;
        }

        public Criteria andSfhjkLike(String value) {
            addCriterion("sfhjk like", value, "sfhjk");
            return (Criteria) this;
        }

        public Criteria andSfhjkNotLike(String value) {
            addCriterion("sfhjk not like", value, "sfhjk");
            return (Criteria) this;
        }

        public Criteria andSfhjkIn(List<String> values) {
            addCriterion("sfhjk in", values, "sfhjk");
            return (Criteria) this;
        }

        public Criteria andSfhjkNotIn(List<String> values) {
            addCriterion("sfhjk not in", values, "sfhjk");
            return (Criteria) this;
        }

        public Criteria andSfhjkBetween(String value1, String value2) {
            addCriterion("sfhjk between", value1, value2, "sfhjk");
            return (Criteria) this;
        }

        public Criteria andSfhjkNotBetween(String value1, String value2) {
            addCriterion("sfhjk not between", value1, value2, "sfhjk");
            return (Criteria) this;
        }

        public Criteria andSfshkIsNull() {
            addCriterion("sfshk is null");
            return (Criteria) this;
        }

        public Criteria andSfshkIsNotNull() {
            addCriterion("sfshk is not null");
            return (Criteria) this;
        }

        public Criteria andSfshkEqualTo(String value) {
            addCriterion("sfshk =", value, "sfshk");
            return (Criteria) this;
        }

        public Criteria andSfshkNotEqualTo(String value) {
            addCriterion("sfshk <>", value, "sfshk");
            return (Criteria) this;
        }

        public Criteria andSfshkGreaterThan(String value) {
            addCriterion("sfshk >", value, "sfshk");
            return (Criteria) this;
        }

        public Criteria andSfshkGreaterThanOrEqualTo(String value) {
            addCriterion("sfshk >=", value, "sfshk");
            return (Criteria) this;
        }

        public Criteria andSfshkLessThan(String value) {
            addCriterion("sfshk <", value, "sfshk");
            return (Criteria) this;
        }

        public Criteria andSfshkLessThanOrEqualTo(String value) {
            addCriterion("sfshk <=", value, "sfshk");
            return (Criteria) this;
        }

        public Criteria andSfshkLike(String value) {
            addCriterion("sfshk like", value, "sfshk");
            return (Criteria) this;
        }

        public Criteria andSfshkNotLike(String value) {
            addCriterion("sfshk not like", value, "sfshk");
            return (Criteria) this;
        }

        public Criteria andSfshkIn(List<String> values) {
            addCriterion("sfshk in", values, "sfshk");
            return (Criteria) this;
        }

        public Criteria andSfshkNotIn(List<String> values) {
            addCriterion("sfshk not in", values, "sfshk");
            return (Criteria) this;
        }

        public Criteria andSfshkBetween(String value1, String value2) {
            addCriterion("sfshk between", value1, value2, "sfshk");
            return (Criteria) this;
        }

        public Criteria andSfshkNotBetween(String value1, String value2) {
            addCriterion("sfshk not between", value1, value2, "sfshk");
            return (Criteria) this;
        }

        public Criteria andSftkkIsNull() {
            addCriterion("sftkk is null");
            return (Criteria) this;
        }

        public Criteria andSftkkIsNotNull() {
            addCriterion("sftkk is not null");
            return (Criteria) this;
        }

        public Criteria andSftkkEqualTo(String value) {
            addCriterion("sftkk =", value, "sftkk");
            return (Criteria) this;
        }

        public Criteria andSftkkNotEqualTo(String value) {
            addCriterion("sftkk <>", value, "sftkk");
            return (Criteria) this;
        }

        public Criteria andSftkkGreaterThan(String value) {
            addCriterion("sftkk >", value, "sftkk");
            return (Criteria) this;
        }

        public Criteria andSftkkGreaterThanOrEqualTo(String value) {
            addCriterion("sftkk >=", value, "sftkk");
            return (Criteria) this;
        }

        public Criteria andSftkkLessThan(String value) {
            addCriterion("sftkk <", value, "sftkk");
            return (Criteria) this;
        }

        public Criteria andSftkkLessThanOrEqualTo(String value) {
            addCriterion("sftkk <=", value, "sftkk");
            return (Criteria) this;
        }

        public Criteria andSftkkLike(String value) {
            addCriterion("sftkk like", value, "sftkk");
            return (Criteria) this;
        }

        public Criteria andSftkkNotLike(String value) {
            addCriterion("sftkk not like", value, "sftkk");
            return (Criteria) this;
        }

        public Criteria andSftkkIn(List<String> values) {
            addCriterion("sftkk in", values, "sftkk");
            return (Criteria) this;
        }

        public Criteria andSftkkNotIn(List<String> values) {
            addCriterion("sftkk not in", values, "sftkk");
            return (Criteria) this;
        }

        public Criteria andSftkkBetween(String value1, String value2) {
            addCriterion("sftkk between", value1, value2, "sftkk");
            return (Criteria) this;
        }

        public Criteria andSftkkNotBetween(String value1, String value2) {
            addCriterion("sftkk not between", value1, value2, "sftkk");
            return (Criteria) this;
        }

        public Criteria andSfsfkIsNull() {
            addCriterion("sfsfk is null");
            return (Criteria) this;
        }

        public Criteria andSfsfkIsNotNull() {
            addCriterion("sfsfk is not null");
            return (Criteria) this;
        }

        public Criteria andSfsfkEqualTo(String value) {
            addCriterion("sfsfk =", value, "sfsfk");
            return (Criteria) this;
        }

        public Criteria andSfsfkNotEqualTo(String value) {
            addCriterion("sfsfk <>", value, "sfsfk");
            return (Criteria) this;
        }

        public Criteria andSfsfkGreaterThan(String value) {
            addCriterion("sfsfk >", value, "sfsfk");
            return (Criteria) this;
        }

        public Criteria andSfsfkGreaterThanOrEqualTo(String value) {
            addCriterion("sfsfk >=", value, "sfsfk");
            return (Criteria) this;
        }

        public Criteria andSfsfkLessThan(String value) {
            addCriterion("sfsfk <", value, "sfsfk");
            return (Criteria) this;
        }

        public Criteria andSfsfkLessThanOrEqualTo(String value) {
            addCriterion("sfsfk <=", value, "sfsfk");
            return (Criteria) this;
        }

        public Criteria andSfsfkLike(String value) {
            addCriterion("sfsfk like", value, "sfsfk");
            return (Criteria) this;
        }

        public Criteria andSfsfkNotLike(String value) {
            addCriterion("sfsfk not like", value, "sfsfk");
            return (Criteria) this;
        }

        public Criteria andSfsfkIn(List<String> values) {
            addCriterion("sfsfk in", values, "sfsfk");
            return (Criteria) this;
        }

        public Criteria andSfsfkNotIn(List<String> values) {
            addCriterion("sfsfk not in", values, "sfsfk");
            return (Criteria) this;
        }

        public Criteria andSfsfkBetween(String value1, String value2) {
            addCriterion("sfsfk between", value1, value2, "sfsfk");
            return (Criteria) this;
        }

        public Criteria andSfsfkNotBetween(String value1, String value2) {
            addCriterion("sfsfk not between", value1, value2, "sfsfk");
            return (Criteria) this;
        }

        public Criteria andSfwdkIsNull() {
            addCriterion("sfwdk is null");
            return (Criteria) this;
        }

        public Criteria andSfwdkIsNotNull() {
            addCriterion("sfwdk is not null");
            return (Criteria) this;
        }

        public Criteria andSfwdkEqualTo(String value) {
            addCriterion("sfwdk =", value, "sfwdk");
            return (Criteria) this;
        }

        public Criteria andSfwdkNotEqualTo(String value) {
            addCriterion("sfwdk <>", value, "sfwdk");
            return (Criteria) this;
        }

        public Criteria andSfwdkGreaterThan(String value) {
            addCriterion("sfwdk >", value, "sfwdk");
            return (Criteria) this;
        }

        public Criteria andSfwdkGreaterThanOrEqualTo(String value) {
            addCriterion("sfwdk >=", value, "sfwdk");
            return (Criteria) this;
        }

        public Criteria andSfwdkLessThan(String value) {
            addCriterion("sfwdk <", value, "sfwdk");
            return (Criteria) this;
        }

        public Criteria andSfwdkLessThanOrEqualTo(String value) {
            addCriterion("sfwdk <=", value, "sfwdk");
            return (Criteria) this;
        }

        public Criteria andSfwdkLike(String value) {
            addCriterion("sfwdk like", value, "sfwdk");
            return (Criteria) this;
        }

        public Criteria andSfwdkNotLike(String value) {
            addCriterion("sfwdk not like", value, "sfwdk");
            return (Criteria) this;
        }

        public Criteria andSfwdkIn(List<String> values) {
            addCriterion("sfwdk in", values, "sfwdk");
            return (Criteria) this;
        }

        public Criteria andSfwdkNotIn(List<String> values) {
            addCriterion("sfwdk not in", values, "sfwdk");
            return (Criteria) this;
        }

        public Criteria andSfwdkBetween(String value1, String value2) {
            addCriterion("sfwdk between", value1, value2, "sfwdk");
            return (Criteria) this;
        }

        public Criteria andSfwdkNotBetween(String value1, String value2) {
            addCriterion("sfwdk not between", value1, value2, "sfwdk");
            return (Criteria) this;
        }

        public Criteria andSfqyzhIsNull() {
            addCriterion("sfqyzh is null");
            return (Criteria) this;
        }

        public Criteria andSfqyzhIsNotNull() {
            addCriterion("sfqyzh is not null");
            return (Criteria) this;
        }

        public Criteria andSfqyzhEqualTo(String value) {
            addCriterion("sfqyzh =", value, "sfqyzh");
            return (Criteria) this;
        }

        public Criteria andSfqyzhNotEqualTo(String value) {
            addCriterion("sfqyzh <>", value, "sfqyzh");
            return (Criteria) this;
        }

        public Criteria andSfqyzhGreaterThan(String value) {
            addCriterion("sfqyzh >", value, "sfqyzh");
            return (Criteria) this;
        }

        public Criteria andSfqyzhGreaterThanOrEqualTo(String value) {
            addCriterion("sfqyzh >=", value, "sfqyzh");
            return (Criteria) this;
        }

        public Criteria andSfqyzhLessThan(String value) {
            addCriterion("sfqyzh <", value, "sfqyzh");
            return (Criteria) this;
        }

        public Criteria andSfqyzhLessThanOrEqualTo(String value) {
            addCriterion("sfqyzh <=", value, "sfqyzh");
            return (Criteria) this;
        }

        public Criteria andSfqyzhLike(String value) {
            addCriterion("sfqyzh like", value, "sfqyzh");
            return (Criteria) this;
        }

        public Criteria andSfqyzhNotLike(String value) {
            addCriterion("sfqyzh not like", value, "sfqyzh");
            return (Criteria) this;
        }

        public Criteria andSfqyzhIn(List<String> values) {
            addCriterion("sfqyzh in", values, "sfqyzh");
            return (Criteria) this;
        }

        public Criteria andSfqyzhNotIn(List<String> values) {
            addCriterion("sfqyzh not in", values, "sfqyzh");
            return (Criteria) this;
        }

        public Criteria andSfqyzhBetween(String value1, String value2) {
            addCriterion("sfqyzh between", value1, value2, "sfqyzh");
            return (Criteria) this;
        }

        public Criteria andSfqyzhNotBetween(String value1, String value2) {
            addCriterion("sfqyzh not between", value1, value2, "sfqyzh");
            return (Criteria) this;
        }

        public Criteria andSfbrckIsNull() {
            addCriterion("sfbrck is null");
            return (Criteria) this;
        }

        public Criteria andSfbrckIsNotNull() {
            addCriterion("sfbrck is not null");
            return (Criteria) this;
        }

        public Criteria andSfbrckEqualTo(String value) {
            addCriterion("sfbrck =", value, "sfbrck");
            return (Criteria) this;
        }

        public Criteria andSfbrckNotEqualTo(String value) {
            addCriterion("sfbrck <>", value, "sfbrck");
            return (Criteria) this;
        }

        public Criteria andSfbrckGreaterThan(String value) {
            addCriterion("sfbrck >", value, "sfbrck");
            return (Criteria) this;
        }

        public Criteria andSfbrckGreaterThanOrEqualTo(String value) {
            addCriterion("sfbrck >=", value, "sfbrck");
            return (Criteria) this;
        }

        public Criteria andSfbrckLessThan(String value) {
            addCriterion("sfbrck <", value, "sfbrck");
            return (Criteria) this;
        }

        public Criteria andSfbrckLessThanOrEqualTo(String value) {
            addCriterion("sfbrck <=", value, "sfbrck");
            return (Criteria) this;
        }

        public Criteria andSfbrckLike(String value) {
            addCriterion("sfbrck like", value, "sfbrck");
            return (Criteria) this;
        }

        public Criteria andSfbrckNotLike(String value) {
            addCriterion("sfbrck not like", value, "sfbrck");
            return (Criteria) this;
        }

        public Criteria andSfbrckIn(List<String> values) {
            addCriterion("sfbrck in", values, "sfbrck");
            return (Criteria) this;
        }

        public Criteria andSfbrckNotIn(List<String> values) {
            addCriterion("sfbrck not in", values, "sfbrck");
            return (Criteria) this;
        }

        public Criteria andSfbrckBetween(String value1, String value2) {
            addCriterion("sfbrck between", value1, value2, "sfbrck");
            return (Criteria) this;
        }

        public Criteria andSfbrckNotBetween(String value1, String value2) {
            addCriterion("sfbrck not between", value1, value2, "sfbrck");
            return (Criteria) this;
        }

        public Criteria andSfxqkIsNull() {
            addCriterion("sfxqk is null");
            return (Criteria) this;
        }

        public Criteria andSfxqkIsNotNull() {
            addCriterion("sfxqk is not null");
            return (Criteria) this;
        }

        public Criteria andSfxqkEqualTo(String value) {
            addCriterion("sfxqk =", value, "sfxqk");
            return (Criteria) this;
        }

        public Criteria andSfxqkNotEqualTo(String value) {
            addCriterion("sfxqk <>", value, "sfxqk");
            return (Criteria) this;
        }

        public Criteria andSfxqkGreaterThan(String value) {
            addCriterion("sfxqk >", value, "sfxqk");
            return (Criteria) this;
        }

        public Criteria andSfxqkGreaterThanOrEqualTo(String value) {
            addCriterion("sfxqk >=", value, "sfxqk");
            return (Criteria) this;
        }

        public Criteria andSfxqkLessThan(String value) {
            addCriterion("sfxqk <", value, "sfxqk");
            return (Criteria) this;
        }

        public Criteria andSfxqkLessThanOrEqualTo(String value) {
            addCriterion("sfxqk <=", value, "sfxqk");
            return (Criteria) this;
        }

        public Criteria andSfxqkLike(String value) {
            addCriterion("sfxqk like", value, "sfxqk");
            return (Criteria) this;
        }

        public Criteria andSfxqkNotLike(String value) {
            addCriterion("sfxqk not like", value, "sfxqk");
            return (Criteria) this;
        }

        public Criteria andSfxqkIn(List<String> values) {
            addCriterion("sfxqk in", values, "sfxqk");
            return (Criteria) this;
        }

        public Criteria andSfxqkNotIn(List<String> values) {
            addCriterion("sfxqk not in", values, "sfxqk");
            return (Criteria) this;
        }

        public Criteria andSfxqkBetween(String value1, String value2) {
            addCriterion("sfxqk between", value1, value2, "sfxqk");
            return (Criteria) this;
        }

        public Criteria andSfxqkNotBetween(String value1, String value2) {
            addCriterion("sfxqk not between", value1, value2, "sfxqk");
            return (Criteria) this;
        }

        public Criteria andSfcskIsNull() {
            addCriterion("sfcsk is null");
            return (Criteria) this;
        }

        public Criteria andSfcskIsNotNull() {
            addCriterion("sfcsk is not null");
            return (Criteria) this;
        }

        public Criteria andSfcskEqualTo(String value) {
            addCriterion("sfcsk =", value, "sfcsk");
            return (Criteria) this;
        }

        public Criteria andSfcskNotEqualTo(String value) {
            addCriterion("sfcsk <>", value, "sfcsk");
            return (Criteria) this;
        }

        public Criteria andSfcskGreaterThan(String value) {
            addCriterion("sfcsk >", value, "sfcsk");
            return (Criteria) this;
        }

        public Criteria andSfcskGreaterThanOrEqualTo(String value) {
            addCriterion("sfcsk >=", value, "sfcsk");
            return (Criteria) this;
        }

        public Criteria andSfcskLessThan(String value) {
            addCriterion("sfcsk <", value, "sfcsk");
            return (Criteria) this;
        }

        public Criteria andSfcskLessThanOrEqualTo(String value) {
            addCriterion("sfcsk <=", value, "sfcsk");
            return (Criteria) this;
        }

        public Criteria andSfcskLike(String value) {
            addCriterion("sfcsk like", value, "sfcsk");
            return (Criteria) this;
        }

        public Criteria andSfcskNotLike(String value) {
            addCriterion("sfcsk not like", value, "sfcsk");
            return (Criteria) this;
        }

        public Criteria andSfcskIn(List<String> values) {
            addCriterion("sfcsk in", values, "sfcsk");
            return (Criteria) this;
        }

        public Criteria andSfcskNotIn(List<String> values) {
            addCriterion("sfcsk not in", values, "sfcsk");
            return (Criteria) this;
        }

        public Criteria andSfcskBetween(String value1, String value2) {
            addCriterion("sfcsk between", value1, value2, "sfcsk");
            return (Criteria) this;
        }

        public Criteria andSfcskNotBetween(String value1, String value2) {
            addCriterion("sfcsk not between", value1, value2, "sfcsk");
            return (Criteria) this;
        }

        public Criteria andSfsdkIsNull() {
            addCriterion("sfsdk is null");
            return (Criteria) this;
        }

        public Criteria andSfsdkIsNotNull() {
            addCriterion("sfsdk is not null");
            return (Criteria) this;
        }

        public Criteria andSfsdkEqualTo(String value) {
            addCriterion("sfsdk =", value, "sfsdk");
            return (Criteria) this;
        }

        public Criteria andSfsdkNotEqualTo(String value) {
            addCriterion("sfsdk <>", value, "sfsdk");
            return (Criteria) this;
        }

        public Criteria andSfsdkGreaterThan(String value) {
            addCriterion("sfsdk >", value, "sfsdk");
            return (Criteria) this;
        }

        public Criteria andSfsdkGreaterThanOrEqualTo(String value) {
            addCriterion("sfsdk >=", value, "sfsdk");
            return (Criteria) this;
        }

        public Criteria andSfsdkLessThan(String value) {
            addCriterion("sfsdk <", value, "sfsdk");
            return (Criteria) this;
        }

        public Criteria andSfsdkLessThanOrEqualTo(String value) {
            addCriterion("sfsdk <=", value, "sfsdk");
            return (Criteria) this;
        }

        public Criteria andSfsdkLike(String value) {
            addCriterion("sfsdk like", value, "sfsdk");
            return (Criteria) this;
        }

        public Criteria andSfsdkNotLike(String value) {
            addCriterion("sfsdk not like", value, "sfsdk");
            return (Criteria) this;
        }

        public Criteria andSfsdkIn(List<String> values) {
            addCriterion("sfsdk in", values, "sfsdk");
            return (Criteria) this;
        }

        public Criteria andSfsdkNotIn(List<String> values) {
            addCriterion("sfsdk not in", values, "sfsdk");
            return (Criteria) this;
        }

        public Criteria andSfsdkBetween(String value1, String value2) {
            addCriterion("sfsdk between", value1, value2, "sfsdk");
            return (Criteria) this;
        }

        public Criteria andSfsdkNotBetween(String value1, String value2) {
            addCriterion("sfsdk not between", value1, value2, "sfsdk");
            return (Criteria) this;
        }

        public Criteria andBqlyIsNull() {
            addCriterion("bqly is null");
            return (Criteria) this;
        }

        public Criteria andBqlyIsNotNull() {
            addCriterion("bqly is not null");
            return (Criteria) this;
        }

        public Criteria andBqlyEqualTo(String value) {
            addCriterion("bqly =", value, "bqly");
            return (Criteria) this;
        }

        public Criteria andBqlyNotEqualTo(String value) {
            addCriterion("bqly <>", value, "bqly");
            return (Criteria) this;
        }

        public Criteria andBqlyGreaterThan(String value) {
            addCriterion("bqly >", value, "bqly");
            return (Criteria) this;
        }

        public Criteria andBqlyGreaterThanOrEqualTo(String value) {
            addCriterion("bqly >=", value, "bqly");
            return (Criteria) this;
        }

        public Criteria andBqlyLessThan(String value) {
            addCriterion("bqly <", value, "bqly");
            return (Criteria) this;
        }

        public Criteria andBqlyLessThanOrEqualTo(String value) {
            addCriterion("bqly <=", value, "bqly");
            return (Criteria) this;
        }

        public Criteria andBqlyLike(String value) {
            addCriterion("bqly like", value, "bqly");
            return (Criteria) this;
        }

        public Criteria andBqlyNotLike(String value) {
            addCriterion("bqly not like", value, "bqly");
            return (Criteria) this;
        }

        public Criteria andBqlyIn(List<String> values) {
            addCriterion("bqly in", values, "bqly");
            return (Criteria) this;
        }

        public Criteria andBqlyNotIn(List<String> values) {
            addCriterion("bqly not in", values, "bqly");
            return (Criteria) this;
        }

        public Criteria andBqlyBetween(String value1, String value2) {
            addCriterion("bqly between", value1, value2, "bqly");
            return (Criteria) this;
        }

        public Criteria andBqlyNotBetween(String value1, String value2) {
            addCriterion("bqly not between", value1, value2, "bqly");
            return (Criteria) this;
        }

        public Criteria andZhczsjIsNull() {
            addCriterion("zhczsj is null");
            return (Criteria) this;
        }

        public Criteria andZhczsjIsNotNull() {
            addCriterion("zhczsj is not null");
            return (Criteria) this;
        }

        public Criteria andZhczsjEqualTo(String value) {
            addCriterion("zhczsj =", value, "zhczsj");
            return (Criteria) this;
        }

        public Criteria andZhczsjNotEqualTo(String value) {
            addCriterion("zhczsj <>", value, "zhczsj");
            return (Criteria) this;
        }

        public Criteria andZhczsjGreaterThan(String value) {
            addCriterion("zhczsj >", value, "zhczsj");
            return (Criteria) this;
        }

        public Criteria andZhczsjGreaterThanOrEqualTo(String value) {
            addCriterion("zhczsj >=", value, "zhczsj");
            return (Criteria) this;
        }

        public Criteria andZhczsjLessThan(String value) {
            addCriterion("zhczsj <", value, "zhczsj");
            return (Criteria) this;
        }

        public Criteria andZhczsjLessThanOrEqualTo(String value) {
            addCriterion("zhczsj <=", value, "zhczsj");
            return (Criteria) this;
        }

        public Criteria andZhczsjLike(String value) {
            addCriterion("zhczsj like", value, "zhczsj");
            return (Criteria) this;
        }

        public Criteria andZhczsjNotLike(String value) {
            addCriterion("zhczsj not like", value, "zhczsj");
            return (Criteria) this;
        }

        public Criteria andZhczsjIn(List<String> values) {
            addCriterion("zhczsj in", values, "zhczsj");
            return (Criteria) this;
        }

        public Criteria andZhczsjNotIn(List<String> values) {
            addCriterion("zhczsj not in", values, "zhczsj");
            return (Criteria) this;
        }

        public Criteria andZhczsjBetween(String value1, String value2) {
            addCriterion("zhczsj between", value1, value2, "zhczsj");
            return (Criteria) this;
        }

        public Criteria andZhczsjNotBetween(String value1, String value2) {
            addCriterion("zhczsj not between", value1, value2, "zhczsj");
            return (Criteria) this;
        }

        public Criteria andZhjyzhIsNull() {
            addCriterion("zhjyzh is null");
            return (Criteria) this;
        }

        public Criteria andZhjyzhIsNotNull() {
            addCriterion("zhjyzh is not null");
            return (Criteria) this;
        }

        public Criteria andZhjyzhEqualTo(String value) {
            addCriterion("zhjyzh =", value, "zhjyzh");
            return (Criteria) this;
        }

        public Criteria andZhjyzhNotEqualTo(String value) {
            addCriterion("zhjyzh <>", value, "zhjyzh");
            return (Criteria) this;
        }

        public Criteria andZhjyzhGreaterThan(String value) {
            addCriterion("zhjyzh >", value, "zhjyzh");
            return (Criteria) this;
        }

        public Criteria andZhjyzhGreaterThanOrEqualTo(String value) {
            addCriterion("zhjyzh >=", value, "zhjyzh");
            return (Criteria) this;
        }

        public Criteria andZhjyzhLessThan(String value) {
            addCriterion("zhjyzh <", value, "zhjyzh");
            return (Criteria) this;
        }

        public Criteria andZhjyzhLessThanOrEqualTo(String value) {
            addCriterion("zhjyzh <=", value, "zhjyzh");
            return (Criteria) this;
        }

        public Criteria andZhjyzhLike(String value) {
            addCriterion("zhjyzh like", value, "zhjyzh");
            return (Criteria) this;
        }

        public Criteria andZhjyzhNotLike(String value) {
            addCriterion("zhjyzh not like", value, "zhjyzh");
            return (Criteria) this;
        }

        public Criteria andZhjyzhIn(List<String> values) {
            addCriterion("zhjyzh in", values, "zhjyzh");
            return (Criteria) this;
        }

        public Criteria andZhjyzhNotIn(List<String> values) {
            addCriterion("zhjyzh not in", values, "zhjyzh");
            return (Criteria) this;
        }

        public Criteria andZhjyzhBetween(String value1, String value2) {
            addCriterion("zhjyzh between", value1, value2, "zhjyzh");
            return (Criteria) this;
        }

        public Criteria andZhjyzhNotBetween(String value1, String value2) {
            addCriterion("zhjyzh not between", value1, value2, "zhjyzh");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxIsNull() {
            addCriterion("zhjyzhlx is null");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxIsNotNull() {
            addCriterion("zhjyzhlx is not null");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxEqualTo(String value) {
            addCriterion("zhjyzhlx =", value, "zhjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxNotEqualTo(String value) {
            addCriterion("zhjyzhlx <>", value, "zhjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxGreaterThan(String value) {
            addCriterion("zhjyzhlx >", value, "zhjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxGreaterThanOrEqualTo(String value) {
            addCriterion("zhjyzhlx >=", value, "zhjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxLessThan(String value) {
            addCriterion("zhjyzhlx <", value, "zhjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxLessThanOrEqualTo(String value) {
            addCriterion("zhjyzhlx <=", value, "zhjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxLike(String value) {
            addCriterion("zhjyzhlx like", value, "zhjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxNotLike(String value) {
            addCriterion("zhjyzhlx not like", value, "zhjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxIn(List<String> values) {
            addCriterion("zhjyzhlx in", values, "zhjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxNotIn(List<String> values) {
            addCriterion("zhjyzhlx not in", values, "zhjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxBetween(String value1, String value2) {
            addCriterion("zhjyzhlx between", value1, value2, "zhjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZhjyzhlxNotBetween(String value1, String value2) {
            addCriterion("zhjyzhlx not between", value1, value2, "zhjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhIsNull() {
            addCriterion("zjyzzcjyzh is null");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhIsNotNull() {
            addCriterion("zjyzzcjyzh is not null");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhEqualTo(String value) {
            addCriterion("zjyzzcjyzh =", value, "zjyzzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhNotEqualTo(String value) {
            addCriterion("zjyzzcjyzh <>", value, "zjyzzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhGreaterThan(String value) {
            addCriterion("zjyzzcjyzh >", value, "zjyzzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhGreaterThanOrEqualTo(String value) {
            addCriterion("zjyzzcjyzh >=", value, "zjyzzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhLessThan(String value) {
            addCriterion("zjyzzcjyzh <", value, "zjyzzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhLessThanOrEqualTo(String value) {
            addCriterion("zjyzzcjyzh <=", value, "zjyzzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhLike(String value) {
            addCriterion("zjyzzcjyzh like", value, "zjyzzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhNotLike(String value) {
            addCriterion("zjyzzcjyzh not like", value, "zjyzzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhIn(List<String> values) {
            addCriterion("zjyzzcjyzh in", values, "zjyzzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhNotIn(List<String> values) {
            addCriterion("zjyzzcjyzh not in", values, "zjyzzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhBetween(String value1, String value2) {
            addCriterion("zjyzzcjyzh between", value1, value2, "zjyzzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhNotBetween(String value1, String value2) {
            addCriterion("zjyzzcjyzh not between", value1, value2, "zjyzzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxIsNull() {
            addCriterion("zjyzzcjyzhlx is null");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxIsNotNull() {
            addCriterion("zjyzzcjyzhlx is not null");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxEqualTo(String value) {
            addCriterion("zjyzzcjyzhlx =", value, "zjyzzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxNotEqualTo(String value) {
            addCriterion("zjyzzcjyzhlx <>", value, "zjyzzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxGreaterThan(String value) {
            addCriterion("zjyzzcjyzhlx >", value, "zjyzzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxGreaterThanOrEqualTo(String value) {
            addCriterion("zjyzzcjyzhlx >=", value, "zjyzzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxLessThan(String value) {
            addCriterion("zjyzzcjyzhlx <", value, "zjyzzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxLessThanOrEqualTo(String value) {
            addCriterion("zjyzzcjyzhlx <=", value, "zjyzzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxLike(String value) {
            addCriterion("zjyzzcjyzhlx like", value, "zjyzzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxNotLike(String value) {
            addCriterion("zjyzzcjyzhlx not like", value, "zjyzzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxIn(List<String> values) {
            addCriterion("zjyzzcjyzhlx in", values, "zjyzzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxNotIn(List<String> values) {
            addCriterion("zjyzzcjyzhlx not in", values, "zjyzzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxBetween(String value1, String value2) {
            addCriterion("zjyzzcjyzhlx between", value1, value2, "zjyzzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzzcjyzhlxNotBetween(String value1, String value2) {
            addCriterion("zjyzzcjyzhlx not between", value1, value2, "zjyzzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhIsNull() {
            addCriterion("zjyyzcjyzh is null");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhIsNotNull() {
            addCriterion("zjyyzcjyzh is not null");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhEqualTo(String value) {
            addCriterion("zjyyzcjyzh =", value, "zjyyzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhNotEqualTo(String value) {
            addCriterion("zjyyzcjyzh <>", value, "zjyyzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhGreaterThan(String value) {
            addCriterion("zjyyzcjyzh >", value, "zjyyzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhGreaterThanOrEqualTo(String value) {
            addCriterion("zjyyzcjyzh >=", value, "zjyyzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhLessThan(String value) {
            addCriterion("zjyyzcjyzh <", value, "zjyyzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhLessThanOrEqualTo(String value) {
            addCriterion("zjyyzcjyzh <=", value, "zjyyzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhLike(String value) {
            addCriterion("zjyyzcjyzh like", value, "zjyyzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhNotLike(String value) {
            addCriterion("zjyyzcjyzh not like", value, "zjyyzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhIn(List<String> values) {
            addCriterion("zjyyzcjyzh in", values, "zjyyzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhNotIn(List<String> values) {
            addCriterion("zjyyzcjyzh not in", values, "zjyyzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhBetween(String value1, String value2) {
            addCriterion("zjyyzcjyzh between", value1, value2, "zjyyzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhNotBetween(String value1, String value2) {
            addCriterion("zjyyzcjyzh not between", value1, value2, "zjyyzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxIsNull() {
            addCriterion("zjyyzcjyzhlx is null");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxIsNotNull() {
            addCriterion("zjyyzcjyzhlx is not null");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxEqualTo(String value) {
            addCriterion("zjyyzcjyzhlx =", value, "zjyyzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxNotEqualTo(String value) {
            addCriterion("zjyyzcjyzhlx <>", value, "zjyyzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxGreaterThan(String value) {
            addCriterion("zjyyzcjyzhlx >", value, "zjyyzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxGreaterThanOrEqualTo(String value) {
            addCriterion("zjyyzcjyzhlx >=", value, "zjyyzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxLessThan(String value) {
            addCriterion("zjyyzcjyzhlx <", value, "zjyyzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxLessThanOrEqualTo(String value) {
            addCriterion("zjyyzcjyzhlx <=", value, "zjyyzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxLike(String value) {
            addCriterion("zjyyzcjyzhlx like", value, "zjyyzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxNotLike(String value) {
            addCriterion("zjyyzcjyzhlx not like", value, "zjyyzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxIn(List<String> values) {
            addCriterion("zjyyzcjyzhlx in", values, "zjyyzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxNotIn(List<String> values) {
            addCriterion("zjyyzcjyzhlx not in", values, "zjyyzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxBetween(String value1, String value2) {
            addCriterion("zjyyzcjyzhlx between", value1, value2, "zjyyzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyyzcjyzhlxNotBetween(String value1, String value2) {
            addCriterion("zjyyzcjyzhlx not between", value1, value2, "zjyyzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhIsNull() {
            addCriterion("zjbnzcjyzh is null");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhIsNotNull() {
            addCriterion("zjbnzcjyzh is not null");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhEqualTo(String value) {
            addCriterion("zjbnzcjyzh =", value, "zjbnzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhNotEqualTo(String value) {
            addCriterion("zjbnzcjyzh <>", value, "zjbnzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhGreaterThan(String value) {
            addCriterion("zjbnzcjyzh >", value, "zjbnzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhGreaterThanOrEqualTo(String value) {
            addCriterion("zjbnzcjyzh >=", value, "zjbnzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhLessThan(String value) {
            addCriterion("zjbnzcjyzh <", value, "zjbnzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhLessThanOrEqualTo(String value) {
            addCriterion("zjbnzcjyzh <=", value, "zjbnzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhLike(String value) {
            addCriterion("zjbnzcjyzh like", value, "zjbnzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhNotLike(String value) {
            addCriterion("zjbnzcjyzh not like", value, "zjbnzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhIn(List<String> values) {
            addCriterion("zjbnzcjyzh in", values, "zjbnzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhNotIn(List<String> values) {
            addCriterion("zjbnzcjyzh not in", values, "zjbnzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhBetween(String value1, String value2) {
            addCriterion("zjbnzcjyzh between", value1, value2, "zjbnzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhNotBetween(String value1, String value2) {
            addCriterion("zjbnzcjyzh not between", value1, value2, "zjbnzcjyzh");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxIsNull() {
            addCriterion("zjbnzcjyzhlx is null");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxIsNotNull() {
            addCriterion("zjbnzcjyzhlx is not null");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxEqualTo(String value) {
            addCriterion("zjbnzcjyzhlx =", value, "zjbnzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxNotEqualTo(String value) {
            addCriterion("zjbnzcjyzhlx <>", value, "zjbnzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxGreaterThan(String value) {
            addCriterion("zjbnzcjyzhlx >", value, "zjbnzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxGreaterThanOrEqualTo(String value) {
            addCriterion("zjbnzcjyzhlx >=", value, "zjbnzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxLessThan(String value) {
            addCriterion("zjbnzcjyzhlx <", value, "zjbnzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxLessThanOrEqualTo(String value) {
            addCriterion("zjbnzcjyzhlx <=", value, "zjbnzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxLike(String value) {
            addCriterion("zjbnzcjyzhlx like", value, "zjbnzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxNotLike(String value) {
            addCriterion("zjbnzcjyzhlx not like", value, "zjbnzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxIn(List<String> values) {
            addCriterion("zjbnzcjyzhlx in", values, "zjbnzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxNotIn(List<String> values) {
            addCriterion("zjbnzcjyzhlx not in", values, "zjbnzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxBetween(String value1, String value2) {
            addCriterion("zjbnzcjyzhlx between", value1, value2, "zjbnzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjbnzcjyzhlxNotBetween(String value1, String value2) {
            addCriterion("zjbnzcjyzhlx not between", value1, value2, "zjbnzcjyzhlx");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeIsNull() {
            addCriterion("zjyzczze is null");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeIsNotNull() {
            addCriterion("zjyzczze is not null");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeEqualTo(String value) {
            addCriterion("zjyzczze =", value, "zjyzczze");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeNotEqualTo(String value) {
            addCriterion("zjyzczze <>", value, "zjyzczze");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeGreaterThan(String value) {
            addCriterion("zjyzczze >", value, "zjyzczze");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeGreaterThanOrEqualTo(String value) {
            addCriterion("zjyzczze >=", value, "zjyzczze");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeLessThan(String value) {
            addCriterion("zjyzczze <", value, "zjyzczze");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeLessThanOrEqualTo(String value) {
            addCriterion("zjyzczze <=", value, "zjyzczze");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeLike(String value) {
            addCriterion("zjyzczze like", value, "zjyzczze");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeNotLike(String value) {
            addCriterion("zjyzczze not like", value, "zjyzczze");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeIn(List<String> values) {
            addCriterion("zjyzczze in", values, "zjyzczze");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeNotIn(List<String> values) {
            addCriterion("zjyzczze not in", values, "zjyzczze");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeBetween(String value1, String value2) {
            addCriterion("zjyzczze between", value1, value2, "zjyzczze");
            return (Criteria) this;
        }

        public Criteria andZjyzczzeNotBetween(String value1, String value2) {
            addCriterion("zjyzczze not between", value1, value2, "zjyzczze");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeIsNull() {
            addCriterion("zjyyczze is null");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeIsNotNull() {
            addCriterion("zjyyczze is not null");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeEqualTo(String value) {
            addCriterion("zjyyczze =", value, "zjyyczze");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeNotEqualTo(String value) {
            addCriterion("zjyyczze <>", value, "zjyyczze");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeGreaterThan(String value) {
            addCriterion("zjyyczze >", value, "zjyyczze");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeGreaterThanOrEqualTo(String value) {
            addCriterion("zjyyczze >=", value, "zjyyczze");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeLessThan(String value) {
            addCriterion("zjyyczze <", value, "zjyyczze");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeLessThanOrEqualTo(String value) {
            addCriterion("zjyyczze <=", value, "zjyyczze");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeLike(String value) {
            addCriterion("zjyyczze like", value, "zjyyczze");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeNotLike(String value) {
            addCriterion("zjyyczze not like", value, "zjyyczze");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeIn(List<String> values) {
            addCriterion("zjyyczze in", values, "zjyyczze");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeNotIn(List<String> values) {
            addCriterion("zjyyczze not in", values, "zjyyczze");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeBetween(String value1, String value2) {
            addCriterion("zjyyczze between", value1, value2, "zjyyczze");
            return (Criteria) this;
        }

        public Criteria andZjyyczzeNotBetween(String value1, String value2) {
            addCriterion("zjyyczze not between", value1, value2, "zjyyczze");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeIsNull() {
            addCriterion("zjbnczze is null");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeIsNotNull() {
            addCriterion("zjbnczze is not null");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeEqualTo(String value) {
            addCriterion("zjbnczze =", value, "zjbnczze");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeNotEqualTo(String value) {
            addCriterion("zjbnczze <>", value, "zjbnczze");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeGreaterThan(String value) {
            addCriterion("zjbnczze >", value, "zjbnczze");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeGreaterThanOrEqualTo(String value) {
            addCriterion("zjbnczze >=", value, "zjbnczze");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeLessThan(String value) {
            addCriterion("zjbnczze <", value, "zjbnczze");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeLessThanOrEqualTo(String value) {
            addCriterion("zjbnczze <=", value, "zjbnczze");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeLike(String value) {
            addCriterion("zjbnczze like", value, "zjbnczze");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeNotLike(String value) {
            addCriterion("zjbnczze not like", value, "zjbnczze");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeIn(List<String> values) {
            addCriterion("zjbnczze in", values, "zjbnczze");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeNotIn(List<String> values) {
            addCriterion("zjbnczze not in", values, "zjbnczze");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeBetween(String value1, String value2) {
            addCriterion("zjbnczze between", value1, value2, "zjbnczze");
            return (Criteria) this;
        }

        public Criteria andZjbnczzeNotBetween(String value1, String value2) {
            addCriterion("zjbnczze not between", value1, value2, "zjbnczze");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeIsNull() {
            addCriterion("zjyzrzze is null");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeIsNotNull() {
            addCriterion("zjyzrzze is not null");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeEqualTo(String value) {
            addCriterion("zjyzrzze =", value, "zjyzrzze");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeNotEqualTo(String value) {
            addCriterion("zjyzrzze <>", value, "zjyzrzze");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeGreaterThan(String value) {
            addCriterion("zjyzrzze >", value, "zjyzrzze");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeGreaterThanOrEqualTo(String value) {
            addCriterion("zjyzrzze >=", value, "zjyzrzze");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeLessThan(String value) {
            addCriterion("zjyzrzze <", value, "zjyzrzze");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeLessThanOrEqualTo(String value) {
            addCriterion("zjyzrzze <=", value, "zjyzrzze");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeLike(String value) {
            addCriterion("zjyzrzze like", value, "zjyzrzze");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeNotLike(String value) {
            addCriterion("zjyzrzze not like", value, "zjyzrzze");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeIn(List<String> values) {
            addCriterion("zjyzrzze in", values, "zjyzrzze");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeNotIn(List<String> values) {
            addCriterion("zjyzrzze not in", values, "zjyzrzze");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeBetween(String value1, String value2) {
            addCriterion("zjyzrzze between", value1, value2, "zjyzrzze");
            return (Criteria) this;
        }

        public Criteria andZjyzrzzeNotBetween(String value1, String value2) {
            addCriterion("zjyzrzze not between", value1, value2, "zjyzrzze");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeIsNull() {
            addCriterion("zjyyrzze is null");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeIsNotNull() {
            addCriterion("zjyyrzze is not null");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeEqualTo(String value) {
            addCriterion("zjyyrzze =", value, "zjyyrzze");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeNotEqualTo(String value) {
            addCriterion("zjyyrzze <>", value, "zjyyrzze");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeGreaterThan(String value) {
            addCriterion("zjyyrzze >", value, "zjyyrzze");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeGreaterThanOrEqualTo(String value) {
            addCriterion("zjyyrzze >=", value, "zjyyrzze");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeLessThan(String value) {
            addCriterion("zjyyrzze <", value, "zjyyrzze");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeLessThanOrEqualTo(String value) {
            addCriterion("zjyyrzze <=", value, "zjyyrzze");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeLike(String value) {
            addCriterion("zjyyrzze like", value, "zjyyrzze");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeNotLike(String value) {
            addCriterion("zjyyrzze not like", value, "zjyyrzze");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeIn(List<String> values) {
            addCriterion("zjyyrzze in", values, "zjyyrzze");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeNotIn(List<String> values) {
            addCriterion("zjyyrzze not in", values, "zjyyrzze");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeBetween(String value1, String value2) {
            addCriterion("zjyyrzze between", value1, value2, "zjyyrzze");
            return (Criteria) this;
        }

        public Criteria andZjyyrzzeNotBetween(String value1, String value2) {
            addCriterion("zjyyrzze not between", value1, value2, "zjyyrzze");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeIsNull() {
            addCriterion("zjbnrzze is null");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeIsNotNull() {
            addCriterion("zjbnrzze is not null");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeEqualTo(String value) {
            addCriterion("zjbnrzze =", value, "zjbnrzze");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeNotEqualTo(String value) {
            addCriterion("zjbnrzze <>", value, "zjbnrzze");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeGreaterThan(String value) {
            addCriterion("zjbnrzze >", value, "zjbnrzze");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeGreaterThanOrEqualTo(String value) {
            addCriterion("zjbnrzze >=", value, "zjbnrzze");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeLessThan(String value) {
            addCriterion("zjbnrzze <", value, "zjbnrzze");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeLessThanOrEqualTo(String value) {
            addCriterion("zjbnrzze <=", value, "zjbnrzze");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeLike(String value) {
            addCriterion("zjbnrzze like", value, "zjbnrzze");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeNotLike(String value) {
            addCriterion("zjbnrzze not like", value, "zjbnrzze");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeIn(List<String> values) {
            addCriterion("zjbnrzze in", values, "zjbnrzze");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeNotIn(List<String> values) {
            addCriterion("zjbnrzze not in", values, "zjbnrzze");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeBetween(String value1, String value2) {
            addCriterion("zjbnrzze between", value1, value2, "zjbnrzze");
            return (Criteria) this;
        }

        public Criteria andZjbnrzzeNotBetween(String value1, String value2) {
            addCriterion("zjbnrzze not between", value1, value2, "zjbnrzze");
            return (Criteria) this;
        }

        public Criteria andCzIpIsNull() {
            addCriterion("cz_ip is null");
            return (Criteria) this;
        }

        public Criteria andCzIpIsNotNull() {
            addCriterion("cz_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCzIpEqualTo(String value) {
            addCriterion("cz_ip =", value, "czIp");
            return (Criteria) this;
        }

        public Criteria andCzIpNotEqualTo(String value) {
            addCriterion("cz_ip <>", value, "czIp");
            return (Criteria) this;
        }

        public Criteria andCzIpGreaterThan(String value) {
            addCriterion("cz_ip >", value, "czIp");
            return (Criteria) this;
        }

        public Criteria andCzIpGreaterThanOrEqualTo(String value) {
            addCriterion("cz_ip >=", value, "czIp");
            return (Criteria) this;
        }

        public Criteria andCzIpLessThan(String value) {
            addCriterion("cz_ip <", value, "czIp");
            return (Criteria) this;
        }

        public Criteria andCzIpLessThanOrEqualTo(String value) {
            addCriterion("cz_ip <=", value, "czIp");
            return (Criteria) this;
        }

        public Criteria andCzIpLike(String value) {
            addCriterion("cz_ip like", value, "czIp");
            return (Criteria) this;
        }

        public Criteria andCzIpNotLike(String value) {
            addCriterion("cz_ip not like", value, "czIp");
            return (Criteria) this;
        }

        public Criteria andCzIpIn(List<String> values) {
            addCriterion("cz_ip in", values, "czIp");
            return (Criteria) this;
        }

        public Criteria andCzIpNotIn(List<String> values) {
            addCriterion("cz_ip not in", values, "czIp");
            return (Criteria) this;
        }

        public Criteria andCzIpBetween(String value1, String value2) {
            addCriterion("cz_ip between", value1, value2, "czIp");
            return (Criteria) this;
        }

        public Criteria andCzIpNotBetween(String value1, String value2) {
            addCriterion("cz_ip not between", value1, value2, "czIp");
            return (Criteria) this;
        }

        public Criteria andGddhIsNull() {
            addCriterion("gddh is null");
            return (Criteria) this;
        }

        public Criteria andGddhIsNotNull() {
            addCriterion("gddh is not null");
            return (Criteria) this;
        }

        public Criteria andGddhEqualTo(String value) {
            addCriterion("gddh =", value, "gddh");
            return (Criteria) this;
        }

        public Criteria andGddhNotEqualTo(String value) {
            addCriterion("gddh <>", value, "gddh");
            return (Criteria) this;
        }

        public Criteria andGddhGreaterThan(String value) {
            addCriterion("gddh >", value, "gddh");
            return (Criteria) this;
        }

        public Criteria andGddhGreaterThanOrEqualTo(String value) {
            addCriterion("gddh >=", value, "gddh");
            return (Criteria) this;
        }

        public Criteria andGddhLessThan(String value) {
            addCriterion("gddh <", value, "gddh");
            return (Criteria) this;
        }

        public Criteria andGddhLessThanOrEqualTo(String value) {
            addCriterion("gddh <=", value, "gddh");
            return (Criteria) this;
        }

        public Criteria andGddhLike(String value) {
            addCriterion("gddh like", value, "gddh");
            return (Criteria) this;
        }

        public Criteria andGddhNotLike(String value) {
            addCriterion("gddh not like", value, "gddh");
            return (Criteria) this;
        }

        public Criteria andGddhIn(List<String> values) {
            addCriterion("gddh in", values, "gddh");
            return (Criteria) this;
        }

        public Criteria andGddhNotIn(List<String> values) {
            addCriterion("gddh not in", values, "gddh");
            return (Criteria) this;
        }

        public Criteria andGddhBetween(String value1, String value2) {
            addCriterion("gddh between", value1, value2, "gddh");
            return (Criteria) this;
        }

        public Criteria andGddhNotBetween(String value1, String value2) {
            addCriterion("gddh not between", value1, value2, "gddh");
            return (Criteria) this;
        }

        public Criteria andGldhIsNull() {
            addCriterion("gldh is null");
            return (Criteria) this;
        }

        public Criteria andGldhIsNotNull() {
            addCriterion("gldh is not null");
            return (Criteria) this;
        }

        public Criteria andGldhEqualTo(String value) {
            addCriterion("gldh =", value, "gldh");
            return (Criteria) this;
        }

        public Criteria andGldhNotEqualTo(String value) {
            addCriterion("gldh <>", value, "gldh");
            return (Criteria) this;
        }

        public Criteria andGldhGreaterThan(String value) {
            addCriterion("gldh >", value, "gldh");
            return (Criteria) this;
        }

        public Criteria andGldhGreaterThanOrEqualTo(String value) {
            addCriterion("gldh >=", value, "gldh");
            return (Criteria) this;
        }

        public Criteria andGldhLessThan(String value) {
            addCriterion("gldh <", value, "gldh");
            return (Criteria) this;
        }

        public Criteria andGldhLessThanOrEqualTo(String value) {
            addCriterion("gldh <=", value, "gldh");
            return (Criteria) this;
        }

        public Criteria andGldhLike(String value) {
            addCriterion("gldh like", value, "gldh");
            return (Criteria) this;
        }

        public Criteria andGldhNotLike(String value) {
            addCriterion("gldh not like", value, "gldh");
            return (Criteria) this;
        }

        public Criteria andGldhIn(List<String> values) {
            addCriterion("gldh in", values, "gldh");
            return (Criteria) this;
        }

        public Criteria andGldhNotIn(List<String> values) {
            addCriterion("gldh not in", values, "gldh");
            return (Criteria) this;
        }

        public Criteria andGldhBetween(String value1, String value2) {
            addCriterion("gldh between", value1, value2, "gldh");
            return (Criteria) this;
        }

        public Criteria andGldhNotBetween(String value1, String value2) {
            addCriterion("gldh not between", value1, value2, "gldh");
            return (Criteria) this;
        }

        public Criteria andDzyxIsNull() {
            addCriterion("dzyx is null");
            return (Criteria) this;
        }

        public Criteria andDzyxIsNotNull() {
            addCriterion("dzyx is not null");
            return (Criteria) this;
        }

        public Criteria andDzyxEqualTo(String value) {
            addCriterion("dzyx =", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotEqualTo(String value) {
            addCriterion("dzyx <>", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxGreaterThan(String value) {
            addCriterion("dzyx >", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxGreaterThanOrEqualTo(String value) {
            addCriterion("dzyx >=", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLessThan(String value) {
            addCriterion("dzyx <", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLessThanOrEqualTo(String value) {
            addCriterion("dzyx <=", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLike(String value) {
            addCriterion("dzyx like", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotLike(String value) {
            addCriterion("dzyx not like", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxIn(List<String> values) {
            addCriterion("dzyx in", values, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotIn(List<String> values) {
            addCriterion("dzyx not in", values, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxBetween(String value1, String value2) {
            addCriterion("dzyx between", value1, value2, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotBetween(String value1, String value2) {
            addCriterion("dzyx not between", value1, value2, "dzyx");
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

        public Criteria andCkrsfzIsNull() {
            addCriterion("ckrsfz is null");
            return (Criteria) this;
        }

        public Criteria andCkrsfzIsNotNull() {
            addCriterion("ckrsfz is not null");
            return (Criteria) this;
        }

        public Criteria andCkrsfzEqualTo(String value) {
            addCriterion("ckrsfz =", value, "ckrsfz");
            return (Criteria) this;
        }

        public Criteria andCkrsfzNotEqualTo(String value) {
            addCriterion("ckrsfz <>", value, "ckrsfz");
            return (Criteria) this;
        }

        public Criteria andCkrsfzGreaterThan(String value) {
            addCriterion("ckrsfz >", value, "ckrsfz");
            return (Criteria) this;
        }

        public Criteria andCkrsfzGreaterThanOrEqualTo(String value) {
            addCriterion("ckrsfz >=", value, "ckrsfz");
            return (Criteria) this;
        }

        public Criteria andCkrsfzLessThan(String value) {
            addCriterion("ckrsfz <", value, "ckrsfz");
            return (Criteria) this;
        }

        public Criteria andCkrsfzLessThanOrEqualTo(String value) {
            addCriterion("ckrsfz <=", value, "ckrsfz");
            return (Criteria) this;
        }

        public Criteria andCkrsfzLike(String value) {
            addCriterion("ckrsfz like", value, "ckrsfz");
            return (Criteria) this;
        }

        public Criteria andCkrsfzNotLike(String value) {
            addCriterion("ckrsfz not like", value, "ckrsfz");
            return (Criteria) this;
        }

        public Criteria andCkrsfzIn(List<String> values) {
            addCriterion("ckrsfz in", values, "ckrsfz");
            return (Criteria) this;
        }

        public Criteria andCkrsfzNotIn(List<String> values) {
            addCriterion("ckrsfz not in", values, "ckrsfz");
            return (Criteria) this;
        }

        public Criteria andCkrsfzBetween(String value1, String value2) {
            addCriterion("ckrsfz between", value1, value2, "ckrsfz");
            return (Criteria) this;
        }

        public Criteria andCkrsfzNotBetween(String value1, String value2) {
            addCriterion("ckrsfz not between", value1, value2, "ckrsfz");
            return (Criteria) this;
        }

        public Criteria andKhyhIsNull() {
            addCriterion("khyh is null");
            return (Criteria) this;
        }

        public Criteria andKhyhIsNotNull() {
            addCriterion("khyh is not null");
            return (Criteria) this;
        }

        public Criteria andKhyhEqualTo(String value) {
            addCriterion("khyh =", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhNotEqualTo(String value) {
            addCriterion("khyh <>", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhGreaterThan(String value) {
            addCriterion("khyh >", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhGreaterThanOrEqualTo(String value) {
            addCriterion("khyh >=", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhLessThan(String value) {
            addCriterion("khyh <", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhLessThanOrEqualTo(String value) {
            addCriterion("khyh <=", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhLike(String value) {
            addCriterion("khyh like", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhNotLike(String value) {
            addCriterion("khyh not like", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhIn(List<String> values) {
            addCriterion("khyh in", values, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhNotIn(List<String> values) {
            addCriterion("khyh not in", values, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhBetween(String value1, String value2) {
            addCriterion("khyh between", value1, value2, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhNotBetween(String value1, String value2) {
            addCriterion("khyh not between", value1, value2, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhddIsNull() {
            addCriterion("khdd is null");
            return (Criteria) this;
        }

        public Criteria andKhddIsNotNull() {
            addCriterion("khdd is not null");
            return (Criteria) this;
        }

        public Criteria andKhddEqualTo(String value) {
            addCriterion("khdd =", value, "khdd");
            return (Criteria) this;
        }

        public Criteria andKhddNotEqualTo(String value) {
            addCriterion("khdd <>", value, "khdd");
            return (Criteria) this;
        }

        public Criteria andKhddGreaterThan(String value) {
            addCriterion("khdd >", value, "khdd");
            return (Criteria) this;
        }

        public Criteria andKhddGreaterThanOrEqualTo(String value) {
            addCriterion("khdd >=", value, "khdd");
            return (Criteria) this;
        }

        public Criteria andKhddLessThan(String value) {
            addCriterion("khdd <", value, "khdd");
            return (Criteria) this;
        }

        public Criteria andKhddLessThanOrEqualTo(String value) {
            addCriterion("khdd <=", value, "khdd");
            return (Criteria) this;
        }

        public Criteria andKhddLike(String value) {
            addCriterion("khdd like", value, "khdd");
            return (Criteria) this;
        }

        public Criteria andKhddNotLike(String value) {
            addCriterion("khdd not like", value, "khdd");
            return (Criteria) this;
        }

        public Criteria andKhddIn(List<String> values) {
            addCriterion("khdd in", values, "khdd");
            return (Criteria) this;
        }

        public Criteria andKhddNotIn(List<String> values) {
            addCriterion("khdd not in", values, "khdd");
            return (Criteria) this;
        }

        public Criteria andKhddBetween(String value1, String value2) {
            addCriterion("khdd between", value1, value2, "khdd");
            return (Criteria) this;
        }

        public Criteria andKhddNotBetween(String value1, String value2) {
            addCriterion("khdd not between", value1, value2, "khdd");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNull() {
            addCriterion("zjhm is null");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNotNull() {
            addCriterion("zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andZjhmEqualTo(String value) {
            addCriterion("zjhm =", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotEqualTo(String value) {
            addCriterion("zjhm <>", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThan(String value) {
            addCriterion("zjhm >", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("zjhm >=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThan(String value) {
            addCriterion("zjhm <", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThanOrEqualTo(String value) {
            addCriterion("zjhm <=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLike(String value) {
            addCriterion("zjhm like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotLike(String value) {
            addCriterion("zjhm not like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmIn(List<String> values) {
            addCriterion("zjhm in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotIn(List<String> values) {
            addCriterion("zjhm not in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmBetween(String value1, String value2) {
            addCriterion("zjhm between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotBetween(String value1, String value2) {
            addCriterion("zjhm not between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andBdQqIsNull() {
            addCriterion("bd_qq is null");
            return (Criteria) this;
        }

        public Criteria andBdQqIsNotNull() {
            addCriterion("bd_qq is not null");
            return (Criteria) this;
        }

        public Criteria andBdQqEqualTo(String value) {
            addCriterion("bd_qq =", value, "bdQq");
            return (Criteria) this;
        }

        public Criteria andBdQqNotEqualTo(String value) {
            addCriterion("bd_qq <>", value, "bdQq");
            return (Criteria) this;
        }

        public Criteria andBdQqGreaterThan(String value) {
            addCriterion("bd_qq >", value, "bdQq");
            return (Criteria) this;
        }

        public Criteria andBdQqGreaterThanOrEqualTo(String value) {
            addCriterion("bd_qq >=", value, "bdQq");
            return (Criteria) this;
        }

        public Criteria andBdQqLessThan(String value) {
            addCriterion("bd_qq <", value, "bdQq");
            return (Criteria) this;
        }

        public Criteria andBdQqLessThanOrEqualTo(String value) {
            addCriterion("bd_qq <=", value, "bdQq");
            return (Criteria) this;
        }

        public Criteria andBdQqLike(String value) {
            addCriterion("bd_qq like", value, "bdQq");
            return (Criteria) this;
        }

        public Criteria andBdQqNotLike(String value) {
            addCriterion("bd_qq not like", value, "bdQq");
            return (Criteria) this;
        }

        public Criteria andBdQqIn(List<String> values) {
            addCriterion("bd_qq in", values, "bdQq");
            return (Criteria) this;
        }

        public Criteria andBdQqNotIn(List<String> values) {
            addCriterion("bd_qq not in", values, "bdQq");
            return (Criteria) this;
        }

        public Criteria andBdQqBetween(String value1, String value2) {
            addCriterion("bd_qq between", value1, value2, "bdQq");
            return (Criteria) this;
        }

        public Criteria andBdQqNotBetween(String value1, String value2) {
            addCriterion("bd_qq not between", value1, value2, "bdQq");
            return (Criteria) this;
        }

        public Criteria andBdWxIsNull() {
            addCriterion("bd_wx is null");
            return (Criteria) this;
        }

        public Criteria andBdWxIsNotNull() {
            addCriterion("bd_wx is not null");
            return (Criteria) this;
        }

        public Criteria andBdWxEqualTo(String value) {
            addCriterion("bd_wx =", value, "bdWx");
            return (Criteria) this;
        }

        public Criteria andBdWxNotEqualTo(String value) {
            addCriterion("bd_wx <>", value, "bdWx");
            return (Criteria) this;
        }

        public Criteria andBdWxGreaterThan(String value) {
            addCriterion("bd_wx >", value, "bdWx");
            return (Criteria) this;
        }

        public Criteria andBdWxGreaterThanOrEqualTo(String value) {
            addCriterion("bd_wx >=", value, "bdWx");
            return (Criteria) this;
        }

        public Criteria andBdWxLessThan(String value) {
            addCriterion("bd_wx <", value, "bdWx");
            return (Criteria) this;
        }

        public Criteria andBdWxLessThanOrEqualTo(String value) {
            addCriterion("bd_wx <=", value, "bdWx");
            return (Criteria) this;
        }

        public Criteria andBdWxLike(String value) {
            addCriterion("bd_wx like", value, "bdWx");
            return (Criteria) this;
        }

        public Criteria andBdWxNotLike(String value) {
            addCriterion("bd_wx not like", value, "bdWx");
            return (Criteria) this;
        }

        public Criteria andBdWxIn(List<String> values) {
            addCriterion("bd_wx in", values, "bdWx");
            return (Criteria) this;
        }

        public Criteria andBdWxNotIn(List<String> values) {
            addCriterion("bd_wx not in", values, "bdWx");
            return (Criteria) this;
        }

        public Criteria andBdWxBetween(String value1, String value2) {
            addCriterion("bd_wx between", value1, value2, "bdWx");
            return (Criteria) this;
        }

        public Criteria andBdWxNotBetween(String value1, String value2) {
            addCriterion("bd_wx not between", value1, value2, "bdWx");
            return (Criteria) this;
        }

        public Criteria andBdZfbIsNull() {
            addCriterion("bd_zfb is null");
            return (Criteria) this;
        }

        public Criteria andBdZfbIsNotNull() {
            addCriterion("bd_zfb is not null");
            return (Criteria) this;
        }

        public Criteria andBdZfbEqualTo(String value) {
            addCriterion("bd_zfb =", value, "bdZfb");
            return (Criteria) this;
        }

        public Criteria andBdZfbNotEqualTo(String value) {
            addCriterion("bd_zfb <>", value, "bdZfb");
            return (Criteria) this;
        }

        public Criteria andBdZfbGreaterThan(String value) {
            addCriterion("bd_zfb >", value, "bdZfb");
            return (Criteria) this;
        }

        public Criteria andBdZfbGreaterThanOrEqualTo(String value) {
            addCriterion("bd_zfb >=", value, "bdZfb");
            return (Criteria) this;
        }

        public Criteria andBdZfbLessThan(String value) {
            addCriterion("bd_zfb <", value, "bdZfb");
            return (Criteria) this;
        }

        public Criteria andBdZfbLessThanOrEqualTo(String value) {
            addCriterion("bd_zfb <=", value, "bdZfb");
            return (Criteria) this;
        }

        public Criteria andBdZfbLike(String value) {
            addCriterion("bd_zfb like", value, "bdZfb");
            return (Criteria) this;
        }

        public Criteria andBdZfbNotLike(String value) {
            addCriterion("bd_zfb not like", value, "bdZfb");
            return (Criteria) this;
        }

        public Criteria andBdZfbIn(List<String> values) {
            addCriterion("bd_zfb in", values, "bdZfb");
            return (Criteria) this;
        }

        public Criteria andBdZfbNotIn(List<String> values) {
            addCriterion("bd_zfb not in", values, "bdZfb");
            return (Criteria) this;
        }

        public Criteria andBdZfbBetween(String value1, String value2) {
            addCriterion("bd_zfb between", value1, value2, "bdZfb");
            return (Criteria) this;
        }

        public Criteria andBdZfbNotBetween(String value1, String value2) {
            addCriterion("bd_zfb not between", value1, value2, "bdZfb");
            return (Criteria) this;
        }

        public Criteria andSjyhhmIsNull() {
            addCriterion("sjyhhm is null");
            return (Criteria) this;
        }

        public Criteria andSjyhhmIsNotNull() {
            addCriterion("sjyhhm is not null");
            return (Criteria) this;
        }

        public Criteria andSjyhhmEqualTo(String value) {
            addCriterion("sjyhhm =", value, "sjyhhm");
            return (Criteria) this;
        }

        public Criteria andSjyhhmNotEqualTo(String value) {
            addCriterion("sjyhhm <>", value, "sjyhhm");
            return (Criteria) this;
        }

        public Criteria andSjyhhmGreaterThan(String value) {
            addCriterion("sjyhhm >", value, "sjyhhm");
            return (Criteria) this;
        }

        public Criteria andSjyhhmGreaterThanOrEqualTo(String value) {
            addCriterion("sjyhhm >=", value, "sjyhhm");
            return (Criteria) this;
        }

        public Criteria andSjyhhmLessThan(String value) {
            addCriterion("sjyhhm <", value, "sjyhhm");
            return (Criteria) this;
        }

        public Criteria andSjyhhmLessThanOrEqualTo(String value) {
            addCriterion("sjyhhm <=", value, "sjyhhm");
            return (Criteria) this;
        }

        public Criteria andSjyhhmLike(String value) {
            addCriterion("sjyhhm like", value, "sjyhhm");
            return (Criteria) this;
        }

        public Criteria andSjyhhmNotLike(String value) {
            addCriterion("sjyhhm not like", value, "sjyhhm");
            return (Criteria) this;
        }

        public Criteria andSjyhhmIn(List<String> values) {
            addCriterion("sjyhhm in", values, "sjyhhm");
            return (Criteria) this;
        }

        public Criteria andSjyhhmNotIn(List<String> values) {
            addCriterion("sjyhhm not in", values, "sjyhhm");
            return (Criteria) this;
        }

        public Criteria andSjyhhmBetween(String value1, String value2) {
            addCriterion("sjyhhm between", value1, value2, "sjyhhm");
            return (Criteria) this;
        }

        public Criteria andSjyhhmNotBetween(String value1, String value2) {
            addCriterion("sjyhhm not between", value1, value2, "sjyhhm");
            return (Criteria) this;
        }

        public Criteria andBdCftIsNull() {
            addCriterion("bd_cft is null");
            return (Criteria) this;
        }

        public Criteria andBdCftIsNotNull() {
            addCriterion("bd_cft is not null");
            return (Criteria) this;
        }

        public Criteria andBdCftEqualTo(String value) {
            addCriterion("bd_cft =", value, "bdCft");
            return (Criteria) this;
        }

        public Criteria andBdCftNotEqualTo(String value) {
            addCriterion("bd_cft <>", value, "bdCft");
            return (Criteria) this;
        }

        public Criteria andBdCftGreaterThan(String value) {
            addCriterion("bd_cft >", value, "bdCft");
            return (Criteria) this;
        }

        public Criteria andBdCftGreaterThanOrEqualTo(String value) {
            addCriterion("bd_cft >=", value, "bdCft");
            return (Criteria) this;
        }

        public Criteria andBdCftLessThan(String value) {
            addCriterion("bd_cft <", value, "bdCft");
            return (Criteria) this;
        }

        public Criteria andBdCftLessThanOrEqualTo(String value) {
            addCriterion("bd_cft <=", value, "bdCft");
            return (Criteria) this;
        }

        public Criteria andBdCftLike(String value) {
            addCriterion("bd_cft like", value, "bdCft");
            return (Criteria) this;
        }

        public Criteria andBdCftNotLike(String value) {
            addCriterion("bd_cft not like", value, "bdCft");
            return (Criteria) this;
        }

        public Criteria andBdCftIn(List<String> values) {
            addCriterion("bd_cft in", values, "bdCft");
            return (Criteria) this;
        }

        public Criteria andBdCftNotIn(List<String> values) {
            addCriterion("bd_cft not in", values, "bdCft");
            return (Criteria) this;
        }

        public Criteria andBdCftBetween(String value1, String value2) {
            addCriterion("bd_cft between", value1, value2, "bdCft");
            return (Criteria) this;
        }

        public Criteria andBdCftNotBetween(String value1, String value2) {
            addCriterion("bd_cft not between", value1, value2, "bdCft");
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