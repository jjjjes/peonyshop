package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import beans.NoticeBean;
import beans.OrderBean;

public interface BasketMapper {

	
	  @Insert("insert into basket_table(basket_idx, user_idx, user_name, goods_idx, goods_name, goods_sell_price, basket_goods_cnt, order_amt) " +
	  		  "values(basket_seq.nextval, #{user_idx}, #{user_name}, #{goods_idx}, #{goods_name}, #{goods_sell_price}, #{order_cnt}, #{order_amt})")
	  void addBasketInfo(OrderBean orderInfoBean);
	  
	  @Select("select b.user_idx, g.goods_thumbnail, g.goods_category, b.goods_idx, b.goods_name, sum(b.basket_goods_cnt) as order_cnt, b.goods_sell_price, sum(b.order_amt) as order_amt "
	  		+ "from basket_table b , goods_table g "
	  		+ " where b.user_idx = #{user_idx} and g.goods_idx = b.goods_idx "
	  		+ "group by b.user_idx, g.goods_category, g.goods_thumbnail, b.goods_idx, b.goods_name, b.goods_sell_price "
	  		+ "order by b.goods_idx")
	  List<OrderBean> getBasketInfo(OrderBean basketInfoBean);
	 
		@Select("select g.goods_thumbnail, g.goods_sell_price, o.order_cnt, o.order_amt, g.goods_content "
				+ "from goods_table g, order_table o"
				+ "where goods_idx=#{goods_idx}")
		OrderBean getModifyBaksetInfo(OrderBean orderInfoBean);
	  
	  @Update("UPDATE basket_table " +
			  "set order_cnt = #{order_cnt}")
	  void modifyBasketInfo(OrderBean modifyBasketBean);
	  
	  
}
