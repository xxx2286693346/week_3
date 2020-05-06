package com.ycl.room.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.ycl.room.domain.Room;
import com.ycl.room.vo.RoomVo;

import sun.awt.image.IntegerInterleavedRaster;

public interface RoomService {
	
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
	PageInfo<Room> list (RoomVo roomVo,Integer pageNum,Integer pageSize);
}
