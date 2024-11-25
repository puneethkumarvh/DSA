#problem link : https://leetcode.com/problems/longest-substring-without-repeating-characters/
#code - space complexity O(N) and time complexity is O(N)
# @param {String} s
# @return {Integer}
def length_of_longest_substring(s)
  max_s=""
  set_data=Set.new()
  left=0;
  s.each_char.with_index do |x,i| 
   while set_data.include?(x)
      set_data.delete(s[left])
      left+=1
   end 
   set_data.add(x)
   r=s[left..i]
   if r.length()>max_s.length()
      max_s=r
   end
   end
   max_s.length() 
end
