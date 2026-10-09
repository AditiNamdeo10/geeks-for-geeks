class Solution:

	
	def removeDuplicates(self, s):
	    # code here
	    lst=[]
        for i in s:
            if i not in lst:
                lst.append(i)
        ans=''.join(lst)
        return ans
            
	    