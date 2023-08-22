public class General {
    String name;
    General(String name){
        this.name = name;
    }
}

class NonSub extends General{

    NonSub(String name) {
        super(name);
    }

    // functions of the NonSub
}

class Sub extends General{

    Sub(String name) {
        super(name);
    }

    // functions of the Sub
}