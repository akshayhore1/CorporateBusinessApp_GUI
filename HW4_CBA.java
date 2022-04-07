import java.util.Arrays;
import java.util.Scanner;

//LLNode Class
class LLNode<T> 
{
	String info;
	LLNode<T> link;
	String 	product_ID;
	String 	product;
	String 	color;
	String 	brand;
	String 	type;
	String 	store_code;
	String 	size;
	double 	price;
	double 	discount;
	int 	quantity;
	T 		data;

	public LLNode() {}
	public String getProduct_ID() 					{return product_ID;}
	public void setProduct_ID(String product_ID) 	{this.product_ID = product_ID;}
	public String getProduct() 						{return product;}
	public void setProduct(String product) 			{this.product = product;}
	public String getColor() 						{return color;}
	public void setColor(String color) 				{this.color = color;}
	public String getBrand() 						{return brand;}
	public void setBrand(String brand) 				{this.brand = brand;}
	public String getType() 						{return type;}
	public void setType(String type) 				{this.type = type;}
	public String getStoreCode() 					{return store_code;}
	public void setStoreCode(String store_code) 	{this.store_code = store_code;}
	public String getSize() 						{return size;}
	public void setSize(String size) 				{this.size = size;}
	public double getPrice()	 					{return price;}
	public void setPrice(double price)	 			{this.price = price;}
	public double getDiscount() 					{return discount;}
	public void setDiscount(double discount) 		{this.discount = discount;}
	public int getQuantity() 						{return quantity;}
	public void setQuantity(int quantity) 			{this.quantity = quantity;}
	public String getInfo()							{return info;}

	public void setInfo(String productId,String product,String color,String brand,String type,String store_code,String size,double price,double discount,int quantity) 
	{this.product_ID=productId;this.product=product;this.color=color;this.brand=brand;this.type=type;this.store_code=store_code;this.size=size;this.price=price;this.discount=discount;this.quantity=quantity;
	this.info=(String) (this.product_ID+"\t"+this.product+"\t"+this.color+"\t"+this.brand+"\t"+this.type+"\t"+this.store_code+"\t"+this.size+"\t"+this.price+"\t"+this.discount+"\t"+this.quantity);}

	public LLNode(T data) {this.data=data;}
	public LLNode<T> getLink() {return link;}
	public void setLink(LLNode<T> link) {this.link = link;}

	public LLNode(String productId,String product,String color,String brand,String type,String store_code,String size,double price,double discount,int quantity)
	{this.product_ID=productId;this.product=product;this.color=color;this.brand=brand;this.type=type;this.store_code=store_code;this.size=size;this.price=price;this.discount=discount;this.quantity=quantity;}
}

class QNode 
{
	LLNode<String> key;
	QNode next;

	public QNode(LLNode<String> list)
	{
		this.key = list;
		this.next = null;
	}
}

class Queue 
{
	QNode front, rear;

	public Queue()
	{
		this.front = this.rear = null;
	}

	// Method to add an key to the queue.
	void enqueue(LLNode<String> list)
	{

		// Create a new LL node
		QNode temp = new QNode(list);

		// If queue is empty, then new node is front and rear both
		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}
		this.rear.next = temp;
		this.rear = temp;
	}
}

