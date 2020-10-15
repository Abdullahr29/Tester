public class DoctorList {
    private String[] docList;
    private int count = 0;
    public DoctorList(){
        docList = new String[10];
        docList[0] = "Dr Mireia";
        count = 1;
    }

    public void addDoctor(String name){
        docList[count] = name;
        count++;
    }

    public String getName(int i){
        return docList[i];
    }
}
