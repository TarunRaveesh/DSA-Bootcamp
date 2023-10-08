public class Qn19 {
            
    public static void main(String[] args) {
        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        int ans = maximumPopulation(logs);
        System.out.println(ans);
    }
    static int maximumPopulation(int[][] logs) {
        int[] pop = new int[101];
        for(int[] log : logs) {
            pop[log[0] - 1950]++;
            pop[log[1] - 1950]--;
        }

        int maxPop = 0;
        int maxPopYr = 0;
        int currentPop = 0;
        for(int i = 0; i < 101; i++) {
            currentPop += pop[i];
            if (currentPop > maxPop) {
                maxPop = currentPop;
                maxPopYr = i + 1950;
            }
        }
        return maxPopYr;
    }
}
