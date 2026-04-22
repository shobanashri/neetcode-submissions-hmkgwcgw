class Solution {
    public int countSeniors(String[] details) {
        int age=0;
        int count=0;
        for(String s:details){
        age = Integer.parseInt(s.substring(11,13));
        if(age>60){
            count++;
        }
        }
        
        return count;

    }
}