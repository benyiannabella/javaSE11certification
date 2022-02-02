import com.WordyCompanyName.ALongPackageName.AClassWithAVeryLongName;

public class VarTest {

    public static void main(String[] args) {

        var aClassWithAVeryLongName = new AClassWithAVeryLongName();
        aClassWithAVeryLongName.setName("Testing");
        System.out.println(aClassWithAVeryLongName);

        var i = 1;

        var aVarArray = new int[3];

        var methodVal = aClassWithAVeryLongName.getName();

        Object nullObject = null;
        var nullVar = nullObject;

        //invalid scenarios:

//        var j = 0, k = 0;
//        var m, n = 0;
//        var someObject;
//        var newVar = null;
//        var myArray = {"A", "B"};
//        var[] newVarArray = new int[2];

    }

}
