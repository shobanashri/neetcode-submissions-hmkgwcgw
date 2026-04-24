class Solution {
    public int numUniqueEmails(String[] emails) {

        Set<String> result = new HashSet<>();

        for(String email:emails){
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            local = local.split("\\+")[0];
            local = local.replace(".","");

            result.add(local+"@"+domain);

        }
        return result.size();
        
    }
}