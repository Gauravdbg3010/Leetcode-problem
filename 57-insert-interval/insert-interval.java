class Solution {
    public int[][] insert(int[][] intervals, int[] newinterval) {

        int i=0;
        int n = intervals.length;

        List<int[]> result = new ArrayList<>();

        //add interval before overlapping

        while(i<n && intervals[i][1] < newinterval[0]){
            result.add(intervals[i]);
            i++;
        }
         // merge overlapped  interval
        while(i<n && intervals[i][0] <= newinterval[1]){
            newinterval[0] = Math.min(intervals[i][0],newinterval[0]);
            newinterval[1] = Math.max(intervals[i][1],newinterval[1]);
            i++;
        }

        // add merge interval

        result.add(newinterval);

        // add remaing interval

        while(i<n){
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);

        
    }
}