//Main Class
public class HW4_CBA {
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		LLNode<String>list=new LLNode<String>();
		list.setInfo("1000000001","Tshirt","Red","Louis Vuitton","Top Wear","001","Medium",25.00,0,6000);
		LLNode<String>list2=new LLNode<String>();
		list2.setInfo("1000000002","Dress","Blue","Hermes","Full Wear","002","Extra-Large",50.00,9.2,3523100);
		list.setLink(list2);
		LLNode<String>list3=new LLNode<String>();
		list3.setInfo("1000000003","Jeans","Green","Gucci","Bottom Wear","003","Small",80.21,0,2990);
		list2.setLink(list3);
		LLNode<String>list4=new LLNode<String>();
		list4.setInfo("1000000004","Tanktop","Pink","Zara","Top Wear","004","Large",30.99,0,2943409);
		list3.setLink(list4);
		LLNode<String>list5=new LLNode<String>();
		list5.setInfo("1000000005","Pant","Grey","Lululemon","Bottom Wear","005","Small",40.90,15,0);
		list4.setLink(list5);
		LLNode<String>list6=new LLNode<String>();
		list6.setInfo("1000000006","Shorts","Yellow","Zara","Bottom Wear","005","Extra-Large",35.65,0,969236);
		list5.setLink(list6);
		LLNode<String>list7=new LLNode<String>();
		list7.setInfo("1000000007","Pant","Red","Gucci","Bottom Wear","004","Large",72.27,20,8689);
		list6.setLink(list7);
		LLNode<String>list8=new LLNode<String>();
		list8.setInfo("1000000008","Dress","Orange","Louis Vuitton","Full Wear","003","Medium",120.99,9.5,4787658);
		list7.setLink(list8);
		LLNode<String>list9=new LLNode<String>();
		list9.setInfo("1000000009","Tanktop","Green","Hermes","Top Wear","002","Small",46.23,0,998723);
		list8.setLink(list9);
		LLNode<String>list10=new LLNode<String>();
		list10.setInfo("1000000010","Jeans","Blue","Gucci","Bottom Wear","001","Medium",45.80,2,8561234);
		list9.setLink(list10);
		LLNode<String>list11=new LLNode<String>();
		list11.setInfo("1000000011","Tshirt","Peach","Lululemon","Top Wear","001","Extra-Large",23.69,0,0);
		list10.setLink(list11);
		LLNode<String>list12=new LLNode<String>();
		list12.setInfo("1000000012","Shorts","Orange","Zara","Bottom Wear","002","Large",24.05,0,0);
		list11.setLink(list12);
		LLNode<String>list13=new LLNode<String>();
		list13.setInfo("1000000013","Pant","Peach","Hermes","Bottom Wear","003","Small",45.79,0,9632336);
		list12.setLink(list13);
		LLNode<String>list14=new LLNode<String>();
		list14.setInfo("1000000014","Shirt","Pink","Gucci","Top Wear","004","Large",78.90,30,362394);
		list13.setLink(list14);
		LLNode<String>list15=new LLNode<String>();
		list15.setInfo("1000000015","Shirt","Grey","Hermes","Top Wear","005","Extra-Large",36.78,0,5782323);
		list14.setLink(list15);
		LLNode<String>lastDeleted=new LLNode<String>();

		System.out.println("\n===============================================================================================");
		System.out.println("||                                                                                           ||");
		System.out.println("||                  Welcome to Rainbow's Clothing Inventory Management System !!             ||");
		System.out.println("||                                                                                           ||");
		System.out.println("===============================================================================================\n");

