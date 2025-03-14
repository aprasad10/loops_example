public class Main {
    public static void main(String[] args) {

        int[][] votesTable =
                { {12, 13, 14, 10, 15, 16}, // candidate 0
                        { 5,  2,  6,  8,  4,  3}, // candidate 1
                        {13, 15, 10, 12, 11, 17}, // candidate 2
                };
        int voteCount;
        System.out.println("Table length: " + votesTable.length);
        for (int row[] : votesTable) {
            voteCount = 0;
            for (int vote : row) {
                voteCount += vote;
                }
            System.out.println("Votes: " + voteCount);
        }
    }
}