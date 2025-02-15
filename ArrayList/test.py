def maxProfit(coins):
    m, n = len(coins), len(coins[0])
    # Initialize DP table
    dp = [[[float('-inf')] * 3 for _ in range(n)] for _ in range(m)]
    
    # Base case
    for k in range(3):
        dp[0][0][k] = coins[0][0]
    
    # Fill the DP table
    for i in range(m):
        for j in range(n):
            for k in range(3):
                if i > 0:
                    dp[i][j][k] = max(dp[i][j][k], dp[i-1][j][k] + coins[i][j])
                    if k > 0 and coins[i][j] < 0:
                        dp[i][j][k] = max(dp[i][j][k], dp[i-1][j][k-1] - coins[i][j])
                if j > 0:
                    dp[i][j][k] = max(dp[i][j][k], dp[i][j-1][k] + coins[i][j])
                    if k > 0 and coins[i][j] < 0:
                        dp[i][j][k] = max(dp[i][j][k], dp[i][j-1][k-1] - coins[i][j])
    
    # Get the maximum profit at the bottom-right corner
    return max(dp[m-1][n-1])
coins = [
    [0,1,-1],
    [1,-2,3],
    [2,-3,4]
]
print(maxProfit(coins))  # Output: 7
