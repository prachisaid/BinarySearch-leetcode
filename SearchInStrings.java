public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Kunal";
        char target = 'a';

        System.out.println(search1(str, target));
    }

    static int search(String str, char target){
        if(str.length() == 0){
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return i;
            }

        }
        return -1;
    }

    static boolean search1(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(char a : str.toCharArray()){
            if(a == target){
                return true;
            }
        }

        return false;
    }
}
