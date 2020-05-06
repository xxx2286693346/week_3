package com.ycl.room.service.impl;

import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ycl.room.domain.Room;
import com.ycl.room.service.RoomService;
import com.ycl.util.DateUtil;
import com.ycl.util.RandomUtil;
import com.ycl.util.StringUtil;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class RoomServiceImplTest {
	
	@Resource
	private RoomService roomService;

	@Test
	public void test() {
		
		for (int i = 0; i < 100; i++) {
			Room room = new Room();
			Calendar c = Calendar.getInstance();
			c.set(2020, 4, 1);
			Date randomdate = DateUtil.random(c.getTime(), new Date());
			//模拟从2020年5月1日至今任意随机日期
			room.setCreated(randomdate);
			//创建姓名
			room.setName(StringUtil.generateChineseName());
			//创建手机号
			room.setPhone(RandomUtil.randomNumber(11));
			//房型id
			room.setTypeId(RandomUtil.random(1, 4));
			//备注
			room.setRemark(StringUtil.randomChineseString(9));
			
			roomService.insert(room);
		}
		
	}

}
