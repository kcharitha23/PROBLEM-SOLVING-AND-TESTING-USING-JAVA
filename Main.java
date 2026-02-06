class Main{
     public static void main(String[] args){
        String s="swiss";
        int[] count = new int[256];
        for(int i=0;i< s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i< s.length();i++){
            if(count[s.charAt(i)]==1){
               System.out.println("non-repeating character :"+s.charAt(i));
            }
        }
     }
}