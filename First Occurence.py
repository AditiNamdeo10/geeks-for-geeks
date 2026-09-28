class Solution:
    def firstOccurence(self,txt,pat):
        #code here
        if pat not in txt:
            return -1
        return txt.index(pat)

    