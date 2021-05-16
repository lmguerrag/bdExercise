public class Main {

    public static void main(String args[]){

        Mapper mapper = new Mapper();

        for (InformationDTO info : mapper.createDTO()) {
            System.out.println(info.toString());
        }
    }
}
