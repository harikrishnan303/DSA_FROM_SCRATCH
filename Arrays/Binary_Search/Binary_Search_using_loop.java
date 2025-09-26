class Solution {
    public int search(int[] nums, int target) 
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
}

Recursive Approach
class Solution {
    public int search(int[] nums, int target) 
    {
        return binarysearch(nums,target,0,nums.length-1);
    }
    public int binarysearch(int[] nums,int target,int start,int end)
    {
        if(start>end)
        return -1;
        
        int mid=(start+end)/2;
        if(nums[mid]==target)
        return mid;
        else if(nums[mid]<target)
        {
            return binarysearch(nums,target,mid+1,end);
        }
        else
        {
            return binarysearch(nums,target,start,mid-1);
        }
    }
}