#Question link : https://leetcode.com/problems/max-consecutive-ones-iii/
#code 
# @param {Integer[]} nums
# @param {Integer} k
# @return {Integer}
def longest_ones(nums, k)
  zero_cnt=0
  max=-1
  left=0
  nums.each_with_index do |x,i|
    if x==0 
      zero_cnt+=1
    end 

    while(zero_cnt>k)
     if(nums[left]==0)
       zero_cnt-=1
     end 
       left+=1
    end
    max=[max,i-left+1].max
  end
    return max
end
