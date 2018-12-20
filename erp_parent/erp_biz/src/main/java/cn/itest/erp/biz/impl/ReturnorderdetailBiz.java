package cn.itest.erp.biz.impl;

import cn.itest.erp.biz.IReturnorderdetailBiz;
import cn.itest.erp.dao.IReturnorderdetailDao;
import cn.itest.erp.entity.Returnorderdetail;
/**
 * 退货订单明细业务逻辑类
 * @author Administrator
 *
 */
public class ReturnorderdetailBiz extends BaseBiz<Returnorderdetail> implements IReturnorderdetailBiz {

	private IReturnorderdetailDao returnorderdetailDao;
	
	public void setReturnorderdetailDao(IReturnorderdetailDao returnorderdetailDao) {
		this.returnorderdetailDao = returnorderdetailDao;
		super.setBaseDao(this.returnorderdetailDao);
	}
	
}
