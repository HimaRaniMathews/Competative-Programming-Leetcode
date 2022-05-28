class Solution {
public int maxSubArray(int[] nums) {
    int length=nums.length;
    if(length==0){
    	return 0;
    }
    int totalMax=0;
    int nowMax=0;
    for(int i=0;i<length;i++){
    	int now=nums[i];
    	if(nowMax==0){//A New Beginning
    		if(now>=0){
    			nowMax=now;
    			continue;
    		}
    		else {
				continue;
			}
    		
    	}
    	else {//There was a peace before
			if(now>=0){
				nowMax=nowMax+now;
				continue;
			}
			else{//Last and temporary end enter subtraction mode
				
				if(nowMax>totalMax){//Plus the negative positive decreases, update the max value first
					totalMax=nowMax;
				}				
				nowMax=nowMax+now;
				if(nowMax<0){
					nowMax=0;
				}
				continue;
			}
    		
		}
    	
    }
	
    if(nowMax>totalMax){
		totalMax=nowMax;
	}
    if(totalMax==0){//All negative
    	totalMax=nums[0];
    	for(int i=0;i<length;i++){
    		int now=nums[i];
    		if(now>totalMax){
    			totalMax=now;
    		}
    	}
    }
	
	return totalMax;
    }
}