package com.fruitslaesplatform.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fruitslaesplatform.dao.AccessoryDao;
import com.fruitslaesplatform.entity.Accessory;

@Repository //为了包扫描的时候这个Dao被扫描到  
public class AccessoryDaoImpl extends BaseDaoImpl<Accessory> implements AccessoryDao{  
    public AccessoryDaoImpl(){  
        //设置命名空间  
        super.setNs("com.fruitslaesplatform.mapper.AccessoryMapper");  
    }
    //实现接口自己的方法定义
	public int count(Map map) {
		return this.getSqlSession().selectOne(this.getNs() + ".count", map);
	}
	public int deleteByFruitId(String fruitId) {
		return this.getSqlSession().delete(this.getNs() + ".deleteByFruitId", fruitId);
	}
}
