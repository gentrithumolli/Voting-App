
import javax.swing.JOptionPane;

 	public class VotingApp {
	public static int vota1=0;
	public static int vota2=0;
	public static String kandidati1 = "Hashim Thaqi",
			kandidati2 = "Ismet Hebibi";


	public static int c;		   
	public static int mosha;


	public static void main(String[] args) {


		while(c==0){

			String m = JOptionPane.showInputDialog("Shkruani moshen tuaj: ");
			mosha = new Integer(m).intValue();
			if(mosha<18)
				
			{
				JOptionPane.showMessageDialog(null, "Ju duhet te jeni mbi 18 vjec per te votuar!");
			}
			if (mosha>=18)
			{
				JOptionPane.showMessageDialog(null,"Ju keni te drejte votimi! \nVotoni per kanditatin qe ju deshironi duke shkruar numrin perkates te kandidatit ");
				String v = JOptionPane.showInputDialog("NR(1): "+kandidati1+"\nNR(2): "+kandidati2);
				int vota = new Integer(v).intValue(); 

				if(vota==1){vota1++;c = JOptionPane.showConfirmDialog(null, "A ka votues te tjere?");}
				else if(vota==2){vota2++; c = JOptionPane.showConfirmDialog(null, "A ka votues te tjere?");}
				else {JOptionPane.showMessageDialog(null,"               Ju lutem votoni sakte per kandidatet e dhene.\nSHIQONI ME KUJDES NUMRAT PERKATES DHE VOTONI PERSERI!");}

				

			}
		}
		if(c==1)
		{
			JOptionPane.showMessageDialog(null, "     VOTIMI KA PERFUNDUAR\n"
					+ "   *********************************"
					+ "\n         GJITHESEJ VOTA = "+(vota1+vota2));
			if(vota1>vota2)
			{
				JOptionPane.showMessageDialog(null,"\tREZULTATET\n"
						+"*********************************\n"
						+kandidati1+" : "+vota1+" vota\n"
						+kandidati2+" : "+vota2+" vota\n"
						+ "Fituesi eshte "+kandidati1);
			}
			else if(vota2>vota1)
			{
				JOptionPane.showMessageDialog(null,"\tREZULTATET\n"
						+"*********************************\n"
						+kandidati1+" : "+vota1+" vota\n"
						+kandidati2+" : "+vota2+" vota\n"
						+"Fituesi eshte "+kandidati2);
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"Dy kandidatet jane ne balotazh,\nDo t'iu njoftojme per zgjedhjet e rradhes!");
			}
		}
		if(c==2)
			{
				int s = JOptionPane.showConfirmDialog(null,"A jeni i sigurt qe doni ta mbyllni votimin?");
				System.out.println(s);
				if(s==0)
					{
					System.out.println(s);
					System.exit(0);
					
					}
				else if(s==1||s==2)
					{
					System.out.println(s);
						c=0;
					}
				
			}
	}

}
