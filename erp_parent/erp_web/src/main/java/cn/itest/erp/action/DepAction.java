package cn.itest.erp.action;

import cn.itest.erp.biz.IDepBiz;
import cn.itest.erp.entity.Dep;

/**
 * 部门Action 
 * @author Administrator
 *
 */
public class DepAction extends BaseAction<Dep> {

	private IDepBiz depBiz;

	public void setDepBiz(IDepBiz depBiz) {
		this.depBiz = depBiz;
		super.setBaseBiz(this.depBiz);
	}

}
