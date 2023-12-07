import java.util.*;

public class Picture {
    static Map<String, Set<String>> disLikes;
    static Map<String, Integer> inDegrees;
    static PriorityQueue<String> queue;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextInt()) {
            int numPeople = scanner.nextInt();
            scanner.nextLine();
            
            // Initialize data structures
            disLikes = new HashMap<>();
            inDegrees = new HashMap<>();
            queue = new PriorityQueue<>();
            
            // Populate data structures
            String[] names = scanner.nextLine().split("\\s+");
            for (String name : names) {
                disLikes.put(name, new HashSet<>());
                inDegrees.put(name, 0);
                queue.offer(name);
            }
            int numPairs = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < numPairs; i++) {
                String[] pair = scanner.nextLine().split("\\s+");
                String name1 = pair[0];
                String name2 = pair[1];
                disLikes.get(name1).add(name2);
                disLikes.get(name2).add(name1);
                inDegrees.put(name2, inDegrees.get(name2) + 1);
                inDegrees.put(name1, inDegrees.get(name1) + 1);
            }
            
            // Topological Sort
            StringBuilder result = new StringBuilder();
            while (!queue.isEmpty()) {
                String curr = queue.poll();
                if (inDegrees.get(curr) > 0) {
                    queue.offer(curr);
                    continue;
                }
                result.append(curr).append(" ");
                for (String neighbor : disLikes.get(curr)) {
                    inDegrees.put(neighbor, inDegrees.get(neighbor) - 1);
                }
            }
            
            // Output
            if (result.length() < names.length * 2 - 1) {
                System.out.println("You all need therapy.");
            } else {
                System.out.println(result.toString().trim());
            }
        }
        
        scanner.close();
    }
}
