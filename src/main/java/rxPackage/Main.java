package rxPackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;

public class Main {
    public static void main (String args[]){
        List<String> shapeList = Arrays.asList("rectangle","square","triangle");
        Observable<String> observableString = Observable.from(shapeList);
        observableString.subscribe(new Observer());
    }
}