		int UserAction = 1;
		while (UserAction != 3)
		{
			System.out.println();
			System.out.println("||===================================||");
			System.out.println("  Choose Option From Below Main Menu: \n \t 1. End User \n \t 2. In User \n \t 3. Exit");
			System.out.print("\n>> Please Enter Your Choice Here: "); UserAction=sc.nextInt();
			System.out.println();

			switch(UserAction) 
			{
			case 1:
				int choice_EndUser = 1;
				while (choice_EndUser != 0)
				{
					System.out.println("\n ||============== End User Menu =============||");		
					System.out.println("\n \t 1. Search Garments \n \t 2. Display Entire Wardrobe \n \t 3. Display Garments By Brand \n \t 4. Display Garments By Types\n \t 5. Display Garments By Store");	
					System.out.println("\t 6. List Garments By Price \n \t 7. List Garments By Size \n \t 8. List Garments By Availability \n \t 9. List Currently Discounted Garments \n \t 10.Display Today's Sale \n \t 0. Exit");
					System.out.println();	
					System.out.print(">> Choose Option From Above End User Menu: "); choice_EndUser=sc.nextInt();

					switch(choice_EndUser) 
					{
					case 1:
						System.out.println("\n \t Search Garments: ");
						String x="";
						new LLNode_Function().searchGarment(list,x);
						break;
					case 2:
						System.out.println(">> Display Entire Garments << \n");
						new LLNode_Function().displayInventory(list);
						break;
					case 3: 
						System.out.println(">> Display Garments By Brand <<");
						System.out.println("(Louis Vuitton, Hermese, Gucci, Zara)\n");
						System.out.print(">> Enter Brand Name: "); sc.nextLine();
						String brand=sc.nextLine();
						new LLNode_Function().displayByBrand(brand,list);
						break;
					case 4:
						System.out.println(">> Display Garments By Types <<");
						System.out.println("(Full Wear, Top Wear, Bottom Wear) \n");
						System.out.print(">> Enter Product Type: "); sc.nextLine();
						String type=sc.nextLine();
						new LLNode_Function().displayByType(type,list);
						break;
					case 5:
						System.out.println(">> Display Garments By Store <<");
						System.out.println("(001, 002, 003, 004, 005) \n");
						System.out.print(">> Enter Store Code: "); String store=sc.next();
						new LLNode_Function().displayByStore(store,list);
						break;
					case 6:
						System.out.println(">> List Of Garments By Low to High Price << \n");
						new LLNode_Function().listByPrice(list);   
						new LLNode_Function().displayInventory(list);
						break;
					case 7:
						System.out.println(">> List Of Garments By S to XXL Size << \n"); 
						new LLNode_Function().listBySize(list);	
						new LLNode_Function().displayInventory(list);
						break;
					case 8:
						System.out.println(">> List Of Garments by Availability << \n");
						new LLNode_Function().listByAvailability(list);
						new LLNode_Function().displayInventory(list);
						break;
					case 9:
						System.out.println(">> Display Currently Discounted Garments << \n");
						new LLNode_Function().displayByDiscount(list);  
						break;
					case 10:
						System.out.println(">> Display Today's Sale <<\n");
						Queue q = new Queue();
						LLNode<String>current=list;
						int len=0;
						while(current!=null)
						{
							len++;
							current=current.getLink();
						}
						if(len>10) {
							int c=len-10;
							int a=0;
							System.out.println("Yayy! 10% additional discount on the following Garments \n");
							String format = "%1$-15s %2$-15s %3$-15s %4$-15s %5$-15s %6$-15s %7$-15s %8$-15s %9$-15s %10$-15s";
							System.out.format(format, "Product ID","Product","Color","Brand","Type","Store Code","Size","Price","Discount","Quantity");
							System.out.println();
							LLNode<String>current1=list;
							while(current1!=null && a<c) {
								if(current1.getQuantity()!=0) {
									q.enqueue(current1);
									System.out.format(format,q.rear.key.getProduct_ID(),q.rear.key.getProduct(),q.rear.key.getColor(),
											q.rear.key.getBrand(),q.rear.key.getType(),q.rear.key.getStoreCode(),q.rear.key.getSize(),q.rear.key.getPrice(),q.rear.key.getDiscount()+10,q.rear.key.getQuantity());
									System.out.println();
									current1=current1.getLink();
									a++;
								}
							}
						}
						else {
							System.out.println("Sorry! No sales for today!");
						}
						break;
					case 0:
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                     Thank You For Showing Interest in Rainbow Wardrobe                       ");
						System.out.println("----------------------------------------------------------------------------------------------");
						break;
					default:
						System.out.println("Invalid Option Selected");
						break;
					}
				}
				break;

			case 2:
				System.out.println("\n || For In-User Access, Please Enter Authorised Employee Credential ||");
				System.out.print("\n>> Please Enter Your User Identity: "); String AuthUser = sc.next();
				if(Arrays.asList("ahore3","sgoswa5","sjagar2","sezhil2","rgupta62").contains(AuthUser)) 
				{
					System.out.print("\n>> Please Enter Your User Password: "); String AuthPswd = sc.next();

					if (AuthPswd.equals("****")) 
					{
						int choice_InUser = 1;
						while (choice_InUser != 0)
						{
							System.out.println("\n ||========== In-User Menu =========||\n");
							System.out.println(" 1. Search Garments \n 2. Display Entire Inventory \n 3. Display Garments By Brand \n 4. Display Garments By Type \n 5. Display Garments By Store");
							System.out.println(" 6. List Garments By Price \n 7. List Garments By Size \n 8. List Garments By Availability \n 9. List Garments with Discount");
							System.out.println(" 10.Add a New Garment \n 11.Update Garment Details \n 12.Remove a Garment \n 13.Retrieve last deleted item \n 0. Exit In-User Menu");
							System.out.println();	
							System.out.print(">> Choose Option From Above In-User Menu: "); choice_InUser=sc.nextInt();	

							switch(choice_InUser) 
							{
							case 1:
								System.out.println("Search items");
								String x="";
								new LLNode_Function().searchGarment(list,x);
								break;
							case 2:
								System.out.println("Show Entire Inventory \n");
								new LLNode_Function().displayInventory(list);
								break;
							case 3: 
								System.out.println("Show Inventory By Brands \n");
								System.out.print("Enter Brand Name"); sc.nextLine(); 
								String brand=sc.nextLine();
								new LLNode_Function().displayByBrand(brand,list);
								break;
							case 4:
								System.out.println("Show Inventory By Type \n");
								System.out.println("Enter Product Type: "); sc.nextLine();
								String type=sc.nextLine();
								new LLNode_Function().displayByType(type,list);
								break;
							case 5:
								System.out.println("Show Inventory By Store \n");
								System.out.println("Enter Store Code: "); String store=sc.next();
								new LLNode_Function().displayByStore(store,list);
								break;
							case 6:
								System.out.println("List Inventory By Price \n");
								new LLNode_Function().listByPrice(list);   
								new LLNode_Function().displayInventory(list);
								break;
							case 7:
								System.out.println("List Inventory By Size \n"); 
								new LLNode_Function().listBySize(list);	
								new LLNode_Function().displayInventory(list);
								break;
							case 8:
								System.out.println("List Inventory by Availability \n");
								new LLNode_Function().listByAvailability(list);
								new LLNode_Function().displayInventory(list);
								break;
							case 9:
								System.out.println("Show Discounted Inventory \n");
								new LLNode_Function().displayByDiscount(list);  
								break;
							case 10:
								System.out.println("\n >> Enter The Details To Add a New Garment << \n");
								System.out.print("Enter The Product Id: ");   	String productID=sc.next();
								System.out.print("Enter The Product: ");	 	String Product=sc.next();
								System.out.print("Enter The Color: "); 			String color=sc.next();
								System.out.print("Enter The Brand: "); 			sc.nextLine(); String pbrand=sc.nextLine();
								System.out.print("Enter The Type: "); 			String ptype=sc.nextLine();
								System.out.print("Enter The Store Code: "); 	String store_code=sc.next();
								System.out.print("Enter The Size: "); 			String size=sc.next();
								System.out.print("Enter The Price: "); 			double price=sc.nextDouble();
								System.out.print("Enter The Discount: "); 		double discount=sc.nextDouble();
								System.out.print("Enter The Quantity: "); 		int quantity=sc.nextInt();

								LLNode<String>newItem=new LLNode<>();
								newItem.setInfo(productID, Product, color, pbrand, ptype, store_code, size, price, discount, quantity);
								new LLNode_Function().addRecord(list15,newItem);
								System.out.println("\n||===== New Garment Has Been Added To Inventory =====|| \n");
								new LLNode_Function().displayInventory(newItem);
								break;
							case 11:
								System.out.println("\n >> Updating a Record << \n");
								System.out.print("Enter Product Id To Update Record: "); String id=sc.next();
								new LLNode_Function().UpdateList(list, id);
								new LLNode_Function().displayInventory(list);
								break;	
							case 12:
								System.out.println("Delete items \n");
								System.out.print("Enter The Product Id You Want To Delete: "); String product_ID=sc.next();
								lastDeleted = new LLNode_Function().searchByProductID(list, product_ID);	
								new LLNode_Function().deletebyproductid(list, product_ID);	
								new LLNode_Function().displayInventory(list);
								break;
							case 13:
								System.out.println("Retrieve last deleted item \n");
								if(lastDeleted == null) 
								{System.out.println("No Deleted Item Found");} 
								else 
								{
									System.out.println("\n||===================================||");
									System.out.println("  Last deleted ProductID: " + lastDeleted.getProduct_ID());
									System.out.println("||===================================||\n");
									new LLNode_Function().displayInventory(list);

								}
								break;
							case 0:
								System.out.println("----------------------------------------------------------------------------------------------");
								System.out.println("                         Thank You For Using Rainbow Inventory                                ");
								System.out.println("----------------------------------------------------------------------------------------------");
								break;
							default:
								System.out.println("Invalid Option Selected");
								break;
							}	
						}
					}else {System.out.println("\n || Access Denied! Incorrect Password ||");}
				}
				else {System.out.println("\n || Access Denied! You Are Not Authorised User ||");}
				break;

			case 3:
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("                                   Thank You! Happy To Help You.                              ");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Option Selected");
				break;
			}
		}sc.close();
	}
}
