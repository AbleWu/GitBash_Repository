package cn.itest.erp.biz.impl;

import cn.itest.erp.biz.IDepBiz;
import cn.itest.erp.dao.IDepDao;
import cn.itest.erp.entity.Dep;
/**
 * 部门业务逻辑类
 * @author Administrator
 *
 */
public class DepBiz extends BaseBiz<Dep> implements IDepBiz {

	private IDepDao depDao;
	
	public void setDepDao(IDepDao depDao) {
		this.depDao = depDao;
		super.setBaseDao(this.depDao);
	}
	
}
