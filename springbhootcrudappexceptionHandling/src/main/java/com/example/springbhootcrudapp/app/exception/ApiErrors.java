package com.example.springbhootcrudapp.app.exception;



import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiErrors 
{
	private int statuscode;
	private String massage;
	private Date date;
	private String path;
	private HttpStatus httmassage;

}
