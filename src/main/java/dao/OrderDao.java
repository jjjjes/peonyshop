package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import beans.OrderBean;
import mapper.OrderMapper;

@Repository
public class OrderDao {

	
	@Autowired
	private OrderMapper orderMapper;
	
	public void addOrderInfo(OrderBean orderInfoBean) {
		 orderMapper.addOrderInfo(orderInfoBean);
	}
	
}
