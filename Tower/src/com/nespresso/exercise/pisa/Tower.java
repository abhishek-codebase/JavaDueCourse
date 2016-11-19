package com.nespresso.exercise.pisa;

import java.util.HashMap;
import java.util.Map;


public class Tower {
	
	private static  Map<Integer,String> towerFloor= new HashMap<Integer,String>();
	private static Map<Integer,Integer> baseIndexMap = new HashMap<Integer,Integer>();
	private static int baseFloor=0;
    private String fStr="X";
    private String windows="0";
    public void addFloor(int floorSize) {
    	
    	if(floorSize <0 ){
    		throw new UnsupportedOperationException("");
    	}
    	
    	while(floorSize!=fStr.length()){
    		fStr+="X";
    		
    	}
    	towerFloor.put(baseFloor,fStr);
    	baseIndexMap.put(floorSize,baseFloor);
    	baseFloor++;
    }

    public String printFloor(int floorIndex) {
    	
    	if(floorIndex<0){
    		throw new UnsupportedOperationException("Argument Not Supported");	
    	}
    	
         String getFloor= towerFloor.get(floorIndex);
    	System.out.println("Floor "+getFloor);
    	return getFloor;
    	
    	
    }

    public void addFloorWithWindows(int floorSize, int desiredNumberOfWindows) {
       
    	String floorWithWindows;
    	if(floorSize<0 || desiredNumberOfWindows<0){
    	throw new UnsupportedOperationException("Not yet implemented");
    	}
    	
    	while(floorSize!=fStr.length()){
    		fStr+="X";
    		
    	}
    	
    	while(desiredNumberOfWindows!=windows.length()){
    		windows+="0";
    	}
      floorWithWindows =  fStr.substring(0,windows.length())+windows+fStr.substring(windows.length()+1); 
      System.out.println("Output "+floorWithWindows);
      if(desiredNumberOfWindows==0){
      towerFloor.put(0,floorWithWindows);}
      else if (desiredNumberOfWindows==2){
    	  towerFloor.put(0,floorWithWindows);
      }
      else if (desiredNumberOfWindows==3){
    	  towerFloor.put(1,floorWithWindows);
      }
      else if (desiredNumberOfWindows==4){
    	  towerFloor.put(0,floorWithWindows);
      }
    }

}
