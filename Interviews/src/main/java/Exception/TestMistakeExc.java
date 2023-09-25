package Exception;

public class TestMistakeExc {
public static void main(String[] args) {
	dad();
}
public static void dad() {
	try {
	mom();
}catch(MistakeException e ) {
	System.out.println(e.getMessage());
}
}
public static void mom() throws  MistakeException {
	son();
	
}
public static void son() throws  MistakeException{
	MistakeException m = new MistakeException();
		throw m;

}
}

