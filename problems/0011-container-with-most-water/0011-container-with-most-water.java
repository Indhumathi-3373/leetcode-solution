class Solution {
    public int maxArea(int[] height) {
       int MaxArea=0;
       int right=height.length-1;
       int left=0;
       
       while(left<right){
        int width=right-left;
        int MinHeight=Math.min(height[left],height[right]);
        int Area=width*MinHeight;
       if(Area>MaxArea){
        MaxArea=Area;
       }
       if(height[left]>height[right]){
           right--;
       }else{
        left++;
       }} return MaxArea;
    }
}