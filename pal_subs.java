public class pal_subs {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(count_pal(str));


    }
    public static int count_pal(String s){
        // odd length pallindrome
        int count=0;
        for (int axis=0;axis<s.length();axis++){
            for (int orbit = 0;axis- orbit >=0&& axis+orbit<s.length() ; orbit++) {
                if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)){
                    break;
                }
                count++;
            }
        }
        // even length pallindrome

        for (double axis=0.5;axis<s.length();axis++){
            for (double orbit = 0.5;axis- orbit >=0&& axis+orbit<s.length() ; orbit++) {
                if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))){
                    break;
                }
                count++;
            }
        }
        return count;
    }

}
