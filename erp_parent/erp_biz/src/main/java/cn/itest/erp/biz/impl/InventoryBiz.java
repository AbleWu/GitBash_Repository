package cn.itest.erp.biz.impl;

import cn.itest.erp.biz.IInventoryBiz;
import cn.itest.erp.dao.IInventoryDao;
import cn.itest.erp.entity.Inventory;
/**
 * 盘盈盘亏业务逻辑类
 * @author Administrator
 *
 */
public class InventoryBiz extends BaseBiz<Inventory> implements IInventoryBiz {

	private IInventoryDao inventoryDao;
	
	public void setInventoryDao(IInventoryDao inventoryDao) {
		this.inventoryDao = inventoryDao;
		super.setBaseDao(this.inventoryDao);
	}
	
}
