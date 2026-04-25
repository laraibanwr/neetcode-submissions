class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int code = (int) ch;
                sb.append(code).append(',');
            }
            sb.append('#');
        }
        String encoded = sb.toString();
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder code = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == ',') {
                int ascii = Integer.parseInt(code.toString());
                sb.append((char) ascii);
                code.setLength(0);
            }
            else if(c == '#') {
                String word = sb.toString();
                decoded.add(word);
                sb.setLength(0);
            }
            else {
                code.append(c);
            }
        }
        return decoded;
    }
}
