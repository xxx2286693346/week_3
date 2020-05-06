package com.ycl.room.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ycl.room.dao.RoomMapper;
import com.ycl.room.domain.Room;
import com.ycl.room.service.RoomService;
import com.ycl.room.vo.RoomVo;

@Service
public class RoomServiceImpl implements RoomService{
	
	@Resource
	private RoomMapper roomMapper;

	@Override
	public int insert(Room room) {
		return roomMapper.insert(room);
	}

	@Override
	public PageInfo<Room> list(RoomVo roomVo, Integer pageNum, Integer pageSize) {
		//分页
		PageHelper.startPage(pageNum, pageSize);
		List<Room> list = roomMapper.list(roomVo);
		return new PageInfo<Room>(list);
	}

	

}
