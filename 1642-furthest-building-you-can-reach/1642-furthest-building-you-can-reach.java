class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        if(heights.length<=1) return 0;
        int rembricks = bricks;
        int remladders = ladders;
        int steps=0;
        int heapsize = 0;
        if(ladders<=0){
             for(int i=0;i<heights.length-1;i++){
                  if(heights[i+1]<=heights[i]){steps++;}
                  else{
                     rembricks = rembricks - (heights[i+1]-heights[i]);
                      if(rembricks>=0){steps++;}
                        else{break;}
                  }
                 
             }
            return steps;
        }
        
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>(ladders);
        
        for(int i=0;i<heights.length-1;i++){
            if(heights[i+1]<=heights[i]){steps++;}
            else{
                if(heapsize<ladders){
                    minheap.add(heights[i+1]-heights[i]);
                    remladders--;
                    heapsize++;
                    steps++;
                }
                else{
                    
                       if(minheap.peek()<(heights[i+1]-heights[i])){
                            rembricks -= minheap.poll();
                            minheap.add(heights[i+1]-heights[i]);
                        }
                        else{
                            rembricks = rembricks - (heights[i+1]-heights[i]);
                        }

                        if(rembricks>=0){steps++;}
                        else{break;}

                    }
                }
            }
        
        return steps;
    }
}