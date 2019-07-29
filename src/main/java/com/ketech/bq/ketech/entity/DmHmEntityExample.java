package com.ketech.bq.ketech.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DmHmEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmHmEntityExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andZjhmgsdIsNull() {
            addCriterion("zjhmgsd is null");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdIsNotNull() {
            addCriterion("zjhmgsd is not null");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdEqualTo(String value) {
            addCriterion("zjhmgsd =", value, "zjhmgsd");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdNotEqualTo(String value) {
            addCriterion("zjhmgsd <>", value, "zjhmgsd");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdGreaterThan(String value) {
            addCriterion("zjhmgsd >", value, "zjhmgsd");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdGreaterThanOrEqualTo(String value) {
            addCriterion("zjhmgsd >=", value, "zjhmgsd");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdLessThan(String value) {
            addCriterion("zjhmgsd <", value, "zjhmgsd");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdLessThanOrEqualTo(String value) {
            addCriterion("zjhmgsd <=", value, "zjhmgsd");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdLike(String value) {
            addCriterion("zjhmgsd like", value, "zjhmgsd");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdNotLike(String value) {
            addCriterion("zjhmgsd not like", value, "zjhmgsd");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdIn(List<String> values) {
            addCriterion("zjhmgsd in", values, "zjhmgsd");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdNotIn(List<String> values) {
            addCriterion("zjhmgsd not in", values, "zjhmgsd");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdBetween(String value1, String value2) {
            addCriterion("zjhmgsd between", value1, value2, "zjhmgsd");
            return (Criteria) this;
        }

        public Criteria andZjhmgsdNotBetween(String value1, String value2) {
            addCriterion("zjhmgsd not between", value1, value2, "zjhmgsd");
            return (Criteria) this;
        }

        public Criteria andBjhmIsNull() {
            addCriterion("bjhm is null");
            return (Criteria) this;
        }

        public Criteria andBjhmIsNotNull() {
            addCriterion("bjhm is not null");
            return (Criteria) this;
        }

        public Criteria andBjhmEqualTo(String value) {
            addCriterion("bjhm =", value, "bjhm");
            return (Criteria) this;
        }

        public Criteria andBjhmNotEqualTo(String value) {
            addCriterion("bjhm <>", value, "bjhm");
            return (Criteria) this;
        }

        public Criteria andBjhmGreaterThan(String value) {
            addCriterion("bjhm >", value, "bjhm");
            return (Criteria) this;
        }

        public Criteria andBjhmGreaterThanOrEqualTo(String value) {
            addCriterion("bjhm >=", value, "bjhm");
            return (Criteria) this;
        }

        public Criteria andBjhmLessThan(String value) {
            addCriterion("bjhm <", value, "bjhm");
            return (Criteria) this;
        }

        public Criteria andBjhmLessThanOrEqualTo(String value) {
            addCriterion("bjhm <=", value, "bjhm");
            return (Criteria) this;
        }

        public Criteria andBjhmLike(String value) {
            addCriterion("bjhm like", value, "bjhm");
            return (Criteria) this;
        }

        public Criteria andBjhmNotLike(String value) {
            addCriterion("bjhm not like", value, "bjhm");
            return (Criteria) this;
        }

        public Criteria andBjhmIn(List<String> values) {
            addCriterion("bjhm in", values, "bjhm");
            return (Criteria) this;
        }

        public Criteria andBjhmNotIn(List<String> values) {
            addCriterion("bjhm not in", values, "bjhm");
            return (Criteria) this;
        }

        public Criteria andBjhmBetween(String value1, String value2) {
            addCriterion("bjhm between", value1, value2, "bjhm");
            return (Criteria) this;
        }

        public Criteria andBjhmNotBetween(String value1, String value2) {
            addCriterion("bjhm not between", value1, value2, "bjhm");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdIsNull() {
            addCriterion("bjhmgsd is null");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdIsNotNull() {
            addCriterion("bjhmgsd is not null");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdEqualTo(String value) {
            addCriterion("bjhmgsd =", value, "bjhmgsd");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdNotEqualTo(String value) {
            addCriterion("bjhmgsd <>", value, "bjhmgsd");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdGreaterThan(String value) {
            addCriterion("bjhmgsd >", value, "bjhmgsd");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdGreaterThanOrEqualTo(String value) {
            addCriterion("bjhmgsd >=", value, "bjhmgsd");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdLessThan(String value) {
            addCriterion("bjhmgsd <", value, "bjhmgsd");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdLessThanOrEqualTo(String value) {
            addCriterion("bjhmgsd <=", value, "bjhmgsd");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdLike(String value) {
            addCriterion("bjhmgsd like", value, "bjhmgsd");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdNotLike(String value) {
            addCriterion("bjhmgsd not like", value, "bjhmgsd");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdIn(List<String> values) {
            addCriterion("bjhmgsd in", values, "bjhmgsd");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdNotIn(List<String> values) {
            addCriterion("bjhmgsd not in", values, "bjhmgsd");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdBetween(String value1, String value2) {
            addCriterion("bjhmgsd between", value1, value2, "bjhmgsd");
            return (Criteria) this;
        }

        public Criteria andBjhmgsdNotBetween(String value1, String value2) {
            addCriterion("bjhmgsd not between", value1, value2, "bjhmgsd");
            return (Criteria) this;
        }

        public Criteria andThkssjIsNull() {
            addCriterion("thkssj is null");
            return (Criteria) this;
        }

        public Criteria andThkssjIsNotNull() {
            addCriterion("thkssj is not null");
            return (Criteria) this;
        }

        public Criteria andThkssjEqualTo(String value) {
            addCriterion("thkssj =", value, "thkssj");
            return (Criteria) this;
        }

        public Criteria andThkssjNotEqualTo(String value) {
            addCriterion("thkssj <>", value, "thkssj");
            return (Criteria) this;
        }

        public Criteria andThkssjGreaterThan(String value) {
            addCriterion("thkssj >", value, "thkssj");
            return (Criteria) this;
        }

        public Criteria andThkssjGreaterThanOrEqualTo(String value) {
            addCriterion("thkssj >=", value, "thkssj");
            return (Criteria) this;
        }

        public Criteria andThkssjLessThan(String value) {
            addCriterion("thkssj <", value, "thkssj");
            return (Criteria) this;
        }

        public Criteria andThkssjLessThanOrEqualTo(String value) {
            addCriterion("thkssj <=", value, "thkssj");
            return (Criteria) this;
        }

        public Criteria andThkssjLike(String value) {
            addCriterion("thkssj like", value, "thkssj");
            return (Criteria) this;
        }

        public Criteria andThkssjNotLike(String value) {
            addCriterion("thkssj not like", value, "thkssj");
            return (Criteria) this;
        }

        public Criteria andThkssjIn(List<String> values) {
            addCriterion("thkssj in", values, "thkssj");
            return (Criteria) this;
        }

        public Criteria andThkssjNotIn(List<String> values) {
            addCriterion("thkssj not in", values, "thkssj");
            return (Criteria) this;
        }

        public Criteria andThkssjBetween(String value1, String value2) {
            addCriterion("thkssj between", value1, value2, "thkssj");
            return (Criteria) this;
        }

        public Criteria andThkssjNotBetween(String value1, String value2) {
            addCriterion("thkssj not between", value1, value2, "thkssj");
            return (Criteria) this;
        }

        public Criteria andThsjIsNull() {
            addCriterion("thsj is null");
            return (Criteria) this;
        }

        public Criteria andThsjIsNotNull() {
            addCriterion("thsj is not null");
            return (Criteria) this;
        }

        public Criteria andThsjEqualTo(Long value) {
            addCriterion("thsj =", value, "thsj");
            return (Criteria) this;
        }

        public Criteria andThsjNotEqualTo(Long value) {
            addCriterion("thsj <>", value, "thsj");
            return (Criteria) this;
        }

        public Criteria andThsjGreaterThan(Long value) {
            addCriterion("thsj >", value, "thsj");
            return (Criteria) this;
        }

        public Criteria andThsjGreaterThanOrEqualTo(Long value) {
            addCriterion("thsj >=", value, "thsj");
            return (Criteria) this;
        }

        public Criteria andThsjLessThan(Long value) {
            addCriterion("thsj <", value, "thsj");
            return (Criteria) this;
        }

        public Criteria andThsjLessThanOrEqualTo(Long value) {
            addCriterion("thsj <=", value, "thsj");
            return (Criteria) this;
        }

        public Criteria andThsjIn(List<Long> values) {
            addCriterion("thsj in", values, "thsj");
            return (Criteria) this;
        }

        public Criteria andThsjNotIn(List<Long> values) {
            addCriterion("thsj not in", values, "thsj");
            return (Criteria) this;
        }

        public Criteria andThsjBetween(Long value1, Long value2) {
            addCriterion("thsj between", value1, value2, "thsj");
            return (Criteria) this;
        }

        public Criteria andThsjNotBetween(Long value1, Long value2) {
            addCriterion("thsj not between", value1, value2, "thsj");
            return (Criteria) this;
        }

        public Criteria andHjlxIsNull() {
            addCriterion("hjlx is null");
            return (Criteria) this;
        }

        public Criteria andHjlxIsNotNull() {
            addCriterion("hjlx is not null");
            return (Criteria) this;
        }

        public Criteria andHjlxEqualTo(String value) {
            addCriterion("hjlx =", value, "hjlx");
            return (Criteria) this;
        }

        public Criteria andHjlxNotEqualTo(String value) {
            addCriterion("hjlx <>", value, "hjlx");
            return (Criteria) this;
        }

        public Criteria andHjlxGreaterThan(String value) {
            addCriterion("hjlx >", value, "hjlx");
            return (Criteria) this;
        }

        public Criteria andHjlxGreaterThanOrEqualTo(String value) {
            addCriterion("hjlx >=", value, "hjlx");
            return (Criteria) this;
        }

        public Criteria andHjlxLessThan(String value) {
            addCriterion("hjlx <", value, "hjlx");
            return (Criteria) this;
        }

        public Criteria andHjlxLessThanOrEqualTo(String value) {
            addCriterion("hjlx <=", value, "hjlx");
            return (Criteria) this;
        }

        public Criteria andHjlxLike(String value) {
            addCriterion("hjlx like", value, "hjlx");
            return (Criteria) this;
        }

        public Criteria andHjlxNotLike(String value) {
            addCriterion("hjlx not like", value, "hjlx");
            return (Criteria) this;
        }

        public Criteria andHjlxIn(List<String> values) {
            addCriterion("hjlx in", values, "hjlx");
            return (Criteria) this;
        }

        public Criteria andHjlxNotIn(List<String> values) {
            addCriterion("hjlx not in", values, "hjlx");
            return (Criteria) this;
        }

        public Criteria andHjlxBetween(String value1, String value2) {
            addCriterion("hjlx between", value1, value2, "hjlx");
            return (Criteria) this;
        }

        public Criteria andHjlxNotBetween(String value1, String value2) {
            addCriterion("hjlx not between", value1, value2, "hjlx");
            return (Criteria) this;
        }

        public Criteria andDjzLacIsNull() {
            addCriterion("djz__lac is null");
            return (Criteria) this;
        }

        public Criteria andDjzLacIsNotNull() {
            addCriterion("djz__lac is not null");
            return (Criteria) this;
        }

        public Criteria andDjzLacEqualTo(String value) {
            addCriterion("djz__lac =", value, "djzLac");
            return (Criteria) this;
        }

        public Criteria andDjzLacNotEqualTo(String value) {
            addCriterion("djz__lac <>", value, "djzLac");
            return (Criteria) this;
        }

        public Criteria andDjzLacGreaterThan(String value) {
            addCriterion("djz__lac >", value, "djzLac");
            return (Criteria) this;
        }

        public Criteria andDjzLacGreaterThanOrEqualTo(String value) {
            addCriterion("djz__lac >=", value, "djzLac");
            return (Criteria) this;
        }

        public Criteria andDjzLacLessThan(String value) {
            addCriterion("djz__lac <", value, "djzLac");
            return (Criteria) this;
        }

        public Criteria andDjzLacLessThanOrEqualTo(String value) {
            addCriterion("djz__lac <=", value, "djzLac");
            return (Criteria) this;
        }

        public Criteria andDjzLacLike(String value) {
            addCriterion("djz__lac like", value, "djzLac");
            return (Criteria) this;
        }

        public Criteria andDjzLacNotLike(String value) {
            addCriterion("djz__lac not like", value, "djzLac");
            return (Criteria) this;
        }

        public Criteria andDjzLacIn(List<String> values) {
            addCriterion("djz__lac in", values, "djzLac");
            return (Criteria) this;
        }

        public Criteria andDjzLacNotIn(List<String> values) {
            addCriterion("djz__lac not in", values, "djzLac");
            return (Criteria) this;
        }

        public Criteria andDjzLacBetween(String value1, String value2) {
            addCriterion("djz__lac between", value1, value2, "djzLac");
            return (Criteria) this;
        }

        public Criteria andDjzLacNotBetween(String value1, String value2) {
            addCriterion("djz__lac not between", value1, value2, "djzLac");
            return (Criteria) this;
        }

        public Criteria andXjzCiIsNull() {
            addCriterion("xjz__ci is null");
            return (Criteria) this;
        }

        public Criteria andXjzCiIsNotNull() {
            addCriterion("xjz__ci is not null");
            return (Criteria) this;
        }

        public Criteria andXjzCiEqualTo(String value) {
            addCriterion("xjz__ci =", value, "xjzCi");
            return (Criteria) this;
        }

        public Criteria andXjzCiNotEqualTo(String value) {
            addCriterion("xjz__ci <>", value, "xjzCi");
            return (Criteria) this;
        }

        public Criteria andXjzCiGreaterThan(String value) {
            addCriterion("xjz__ci >", value, "xjzCi");
            return (Criteria) this;
        }

        public Criteria andXjzCiGreaterThanOrEqualTo(String value) {
            addCriterion("xjz__ci >=", value, "xjzCi");
            return (Criteria) this;
        }

        public Criteria andXjzCiLessThan(String value) {
            addCriterion("xjz__ci <", value, "xjzCi");
            return (Criteria) this;
        }

        public Criteria andXjzCiLessThanOrEqualTo(String value) {
            addCriterion("xjz__ci <=", value, "xjzCi");
            return (Criteria) this;
        }

        public Criteria andXjzCiLike(String value) {
            addCriterion("xjz__ci like", value, "xjzCi");
            return (Criteria) this;
        }

        public Criteria andXjzCiNotLike(String value) {
            addCriterion("xjz__ci not like", value, "xjzCi");
            return (Criteria) this;
        }

        public Criteria andXjzCiIn(List<String> values) {
            addCriterion("xjz__ci in", values, "xjzCi");
            return (Criteria) this;
        }

        public Criteria andXjzCiNotIn(List<String> values) {
            addCriterion("xjz__ci not in", values, "xjzCi");
            return (Criteria) this;
        }

        public Criteria andXjzCiBetween(String value1, String value2) {
            addCriterion("xjz__ci between", value1, value2, "xjzCi");
            return (Criteria) this;
        }

        public Criteria andXjzCiNotBetween(String value1, String value2) {
            addCriterion("xjz__ci not between", value1, value2, "xjzCi");
            return (Criteria) this;
        }

        public Criteria andSjlyIsNull() {
            addCriterion("sjly is null");
            return (Criteria) this;
        }

        public Criteria andSjlyIsNotNull() {
            addCriterion("sjly is not null");
            return (Criteria) this;
        }

        public Criteria andSjlyEqualTo(String value) {
            addCriterion("sjly =", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotEqualTo(String value) {
            addCriterion("sjly <>", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyGreaterThan(String value) {
            addCriterion("sjly >", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyGreaterThanOrEqualTo(String value) {
            addCriterion("sjly >=", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyLessThan(String value) {
            addCriterion("sjly <", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyLessThanOrEqualTo(String value) {
            addCriterion("sjly <=", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyLike(String value) {
            addCriterion("sjly like", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotLike(String value) {
            addCriterion("sjly not like", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyIn(List<String> values) {
            addCriterion("sjly in", values, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotIn(List<String> values) {
            addCriterion("sjly not in", values, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyBetween(String value1, String value2) {
            addCriterion("sjly between", value1, value2, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotBetween(String value1, String value2) {
            addCriterion("sjly not between", value1, value2, "sjly");
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

        public Criteria andCjsjEqualTo(Date value) {
            addCriterion("cjsj =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(Date value) {
            addCriterion("cjsj <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(Date value) {
            addCriterion("cjsj >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("cjsj >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(Date value) {
            addCriterion("cjsj <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(Date value) {
            addCriterion("cjsj <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<Date> values) {
            addCriterion("cjsj in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<Date> values) {
            addCriterion("cjsj not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(Date value1, Date value2) {
            addCriterion("cjsj between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(Date value1, Date value2) {
            addCriterion("cjsj not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNull() {
            addCriterion("gxsj is null");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNotNull() {
            addCriterion("gxsj is not null");
            return (Criteria) this;
        }

        public Criteria andGxsjEqualTo(Date value) {
            addCriterion("gxsj =", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotEqualTo(Date value) {
            addCriterion("gxsj <>", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThan(Date value) {
            addCriterion("gxsj >", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThanOrEqualTo(Date value) {
            addCriterion("gxsj >=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThan(Date value) {
            addCriterion("gxsj <", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThanOrEqualTo(Date value) {
            addCriterion("gxsj <=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjIn(List<Date> values) {
            addCriterion("gxsj in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotIn(List<Date> values) {
            addCriterion("gxsj not in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjBetween(Date value1, Date value2) {
            addCriterion("gxsj between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotBetween(Date value1, Date value2) {
            addCriterion("gxsj not between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andTbsjIsNull() {
            addCriterion("tbsj is null");
            return (Criteria) this;
        }

        public Criteria andTbsjIsNotNull() {
            addCriterion("tbsj is not null");
            return (Criteria) this;
        }

        public Criteria andTbsjEqualTo(Date value) {
            addCriterion("tbsj =", value, "tbsj");
            return (Criteria) this;
        }

        public Criteria andTbsjNotEqualTo(Date value) {
            addCriterion("tbsj <>", value, "tbsj");
            return (Criteria) this;
        }

        public Criteria andTbsjGreaterThan(Date value) {
            addCriterion("tbsj >", value, "tbsj");
            return (Criteria) this;
        }

        public Criteria andTbsjGreaterThanOrEqualTo(Date value) {
            addCriterion("tbsj >=", value, "tbsj");
            return (Criteria) this;
        }

        public Criteria andTbsjLessThan(Date value) {
            addCriterion("tbsj <", value, "tbsj");
            return (Criteria) this;
        }

        public Criteria andTbsjLessThanOrEqualTo(Date value) {
            addCriterion("tbsj <=", value, "tbsj");
            return (Criteria) this;
        }

        public Criteria andTbsjIn(List<Date> values) {
            addCriterion("tbsj in", values, "tbsj");
            return (Criteria) this;
        }

        public Criteria andTbsjNotIn(List<Date> values) {
            addCriterion("tbsj not in", values, "tbsj");
            return (Criteria) this;
        }

        public Criteria andTbsjBetween(Date value1, Date value2) {
            addCriterion("tbsj between", value1, value2, "tbsj");
            return (Criteria) this;
        }

        public Criteria andTbsjNotBetween(Date value1, Date value2) {
            addCriterion("tbsj not between", value1, value2, "tbsj");
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