class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        // create a list to keep track of all elements in s
        List<Character> store = new ArrayList<>();

        // add each character to a list
        for (int i = 0; i < s.length(); i++) {
            store.add(s.charAt(i));
        }

        // for every character in t, if it's in the list
        // remove it from the list
        for (int i = 0; i < t.length(); i++) {
            if (store.contains(t.charAt(i))) {
                int index = store.indexOf(t.charAt(i));
                store.remove(index);
            }
        }

        if (store.isEmpty()) {
            return true;
        }

        return false;
    }
}
