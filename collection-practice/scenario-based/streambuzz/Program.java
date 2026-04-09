package streambuzz;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Program program = new Program();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1 Register Creator\n2 Show Top Posts\n3 Calculate Average Likes\n4 Exit");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    sc.nextLine();
                    System.out.println("Enter Creator Name:");
                    String creatorName = sc.nextLine();

                    double[] likes = new double[4];
                    System.out.println("Enter Weekly Likes (Week 1 to 4):");
                    for(int i=0;i<4;i++) {
                        likes[i] = sc.nextDouble();
                    }

                    CreatorStats stats = new CreatorStats(creatorName, likes);
                    program.registerCreator(stats);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter like threshold:");
                    double threshold = sc.nextDouble();

                    Map<String,Integer> topPosts =
                            Program.getTopPostCounts(CreatorStats.engagementBoard, threshold);

                    if(topPosts.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        for(Map.Entry<String,Integer> entry : topPosts.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    double avg = program.calculateAverageLikes();
                    System.out.println("Overall average weekly likes: " + avg);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Logging off - Keep Creating with StreamBuzz!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static Map<String,Integer> getTopPostCounts(List<CreatorStats> records, double likeThreshold) {
        Map<String,Integer> ans = new HashMap<>();

        for(CreatorStats stats : records) {
            int cnt = 0;
            for(double like : stats.getWeeklyLikes()) {
                if(like >= likeThreshold) cnt++;
            }
            if(cnt > 0) ans.put(stats.getCreatorName(), cnt);
        }
        return ans;
    }

    public double calculateAverageLikes() {
        double totalLikes = 0;
        int totalWeeks = 0;

        for(CreatorStats stats : CreatorStats.engagementBoard) {
            for(double like : stats.getWeeklyLikes()) {
                totalLikes += like;
                totalWeeks++;
            }
        }
        return totalWeeks == 0 ? 0.0 : totalLikes / totalWeeks;
    }

    public void registerCreator(CreatorStats record) {
        if(record != null) {
            CreatorStats.engagementBoard.add(record);
            System.out.println("Creator Registered Successfully");
        } else {
            System.out.println("Enter valid User");
        }
    }
}
