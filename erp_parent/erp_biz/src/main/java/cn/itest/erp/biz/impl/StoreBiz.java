package cn.itest.erp.biz.impl;

import cn.itest.erp.biz.IStoreBiz;
import cn.itest.erp.dao.IStoreDao;
import cn.itest.erp.entity.Store;
/**
 * 仓库业务逻辑类
 * @author Administrator
 *
 */
public class StoreBiz extends BaseBiz<Store> implements IStoreBiz {

	private IStoreDao storeDao;
	
	public void setStoreDao(IStoreDao storeDao) {
		this.storeDao = storeDao;
		super.setBaseDao(this.storeDao);
	}
	
}
