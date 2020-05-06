package com.ycl.room.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.ycl.room.domain.Room;
import com.ycl.room.service.RoomService;
import com.ycl.room.vo.RoomVo;

@Controller
public class RoomController {
	
	
	@Resource
	private RoomService roomService;
	
	
	@RequestMapping("list")
	public String list(Model model,RoomVo roomVo,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "8")Integer pageSize) {
		//查询数据
		PageInfo<Room> list = roomService.list(roomVo, pageNum, pageSize);
		//放进model
		model.addAttribute("info", list);
		model.addAttribute("name", roomVo.getName());
		model.addAttribute("phone", roomVo.getPhone());
		model.addAttribute("staprice", roomVo.getStaprice());
		model.addAttribute("endprice", roomVo.getEndprice());
		model.addAttribute("staDate", roomVo.getStaDate());
		model.addAttribute("endDate", roomVo.getEndDate());
		System.out.println(roomVo.getStaDate()+"12^^"+roomVo.getEndDate());
		//跳转页面
		return "list";
		
		
	}
}
