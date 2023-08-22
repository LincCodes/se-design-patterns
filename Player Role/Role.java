public interface Role {
    public void role();
}

class Employee implements Role {
    @Override
    public void role(){
        System.out.println("I am working");
    }
}

class Customer implements Role {
    @Override
    public void role(){
        System.out.println("I am shopping");
    }
}
