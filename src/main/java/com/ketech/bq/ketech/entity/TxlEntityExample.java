package com.ketech.bq.ketech.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TxlEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TxlEntityExample() {
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

        public Criteria andBhIsNull() {
            addCriterion("BH is null");
            return (Criteria) this;
        }

        public Criteria andBhIsNotNull() {
            addCriterion("BH is not null");
            return (Criteria) this;
        }

        public Criteria andBhEqualTo(String value) {
            addCriterion("BH =", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotEqualTo(String value) {
            addCriterion("BH <>", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThan(String value) {
            addCriterion("BH >", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThanOrEqualTo(String value) {
            addCriterion("BH >=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThan(String value) {
            addCriterion("BH <", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThanOrEqualTo(String value) {
            addCriterion("BH <=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLike(String value) {
            addCriterion("BH like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotLike(String value) {
            addCriterion("BH not like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhIn(List<String> values) {
            addCriterion("BH in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotIn(List<String> values) {
            addCriterion("BH not in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhBetween(String value1, String value2) {
            addCriterion("BH between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotBetween(String value1, String value2) {
            addCriterion("BH not between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andGlzhmIsNull() {
            addCriterion("GLZHM is null");
            return (Criteria) this;
        }

        public Criteria andGlzhmIsNotNull() {
            addCriterion("GLZHM is not null");
            return (Criteria) this;
        }

        public Criteria andGlzhmEqualTo(String value) {
            addCriterion("GLZHM =", value, "glzhm");
            return (Criteria) this;
        }

        public Criteria andGlzhmNotEqualTo(String value) {
            addCriterion("GLZHM <>", value, "glzhm");
            return (Criteria) this;
        }

        public Criteria andGlzhmGreaterThan(String value) {
            addCriterion("GLZHM >", value, "glzhm");
            return (Criteria) this;
        }

        public Criteria andGlzhmGreaterThanOrEqualTo(String value) {
            addCriterion("GLZHM >=", value, "glzhm");
            return (Criteria) this;
        }

        public Criteria andGlzhmLessThan(String value) {
            addCriterion("GLZHM <", value, "glzhm");
            return (Criteria) this;
        }

        public Criteria andGlzhmLessThanOrEqualTo(String value) {
            addCriterion("GLZHM <=", value, "glzhm");
            return (Criteria) this;
        }

        public Criteria andGlzhmLike(String value) {
            addCriterion("GLZHM like", value, "glzhm");
            return (Criteria) this;
        }

        public Criteria andGlzhmNotLike(String value) {
            addCriterion("GLZHM not like", value, "glzhm");
            return (Criteria) this;
        }

        public Criteria andGlzhmIn(List<String> values) {
            addCriterion("GLZHM in", values, "glzhm");
            return (Criteria) this;
        }

        public Criteria andGlzhmNotIn(List<String> values) {
            addCriterion("GLZHM not in", values, "glzhm");
            return (Criteria) this;
        }

        public Criteria andGlzhmBetween(String value1, String value2) {
            addCriterion("GLZHM between", value1, value2, "glzhm");
            return (Criteria) this;
        }

        public Criteria andGlzhmNotBetween(String value1, String value2) {
            addCriterion("GLZHM not between", value1, value2, "glzhm");
            return (Criteria) this;
        }

        public Criteria andGlzbidIsNull() {
            addCriterion("GLZBID is null");
            return (Criteria) this;
        }

        public Criteria andGlzbidIsNotNull() {
            addCriterion("GLZBID is not null");
            return (Criteria) this;
        }

        public Criteria andGlzbidEqualTo(String value) {
            addCriterion("GLZBID =", value, "glzbid");
            return (Criteria) this;
        }

        public Criteria andGlzbidNotEqualTo(String value) {
            addCriterion("GLZBID <>", value, "glzbid");
            return (Criteria) this;
        }

        public Criteria andGlzbidGreaterThan(String value) {
            addCriterion("GLZBID >", value, "glzbid");
            return (Criteria) this;
        }

        public Criteria andGlzbidGreaterThanOrEqualTo(String value) {
            addCriterion("GLZBID >=", value, "glzbid");
            return (Criteria) this;
        }

        public Criteria andGlzbidLessThan(String value) {
            addCriterion("GLZBID <", value, "glzbid");
            return (Criteria) this;
        }

        public Criteria andGlzbidLessThanOrEqualTo(String value) {
            addCriterion("GLZBID <=", value, "glzbid");
            return (Criteria) this;
        }

        public Criteria andGlzbidLike(String value) {
            addCriterion("GLZBID like", value, "glzbid");
            return (Criteria) this;
        }

        public Criteria andGlzbidNotLike(String value) {
            addCriterion("GLZBID not like", value, "glzbid");
            return (Criteria) this;
        }

        public Criteria andGlzbidIn(List<String> values) {
            addCriterion("GLZBID in", values, "glzbid");
            return (Criteria) this;
        }

        public Criteria andGlzbidNotIn(List<String> values) {
            addCriterion("GLZBID not in", values, "glzbid");
            return (Criteria) this;
        }

        public Criteria andGlzbidBetween(String value1, String value2) {
            addCriterion("GLZBID between", value1, value2, "glzbid");
            return (Criteria) this;
        }

        public Criteria andGlzbidNotBetween(String value1, String value2) {
            addCriterion("GLZBID not between", value1, value2, "glzbid");
            return (Criteria) this;
        }

        public Criteria andTxllxIsNull() {
            addCriterion("TXLLX is null");
            return (Criteria) this;
        }

        public Criteria andTxllxIsNotNull() {
            addCriterion("TXLLX is not null");
            return (Criteria) this;
        }

        public Criteria andTxllxEqualTo(String value) {
            addCriterion("TXLLX =", value, "txllx");
            return (Criteria) this;
        }

        public Criteria andTxllxNotEqualTo(String value) {
            addCriterion("TXLLX <>", value, "txllx");
            return (Criteria) this;
        }

        public Criteria andTxllxGreaterThan(String value) {
            addCriterion("TXLLX >", value, "txllx");
            return (Criteria) this;
        }

        public Criteria andTxllxGreaterThanOrEqualTo(String value) {
            addCriterion("TXLLX >=", value, "txllx");
            return (Criteria) this;
        }

        public Criteria andTxllxLessThan(String value) {
            addCriterion("TXLLX <", value, "txllx");
            return (Criteria) this;
        }

        public Criteria andTxllxLessThanOrEqualTo(String value) {
            addCriterion("TXLLX <=", value, "txllx");
            return (Criteria) this;
        }

        public Criteria andTxllxLike(String value) {
            addCriterion("TXLLX like", value, "txllx");
            return (Criteria) this;
        }

        public Criteria andTxllxNotLike(String value) {
            addCriterion("TXLLX not like", value, "txllx");
            return (Criteria) this;
        }

        public Criteria andTxllxIn(List<String> values) {
            addCriterion("TXLLX in", values, "txllx");
            return (Criteria) this;
        }

        public Criteria andTxllxNotIn(List<String> values) {
            addCriterion("TXLLX not in", values, "txllx");
            return (Criteria) this;
        }

        public Criteria andTxllxBetween(String value1, String value2) {
            addCriterion("TXLLX between", value1, value2, "txllx");
            return (Criteria) this;
        }

        public Criteria andTxllxNotBetween(String value1, String value2) {
            addCriterion("TXLLX not between", value1, value2, "txllx");
            return (Criteria) this;
        }

        public Criteria andHmIsNull() {
            addCriterion("HM is null");
            return (Criteria) this;
        }

        public Criteria andHmIsNotNull() {
            addCriterion("HM is not null");
            return (Criteria) this;
        }

        public Criteria andHmEqualTo(String value) {
            addCriterion("HM =", value, "hm");
            return (Criteria) this;
        }

        public Criteria andHmNotEqualTo(String value) {
            addCriterion("HM <>", value, "hm");
            return (Criteria) this;
        }

        public Criteria andHmGreaterThan(String value) {
            addCriterion("HM >", value, "hm");
            return (Criteria) this;
        }

        public Criteria andHmGreaterThanOrEqualTo(String value) {
            addCriterion("HM >=", value, "hm");
            return (Criteria) this;
        }

        public Criteria andHmLessThan(String value) {
            addCriterion("HM <", value, "hm");
            return (Criteria) this;
        }

        public Criteria andHmLessThanOrEqualTo(String value) {
            addCriterion("HM <=", value, "hm");
            return (Criteria) this;
        }

        public Criteria andHmLike(String value) {
            addCriterion("HM like", value, "hm");
            return (Criteria) this;
        }

        public Criteria andHmNotLike(String value) {
            addCriterion("HM not like", value, "hm");
            return (Criteria) this;
        }

        public Criteria andHmIn(List<String> values) {
            addCriterion("HM in", values, "hm");
            return (Criteria) this;
        }

        public Criteria andHmNotIn(List<String> values) {
            addCriterion("HM not in", values, "hm");
            return (Criteria) this;
        }

        public Criteria andHmBetween(String value1, String value2) {
            addCriterion("HM between", value1, value2, "hm");
            return (Criteria) this;
        }

        public Criteria andHmNotBetween(String value1, String value2) {
            addCriterion("HM not between", value1, value2, "hm");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhIsNull() {
            addCriterion("TXLCCWLXH is null");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhIsNotNull() {
            addCriterion("TXLCCWLXH is not null");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhEqualTo(String value) {
            addCriterion("TXLCCWLXH =", value, "txlccwlxh");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhNotEqualTo(String value) {
            addCriterion("TXLCCWLXH <>", value, "txlccwlxh");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhGreaterThan(String value) {
            addCriterion("TXLCCWLXH >", value, "txlccwlxh");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhGreaterThanOrEqualTo(String value) {
            addCriterion("TXLCCWLXH >=", value, "txlccwlxh");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhLessThan(String value) {
            addCriterion("TXLCCWLXH <", value, "txlccwlxh");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhLessThanOrEqualTo(String value) {
            addCriterion("TXLCCWLXH <=", value, "txlccwlxh");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhLike(String value) {
            addCriterion("TXLCCWLXH like", value, "txlccwlxh");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhNotLike(String value) {
            addCriterion("TXLCCWLXH not like", value, "txlccwlxh");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhIn(List<String> values) {
            addCriterion("TXLCCWLXH in", values, "txlccwlxh");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhNotIn(List<String> values) {
            addCriterion("TXLCCWLXH not in", values, "txlccwlxh");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhBetween(String value1, String value2) {
            addCriterion("TXLCCWLXH between", value1, value2, "txlccwlxh");
            return (Criteria) this;
        }

        public Criteria andTxlccwlxhNotBetween(String value1, String value2) {
            addCriterion("TXLCCWLXH not between", value1, value2, "txlccwlxh");
            return (Criteria) this;
        }

        public Criteria andHymcIsNull() {
            addCriterion("HYMC is null");
            return (Criteria) this;
        }

        public Criteria andHymcIsNotNull() {
            addCriterion("HYMC is not null");
            return (Criteria) this;
        }

        public Criteria andHymcEqualTo(String value) {
            addCriterion("HYMC =", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcNotEqualTo(String value) {
            addCriterion("HYMC <>", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcGreaterThan(String value) {
            addCriterion("HYMC >", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcGreaterThanOrEqualTo(String value) {
            addCriterion("HYMC >=", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcLessThan(String value) {
            addCriterion("HYMC <", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcLessThanOrEqualTo(String value) {
            addCriterion("HYMC <=", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcLike(String value) {
            addCriterion("HYMC like", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcNotLike(String value) {
            addCriterion("HYMC not like", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcIn(List<String> values) {
            addCriterion("HYMC in", values, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcNotIn(List<String> values) {
            addCriterion("HYMC not in", values, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcBetween(String value1, String value2) {
            addCriterion("HYMC between", value1, value2, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcNotBetween(String value1, String value2) {
            addCriterion("HYMC not between", value1, value2, "hymc");
            return (Criteria) this;
        }

        public Criteria andHyncIsNull() {
            addCriterion("HYNC is null");
            return (Criteria) this;
        }

        public Criteria andHyncIsNotNull() {
            addCriterion("HYNC is not null");
            return (Criteria) this;
        }

        public Criteria andHyncEqualTo(String value) {
            addCriterion("HYNC =", value, "hync");
            return (Criteria) this;
        }

        public Criteria andHyncNotEqualTo(String value) {
            addCriterion("HYNC <>", value, "hync");
            return (Criteria) this;
        }

        public Criteria andHyncGreaterThan(String value) {
            addCriterion("HYNC >", value, "hync");
            return (Criteria) this;
        }

        public Criteria andHyncGreaterThanOrEqualTo(String value) {
            addCriterion("HYNC >=", value, "hync");
            return (Criteria) this;
        }

        public Criteria andHyncLessThan(String value) {
            addCriterion("HYNC <", value, "hync");
            return (Criteria) this;
        }

        public Criteria andHyncLessThanOrEqualTo(String value) {
            addCriterion("HYNC <=", value, "hync");
            return (Criteria) this;
        }

        public Criteria andHyncLike(String value) {
            addCriterion("HYNC like", value, "hync");
            return (Criteria) this;
        }

        public Criteria andHyncNotLike(String value) {
            addCriterion("HYNC not like", value, "hync");
            return (Criteria) this;
        }

        public Criteria andHyncIn(List<String> values) {
            addCriterion("HYNC in", values, "hync");
            return (Criteria) this;
        }

        public Criteria andHyncNotIn(List<String> values) {
            addCriterion("HYNC not in", values, "hync");
            return (Criteria) this;
        }

        public Criteria andHyncBetween(String value1, String value2) {
            addCriterion("HYNC between", value1, value2, "hync");
            return (Criteria) this;
        }

        public Criteria andHyncNotBetween(String value1, String value2) {
            addCriterion("HYNC not between", value1, value2, "hync");
            return (Criteria) this;
        }

        public Criteria andHybzmcIsNull() {
            addCriterion("HYBZMC is null");
            return (Criteria) this;
        }

        public Criteria andHybzmcIsNotNull() {
            addCriterion("HYBZMC is not null");
            return (Criteria) this;
        }

        public Criteria andHybzmcEqualTo(String value) {
            addCriterion("HYBZMC =", value, "hybzmc");
            return (Criteria) this;
        }

        public Criteria andHybzmcNotEqualTo(String value) {
            addCriterion("HYBZMC <>", value, "hybzmc");
            return (Criteria) this;
        }

        public Criteria andHybzmcGreaterThan(String value) {
            addCriterion("HYBZMC >", value, "hybzmc");
            return (Criteria) this;
        }

        public Criteria andHybzmcGreaterThanOrEqualTo(String value) {
            addCriterion("HYBZMC >=", value, "hybzmc");
            return (Criteria) this;
        }

        public Criteria andHybzmcLessThan(String value) {
            addCriterion("HYBZMC <", value, "hybzmc");
            return (Criteria) this;
        }

        public Criteria andHybzmcLessThanOrEqualTo(String value) {
            addCriterion("HYBZMC <=", value, "hybzmc");
            return (Criteria) this;
        }

        public Criteria andHybzmcLike(String value) {
            addCriterion("HYBZMC like", value, "hybzmc");
            return (Criteria) this;
        }

        public Criteria andHybzmcNotLike(String value) {
            addCriterion("HYBZMC not like", value, "hybzmc");
            return (Criteria) this;
        }

        public Criteria andHybzmcIn(List<String> values) {
            addCriterion("HYBZMC in", values, "hybzmc");
            return (Criteria) this;
        }

        public Criteria andHybzmcNotIn(List<String> values) {
            addCriterion("HYBZMC not in", values, "hybzmc");
            return (Criteria) this;
        }

        public Criteria andHybzmcBetween(String value1, String value2) {
            addCriterion("HYBZMC between", value1, value2, "hybzmc");
            return (Criteria) this;
        }

        public Criteria andHybzmcNotBetween(String value1, String value2) {
            addCriterion("HYBZMC not between", value1, value2, "hybzmc");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("XB is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("XB is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("XB =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("XB <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("XB >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("XB >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("XB <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("XB <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("XB like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("XB not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("XB in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("XB not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("XB between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("XB not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andDqIsNull() {
            addCriterion("DQ is null");
            return (Criteria) this;
        }

        public Criteria andDqIsNotNull() {
            addCriterion("DQ is not null");
            return (Criteria) this;
        }

        public Criteria andDqEqualTo(String value) {
            addCriterion("DQ =", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqNotEqualTo(String value) {
            addCriterion("DQ <>", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqGreaterThan(String value) {
            addCriterion("DQ >", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqGreaterThanOrEqualTo(String value) {
            addCriterion("DQ >=", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqLessThan(String value) {
            addCriterion("DQ <", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqLessThanOrEqualTo(String value) {
            addCriterion("DQ <=", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqLike(String value) {
            addCriterion("DQ like", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqNotLike(String value) {
            addCriterion("DQ not like", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqIn(List<String> values) {
            addCriterion("DQ in", values, "dq");
            return (Criteria) this;
        }

        public Criteria andDqNotIn(List<String> values) {
            addCriterion("DQ not in", values, "dq");
            return (Criteria) this;
        }

        public Criteria andDqBetween(String value1, String value2) {
            addCriterion("DQ between", value1, value2, "dq");
            return (Criteria) this;
        }

        public Criteria andDqNotBetween(String value1, String value2) {
            addCriterion("DQ not between", value1, value2, "dq");
            return (Criteria) this;
        }

        public Criteria andGxqmIsNull() {
            addCriterion("GXQM is null");
            return (Criteria) this;
        }

        public Criteria andGxqmIsNotNull() {
            addCriterion("GXQM is not null");
            return (Criteria) this;
        }

        public Criteria andGxqmEqualTo(String value) {
            addCriterion("GXQM =", value, "gxqm");
            return (Criteria) this;
        }

        public Criteria andGxqmNotEqualTo(String value) {
            addCriterion("GXQM <>", value, "gxqm");
            return (Criteria) this;
        }

        public Criteria andGxqmGreaterThan(String value) {
            addCriterion("GXQM >", value, "gxqm");
            return (Criteria) this;
        }

        public Criteria andGxqmGreaterThanOrEqualTo(String value) {
            addCriterion("GXQM >=", value, "gxqm");
            return (Criteria) this;
        }

        public Criteria andGxqmLessThan(String value) {
            addCriterion("GXQM <", value, "gxqm");
            return (Criteria) this;
        }

        public Criteria andGxqmLessThanOrEqualTo(String value) {
            addCriterion("GXQM <=", value, "gxqm");
            return (Criteria) this;
        }

        public Criteria andGxqmLike(String value) {
            addCriterion("GXQM like", value, "gxqm");
            return (Criteria) this;
        }

        public Criteria andGxqmNotLike(String value) {
            addCriterion("GXQM not like", value, "gxqm");
            return (Criteria) this;
        }

        public Criteria andGxqmIn(List<String> values) {
            addCriterion("GXQM in", values, "gxqm");
            return (Criteria) this;
        }

        public Criteria andGxqmNotIn(List<String> values) {
            addCriterion("GXQM not in", values, "gxqm");
            return (Criteria) this;
        }

        public Criteria andGxqmBetween(String value1, String value2) {
            addCriterion("GXQM between", value1, value2, "gxqm");
            return (Criteria) this;
        }

        public Criteria andGxqmNotBetween(String value1, String value2) {
            addCriterion("GXQM not between", value1, value2, "gxqm");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andGlyxIsNull() {
            addCriterion("GLYX is null");
            return (Criteria) this;
        }

        public Criteria andGlyxIsNotNull() {
            addCriterion("GLYX is not null");
            return (Criteria) this;
        }

        public Criteria andGlyxEqualTo(String value) {
            addCriterion("GLYX =", value, "glyx");
            return (Criteria) this;
        }

        public Criteria andGlyxNotEqualTo(String value) {
            addCriterion("GLYX <>", value, "glyx");
            return (Criteria) this;
        }

        public Criteria andGlyxGreaterThan(String value) {
            addCriterion("GLYX >", value, "glyx");
            return (Criteria) this;
        }

        public Criteria andGlyxGreaterThanOrEqualTo(String value) {
            addCriterion("GLYX >=", value, "glyx");
            return (Criteria) this;
        }

        public Criteria andGlyxLessThan(String value) {
            addCriterion("GLYX <", value, "glyx");
            return (Criteria) this;
        }

        public Criteria andGlyxLessThanOrEqualTo(String value) {
            addCriterion("GLYX <=", value, "glyx");
            return (Criteria) this;
        }

        public Criteria andGlyxLike(String value) {
            addCriterion("GLYX like", value, "glyx");
            return (Criteria) this;
        }

        public Criteria andGlyxNotLike(String value) {
            addCriterion("GLYX not like", value, "glyx");
            return (Criteria) this;
        }

        public Criteria andGlyxIn(List<String> values) {
            addCriterion("GLYX in", values, "glyx");
            return (Criteria) this;
        }

        public Criteria andGlyxNotIn(List<String> values) {
            addCriterion("GLYX not in", values, "glyx");
            return (Criteria) this;
        }

        public Criteria andGlyxBetween(String value1, String value2) {
            addCriterion("GLYX between", value1, value2, "glyx");
            return (Criteria) this;
        }

        public Criteria andGlyxNotBetween(String value1, String value2) {
            addCriterion("GLYX not between", value1, value2, "glyx");
            return (Criteria) this;
        }

        public Criteria andGlsjhmIsNull() {
            addCriterion("GLSJHM is null");
            return (Criteria) this;
        }

        public Criteria andGlsjhmIsNotNull() {
            addCriterion("GLSJHM is not null");
            return (Criteria) this;
        }

        public Criteria andGlsjhmEqualTo(String value) {
            addCriterion("GLSJHM =", value, "glsjhm");
            return (Criteria) this;
        }

        public Criteria andGlsjhmNotEqualTo(String value) {
            addCriterion("GLSJHM <>", value, "glsjhm");
            return (Criteria) this;
        }

        public Criteria andGlsjhmGreaterThan(String value) {
            addCriterion("GLSJHM >", value, "glsjhm");
            return (Criteria) this;
        }

        public Criteria andGlsjhmGreaterThanOrEqualTo(String value) {
            addCriterion("GLSJHM >=", value, "glsjhm");
            return (Criteria) this;
        }

        public Criteria andGlsjhmLessThan(String value) {
            addCriterion("GLSJHM <", value, "glsjhm");
            return (Criteria) this;
        }

        public Criteria andGlsjhmLessThanOrEqualTo(String value) {
            addCriterion("GLSJHM <=", value, "glsjhm");
            return (Criteria) this;
        }

        public Criteria andGlsjhmLike(String value) {
            addCriterion("GLSJHM like", value, "glsjhm");
            return (Criteria) this;
        }

        public Criteria andGlsjhmNotLike(String value) {
            addCriterion("GLSJHM not like", value, "glsjhm");
            return (Criteria) this;
        }

        public Criteria andGlsjhmIn(List<String> values) {
            addCriterion("GLSJHM in", values, "glsjhm");
            return (Criteria) this;
        }

        public Criteria andGlsjhmNotIn(List<String> values) {
            addCriterion("GLSJHM not in", values, "glsjhm");
            return (Criteria) this;
        }

        public Criteria andGlsjhmBetween(String value1, String value2) {
            addCriterion("GLSJHM between", value1, value2, "glsjhm");
            return (Criteria) this;
        }

        public Criteria andGlsjhmNotBetween(String value1, String value2) {
            addCriterion("GLSJHM not between", value1, value2, "glsjhm");
            return (Criteria) this;
        }

        public Criteria andGlqqIsNull() {
            addCriterion("GLQQ is null");
            return (Criteria) this;
        }

        public Criteria andGlqqIsNotNull() {
            addCriterion("GLQQ is not null");
            return (Criteria) this;
        }

        public Criteria andGlqqEqualTo(String value) {
            addCriterion("GLQQ =", value, "glqq");
            return (Criteria) this;
        }

        public Criteria andGlqqNotEqualTo(String value) {
            addCriterion("GLQQ <>", value, "glqq");
            return (Criteria) this;
        }

        public Criteria andGlqqGreaterThan(String value) {
            addCriterion("GLQQ >", value, "glqq");
            return (Criteria) this;
        }

        public Criteria andGlqqGreaterThanOrEqualTo(String value) {
            addCriterion("GLQQ >=", value, "glqq");
            return (Criteria) this;
        }

        public Criteria andGlqqLessThan(String value) {
            addCriterion("GLQQ <", value, "glqq");
            return (Criteria) this;
        }

        public Criteria andGlqqLessThanOrEqualTo(String value) {
            addCriterion("GLQQ <=", value, "glqq");
            return (Criteria) this;
        }

        public Criteria andGlqqLike(String value) {
            addCriterion("GLQQ like", value, "glqq");
            return (Criteria) this;
        }

        public Criteria andGlqqNotLike(String value) {
            addCriterion("GLQQ not like", value, "glqq");
            return (Criteria) this;
        }

        public Criteria andGlqqIn(List<String> values) {
            addCriterion("GLQQ in", values, "glqq");
            return (Criteria) this;
        }

        public Criteria andGlqqNotIn(List<String> values) {
            addCriterion("GLQQ not in", values, "glqq");
            return (Criteria) this;
        }

        public Criteria andGlqqBetween(String value1, String value2) {
            addCriterion("GLQQ between", value1, value2, "glqq");
            return (Criteria) this;
        }

        public Criteria andGlqqNotBetween(String value1, String value2) {
            addCriterion("GLQQ not between", value1, value2, "glqq");
            return (Criteria) this;
        }

        public Criteria andGlwbIsNull() {
            addCriterion("GLWB is null");
            return (Criteria) this;
        }

        public Criteria andGlwbIsNotNull() {
            addCriterion("GLWB is not null");
            return (Criteria) this;
        }

        public Criteria andGlwbEqualTo(String value) {
            addCriterion("GLWB =", value, "glwb");
            return (Criteria) this;
        }

        public Criteria andGlwbNotEqualTo(String value) {
            addCriterion("GLWB <>", value, "glwb");
            return (Criteria) this;
        }

        public Criteria andGlwbGreaterThan(String value) {
            addCriterion("GLWB >", value, "glwb");
            return (Criteria) this;
        }

        public Criteria andGlwbGreaterThanOrEqualTo(String value) {
            addCriterion("GLWB >=", value, "glwb");
            return (Criteria) this;
        }

        public Criteria andGlwbLessThan(String value) {
            addCriterion("GLWB <", value, "glwb");
            return (Criteria) this;
        }

        public Criteria andGlwbLessThanOrEqualTo(String value) {
            addCriterion("GLWB <=", value, "glwb");
            return (Criteria) this;
        }

        public Criteria andGlwbLike(String value) {
            addCriterion("GLWB like", value, "glwb");
            return (Criteria) this;
        }

        public Criteria andGlwbNotLike(String value) {
            addCriterion("GLWB not like", value, "glwb");
            return (Criteria) this;
        }

        public Criteria andGlwbIn(List<String> values) {
            addCriterion("GLWB in", values, "glwb");
            return (Criteria) this;
        }

        public Criteria andGlwbNotIn(List<String> values) {
            addCriterion("GLWB not in", values, "glwb");
            return (Criteria) this;
        }

        public Criteria andGlwbBetween(String value1, String value2) {
            addCriterion("GLWB between", value1, value2, "glwb");
            return (Criteria) this;
        }

        public Criteria andGlwbNotBetween(String value1, String value2) {
            addCriterion("GLWB not between", value1, value2, "glwb");
            return (Criteria) this;
        }

        public Criteria andGlbkIsNull() {
            addCriterion("GLBK is null");
            return (Criteria) this;
        }

        public Criteria andGlbkIsNotNull() {
            addCriterion("GLBK is not null");
            return (Criteria) this;
        }

        public Criteria andGlbkEqualTo(String value) {
            addCriterion("GLBK =", value, "glbk");
            return (Criteria) this;
        }

        public Criteria andGlbkNotEqualTo(String value) {
            addCriterion("GLBK <>", value, "glbk");
            return (Criteria) this;
        }

        public Criteria andGlbkGreaterThan(String value) {
            addCriterion("GLBK >", value, "glbk");
            return (Criteria) this;
        }

        public Criteria andGlbkGreaterThanOrEqualTo(String value) {
            addCriterion("GLBK >=", value, "glbk");
            return (Criteria) this;
        }

        public Criteria andGlbkLessThan(String value) {
            addCriterion("GLBK <", value, "glbk");
            return (Criteria) this;
        }

        public Criteria andGlbkLessThanOrEqualTo(String value) {
            addCriterion("GLBK <=", value, "glbk");
            return (Criteria) this;
        }

        public Criteria andGlbkLike(String value) {
            addCriterion("GLBK like", value, "glbk");
            return (Criteria) this;
        }

        public Criteria andGlbkNotLike(String value) {
            addCriterion("GLBK not like", value, "glbk");
            return (Criteria) this;
        }

        public Criteria andGlbkIn(List<String> values) {
            addCriterion("GLBK in", values, "glbk");
            return (Criteria) this;
        }

        public Criteria andGlbkNotIn(List<String> values) {
            addCriterion("GLBK not in", values, "glbk");
            return (Criteria) this;
        }

        public Criteria andGlbkBetween(String value1, String value2) {
            addCriterion("GLBK between", value1, value2, "glbk");
            return (Criteria) this;
        }

        public Criteria andGlbkNotBetween(String value1, String value2) {
            addCriterion("GLBK not between", value1, value2, "glbk");
            return (Criteria) this;
        }

        public Criteria andGlmsnIsNull() {
            addCriterion("GLMSN is null");
            return (Criteria) this;
        }

        public Criteria andGlmsnIsNotNull() {
            addCriterion("GLMSN is not null");
            return (Criteria) this;
        }

        public Criteria andGlmsnEqualTo(String value) {
            addCriterion("GLMSN =", value, "glmsn");
            return (Criteria) this;
        }

        public Criteria andGlmsnNotEqualTo(String value) {
            addCriterion("GLMSN <>", value, "glmsn");
            return (Criteria) this;
        }

        public Criteria andGlmsnGreaterThan(String value) {
            addCriterion("GLMSN >", value, "glmsn");
            return (Criteria) this;
        }

        public Criteria andGlmsnGreaterThanOrEqualTo(String value) {
            addCriterion("GLMSN >=", value, "glmsn");
            return (Criteria) this;
        }

        public Criteria andGlmsnLessThan(String value) {
            addCriterion("GLMSN <", value, "glmsn");
            return (Criteria) this;
        }

        public Criteria andGlmsnLessThanOrEqualTo(String value) {
            addCriterion("GLMSN <=", value, "glmsn");
            return (Criteria) this;
        }

        public Criteria andGlmsnLike(String value) {
            addCriterion("GLMSN like", value, "glmsn");
            return (Criteria) this;
        }

        public Criteria andGlmsnNotLike(String value) {
            addCriterion("GLMSN not like", value, "glmsn");
            return (Criteria) this;
        }

        public Criteria andGlmsnIn(List<String> values) {
            addCriterion("GLMSN in", values, "glmsn");
            return (Criteria) this;
        }

        public Criteria andGlmsnNotIn(List<String> values) {
            addCriterion("GLMSN not in", values, "glmsn");
            return (Criteria) this;
        }

        public Criteria andGlmsnBetween(String value1, String value2) {
            addCriterion("GLMSN between", value1, value2, "glmsn");
            return (Criteria) this;
        }

        public Criteria andGlmsnNotBetween(String value1, String value2) {
            addCriterion("GLMSN not between", value1, value2, "glmsn");
            return (Criteria) this;
        }

        public Criteria andYzhmgxIsNull() {
            addCriterion("YZHMGX is null");
            return (Criteria) this;
        }

        public Criteria andYzhmgxIsNotNull() {
            addCriterion("YZHMGX is not null");
            return (Criteria) this;
        }

        public Criteria andYzhmgxEqualTo(String value) {
            addCriterion("YZHMGX =", value, "yzhmgx");
            return (Criteria) this;
        }

        public Criteria andYzhmgxNotEqualTo(String value) {
            addCriterion("YZHMGX <>", value, "yzhmgx");
            return (Criteria) this;
        }

        public Criteria andYzhmgxGreaterThan(String value) {
            addCriterion("YZHMGX >", value, "yzhmgx");
            return (Criteria) this;
        }

        public Criteria andYzhmgxGreaterThanOrEqualTo(String value) {
            addCriterion("YZHMGX >=", value, "yzhmgx");
            return (Criteria) this;
        }

        public Criteria andYzhmgxLessThan(String value) {
            addCriterion("YZHMGX <", value, "yzhmgx");
            return (Criteria) this;
        }

        public Criteria andYzhmgxLessThanOrEqualTo(String value) {
            addCriterion("YZHMGX <=", value, "yzhmgx");
            return (Criteria) this;
        }

        public Criteria andYzhmgxLike(String value) {
            addCriterion("YZHMGX like", value, "yzhmgx");
            return (Criteria) this;
        }

        public Criteria andYzhmgxNotLike(String value) {
            addCriterion("YZHMGX not like", value, "yzhmgx");
            return (Criteria) this;
        }

        public Criteria andYzhmgxIn(List<String> values) {
            addCriterion("YZHMGX in", values, "yzhmgx");
            return (Criteria) this;
        }

        public Criteria andYzhmgxNotIn(List<String> values) {
            addCriterion("YZHMGX not in", values, "yzhmgx");
            return (Criteria) this;
        }

        public Criteria andYzhmgxBetween(String value1, String value2) {
            addCriterion("YZHMGX between", value1, value2, "yzhmgx");
            return (Criteria) this;
        }

        public Criteria andYzhmgxNotBetween(String value1, String value2) {
            addCriterion("YZHMGX not between", value1, value2, "yzhmgx");
            return (Criteria) this;
        }

        public Criteria andXbpyIsNull() {
            addCriterion("XBPY is null");
            return (Criteria) this;
        }

        public Criteria andXbpyIsNotNull() {
            addCriterion("XBPY is not null");
            return (Criteria) this;
        }

        public Criteria andXbpyEqualTo(String value) {
            addCriterion("XBPY =", value, "xbpy");
            return (Criteria) this;
        }

        public Criteria andXbpyNotEqualTo(String value) {
            addCriterion("XBPY <>", value, "xbpy");
            return (Criteria) this;
        }

        public Criteria andXbpyGreaterThan(String value) {
            addCriterion("XBPY >", value, "xbpy");
            return (Criteria) this;
        }

        public Criteria andXbpyGreaterThanOrEqualTo(String value) {
            addCriterion("XBPY >=", value, "xbpy");
            return (Criteria) this;
        }

        public Criteria andXbpyLessThan(String value) {
            addCriterion("XBPY <", value, "xbpy");
            return (Criteria) this;
        }

        public Criteria andXbpyLessThanOrEqualTo(String value) {
            addCriterion("XBPY <=", value, "xbpy");
            return (Criteria) this;
        }

        public Criteria andXbpyLike(String value) {
            addCriterion("XBPY like", value, "xbpy");
            return (Criteria) this;
        }

        public Criteria andXbpyNotLike(String value) {
            addCriterion("XBPY not like", value, "xbpy");
            return (Criteria) this;
        }

        public Criteria andXbpyIn(List<String> values) {
            addCriterion("XBPY in", values, "xbpy");
            return (Criteria) this;
        }

        public Criteria andXbpyNotIn(List<String> values) {
            addCriterion("XBPY not in", values, "xbpy");
            return (Criteria) this;
        }

        public Criteria andXbpyBetween(String value1, String value2) {
            addCriterion("XBPY between", value1, value2, "xbpy");
            return (Criteria) this;
        }

        public Criteria andXbpyNotBetween(String value1, String value2) {
            addCriterion("XBPY not between", value1, value2, "xbpy");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("ZT is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("ZT is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(String value) {
            addCriterion("ZT =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(String value) {
            addCriterion("ZT <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(String value) {
            addCriterion("ZT >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(String value) {
            addCriterion("ZT >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(String value) {
            addCriterion("ZT <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(String value) {
            addCriterion("ZT <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLike(String value) {
            addCriterion("ZT like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotLike(String value) {
            addCriterion("ZT not like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<String> values) {
            addCriterion("ZT in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<String> values) {
            addCriterion("ZT not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(String value1, String value2) {
            addCriterion("ZT between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(String value1, String value2) {
            addCriterion("ZT not between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andYbcjsjIsNull() {
            addCriterion("YBCJSJ is null");
            return (Criteria) this;
        }

        public Criteria andYbcjsjIsNotNull() {
            addCriterion("YBCJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andYbcjsjEqualTo(Date value) {
            addCriterion("YBCJSJ =", value, "ybcjsj");
            return (Criteria) this;
        }

        public Criteria andYbcjsjNotEqualTo(Date value) {
            addCriterion("YBCJSJ <>", value, "ybcjsj");
            return (Criteria) this;
        }

        public Criteria andYbcjsjGreaterThan(Date value) {
            addCriterion("YBCJSJ >", value, "ybcjsj");
            return (Criteria) this;
        }

        public Criteria andYbcjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("YBCJSJ >=", value, "ybcjsj");
            return (Criteria) this;
        }

        public Criteria andYbcjsjLessThan(Date value) {
            addCriterion("YBCJSJ <", value, "ybcjsj");
            return (Criteria) this;
        }

        public Criteria andYbcjsjLessThanOrEqualTo(Date value) {
            addCriterion("YBCJSJ <=", value, "ybcjsj");
            return (Criteria) this;
        }

        public Criteria andYbcjsjIn(List<Date> values) {
            addCriterion("YBCJSJ in", values, "ybcjsj");
            return (Criteria) this;
        }

        public Criteria andYbcjsjNotIn(List<Date> values) {
            addCriterion("YBCJSJ not in", values, "ybcjsj");
            return (Criteria) this;
        }

        public Criteria andYbcjsjBetween(Date value1, Date value2) {
            addCriterion("YBCJSJ between", value1, value2, "ybcjsj");
            return (Criteria) this;
        }

        public Criteria andYbcjsjNotBetween(Date value1, Date value2) {
            addCriterion("YBCJSJ not between", value1, value2, "ybcjsj");
            return (Criteria) this;
        }

        public Criteria andYbscsjIsNull() {
            addCriterion("YBSCSJ is null");
            return (Criteria) this;
        }

        public Criteria andYbscsjIsNotNull() {
            addCriterion("YBSCSJ is not null");
            return (Criteria) this;
        }

        public Criteria andYbscsjEqualTo(Date value) {
            addCriterion("YBSCSJ =", value, "ybscsj");
            return (Criteria) this;
        }

        public Criteria andYbscsjNotEqualTo(Date value) {
            addCriterion("YBSCSJ <>", value, "ybscsj");
            return (Criteria) this;
        }

        public Criteria andYbscsjGreaterThan(Date value) {
            addCriterion("YBSCSJ >", value, "ybscsj");
            return (Criteria) this;
        }

        public Criteria andYbscsjGreaterThanOrEqualTo(Date value) {
            addCriterion("YBSCSJ >=", value, "ybscsj");
            return (Criteria) this;
        }

        public Criteria andYbscsjLessThan(Date value) {
            addCriterion("YBSCSJ <", value, "ybscsj");
            return (Criteria) this;
        }

        public Criteria andYbscsjLessThanOrEqualTo(Date value) {
            addCriterion("YBSCSJ <=", value, "ybscsj");
            return (Criteria) this;
        }

        public Criteria andYbscsjIn(List<Date> values) {
            addCriterion("YBSCSJ in", values, "ybscsj");
            return (Criteria) this;
        }

        public Criteria andYbscsjNotIn(List<Date> values) {
            addCriterion("YBSCSJ not in", values, "ybscsj");
            return (Criteria) this;
        }

        public Criteria andYbscsjBetween(Date value1, Date value2) {
            addCriterion("YBSCSJ between", value1, value2, "ybscsj");
            return (Criteria) this;
        }

        public Criteria andYbscsjNotBetween(Date value1, Date value2) {
            addCriterion("YBSCSJ not between", value1, value2, "ybscsj");
            return (Criteria) this;
        }

        public Criteria andYbtbsjIsNull() {
            addCriterion("YBTBSJ is null");
            return (Criteria) this;
        }

        public Criteria andYbtbsjIsNotNull() {
            addCriterion("YBTBSJ is not null");
            return (Criteria) this;
        }

        public Criteria andYbtbsjEqualTo(Date value) {
            addCriterion("YBTBSJ =", value, "ybtbsj");
            return (Criteria) this;
        }

        public Criteria andYbtbsjNotEqualTo(Date value) {
            addCriterion("YBTBSJ <>", value, "ybtbsj");
            return (Criteria) this;
        }

        public Criteria andYbtbsjGreaterThan(Date value) {
            addCriterion("YBTBSJ >", value, "ybtbsj");
            return (Criteria) this;
        }

        public Criteria andYbtbsjGreaterThanOrEqualTo(Date value) {
            addCriterion("YBTBSJ >=", value, "ybtbsj");
            return (Criteria) this;
        }

        public Criteria andYbtbsjLessThan(Date value) {
            addCriterion("YBTBSJ <", value, "ybtbsj");
            return (Criteria) this;
        }

        public Criteria andYbtbsjLessThanOrEqualTo(Date value) {
            addCriterion("YBTBSJ <=", value, "ybtbsj");
            return (Criteria) this;
        }

        public Criteria andYbtbsjIn(List<Date> values) {
            addCriterion("YBTBSJ in", values, "ybtbsj");
            return (Criteria) this;
        }

        public Criteria andYbtbsjNotIn(List<Date> values) {
            addCriterion("YBTBSJ not in", values, "ybtbsj");
            return (Criteria) this;
        }

        public Criteria andYbtbsjBetween(Date value1, Date value2) {
            addCriterion("YBTBSJ between", value1, value2, "ybtbsj");
            return (Criteria) this;
        }

        public Criteria andYbtbsjNotBetween(Date value1, Date value2) {
            addCriterion("YBTBSJ not between", value1, value2, "ybtbsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("CJSJ is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("CJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(Date value) {
            addCriterion("CJSJ =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(Date value) {
            addCriterion("CJSJ <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(Date value) {
            addCriterion("CJSJ >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("CJSJ >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(Date value) {
            addCriterion("CJSJ <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(Date value) {
            addCriterion("CJSJ <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<Date> values) {
            addCriterion("CJSJ in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<Date> values) {
            addCriterion("CJSJ not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(Date value1, Date value2) {
            addCriterion("CJSJ between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(Date value1, Date value2) {
            addCriterion("CJSJ not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andSjlyIsNull() {
            addCriterion("SJLY is null");
            return (Criteria) this;
        }

        public Criteria andSjlyIsNotNull() {
            addCriterion("SJLY is not null");
            return (Criteria) this;
        }

        public Criteria andSjlyEqualTo(String value) {
            addCriterion("SJLY =", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotEqualTo(String value) {
            addCriterion("SJLY <>", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyGreaterThan(String value) {
            addCriterion("SJLY >", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyGreaterThanOrEqualTo(String value) {
            addCriterion("SJLY >=", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyLessThan(String value) {
            addCriterion("SJLY <", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyLessThanOrEqualTo(String value) {
            addCriterion("SJLY <=", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyLike(String value) {
            addCriterion("SJLY like", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotLike(String value) {
            addCriterion("SJLY not like", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyIn(List<String> values) {
            addCriterion("SJLY in", values, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotIn(List<String> values) {
            addCriterion("SJLY not in", values, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyBetween(String value1, String value2) {
            addCriterion("SJLY between", value1, value2, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotBetween(String value1, String value2) {
            addCriterion("SJLY not between", value1, value2, "sjly");
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