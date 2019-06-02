package com.sq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sq.pojo.CarLoad;

public interface CarLoadService {
	
	List<CarLoad> selecLoadtAll();
	
	
	
}
