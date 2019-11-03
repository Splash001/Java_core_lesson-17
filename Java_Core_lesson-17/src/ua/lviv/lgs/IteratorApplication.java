package ua.lviv.lgs;

public class IteratorApplication {

	public static void main(String[] args) {

		Integer[] array = { 1, 12, -22, 41, 222, -1111, 325, 13,  43, -2, 34, 9, 17, -82, 1, 6, 55, 123, 3123, 214124};

		Collection collection = new Collection(array);
		Iterator iteratorForward = collection.createForward();

		while (iteratorForward.hasNext()) {
			Number elementsForward = iteratorForward.next();
			if (elementsForward.intValue() % 2 !=0) {
				elementsForward = 0;
			}
			
			System.out.println(elementsForward);
		} 

		System.out.println();

		Iterator iterBackward = collection.createBackward();
		
		int i = 1;
		
		while (iterBackward.hasNext()) {
			Number elementsBackward = iterBackward.next();
			if (i % 2 == 0) {
				System.out.println(elementsBackward);
			}
				i++;
		}
			System.out.println();
			
			Iterator iterAnonymous = collection.createAnonymous();
			
			int n = 1; 
			while (iterAnonymous.hasNext()) {
				Number elementsAnonymous = iterAnonymous.next();
				if (n % 3 == 0) {
					if (elementsAnonymous.intValue() % 2 != 0) {
						System.out.println(elementsAnonymous);
					}
				}
				n++;
			}
			
			System.out.println();
			
			Iterator iterLocal = collection.createLocal();
			
			int m = 1;
			while (iterLocal.hasNext()) {
				Number elementsLocal = iterLocal.next();
				if (m % 5 == 0) {
					if (elementsLocal.intValue() % 2 == 0) {
						elementsLocal = elementsLocal.intValue() - 100;
						System.out.println(elementsLocal);
					}
				}
				m++;
			}
			
			System.out.println();
			
			Iterator iterStatic = Collection.createStaticIterator();
			
			int e = 1;
			while (iterStatic.hasNext()) {
				Number elementsStatic = iterStatic.next();
				if (e % 2 == 0) {
					if (elementsStatic.intValue() % 2 == 0) {
						elementsStatic = elementsStatic.intValue() + 1;
						System.out.println(elementsStatic);
					}
				}
				e++;
			}			
	}
}
