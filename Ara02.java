import java.util.Scanner;
public class Ara02 {
  public static int [ ] vectorEnteros ( int elementos ) {
    int i; int [ ] v; 
    v = new int [ elementos ];
    Scanner sc = new Scanner ( System.in );
  for ( i = 0; i < elementos; i++ ) {
      System.out.print ( "v [ " + i + " ] = " );
      v [ i ] = sc.nextInt ( ); 
    }
  return v;
  }
  public static double mitad ( int [ ] v ) {
    double prom = 0.0;
    for ( int i = 0; i < v.length; i++ )
      prom += v[i];
  return prom / ( double ) v.length;  
  }
  public static int [ ] ordenador ( int [ ] v, int ord ) {
    int i, j, n = v.length, aux = 0;
    
    for ( i = 0; i < n - 1; i++ )
      for ( j = i + 1; j < n; j++ )
        if ( ord == 0 )
          if ( v [ i ] > v [ j ] ) {
            aux = v [ j ];
            v [ j ] = v [ i ];
            v [ i ] = aux;
          }
        else if ( ord == 1 )
          if ( v [ i ] < v [ j ] ) {
            aux = v [ i ];
            v [ i ] = v [ j ];
            v [ j ] = aux;
          }
  return v;
  }

  public static double mediana ( int [ ] v ) {
    int pos = 0, n = v.length;
    double temp = 0, temp0 = 0;    
   
    v = ordenador ( v, 0 );

    temp = n / 2;
    if ( n % 2 == 0 ) {
      pos = (int)temp;      
      temp0 = (double)(v [ pos ] / v [ pos + 1 ]);
    }
    if ( n % 2 == 1 ) {
      pos = (int)(temp + 0.5);
      temp0 = (double)(v [ pos ]);  
    }

    return temp0;
  }
 public static int moda ( int [ ] v ) {
    int i, j, moda = 0, n = v.length, frec;
    int frecTemp, frecModa = 0, moda1 = -1; 
  v = ordenador ( v, 0 );
   for ( i = 0; i < n; i++ ) {
      frecTemp = 1; 
      for ( j = i + 1; j < n; j++ ) {
        if ( v [ i ] == v [ j ] )
          frecTemp++;
      }
      if ( frecTemp > frecModa ) {
        frecModa = frecTemp;
        moda1 = v [ i ];
      }
    }
    return moda1;
  }
 
public static void main ( String [ ] args ) {
    int n; int [] v;
    double media, mediana, moda, rango, desviacion;
    Scanner sc = new Scanner ( System.in );
    System.out.println ( "Dimension Arreglo : ");
    n = sc.nextInt ( );

    v = vectorEnteros ( n );
    media = mitad ( v );
    mediana = mediana ( v );    
    moda = moda ( v );
    System.out.println ( " Media del vector: " + media);
    System.out.println ( " la moda: " + moda);
    System.out.println ( " la mediana: " + mediana);
    
  }
}