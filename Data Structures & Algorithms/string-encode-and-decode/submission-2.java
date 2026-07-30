class Solution {

    public String encode(List<String> strs) {
        if (strs == null) {
            return "";
        }

        List<String> encode = new ArrayList<>();

        // create a list that stores the sizes of each string
        // for each string, append length to sizes list
        // build a string by writing all sizes separated by commas,
        for (String str : strs) {
            encode.add(String.valueOf(str.length()));
            encode.add(",");
        }

        // add a # mark to the end of the size section
        encode.add("#");

        // append actual strings in order
        for (String str : strs) {
            encode.add(str);
        }

        // return final encoded string
        String toRet = String.join("", encode);
        return toRet;
    }

    public List<String> decode(String str) {
        if (str.equals("")) {
            return new ArrayList<>();
        }

        List<String> decode = new ArrayList<>();

        // read characters until you reach the # to extract all recorded sizes
        int index = str.indexOf("#");
        String lengths = str.substring(0, index);
        str = str.substring(index + 1);

        List<Integer> lengthArr = new ArrayList<>();
        if (!lengths.isEmpty()) {
            String[] parts = lengths.split(",");
            for (int i = 0; i < parts.length; i++) {
                lengthArr.add(Integer.parseInt(parts[i]));
            }
        }

        // parse each size
        List<String> toRet = new ArrayList<>();
        for (int i = 0; i < lengthArr.size(); i++) {
            // extract substrings according to sizes list
            toRet.add(str.substring(0, lengthArr.get(i)));
            str = str.substring(lengthArr.get(i));
        }

        // return list of decoded strings
        return toRet;
    }
}
