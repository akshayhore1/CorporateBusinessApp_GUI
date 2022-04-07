import java.util.Scanner;

public class LLNode_Function 
{
	public void searchGarment(LLNode<String>reference, String x)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" \t 1. Product ID \n \t 2. Product \n \t 3. Color");
		System.out.print("\n>> Enter Your Choice For Item Search: "); int choice=sc.nextInt();
		switch(choice) 
		{
		case 1:
			LLNode<String>prodID=new LLNode<>();
			System.out.print("\n>> Please Enter Product ID Here: "); x=sc.next();
			System.out.println();
			prodID=new LLNode_Function().searchByProductID(reference, x);
			if (prodID != null)
			{
				String format = "%1$-15s %2$-15s %3$-15s %4$-15s %5$-15s %6$-15s %7$-15s %8$-15s %9$-15s %10$-15s";
				System.out.format(format, "Product ID","Product","Color","Brand","Type","Store Code","Size","Price","Discount","Quantity");
				System.out.println();
				System.out.println();
				System.out.format(format, prodID.getProduct_ID(),prodID.getProduct(),prodID.getColor(),prodID.getBrand(),prodID.getType(),
				prodID.getStoreCode(),prodID.getSize(),prodID.getPrice(),prodID.getDiscount(),prodID.getQuantity());
				System.out.println();
			}else {System.out.println("Item Not found - Incorrect Product ID ");}
			break;
		case 2:
			System.out.print("\n>> Please Enter Product Here: "); x=sc.next();
			System.out.println();
			new LLNode_Function().searchByProduct(reference, x);
			break;
		case 3:
			System.out.print("\n>> Please Enter Product Color Here: "); x=sc.next();
			System.out.println();
			new LLNode_Function().searchByColor(reference, x);
			break;  
		default:
			System.out.println("Invalid Option Selected");
			break;
		}
	}

	public LLNode<String> searchByProductID(LLNode<String> reference,String x) {
		LLNode<String> current=reference;
		while (current != null)
		{ 
			if (current.getProduct_ID().equals(x)){return current;}
			current = current.getLink();
		}
		return null;

	}

	public void searchByProduct(LLNode<String> reference,String x) {
		LLNode<String> current=reference;
		int flag = 0;
		String format = "%1$-15s %2$-15s %3$-15s %4$-15s %5$-15s %6$-15s %7$-15s %8$-15s %9$-15s %10$-15s";
		System.out.format(format, "Product ID","Product","Color","Brand","Type","Store Code","Size","Price","Discount","Quantity");
		System.out.println();
		System.out.println();
		while (current != null)
		{ 
			if (current.getProduct().equalsIgnoreCase(x))   //data found
			{
				System.out.format(format, current.getProduct_ID(),current.getProduct(),current.getColor(),current.getBrand(),current.getType(),current.getStoreCode(),
						current.getSize(),current.getPrice(),current.getDiscount(),current.getQuantity());
				System.out.println();
				flag = 1;
			}
			current = current.getLink();
		}
		if(flag == 0)
			System.out.println("\nItem Not found - Incorrect Product ");
	}

	public void searchByColor(LLNode<String> reference,String x) {
		LLNode<String> current=reference;
		int flag = 0;
		String format = "%1$-15s %2$-15s %3$-15s %4$-15s %5$-15s %6$-15s %7$-15s %8$-15s %9$-15s %10$-15s";
		System.out.format(format, "Product ID","Product","Color","Brand","Type","Store Code","Size","Price","Discount","Quantity");
		System.out.println();
		System.out.println();
		while (current != null)
		{
			if (current.getColor().equalsIgnoreCase(x))
			{
				System.out.format(format, current.getProduct_ID(),current.getProduct(),current.getColor(),current.getBrand(),current.getType(),current.getStoreCode(),
						current.getSize(),current.getPrice(),current.getDiscount(),current.getQuantity());
				System.out.println();
				flag = 1;
			}         
			current = current.getLink();
		}
		if(flag == 0)
			System.out.println("\nItem Not found - Incorrect Color \n "); 
	}


	public void displayInventory(LLNode<String>reference) {
		LLNode<String>current=reference;
		String format = "%1$-15s %2$-15s %3$-15s %4$-15s %5$-15s %6$-15s %7$-15s %8$-15s %9$-15s %10$-15s";
		System.out.format(format, "Product ID","Producat","Color","Brand","Type","Store Code","Size","Price","Discount","Quantity");
		System.out.println();
		System.out.println();		
		while(current!=null) {
			System.out.format(format,current.getProduct_ID(),current.getProduct(),current.getColor(),
					current.getBrand(),current.getType(),current.getStoreCode(),current.getSize(),current.getPrice(),current.getDiscount(),current.getQuantity());
			System.out.println();
			current=current.getLink();
		}
	}

	public void displayByBrand(String brand,LLNode<String>reference) {

		LLNode<String> current=reference;
		int flag = 0;
		String format = "%1$-15s %2$-15s %3$-15s %4$-15s %5$-15s %6$-15s %7$-15s %8$-15s %9$-15s %10$-15s";
		System.out.format(format, "Product ID","Producat","Color","Brand","Type","Store Code","Size","Price","Discount","Quantity");
		System.out.println();
		System.out.println();	
		while (current != null)
		{
			if (current.getBrand().equalsIgnoreCase(brand))
			{
				System.out.format(format, current.getProduct_ID(),current.getProduct(),current.getColor(),current.getBrand(),current.getType(),current.getStoreCode(),
						current.getSize(),current.getPrice(),current.getDiscount(),current.getQuantity());
				System.out.println();
				flag = 1;
			}
			current = current.getLink();
		}
		if(flag == 0)
			System.out.println("\nItem Not found - Incorrect Brand "); 

	}

	public void displayByType(String type,LLNode<String>reference) {
		LLNode<String>current=reference;
		int flag = 0;
		String format = "%1$-15s %2$-15s %3$-15s %4$-15s %5$-15s %6$-15s %7$-15s %8$-15s %9$-15s %10$-15s";
		System.out.format(format, "Product ID","Producat","Color","Brand","Type","Store Code","Size","Price","Discount","Quantity");
		System.out.println();
		System.out.println();	
		while(current!=null) {
			if(current.getType().equalsIgnoreCase(type)) {
				//Display records by Type
				System.out.format(format,current.getProduct_ID(),current.getProduct(),current.getColor(),
						current.getBrand(),current.getType(),current.getStoreCode(),current.getSize(),current.getPrice(),current.getDiscount(),current.getQuantity());
				System.out.println();
				flag = 1;
			}
			current=current.getLink();
		}
		if(flag == 0)
			System.out.println("\nItem Not found - Incorrect Type ");
	}

	public void displayByStore(String location,LLNode<String>reference) {
		LLNode<String>current=reference;
		int flag = 0;
		String format = "%1$-15s %2$-15s %3$-15s %4$-15s %5$-15s %6$-15s %7$-15s %8$-15s %9$-15s %10$-15s";
		System.out.format(format, "Product ID","Producat","Color","Brand","Type","Store Code","Size","Price","Discount","Quantity");
		System.out.println();
		System.out.println();	
		while(current!=null) {
			if(current.getStoreCode().equals(location)) {
				//Display records by location
				System.out.format(format,current.getProduct_ID(),current.getProduct(),current.getColor(),
						current.getBrand(),current.getType(),current.getStoreCode(),current.getSize(),current.getPrice(),current.getDiscount(),current.getQuantity());
				System.out.println();
				flag = 1;
			}
			current=current.getLink();
		}
		if(flag == 0)
			System.out.println("\nItem Not found - Incorrect Store Code ");
	}


	public void displayByDiscount(LLNode<String>reference) {
		LLNode<String>current=reference;
		String format = "%1$-15s %2$-15s %3$-15s %4$-15s %5$-15s %6$-15s %7$-15s %8$-15s %9$-15s %10$-15s";
		System.out.format(format, "Product ID","Producat","Color","Brand","Type","Store Code","Size","Price","Discount","Quantity");
		System.out.println();
		System.out.println();	
		while(current!=null) {
			if(current.getDiscount()>0) {
				//Display the records who have discount!=0
				System.out.format(format,current.getProduct_ID(),current.getProduct(),current.getColor(),
						current.getBrand(),current.getType(),current.getStoreCode(),current.getSize(),current.getPrice(),current.getDiscount(),current.getQuantity());
				System.out.println();
			}
			current=current.getLink();
		}
	}


	public void listByPrice(LLNode<String>reference) {
		LLNode<String>temp=reference;
		while(temp!=null) {

			LLNode<String>min=temp;
			LLNode<String>next=temp.getLink();
			while(next!=null) {
				if(min.getPrice()>next.getPrice()) {
					min=next;

				}   
				next=next.getLink();
			}
			String data=temp.getInfo();
			String arr[]=data.split("\t");

			temp.setInfo(min.getProduct_ID(), min.getProduct(),min.getColor(),min.getBrand(),min.getType(),min.getStoreCode(),min.getSize(),min.getPrice(),min.getDiscount(),min.getQuantity());
			min.setInfo(new String(arr[0]), new String(arr[1]),new String(arr[2]),new String(arr[3]),new String(arr[4]),new String(arr[5]),new String(arr[6]),Double.parseDouble(arr[7]),Double.parseDouble(arr[8]),Integer.parseInt(arr[9]));

			temp=temp.getLink();
		}
	}

	public void listBySize(LLNode<String>reference) {
		LLNode<String>temp=reference;
		while(temp!=null) {
			LLNode<String>min=temp;
			LLNode<String>next=temp.getLink();
			while(next!=null) {
				if(min.getSize().charAt(2)>next.getSize().charAt(2)) {
					min=next;

				}   
				next=next.getLink();
			}
			String data=temp.getInfo();
			String arr[]=data.split("\t");

			temp.setInfo(min.getProduct_ID(), min.getProduct(),min.getColor(),min.getBrand(),min.getType(),min.getStoreCode(),min.getSize(),min.getPrice(),min.getDiscount(),min.getQuantity());

			min.setInfo(new String(arr[0]), new String(arr[1]),new String(arr[2]),new String(arr[3]),new String(arr[4]),new String(arr[5]),new String(arr[6]),Double.parseDouble(arr[7]),Double.parseDouble(arr[8]),Integer.parseInt(arr[9]));

			temp=temp.getLink();
		}
	}

	public void listByAvailability(LLNode<String>reference) {
		LLNode<String>temp=reference;
		while(temp!=null) {
			LLNode<String>min=temp;
			LLNode<String>next=temp.getLink();
			while(next!=null) {
				if(min.getQuantity()>next.getQuantity() ) {
					min=next;
				}   
				next=next.getLink();
			}
			String data=temp.getInfo();
			String arr[]=data.split("\t");
			temp.setInfo(min.getProduct_ID(), min.getProduct(),min.getColor(),min.getBrand(),min.getType(),min.getStoreCode(),min.getSize(),min.getPrice(),min.getDiscount(),min.getQuantity());
			min.setInfo(new String(arr[0]), new String(arr[1]),new String(arr[2]),new String(arr[3]),new String(arr[4]),new String(arr[5]),new String(arr[6]),Double.parseDouble(arr[7]),Double.parseDouble(arr[8]),Integer.parseInt(arr[9]));

			temp=temp.getLink();
		}
	}
	
	public void addRecord(LLNode<String>reference,LLNode<String>newItem) {
		LLNode<String>current=reference;

		while(current!=null) {
			current=current.getLink();
		}
		reference.setLink(newItem);  
	}

	static void UpdateList(LLNode<String>list, String id ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu\n1.Price \n2.Quantity \n3.Product \n");
		System.out.print("Choose one property to update: "); int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.print("Enter Price: ");
			double price = sc.nextDouble();
			new LLNode_Function().updatePriceByProductId(list, id, price);
			break;
		case 2:
			System.out.print("Enter Quantity: ");
			int quantity = sc.nextInt();
			new LLNode_Function().updateQuantityByProductId(list, id, quantity);
			break;
		case 3:
			System.out.print("Enter Product: ");
			String Name = sc.next();
			new LLNode_Function().updateNameByProductId(list, id, Name);
			break;
		default:
			System.out.println("Invalid Option Selected");
			break;
		}	
	}

	public void updatePriceByProductId(LLNode<String> reference,String productID,Double data) {
		LLNode<String>current=reference;
		while(current!=null) {
			if(productID.equals(current.getProduct_ID())) {
				current.setPrice(data); 
			}		  
			current=current.getLink();		  
		}
	} 

	public void updateQuantityByProductId(LLNode<String> reference,String productID,int data) {
		LLNode<String>current=reference;
		while(current!=null) {
			if(productID.equals(current.getProduct_ID())) {
				current.setQuantity(data); 
			}		  
			current=current.getLink();		  
		}
	} 
	
	public void updateNameByProductId(LLNode<String> reference,String productID,String data) {
		LLNode<String>current=reference;
		while(current!=null) {
			if(productID.equals(current.getProduct_ID())) {
				current.setProduct(data); 
			}		  
			current=current.getLink();		  
		}
	}


	public  LLNode<String> deletebyproductid(LLNode<String>reference,String productID)
	{
		LLNode<String>current=reference;
		if (current == null) {
			System.out.println("||=== This Record Does Not Exist ===||\n");
			return null;
		}
		if(current.getProduct_ID().equals(productID))
		{
			System.out.println("Product Deleted Successfully!");
			System.out.println("||===== Garment Has Been Removed From Inventory =====|| \n");
			return current.getLink();
		}
		current.setLink(deletebyproductid(current.getLink(), productID));
		return current;
	}
}
