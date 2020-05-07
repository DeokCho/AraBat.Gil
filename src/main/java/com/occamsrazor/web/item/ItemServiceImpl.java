package com.occamsrazor.web.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired ItemDao itemDao;

	@Override
	public List<Item> findAll() {
		System.out.println("2");
		return itemDao.selectAll();
	}
}
