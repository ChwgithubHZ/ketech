package com.ketech.bq.ketech.entity;

import java.util.ArrayList;
import java.util.List;

public class DmWpEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmWpEntityExample() {
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

        public Criteria andSawpbhIsNull() {
            addCriterion("sawpbh is null");
            return (Criteria) this;
        }

        public Criteria andSawpbhIsNotNull() {
            addCriterion("sawpbh is not null");
            return (Criteria) this;
        }

        public Criteria andSawpbhEqualTo(String value) {
            addCriterion("sawpbh =", value, "sawpbh");
            return (Criteria) this;
        }

        public Criteria andSawpbhNotEqualTo(String value) {
            addCriterion("sawpbh <>", value, "sawpbh");
            return (Criteria) this;
        }

        public Criteria andSawpbhGreaterThan(String value) {
            addCriterion("sawpbh >", value, "sawpbh");
            return (Criteria) this;
        }

        public Criteria andSawpbhGreaterThanOrEqualTo(String value) {
            addCriterion("sawpbh >=", value, "sawpbh");
            return (Criteria) this;
        }

        public Criteria andSawpbhLessThan(String value) {
            addCriterion("sawpbh <", value, "sawpbh");
            return (Criteria) this;
        }

        public Criteria andSawpbhLessThanOrEqualTo(String value) {
            addCriterion("sawpbh <=", value, "sawpbh");
            return (Criteria) this;
        }

        public Criteria andSawpbhLike(String value) {
            addCriterion("sawpbh like", value, "sawpbh");
            return (Criteria) this;
        }

        public Criteria andSawpbhNotLike(String value) {
            addCriterion("sawpbh not like", value, "sawpbh");
            return (Criteria) this;
        }

        public Criteria andSawpbhIn(List<String> values) {
            addCriterion("sawpbh in", values, "sawpbh");
            return (Criteria) this;
        }

        public Criteria andSawpbhNotIn(List<String> values) {
            addCriterion("sawpbh not in", values, "sawpbh");
            return (Criteria) this;
        }

        public Criteria andSawpbhBetween(String value1, String value2) {
            addCriterion("sawpbh between", value1, value2, "sawpbh");
            return (Criteria) this;
        }

        public Criteria andSawpbhNotBetween(String value1, String value2) {
            addCriterion("sawpbh not between", value1, value2, "sawpbh");
            return (Criteria) this;
        }

        public Criteria andAsjbhIsNull() {
            addCriterion("asjbh is null");
            return (Criteria) this;
        }

        public Criteria andAsjbhIsNotNull() {
            addCriterion("asjbh is not null");
            return (Criteria) this;
        }

        public Criteria andAsjbhEqualTo(String value) {
            addCriterion("asjbh =", value, "asjbh");
            return (Criteria) this;
        }

        public Criteria andAsjbhNotEqualTo(String value) {
            addCriterion("asjbh <>", value, "asjbh");
            return (Criteria) this;
        }

        public Criteria andAsjbhGreaterThan(String value) {
            addCriterion("asjbh >", value, "asjbh");
            return (Criteria) this;
        }

        public Criteria andAsjbhGreaterThanOrEqualTo(String value) {
            addCriterion("asjbh >=", value, "asjbh");
            return (Criteria) this;
        }

        public Criteria andAsjbhLessThan(String value) {
            addCriterion("asjbh <", value, "asjbh");
            return (Criteria) this;
        }

        public Criteria andAsjbhLessThanOrEqualTo(String value) {
            addCriterion("asjbh <=", value, "asjbh");
            return (Criteria) this;
        }

        public Criteria andAsjbhLike(String value) {
            addCriterion("asjbh like", value, "asjbh");
            return (Criteria) this;
        }

        public Criteria andAsjbhNotLike(String value) {
            addCriterion("asjbh not like", value, "asjbh");
            return (Criteria) this;
        }

        public Criteria andAsjbhIn(List<String> values) {
            addCriterion("asjbh in", values, "asjbh");
            return (Criteria) this;
        }

        public Criteria andAsjbhNotIn(List<String> values) {
            addCriterion("asjbh not in", values, "asjbh");
            return (Criteria) this;
        }

        public Criteria andAsjbhBetween(String value1, String value2) {
            addCriterion("asjbh between", value1, value2, "asjbh");
            return (Criteria) this;
        }

        public Criteria andAsjbhNotBetween(String value1, String value2) {
            addCriterion("asjbh not between", value1, value2, "asjbh");
            return (Criteria) this;
        }

        public Criteria andRybhIsNull() {
            addCriterion("rybh is null");
            return (Criteria) this;
        }

        public Criteria andRybhIsNotNull() {
            addCriterion("rybh is not null");
            return (Criteria) this;
        }

