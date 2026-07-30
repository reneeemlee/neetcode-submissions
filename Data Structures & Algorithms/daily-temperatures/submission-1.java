class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        
        // Use Deque for a faster stack in Java
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            // While stack is not empty and current temp is 
            // warmer than the temp at top index
            while (!stack.isEmpty() && temperatures[i] >            
                                temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex; // Calculate days waited
            }
            // Push current day's index
            stack.push(i);
        }

        return result;
    }
}
