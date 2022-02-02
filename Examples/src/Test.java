public class Test {
    enum JobStatus {
        SUCCESS, FAIL; //Line n1
    }

    enum TestResult {
        PASS, FAIL; //Line n2
    }

    public static void main(String[] args) {
        JobStatus js = JobStatus.FAIL;
        TestResult tr = TestResult.FAIL;

        System.out.println(js.equals(tr)); //Line n3
//        System.out.println(js == tr); //Line n4
    }

}
