package cn.itest.erp.action;

import cn.itest.erp.biz.IGoodsBiz;
import cn.itest.erp.entity.Goods;

/**
 * 商品Action 
 * @author Administrator
 *
 */
public class GoodsAction extends BaseAction<Goods> {

	private IGoodsBiz goodsBiz;

	public void setGoodsBiz(IGoodsBiz goodsBiz) {
		this.goodsBiz = goodsBiz;
		super.setBaseBiz(this.goodsBiz);
	}

}
