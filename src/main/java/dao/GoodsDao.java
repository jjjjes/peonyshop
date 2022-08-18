package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import beans.GoodsBean;
import mapper.GoodsMapper;

@Repository
public class GoodsDao {

	@Autowired
	private GoodsMapper goodsMapper;
	
	public void addGoodsInfo(GoodsBean goodsRegBean) {
		goodsMapper.addGoodsInfo(goodsRegBean);
	}
	
	public List<GoodsBean> getGoodsList(String topmenu_name) {
		return goodsMapper.getGoodsList(topmenu_name);
	}
	
	public GoodsBean getGoodsDetail(String goods_idx) {
		return goodsMapper.getGoodsDetail(goods_idx);
	}
}
