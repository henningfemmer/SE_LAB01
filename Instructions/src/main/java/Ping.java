public class Ping extends Net{

    public static boolean timeOut(String ip){
        boolean output = false;
        if (Net.ping(ip).contains("Zeitüberschreitung")){
            output = true;
        }else {
            Net.ping(ip).contains("ms");
            output = false;
        }
        return output;

    }
    public static boolean checkIP(String ip){
        boolean output= false;
        if(timeOut(ip)==true){
            output=false;
        }
        else if(timeOut(ip)==false){
            output=true;
        }
        return output;
    }
    public static String checkNetwork(){
        String[] network = new String [110];
        int counter=0;
        String ausgabe = "";
        for (int i = 1; i<=128;i++){
          if( checkIP("194.94.2."+i)==false){
              network[counter] = "194.94.2."+i;
              counter++;
          }
        }
        for (int j = 0; j<network.length;j++){
            if (network[j].equals(null)){
                break;
            }else{
                ausgabe += network[j] + "\n";
            }
        }
        return counter + " " + ausgabe;
    }
    public static void main(String...args){
        String ersteIP = "194.94.2.14";
        String zweiteIP = "194.94.2.20";
        //System.out.println(Net.ping(ersteIP));
        //System.out.println(Net.ping(zweiteIP));
        //System.out.println(timeOut(zweiteIP));
        System.out.println(checkIP(zweiteIP));
        System.out.println(checkNetwork());
    }
}
