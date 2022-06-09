class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            int count = wordFrequency.getOrDefault(word, 0);
            wordFrequency.put(word, count + 1);
        }
        Queue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
            new MapEntryComparator());
        for (Map.Entry<String, Integer> wordEntry : wordFrequency.entrySet()) {
            maxHeap.offer(wordEntry);
        }
        List<String> result = new ArrayList<>();
        for (int start = 0; start < k; start++) {
            result.add(maxHeap.poll().getKey());
        }
        return result;
    }
    
    private class MapEntryComparator implements 
        Comparator<Map.Entry<String, Integer>> {

        @Override
        public int compare(Map.Entry<String, Integer> first, 
                           Map.Entry<String, Integer> second) {
            if (!second.getValue().equals(first.getValue())) {
                return second.getValue() - first.getValue();
            }
            return first.getKey().compareTo(second.getKey());
        }
    }
    
}