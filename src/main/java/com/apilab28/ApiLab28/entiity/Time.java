package com.apilab28.ApiLab28.entiity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Time {

	private String layoutKey;
	private ArrayList<String> startPeriodName;
	private ArrayList<String> startValidTime;
	private ArrayList<String> tempLabel;
	
	
	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Time(String layoutKey, ArrayList<String> startPeriodName, ArrayList<String> startValidTime,
			ArrayList<String> tempLabel) {
		super();
		this.layoutKey = layoutKey;
		this.startPeriodName = startPeriodName;
		this.startValidTime = startValidTime;
		this.tempLabel = tempLabel;
	}
	
	public String getLayoutKey() {
		return layoutKey;
	}
	public void setLayoutKey(String layoutKey) {
		this.layoutKey = layoutKey;
	}
	public ArrayList<String> getStartPeriodName() {
		return startPeriodName;
	}
	public void setStartPeriodName(ArrayList<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}
	public ArrayList<String> getStartValidTime() {
		return startValidTime;
	}
	public void setStartValidTime(ArrayList<String> startValidTime) {
		this.startValidTime = startValidTime;
	}
	public ArrayList<String> getTempLabel() {
		return tempLabel;
	}
	public void setTempLabel(ArrayList<String> tempLabel) {
		this.tempLabel = tempLabel;
	}
	
	
	@Override
	public String toString() {
		return "Time [layoutKey=" + layoutKey + ", startPeriodName=" + startPeriodName + ", startValidTime="
				+ startValidTime + ", tempLabel=" + tempLabel + "]";
	}
	
	
	
}
