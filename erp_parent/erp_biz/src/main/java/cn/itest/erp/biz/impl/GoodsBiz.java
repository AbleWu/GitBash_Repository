package cn.itest.erp.biz.impl;

import cn.itest.erp.biz.IGoodsBiz;
import cn.itest.erp.dao.IGoodsDao;
import cn.itest.erp.entity.Goods;
/**
 * 商品业务逻辑类
 * @author Administrator
 *
 */
public class GoodsBiz extends BaseBiz<Goods> implements IGoodsBiz {

	private IGoodsDao goodsDao;
	
	public void setGoodsDao(IGoodsDao goodsDao) {
		this.goodsDao = goodsDao;
		super.setBaseDao(this.goodsDao);
	}
	
}
