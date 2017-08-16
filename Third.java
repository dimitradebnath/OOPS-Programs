import java.util.*;
import java.io.*;
class Third
      {
        public static void main(String[] args)throws IOException{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of stocks");
            int nos=sc.nextInt();
            Stock st = new Stock();


              //  FileInputStream f = new FileInputStream("input.txt");
                FileOutputStream f = new FileOutputStream("Input.txt");
                  for(int i=1;i<=nos;i++){
                    System.out.println("Enter the number of shares");
                      String n=sc.next();
                        byte []b=n.getBytes();
                          f.write(b);
                            f.write(' ');
                             System.out.println("Enter the name of stocks");
                              String sn = sc.next();
                                byte []b1=sn.getBytes();
                                  f.write(b1);
                                    f.write(' ');
                                      System.out.println("Enter the share price");
                                        String p=sc.next();
                                          byte []b2=p.getBytes();
                                            f.write(b2);
                                              f.write(' ');
                              //System.out.println("Total value of the shares"+st.total());


          }
	f.close();

	st.total(nos*3);
        }
      }


class Stock{
		void total(int size)throws IOException
			{
        int t=0,i=0;
        String [] data = new String[size];
				File f1= new File("Input.txt");
        Scanner sc = new Scanner(f1);
        sc.useDelimiter(" ");
        while(sc.hasNext())
        {
          data[i]=sc.next();
          i++;
        }
        for(i=0;i<6;i++){
          //incomplete
        //  System.out.println(data[i]);
        }

      }

}
