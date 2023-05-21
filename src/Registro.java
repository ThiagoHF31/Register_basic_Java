public class Registro {
    User user = new User();
    public void store(){
        user.setId(1);
        user.setName("Fulano de tal");
        user.setAge(46);
    }
    public void index(){
        System.out.println("Id: "+user.getId());
        System.out.println("Name: "+user.getName());
        System.out.println("Age: "+user.getAge());
    }
}
