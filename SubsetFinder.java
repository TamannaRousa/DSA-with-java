
    import java.util.*;

    public class SubsetFinder {
        public static void main(String[] args) {
            Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
            List<Set<Integer>> subsets = findSubsets(set);
            
            System.out.println("All subsets:");
            for (Set<Integer> subset : subsets) {
                System.out.println(subset);
            }
        }
        
        public static List<Set<Integer>> findSubsets(Set<Integer> set) {
            List<Set<Integer>> subsets = new ArrayList<>();
            findSubsets(set, subsets, new HashSet<>(), 0);
            return subsets;
        }
        
        private static void findSubsets(Set<Integer> set, List<Set<Integer>> subsets, Set<Integer> currentSubset, int index) {
            subsets.add(new HashSet<>(currentSubset));
            
            for (int i = index; i < set.size(); i++) {
                int element = (int)set.toArray()[i];
                currentSubset.add(element);
                findSubsets(set, subsets, currentSubset, i + 1);
                currentSubset.remove(element);
            }
        }
    } 

