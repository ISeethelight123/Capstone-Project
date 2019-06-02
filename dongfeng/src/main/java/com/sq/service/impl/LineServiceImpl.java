package com.sq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sq.mapper.LineMapper;
import com.sq.pojo.Line;
import com.sq.service.LineService;
@Service
public class LineServiceImpl implements LineService {

	@Autowired
	LineMapper lineMapper;
	
	public void addLine(Line line) {
		lineMapper.addLine(line);
	}
	
	public void deleteLineById(Integer LineId) {
		lineMapper.deleteLineById(LineId);
	}
	
	public void deleteLineMassById(int[] arrId) {
		lineMapper.deleteLineMassById(arrId);
	}
	
	public void updateLine(Line line) {
		lineMapper.updateLine(line);
	}
	
	public List<Line> selectLineAll() {
		return lineMapper.selectLineAll();
	}

	public Line selectLineOneById(Integer LineId) {
		return lineMapper.selectLineOneById(LineId);
	}

	public List<Line> selectLineChoose(Line line) {
		return lineMapper.selectLineChoose(line);
	}

}
