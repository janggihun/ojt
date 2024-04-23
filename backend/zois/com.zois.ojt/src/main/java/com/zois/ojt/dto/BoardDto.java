package com.zois.ojt.dto;

import java.text.DateFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {

	private String b_title;
	private String b_contents;
	private String userId;
	private String a_title;
	private String a_contents;
	private DateFormat b_date;
}