        public Criteria andRybhEqualTo(String value) {
            addCriterion("rybh =", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhNotEqualTo(String value) {
            addCriterion("rybh <>", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhGreaterThan(String value) {
            addCriterion("rybh >", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhGreaterThanOrEqualTo(String value) {
            addCriterion("rybh >=", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhLessThan(String value) {
            addCriterion("rybh <", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhLessThanOrEqualTo(String value) {
            addCriterion("rybh <=", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhLike(String value) {
            addCriterion("rybh like", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhNotLike(String value) {
            addCriterion("rybh not like", value, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhIn(List<String> values) {
            addCriterion("rybh in", values, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhNotIn(List<String> values) {
            addCriterion("rybh not in", values, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhBetween(String value1, String value2) {
            addCriterion("rybh between", value1, value2, "rybh");
            return (Criteria) this;
        }

        public Criteria andRybhNotBetween(String value1, String value2) {
            addCriterion("rybh not between", value1, value2, "rybh");
            return (Criteria) this;
        }

        public Criteria andWplbIsNull() {
            addCriterion("wplb is null");
            return (Criteria) this;
        }

        public Criteria andWplbIsNotNull() {
            addCriterion("wplb is not null");
            return (Criteria) this;
        }

        public Criteria andWplbEqualTo(String value) {
            addCriterion("wplb =", value, "wplb");
            return (Criteria) this;
        }

        public Criteria andWplbNotEqualTo(String value) {
            addCriterion("wplb <>", value, "wplb");
            return (Criteria) this;
        }

        public Criteria andWplbGreaterThan(String value) {
            addCriterion("wplb >", value, "wplb");
            return (Criteria) this;
        }

        public Criteria andWplbGreaterThanOrEqualTo(String value) {
            addCriterion("wplb >=", value, "wplb");
            return (Criteria) this;
        }

        public Criteria andWplbLessThan(String value) {
            addCriterion("wplb <", value, "wplb");
            return (Criteria) this;
        }

        public Criteria andWplbLessThanOrEqualTo(String value) {
            addCriterion("wplb <=", value, "wplb");
            return (Criteria) this;
        }

        public Criteria andWplbLike(String value) {
            addCriterion("wplb like", value, "wplb");
            return (Criteria) this;
        }

        public Criteria andWplbNotLike(String value) {
            addCriterion("wplb not like", value, "wplb");
            return (Criteria) this;
        }

        public Criteria andWplbIn(List<String> values) {
            addCriterion("wplb in", values, "wplb");
            return (Criteria) this;
        }

        public Criteria andWplbNotIn(List<String> values) {
            addCriterion("wplb not in", values, "wplb");
            return (Criteria) this;
        }

        public Criteria andWplbBetween(String value1, String value2) {
            addCriterion("wplb between", value1, value2, "wplb");
            return (Criteria) this;
        }

        public Criteria andWplbNotBetween(String value1, String value2) {
            addCriterion("wplb not between", value1, value2, "wplb");
            return (Criteria) this;
        }

        public Criteria andWpjsIsNull() {
            addCriterion("wpjs is null");
            return (Criteria) this;
        }

        public Criteria andWpjsIsNotNull() {
            addCriterion("wpjs is not null");
            return (Criteria) this;
        }

        public Criteria andWpjsEqualTo(String value) {
            addCriterion("wpjs =", value, "wpjs");
            return (Criteria) this;
        }

        public Criteria andWpjsNotEqualTo(String value) {
            addCriterion("wpjs <>", value, "wpjs");
            return (Criteria) this;
        }

        public Criteria andWpjsGreaterThan(String value) {
            addCriterion("wpjs >", value, "wpjs");
            return (Criteria) this;
        }

        public Criteria andWpjsGreaterThanOrEqualTo(String value) {
            addCriterion("wpjs >=", value, "wpjs");
            return (Criteria) this;
        }

        public Criteria andWpjsLessThan(String value) {
            addCriterion("wpjs <", value, "wpjs");
            return (Criteria) this;
        }

        public Criteria andWpjsLessThanOrEqualTo(String value) {
            addCriterion("wpjs <=", value, "wpjs");
            return (Criteria) this;
        }

        public Criteria andWpjsLike(String value) {
            addCriterion("wpjs like", value, "wpjs");
            return (Criteria) this;
        }

        public Criteria andWpjsNotLike(String value) {
            addCriterion("wpjs not like", value, "wpjs");
            return (Criteria) this;
        }

        public Criteria andWpjsIn(List<String> values) {
            addCriterion("wpjs in", values, "wpjs");
            return (Criteria) this;
        }

        public Criteria andWpjsNotIn(List<String> values) {
            addCriterion("wpjs not in", values, "wpjs");
            return (Criteria) this;
        }

        public Criteria andWpjsBetween(String value1, String value2) {
            addCriterion("wpjs between", value1, value2, "wpjs");
            return (Criteria) this;
        }

        public Criteria andWpjsNotBetween(String value1, String value2) {
            addCriterion("wpjs not between", value1, value2, "wpjs");
            return (Criteria) this;
        }

        public Criteria andSawpdmIsNull() {
            addCriterion("sawpdm is null");
            return (Criteria) this;
        }

        public Criteria andSawpdmIsNotNull() {
            addCriterion("sawpdm is not null");
            return (Criteria) this;
        }

        public Criteria andSawpdmEqualTo(String value) {
            addCriterion("sawpdm =", value, "sawpdm");
            return (Criteria) this;
        }

        public Criteria andSawpdmNotEqualTo(String value) {
            addCriterion("sawpdm <>", value, "sawpdm");
            return (Criteria) this;
        }

        public Criteria andSawpdmGreaterThan(String value) {
            addCriterion("sawpdm >", value, "sawpdm");
            return (Criteria) this;
        }

        public Criteria andSawpdmGreaterThanOrEqualTo(String value) {
            addCriterion("sawpdm >=", value, "sawpdm");
            return (Criteria) this;
        }

        public Criteria andSawpdmLessThan(String value) {
            addCriterion("sawpdm <", value, "sawpdm");
            return (Criteria) this;
        }

        public Criteria andSawpdmLessThanOrEqualTo(String value) {
            addCriterion("sawpdm <=", value, "sawpdm");
            return (Criteria) this;
        }

        public Criteria andSawpdmLike(String value) {
            addCriterion("sawpdm like", value, "sawpdm");
            return (Criteria) this;
        }

        public Criteria andSawpdmNotLike(String value) {
            addCriterion("sawpdm not like", value, "sawpdm");
            return (Criteria) this;
        }

        public Criteria andSawpdmIn(List<String> values) {
            addCriterion("sawpdm in", values, "sawpdm");
            return (Criteria) this;
        }

        public Criteria andSawpdmNotIn(List<String> values) {
            addCriterion("sawpdm not in", values, "sawpdm");
            return (Criteria) this;
        }

        public Criteria andSawpdmBetween(String value1, String value2) {
            addCriterion("sawpdm between", value1, value2, "sawpdm");
            return (Criteria) this;
        }

        public Criteria andSawpdmNotBetween(String value1, String value2) {
            addCriterion("sawpdm not between", value1, value2, "sawpdm");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsIsNull() {
            addCriterion("sawp_dmbcms is null");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsIsNotNull() {
            addCriterion("sawp_dmbcms is not null");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsEqualTo(String value) {
            addCriterion("sawp_dmbcms =", value, "sawpDmbcms");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsNotEqualTo(String value) {
            addCriterion("sawp_dmbcms <>", value, "sawpDmbcms");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsGreaterThan(String value) {
            addCriterion("sawp_dmbcms >", value, "sawpDmbcms");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsGreaterThanOrEqualTo(String value) {
            addCriterion("sawp_dmbcms >=", value, "sawpDmbcms");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsLessThan(String value) {
            addCriterion("sawp_dmbcms <", value, "sawpDmbcms");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsLessThanOrEqualTo(String value) {
            addCriterion("sawp_dmbcms <=", value, "sawpDmbcms");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsLike(String value) {
            addCriterion("sawp_dmbcms like", value, "sawpDmbcms");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsNotLike(String value) {
            addCriterion("sawp_dmbcms not like", value, "sawpDmbcms");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsIn(List<String> values) {
            addCriterion("sawp_dmbcms in", values, "sawpDmbcms");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsNotIn(List<String> values) {
            addCriterion("sawp_dmbcms not in", values, "sawpDmbcms");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsBetween(String value1, String value2) {
            addCriterion("sawp_dmbcms between", value1, value2, "sawpDmbcms");
            return (Criteria) this;
        }

        public Criteria andSawpDmbcmsNotBetween(String value1, String value2) {
            addCriterion("sawp_dmbcms not between", value1, value2, "sawpDmbcms");
            return (Criteria) this;
        }

        public Criteria andWqlbdmIsNull() {
            addCriterion("wqlbdm is null");
            return (Criteria) this;
        }

        public Criteria andWqlbdmIsNotNull() {
            addCriterion("wqlbdm is not null");
            return (Criteria) this;
        }

        public Criteria andWqlbdmEqualTo(String value) {
            addCriterion("wqlbdm =", value, "wqlbdm");
            return (Criteria) this;
        }

        public Criteria andWqlbdmNotEqualTo(String value) {
            addCriterion("wqlbdm <>", value, "wqlbdm");
            return (Criteria) this;
        }

        public Criteria andWqlbdmGreaterThan(String value) {
            addCriterion("wqlbdm >", value, "wqlbdm");
            return (Criteria) this;
        }

        public Criteria andWqlbdmGreaterThanOrEqualTo(String value) {
            addCriterion("wqlbdm >=", value, "wqlbdm");
            return (Criteria) this;
        }

        public Criteria andWqlbdmLessThan(String value) {
            addCriterion("wqlbdm <", value, "wqlbdm");
            return (Criteria) this;
        }

        public Criteria andWqlbdmLessThanOrEqualTo(String value) {
            addCriterion("wqlbdm <=", value, "wqlbdm");
            return (Criteria) this;
        }

        public Criteria andWqlbdmLike(String value) {
            addCriterion("wqlbdm like", value, "wqlbdm");
            return (Criteria) this;
        }

        public Criteria andWqlbdmNotLike(String value) {
            addCriterion("wqlbdm not like", value, "wqlbdm");
            return (Criteria) this;
        }

        public Criteria andWqlbdmIn(List<String> values) {
            addCriterion("wqlbdm in", values, "wqlbdm");
            return (Criteria) this;
        }

        public Criteria andWqlbdmNotIn(List<String> values) {
            addCriterion("wqlbdm not in", values, "wqlbdm");
            return (Criteria) this;
        }

        public Criteria andWqlbdmBetween(String value1, String value2) {
            addCriterion("wqlbdm between", value1, value2, "wqlbdm");
            return (Criteria) this;
        }

        public Criteria andWqlbdmNotBetween(String value1, String value2) {
            addCriterion("wqlbdm not between", value1, value2, "wqlbdm");
            return (Criteria) this;
        }

        public Criteria andWpmcIsNull() {
            addCriterion("wpmc is null");
            return (Criteria) this;
        }

        public Criteria andWpmcIsNotNull() {
            addCriterion("wpmc is not null");
            return (Criteria) this;
        }

        public Criteria andWpmcEqualTo(String value) {
            addCriterion("wpmc =", value, "wpmc");
            return (Criteria) this;
        }

        public Criteria andWpmcNotEqualTo(String value) {
            addCriterion("wpmc <>", value, "wpmc");
            return (Criteria) this;
        }

        public Criteria andWpmcGreaterThan(String value) {
            addCriterion("wpmc >", value, "wpmc");
            return (Criteria) this;
        }

        public Criteria andWpmcGreaterThanOrEqualTo(String value) {
            addCriterion("wpmc >=", value, "wpmc");
            return (Criteria) this;
        }

        public Criteria andWpmcLessThan(String value) {
            addCriterion("wpmc <", value, "wpmc");
            return (Criteria) this;
        }

        public Criteria andWpmcLessThanOrEqualTo(String value) {
            addCriterion("wpmc <=", value, "wpmc");
            return (Criteria) this;
        }

        public Criteria andWpmcLike(String value) {
            addCriterion("wpmc like", value, "wpmc");
            return (Criteria) this;
        }

        public Criteria andWpmcNotLike(String value) {
            addCriterion("wpmc not like", value, "wpmc");
            return (Criteria) this;
        }

        public Criteria andWpmcIn(List<String> values) {
            addCriterion("wpmc in", values, "wpmc");
            return (Criteria) this;
        }

        public Criteria andWpmcNotIn(List<String> values) {
            addCriterion("wpmc not in", values, "wpmc");
            return (Criteria) this;
        }

        public Criteria andWpmcBetween(String value1, String value2) {
            addCriterion("wpmc between", value1, value2, "wpmc");
            return (Criteria) this;
        }

        public Criteria andWpmcNotBetween(String value1, String value2) {
            addCriterion("wpmc not between", value1, value2, "wpmc");
            return (Criteria) this;
        }

        public Criteria andWpXhIsNull() {
            addCriterion("wp_xh is null");
            return (Criteria) this;
        }

        public Criteria andWpXhIsNotNull() {
            addCriterion("wp_xh is not null");
            return (Criteria) this;
        }

        public Criteria andWpXhEqualTo(String value) {
            addCriterion("wp_xh =", value, "wpXh");
            return (Criteria) this;
        }

        public Criteria andWpXhNotEqualTo(String value) {
            addCriterion("wp_xh <>", value, "wpXh");
            return (Criteria) this;
        }

        public Criteria andWpXhGreaterThan(String value) {
            addCriterion("wp_xh >", value, "wpXh");
            return (Criteria) this;
        }

        public Criteria andWpXhGreaterThanOrEqualTo(String value) {
            addCriterion("wp_xh >=", value, "wpXh");
            return (Criteria) this;
        }

        public Criteria andWpXhLessThan(String value) {
            addCriterion("wp_xh <", value, "wpXh");
            return (Criteria) this;
        }

        public Criteria andWpXhLessThanOrEqualTo(String value) {
            addCriterion("wp_xh <=", value, "wpXh");
            return (Criteria) this;
        }

        public Criteria andWpXhLike(String value) {
            addCriterion("wp_xh like", value, "wpXh");
            return (Criteria) this;
        }

        public Criteria andWpXhNotLike(String value) {
            addCriterion("wp_xh not like", value, "wpXh");
            return (Criteria) this;
        }

        public Criteria andWpXhIn(List<String> values) {
            addCriterion("wp_xh in", values, "wpXh");
            return (Criteria) this;
        }

        public Criteria andWpXhNotIn(List<String> values) {
            addCriterion("wp_xh not in", values, "wpXh");
            return (Criteria) this;
        }

        public Criteria andWpXhBetween(String value1, String value2) {
            addCriterion("wp_xh between", value1, value2, "wpXh");
            return (Criteria) this;
        }

        public Criteria andWpXhNotBetween(String value1, String value2) {
            addCriterion("wp_xh not between", value1, value2, "wpXh");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmIsNull() {
            addCriterion("wpbzhlbdm is null");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmIsNotNull() {
            addCriterion("wpbzhlbdm is not null");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmEqualTo(String value) {
            addCriterion("wpbzhlbdm =", value, "wpbzhlbdm");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmNotEqualTo(String value) {
            addCriterion("wpbzhlbdm <>", value, "wpbzhlbdm");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmGreaterThan(String value) {
            addCriterion("wpbzhlbdm >", value, "wpbzhlbdm");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmGreaterThanOrEqualTo(String value) {
            addCriterion("wpbzhlbdm >=", value, "wpbzhlbdm");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmLessThan(String value) {
            addCriterion("wpbzhlbdm <", value, "wpbzhlbdm");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmLessThanOrEqualTo(String value) {
            addCriterion("wpbzhlbdm <=", value, "wpbzhlbdm");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmLike(String value) {
            addCriterion("wpbzhlbdm like", value, "wpbzhlbdm");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmNotLike(String value) {
            addCriterion("wpbzhlbdm not like", value, "wpbzhlbdm");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmIn(List<String> values) {
            addCriterion("wpbzhlbdm in", values, "wpbzhlbdm");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmNotIn(List<String> values) {
            addCriterion("wpbzhlbdm not in", values, "wpbzhlbdm");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmBetween(String value1, String value2) {
            addCriterion("wpbzhlbdm between", value1, value2, "wpbzhlbdm");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmNotBetween(String value1, String value2) {
            addCriterion("wpbzhlbdm not between", value1, value2, "wpbzhlbdm");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbIsNull() {
            addCriterion("wpbzhlb is null");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbIsNotNull() {
            addCriterion("wpbzhlb is not null");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbEqualTo(String value) {
            addCriterion("wpbzhlb =", value, "wpbzhlb");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbNotEqualTo(String value) {
            addCriterion("wpbzhlb <>", value, "wpbzhlb");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbGreaterThan(String value) {
            addCriterion("wpbzhlb >", value, "wpbzhlb");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbGreaterThanOrEqualTo(String value) {
            addCriterion("wpbzhlb >=", value, "wpbzhlb");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbLessThan(String value) {
            addCriterion("wpbzhlb <", value, "wpbzhlb");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbLessThanOrEqualTo(String value) {
            addCriterion("wpbzhlb <=", value, "wpbzhlb");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbLike(String value) {
            addCriterion("wpbzhlb like", value, "wpbzhlb");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbNotLike(String value) {
            addCriterion("wpbzhlb not like", value, "wpbzhlb");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbIn(List<String> values) {
            addCriterion("wpbzhlb in", values, "wpbzhlb");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbNotIn(List<String> values) {
            addCriterion("wpbzhlb not in", values, "wpbzhlb");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbBetween(String value1, String value2) {
            addCriterion("wpbzhlb between", value1, value2, "wpbzhlb");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbNotBetween(String value1, String value2) {
            addCriterion("wpbzhlb not between", value1, value2, "wpbzhlb");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsIsNull() {
            addCriterion("wpbzhlbdmbcms is null");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsIsNotNull() {
            addCriterion("wpbzhlbdmbcms is not null");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsEqualTo(String value) {
            addCriterion("wpbzhlbdmbcms =", value, "wpbzhlbdmbcms");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsNotEqualTo(String value) {
            addCriterion("wpbzhlbdmbcms <>", value, "wpbzhlbdmbcms");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsGreaterThan(String value) {
            addCriterion("wpbzhlbdmbcms >", value, "wpbzhlbdmbcms");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsGreaterThanOrEqualTo(String value) {
            addCriterion("wpbzhlbdmbcms >=", value, "wpbzhlbdmbcms");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsLessThan(String value) {
            addCriterion("wpbzhlbdmbcms <", value, "wpbzhlbdmbcms");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsLessThanOrEqualTo(String value) {
            addCriterion("wpbzhlbdmbcms <=", value, "wpbzhlbdmbcms");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsLike(String value) {
            addCriterion("wpbzhlbdmbcms like", value, "wpbzhlbdmbcms");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsNotLike(String value) {
            addCriterion("wpbzhlbdmbcms not like", value, "wpbzhlbdmbcms");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsIn(List<String> values) {
            addCriterion("wpbzhlbdmbcms in", values, "wpbzhlbdmbcms");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsNotIn(List<String> values) {
            addCriterion("wpbzhlbdmbcms not in", values, "wpbzhlbdmbcms");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsBetween(String value1, String value2) {
            addCriterion("wpbzhlbdmbcms between", value1, value2, "wpbzhlbdmbcms");
            return (Criteria) this;
        }

        public Criteria andWpbzhlbdmbcmsNotBetween(String value1, String value2) {
            addCriterion("wpbzhlbdmbcms not between", value1, value2, "wpbzhlbdmbcms");
            return (Criteria) this;
        }

        public Criteria andWpbzhIsNull() {
            addCriterion("wpbzh is null");
            return (Criteria) this;
        }

        public Criteria andWpbzhIsNotNull() {
            addCriterion("wpbzh is not null");
            return (Criteria) this;
        }

        public Criteria andWpbzhEqualTo(String value) {
            addCriterion("wpbzh =", value, "wpbzh");
            return (Criteria) this;
        }

        public Criteria andWpbzhNotEqualTo(String value) {
            addCriterion("wpbzh <>", value, "wpbzh");
            return (Criteria) this;
        }

        public Criteria andWpbzhGreaterThan(String value) {
            addCriterion("wpbzh >", value, "wpbzh");
            return (Criteria) this;
        }

        public Criteria andWpbzhGreaterThanOrEqualTo(String value) {
            addCriterion("wpbzh >=", value, "wpbzh");
            return (Criteria) this;
        }

        public Criteria andWpbzhLessThan(String value) {
            addCriterion("wpbzh <", value, "wpbzh");
            return (Criteria) this;
        }

        public Criteria andWpbzhLessThanOrEqualTo(String value) {
            addCriterion("wpbzh <=", value, "wpbzh");
            return (Criteria) this;
        }

        public Criteria andWpbzhLike(String value) {
            addCriterion("wpbzh like", value, "wpbzh");
            return (Criteria) this;
        }

        public Criteria andWpbzhNotLike(String value) {
            addCriterion("wpbzh not like", value, "wpbzh");
            return (Criteria) this;
        }

        public Criteria andWpbzhIn(List<String> values) {
            addCriterion("wpbzh in", values, "wpbzh");
            return (Criteria) this;
        }

        public Criteria andWpbzhNotIn(List<String> values) {
            addCriterion("wpbzh not in", values, "wpbzh");
            return (Criteria) this;
        }

        public Criteria andWpbzhBetween(String value1, String value2) {
            addCriterion("wpbzh between", value1, value2, "wpbzh");
            return (Criteria) this;
        }

        public Criteria andWpbzhNotBetween(String value1, String value2) {
            addCriterion("wpbzh not between", value1, value2, "wpbzh");
            return (Criteria) this;
        }

        public Criteria andPpxhIsNull() {
            addCriterion("ppxh is null");
            return (Criteria) this;
        }

        public Criteria andPpxhIsNotNull() {
            addCriterion("ppxh is not null");
            return (Criteria) this;
        }

        public Criteria andPpxhEqualTo(String value) {
            addCriterion("ppxh =", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhNotEqualTo(String value) {
            addCriterion("ppxh <>", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhGreaterThan(String value) {
            addCriterion("ppxh >", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhGreaterThanOrEqualTo(String value) {
            addCriterion("ppxh >=", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhLessThan(String value) {
            addCriterion("ppxh <", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhLessThanOrEqualTo(String value) {
            addCriterion("ppxh <=", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhLike(String value) {
            addCriterion("ppxh like", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhNotLike(String value) {
            addCriterion("ppxh not like", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhIn(List<String> values) {
            addCriterion("ppxh in", values, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhNotIn(List<String> values) {
            addCriterion("ppxh not in", values, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhBetween(String value1, String value2) {
            addCriterion("ppxh between", value1, value2, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhNotBetween(String value1, String value2) {
            addCriterion("ppxh not between", value1, value2, "ppxh");
            return (Criteria) this;
        }

        public Criteria andWpggIsNull() {
            addCriterion("wpgg is null");
            return (Criteria) this;
        }

        public Criteria andWpggIsNotNull() {
            addCriterion("wpgg is not null");
            return (Criteria) this;
        }

        public Criteria andWpggEqualTo(String value) {
            addCriterion("wpgg =", value, "wpgg");
            return (Criteria) this;
        }

        public Criteria andWpggNotEqualTo(String value) {
            addCriterion("wpgg <>", value, "wpgg");
            return (Criteria) this;
        }

        public Criteria andWpggGreaterThan(String value) {
            addCriterion("wpgg >", value, "wpgg");
            return (Criteria) this;
        }

        public Criteria andWpggGreaterThanOrEqualTo(String value) {
            addCriterion("wpgg >=", value, "wpgg");
            return (Criteria) this;
        }

        public Criteria andWpggLessThan(String value) {
            addCriterion("wpgg <", value, "wpgg");
            return (Criteria) this;
        }

        public Criteria andWpggLessThanOrEqualTo(String value) {
            addCriterion("wpgg <=", value, "wpgg");
            return (Criteria) this;
        }

        public Criteria andWpggLike(String value) {
            addCriterion("wpgg like", value, "wpgg");
            return (Criteria) this;
        }

        public Criteria andWpggNotLike(String value) {
            addCriterion("wpgg not like", value, "wpgg");
            return (Criteria) this;
        }

        public Criteria andWpggIn(List<String> values) {
            addCriterion("wpgg in", values, "wpgg");
            return (Criteria) this;
        }

        public Criteria andWpggNotIn(List<String> values) {
            addCriterion("wpgg not in", values, "wpgg");
            return (Criteria) this;
        }

        public Criteria andWpggBetween(String value1, String value2) {
            addCriterion("wpgg between", value1, value2, "wpgg");
            return (Criteria) this;
        }

        public Criteria andWpggNotBetween(String value1, String value2) {
            addCriterion("wpgg not between", value1, value2, "wpgg");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmIsNull() {
            addCriterion("wpys_wpysdm is null");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmIsNotNull() {
            addCriterion("wpys_wpysdm is not null");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmEqualTo(String value) {
            addCriterion("wpys_wpysdm =", value, "wpysWpysdm");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmNotEqualTo(String value) {
            addCriterion("wpys_wpysdm <>", value, "wpysWpysdm");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmGreaterThan(String value) {
            addCriterion("wpys_wpysdm >", value, "wpysWpysdm");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmGreaterThanOrEqualTo(String value) {
            addCriterion("wpys_wpysdm >=", value, "wpysWpysdm");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmLessThan(String value) {
            addCriterion("wpys_wpysdm <", value, "wpysWpysdm");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmLessThanOrEqualTo(String value) {
            addCriterion("wpys_wpysdm <=", value, "wpysWpysdm");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmLike(String value) {
            addCriterion("wpys_wpysdm like", value, "wpysWpysdm");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmNotLike(String value) {
            addCriterion("wpys_wpysdm not like", value, "wpysWpysdm");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmIn(List<String> values) {
            addCriterion("wpys_wpysdm in", values, "wpysWpysdm");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmNotIn(List<String> values) {
            addCriterion("wpys_wpysdm not in", values, "wpysWpysdm");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmBetween(String value1, String value2) {
            addCriterion("wpys_wpysdm between", value1, value2, "wpysWpysdm");
            return (Criteria) this;
        }

        public Criteria andWpysWpysdmNotBetween(String value1, String value2) {
            addCriterion("wpys_wpysdm not between", value1, value2, "wpysWpysdm");
            return (Criteria) this;
        }

        public Criteria andWpysWpysIsNull() {
            addCriterion("wpys_wpys is null");
            return (Criteria) this;
        }

        public Criteria andWpysWpysIsNotNull() {
            addCriterion("wpys_wpys is not null");
            return (Criteria) this;
        }

        public Criteria andWpysWpysEqualTo(String value) {
            addCriterion("wpys_wpys =", value, "wpysWpys");
            return (Criteria) this;
        }

        public Criteria andWpysWpysNotEqualTo(String value) {
            addCriterion("wpys_wpys <>", value, "wpysWpys");
            return (Criteria) this;
        }

        public Criteria andWpysWpysGreaterThan(String value) {
            addCriterion("wpys_wpys >", value, "wpysWpys");
            return (Criteria) this;
        }

        public Criteria andWpysWpysGreaterThanOrEqualTo(String value) {
            addCriterion("wpys_wpys >=", value, "wpysWpys");
            return (Criteria) this;
        }

        public Criteria andWpysWpysLessThan(String value) {
            addCriterion("wpys_wpys <", value, "wpysWpys");
            return (Criteria) this;
        }

        public Criteria andWpysWpysLessThanOrEqualTo(String value) {
            addCriterion("wpys_wpys <=", value, "wpysWpys");
            return (Criteria) this;
        }

        public Criteria andWpysWpysLike(String value) {
            addCriterion("wpys_wpys like", value, "wpysWpys");
            return (Criteria) this;
        }

        public Criteria andWpysWpysNotLike(String value) {
            addCriterion("wpys_wpys not like", value, "wpysWpys");
            return (Criteria) this;
        }

        public Criteria andWpysWpysIn(List<String> values) {
            addCriterion("wpys_wpys in", values, "wpysWpys");
            return (Criteria) this;
        }

        public Criteria andWpysWpysNotIn(List<String> values) {
            addCriterion("wpys_wpys not in", values, "wpysWpys");
            return (Criteria) this;
        }

        public Criteria andWpysWpysBetween(String value1, String value2) {
            addCriterion("wpys_wpys between", value1, value2, "wpysWpys");
            return (Criteria) this;
        }

        public Criteria andWpysWpysNotBetween(String value1, String value2) {
            addCriterion("wpys_wpys not between", value1, value2, "wpysWpys");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsIsNull() {
            addCriterion("wpys_dmbcms is null");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsIsNotNull() {
            addCriterion("wpys_dmbcms is not null");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsEqualTo(String value) {
            addCriterion("wpys_dmbcms =", value, "wpysDmbcms");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsNotEqualTo(String value) {
            addCriterion("wpys_dmbcms <>", value, "wpysDmbcms");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsGreaterThan(String value) {
            addCriterion("wpys_dmbcms >", value, "wpysDmbcms");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsGreaterThanOrEqualTo(String value) {
            addCriterion("wpys_dmbcms >=", value, "wpysDmbcms");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsLessThan(String value) {
            addCriterion("wpys_dmbcms <", value, "wpysDmbcms");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsLessThanOrEqualTo(String value) {
            addCriterion("wpys_dmbcms <=", value, "wpysDmbcms");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsLike(String value) {
            addCriterion("wpys_dmbcms like", value, "wpysDmbcms");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsNotLike(String value) {
            addCriterion("wpys_dmbcms not like", value, "wpysDmbcms");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsIn(List<String> values) {
            addCriterion("wpys_dmbcms in", values, "wpysDmbcms");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsNotIn(List<String> values) {
            addCriterion("wpys_dmbcms not in", values, "wpysDmbcms");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsBetween(String value1, String value2) {
            addCriterion("wpys_dmbcms between", value1, value2, "wpysDmbcms");
            return (Criteria) this;
        }

        public Criteria andWpysDmbcmsNotBetween(String value1, String value2) {
            addCriterion("wpys_dmbcms not between", value1, value2, "wpysDmbcms");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyIsNull() {
            addCriterion("wpjz_rmby is null");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyIsNotNull() {
            addCriterion("wpjz_rmby is not null");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyEqualTo(String value) {
            addCriterion("wpjz_rmby =", value, "wpjzRmby");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyNotEqualTo(String value) {
            addCriterion("wpjz_rmby <>", value, "wpjzRmby");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyGreaterThan(String value) {
            addCriterion("wpjz_rmby >", value, "wpjzRmby");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyGreaterThanOrEqualTo(String value) {
            addCriterion("wpjz_rmby >=", value, "wpjzRmby");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyLessThan(String value) {
            addCriterion("wpjz_rmby <", value, "wpjzRmby");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyLessThanOrEqualTo(String value) {
            addCriterion("wpjz_rmby <=", value, "wpjzRmby");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyLike(String value) {
            addCriterion("wpjz_rmby like", value, "wpjzRmby");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyNotLike(String value) {
            addCriterion("wpjz_rmby not like", value, "wpjzRmby");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyIn(List<String> values) {
            addCriterion("wpjz_rmby in", values, "wpjzRmby");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyNotIn(List<String> values) {
            addCriterion("wpjz_rmby not in", values, "wpjzRmby");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyBetween(String value1, String value2) {
            addCriterion("wpjz_rmby between", value1, value2, "wpjzRmby");
            return (Criteria) this;
        }

        public Criteria andWpjzRmbyNotBetween(String value1, String value2) {
            addCriterion("wpjz_rmby not between", value1, value2, "wpjzRmby");
            return (Criteria) this;
        }

        public Criteria andWpslIsNull() {
            addCriterion("wpsl is null");
            return (Criteria) this;
        }

        public Criteria andWpslIsNotNull() {
            addCriterion("wpsl is not null");
            return (Criteria) this;
        }

        public Criteria andWpslEqualTo(String value) {
            addCriterion("wpsl =", value, "wpsl");
            return (Criteria) this;
        }

        public Criteria andWpslNotEqualTo(String value) {
            addCriterion("wpsl <>", value, "wpsl");
            return (Criteria) this;
        }

        public Criteria andWpslGreaterThan(String value) {
            addCriterion("wpsl >", value, "wpsl");
            return (Criteria) this;
        }

        public Criteria andWpslGreaterThanOrEqualTo(String value) {
            addCriterion("wpsl >=", value, "wpsl");
            return (Criteria) this;
        }

        public Criteria andWpslLessThan(String value) {
            addCriterion("wpsl <", value, "wpsl");
            return (Criteria) this;
        }

        public Criteria andWpslLessThanOrEqualTo(String value) {
            addCriterion("wpsl <=", value, "wpsl");
            return (Criteria) this;
        }

        public Criteria andWpslLike(String value) {
            addCriterion("wpsl like", value, "wpsl");
            return (Criteria) this;
        }

        public Criteria andWpslNotLike(String value) {
            addCriterion("wpsl not like", value, "wpsl");
            return (Criteria) this;
        }

        public Criteria andWpslIn(List<String> values) {
            addCriterion("wpsl in", values, "wpsl");
            return (Criteria) this;
        }

        public Criteria andWpslNotIn(List<String> values) {
            addCriterion("wpsl not in", values, "wpsl");
            return (Criteria) this;
        }

        public Criteria andWpslBetween(String value1, String value2) {
            addCriterion("wpsl between", value1, value2, "wpsl");
            return (Criteria) this;
        }

        public Criteria andWpslNotBetween(String value1, String value2) {
            addCriterion("wpsl not between", value1, value2, "wpsl");
            return (Criteria) this;
        }

        public Criteria andWpsldwIsNull() {
            addCriterion("wpsldw is null");
            return (Criteria) this;
        }

        public Criteria andWpsldwIsNotNull() {
            addCriterion("wpsldw is not null");
            return (Criteria) this;
        }

        public Criteria andWpsldwEqualTo(String value) {
            addCriterion("wpsldw =", value, "wpsldw");
            return (Criteria) this;
        }

        public Criteria andWpsldwNotEqualTo(String value) {
            addCriterion("wpsldw <>", value, "wpsldw");
            return (Criteria) this;
        }

        public Criteria andWpsldwGreaterThan(String value) {
            addCriterion("wpsldw >", value, "wpsldw");
            return (Criteria) this;
        }

        public Criteria andWpsldwGreaterThanOrEqualTo(String value) {
            addCriterion("wpsldw >=", value, "wpsldw");
            return (Criteria) this;
        }

        public Criteria andWpsldwLessThan(String value) {
            addCriterion("wpsldw <", value, "wpsldw");
            return (Criteria) this;
        }

        public Criteria andWpsldwLessThanOrEqualTo(String value) {
            addCriterion("wpsldw <=", value, "wpsldw");
            return (Criteria) this;
        }

        public Criteria andWpsldwLike(String value) {
            addCriterion("wpsldw like", value, "wpsldw");
            return (Criteria) this;
        }

        public Criteria andWpsldwNotLike(String value) {
            addCriterion("wpsldw not like", value, "wpsldw");
            return (Criteria) this;
        }

        public Criteria andWpsldwIn(List<String> values) {
            addCriterion("wpsldw in", values, "wpsldw");
            return (Criteria) this;
        }

        public Criteria andWpsldwNotIn(List<String> values) {
            addCriterion("wpsldw not in", values, "wpsldw");
            return (Criteria) this;
        }

        public Criteria andWpsldwBetween(String value1, String value2) {
            addCriterion("wpsldw between", value1, value2, "wpsldw");
            return (Criteria) this;
        }

        public Criteria andWpsldwNotBetween(String value1, String value2) {
            addCriterion("wpsldw not between", value1, value2, "wpsldw");
            return (Criteria) this;
        }

        public Criteria andWpzlIsNull() {
            addCriterion("wpzl is null");
            return (Criteria) this;
        }

        public Criteria andWpzlIsNotNull() {
            addCriterion("wpzl is not null");
            return (Criteria) this;
        }

        public Criteria andWpzlEqualTo(String value) {
            addCriterion("wpzl =", value, "wpzl");
            return (Criteria) this;
        }

        public Criteria andWpzlNotEqualTo(String value) {
            addCriterion("wpzl <>", value, "wpzl");
            return (Criteria) this;
        }

        public Criteria andWpzlGreaterThan(String value) {
            addCriterion("wpzl >", value, "wpzl");
            return (Criteria) this;
        }

        public Criteria andWpzlGreaterThanOrEqualTo(String value) {
            addCriterion("wpzl >=", value, "wpzl");
            return (Criteria) this;
        }

        public Criteria andWpzlLessThan(String value) {
            addCriterion("wpzl <", value, "wpzl");
            return (Criteria) this;
        }

        public Criteria andWpzlLessThanOrEqualTo(String value) {
            addCriterion("wpzl <=", value, "wpzl");
            return (Criteria) this;
        }

        public Criteria andWpzlLike(String value) {
            addCriterion("wpzl like", value, "wpzl");
            return (Criteria) this;
        }

        public Criteria andWpzlNotLike(String value) {
            addCriterion("wpzl not like", value, "wpzl");
            return (Criteria) this;
        }

        public Criteria andWpzlIn(List<String> values) {
            addCriterion("wpzl in", values, "wpzl");
            return (Criteria) this;
        }

        public Criteria andWpzlNotIn(List<String> values) {
            addCriterion("wpzl not in", values, "wpzl");
            return (Criteria) this;
        }

        public Criteria andWpzlBetween(String value1, String value2) {
            addCriterion("wpzl between", value1, value2, "wpzl");
            return (Criteria) this;
        }

        public Criteria andWpzlNotBetween(String value1, String value2) {
            addCriterion("wpzl not between", value1, value2, "wpzl");
            return (Criteria) this;
        }

        public Criteria andJldldwIsNull() {
            addCriterion("jldldw is null");
            return (Criteria) this;
        }

        public Criteria andJldldwIsNotNull() {
            addCriterion("jldldw is not null");
            return (Criteria) this;
        }

        public Criteria andJldldwEqualTo(String value) {
            addCriterion("jldldw =", value, "jldldw");
            return (Criteria) this;
        }

        public Criteria andJldldwNotEqualTo(String value) {
            addCriterion("jldldw <>", value, "jldldw");
            return (Criteria) this;
        }

        public Criteria andJldldwGreaterThan(String value) {
            addCriterion("jldldw >", value, "jldldw");
            return (Criteria) this;
        }

        public Criteria andJldldwGreaterThanOrEqualTo(String value) {
            addCriterion("jldldw >=", value, "jldldw");
            return (Criteria) this;
        }

        public Criteria andJldldwLessThan(String value) {
            addCriterion("jldldw <", value, "jldldw");
            return (Criteria) this;
        }

        public Criteria andJldldwLessThanOrEqualTo(String value) {
            addCriterion("jldldw <=", value, "jldldw");
            return (Criteria) this;
        }

        public Criteria andJldldwLike(String value) {
            addCriterion("jldldw like", value, "jldldw");
            return (Criteria) this;
        }

        public Criteria andJldldwNotLike(String value) {
            addCriterion("jldldw not like", value, "jldldw");
            return (Criteria) this;
        }

        public Criteria andJldldwIn(List<String> values) {
            addCriterion("jldldw in", values, "jldldw");
            return (Criteria) this;
        }

        public Criteria andJldldwNotIn(List<String> values) {
            addCriterion("jldldw not in", values, "jldldw");
            return (Criteria) this;
        }

        public Criteria andJldldwBetween(String value1, String value2) {
            addCriterion("jldldw between", value1, value2, "jldldw");
            return (Criteria) this;
        }

        public Criteria andJldldwNotBetween(String value1, String value2) {
            addCriterion("jldldw not between", value1, value2, "jldldw");
            return (Criteria) this;
        }

        public Criteria andWptzmsIsNull() {
            addCriterion("wptzms is null");
            return (Criteria) this;
        }

        public Criteria andWptzmsIsNotNull() {
            addCriterion("wptzms is not null");
            return (Criteria) this;
        }

        public Criteria andWptzmsEqualTo(String value) {
            addCriterion("wptzms =", value, "wptzms");
            return (Criteria) this;
        }

        public Criteria andWptzmsNotEqualTo(String value) {
            addCriterion("wptzms <>", value, "wptzms");
            return (Criteria) this;
        }

        public Criteria andWptzmsGreaterThan(String value) {
            addCriterion("wptzms >", value, "wptzms");
            return (Criteria) this;
        }

        public Criteria andWptzmsGreaterThanOrEqualTo(String value) {
            addCriterion("wptzms >=", value, "wptzms");
            return (Criteria) this;
        }

        public Criteria andWptzmsLessThan(String value) {
            addCriterion("wptzms <", value, "wptzms");
            return (Criteria) this;
        }

        public Criteria andWptzmsLessThanOrEqualTo(String value) {
            addCriterion("wptzms <=", value, "wptzms");
            return (Criteria) this;
        }

        public Criteria andWptzmsLike(String value) {
            addCriterion("wptzms like", value, "wptzms");
            return (Criteria) this;
        }

        public Criteria andWptzmsNotLike(String value) {
            addCriterion("wptzms not like", value, "wptzms");
            return (Criteria) this;
        }

        public Criteria andWptzmsIn(List<String> values) {
            addCriterion("wptzms in", values, "wptzms");
            return (Criteria) this;
        }

        public Criteria andWptzmsNotIn(List<String> values) {
            addCriterion("wptzms not in", values, "wptzms");
            return (Criteria) this;
        }

        public Criteria andWptzmsBetween(String value1, String value2) {
            addCriterion("wptzms between", value1, value2, "wptzms");
            return (Criteria) this;
        }

        public Criteria andWptzmsNotBetween(String value1, String value2) {
            addCriterion("wptzms not between", value1, value2, "wptzms");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmIsNull() {
            addCriterion("wpzw_pdbsdm is null");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmIsNotNull() {
            addCriterion("wpzw_pdbsdm is not null");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmEqualTo(String value) {
            addCriterion("wpzw_pdbsdm =", value, "wpzwPdbsdm");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmNotEqualTo(String value) {
            addCriterion("wpzw_pdbsdm <>", value, "wpzwPdbsdm");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmGreaterThan(String value) {
            addCriterion("wpzw_pdbsdm >", value, "wpzwPdbsdm");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmGreaterThanOrEqualTo(String value) {
            addCriterion("wpzw_pdbsdm >=", value, "wpzwPdbsdm");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmLessThan(String value) {
            addCriterion("wpzw_pdbsdm <", value, "wpzwPdbsdm");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmLessThanOrEqualTo(String value) {
            addCriterion("wpzw_pdbsdm <=", value, "wpzwPdbsdm");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmLike(String value) {
            addCriterion("wpzw_pdbsdm like", value, "wpzwPdbsdm");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmNotLike(String value) {
            addCriterion("wpzw_pdbsdm not like", value, "wpzwPdbsdm");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmIn(List<String> values) {
            addCriterion("wpzw_pdbsdm in", values, "wpzwPdbsdm");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmNotIn(List<String> values) {
            addCriterion("wpzw_pdbsdm not in", values, "wpzwPdbsdm");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmBetween(String value1, String value2) {
            addCriterion("wpzw_pdbsdm between", value1, value2, "wpzwPdbsdm");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsdmNotBetween(String value1, String value2) {
            addCriterion("wpzw_pdbsdm not between", value1, value2, "wpzwPdbsdm");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsIsNull() {
            addCriterion("wpzw_pdbs is null");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsIsNotNull() {
            addCriterion("wpzw_pdbs is not null");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsEqualTo(String value) {
            addCriterion("wpzw_pdbs =", value, "wpzwPdbs");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsNotEqualTo(String value) {
            addCriterion("wpzw_pdbs <>", value, "wpzwPdbs");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsGreaterThan(String value) {
            addCriterion("wpzw_pdbs >", value, "wpzwPdbs");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsGreaterThanOrEqualTo(String value) {
            addCriterion("wpzw_pdbs >=", value, "wpzwPdbs");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsLessThan(String value) {
            addCriterion("wpzw_pdbs <", value, "wpzwPdbs");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsLessThanOrEqualTo(String value) {
            addCriterion("wpzw_pdbs <=", value, "wpzwPdbs");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsLike(String value) {
            addCriterion("wpzw_pdbs like", value, "wpzwPdbs");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsNotLike(String value) {
            addCriterion("wpzw_pdbs not like", value, "wpzwPdbs");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsIn(List<String> values) {
            addCriterion("wpzw_pdbs in", values, "wpzwPdbs");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsNotIn(List<String> values) {
            addCriterion("wpzw_pdbs not in", values, "wpzwPdbs");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsBetween(String value1, String value2) {
            addCriterion("wpzw_pdbs between", value1, value2, "wpzwPdbs");
            return (Criteria) this;
        }

        public Criteria andWpzwPdbsNotBetween(String value1, String value2) {
            addCriterion("wpzw_pdbs not between", value1, value2, "wpzwPdbs");
            return (Criteria) this;
        }

        public Criteria andWplymsIsNull() {
            addCriterion("wplyms is null");
            return (Criteria) this;
        }

        public Criteria andWplymsIsNotNull() {
            addCriterion("wplyms is not null");
            return (Criteria) this;
        }

        public Criteria andWplymsEqualTo(String value) {
            addCriterion("wplyms =", value, "wplyms");
            return (Criteria) this;
        }

        public Criteria andWplymsNotEqualTo(String value) {
            addCriterion("wplyms <>", value, "wplyms");
            return (Criteria) this;
        }

        public Criteria andWplymsGreaterThan(String value) {
            addCriterion("wplyms >", value, "wplyms");
            return (Criteria) this;
        }

        public Criteria andWplymsGreaterThanOrEqualTo(String value) {
            addCriterion("wplyms >=", value, "wplyms");
            return (Criteria) this;
        }

        public Criteria andWplymsLessThan(String value) {
            addCriterion("wplyms <", value, "wplyms");
            return (Criteria) this;
        }

        public Criteria andWplymsLessThanOrEqualTo(String value) {
            addCriterion("wplyms <=", value, "wplyms");
            return (Criteria) this;
        }

        public Criteria andWplymsLike(String value) {
            addCriterion("wplyms like", value, "wplyms");
            return (Criteria) this;
        }

        public Criteria andWplymsNotLike(String value) {
            addCriterion("wplyms not like", value, "wplyms");
            return (Criteria) this;
        }

        public Criteria andWplymsIn(List<String> values) {
            addCriterion("wplyms in", values, "wplyms");
            return (Criteria) this;
        }

        public Criteria andWplymsNotIn(List<String> values) {
            addCriterion("wplyms not in", values, "wplyms");
            return (Criteria) this;
        }

        public Criteria andWplymsBetween(String value1, String value2) {
            addCriterion("wplyms between", value1, value2, "wplyms");
            return (Criteria) this;
        }

        public Criteria andWplymsNotBetween(String value1, String value2) {
            addCriterion("wplyms not between", value1, value2, "wplyms");
            return (Criteria) this;
        }

        public Criteria andWpgzrqIsNull() {
            addCriterion("wpgzrq is null");
            return (Criteria) this;
        }

        public Criteria andWpgzrqIsNotNull() {
            addCriterion("wpgzrq is not null");
            return (Criteria) this;
        }

        public Criteria andWpgzrqEqualTo(String value) {
            addCriterion("wpgzrq =", value, "wpgzrq");
            return (Criteria) this;
        }

        public Criteria andWpgzrqNotEqualTo(String value) {
            addCriterion("wpgzrq <>", value, "wpgzrq");
            return (Criteria) this;
        }

        public Criteria andWpgzrqGreaterThan(String value) {
            addCriterion("wpgzrq >", value, "wpgzrq");
            return (Criteria) this;
        }

        public Criteria andWpgzrqGreaterThanOrEqualTo(String value) {
            addCriterion("wpgzrq >=", value, "wpgzrq");
            return (Criteria) this;
        }

        public Criteria andWpgzrqLessThan(String value) {
            addCriterion("wpgzrq <", value, "wpgzrq");
            return (Criteria) this;
        }

        public Criteria andWpgzrqLessThanOrEqualTo(String value) {
            addCriterion("wpgzrq <=", value, "wpgzrq");
            return (Criteria) this;
        }

        public Criteria andWpgzrqLike(String value) {
            addCriterion("wpgzrq like", value, "wpgzrq");
            return (Criteria) this;
        }

        public Criteria andWpgzrqNotLike(String value) {
            addCriterion("wpgzrq not like", value, "wpgzrq");
            return (Criteria) this;
        }

        public Criteria andWpgzrqIn(List<String> values) {
            addCriterion("wpgzrq in", values, "wpgzrq");
            return (Criteria) this;
        }

        public Criteria andWpgzrqNotIn(List<String> values) {
            addCriterion("wpgzrq not in", values, "wpgzrq");
            return (Criteria) this;
        }

        public Criteria andWpgzrqBetween(String value1, String value2) {
            addCriterion("wpgzrq between", value1, value2, "wpgzrq");
            return (Criteria) this;
        }

        public Criteria andWpgzrqNotBetween(String value1, String value2) {
            addCriterion("wpgzrq not between", value1, value2, "wpgzrq");
            return (Criteria) this;
        }

        public Criteria andWpqxIsNull() {
            addCriterion("wpqx is null");
            return (Criteria) this;
        }

        public Criteria andWpqxIsNotNull() {
            addCriterion("wpqx is not null");
            return (Criteria) this;
        }

        public Criteria andWpqxEqualTo(String value) {
            addCriterion("wpqx =", value, "wpqx");
            return (Criteria) this;
        }

        public Criteria andWpqxNotEqualTo(String value) {
            addCriterion("wpqx <>", value, "wpqx");
            return (Criteria) this;
        }

        public Criteria andWpqxGreaterThan(String value) {
            addCriterion("wpqx >", value, "wpqx");
            return (Criteria) this;
        }

        public Criteria andWpqxGreaterThanOrEqualTo(String value) {
            addCriterion("wpqx >=", value, "wpqx");
            return (Criteria) this;
        }

        public Criteria andWpqxLessThan(String value) {
            addCriterion("wpqx <", value, "wpqx");
            return (Criteria) this;
        }

        public Criteria andWpqxLessThanOrEqualTo(String value) {
            addCriterion("wpqx <=", value, "wpqx");
            return (Criteria) this;
        }

        public Criteria andWpqxLike(String value) {
            addCriterion("wpqx like", value, "wpqx");
            return (Criteria) this;
        }

        public Criteria andWpqxNotLike(String value) {
            addCriterion("wpqx not like", value, "wpqx");
            return (Criteria) this;
        }

        public Criteria andWpqxIn(List<String> values) {
            addCriterion("wpqx in", values, "wpqx");
            return (Criteria) this;
        }

        public Criteria andWpqxNotIn(List<String> values) {
            addCriterion("wpqx not in", values, "wpqx");
            return (Criteria) this;
        }

        public Criteria andWpqxBetween(String value1, String value2) {
            addCriterion("wpqx between", value1, value2, "wpqx");
            return (Criteria) this;
        }

        public Criteria andWpqxNotBetween(String value1, String value2) {
            addCriterion("wpqx not between", value1, value2, "wpqx");
            return (Criteria) this;
        }

        public Criteria andChrqIsNull() {
            addCriterion("chrq is null");
            return (Criteria) this;
        }

        public Criteria andChrqIsNotNull() {
            addCriterion("chrq is not null");
            return (Criteria) this;
        }

        public Criteria andChrqEqualTo(String value) {
            addCriterion("chrq =", value, "chrq");
            return (Criteria) this;
        }

        public Criteria andChrqNotEqualTo(String value) {
            addCriterion("chrq <>", value, "chrq");
            return (Criteria) this;
        }

        public Criteria andChrqGreaterThan(String value) {
            addCriterion("chrq >", value, "chrq");
            return (Criteria) this;
        }

        public Criteria andChrqGreaterThanOrEqualTo(String value) {
            addCriterion("chrq >=", value, "chrq");
            return (Criteria) this;
        }

        public Criteria andChrqLessThan(String value) {
            addCriterion("chrq <", value, "chrq");
            return (Criteria) this;
        }

        public Criteria andChrqLessThanOrEqualTo(String value) {
            addCriterion("chrq <=", value, "chrq");
            return (Criteria) this;
        }

        public Criteria andChrqLike(String value) {
            addCriterion("chrq like", value, "chrq");
            return (Criteria) this;
        }

        public Criteria andChrqNotLike(String value) {
            addCriterion("chrq not like", value, "chrq");
            return (Criteria) this;
        }

        public Criteria andChrqIn(List<String> values) {
            addCriterion("chrq in", values, "chrq");
            return (Criteria) this;
        }

        public Criteria andChrqNotIn(List<String> values) {
            addCriterion("chrq not in", values, "chrq");
            return (Criteria) this;
        }

        public Criteria andChrqBetween(String value1, String value2) {
            addCriterion("chrq between", value1, value2, "chrq");
            return (Criteria) this;
        }

        public Criteria andChrqNotBetween(String value1, String value2) {
            addCriterion("chrq not between", value1, value2, "chrq");
            return (Criteria) this;
        }

        public Criteria andChrIsNull() {
            addCriterion("chr is null");
            return (Criteria) this;
        }

        public Criteria andChrIsNotNull() {
            addCriterion("chr is not null");
            return (Criteria) this;
        }

        public Criteria andChrEqualTo(String value) {
            addCriterion("chr =", value, "chr");
            return (Criteria) this;
        }

        public Criteria andChrNotEqualTo(String value) {
            addCriterion("chr <>", value, "chr");
            return (Criteria) this;
        }

        public Criteria andChrGreaterThan(String value) {
            addCriterion("chr >", value, "chr");
            return (Criteria) this;
        }

        public Criteria andChrGreaterThanOrEqualTo(String value) {
            addCriterion("chr >=", value, "chr");
            return (Criteria) this;
        }

        public Criteria andChrLessThan(String value) {
            addCriterion("chr <", value, "chr");
            return (Criteria) this;
        }

        public Criteria andChrLessThanOrEqualTo(String value) {
            addCriterion("chr <=", value, "chr");
            return (Criteria) this;
        }

        public Criteria andChrLike(String value) {
            addCriterion("chr like", value, "chr");
            return (Criteria) this;
        }

        public Criteria andChrNotLike(String value) {
            addCriterion("chr not like", value, "chr");
            return (Criteria) this;
        }

        public Criteria andChrIn(List<String> values) {
            addCriterion("chr in", values, "chr");
            return (Criteria) this;
        }

        public Criteria andChrNotIn(List<String> values) {
            addCriterion("chr not in", values, "chr");
            return (Criteria) this;
        }

        public Criteria andChrBetween(String value1, String value2) {
            addCriterion("chr between", value1, value2, "chr");
            return (Criteria) this;
        }

        public Criteria andChrNotBetween(String value1, String value2) {
            addCriterion("chr not between", value1, value2, "chr");
            return (Criteria) this;
        }

        public Criteria andChrlxdhIsNull() {
            addCriterion("chrlxdh is null");
            return (Criteria) this;
        }

        public Criteria andChrlxdhIsNotNull() {
            addCriterion("chrlxdh is not null");
            return (Criteria) this;
        }

        public Criteria andChrlxdhEqualTo(String value) {
            addCriterion("chrlxdh =", value, "chrlxdh");
            return (Criteria) this;
        }

        public Criteria andChrlxdhNotEqualTo(String value) {
            addCriterion("chrlxdh <>", value, "chrlxdh");
            return (Criteria) this;
        }

        public Criteria andChrlxdhGreaterThan(String value) {
            addCriterion("chrlxdh >", value, "chrlxdh");
            return (Criteria) this;
        }

        public Criteria andChrlxdhGreaterThanOrEqualTo(String value) {
            addCriterion("chrlxdh >=", value, "chrlxdh");
            return (Criteria) this;
        }

        public Criteria andChrlxdhLessThan(String value) {
            addCriterion("chrlxdh <", value, "chrlxdh");
            return (Criteria) this;
        }

        public Criteria andChrlxdhLessThanOrEqualTo(String value) {
            addCriterion("chrlxdh <=", value, "chrlxdh");
            return (Criteria) this;
        }

        public Criteria andChrlxdhLike(String value) {
            addCriterion("chrlxdh like", value, "chrlxdh");
            return (Criteria) this;
        }

        public Criteria andChrlxdhNotLike(String value) {
            addCriterion("chrlxdh not like", value, "chrlxdh");
            return (Criteria) this;
        }

        public Criteria andChrlxdhIn(List<String> values) {
            addCriterion("chrlxdh in", values, "chrlxdh");
            return (Criteria) this;
        }

        public Criteria andChrlxdhNotIn(List<String> values) {
            addCriterion("chrlxdh not in", values, "chrlxdh");
            return (Criteria) this;
        }

        public Criteria andChrlxdhBetween(String value1, String value2) {
            addCriterion("chrlxdh between", value1, value2, "chrlxdh");
            return (Criteria) this;
        }

        public Criteria andChrlxdhNotBetween(String value1, String value2) {
            addCriterion("chrlxdh not between", value1, value2, "chrlxdh");
            return (Criteria) this;
        }

        public Criteria andFxdwIsNull() {
            addCriterion("fxdw is null");
            return (Criteria) this;
        }

        public Criteria andFxdwIsNotNull() {
            addCriterion("fxdw is not null");
            return (Criteria) this;
        }

        public Criteria andFxdwEqualTo(String value) {
            addCriterion("fxdw =", value, "fxdw");
            return (Criteria) this;
        }

        public Criteria andFxdwNotEqualTo(String value) {
            addCriterion("fxdw <>", value, "fxdw");
            return (Criteria) this;
        }

        public Criteria andFxdwGreaterThan(String value) {
            addCriterion("fxdw >", value, "fxdw");
            return (Criteria) this;
        }

        public Criteria andFxdwGreaterThanOrEqualTo(String value) {
            addCriterion("fxdw >=", value, "fxdw");
            return (Criteria) this;
        }

        public Criteria andFxdwLessThan(String value) {
            addCriterion("fxdw <", value, "fxdw");
            return (Criteria) this;
        }

        public Criteria andFxdwLessThanOrEqualTo(String value) {
            addCriterion("fxdw <=", value, "fxdw");
            return (Criteria) this;
        }

        public Criteria andFxdwLike(String value) {
            addCriterion("fxdw like", value, "fxdw");
            return (Criteria) this;
        }

        public Criteria andFxdwNotLike(String value) {
            addCriterion("fxdw not like", value, "fxdw");
            return (Criteria) this;
        }

        public Criteria andFxdwIn(List<String> values) {
            addCriterion("fxdw in", values, "fxdw");
            return (Criteria) this;
        }

        public Criteria andFxdwNotIn(List<String> values) {
            addCriterion("fxdw not in", values, "fxdw");
            return (Criteria) this;
        }

        public Criteria andFxdwBetween(String value1, String value2) {
            addCriterion("fxdw between", value1, value2, "fxdw");
            return (Criteria) this;
        }

        public Criteria andFxdwNotBetween(String value1, String value2) {
            addCriterion("fxdw not between", value1, value2, "fxdw");
            return (Criteria) this;
        }

        public Criteria andFxrqIsNull() {
            addCriterion("fxrq is null");
            return (Criteria) this;
        }

        public Criteria andFxrqIsNotNull() {
            addCriterion("fxrq is not null");
            return (Criteria) this;
        }

        public Criteria andFxrqEqualTo(String value) {
            addCriterion("fxrq =", value, "fxrq");
            return (Criteria) this;
        }

        public Criteria andFxrqNotEqualTo(String value) {
            addCriterion("fxrq <>", value, "fxrq");
            return (Criteria) this;
        }

        public Criteria andFxrqGreaterThan(String value) {
            addCriterion("fxrq >", value, "fxrq");
            return (Criteria) this;
        }

        public Criteria andFxrqGreaterThanOrEqualTo(String value) {
            addCriterion("fxrq >=", value, "fxrq");
            return (Criteria) this;
        }

        public Criteria andFxrqLessThan(String value) {
            addCriterion("fxrq <", value, "fxrq");
            return (Criteria) this;
        }

        public Criteria andFxrqLessThanOrEqualTo(String value) {
            addCriterion("fxrq <=", value, "fxrq");
            return (Criteria) this;
        }

        public Criteria andFxrqLike(String value) {
            addCriterion("fxrq like", value, "fxrq");
            return (Criteria) this;
        }

        public Criteria andFxrqNotLike(String value) {
            addCriterion("fxrq not like", value, "fxrq");
            return (Criteria) this;
        }

        public Criteria andFxrqIn(List<String> values) {
            addCriterion("fxrq in", values, "fxrq");
            return (Criteria) this;
        }

        public Criteria andFxrqNotIn(List<String> values) {
            addCriterion("fxrq not in", values, "fxrq");
            return (Criteria) this;
        }

        public Criteria andFxrqBetween(String value1, String value2) {
            addCriterion("fxrq between", value1, value2, "fxrq");
            return (Criteria) this;
        }

        public Criteria andFxrqNotBetween(String value1, String value2) {
            addCriterion("fxrq not between", value1, value2, "fxrq");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhIsNull() {
            addCriterion("fxrlxdh is null");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhIsNotNull() {
            addCriterion("fxrlxdh is not null");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhEqualTo(String value) {
            addCriterion("fxrlxdh =", value, "fxrlxdh");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhNotEqualTo(String value) {
            addCriterion("fxrlxdh <>", value, "fxrlxdh");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhGreaterThan(String value) {
            addCriterion("fxrlxdh >", value, "fxrlxdh");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhGreaterThanOrEqualTo(String value) {
            addCriterion("fxrlxdh >=", value, "fxrlxdh");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhLessThan(String value) {
            addCriterion("fxrlxdh <", value, "fxrlxdh");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhLessThanOrEqualTo(String value) {
            addCriterion("fxrlxdh <=", value, "fxrlxdh");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhLike(String value) {
            addCriterion("fxrlxdh like", value, "fxrlxdh");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhNotLike(String value) {
            addCriterion("fxrlxdh not like", value, "fxrlxdh");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhIn(List<String> values) {
            addCriterion("fxrlxdh in", values, "fxrlxdh");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhNotIn(List<String> values) {
            addCriterion("fxrlxdh not in", values, "fxrlxdh");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhBetween(String value1, String value2) {
            addCriterion("fxrlxdh between", value1, value2, "fxrlxdh");
            return (Criteria) this;
        }

        public Criteria andFxrlxdhNotBetween(String value1, String value2) {
            addCriterion("fxrlxdh not between", value1, value2, "fxrlxdh");
            return (Criteria) this;
        }

        public Criteria andChdwIsNull() {
            addCriterion("chdw is null");
            return (Criteria) this;
        }

        public Criteria andChdwIsNotNull() {
            addCriterion("chdw is not null");
            return (Criteria) this;
        }

        public Criteria andChdwEqualTo(String value) {
            addCriterion("chdw =", value, "chdw");
            return (Criteria) this;
        }

        public Criteria andChdwNotEqualTo(String value) {
            addCriterion("chdw <>", value, "chdw");
            return (Criteria) this;
        }

        public Criteria andChdwGreaterThan(String value) {
            addCriterion("chdw >", value, "chdw");
            return (Criteria) this;
        }

        public Criteria andChdwGreaterThanOrEqualTo(String value) {
            addCriterion("chdw >=", value, "chdw");
            return (Criteria) this;
        }

        public Criteria andChdwLessThan(String value) {
            addCriterion("chdw <", value, "chdw");
            return (Criteria) this;
        }

        public Criteria andChdwLessThanOrEqualTo(String value) {
            addCriterion("chdw <=", value, "chdw");
            return (Criteria) this;
        }

        public Criteria andChdwLike(String value) {
            addCriterion("chdw like", value, "chdw");
            return (Criteria) this;
        }

        public Criteria andChdwNotLike(String value) {
            addCriterion("chdw not like", value, "chdw");
            return (Criteria) this;
        }

        public Criteria andChdwIn(List<String> values) {
            addCriterion("chdw in", values, "chdw");
            return (Criteria) this;
        }

        public Criteria andChdwNotIn(List<String> values) {
            addCriterion("chdw not in", values, "chdw");
            return (Criteria) this;
        }

        public Criteria andChdwBetween(String value1, String value2) {
            addCriterion("chdw between", value1, value2, "chdw");
            return (Criteria) this;
        }

        public Criteria andChdwNotBetween(String value1, String value2) {
            addCriterion("chdw not between", value1, value2, "chdw");
            return (Criteria) this;
        }

        public Criteria andFxddIsNull() {
            addCriterion("fxdd is null");
            return (Criteria) this;
        }

        public Criteria andFxddIsNotNull() {
            addCriterion("fxdd is not null");
            return (Criteria) this;
        }

        public Criteria andFxddEqualTo(String value) {
            addCriterion("fxdd =", value, "fxdd");
            return (Criteria) this;
        }

        public Criteria andFxddNotEqualTo(String value) {
            addCriterion("fxdd <>", value, "fxdd");
            return (Criteria) this;
        }

        public Criteria andFxddGreaterThan(String value) {
            addCriterion("fxdd >", value, "fxdd");
            return (Criteria) this;
        }

        public Criteria andFxddGreaterThanOrEqualTo(String value) {
            addCriterion("fxdd >=", value, "fxdd");
            return (Criteria) this;
        }

        public Criteria andFxddLessThan(String value) {
            addCriterion("fxdd <", value, "fxdd");
            return (Criteria) this;
        }

        public Criteria andFxddLessThanOrEqualTo(String value) {
            addCriterion("fxdd <=", value, "fxdd");
            return (Criteria) this;
        }

        public Criteria andFxddLike(String value) {
            addCriterion("fxdd like", value, "fxdd");
            return (Criteria) this;
        }

        public Criteria andFxddNotLike(String value) {
            addCriterion("fxdd not like", value, "fxdd");
            return (Criteria) this;
        }

        public Criteria andFxddIn(List<String> values) {
            addCriterion("fxdd in", values, "fxdd");
            return (Criteria) this;
        }

        public Criteria andFxddNotIn(List<String> values) {
            addCriterion("fxdd not in", values, "fxdd");
            return (Criteria) this;
        }

        public Criteria andFxddBetween(String value1, String value2) {
            addCriterion("fxdd between", value1, value2, "fxdd");
            return (Criteria) this;
        }

        public Criteria andFxddNotBetween(String value1, String value2) {
            addCriterion("fxdd not between", value1, value2, "fxdd");
            return (Criteria) this;
        }

        public Criteria andHbzldmIsNull() {
            addCriterion("hbzldm is null");
            return (Criteria) this;
        }

        public Criteria andHbzldmIsNotNull() {
            addCriterion("hbzldm is not null");
            return (Criteria) this;
        }

        public Criteria andHbzldmEqualTo(String value) {
            addCriterion("hbzldm =", value, "hbzldm");
            return (Criteria) this;
        }

        public Criteria andHbzldmNotEqualTo(String value) {
            addCriterion("hbzldm <>", value, "hbzldm");
            return (Criteria) this;
        }

        public Criteria andHbzldmGreaterThan(String value) {
            addCriterion("hbzldm >", value, "hbzldm");
            return (Criteria) this;
        }

        public Criteria andHbzldmGreaterThanOrEqualTo(String value) {
            addCriterion("hbzldm >=", value, "hbzldm");
            return (Criteria) this;
        }

        public Criteria andHbzldmLessThan(String value) {
            addCriterion("hbzldm <", value, "hbzldm");
            return (Criteria) this;
        }

        public Criteria andHbzldmLessThanOrEqualTo(String value) {
            addCriterion("hbzldm <=", value, "hbzldm");
            return (Criteria) this;
        }

        public Criteria andHbzldmLike(String value) {
            addCriterion("hbzldm like", value, "hbzldm");
            return (Criteria) this;
        }

        public Criteria andHbzldmNotLike(String value) {
            addCriterion("hbzldm not like", value, "hbzldm");
            return (Criteria) this;
        }

        public Criteria andHbzldmIn(List<String> values) {
            addCriterion("hbzldm in", values, "hbzldm");
            return (Criteria) this;
        }

        public Criteria andHbzldmNotIn(List<String> values) {
            addCriterion("hbzldm not in", values, "hbzldm");
            return (Criteria) this;
        }

        public Criteria andHbzldmBetween(String value1, String value2) {
            addCriterion("hbzldm between", value1, value2, "hbzldm");
            return (Criteria) this;
        }

        public Criteria andHbzldmNotBetween(String value1, String value2) {
            addCriterion("hbzldm not between", value1, value2, "hbzldm");
            return (Criteria) this;
        }

        public Criteria andMeIsNull() {
            addCriterion("me is null");
            return (Criteria) this;
        }

        public Criteria andMeIsNotNull() {
            addCriterion("me is not null");
            return (Criteria) this;
        }

        public Criteria andMeEqualTo(String value) {
            addCriterion("me =", value, "me");
            return (Criteria) this;
        }

        public Criteria andMeNotEqualTo(String value) {
            addCriterion("me <>", value, "me");
            return (Criteria) this;
        }

        public Criteria andMeGreaterThan(String value) {
            addCriterion("me >", value, "me");
            return (Criteria) this;
        }

        public Criteria andMeGreaterThanOrEqualTo(String value) {
            addCriterion("me >=", value, "me");
            return (Criteria) this;
        }

        public Criteria andMeLessThan(String value) {
            addCriterion("me <", value, "me");
            return (Criteria) this;
        }

        public Criteria andMeLessThanOrEqualTo(String value) {
            addCriterion("me <=", value, "me");
            return (Criteria) this;
        }

        public Criteria andMeLike(String value) {
            addCriterion("me like", value, "me");
            return (Criteria) this;
        }

        public Criteria andMeNotLike(String value) {
            addCriterion("me not like", value, "me");
            return (Criteria) this;
        }

        public Criteria andMeIn(List<String> values) {
            addCriterion("me in", values, "me");
            return (Criteria) this;
        }

        public Criteria andMeNotIn(List<String> values) {
            addCriterion("me not in", values, "me");
            return (Criteria) this;
        }

        public Criteria andMeBetween(String value1, String value2) {
            addCriterion("me between", value1, value2, "me");
            return (Criteria) this;
        }

        public Criteria andMeNotBetween(String value1, String value2) {
            addCriterion("me not between", value1, value2, "me");
            return (Criteria) this;
        }

        public Criteria andDyxhdmIsNull() {
            addCriterion("dyxhdm is null");
            return (Criteria) this;
        }

        public Criteria andDyxhdmIsNotNull() {
            addCriterion("dyxhdm is not null");
            return (Criteria) this;
        }

        public Criteria andDyxhdmEqualTo(String value) {
            addCriterion("dyxhdm =", value, "dyxhdm");
            return (Criteria) this;
        }

        public Criteria andDyxhdmNotEqualTo(String value) {
            addCriterion("dyxhdm <>", value, "dyxhdm");
            return (Criteria) this;
        }

        public Criteria andDyxhdmGreaterThan(String value) {
            addCriterion("dyxhdm >", value, "dyxhdm");
            return (Criteria) this;
        }

        public Criteria andDyxhdmGreaterThanOrEqualTo(String value) {
            addCriterion("dyxhdm >=", value, "dyxhdm");
            return (Criteria) this;
        }

        public Criteria andDyxhdmLessThan(String value) {
            addCriterion("dyxhdm <", value, "dyxhdm");
            return (Criteria) this;
        }

        public Criteria andDyxhdmLessThanOrEqualTo(String value) {
            addCriterion("dyxhdm <=", value, "dyxhdm");
            return (Criteria) this;
        }

        public Criteria andDyxhdmLike(String value) {
            addCriterion("dyxhdm like", value, "dyxhdm");
            return (Criteria) this;
        }

        public Criteria andDyxhdmNotLike(String value) {
            addCriterion("dyxhdm not like", value, "dyxhdm");
            return (Criteria) this;
        }

        public Criteria andDyxhdmIn(List<String> values) {
            addCriterion("dyxhdm in", values, "dyxhdm");
            return (Criteria) this;
        }

        public Criteria andDyxhdmNotIn(List<String> values) {
            addCriterion("dyxhdm not in", values, "dyxhdm");
            return (Criteria) this;
        }

        public Criteria andDyxhdmBetween(String value1, String value2) {
            addCriterion("dyxhdm between", value1, value2, "dyxhdm");
            return (Criteria) this;
        }

        public Criteria andDyxhdmNotBetween(String value1, String value2) {
            addCriterion("dyxhdm not between", value1, value2, "dyxhdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmIsNull() {
            addCriterion("syr_cyzjlxdm is null");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmIsNotNull() {
            addCriterion("syr_cyzjlxdm is not null");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmEqualTo(String value) {
            addCriterion("syr_cyzjlxdm =", value, "syrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmNotEqualTo(String value) {
            addCriterion("syr_cyzjlxdm <>", value, "syrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmGreaterThan(String value) {
            addCriterion("syr_cyzjlxdm >", value, "syrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmGreaterThanOrEqualTo(String value) {
            addCriterion("syr_cyzjlxdm >=", value, "syrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmLessThan(String value) {
            addCriterion("syr_cyzjlxdm <", value, "syrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmLessThanOrEqualTo(String value) {
            addCriterion("syr_cyzjlxdm <=", value, "syrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmLike(String value) {
            addCriterion("syr_cyzjlxdm like", value, "syrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmNotLike(String value) {
            addCriterion("syr_cyzjlxdm not like", value, "syrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmIn(List<String> values) {
            addCriterion("syr_cyzjlxdm in", values, "syrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmNotIn(List<String> values) {
            addCriterion("syr_cyzjlxdm not in", values, "syrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmBetween(String value1, String value2) {
            addCriterion("syr_cyzjlxdm between", value1, value2, "syrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxdmNotBetween(String value1, String value2) {
            addCriterion("syr_cyzjlxdm not between", value1, value2, "syrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcIsNull() {
            addCriterion("syr_cyzjlxmc is null");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcIsNotNull() {
            addCriterion("syr_cyzjlxmc is not null");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcEqualTo(String value) {
            addCriterion("syr_cyzjlxmc =", value, "syrCyzjlxmc");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcNotEqualTo(String value) {
            addCriterion("syr_cyzjlxmc <>", value, "syrCyzjlxmc");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcGreaterThan(String value) {
            addCriterion("syr_cyzjlxmc >", value, "syrCyzjlxmc");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcGreaterThanOrEqualTo(String value) {
            addCriterion("syr_cyzjlxmc >=", value, "syrCyzjlxmc");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcLessThan(String value) {
            addCriterion("syr_cyzjlxmc <", value, "syrCyzjlxmc");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcLessThanOrEqualTo(String value) {
            addCriterion("syr_cyzjlxmc <=", value, "syrCyzjlxmc");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcLike(String value) {
            addCriterion("syr_cyzjlxmc like", value, "syrCyzjlxmc");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcNotLike(String value) {
            addCriterion("syr_cyzjlxmc not like", value, "syrCyzjlxmc");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcIn(List<String> values) {
            addCriterion("syr_cyzjlxmc in", values, "syrCyzjlxmc");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcNotIn(List<String> values) {
            addCriterion("syr_cyzjlxmc not in", values, "syrCyzjlxmc");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcBetween(String value1, String value2) {
            addCriterion("syr_cyzjlxmc between", value1, value2, "syrCyzjlxmc");
            return (Criteria) this;
        }

        public Criteria andSyrCyzjlxmcNotBetween(String value1, String value2) {
            addCriterion("syr_cyzjlxmc not between", value1, value2, "syrCyzjlxmc");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmIsNull() {
            addCriterion("syr_zjhm is null");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmIsNotNull() {
            addCriterion("syr_zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmEqualTo(String value) {
            addCriterion("syr_zjhm =", value, "syrZjhm");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmNotEqualTo(String value) {
            addCriterion("syr_zjhm <>", value, "syrZjhm");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmGreaterThan(String value) {
            addCriterion("syr_zjhm >", value, "syrZjhm");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("syr_zjhm >=", value, "syrZjhm");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmLessThan(String value) {
            addCriterion("syr_zjhm <", value, "syrZjhm");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmLessThanOrEqualTo(String value) {
            addCriterion("syr_zjhm <=", value, "syrZjhm");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmLike(String value) {
            addCriterion("syr_zjhm like", value, "syrZjhm");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmNotLike(String value) {
            addCriterion("syr_zjhm not like", value, "syrZjhm");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmIn(List<String> values) {
            addCriterion("syr_zjhm in", values, "syrZjhm");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmNotIn(List<String> values) {
            addCriterion("syr_zjhm not in", values, "syrZjhm");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmBetween(String value1, String value2) {
            addCriterion("syr_zjhm between", value1, value2, "syrZjhm");
            return (Criteria) this;
        }

        public Criteria andSyrZjhmNotBetween(String value1, String value2) {
            addCriterion("syr_zjhm not between", value1, value2, "syrZjhm");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhIsNull() {
            addCriterion("syr_lxdh is null");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhIsNotNull() {
            addCriterion("syr_lxdh is not null");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhEqualTo(String value) {
            addCriterion("syr_lxdh =", value, "syrLxdh");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhNotEqualTo(String value) {
            addCriterion("syr_lxdh <>", value, "syrLxdh");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhGreaterThan(String value) {
            addCriterion("syr_lxdh >", value, "syrLxdh");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("syr_lxdh >=", value, "syrLxdh");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhLessThan(String value) {
            addCriterion("syr_lxdh <", value, "syrLxdh");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhLessThanOrEqualTo(String value) {
            addCriterion("syr_lxdh <=", value, "syrLxdh");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhLike(String value) {
            addCriterion("syr_lxdh like", value, "syrLxdh");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhNotLike(String value) {
            addCriterion("syr_lxdh not like", value, "syrLxdh");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhIn(List<String> values) {
            addCriterion("syr_lxdh in", values, "syrLxdh");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhNotIn(List<String> values) {
            addCriterion("syr_lxdh not in", values, "syrLxdh");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhBetween(String value1, String value2) {
            addCriterion("syr_lxdh between", value1, value2, "syrLxdh");
            return (Criteria) this;
        }

        public Criteria andSyrLxdhNotBetween(String value1, String value2) {
            addCriterion("syr_lxdh not between", value1, value2, "syrLxdh");
            return (Criteria) this;
        }

        public Criteria andSyrXmIsNull() {
            addCriterion("syr_xm is null");
            return (Criteria) this;
        }

        public Criteria andSyrXmIsNotNull() {
            addCriterion("syr_xm is not null");
            return (Criteria) this;
        }

        public Criteria andSyrXmEqualTo(String value) {
            addCriterion("syr_xm =", value, "syrXm");
            return (Criteria) this;
        }

        public Criteria andSyrXmNotEqualTo(String value) {
            addCriterion("syr_xm <>", value, "syrXm");
            return (Criteria) this;
        }

        public Criteria andSyrXmGreaterThan(String value) {
            addCriterion("syr_xm >", value, "syrXm");
            return (Criteria) this;
        }

        public Criteria andSyrXmGreaterThanOrEqualTo(String value) {
            addCriterion("syr_xm >=", value, "syrXm");
            return (Criteria) this;
        }

        public Criteria andSyrXmLessThan(String value) {
            addCriterion("syr_xm <", value, "syrXm");
            return (Criteria) this;
        }

        public Criteria andSyrXmLessThanOrEqualTo(String value) {
            addCriterion("syr_xm <=", value, "syrXm");
            return (Criteria) this;
        }

        public Criteria andSyrXmLike(String value) {
            addCriterion("syr_xm like", value, "syrXm");
            return (Criteria) this;
        }

        public Criteria andSyrXmNotLike(String value) {
            addCriterion("syr_xm not like", value, "syrXm");
            return (Criteria) this;
        }

        public Criteria andSyrXmIn(List<String> values) {
            addCriterion("syr_xm in", values, "syrXm");
            return (Criteria) this;
        }

        public Criteria andSyrXmNotIn(List<String> values) {
            addCriterion("syr_xm not in", values, "syrXm");
            return (Criteria) this;
        }

        public Criteria andSyrXmBetween(String value1, String value2) {
            addCriterion("syr_xm between", value1, value2, "syrXm");
            return (Criteria) this;
        }

        public Criteria andSyrXmNotBetween(String value1, String value2) {
            addCriterion("syr_xm not between", value1, value2, "syrXm");
            return (Criteria) this;
        }

        public Criteria andCyrXmIsNull() {
            addCriterion("cyr_xm is null");
            return (Criteria) this;
        }

        public Criteria andCyrXmIsNotNull() {
            addCriterion("cyr_xm is not null");
            return (Criteria) this;
        }

        public Criteria andCyrXmEqualTo(String value) {
            addCriterion("cyr_xm =", value, "cyrXm");
            return (Criteria) this;
        }

        public Criteria andCyrXmNotEqualTo(String value) {
            addCriterion("cyr_xm <>", value, "cyrXm");
            return (Criteria) this;
        }

        public Criteria andCyrXmGreaterThan(String value) {
            addCriterion("cyr_xm >", value, "cyrXm");
            return (Criteria) this;
        }

        public Criteria andCyrXmGreaterThanOrEqualTo(String value) {
            addCriterion("cyr_xm >=", value, "cyrXm");
            return (Criteria) this;
        }

        public Criteria andCyrXmLessThan(String value) {
            addCriterion("cyr_xm <", value, "cyrXm");
            return (Criteria) this;
        }

        public Criteria andCyrXmLessThanOrEqualTo(String value) {
            addCriterion("cyr_xm <=", value, "cyrXm");
            return (Criteria) this;
        }

        public Criteria andCyrXmLike(String value) {
            addCriterion("cyr_xm like", value, "cyrXm");
            return (Criteria) this;
        }

        public Criteria andCyrXmNotLike(String value) {
            addCriterion("cyr_xm not like", value, "cyrXm");
            return (Criteria) this;
        }

        public Criteria andCyrXmIn(List<String> values) {
            addCriterion("cyr_xm in", values, "cyrXm");
            return (Criteria) this;
        }

        public Criteria andCyrXmNotIn(List<String> values) {
            addCriterion("cyr_xm not in", values, "cyrXm");
            return (Criteria) this;
        }

        public Criteria andCyrXmBetween(String value1, String value2) {
            addCriterion("cyr_xm between", value1, value2, "cyrXm");
            return (Criteria) this;
        }

        public Criteria andCyrXmNotBetween(String value1, String value2) {
            addCriterion("cyr_xm not between", value1, value2, "cyrXm");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmIsNull() {
            addCriterion("cyr_cyzjlxdm is null");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmIsNotNull() {
            addCriterion("cyr_cyzjlxdm is not null");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmEqualTo(String value) {
            addCriterion("cyr_cyzjlxdm =", value, "cyrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmNotEqualTo(String value) {
            addCriterion("cyr_cyzjlxdm <>", value, "cyrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmGreaterThan(String value) {
            addCriterion("cyr_cyzjlxdm >", value, "cyrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmGreaterThanOrEqualTo(String value) {
            addCriterion("cyr_cyzjlxdm >=", value, "cyrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmLessThan(String value) {
            addCriterion("cyr_cyzjlxdm <", value, "cyrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmLessThanOrEqualTo(String value) {
            addCriterion("cyr_cyzjlxdm <=", value, "cyrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmLike(String value) {
            addCriterion("cyr_cyzjlxdm like", value, "cyrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmNotLike(String value) {
            addCriterion("cyr_cyzjlxdm not like", value, "cyrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmIn(List<String> values) {
            addCriterion("cyr_cyzjlxdm in", values, "cyrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmNotIn(List<String> values) {
            addCriterion("cyr_cyzjlxdm not in", values, "cyrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmBetween(String value1, String value2) {
            addCriterion("cyr_cyzjlxdm between", value1, value2, "cyrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andCyrCyzjlxdmNotBetween(String value1, String value2) {
            addCriterion("cyr_cyzjlxdm not between", value1, value2, "cyrCyzjlxdm");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmIsNull() {
            addCriterion("cyr_zjhm is null");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmIsNotNull() {
            addCriterion("cyr_zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmEqualTo(String value) {
            addCriterion("cyr_zjhm =", value, "cyrZjhm");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmNotEqualTo(String value) {
            addCriterion("cyr_zjhm <>", value, "cyrZjhm");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmGreaterThan(String value) {
            addCriterion("cyr_zjhm >", value, "cyrZjhm");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("cyr_zjhm >=", value, "cyrZjhm");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmLessThan(String value) {
            addCriterion("cyr_zjhm <", value, "cyrZjhm");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmLessThanOrEqualTo(String value) {
            addCriterion("cyr_zjhm <=", value, "cyrZjhm");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmLike(String value) {
            addCriterion("cyr_zjhm like", value, "cyrZjhm");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmNotLike(String value) {
            addCriterion("cyr_zjhm not like", value, "cyrZjhm");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmIn(List<String> values) {
            addCriterion("cyr_zjhm in", values, "cyrZjhm");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmNotIn(List<String> values) {
            addCriterion("cyr_zjhm not in", values, "cyrZjhm");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmBetween(String value1, String value2) {
            addCriterion("cyr_zjhm between", value1, value2, "cyrZjhm");
            return (Criteria) this;
        }

        public Criteria andCyrZjhmNotBetween(String value1, String value2) {
            addCriterion("cyr_zjhm not between", value1, value2, "cyrZjhm");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhIsNull() {
            addCriterion("cyr_lxdh is null");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhIsNotNull() {
            addCriterion("cyr_lxdh is not null");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhEqualTo(String value) {
            addCriterion("cyr_lxdh =", value, "cyrLxdh");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhNotEqualTo(String value) {
            addCriterion("cyr_lxdh <>", value, "cyrLxdh");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhGreaterThan(String value) {
            addCriterion("cyr_lxdh >", value, "cyrLxdh");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("cyr_lxdh >=", value, "cyrLxdh");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhLessThan(String value) {
            addCriterion("cyr_lxdh <", value, "cyrLxdh");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhLessThanOrEqualTo(String value) {
            addCriterion("cyr_lxdh <=", value, "cyrLxdh");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhLike(String value) {
            addCriterion("cyr_lxdh like", value, "cyrLxdh");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhNotLike(String value) {
            addCriterion("cyr_lxdh not like", value, "cyrLxdh");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhIn(List<String> values) {
            addCriterion("cyr_lxdh in", values, "cyrLxdh");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhNotIn(List<String> values) {
            addCriterion("cyr_lxdh not in", values, "cyrLxdh");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhBetween(String value1, String value2) {
            addCriterion("cyr_lxdh between", value1, value2, "cyrLxdh");
            return (Criteria) this;
        }

        public Criteria andCyrLxdhNotBetween(String value1, String value2) {
            addCriterion("cyr_lxdh not between", value1, value2, "cyrLxdh");
            return (Criteria) this;
        }

        public Criteria andLyIsNull() {
            addCriterion("ly is null");
            return (Criteria) this;
        }

        public Criteria andLyIsNotNull() {
            addCriterion("ly is not null");
            return (Criteria) this;
        }

        public Criteria andLyEqualTo(String value) {
            addCriterion("ly =", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyNotEqualTo(String value) {
            addCriterion("ly <>", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyGreaterThan(String value) {
            addCriterion("ly >", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyGreaterThanOrEqualTo(String value) {
            addCriterion("ly >=", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyLessThan(String value) {
            addCriterion("ly <", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyLessThanOrEqualTo(String value) {
            addCriterion("ly <=", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyLike(String value) {
            addCriterion("ly like", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyNotLike(String value) {
            addCriterion("ly not like", value, "ly");
            return (Criteria) this;
        }

        public Criteria andLyIn(List<String> values) {
            addCriterion("ly in", values, "ly");
            return (Criteria) this;
        }

        public Criteria andLyNotIn(List<String> values) {
            addCriterion("ly not in", values, "ly");
            return (Criteria) this;
        }

        public Criteria andLyBetween(String value1, String value2) {
            addCriterion("ly between", value1, value2, "ly");
            return (Criteria) this;
        }

        public Criteria andLyNotBetween(String value1, String value2) {
            addCriterion("ly not between", value1, value2, "ly");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("cjsj is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("cjsj is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(String value) {
            addCriterion("cjsj =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(String value) {
            addCriterion("cjsj <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(String value) {
            addCriterion("cjsj >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(String value) {
            addCriterion("cjsj >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(String value) {
            addCriterion("cjsj <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(String value) {
            addCriterion("cjsj <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLike(String value) {
            addCriterion("cjsj like", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotLike(String value) {
            addCriterion("cjsj not like", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<String> values) {
            addCriterion("cjsj in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<String> values) {
            addCriterion("cjsj not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(String value1, String value2) {
            addCriterion("cjsj between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(String value1, String value2) {
            addCriterion("cjsj not between", value1, value2, "cjsj");
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