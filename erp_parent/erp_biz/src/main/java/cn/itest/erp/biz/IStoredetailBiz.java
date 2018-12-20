package cn.itest.erp.biz;

import java.util.List;

import cn.itest.erp.entity.Storealert;
import cn.itest.erp.entity.Storedetail;
/**
 * 仓库库存业务逻辑层接口
 * @author Administrator
 *
 */
public interface IStoredetailBiz extends IBaseBiz<Storedetail>{

	/**
	 * 获取库存预警列表
	 * @return
	 */
	List<Storealert> getStorealertList();
	
	/**
	 * 发送库存预警邮件
	 */
	void sendStorealertMail();
}

