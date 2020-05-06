package com.ycl.room.dao;

import java.util.List;

import com.ycl.room.domain.Room;
import com.ycl.room.vo.RoomVo;

public interface RoomMapper {
	
	/**
	 * 
	    * @Title: insert
	    * @Description: TODO(房间预订单条新增)
	    * @param @param room
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	int insert(Room room);
	
	/**
	 * 
	    * @Title: list
	    * @Description: TODO(房间预订查询)
	    * @param @param roomVo
	    * @param @return    参数
	    * @return List<Room>    返回类型
	    * @throws
	 */
	List<Room> list (RoomVo roomVo);
	
	/**
	 * 
	    * @Title: insertlist
	    * @Description: TODO(批量新增)
	    * @param @param room
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	int insertlist(Room room);
}
