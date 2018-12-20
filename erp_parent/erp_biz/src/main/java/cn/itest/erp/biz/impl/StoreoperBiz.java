package cn.itest.erp.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.itest.erp.biz.IStoreoperBiz;
import cn.itest.erp.dao.IEmpDao;
import cn.itest.erp.dao.IGoodsDao;
import cn.itest.erp.dao.IStoreDao;
import cn.itest.erp.dao.IStoreoperDao;
import cn.itest.erp.entity.Storeoper;
/**
 * 仓库操作记录业务逻辑类
 * @author Administrator
 *
 */
public class StoreoperBiz extends BaseBiz<Storeoper> implements IStoreoperBiz {

	private IStoreoperDao storeoperDao;
	private IEmpDao empDao;
	private IGoodsDao goodsDao;
	private IStoreDao storeDao;
	
	public void setStoreoperDao(IStoreoperDao storeoperDao) {
		this.storeoperDao = storeoperDao;
		super.setBaseDao(this.storeoperDao);
	}
	
	public List<Storeoper> getListByPage(Storeoper t1,Storeoper t2,Object param,int firstResult, int maxResults){
		List<Storeoper> logList = super.getListByPage(t1,t2,param,firstResult, maxResults);
		Map<Long, String> empNameMap = new HashMap<Long, String>();
		Map<Long, String> goodsNameMap = new HashMap<Long, String>();
		Map<Long, String> storeNameMap = new HashMap<Long, String>();
		for(Storeoper log : logList){
			log.setEmpName(getEmpName(log.getEmpuuid(),empNameMap, empDao));
			log.setGoodsName(getGoodsName(log.getGoodsuuid(),goodsNameMap,goodsDao));
			log.setStoreName(getStoreName(log.getStoreuuid(),storeNameMap,storeDao));
		}
		return logList;
	}

	public void setEmpDao(IEmpDao empDao) {
		this.empDao = empDao;
	}

	public void setGoodsDao(IGoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}

	public void setStoreDao(IStoreDao storeDao) {
		this.storeDao = storeDao;
	}
	
}
