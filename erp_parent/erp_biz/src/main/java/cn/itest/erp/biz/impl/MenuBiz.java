package cn.itest.erp.biz.impl;

import cn.itest.erp.biz.IMenuBiz;
import cn.itest.erp.dao.IMenuDao;
import cn.itest.erp.entity.Menu;
/**
 * 菜单业务逻辑类
 * @author Administrator
 *
 */
public class MenuBiz extends BaseBiz<Menu> implements IMenuBiz {

	private IMenuDao menuDao;
	
	public void setMenuDao(IMenuDao menuDao) {
		this.menuDao = menuDao;
		super.setBaseDao(this.menuDao);
	}
	
}
