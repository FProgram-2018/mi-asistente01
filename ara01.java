

public class ara01{ //CRUD
	public static void main(String[] args) {
		String h[] = {"Hola", "Juan", "Maria"};
		reader(h);

		h=add("Angel", h);
		reader(h);
		
		edit("Juan","Juan Gabriel", h);
		reader(h);

		h=delete("Juan Gabriel", h);
		reader(h);	
	}
	public static void edit(String b,String n, String v[]){
			int pos =find(b, v);
			if(pos>=0)
				v[pos]=n;
			else
				System.out.println("No existe");		
			
	}
	public static int find(String b, String v[]){
			for (int i=0;i<v.length;i++ ) {
				if (b.equals( v[i]) ){	
					return i;
				}
			}
			return -1;
	}

	public static String[] add(String cad,String v[]){
		System.out.println("==CREATE==");
		String[] nuevo = new String[v.length+1];
		for (int i=0;i<nuevo.length-1;i++ ) {
			nuevo[i]=v[i];
		}
		nuevo[nuevo.length-1]=cad;
		return nuevo;
	}
	
	public static String[] delete(String b, String v[]){
		String[] nuevo = new String[v.length-1];
		System.out.println("==DELETE==");
		int temp = 0;
		for (int i=0;i<v.length;i++ ) {
			if (b.equals( v[i]) ){}
			else{
				nuevo[temp] = v[i];
				temp++;
			}
		}
		return nuevo;
	}

	public static void reader(String v[]){
		System.out.println("==READER==");
		for (int i=0;i<v.length ;i++ ) {
			System.out.println("v["+i+"]="+v[i]);
		}
	}
}
	