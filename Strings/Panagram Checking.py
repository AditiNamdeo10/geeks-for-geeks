class Solution:
    def checkPangram(self,s):
        
        s=s.lower()
        ans=set()
        for i in s:
            if i  in 'abcdefghijklmnopqrstuvwxyz':
                ans.add(i)
        if len(ans)==26:
            return True
        return False