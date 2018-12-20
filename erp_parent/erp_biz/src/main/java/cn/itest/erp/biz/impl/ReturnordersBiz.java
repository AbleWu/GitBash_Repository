package cn.itest.erp.biz.impl;

import cn.itest.erp.biz.IReturnordersBiz;
import cn.itest.erp.dao.IReturnordersDao;
import cn.itest.erp.entity.Returnorders;
/**
 * 退货订单业务逻辑类
 * @author Administrator
 *
 */
public class ReturnordersBiz extends BaseBiz<Returnorders> implements IReturnordersBiz {

	private IReturnordersDao returnordersDao;
	
	public void setReturnordersDao(IReturnordersDao returnordersDao) {
		this.returnordersDao = returnordersDao;
		super.setBaseDao(this.returnordersDao);
	}
	
}
