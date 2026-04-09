class Solution:
    def countSeniors(self, details: List[str]) -> int:
        ans=0
        for detail in details:
            print(ord(detail[11]), ord(detail[12]))
            if ord(detail[11]) >= 54 and ord(detail[12])>=48 and not (ord(detail[11]) == 54 and ord(detail[12])==48):
                ans+=1 
        return ans