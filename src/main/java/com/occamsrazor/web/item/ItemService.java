package com.occamsrazor.web.item;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface ItemService {

	public List<Item> findAll();

}
