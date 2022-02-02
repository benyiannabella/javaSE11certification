import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {

        Stream<Integer> s = Stream.of(1, 2, 3);
//        System.out.println(s.mapToInt(x->x).sum());
//        OptionalDouble d = s.mapToInt(x->x).average();
//        System.out.println(d.getAsDouble());

//        OptionalInt oi = s.mapToInt(x->x).min();
//        OptionalInt oi = s.mapToInt(x->x).max();
//        System.out.println(oi.getAsInt());
//
//        IntStream i = s.mapToInt(x->x);
////        IntStream.rangeClosed(1,6).forEach(System.out::println);
//
//        Stream s2 = i.mapToObj(x->x);
//        s2.forEach(System.out::println);
//
//        Stream<Double> s3 = Stream.of(0.1, 2.5, 8.9);
//        DoubleStream ds = s3.mapToDouble(x->x);
//        ds.map(x->x*10).forEach(System.out::println);
//
//        DoubleStream dbs = DoubleStream.of(2.0, 8.0, 10.0);
////        Stream<Double> si = dbs.boxed();
//        OptionalDouble od = dbs.average();
//        od.ifPresent(System.out::println);

        IntStream ints = IntStream.of(1,2,3);
        IntSummaryStatistics stat = ints.summaryStatistics();
        if(stat.getCount() == 0) throw new RuntimeException();
        System.out.println("count " + stat.getCount() + ", min " + stat.getMin() + ", max " + stat.getMax());

    }
}
