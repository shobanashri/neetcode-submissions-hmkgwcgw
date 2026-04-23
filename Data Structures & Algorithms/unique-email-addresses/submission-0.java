class Solution {
    public int numUniqueEmails(String[] emails) {

        Set<String> result = new HashSet<>();

        for(String email:emails){
            String[] part = email.split("@");
            String local = part[0];
            String domain = part[1];

            local = local.split("\\+")[0];
            local = local.replace(".","");
            
            result.add(local+ "@"+ domain);
        }
        return result.size();
        
    }
}