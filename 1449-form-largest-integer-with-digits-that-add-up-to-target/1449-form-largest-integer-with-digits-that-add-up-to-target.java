class Solution {
    public String largestNumber(int[] cost, int target) {
        String[] mem = new String[target+1];
        Map<Integer, String> s = new HashMap<>();
        int n = cost.length;
        for (int i = 0; i < n; i++) {
            if (cost[i] <= target) {
                mem[cost[i]] = "" + (i+1);
                s.put(cost[i], "" + (i+1));
            }
        }
        for (int i = 1; i < target + 1; i++) {
            String res = "0";
            if (mem[i] != null) {
                res = "" + mem[i];
            }
            for (int c : s.keySet()) {
                if (i - c > 0 && mem[i - c] != null 
                        && !mem[i - c].equals("0")) {
                    String pot = s.get(c) + mem[i - c];
                    if (pot.length() > res.length()) {
                        res = pot;
                    } else if (pot.length() == res.length() 
                            && pot.compareTo(res) > 0) {
                        res = pot;
                    }  
                }
            }
            mem[i] = res;
        }
        return mem[target];
    }
}