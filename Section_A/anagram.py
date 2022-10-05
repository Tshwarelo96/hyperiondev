class Solution:
    def groupAnagrams(self, strs):
        result = {}
        for i in strs:
            x = "".join(sorted(i))
            if x in result:
                result[x].append(i)
                print(result[x])
            else:
                result[x] = [i]
                print('else part')
                print(result[x])
                
        return list(result.values())
      
ob1 = Solution()
print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))