class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        


        System.out.println("========== Candies problem")
        int maxCandies = 0;
        for (int candy : candies){
            maxCandies = Math.max(candy, maxCandies);
        }

        ArrayList<Boolean> list = new ArrayList<Boolean>();
        for (int candy : candies){
            list.add(candy + extraCandies >= maxCandies);
        }
        

        return list;
    }
}