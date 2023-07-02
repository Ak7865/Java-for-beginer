public class encap {
    private String name;
    public String getname(){
        return name;
    }
    public void setname(String newname) {
        this.name=newname;
    }
    public static void main(String[] args) {
        encap obj1=new encap();
        obj1.setname("My name is Syed Akhter Hussain");
        System.out.println(obj1.getname());
    }
}
