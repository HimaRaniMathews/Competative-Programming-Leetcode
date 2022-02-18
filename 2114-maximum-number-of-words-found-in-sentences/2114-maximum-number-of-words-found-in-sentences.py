class Solution:
    def mostWordsFound(self, sentences):
        ans=0
        for i in sentences:
            temp=len(i.split(" "))
            if temp >ans:
                ans=temp
        return ans