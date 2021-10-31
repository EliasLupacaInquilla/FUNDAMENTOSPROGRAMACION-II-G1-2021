package pe.edu.upeu.app;

   static void menuOpciones(){ 
      sp=new SubProgramas();
      int opcionesA=0;
      System.out.println("-------------------------------");
      String msg="\nIngrese el Algoritmo que desea Probar"+ 
      "\n1=Sualudo"+
      "\n2=otro saludo"+
      "\n3=Factorial";
      System.out.println(msg);
      opcionesA=sc.nextInt(); 
      while(opcionesA!=0){
          switch(opcionesA) {
            case 1: sp.saludo(); break;
            case 2: sp.otroSaludo("Raul"); break;
            case 3: rc factorial(5); break;
            default: System.out.println("El Algoritmo no existe!");
          }   
        System.out.println("------------------------------"); //15.511.210.043.330.985.984.000.000
        System.out.println(msg);
        opcionesA=sc.nextInt();        
      }
    }