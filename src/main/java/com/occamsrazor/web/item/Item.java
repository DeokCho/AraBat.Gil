package com.occamsrazor.web.item;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Item {
private String itemid, itemName, takenDate, category, takenPosition;

}
