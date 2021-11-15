class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        strX = str(x)
        revX = str(x)[::-1]
        if x < 0:
            return bool(False)
        elif strX != revX:
            return bool(False)
        else:
            return bool(True)
