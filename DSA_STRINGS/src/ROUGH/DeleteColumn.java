package ROUGH;

public class DeleteColumn {
    public static void main(String[] args) {
        String [] strs = {"zyx","wvu","tsr"};
         int res =0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length-1; j++) {
                  if(strs[j].charAt(i)<strs[j+1].charAt(i)){

                  }
                  else{
                      res=res+1;
                      break;
                  }
            }
        }
        System.out.println(res);
    }
}
