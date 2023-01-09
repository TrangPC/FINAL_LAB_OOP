import java.util.Iterator;

public class Cart {
	public static final int Max_Number_Ordered = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[Max_Number_Ordered];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc d) {
		if(qtyOrdered == Max_Number_Ordered) {
			System.out.println("Full cart!");
			return;
		}else {
			itemsOrdered[qtyOrdered+1] = d;
			System.out.println("Add successfully!");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc d) {
		boolean check = false;
		for(int i = 0; i<= qtyOrdered; i++) {
			if (itemsOrdered[i].getTitle().compareTo(d.getTitle())==1) {
				for(int j = i; j<qtyOrdered;j++)
					itemsOrdered[j] = itemsOrdered[j+1];
				qtyOrdered--; check = true;
				System.out.println("Remove successfully!");
				break;
			}
		}
		if(check == false) {
			System.out.println("Don't exist!");
		}
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i< qtyOrdered; i++)
		{
			totalCost+= itemsOrdered[i].getCost();
		}
		return totalCost;
	}
	
	}

