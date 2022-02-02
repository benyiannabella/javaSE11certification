enum MyEnum{
    ME{public String getMe(){return "it is me";}},
    MYSELF {public String getMe(){return "get myself";}};
    public abstract String getMe();
}

public class TestEnum{
    public MyEnum getEnum(){
        return MyEnum.ME;
    }

    public static void main(String[] args) {
        TestEnum te = new TestEnum();
        System.out.println(te.getEnum().getMe());

    }
}