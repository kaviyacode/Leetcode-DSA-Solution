class Solution(object):
    def numWaterBottles(self, numBottles, numExchange):
        return numBottles + (numBottles - 1) // (numExchange - 1)
               
      
        """
        :type numBottles: int
        :type numExchange: int
        :rtype: int
        """
        