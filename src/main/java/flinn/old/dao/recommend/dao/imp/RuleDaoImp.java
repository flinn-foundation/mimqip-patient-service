//package flinn.old.dao.recommend.dao.imp;
//
//import flinn.old.dao.beans.request.RequestContainerBean;
//import flinn.old.dao.beans.response.ResponseActionBean;
//import flinn.old.dao.beans.response.ResponseContainerBean;
//import flinn.old.dao.beans.response.ResponseSessionContainerBean;
//import flinn.old.dao.recommend.beans.RecommendRuleBean;
//import flinn.old.dao.recommend.beans.request.RequestRuleBean;
//import flinn.old.dao.recommend.beans.response.ResponseRuleBean;
//import flinn.old.dao.recommend.beans.response.ResponseRuleContainerBean;
//import flinn.old.dao.recommend.dao.DaoRecommendManager;
//import flinn.old.dao.recommend.dao.RuleDao;
//import flinn.old.dao.util.RecommendUtils;
//import flinn.old.dao.util.cache.EHCacheImpl;
//import flinn.old.dao.util.cache.ICache;
//import org.apache.log4j.Logger;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.List;
//
//public class RuleDaoImp extends RuleDao {
//
//	protected static final Logger LOG = Logger.getLogger(RuleDaoImp.class);
//	public String nullDate = "0000-00-00 00:00:00";
//	protected HashMap<String, RecommendRuleBean> rules = null;
//
//	static {
//		LOG.debug("Log appender instantiated for " + RuleDaoImp.class);
//	}
//
//	public ResponseContainerBean handleRuleCreate(RequestContainerBean input,
//			ResponseSessionContainerBean session, Connection connection) {
//		// sanity checks on incoming data. Ensure no changes to aspects of the
//		// data we don't want changed.
//		RequestRuleBean bean = input.getRule();
//		if (bean == null)
//			return DaoRecommendManager.generateErrorBean(input.getAction(),
//					"RuleEntity create submitted with no appropriate info", 41);
//
//		int newid = 0;
//		List<ResponseRuleBean> rules = null;
//
//		try {
//			// Create new rule record
//			newid = create(bean, connection);
//
//		} catch (Exception e) {
//			LOG.warn(e);
//			e.printStackTrace();
//			try {
//				connection.rollback();
//			} catch (SQLException e1) {
//				LOG.warn("Error rolling back connection in handleRuleCreate: "
//						+ e);
//			}
//			return DaoRecommendManager
//					.generateErrorBean(
//							input.getAction(),
//							"RuleEntity create failed (unknown error): "
//									+ e.getMessage(), 48);
//		}
//
//		try {
//			connection.commit();
//		} catch (Exception e) {
//			try {
//				connection.rollback();
//			} catch (SQLException e1) {
//				LOG.warn("Error rolling back connection in handleRuleCreate: "
//						+ e);
//			}
//			LOG.warn("RuleEntity retrieval post-update failed (unknown error): " + e);
//			return DaoRecommendManager.generateErrorBean(
//					input.getAction(),
//					"RuleEntity retrieval post-create failed (unknown error): "
//							+ e.getMessage(), 49);
//		}
//		if (newid < 1)
//			return DaoRecommendManager.generateErrorBean(input.getAction(),
//					"RuleEntity create failed (unknown error - no returned ID)", 47);
//		bean = new RequestRuleBean();
//		bean.setRuleId(newid);
//		try {
//			rules = find(bean, null, connection);
//		} catch (Exception e) {
//			return DaoRecommendManager.generateErrorBean(
//					input.getAction(),
//					"RuleEntity retrieval post-create failed (unknown error): "
//							+ e.getMessage(), 47);
//		}
//
//		if (rules == null || rules.size() == 0) {
//			return DaoRecommendManager
//					.generateErrorBean(
//							input.getAction(),
//							"RuleEntity retrieval post-create failed (unknown error) No Exception",
//							49);
//		}
//
//		ResponseRuleContainerBean rcb = new ResponseRuleContainerBean();
//		rcb.setRule(rules.get(0));
//		rcb.setAction(new ResponseActionBean(input.getAction()));
//		return rcb;
//	}
//
//	public ResponseContainerBean handleRuleRead(RequestContainerBean input,
//			ResponseSessionContainerBean session, Connection connection) {
//		RequestRuleBean bean = input.getRule();
//		List<ResponseRuleBean> rules = null;
//
//		try {
//			rules = find(bean, null, connection);
//		} catch (Exception e) {
//			return DaoRecommendManager.generateErrorBean(input.getAction(),
//					"RuleEntity retrieval failed (unknown error): " + e.getMessage(),
//					47);
//		}
//
//		if (rules == null || rules.size() == 0) {
//			return DaoRecommendManager.generateErrorBean(input.getAction(),
//					"RuleEntity retrieval failed (unknown error) No Exception", 49);
//		}
//
//		ResponseRuleContainerBean rcb = new ResponseRuleContainerBean();
//		rcb.setAction(new ResponseActionBean(input.getAction()));
//		rcb.setRule(rules.get(0));
//		return rcb;
//	}
//
//	public ResponseContainerBean handleRuleUpdate(RequestContainerBean input,
//			ResponseSessionContainerBean session, Connection connection) {
//		RequestRuleBean bean = input.getRule();
//		if (bean == null)
//			return DaoRecommendManager.generateErrorBean(input.getAction(),
//					"RuleEntity update submitted with no appropriate profile", 41);
//		List<ResponseRuleBean> rules = null;
//		RequestRuleBean b2 = new RequestRuleBean();
//		b2.setRuleId(bean.getRuleId());
//
//		try {
//			rules = find(b2, null, connection);
//		} catch (Exception e) {
//			return DaoRecommendManager.generateErrorBean(
//					input.getAction(),
//					"RuleEntity retrieval failed in update (unknown error): "
//							+ e.getMessage(), 47);
//		}
//
//		if (rules == null || rules.size() == 0) {
//			return DaoRecommendManager
//					.generateErrorBean(
//							input.getAction(),
//							"RuleEntity retrieval failed in update (unknown error) No Exception",
//							49);
//		}
//		try {
//			// Update current rule record
//			update(bean, rules.get(0), connection);
//		} catch (Exception e) {
//			LOG.warn(e);
//			e.printStackTrace();
//			try {
//				connection.rollback();
//			} catch (SQLException e1) {
//				LOG.warn("Error rolling back connection in handleRuleUpdate: "
//						+ e);
//			}
//			return DaoRecommendManager
//					.generateErrorBean(
//							input.getAction(),
//							"RuleEntity update failed (unknown error): "
//									+ e.getMessage(), 48);
//		}
//
//		try {
//			connection.commit();
//		} catch (Exception e) {
//			try {
//				connection.rollback();
//			} catch (SQLException e1) {
//				LOG.warn("Error rolling back connection in handleRuleUpdate: "
//						+ e);
//			}
//			LOG.warn("RuleEntity retrieval post-update failed (unknown error): " + e);
//			return DaoRecommendManager.generateErrorBean(
//					input.getAction(),
//					"RuleEntity retrieval post-update failed (unknown error): "
//							+ e.getMessage(), 49);
//		}
//		b2 = new RequestRuleBean();
//		b2.setRuleId(bean.getRuleId());
//		try {
//			rules = find(b2, null, connection);
//		} catch (Exception e) {
//			return DaoRecommendManager.generateErrorBean(
//					input.getAction(),
//					"RuleEntity retrieval post-update failed (unknown error): "
//							+ e.getMessage(), 47);
//		}
//
//		if (rules == null || rules.size() == 0) {
//			return DaoRecommendManager
//					.generateErrorBean(
//							input.getAction(),
//							"RuleEntity retrieval post-update failed (unknown error) No Exception",
//							49);
//		}
//
//		ResponseRuleContainerBean rcb = new ResponseRuleContainerBean();
//		rcb.setRule(rules.get(0));
//		rcb.setAction(new ResponseActionBean(input.getAction()));
//		return rcb;
//	}
//
//	public List<ResponseRuleBean> findAllRules(final RequestRuleBean bean,
//			final String orderBy, Connection connection) throws Exception {
//		List<ResponseRuleBean> responseRuleBean;
//
//		ICache<String, List<ResponseRuleBean>> rulesCache = EHCacheImpl.getDefaultInstance("rulesCache");
//
//		String cacheKey = RecommendUtils.formatCacheKey(orderBy);
//
//		// try to retrieve the object from the cache
//		responseRuleBean = (List<ResponseRuleBean>) rulesCache.get(String.valueOf(cacheKey));
//		if (responseRuleBean != null) {
//			LOG.debug("findAllRules --> RULES: orderBy" + String.valueOf(cacheKey)
//					+ " found in cache");
//		}
//
//		// if the returned object is null, it was not found in the cache
//		if (responseRuleBean == null) {
//			if (connection == null || connection.isClosed()) {
//				LOG.debug("bad DB Connection");
//				throw new Exception("bad DB Connection");
//			}
//
//			String query = "Select * from RecommendRule ";
//			if (orderBy != null) {
//				query += " ORDER BY " + orderBy;
//			} else {
//				query += " ORDER BY RuleType, Priority ASC";
//			}
//
//			LOG.warn("Going to run query = " + query);
//
//			PreparedStatement preparedStatementQuery = null;
//			ResultSet resultSet = null;
//			try {
//				preparedStatementQuery = connection.prepareStatement(query);
//				resultSet = preparedStatementQuery.executeQuery();
//
//				// get the first item from the response and add to cache
//				responseRuleBean = getListFromRs(resultSet, connection);
//				rulesCache.put(String.valueOf(orderBy), responseRuleBean);
//				LOG.debug(responseRuleBean.get(0).getRulename());
//			} catch (SQLException e) {
//				LOG.error("SQLException: ", e);
//				throw e;
//			} finally {
//				resultSet.close();
//				preparedStatementQuery.close();
//			}
//		}
//		return responseRuleBean;
//	}
//
//}
