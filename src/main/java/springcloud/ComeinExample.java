package springcloud;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComeinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComeinExample() {
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

        public Criteria andCiidIsNull() {
            addCriterion("ciid is null");
            return (Criteria) this;
        }

        public Criteria andCiidIsNotNull() {
            addCriterion("ciid is not null");
            return (Criteria) this;
        }

        public Criteria andCiidEqualTo(Long value) {
            addCriterion("ciid =", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidNotEqualTo(Long value) {
            addCriterion("ciid <>", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidGreaterThan(Long value) {
            addCriterion("ciid >", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidGreaterThanOrEqualTo(Long value) {
            addCriterion("ciid >=", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidLessThan(Long value) {
            addCriterion("ciid <", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidLessThanOrEqualTo(Long value) {
            addCriterion("ciid <=", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidIn(List<Long> values) {
            addCriterion("ciid in", values, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidNotIn(List<Long> values) {
            addCriterion("ciid not in", values, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidBetween(Long value1, Long value2) {
            addCriterion("ciid between", value1, value2, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidNotBetween(Long value1, Long value2) {
            addCriterion("ciid not between", value1, value2, "ciid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCkidIsNull() {
            addCriterion("ckid is null");
            return (Criteria) this;
        }

        public Criteria andCkidIsNotNull() {
            addCriterion("ckid is not null");
            return (Criteria) this;
        }

        public Criteria andCkidEqualTo(Long value) {
            addCriterion("ckid =", value, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidNotEqualTo(Long value) {
            addCriterion("ckid <>", value, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidGreaterThan(Long value) {
            addCriterion("ckid >", value, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidGreaterThanOrEqualTo(Long value) {
            addCriterion("ckid >=", value, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidLessThan(Long value) {
            addCriterion("ckid <", value, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidLessThanOrEqualTo(Long value) {
            addCriterion("ckid <=", value, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidIn(List<Long> values) {
            addCriterion("ckid in", values, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidNotIn(List<Long> values) {
            addCriterion("ckid not in", values, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidBetween(Long value1, Long value2) {
            addCriterion("ckid between", value1, value2, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidNotBetween(Long value1, Long value2) {
            addCriterion("ckid not between", value1, value2, "ckid");
            return (Criteria) this;
        }

        public Criteria andCidateIsNull() {
            addCriterion("cidate is null");
            return (Criteria) this;
        }

        public Criteria andCidateIsNotNull() {
            addCriterion("cidate is not null");
            return (Criteria) this;
        }

        public Criteria andCidateEqualTo(Date value) {
            addCriterion("cidate =", value, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateNotEqualTo(Date value) {
            addCriterion("cidate <>", value, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateGreaterThan(Date value) {
            addCriterion("cidate >", value, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateGreaterThanOrEqualTo(Date value) {
            addCriterion("cidate >=", value, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateLessThan(Date value) {
            addCriterion("cidate <", value, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateLessThanOrEqualTo(Date value) {
            addCriterion("cidate <=", value, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateIn(List<Date> values) {
            addCriterion("cidate in", values, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateNotIn(List<Date> values) {
            addCriterion("cidate not in", values, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateBetween(Date value1, Date value2) {
            addCriterion("cidate between", value1, value2, "cidate");
            return (Criteria) this;
        }

        public Criteria andCidateNotBetween(Date value1, Date value2) {
            addCriterion("cidate not between", value1, value2, "cidate");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
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