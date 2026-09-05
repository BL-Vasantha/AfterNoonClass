public class DuplicateTeamNameFinder {
    static String findDuplicateTeam(String[] teamNames){
        for(int i = 0; i<teamNames.length; i++){
            for(int j = i+1; j<teamNames.length; j++){
                if(teamNames[i].equals(teamNames[j])){
                    return  "Found Douplicate : "+teamNames[i];
                }
            }

        }
        return  "no Duplicate Found";

    }

    public static void main(String[] args) {
        String[] teamNames = {"coder", "writter","coder" };
       String result =  findDuplicateTeam(teamNames);
        System.out.println(result);

    }
}
