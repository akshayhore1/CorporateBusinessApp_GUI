import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.*;
import javax.swing.JPanel;
import javax.swing.JPasswordField;


public class HW5_GUI extends JFrame
{
	private static final long serialVersionUID = 1L;
//JFrame
	private JFrame MainMenu;
	private JFrame EndUserMenu;
	private JFrame InUserLogin;
	private JFrame InUserMenu;
	private JFrame Search;
	private JFrame Display;
	private JFrame Modify;
	private JFrame Added;
	private JFrame Updated;

//JLabel
	private JLabel AppTitle;
	private JLabel MainOptions;
	private JLabel InUserTitle;
	private JLabel InUserOpt;
	private JLabel InUserId;
	private JLabel InUserPswd;
	private JLabel InUserMTitle;
	private JLabel InUserMOpt;
	private JLabel InUserSOpt;
	private JLabel InUserDOpt;
	private JLabel InUserLOpt;
	private JLabel InUserEOpt;

	private JLabel EndUserMTitle;
	private JLabel EndUserMOpt;
	private JLabel EndUserSOpt;
	private JLabel EndUserDOpt;
	private JLabel EndUserLOpt;

	private JLabel DisplayInv;
	private JLabel DisplayBrand;
	private JLabel InBrand;
	private JLabel DisplayType;
	private JLabel InType;
	private JLabel DisplayStore;
	private JLabel InStore;

	private JLabel ListByPrice;
	private JLabel ListBySize;
	private JLabel ListByAvailability;
	private JLabel ListByDiscount;

	private JLabel AddInv;
	private JLabel AddDetails;
	private JLabel AddPid;
	private JLabel AddName;
	private JLabel AddColor;
	private JLabel AddBrand;
	private JLabel AddType;
	private JLabel AddSC;
	private JLabel AddSize;
	private JLabel AddPrice;
	private JLabel AddDiscount;
	private JLabel AddQuantity;
	private JLabel AddedInv;

	private JLabel UpInv;
	private JLabel UpDetails;
	private JLabel UpPid;
	private JLabel UpName;
	private JLabel UpColor;
	private JLabel UpBrand;
	private JLabel UpType;
	private JLabel UpSC;
	private JLabel UpSize;
	private JLabel UpPrice;
	private JLabel UpDiscount;
	private JLabel UpQuantity;
	
	private JLabel PdtID;
	private JLabel InPdt;
	private JLabel InPdtName;
	private JLabel PdtName;
	private JLabel PdtColor;
	private JLabel InPdtColor;

//JButton
	private JButton BtnEndUser;
	private JButton BtnInUser;
	private JButton BtnMainExit;
	private JButton BtnInLogin;
	private JButton BtnInBack;
	private JButton BtnInSrchGrmt;
	private JButton BtnInDEI;
	private JButton BtnInListGrmt;
	private JButton BtnInEdit;
	private JButton BtnInExit;
	private JButton BtnEndSrchGrmt;
	private JButton BtnEndDEI;
	private JButton BtnEndListGrmt;
	private JButton BtnEndBack;
	private JButton BtnEIBack;
	private JButton BtnBrandBack;
	private JButton BtnBrandSrch;
	private JButton BtnTypeBack;
	private JButton BtnTypeSrch;
	private JButton BtnAdd;
	private JButton BtnPdtBack;
	private JButton BtnPdtSrch;
	private JButton BtnPdtNameBack;
	private JButton BtnPdtNameSrch;
	private JButton BtnPdtColorSrch;
	private JButton BtnPdtColorBack;

//JTextField
	private JTextField IPInUser;
	private JPasswordField IPInPswd;
	private JTextField IPInBrand;
	private JTextField IPInType;

	private JTextField InAddPid;
	private JTextField InAddName;
	private JTextField InAddColor;
	private JTextField InAddBrand;
	private JTextField InAddType;
	private JTextField InAddSC;
	private JTextField InAddSize;
	private JTextField InAddPrice;
	private JTextField InAddDiscount;
	private JTextField InAddQuantity;

	private JTextField InUpPid;
	private JTextField InUpName;
	private JTextField InUpColor;
	private JTextField InUpBrand;
	private JTextField InUpType;
	private JTextField InUpSC;
	private JTextField InUpSize;
	private JTextField InUpPrice;
	private JTextField InUpDiscount;
	private JTextField InUpQuantity;
	
	private JTextField IPInPdt;
	private JTextField IPInPdtName;
	private JTextField IPInPdtColor;

//JTable and JPanel
	LLNode<String> link;
	private JTable table;
	private JPanel panel;

//Start of Main
	public static void main(String[] args) {
// Initializing LLNode for List
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

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HW5_GUI window1 = new HW5_GUI(list);
					window1.MainMenu.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//Start Class with list reference
	public HW5_GUI(LLNode<String>reference) {
		initialize(reference);
	}

	private void initialize(LLNode<String> reference) {
// initialise nodes list
		LLNode<String> list = new LLNode<String>();
		list.setInfo("1000000001", "Tshirt", "Red", "Louis Vuitton", "Top Wear", "001", "Medium", 25.00, 0, 6000);
		LLNode<String> list2 = new LLNode<String>();
		list2.setInfo("1000000002", "Dress", "Blue", "Hermes", "Full Wear", "002", "Extra-Large", 50.00, 9.2, 3523100);
		list.setLink(list2);
		LLNode<String> list3 = new LLNode<String>();
		list3.setInfo("1000000003", "Jeans", "Green", "Gucci", "Bottom Wear", "003", "Small", 80.21, 0, 2990);
		list2.setLink(list3);
		LLNode<String> list4 = new LLNode<String>();
		list4.setInfo("1000000004", "Tanktop", "Pink", "Zara", "Top Wear", "004", "Large", 30.99, 0, 2943409);
		list3.setLink(list4);
		LLNode<String> list5 = new LLNode<String>();
		list5.setInfo("1000000005", "Pant", "Grey", "Lululemon", "Bottom Wear", "005", "Small", 40.90, 15, 0);
		list4.setLink(list5);
		LLNode<String> list6 = new LLNode<String>();
		list6.setInfo("1000000006", "Shorts", "Yellow", "Zara", "Bottom Wear", "005", "Extra-Large", 35.65, 0, 969236);
		list5.setLink(list6);
		LLNode<String> list7 = new LLNode<String>();
		list7.setInfo("1000000007", "Pant", "Red", "Gucci", "Bottom Wear", "004", "Large", 72.27, 20, 8689);
		list6.setLink(list7);
		LLNode<String> list8 = new LLNode<String>();
		list8.setInfo("1000000008", "Dress", "Orange", "Louis Vuitton", "Full Wear", "003", "Medium", 120.99, 9.5, 4787658);
		list7.setLink(list8);
		LLNode<String> list9 = new LLNode<String>();
		list9.setInfo("1000000009", "Tanktop", "Green", "Hermes", "Top Wear", "002", "Small", 46.23, 0, 998723);
		list8.setLink(list9);
		LLNode<String> list10 = new LLNode<String>();
		list10.setInfo("1000000010", "Jeans", "Blue", "Gucci", "Bottom Wear", "001", "Medium", 45.80, 2, 8561234);
		list9.setLink(list10);
		LLNode<String> list11 = new LLNode<String>();
		list11.setInfo("1000000011", "Tshirt", "Peach", "Lululemon", "Top Wear", "001", "Extra-Large", 23.69, 0, 0);
		list10.setLink(list11);
		LLNode<String> list12 = new LLNode<String>();
		list12.setInfo("1000000012", "Shorts", "Orange", "Zara", "Bottom Wear", "002", "Large", 24.05, 0, 0);
		list11.setLink(list12);
		LLNode<String> list13 = new LLNode<String>();
		list13.setInfo("1000000013", "Pant", "Peach", "Hermes", "Bottom Wear", "003", "Small", 45.79, 0, 9632336);
		list12.setLink(list13);
		LLNode<String> list14 = new LLNode<String>();
		list14.setInfo("1000000014", "Shirt", "Pink", "Gucci", "Top Wear", "004", "Large", 78.90, 30, 362394);
		list13.setLink(list14);
		LLNode<String> list15 = new LLNode<String>();
		list15.setInfo("1000000015", "Shirt", "Grey", "Hermes", "Top Wear", "005", "Extra-Large", 36.78, 0, 5782323);
		list14.setLink(list15);

//main menu frame
		MainMenu = new JFrame();
		MainMenu.setTitle("RAINBOW CLOTHING INVENTORY MAGAGEMENT APPLICATION");
		MainMenu.setBounds(250, 120, 950, 700);
		MainMenu.getContentPane().setBackground(Color.BLACK);
		MainMenu.setResizable(false);
		MainMenu.getContentPane().setLayout(null);
		MainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		AppTitle = new JLabel("~ Welcome to Rainbow Clothing Store ~");
		AppTitle.setBounds(70, 50, 800, 50);
		AppTitle.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
		AppTitle.setForeground(Color.MAGENTA);
		MainMenu.getContentPane().add(AppTitle);

		MainOptions = new JLabel("Choose Option From Below Main Menu");
		MainOptions.setBounds(250, 150, 500, 50);
		MainOptions.setFont(new Font("Bell MT", Font.BOLD, 25));
		MainOptions.setForeground(Color.ORANGE);
		MainMenu.getContentPane().add(MainOptions);
//enduser menu
		BtnEndUser = new JButton("End User");
		BtnEndUser.setBounds(400, 250, 175, 50);
		BtnEndUser.setBackground(Color.green);
		BtnEndUser.setFont(new Font("Gadugi", Font.BOLD, 20));
		BtnEndUser.setForeground(Color.BLACK);
		BtnEndUser.setFocusPainted(false);
		BtnEndUser.setBorderPainted(false);
		BtnEndUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.setVisible(false);
//enduser menu page
				EndUserMenu = new JFrame();
				EndUserMenu.setTitle("END USER MENU");
				EndUserMenu.setBounds(250, 120, 950, 700);
				EndUserMenu.getContentPane().setBackground(Color.BLACK);
				EndUserMenu.setResizable(false);
				EndUserMenu.getContentPane().setLayout(null);
				EndUserMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				EndUserMenu.setVisible(true);

				EndUserMTitle = new JLabel("~ Customer Menu ~");
				EndUserMTitle.setBounds(275, 50, 800, 50);
				EndUserMTitle.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
				EndUserMTitle.setForeground(Color.MAGENTA);
				EndUserMenu.getContentPane().add(EndUserMTitle);

				EndUserMOpt = new JLabel("Choose Option From Menu Below");
				EndUserMOpt.setBounds(275, 150, 400, 50);
				EndUserMOpt.setFont(new Font("Bell MT", Font.BOLD, 25));
				EndUserMOpt.setForeground(Color.WHITE);
				EndUserMenu.getContentPane().add(EndUserMOpt);

//Search Garments
				EndUserSOpt = new JLabel("Search Garment By:");
				EndUserSOpt.setBounds(60, 250, 200, 30);
				EndUserSOpt.setFont(new Font("Bell MT", Font.BOLD, 20));
				EndUserSOpt.setForeground(Color.ORANGE);
				EndUserMenu.getContentPane().add(EndUserSOpt);

				String[] SearchGarments = {"Product ID", "Product", "Color"};
				JComboBox PdtcomboBox = new JComboBox(SearchGarments);
				PdtcomboBox.setBounds(260, 250, 150, 30);
				PdtcomboBox.setBackground(Color.BLACK);
				PdtcomboBox.setFont(new Font("Bell MT", Font.BOLD, 20));
				PdtcomboBox.setForeground(Color.ORANGE);
				EndUserMenu.getContentPane().add(PdtcomboBox);

				BtnEndSrchGrmt = new JButton("Search");
				BtnEndSrchGrmt.setBounds(85, 300, 100, 30);
				BtnEndSrchGrmt.setBackground(Color.BLACK);
				BtnEndSrchGrmt.setFont(new Font("Gadugi", Font.BOLD, 20));
				BtnEndSrchGrmt.setForeground(Color.GREEN);
				BtnEndSrchGrmt.setFocusPainted(false);
				BtnEndSrchGrmt.setBorderPainted(false);
				BtnEndSrchGrmt.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) 
					{     

						int s1 = PdtcomboBox.getSelectedIndex();
						EndUserMenu.setVisible(false);

						Search = new JFrame();
						Search.setTitle("SEARCHED RESULTS");
						Search.setBounds(250, 120, 950 , 700);
						Search.getContentPane().setBackground(Color.BLACK);
						Search.setResizable(false);
						Search.getContentPane().setLayout(null);
						Search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						Search.setVisible(true);
//switch cases for search
						switch(s1)
						{

						case 0: //PRODUCT ID

							PdtID = new JLabel("~ Search By Product ID~");
							PdtID .setBounds(250, 50, 800, 50);
							PdtID .setFont(new Font("Lucida Calligraphy",Font.BOLD,35));
							PdtID .setForeground(Color.MAGENTA);
							Search.getContentPane().add(PdtID);

							InPdt = new JLabel("Product ID: ");
							InPdt.setBounds(340, 150, 150, 30);
							InPdt.setFont(new Font("Gadugi",Font.BOLD,20));
							InPdt.setForeground(Color.RED);
							Search.getContentPane().add(InPdt);

							IPInPdt = new JTextField(10);
							IPInPdt.setBounds(460, 150, 200, 30);
							IPInPdt.setEditable(true);
							IPInPdt.setBackground(Color.BLACK);
							IPInPdt.setFont(new Font("Gadugi",Font.PLAIN,22));
							IPInPdt.setForeground(Color.GREEN);
							Search.getContentPane().add(IPInPdt);

							panel = new JPanel();
							panel.setBounds(70, 230, 800, 350);
							Search.getContentPane().add(panel);

							DefaultTableModel tablePdt = new DefaultTableModel(20,10);
							table = new JTable(tablePdt);
							table.setBounds(30, 70, 880, 100);
							panel.add(table);

							table.setValueAt("Product_ID", 0, 0);
							table.setValueAt("Product", 0, 1);
							table.setValueAt("Color", 0, 2);
							table.setValueAt("Brand", 0, 3);
							table.setValueAt("Type", 0, 4);
							table.setValueAt("Store Code", 0, 5);
							table.setValueAt("Size", 0, 6);
							table.setValueAt("Price", 0, 7);
							table.setValueAt("Discount", 0, 8);
							table.setValueAt("Quantity", 0, 9);
							
							DefaultTableCellRenderer rend1 = new DefaultTableCellRenderer();
							rend1.setForeground(Color.BLUE);
							table.getColumnModel().getColumn(0).setCellRenderer(rend1);

							BtnPdtBack = new JButton("Back");
							BtnPdtBack.setBounds(420, 610, 100, 40);
							BtnPdtBack.setBackground(Color.RED);
							BtnPdtBack.setFont(new Font("Gadugi",Font.BOLD,20));
							BtnPdtBack.setForeground(Color.WHITE);
							BtnPdtBack.setFocusPainted(false);
							BtnPdtBack.setBorderPainted(false);
							BtnPdtBack.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{     
									Search.setVisible(false);
									EndUserMenu.setVisible(true);
								};
							});
							Search.getContentPane().add(BtnPdtBack);

							BtnPdtSrch = new JButton("Search");
							BtnPdtSrch.setBounds(420, 185, 100, 40);
							BtnPdtSrch.setBackground(Color.BLACK);
							BtnPdtSrch.setFont(new Font("Gadugi",Font.BOLD,20));
							BtnPdtSrch.setForeground(Color.RED);
							BtnPdtSrch.setFocusPainted(false);
							BtnPdtSrch.setBorderPainted(false);
							BtnPdtSrch.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{     
									LLNode<String>currentPdt=reference;
									int j=2;
									int i=0;
									int flag=0;
									while(currentPdt!=null) 
									{
										if(IPInPdt.getText().equalsIgnoreCase(currentPdt.getProduct_ID()))
										{	
											flag=1;
											table.setValueAt(currentPdt.getProduct_ID(), j, i);
											table.setValueAt(currentPdt.getProduct(), j, i+1);
											table.setValueAt(currentPdt.getColor() , j, i+2);
											table.setValueAt(currentPdt.getBrand(), j, i+3);
											table.setValueAt(currentPdt.getType(), j, i+4);
											table.setValueAt(currentPdt.getStoreCode(), j, i+5);
											table.setValueAt(currentPdt.getSize() , j, i+6);
											table.setValueAt(currentPdt.getPrice(), j, i+7);
											table.setValueAt(currentPdt.getDiscount(), j, i+8);
											table.setValueAt(currentPdt.getQuantity() , j, i+9);
											j=j+1;
										}
										currentPdt=currentPdt.getLink();
									}
									if(flag==0)
									{
										JOptionPane.showConfirmDialog(null,"Product Not Found! \n",
												"ERROR MESSAGE",JOptionPane.PLAIN_MESSAGE);
									}
								};
							});
							Search.getContentPane().add(BtnPdtSrch);
							break;

						case 1: //PRODUCT NAME

							PdtName = new JLabel("~ Search By Product Name~");
							PdtName.setBounds(230, 50, 800, 50);
							PdtName.setFont(new Font("Lucida Calligraphy",Font.BOLD,35));
							PdtName.setForeground(Color.MAGENTA);
							Search.getContentPane().add(PdtName);

							InPdtName = new JLabel("Product Name: ");
							InPdtName.setBounds(340, 150, 200, 30);
							InPdtName.setFont(new Font("Gadugi",Font.BOLD,20));
							InPdtName.setForeground(Color.RED);
							Search.getContentPane().add(InPdtName);

							IPInPdtName = new JTextField(10);
							IPInPdtName.setBounds(500, 150, 200, 30);
							IPInPdtName.setEditable(true);
							IPInPdtName.setBackground(Color.BLACK);
							IPInPdtName.setFont(new Font("Gadugi",Font.PLAIN,22));
							IPInPdtName.setForeground(Color.GREEN);
							Search.getContentPane().add(IPInPdtName);

							panel = new JPanel();
							panel.setBounds(70, 230, 800, 350);
							Search.getContentPane().add(panel);

							DefaultTableModel tablePdtName = new DefaultTableModel(20,10);
							table = new JTable(tablePdtName);
							table.setBounds(30, 70, 880, 100);
							panel.add(table);

							table.setValueAt("Product_ID", 0, 0);
							table.setValueAt("Product", 0, 1);
							table.setValueAt("Color", 0, 2);
							table.setValueAt("Brand", 0, 3);
							table.setValueAt("Type", 0, 4);
							table.setValueAt("Store Code", 0, 5);
							table.setValueAt("Size", 0, 6);
							table.setValueAt("Price", 0, 7);
							table.setValueAt("Discount", 0, 8);
							table.setValueAt("Quantity", 0, 9);
							
							DefaultTableCellRenderer rend2 = new DefaultTableCellRenderer();
							rend2.setForeground(Color.BLUE);
							table.getColumnModel().getColumn(1).setCellRenderer(rend2);

							BtnPdtNameBack = new JButton("Back");
							BtnPdtNameBack.setBounds(420, 610, 100, 40);
							BtnPdtNameBack.setBackground(Color.RED);
							BtnPdtNameBack.setFont(new Font("Gadugi",Font.BOLD,20));
							BtnPdtNameBack.setForeground(Color.WHITE);
							BtnPdtNameBack.setFocusPainted(false);
							BtnPdtNameBack.setBorderPainted(false);
							BtnPdtNameBack.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{     
									Search.setVisible(false);
									EndUserMenu.setVisible(true);
								};
							});
							Search.getContentPane().add(BtnPdtNameBack);

							BtnPdtNameSrch = new JButton("Search");
							BtnPdtNameSrch.setBounds(420, 185, 100, 40);
							BtnPdtNameSrch.setBackground(Color.BLACK);
							BtnPdtNameSrch.setFont(new Font("Gadugi",Font.BOLD,20));
							BtnPdtNameSrch.setForeground(Color.RED);
							BtnPdtNameSrch.setFocusPainted(false);
							BtnPdtNameSrch.setBorderPainted(false);
							BtnPdtNameSrch.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{     
									LLNode<String>currentPdtName=reference;
									int j=2;
									int i=0;
									int flag=0;
									while(currentPdtName!=null) 
									{
										if(IPInPdtName.getText().equalsIgnoreCase(currentPdtName.getProduct()))
										{	
											flag=1;
											table.setValueAt(currentPdtName.getProduct_ID(), j, i);
											table.setValueAt(currentPdtName.getProduct(), j, i+1);
											table.setValueAt(currentPdtName.getColor() , j, i+2);
											table.setValueAt(currentPdtName.getBrand(), j, i+3);
											table.setValueAt(currentPdtName.getType(), j, i+4);
											table.setValueAt(currentPdtName.getStoreCode(), j, i+5);
											table.setValueAt(currentPdtName.getSize() , j, i+6);
											table.setValueAt(currentPdtName.getPrice(), j, i+7);
											table.setValueAt(currentPdtName.getDiscount(), j, i+8);
											table.setValueAt(currentPdtName.getQuantity() , j, i+9);
											j=j+1;
										}
										currentPdtName=currentPdtName.getLink();
									}
									if(flag==0)
									{
										JOptionPane.showConfirmDialog(null,"Product Not Found! \n",
												"ERROR MESSAGE",JOptionPane.PLAIN_MESSAGE);
									}
								};
							});
							Search.getContentPane().add(BtnPdtNameSrch);
							break;

						case 2: //COLOR

							PdtColor = new JLabel("~ Search By Color ~");
							PdtColor.setBounds(250, 50, 800, 50);
							PdtColor.setFont(new Font("Lucida Calligraphy",Font.BOLD,35));
							PdtColor.setForeground(Color.MAGENTA);
							Search.getContentPane().add(PdtColor);

							InPdtColor = new JLabel("Color: ");
							InPdtColor.setBounds(340, 150, 100, 30);
							InPdtColor.setFont(new Font("Gadugi",Font.BOLD,20));
							InPdtColor.setForeground(Color.RED);
							Search.getContentPane().add(InPdtColor);

							IPInPdtColor = new JTextField(10);
							IPInPdtColor.setBounds(420, 150, 200, 30);
							IPInPdtColor.setEditable(true);
							IPInPdtColor.setBackground(Color.BLACK);
							IPInPdtColor.setFont(new Font("Gadugi",Font.PLAIN,22));
							IPInPdtColor.setForeground(Color.GREEN);
							Search.getContentPane().add(IPInPdtColor);

							panel = new JPanel();
							panel.setBounds(70, 250, 800, 350);
							Search.getContentPane().add(panel);

							DefaultTableModel tablePdtColor = new DefaultTableModel(20,10);
							table = new JTable(tablePdtColor);
							table.setBounds(30, 70, 880, 100);
							panel.add(table);

							table.setValueAt("Product_ID", 0, 0);
							table.setValueAt("Product", 0, 1);
							table.setValueAt("Color", 0, 2);
							table.setValueAt("Brand", 0, 3);
							table.setValueAt("Type", 0, 4);
							table.setValueAt("Store Code", 0, 5);
							table.setValueAt("Size", 0, 6);
							table.setValueAt("Price", 0, 7);
							table.setValueAt("Discount", 0, 8);
							table.setValueAt("Quantity", 0, 9);
							
							DefaultTableCellRenderer rend3 = new DefaultTableCellRenderer();
							rend3.setForeground(Color.BLUE);
							table.getColumnModel().getColumn(2).setCellRenderer(rend3);

							BtnPdtColorBack = new JButton("Back");
							BtnPdtColorBack.setBounds(420, 610, 100, 40);
							BtnPdtColorBack.setBackground(Color.RED);
							BtnPdtColorBack.setFont(new Font("Gadugi",Font.BOLD,20));
							BtnPdtColorBack.setForeground(Color.WHITE);
							BtnPdtColorBack.setFocusPainted(false);
							BtnPdtColorBack.setBorderPainted(false);
							BtnPdtColorBack.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{     
									Search.setVisible(false);
									EndUserMenu.setVisible(true);
								};
							});
							Search.getContentPane().add(BtnPdtColorBack);

							BtnPdtColorSrch = new JButton("Search");
							BtnPdtColorSrch.setBounds(420, 185, 100, 40);
							BtnPdtColorSrch.setBackground(Color.BLACK);
							BtnPdtColorSrch.setFont(new Font("Gadugi",Font.BOLD,20));
							BtnPdtColorSrch.setForeground(Color.RED);
							BtnPdtColorSrch.setFocusPainted(false);
							BtnPdtColorSrch.setBorderPainted(false);
							BtnPdtColorSrch.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{     
									LLNode<String>currentColor=reference;
									int j=2;
									int i=0;
									int flag=0;
									while(currentColor!=null) 
									{
										if(currentColor.getColor().equalsIgnoreCase(IPInPdtColor.getText()))
										{	
											flag=1;
											table.setValueAt(currentColor.getProduct_ID(), j, i);
											table.setValueAt(currentColor.getProduct(), j, i+1);
											table.setValueAt(currentColor.getColor() , j, i+2);
											table.setValueAt(currentColor.getBrand(), j, i+3);
											table.setValueAt(currentColor.getType(), j, i+4);
											table.setValueAt(currentColor.getStoreCode(), j, i+5);
											table.setValueAt(currentColor.getSize() , j, i+6);
											table.setValueAt(currentColor.getPrice(), j, i+7);
											table.setValueAt(currentColor.getDiscount(), j, i+8);
											table.setValueAt(currentColor.getQuantity() , j, i+9);
											j=j+1;
										}
										currentColor=currentColor.getLink();
									}
									
									if(flag==0)
									{
										JOptionPane.showConfirmDialog(null,"Color Not Found! \n",
												"ERROR MESSAGE",JOptionPane.PLAIN_MESSAGE);
									}
								};
							});
							Search.getContentPane().add(BtnPdtColorSrch);
							break;
						}
					};
				});
				EndUserMenu.getContentPane().add(BtnEndSrchGrmt);

//Display
				EndUserDOpt = new JLabel("Display Garment By:");
				EndUserDOpt.setBounds(350, 400, 200, 30);
				EndUserDOpt.setFont(new Font("Bell MT", Font.BOLD, 20));
				EndUserDOpt.setForeground(Color.ORANGE);
				EndUserMenu.getContentPane().add(EndUserDOpt);

				String[] DisplayGarments = {"Inventory", "Brand", "Type", "Store"};
				JComboBox displaycomboBox = new JComboBox(DisplayGarments);
				displaycomboBox.setBounds(550, 400, 150, 30);
				displaycomboBox.setBackground(Color.BLACK);
				displaycomboBox.setFont(new Font("Bell MT", Font.BOLD, 20));
				displaycomboBox.setForeground(Color.ORANGE);
				EndUserMenu.getContentPane().add(displaycomboBox);

				BtnEndDEI = new JButton("Search");
				BtnEndDEI.setBounds(385, 450, 100, 30);
				BtnEndDEI.setBackground(Color.BLACK);
				BtnEndDEI.setFont(new Font("Gadugi", Font.BOLD, 20));
				BtnEndDEI.setForeground(Color.GREEN);
				BtnEndDEI.setFocusPainted(false);
				BtnEndDEI.setBorderPainted(false);
				BtnEndDEI.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int s = displaycomboBox.getSelectedIndex();

						EndUserMenu.setVisible(false);

						Display = new JFrame();
						Display.setTitle("SEARCHED RESULTS");
						Display.setBounds(250, 120, 950, 700);
						Display.getContentPane().setBackground(Color.BLACK);
						Display.setResizable(false);
						Display.getContentPane().setLayout(null);
						Display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						Display.setVisible(true);
//switch cases for display
						switch (s) {
						case 0: //Display Entire Inventory
							System.out.println("Start");
							DisplayInv = new JLabel("~ Display Entire Inventory ~");
							DisplayInv.setBounds(180, 50, 800, 50);
							DisplayInv.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
							DisplayInv.setForeground(Color.MAGENTA);
							Display.getContentPane().add(DisplayInv);

							panel = new JPanel();
							panel.setBounds(70, 150, 800, 350);
							Display.getContentPane().add(panel);

							DefaultTableModel tableModel = new DefaultTableModel(20, 10);
							table = new JTable(tableModel);
							table.setBounds(30, 70, 880, 100);
							panel.add(table);

							table.setValueAt("Product_ID", 0, 0);
							table.setValueAt("Product", 0, 1);
							table.setValueAt("Color", 0, 2);
							table.setValueAt("Brand", 0, 3);
							table.setValueAt("Type", 0, 4);
							table.setValueAt("Store Code", 0, 5);
							table.setValueAt("Size", 0, 6);
							table.setValueAt("Price", 0, 7);
							table.setValueAt("Discount", 0, 8);
							table.setValueAt("Quantity", 0, 9);


							LLNode<String> current = reference;
							int j = 2;
							int i = 0;
							while (current != null) {
								table.setValueAt(current.getProduct_ID(), j, i);
								table.setValueAt(current.getProduct(), j, i + 1);
								table.setValueAt(current.getColor(), j, i + 2);
								table.setValueAt(current.getBrand(), j, i + 3);
								table.setValueAt(current.getType(), j, i + 4);
								table.setValueAt(current.getStoreCode(), j, i + 5);
								table.setValueAt(current.getSize(), j, i + 6);
								table.setValueAt(current.getPrice(), j, i + 7);
								table.setValueAt(current.getDiscount(), j, i + 8);
								table.setValueAt(current.getQuantity(), j, i + 9);
								j = j + 1;
								current = current.getLink();
							}

							BtnEIBack = new JButton("Back");
							BtnEIBack.setBounds(400, 550, 175, 50);
							BtnEIBack.setBackground(Color.RED);
							BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
							BtnEIBack.setForeground(Color.WHITE);
							BtnEIBack.setFocusPainted(false);
							BtnEIBack.setBorderPainted(false);
							BtnEIBack.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									Display.setVisible(false);
									EndUserMenu.setVisible(true);
								}
							});
							Display.getContentPane().add(BtnEIBack);

							break;

						case 1: //Display By Brand

							DisplayBrand = new JLabel("~ Display By Brand ~");
							DisplayBrand.setBounds(250, 50, 800, 50);
							DisplayBrand.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
							DisplayBrand.setForeground(Color.MAGENTA);
							Display.getContentPane().add(DisplayBrand);

							InBrand = new JLabel("Brand: ");
							InBrand.setBounds(340, 150, 100, 30);
							InBrand.setFont(new Font("Gadugi", Font.BOLD, 20));
							InBrand.setForeground(Color.RED);
							Display.getContentPane().add(InBrand);

							IPInBrand = new JTextField(10);
							IPInBrand.setBounds(420, 150, 200, 30);
							IPInBrand.setEditable(true);
							IPInBrand.setBackground(Color.BLACK);
							IPInBrand.setFont(new Font("Gadugi", Font.PLAIN, 22));
							IPInBrand.setForeground(Color.GREEN);
							Display.getContentPane().add(IPInBrand);

							panel = new JPanel();
							panel.setBounds(70, 250, 800, 350);
							Display.getContentPane().add(panel);

							DefaultTableModel tableBrand = new DefaultTableModel(20, 10);
							table = new JTable(tableBrand);
							table.setBounds(30, 70, 880, 100);
							panel.add(table);

							table.setValueAt("Product_ID", 0, 0);
							table.setValueAt("Product", 0, 1);
							table.setValueAt("Color", 0, 2);
							table.setValueAt("Brand", 0, 3);
							table.setValueAt("Type", 0, 4);
							table.setValueAt("Store Code", 0, 5);
							table.setValueAt("Size", 0, 6);
							table.setValueAt("Price", 0, 7);
							table.setValueAt("Discount", 0, 8);
							table.setValueAt("Quantity", 0, 9);


							BtnBrandBack = new JButton("Back");
							BtnBrandBack.setBounds(420, 610, 100, 40);
							BtnBrandBack.setBackground(Color.RED);
							BtnBrandBack.setFont(new Font("Gadugi",Font.BOLD,20));
							BtnBrandBack.setForeground(Color.WHITE);
							BtnBrandBack.setFocusPainted(false);
							BtnBrandBack.setBorderPainted(false);
							BtnBrandBack.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{     
									Display.setVisible(false);
									EndUserMenu.setVisible(true);
								};
							});
							Display.getContentPane().add(BtnBrandBack);

							DefaultTableCellRenderer render5 = new DefaultTableCellRenderer();
							render5.setForeground(Color.BLUE);
							table.getColumnModel().getColumn(3).setCellRenderer(render5);

							BtnBrandSrch = new JButton("Search");
							BtnBrandSrch.setBounds(420, 185, 100, 40);
							BtnBrandSrch.setBackground(Color.BLACK);
							BtnBrandSrch.setFont(new Font("Gadugi",Font.BOLD,20));
							BtnBrandSrch.setForeground(Color.RED);
							BtnBrandSrch.setFocusPainted(false);
							BtnBrandSrch.setBorderPainted(false);
							BtnBrandSrch.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{     
									LLNode<String>currentBrand=reference;
									int j=2;
									int i=0;
									int flag=0;
									while(currentBrand!=null) 
									{
										if(IPInBrand.getText().equalsIgnoreCase(currentBrand.getBrand()))
										{	
											flag=1;
											table.setValueAt(currentBrand.getProduct_ID(), j, i);
											table.setValueAt(currentBrand.getProduct(), j, i+1);
											table.setValueAt(currentBrand.getColor() , j, i+2);
											table.setValueAt(currentBrand.getBrand(), j, i+3);
											table.setValueAt(currentBrand.getType(), j, i+4);
											table.setValueAt(currentBrand.getStoreCode(), j, i+5);
											table.setValueAt(currentBrand.getSize() , j, i+6);
											table.setValueAt(currentBrand.getPrice(), j, i+7);
											table.setValueAt(currentBrand.getDiscount(), j, i+8);
											table.setValueAt(currentBrand.getQuantity() , j, i+9);
											j=j+1;
										}
										currentBrand=currentBrand.getLink();
									}
									if(flag==0)
									{
										JOptionPane.showConfirmDialog(null,"Brand Not Found! \n Please Enter From Available Brands",
												"ERROR MESSAGE",JOptionPane.PLAIN_MESSAGE);
									}
								};
							});
							Display.getContentPane().add(BtnBrandSrch);
							break;

						case 2: //Display By Type

							DisplayType = new JLabel("~ Display By Type ~");
							DisplayType.setBounds(250, 50, 800, 50);
							DisplayType.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
							DisplayType.setForeground(Color.MAGENTA);
							Display.getContentPane().add(DisplayType);

							InType = new JLabel("Type: ");
							InType.setBounds(340, 150, 100, 30);
							InType.setFont(new Font("Gadugi", Font.BOLD, 20));
							InType.setForeground(Color.RED);
							Display.getContentPane().add(InType);

							IPInType = new JTextField(10);
							IPInType.setBounds(420, 150, 200, 30);
							IPInType.setEditable(true);
							IPInType.setBackground(Color.BLACK);
							IPInType.setFont(new Font("Gadugi", Font.PLAIN, 22));
							IPInType.setForeground(Color.GREEN);
							Display.getContentPane().add(IPInType);

							panel = new JPanel();
							panel.setBounds(70, 250, 800, 350);
							Display.getContentPane().add(panel);

							DefaultTableModel tableType = new DefaultTableModel(20, 10);
							table = new JTable(tableType);
							table.setBounds(30, 70, 880, 100);
							panel.add(table);

							table.setValueAt("Product_ID", 0, 0);
							table.setValueAt("Product", 0, 1);
							table.setValueAt("Color", 0, 2);
							table.setValueAt("Brand", 0, 3);
							table.setValueAt("Type", 0, 4);
							table.setValueAt("Store Code", 0, 5);
							table.setValueAt("Size", 0, 6);
							table.setValueAt("Price", 0, 7);
							table.setValueAt("Discount", 0, 8);
							table.setValueAt("Quantity", 0, 9);


							BtnTypeBack = new JButton("Back");
							BtnTypeBack.setBounds(420, 610, 100, 40);
							BtnTypeBack.setBackground(Color.RED);
							BtnTypeBack.setFont(new Font("Gadugi",Font.BOLD,20));
							BtnTypeBack.setForeground(Color.WHITE);
							BtnTypeBack.setFocusPainted(false);
							BtnTypeBack.setBorderPainted(false);
							BtnTypeBack.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{     
									Display.setVisible(false);
									EndUserMenu.setVisible(true);
								};
							});
							Display.getContentPane().add(BtnTypeBack);

							DefaultTableCellRenderer render6 = new DefaultTableCellRenderer();
							render6.setForeground(Color.BLUE);
							table.getColumnModel().getColumn(4).setCellRenderer(render6);

							BtnTypeSrch = new JButton("Search");
							BtnTypeSrch.setBounds(420, 185, 100, 40);
							BtnTypeSrch.setBackground(Color.BLACK);
							BtnTypeSrch.setFont(new Font("Gadugi",Font.BOLD,20));
							BtnTypeSrch.setForeground(Color.RED);
							BtnTypeSrch.setFocusPainted(false);
							BtnTypeSrch.setBorderPainted(false);
							BtnTypeSrch.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{     
									LLNode<String>currentBrand=reference;
									int j=2;
									int i=0;
									int flag=0;
									while(currentBrand!=null) 
									{	
										if(IPInType.getText().equalsIgnoreCase(currentBrand.getType()))
										{	
											flag=1;
											table.setValueAt(currentBrand.getProduct_ID(), j, i);
											table.setValueAt(currentBrand.getProduct(), j, i+1);
											table.setValueAt(currentBrand.getColor() , j, i+2);
											table.setValueAt(currentBrand.getBrand(), j, i+3);
											table.setValueAt(currentBrand.getType(), j, i+4);
											table.setValueAt(currentBrand.getStoreCode(), j, i+5);
											table.setValueAt(currentBrand.getSize() , j, i+6);
											table.setValueAt(currentBrand.getPrice(), j, i+7);
											table.setValueAt(currentBrand.getDiscount(), j, i+8);
											table.setValueAt(currentBrand.getQuantity() , j, i+9);
											j=j+1;
										}
										currentBrand=currentBrand.getLink();
									}
									if(flag==0)
									{
										JOptionPane.showConfirmDialog(null,"Brand Not Found! \n Please Enter From Available Brands",
												"ERROR MESSAGE",JOptionPane.PLAIN_MESSAGE);
									}
								};
							});
							Display.getContentPane().add(BtnTypeSrch);
							break;

						case 3: //Display By Store Code

							DisplayStore = new JLabel("~ Display By Store Code ~");
							DisplayStore.setBounds(225, 50, 800, 50);
							DisplayStore.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
							DisplayStore.setForeground(Color.MAGENTA);
							Display.getContentPane().add(DisplayStore);

							InStore = new JLabel("Store Code: ");
							InStore.setBounds(325, 150, 150, 30);
							InStore.setFont(new Font("Gadugi", Font.BOLD, 20));
							InStore.setForeground(Color.RED);
							Display.getContentPane().add(InStore);

							IPInType = new JTextField(10);
							IPInType.setBounds(440, 150, 200, 30);
							IPInType.setEditable(true);
							IPInType.setBackground(Color.BLACK);
							IPInType.setFont(new Font("Gadugi", Font.PLAIN, 22));
							IPInType.setForeground(Color.GREEN);
							Display.getContentPane().add(IPInType);

							panel = new JPanel();
							panel.setBounds(70, 250, 800, 350);
							Display.getContentPane().add(panel);

							DefaultTableModel tableStore = new DefaultTableModel(20, 10);
							table = new JTable(tableStore);
							table.setBounds(30, 70, 880, 100);
							panel.add(table);

							table.setValueAt("Product_ID", 0, 0);
							table.setValueAt("Product", 0, 1);
							table.setValueAt("Color", 0, 2);
							table.setValueAt("Brand", 0, 3);
							table.setValueAt("Type", 0, 4);
							table.setValueAt("Store Code", 0, 5);
							table.setValueAt("Size", 0, 6);
							table.setValueAt("Price", 0, 7);
							table.setValueAt("Discount", 0, 8);
							table.setValueAt("Quantity", 0, 9);


							BtnTypeBack = new JButton("Back");
							BtnTypeBack.setBounds(420, 610, 100, 40);
							BtnTypeBack.setBackground(Color.RED);
							BtnTypeBack.setFont(new Font("Gadugi",Font.BOLD,20));
							BtnTypeBack.setForeground(Color.WHITE);
							BtnTypeBack.setFocusPainted(false);
							BtnTypeBack.setBorderPainted(false);
							BtnTypeBack.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{     
									Display.setVisible(false);
									EndUserMenu.setVisible(true);
								};
							});
							Display.getContentPane().add(BtnTypeBack);

							DefaultTableCellRenderer render7 = new DefaultTableCellRenderer();
							render7.setForeground(Color.BLUE);
							table.getColumnModel().getColumn(5).setCellRenderer(render7);

							BtnTypeSrch = new JButton("Search");
							BtnTypeSrch.setBounds(420, 185, 100, 40);
							BtnTypeSrch.setBackground(Color.BLACK);
							BtnTypeSrch.setFont(new Font("Gadugi",Font.BOLD,20));
							BtnTypeSrch.setForeground(Color.RED);
							BtnTypeSrch.setFocusPainted(false);
							BtnTypeSrch.setBorderPainted(false);
							BtnTypeSrch.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{     
									LLNode<String>currentBrand=reference;
									int j=2;
									int i=0;
									int flag=0;
									while(currentBrand!=null) 
									{	
										if(IPInType.getText().equals(currentBrand.getStoreCode()))
										{	
											flag=1;
											table.setValueAt(currentBrand.getProduct_ID(), j, i);
											table.setValueAt(currentBrand.getProduct(), j, i+1);
											table.setValueAt(currentBrand.getColor() , j, i+2);
											table.setValueAt(currentBrand.getBrand(), j, i+3);
											table.setValueAt(currentBrand.getType(), j, i+4);
											table.setValueAt(currentBrand.getStoreCode(), j, i+5);
											table.setValueAt(currentBrand.getSize() , j, i+6);
											table.setValueAt(currentBrand.getPrice(), j, i+7);
											table.setValueAt(currentBrand.getDiscount(), j, i+8);
											table.setValueAt(currentBrand.getQuantity() , j, i+9);
											j=j+1;
										}
										currentBrand=currentBrand.getLink();
									}
									if(flag==0)
									{
										JOptionPane.showConfirmDialog(null,"Store Code is Not Found! \n Please Enter From Available Store Code",
												"ERROR MESSAGE",JOptionPane.PLAIN_MESSAGE);
									}
								};
							});
							Display.getContentPane().add(BtnTypeSrch);
							break;
						}
					};
				});
				EndUserMenu.getContentPane().add(BtnEndDEI);

//List Garments
				EndUserLOpt = new JLabel("List Garment By:");
				EndUserLOpt.setBounds(540, 250, 200, 30);
				EndUserLOpt.setFont(new Font("Bell MT", Font.BOLD, 20));
				EndUserLOpt.setForeground(Color.ORANGE);
				EndUserMenu.getContentPane().add(EndUserLOpt);

				String[] ListGarments = {"Price", "Size", "Availabilty", "Discount"};
				JComboBox listcomboBox = new JComboBox(ListGarments);
				listcomboBox.setBounds(740, 250, 150, 30);
				listcomboBox.setBackground(Color.BLACK);
				listcomboBox.setFont(new Font("Bell MT", Font.BOLD, 20));
				listcomboBox.setForeground(Color.ORANGE);
				EndUserMenu.getContentPane().add(listcomboBox);

				BtnEndListGrmt = new JButton("Search");
				BtnEndListGrmt.setBounds(565, 300, 100, 30);
				BtnEndListGrmt.setBackground(Color.BLACK);
				BtnEndListGrmt.setFont(new Font("Gadugi", Font.BOLD, 20));
				BtnEndListGrmt.setForeground(Color.GREEN);
				BtnEndListGrmt.setFocusPainted(false);
				BtnEndListGrmt.setBorderPainted(false);
				EndUserMenu.getContentPane().add(BtnEndListGrmt);

				BtnEndListGrmt.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int s = listcomboBox.getSelectedIndex();

						EndUserMenu.setVisible(false);

						Display = new JFrame();
						Display.setTitle("SEARCHED RESULTS");
						Display.setBounds(250, 120, 950, 700);
						Display.getContentPane().setBackground(Color.BLACK);
						Display.setResizable(false);
						Display.getContentPane().setLayout(null);
						Display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						Display.setVisible(true);
//switch cases for list
						switch (s) {
						case 0: //List inventory by price

							ListByPrice = new JLabel("~ Products Sorted By Price ~");
							ListByPrice.setBounds(180, 50, 800, 50);
							ListByPrice.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
							ListByPrice.setForeground(Color.MAGENTA);
							Display.getContentPane().add(ListByPrice);

							panel = new JPanel();
							panel.setBounds(70, 150, 800, 350);
							Display.getContentPane().add(panel);

							DefaultTableModel tableModel = new DefaultTableModel(20, 10);
							table = new JTable(tableModel);
							table.setBounds(30, 70, 880, 100);
							panel.add(table);

							table.setValueAt("Product_ID", 0, 0);
							table.setValueAt("Product", 0, 1);
							table.setValueAt("Color", 0, 2);
							table.setValueAt("Brand", 0, 3);
							table.setValueAt("Type", 0, 4);
							table.setValueAt("Store Code", 0, 5);
							table.setValueAt("Size", 0, 6);
							table.setValueAt("Price", 0, 7);
							table.setValueAt("Discount", 0, 8);
							table.setValueAt("Quantity", 0, 9);

							DefaultTableCellRenderer render1 = new DefaultTableCellRenderer();
							render1.setForeground(Color.BLUE);
							table.getColumnModel().getColumn(7).setCellRenderer(render1);

							new LLNode_Function().listByPrice(list);
							LLNode<String> current = list;
							int j = 2;
							int i = 0;
							while (current != null) {
								table.setValueAt(current.getProduct_ID(), j, i);
								table.setValueAt(current.getProduct(), j, i + 1);
								table.setValueAt(current.getColor(), j, i + 2);
								table.setValueAt(current.getBrand(), j, i + 3);
								table.setValueAt(current.getType(), j, i + 4);
								table.setValueAt(current.getStoreCode(), j, i + 5);
								table.setValueAt(current.getSize(), j, i + 6);
								table.setValueAt(current.getPrice(), j, i + 7);
								table.setValueAt(current.getDiscount(), j, i + 8);
								table.setValueAt(current.getQuantity(), j, i + 9);
								j = j + 1;
								current = current.getLink();
							}

							BtnEIBack = new JButton("Back");
							BtnEIBack.setBounds(400, 550, 175, 50);
							BtnEIBack.setBackground(Color.RED);
							BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
							BtnEIBack.setForeground(Color.WHITE);
							BtnEIBack.setFocusPainted(false);
							BtnEIBack.setBorderPainted(false);
							BtnEIBack.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									Display.setVisible(false);
									EndUserMenu.setVisible(true);
								}
							});
							Display.getContentPane().add(BtnEIBack);
							break;

						case 1: //List Inventory by size
							ListBySize = new JLabel("~ Products Sorted By Size ~");
							ListBySize.setBounds(180, 50, 800, 50);
							ListBySize.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
							ListBySize.setForeground(Color.MAGENTA);
							Display.getContentPane().add(ListBySize);

							panel = new JPanel();
							panel.setBounds(70, 150, 800, 350);
							Display.getContentPane().add(panel);

							DefaultTableModel tableBrand = new DefaultTableModel(20, 10);
							table = new JTable(tableBrand);
							table.setBounds(30, 70, 880, 100);
							panel.add(table);

							table.setValueAt("Product_ID", 0, 0);
							table.setValueAt("Product", 0, 1);
							table.setValueAt("Color", 0, 2);
							table.setValueAt("Brand", 0, 3);
							table.setValueAt("Type", 0, 4);
							table.setValueAt("Store Code", 0, 5);
							table.setValueAt("Size", 0, 6);
							table.setValueAt("Price", 0, 7);
							table.setValueAt("Discount", 0, 8);
							table.setValueAt("Quantity", 0, 9);

							DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
							render2.setForeground(Color.BLUE);
							table.getColumnModel().getColumn(6).setCellRenderer(render2);

							new LLNode_Function().listBySize(list);
							LLNode<String> current1 = list;
							int j1 = 2;
							int i1 = 0;
							while (current1 != null) {
								table.setValueAt(current1.getProduct_ID(), j1, i1);
								table.setValueAt(current1.getProduct(), j1, i1 + 1);
								table.setValueAt(current1.getColor(), j1, i1 + 2);
								table.setValueAt(current1.getBrand(), j1, i1 + 3);
								table.setValueAt(current1.getType(), j1, i1 + 4);
								table.setValueAt(current1.getStoreCode(), j1, i1 + 5);
								table.setValueAt(current1.getSize(), j1, i1 + 6);
								table.setValueAt(current1.getPrice(), j1, i1 + 7);
								table.setValueAt(current1.getDiscount(), j1, i1 + 8);
								table.setValueAt(current1.getQuantity(), j1, i1 + 9);
								j1 = j1 + 1;
								current1 = current1.getLink();
							}

							BtnEIBack = new JButton("Back");
							BtnEIBack.setBounds(400, 550, 175, 50);
							BtnEIBack.setBackground(Color.RED);
							BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
							BtnEIBack.setForeground(Color.WHITE);
							BtnEIBack.setFocusPainted(false);
							BtnEIBack.setBorderPainted(false);
							BtnEIBack.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									Display.setVisible(false);
									EndUserMenu.setVisible(true);
								}
							});
							Display.getContentPane().add(BtnEIBack);
							break;

						case 2: //List Inventory by availability
							ListByAvailability = new JLabel("~ Products Currently Available ~");
							ListByAvailability.setBounds(120, 50, 800, 50);
							ListByAvailability.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
							ListByAvailability.setForeground(Color.MAGENTA);
							Display.getContentPane().add(ListByAvailability);

							panel = new JPanel();
							panel.setBounds(70, 150, 800, 350);
							Display.getContentPane().add(panel);

							DefaultTableModel tableAvailability = new DefaultTableModel(20, 10);
							table = new JTable(tableAvailability);
							table.setBounds(30, 70, 880, 100);
							panel.add(table);

							table.setValueAt("Product_ID", 0, 0);
							table.setValueAt("Product", 0, 1);
							table.setValueAt("Color", 0, 2);
							table.setValueAt("Brand", 0, 3);
							table.setValueAt("Type", 0, 4);
							table.setValueAt("Store Code", 0, 5);
							table.setValueAt("Size", 0, 6);
							table.setValueAt("Price", 0, 7);
							table.setValueAt("Discount", 0, 8);
							table.setValueAt("Quantity", 0, 9);

							DefaultTableCellRenderer render3 = new DefaultTableCellRenderer();
							render3.setForeground(Color.BLUE);
							table.getColumnModel().getColumn(9).setCellRenderer(render3);

							new LLNode_Function().listByAvailability(list);
							LLNode<String> current2 = list;
							int j2 = 2;
							int i2 = 0;
							while (current2 != null) {
								if(current2.getQuantity()>0) {
									table.setValueAt(current2.getProduct_ID(), j2, i2);
									table.setValueAt(current2.getProduct(), j2, i2 + 1);
									table.setValueAt(current2.getColor(), j2, i2 + 2);
									table.setValueAt(current2.getBrand(), j2, i2 + 3);
									table.setValueAt(current2.getType(), j2, i2 + 4);
									table.setValueAt(current2.getStoreCode(), j2, i2 + 5);
									table.setValueAt(current2.getSize(), j2, i2 + 6);
									table.setValueAt(current2.getPrice(), j2, i2 + 7);
									table.setValueAt(current2.getDiscount(), j2, i2 + 8);
									table.setValueAt(current2.getQuantity(), j2, i2 + 9);
									j2 = j2 + 1;
								}

								current2 = current2.getLink();
							}

							BtnEIBack = new JButton("Back");
							BtnEIBack.setBounds(400, 550, 175, 50);
							BtnEIBack.setBackground(Color.RED);
							BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
							BtnEIBack.setForeground(Color.WHITE);
							BtnEIBack.setFocusPainted(false);
							BtnEIBack.setBorderPainted(false);
							BtnEIBack.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									Display.setVisible(false);
									EndUserMenu.setVisible(true);
								}
							});
							Display.getContentPane().add(BtnEIBack);
							break;

						case 3: //List inventory by discount

							ListByDiscount = new JLabel("~ Products Currently On Discount ~");
							ListByDiscount.setBounds(140, 50, 800, 50);
							ListByDiscount.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
							ListByDiscount.setForeground(Color.MAGENTA);
							Display.getContentPane().add(ListByDiscount);

							panel = new JPanel();
							panel.setBounds(70, 150, 800, 350);
							Display.getContentPane().add(panel);

							DefaultTableModel tableDiscount = new DefaultTableModel(20, 10);
							table = new JTable(tableDiscount);
							table.setBounds(30, 70, 880, 100);
							panel.add(table);

							table.setValueAt("Product_ID", 0, 0);
							table.setValueAt("Product", 0, 1);
							table.setValueAt("Color", 0, 2);
							table.setValueAt("Brand", 0, 3);
							table.setValueAt("Type", 0, 4);
							table.setValueAt("Store Code", 0, 5);
							table.setValueAt("Size", 0, 6);
							table.setValueAt("Price", 0, 7);
							table.setValueAt("Discount", 0, 8);
							table.setValueAt("Quantity", 0, 9);

							DefaultTableCellRenderer render4 = new DefaultTableCellRenderer();
							render4.setForeground(Color.BLUE);
							table.getColumnModel().getColumn(8).setCellRenderer(render4);

							new LLNode_Function().displayByDiscount(list);
							LLNode<String> current3 = list;
							int j3 = 2;
							int i3 = 0;
							while (current3 != null) {
								//Condition to display only available discounted products
								if(current3.getDiscount()>0.0 && current3.getQuantity()>0) {
									table.setValueAt(current3.getProduct_ID(), j3, i3);
									table.setValueAt(current3.getProduct(), j3, i3 + 1);
									table.setValueAt(current3.getColor(), j3, i3 + 2);
									table.setValueAt(current3.getBrand(), j3, i3 + 3);
									table.setValueAt(current3.getType(), j3, i3 + 4);
									table.setValueAt(current3.getStoreCode(), j3, i3 + 5);
									table.setValueAt(current3.getSize(), j3, i3 + 6);
									table.setValueAt(current3.getPrice(), j3, i3 + 7);
									table.setValueAt(current3.getDiscount(), j3, i3 + 8);
									table.setValueAt(current3.getQuantity(), j3, i3 + 9);
									j3 = j3 + 1;
								}

								current3 = current3.getLink();
							}
//back from list inventory
							BtnEIBack = new JButton("Back");
							BtnEIBack.setBounds(400, 550, 175, 50);
							BtnEIBack.setBackground(Color.RED);
							BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
							BtnEIBack.setForeground(Color.WHITE);
							BtnEIBack.setFocusPainted(false);
							BtnEIBack.setBorderPainted(false);
							BtnEIBack.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									Display.setVisible(false);
									EndUserMenu.setVisible(true);
								}
							});
							Display.getContentPane().add(BtnEIBack);
							break;
						}
					};
				});

//Back to Main Menu
				BtnEndBack = new JButton("Back");
				BtnEndBack.setBounds(425, 550, 100, 40);
				BtnEndBack.setBackground(Color.RED);
				BtnEndBack.setFont(new Font("Gadugi", Font.BOLD, 20));
				BtnEndBack.setForeground(Color.WHITE);
				BtnEndBack.setFocusPainted(false);
				BtnEndBack.setBorderPainted(false);
				BtnEndBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						EndUserMenu.setVisible(false);
						MainMenu.setVisible(true);
					}

					;
				});
				EndUserMenu.getContentPane().add(BtnEndBack);
			}
		});
		MainMenu.getContentPane().add(BtnEndUser);

//Inuser menu
		BtnInUser = new JButton("Staff Member");
		BtnInUser.setBounds(400, 350, 175, 50);
		BtnInUser.setBackground(Color.CYAN);
		BtnInUser.setFont(new Font("Gadugi", Font.BOLD, 20));
		BtnInUser.setForeground(Color.BLACK);
		BtnInUser.setFocusPainted(false);
		BtnInUser.setBorderPainted(false);
		BtnInUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.setVisible(false);
				InUserLogin = new JFrame();
				InUserLogin.setTitle("IN USER LOGIN");
				InUserLogin.setBounds(250, 120, 950, 700);
				InUserLogin.getContentPane().setBackground(Color.BLACK);
				InUserLogin.setResizable(false);
				InUserLogin.getContentPane().setLayout(null);
				InUserLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				InUserLogin.setVisible(true);
//login page
				InUserTitle = new JLabel("~ Login For Staff Member ~");
				InUserTitle.setBounds(200, 50, 800, 50);
				InUserTitle.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
				InUserTitle.setForeground(Color.MAGENTA);
				InUserLogin.getContentPane().add(InUserTitle);

				InUserOpt = new JLabel("Please Enter Your Credentials Below");
				InUserOpt.setBounds(275, 150, 500, 50);
				InUserOpt.setFont(new Font("Bell MT", Font.BOLD, 25));
				InUserOpt.setForeground(Color.ORANGE);
				InUserLogin.getContentPane().add(InUserOpt);
//user id
				InUserId = new JLabel("User Id: ");
				InUserId.setBounds(340, 250, 100, 50);
				InUserId.setFont(new Font("Gadugi", Font.BOLD, 20));
				InUserId.setForeground(Color.RED);
				InUserLogin.getContentPane().add(InUserId);

				IPInUser = new JTextField(10);
				IPInUser.setBounds(460, 260, 150, 30);
				IPInUser.setEditable(true);
				IPInUser.setBackground(Color.BLACK);
				IPInUser.setFont(new Font("Gadugi", Font.PLAIN, 18));
				IPInUser.setForeground(Color.WHITE);
				InUserLogin.getContentPane().add(IPInUser);
//password
				InUserPswd = new JLabel("Password:");
				InUserPswd.setBounds(340, 320, 100, 50);
				InUserPswd.setFont(new Font("Gadugi", Font.BOLD, 20));
				InUserPswd.setForeground(Color.RED);
				InUserLogin.getContentPane().add(InUserPswd);

				IPInPswd = new JPasswordField(10);
				IPInPswd.setBounds(460, 330, 150, 30);
				IPInPswd.setEditable(true);
				IPInPswd.setBackground(Color.BLACK);
				IPInPswd.setFont(new Font("Gadugi", Font.PLAIN, 18));
				IPInPswd.setForeground(Color.WHITE);
				InUserLogin.getContentPane().add(IPInPswd);
// login button
				BtnInLogin = new JButton("LOGIN");
				BtnInLogin.setBounds(300, 420, 150, 50);
				BtnInLogin.setBackground(Color.GREEN);
				BtnInLogin.setFont(new Font("Gadugi", Font.BOLD, 15));
				BtnInLogin.setForeground(Color.BLACK);
				BtnInLogin.setFocusPainted(false);
				BtnInLogin.setBorderPainted(false);
				BtnInLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (Arrays.asList("ahore3", "sgoswa5", "sjagar2", "sezhil2", "rgupta62").contains(IPInUser.getText()) && IPInPswd.getText().equals("****")) {
							InUserLogin.setVisible(false);
							MainMenu.setVisible(false);
//in user menu
							InUserMenu = new JFrame();
							InUserMenu.setTitle("IN USER MENU");
							InUserMenu.setBounds(250, 120, 950, 700);
							InUserMenu.getContentPane().setBackground(Color.BLACK);
							InUserMenu.setResizable(false);
							InUserMenu.getContentPane().setLayout(null);
							InUserMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							InUserMenu.setVisible(true);

							InUserMTitle = new JLabel("~ In-User Menu ~");
							InUserMTitle.setBounds(295, 50, 800, 50);
							InUserMTitle.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
							InUserMTitle.setForeground(Color.MAGENTA);
							InUserMenu.getContentPane().add(InUserMTitle);

							InUserMOpt = new JLabel("Choose Option From Menu Below");
							InUserMOpt.setBounds(275, 150, 400, 50);
							InUserMOpt.setFont(new Font("Bell MT", Font.BOLD, 25));
							InUserMOpt.setForeground(Color.WHITE);
							InUserMenu.getContentPane().add(InUserMOpt);

//Search Garments
							InUserSOpt = new JLabel("Search Garment By:");
							InUserSOpt.setBounds(60, 300, 200, 30);
							InUserSOpt.setFont(new Font("Bell MT", Font.BOLD, 20));
							InUserSOpt.setForeground(Color.ORANGE);
							InUserMenu.getContentPane().add(InUserSOpt);

							String[] SearchGarments = {"Product ID", "Product", "Color"};
							JComboBox searchcomboBox = new JComboBox(SearchGarments);
							searchcomboBox.setBounds(260, 300, 150, 30);
							searchcomboBox.setBackground(Color.BLACK);
							searchcomboBox.setFont(new Font("Bell MT", Font.BOLD, 20));
							searchcomboBox.setForeground(Color.ORANGE);
							InUserMenu.getContentPane().add(searchcomboBox);

							BtnInSrchGrmt = new JButton("Search");
							BtnInSrchGrmt.setBounds(85, 350, 100, 30);
							BtnInSrchGrmt.setBackground(Color.BLACK);
							BtnInSrchGrmt.setFont(new Font("Gadugi", Font.BOLD, 20));
							BtnInSrchGrmt.setForeground(Color.GREEN);
							BtnInSrchGrmt.setFocusPainted(false);
							BtnInSrchGrmt.setBorderPainted(false);
							BtnInSrchGrmt.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent e) 
								{     

									int s1 = searchcomboBox.getSelectedIndex();
									InUserMenu.setVisible(false);

									Search = new JFrame();
									Search.setTitle("SEARCHED RESULTS");
									Search.setBounds(250, 120, 950 , 700);
									Search.getContentPane().setBackground(Color.BLACK);
									Search.setResizable(false);
									Search.getContentPane().setLayout(null);
									Search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									Search.setVisible(true);
//switch cases for search inventory
									switch(s1)
									{
									case 0: //PRODUCT ID

										PdtID = new JLabel("~ Search By Product ID~");
										PdtID .setBounds(250, 50, 800, 50);
										PdtID .setFont(new Font("Lucida Calligraphy",Font.BOLD,35));
										PdtID .setForeground(Color.MAGENTA);
										Search.getContentPane().add(PdtID);

										InPdt = new JLabel("Product ID: ");
										InPdt.setBounds(340, 150, 150, 30);
										InPdt.setFont(new Font("Gadugi",Font.BOLD,20));
										InPdt.setForeground(Color.RED);
										Search.getContentPane().add(InPdt);

										IPInPdt = new JTextField(10);
										IPInPdt.setBounds(460, 150, 200, 30);
										IPInPdt.setEditable(true);
										IPInPdt.setBackground(Color.BLACK);
										IPInPdt.setFont(new Font("Gadugi",Font.PLAIN,22));
										IPInPdt.setForeground(Color.GREEN);
										Search.getContentPane().add(IPInPdt);

										panel = new JPanel();
										panel.setBounds(70, 230, 800, 350);
										Search.getContentPane().add(panel);

										DefaultTableModel tablePdt = new DefaultTableModel(20,10);
										table = new JTable(tablePdt);
										table.setBounds(30, 70, 880, 100);
										panel.add(table);

										table.setValueAt("Product_ID", 0, 0);
										table.setValueAt("Product", 0, 1);
										table.setValueAt("Color", 0, 2);
										table.setValueAt("Brand", 0, 3);
										table.setValueAt("Type", 0, 4);
										table.setValueAt("Store Code", 0, 5);
										table.setValueAt("Size", 0, 6);
										table.setValueAt("Price", 0, 7);
										table.setValueAt("Discount", 0, 8);
										table.setValueAt("Quantity", 0, 9);
										
										DefaultTableCellRenderer rend1 = new DefaultTableCellRenderer();
										rend1.setForeground(Color.BLUE);
										table.getColumnModel().getColumn(0).setCellRenderer(rend1);

										BtnPdtBack = new JButton("Back");
										BtnPdtBack.setBounds(420, 610, 100, 40);
										BtnPdtBack.setBackground(Color.RED);
										BtnPdtBack.setFont(new Font("Gadugi",Font.BOLD,20));
										BtnPdtBack.setForeground(Color.WHITE);
										BtnPdtBack.setFocusPainted(false);
										BtnPdtBack.setBorderPainted(false);
										BtnPdtBack.addActionListener(new ActionListener() 
										{
											public void actionPerformed(ActionEvent e) 
											{     
												Search.setVisible(false);
												InUserMenu.setVisible(true);
											};
										});
										Search.getContentPane().add(BtnPdtBack);

										BtnPdtSrch = new JButton("Search");
										BtnPdtSrch.setBounds(420, 185, 100, 40);
										BtnPdtSrch.setBackground(Color.BLACK);
										BtnPdtSrch.setFont(new Font("Gadugi",Font.BOLD,20));
										BtnPdtSrch.setForeground(Color.RED);
										BtnPdtSrch.setFocusPainted(false);
										BtnPdtSrch.setBorderPainted(false);
										BtnPdtSrch.addActionListener(new ActionListener() 
										{
											public void actionPerformed(ActionEvent e) 
											{     
												LLNode<String>currentPdt=reference;
												int j=2;
												int i=0;
												int flag=0;
												while(currentPdt!=null) 
												{
													if(IPInPdt.getText().equalsIgnoreCase(currentPdt.getProduct_ID()))
													{	
														flag=1;
														table.setValueAt(currentPdt.getProduct_ID(), j, i);
														table.setValueAt(currentPdt.getProduct(), j, i+1);
														table.setValueAt(currentPdt.getColor() , j, i+2);
														table.setValueAt(currentPdt.getBrand(), j, i+3);
														table.setValueAt(currentPdt.getType(), j, i+4);
														table.setValueAt(currentPdt.getStoreCode(), j, i+5);
														table.setValueAt(currentPdt.getSize() , j, i+6);
														table.setValueAt(currentPdt.getPrice(), j, i+7);
														table.setValueAt(currentPdt.getDiscount(), j, i+8);
														table.setValueAt(currentPdt.getQuantity() , j, i+9);
														j=j+1;
													}
													currentPdt=currentPdt.getLink();
												}
												if(flag==0)
												{
													JOptionPane.showConfirmDialog(null,"Product Not Found! \n",
															"ERROR MESSAGE",JOptionPane.PLAIN_MESSAGE);
												}
											};
										});
										Search.getContentPane().add(BtnPdtSrch);
										break;

									case 1: //PRODUCT 

										PdtName = new JLabel("~ Search By Product Name~");
										PdtName.setBounds(230, 50, 800, 50);
										PdtName.setFont(new Font("Lucida Calligraphy",Font.BOLD,35));
										PdtName.setForeground(Color.MAGENTA);
										Search.getContentPane().add(PdtName);

										InPdtName = new JLabel("Product Name: ");
										InPdtName.setBounds(340, 150, 200, 30);
										InPdtName.setFont(new Font("Gadugi",Font.BOLD,20));
										InPdtName.setForeground(Color.RED);
										Search.getContentPane().add(InPdtName);

										IPInPdtName = new JTextField(10);
										IPInPdtName.setBounds(500, 150, 200, 30);
										IPInPdtName.setEditable(true);
										IPInPdtName.setBackground(Color.BLACK);
										IPInPdtName.setFont(new Font("Gadugi",Font.PLAIN,22));
										IPInPdtName.setForeground(Color.GREEN);
										Search.getContentPane().add(IPInPdtName);

										panel = new JPanel();
										panel.setBounds(70, 230, 800, 350);
										Search.getContentPane().add(panel);

										DefaultTableModel tablePdtName = new DefaultTableModel(20,10);
										table = new JTable(tablePdtName);
										table.setBounds(30, 70, 880, 100);
										panel.add(table);

										table.setValueAt("Product_ID", 0, 0);
										table.setValueAt("Product", 0, 1);
										table.setValueAt("Color", 0, 2);
										table.setValueAt("Brand", 0, 3);
										table.setValueAt("Type", 0, 4);
										table.setValueAt("Store Code", 0, 5);
										table.setValueAt("Size", 0, 6);
										table.setValueAt("Price", 0, 7);
										table.setValueAt("Discount", 0, 8);
										table.setValueAt("Quantity", 0, 9);
										
										DefaultTableCellRenderer rend2 = new DefaultTableCellRenderer();
										rend2.setForeground(Color.BLUE);
										table.getColumnModel().getColumn(1).setCellRenderer(rend2);

										BtnPdtNameBack = new JButton("Back");
										BtnPdtNameBack.setBounds(420, 610, 100, 40);
										BtnPdtNameBack.setBackground(Color.RED);
										BtnPdtNameBack.setFont(new Font("Gadugi",Font.BOLD,20));
										BtnPdtNameBack.setForeground(Color.WHITE);
										BtnPdtNameBack.setFocusPainted(false);
										BtnPdtNameBack.setBorderPainted(false);
										BtnPdtNameBack.addActionListener(new ActionListener() 
										{
											public void actionPerformed(ActionEvent e) 
											{     
												Search.setVisible(false);
												InUserMenu.setVisible(true);
											};
										});
										Search.getContentPane().add(BtnPdtNameBack);

										BtnPdtNameSrch = new JButton("Search");
										BtnPdtNameSrch.setBounds(420, 185, 100, 40);
										BtnPdtNameSrch.setBackground(Color.BLACK);
										BtnPdtNameSrch.setFont(new Font("Gadugi",Font.BOLD,20));
										BtnPdtNameSrch.setForeground(Color.RED);
										BtnPdtNameSrch.setFocusPainted(false);
										BtnPdtNameSrch.setBorderPainted(false);
										BtnPdtNameSrch.addActionListener(new ActionListener() 
										{
											public void actionPerformed(ActionEvent e) 
											{     
												LLNode<String>currentPdtName=reference;
												int j=2;
												int i=0;
												int flag=0;
												while(currentPdtName!=null) 
												{
													if(IPInPdtName.getText().equalsIgnoreCase(currentPdtName.getProduct()))
													{	
														flag=1;
														table.setValueAt(currentPdtName.getProduct_ID(), j, i);
														table.setValueAt(currentPdtName.getProduct(), j, i+1);
														table.setValueAt(currentPdtName.getColor() , j, i+2);
														table.setValueAt(currentPdtName.getBrand(), j, i+3);
														table.setValueAt(currentPdtName.getType(), j, i+4);
														table.setValueAt(currentPdtName.getStoreCode(), j, i+5);
														table.setValueAt(currentPdtName.getSize() , j, i+6);
														table.setValueAt(currentPdtName.getPrice(), j, i+7);
														table.setValueAt(currentPdtName.getDiscount(), j, i+8);
														table.setValueAt(currentPdtName.getQuantity() , j, i+9);
														j=j+1;
													}
													currentPdtName=currentPdtName.getLink();
												}
												if(flag==0)
												{
													JOptionPane.showConfirmDialog(null,"Product Not Found! \n",
															"ERROR MESSAGE",JOptionPane.PLAIN_MESSAGE);
												}
											};
										});
										Search.getContentPane().add(BtnPdtNameSrch);
										break;

									case 2: //COLOR

										PdtColor = new JLabel("~ Search By Color ~");
										PdtColor.setBounds(250, 50, 800, 50);
										PdtColor.setFont(new Font("Lucida Calligraphy",Font.BOLD,35));
										PdtColor.setForeground(Color.MAGENTA);
										Search.getContentPane().add(PdtColor);

										InPdtColor = new JLabel("Color: ");
										InPdtColor.setBounds(340, 150, 100, 30);
										InPdtColor.setFont(new Font("Gadugi",Font.BOLD,20));
										InPdtColor.setForeground(Color.RED);
										Search.getContentPane().add(InPdtColor);

										IPInPdtColor = new JTextField(10);
										IPInPdtColor.setBounds(420, 150, 200, 30);
										IPInPdtColor.setEditable(true);
										IPInPdtColor.setBackground(Color.BLACK);
										IPInPdtColor.setFont(new Font("Gadugi",Font.PLAIN,22));
										IPInPdtColor.setForeground(Color.GREEN);
										Search.getContentPane().add(IPInPdtColor);

										panel = new JPanel();
										panel.setBounds(70, 250, 800, 350);
										Search.getContentPane().add(panel);

										DefaultTableModel tablePdtColor = new DefaultTableModel(20,10);
										table = new JTable(tablePdtColor);
										table.setBounds(30, 70, 880, 100);
										panel.add(table);

										table.setValueAt("Product_ID", 0, 0);
										table.setValueAt("Product", 0, 1);
										table.setValueAt("Color", 0, 2);
										table.setValueAt("Brand", 0, 3);
										table.setValueAt("Type", 0, 4);
										table.setValueAt("Store Code", 0, 5);
										table.setValueAt("Size", 0, 6);
										table.setValueAt("Price", 0, 7);
										table.setValueAt("Discount", 0, 8);
										table.setValueAt("Quantity", 0, 9);
										
										DefaultTableCellRenderer rend3 = new DefaultTableCellRenderer();
										rend3.setForeground(Color.BLUE);
										table.getColumnModel().getColumn(2).setCellRenderer(rend3);

										BtnPdtColorBack = new JButton("Back");
										BtnPdtColorBack.setBounds(420, 610, 100, 40);
										BtnPdtColorBack.setBackground(Color.RED);
										BtnPdtColorBack.setFont(new Font("Gadugi",Font.BOLD,20));
										BtnPdtColorBack.setForeground(Color.WHITE);
										BtnPdtColorBack.setFocusPainted(false);
										BtnPdtColorBack.setBorderPainted(false);
										BtnPdtColorBack.addActionListener(new ActionListener() 
										{
											public void actionPerformed(ActionEvent e) 
											{     
												Search.setVisible(false);
												InUserMenu.setVisible(true);
											};
										});
										Search.getContentPane().add(BtnPdtColorBack);

										BtnPdtColorSrch = new JButton("Search");
										BtnPdtColorSrch.setBounds(420, 185, 100, 40);
										BtnPdtColorSrch.setBackground(Color.BLACK);
										BtnPdtColorSrch.setFont(new Font("Gadugi",Font.BOLD,20));
										BtnPdtColorSrch.setForeground(Color.RED);
										BtnPdtColorSrch.setFocusPainted(false);
										BtnPdtColorSrch.setBorderPainted(false);
										BtnPdtColorSrch.addActionListener(new ActionListener() 
										{
											public void actionPerformed(ActionEvent e) 
											{     
												LLNode<String>currentColor=reference;
												int j=2;
												int i=0;
												int flag=0;
												while(currentColor!=null) 
												{
													if(currentColor.getColor().equalsIgnoreCase(IPInPdtColor.getText()))
													{	
														flag=1;
														table.setValueAt(currentColor.getProduct_ID(), j, i);
														table.setValueAt(currentColor.getProduct(), j, i+1);
														table.setValueAt(currentColor.getColor() , j, i+2);
														table.setValueAt(currentColor.getBrand(), j, i+3);
														table.setValueAt(currentColor.getType(), j, i+4);
														table.setValueAt(currentColor.getStoreCode(), j, i+5);
														table.setValueAt(currentColor.getSize() , j, i+6);
														table.setValueAt(currentColor.getPrice(), j, i+7);
														table.setValueAt(currentColor.getDiscount(), j, i+8);
														table.setValueAt(currentColor.getQuantity() , j, i+9);
														j=j+1;
													}
													currentColor=currentColor.getLink();
												}
												
												if(flag==0)
												{
													JOptionPane.showConfirmDialog(null,"Color Not Found! \n",
															"ERROR MESSAGE",JOptionPane.PLAIN_MESSAGE);
												}
											};
										});
										Search.getContentPane().add(BtnPdtColorSrch);
										break;
									}
								};
							});
							InUserMenu.getContentPane().add(BtnInSrchGrmt);

//Display
							InUserDOpt = new JLabel("Display Garment By:");
							InUserDOpt.setBounds(60, 450, 200, 30);
							InUserDOpt.setFont(new Font("Bell MT", Font.BOLD, 20));
							InUserDOpt.setForeground(Color.ORANGE);
							InUserMenu.getContentPane().add(InUserDOpt);

							String[] DisplayGarments = {"Inventory", "Brand", "Type", "Store"};
							JComboBox displaycomboBox = new JComboBox(DisplayGarments);
							displaycomboBox.setBounds(260, 450, 150, 30);
							displaycomboBox.setBackground(Color.BLACK);
							displaycomboBox.setFont(new Font("Bell MT", Font.BOLD, 20));
							displaycomboBox.setForeground(Color.ORANGE);
							InUserMenu.getContentPane().add(displaycomboBox);

							BtnInDEI = new JButton("Search");
							BtnInDEI.setBounds(85, 500, 100, 30);
							BtnInDEI.setBackground(Color.BLACK);
							BtnInDEI.setFont(new Font("Gadugi", Font.BOLD, 20));
							BtnInDEI.setForeground(Color.GREEN);
							BtnInDEI.setFocusPainted(false);
							BtnInDEI.setBorderPainted(false);
							BtnInDEI.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									int s = displaycomboBox.getSelectedIndex();

									InUserMenu.setVisible(false);

									Display = new JFrame();
									Display.setTitle("SEARCHED RESULTS");
									Display.setBounds(250, 120, 950, 700);
									Display.getContentPane().setBackground(Color.BLACK);
									Display.setResizable(false);
									Display.getContentPane().setLayout(null);
									Display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									Display.setVisible(true);
//switch cases for display inventory
									switch (s) {
									case 0: //Display Entire Inventory
										System.out.println("Start");
										DisplayInv = new JLabel("~ Display Entire Inventory ~");
										DisplayInv.setBounds(180, 50, 800, 50);
										DisplayInv.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
										DisplayInv.setForeground(Color.MAGENTA);
										Display.getContentPane().add(DisplayInv);

										panel = new JPanel();
										panel.setBounds(70, 150, 800, 350);
										Display.getContentPane().add(panel);

										DefaultTableModel tableModel = new DefaultTableModel(20, 10);
										table = new JTable(tableModel);
										table.setBounds(30, 70, 880, 100);
										panel.add(table);

										table.setValueAt("Product_ID", 0, 0);
										table.setValueAt("Product", 0, 1);
										table.setValueAt("Color", 0, 2);
										table.setValueAt("Brand", 0, 3);
										table.setValueAt("Type", 0, 4);
										table.setValueAt("Store Code", 0, 5);
										table.setValueAt("Size", 0, 6);
										table.setValueAt("Price", 0, 7);
										table.setValueAt("Discount", 0, 8);
										table.setValueAt("Quantity", 0, 9);


										LLNode<String> current = reference;
										int j = 2;
										int i = 0;
										while (current != null) {
											table.setValueAt(current.getProduct_ID(), j, i);
											table.setValueAt(current.getProduct(), j, i + 1);
											table.setValueAt(current.getColor(), j, i + 2);
											table.setValueAt(current.getBrand(), j, i + 3);
											table.setValueAt(current.getType(), j, i + 4);
											table.setValueAt(current.getStoreCode(), j, i + 5);
											table.setValueAt(current.getSize(), j, i + 6);
											table.setValueAt(current.getPrice(), j, i + 7);
											table.setValueAt(current.getDiscount(), j, i + 8);
											table.setValueAt(current.getQuantity(), j, i + 9);
											j = j + 1;
											current = current.getLink();
										}

										BtnEIBack = new JButton("Back");
										BtnEIBack.setBounds(400, 550, 175, 50);
										BtnEIBack.setBackground(Color.RED);
										BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnEIBack.setForeground(Color.WHITE);
										BtnEIBack.setFocusPainted(false);
										BtnEIBack.setBorderPainted(false);
										BtnEIBack.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												Display.setVisible(false);
												InUserMenu.setVisible(true);
											}
										});
										Display.getContentPane().add(BtnEIBack);

										break;

									case 1: //Display By Brand

										DisplayBrand = new JLabel("~ Display By Brand ~");
										DisplayBrand.setBounds(250, 50, 800, 50);
										DisplayBrand.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
										DisplayBrand.setForeground(Color.MAGENTA);
										Display.getContentPane().add(DisplayBrand);

										InBrand = new JLabel("Brand: ");
										InBrand.setBounds(340, 150, 100, 30);
										InBrand.setFont(new Font("Gadugi", Font.BOLD, 20));
										InBrand.setForeground(Color.RED);
										Display.getContentPane().add(InBrand);

										IPInBrand = new JTextField(10);
										IPInBrand.setBounds(420, 150, 200, 30);
										IPInBrand.setEditable(true);
										IPInBrand.setBackground(Color.BLACK);
										IPInBrand.setFont(new Font("Gadugi", Font.PLAIN, 22));
										IPInBrand.setForeground(Color.GREEN);
										Display.getContentPane().add(IPInBrand);

										panel = new JPanel();
										panel.setBounds(70, 250, 800, 350);
										Display.getContentPane().add(panel);

										DefaultTableModel tableBrand = new DefaultTableModel(20, 10);
										table = new JTable(tableBrand);
										table.setBounds(30, 70, 880, 100);
										panel.add(table);

										table.setValueAt("Product_ID", 0, 0);
										table.setValueAt("Product", 0, 1);
										table.setValueAt("Color", 0, 2);
										table.setValueAt("Brand", 0, 3);
										table.setValueAt("Type", 0, 4);
										table.setValueAt("Store Code", 0, 5);
										table.setValueAt("Size", 0, 6);
										table.setValueAt("Price", 0, 7);
										table.setValueAt("Discount", 0, 8);
										table.setValueAt("Quantity", 0, 9);


										BtnBrandBack = new JButton("Back");
										BtnBrandBack.setBounds(420, 610, 100, 40);
										BtnBrandBack.setBackground(Color.RED);
										BtnBrandBack.setFont(new Font("Gadugi",Font.BOLD,20));
										BtnBrandBack.setForeground(Color.WHITE);
										BtnBrandBack.setFocusPainted(false);
										BtnBrandBack.setBorderPainted(false);
										BtnBrandBack.addActionListener(new ActionListener() 
										{
											public void actionPerformed(ActionEvent e) 
											{     
												Display.setVisible(false);
												InUserMenu.setVisible(true);
											};
										});
										Display.getContentPane().add(BtnBrandBack);

										DefaultTableCellRenderer render5 = new DefaultTableCellRenderer();
										render5.setForeground(Color.BLUE);
										table.getColumnModel().getColumn(3).setCellRenderer(render5);

										BtnBrandSrch = new JButton("Search");
										BtnBrandSrch.setBounds(420, 185, 100, 40);
										BtnBrandSrch.setBackground(Color.BLACK);
										BtnBrandSrch.setFont(new Font("Gadugi",Font.BOLD,20));
										BtnBrandSrch.setForeground(Color.RED);
										BtnBrandSrch.setFocusPainted(false);
										BtnBrandSrch.setBorderPainted(false);
										BtnBrandSrch.addActionListener(new ActionListener() 
										{
											public void actionPerformed(ActionEvent e) 
											{     
												LLNode<String>currentBrand=reference;
												int j=2;
												int i=0;
												int flag=0;
												while(currentBrand!=null) 
												{
													if(IPInBrand.getText().equalsIgnoreCase(currentBrand.getBrand()))
													{	
														flag=1;
														table.setValueAt(currentBrand.getProduct_ID(), j, i);
														table.setValueAt(currentBrand.getProduct(), j, i+1);
														table.setValueAt(currentBrand.getColor() , j, i+2);
														table.setValueAt(currentBrand.getBrand(), j, i+3);
														table.setValueAt(currentBrand.getType(), j, i+4);
														table.setValueAt(currentBrand.getStoreCode(), j, i+5);
														table.setValueAt(currentBrand.getSize() , j, i+6);
														table.setValueAt(currentBrand.getPrice(), j, i+7);
														table.setValueAt(currentBrand.getDiscount(), j, i+8);
														table.setValueAt(currentBrand.getQuantity() , j, i+9);
														j=j+1;
													}
													currentBrand=currentBrand.getLink();
												}
												if(flag==0)
												{
													JOptionPane.showConfirmDialog(null,"Brand Not Found! \n Please Enter From Available Brands",
															"ERROR MESSAGE",JOptionPane.PLAIN_MESSAGE);
												}
											};
										});
										Display.getContentPane().add(BtnBrandSrch);



										break;

									case 2: //Display By Type

										DisplayType = new JLabel("~ Display By Type ~");
										DisplayType.setBounds(250, 50, 800, 50);
										DisplayType.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
										DisplayType.setForeground(Color.MAGENTA);
										Display.getContentPane().add(DisplayType);

										InType = new JLabel("Type: ");
										InType.setBounds(340, 150, 100, 30);
										InType.setFont(new Font("Gadugi", Font.BOLD, 20));
										InType.setForeground(Color.RED);
										Display.getContentPane().add(InType);

										IPInType = new JTextField(10);
										IPInType.setBounds(420, 150, 200, 30);
										IPInType.setEditable(true);
										IPInType.setBackground(Color.BLACK);
										IPInType.setFont(new Font("Gadugi", Font.PLAIN, 22));
										IPInType.setForeground(Color.GREEN);
										Display.getContentPane().add(IPInType);

										panel = new JPanel();
										panel.setBounds(70, 250, 800, 350);
										Display.getContentPane().add(panel);

										DefaultTableModel tableType = new DefaultTableModel(20, 10);
										table = new JTable(tableType);
										table.setBounds(30, 70, 880, 100);
										panel.add(table);

										table.setValueAt("Product_ID", 0, 0);
										table.setValueAt("Product", 0, 1);
										table.setValueAt("Color", 0, 2);
										table.setValueAt("Brand", 0, 3);
										table.setValueAt("Type", 0, 4);
										table.setValueAt("Store Code", 0, 5);
										table.setValueAt("Size", 0, 6);
										table.setValueAt("Price", 0, 7);
										table.setValueAt("Discount", 0, 8);
										table.setValueAt("Quantity", 0, 9);


										BtnTypeBack = new JButton("Back");
										BtnTypeBack.setBounds(420, 610, 100, 40);
										BtnTypeBack.setBackground(Color.RED);
										BtnTypeBack.setFont(new Font("Gadugi",Font.BOLD,20));
										BtnTypeBack.setForeground(Color.WHITE);
										BtnTypeBack.setFocusPainted(false);
										BtnTypeBack.setBorderPainted(false);
										BtnTypeBack.addActionListener(new ActionListener() 
										{
											public void actionPerformed(ActionEvent e) 
											{     
												Display.setVisible(false);
												InUserMenu.setVisible(true);
											};
										});
										Display.getContentPane().add(BtnTypeBack);

										DefaultTableCellRenderer render6 = new DefaultTableCellRenderer();
										render6.setForeground(Color.BLUE);
										table.getColumnModel().getColumn(4).setCellRenderer(render6);

										BtnTypeSrch = new JButton("Search");
										BtnTypeSrch.setBounds(420, 185, 100, 40);
										BtnTypeSrch.setBackground(Color.BLACK);
										BtnTypeSrch.setFont(new Font("Gadugi",Font.BOLD,20));
										BtnTypeSrch.setForeground(Color.RED);
										BtnTypeSrch.setFocusPainted(false);
										BtnTypeSrch.setBorderPainted(false);
										BtnTypeSrch.addActionListener(new ActionListener() 
										{
											public void actionPerformed(ActionEvent e) 
											{     
												LLNode<String>currentBrand=reference;
												int j=2;
												int i=0;
												int flag=0;
												while(currentBrand!=null) 
												{	
													if(IPInType.getText().equalsIgnoreCase(currentBrand.getType()))
													{	
														flag=1;
														table.setValueAt(currentBrand.getProduct_ID(), j, i);
														table.setValueAt(currentBrand.getProduct(), j, i+1);
														table.setValueAt(currentBrand.getColor() , j, i+2);
														table.setValueAt(currentBrand.getBrand(), j, i+3);
														table.setValueAt(currentBrand.getType(), j, i+4);
														table.setValueAt(currentBrand.getStoreCode(), j, i+5);
														table.setValueAt(currentBrand.getSize() , j, i+6);
														table.setValueAt(currentBrand.getPrice(), j, i+7);
														table.setValueAt(currentBrand.getDiscount(), j, i+8);
														table.setValueAt(currentBrand.getQuantity() , j, i+9);
														j=j+1;
													}
													currentBrand=currentBrand.getLink();
												}
												if(flag==0)
												{
													JOptionPane.showConfirmDialog(null,"Brand Not Found! \n Please Enter From Available Brands",
															"ERROR MESSAGE",JOptionPane.PLAIN_MESSAGE);
												}
											};
										});
										Display.getContentPane().add(BtnTypeSrch);
										break;

									case 3: //Display By Store Code

										DisplayStore = new JLabel("~ Display By Store Code ~");
										DisplayStore.setBounds(225, 50, 800, 50);
										DisplayStore.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
										DisplayStore.setForeground(Color.MAGENTA);
										Display.getContentPane().add(DisplayStore);

										InStore = new JLabel("Store Code: ");
										InStore.setBounds(325, 150, 150, 30);
										InStore.setFont(new Font("Gadugi", Font.BOLD, 20));
										InStore.setForeground(Color.RED);
										Display.getContentPane().add(InStore);

										IPInType = new JTextField(10);
										IPInType.setBounds(440, 150, 200, 30);
										IPInType.setEditable(true);
										IPInType.setBackground(Color.BLACK);
										IPInType.setFont(new Font("Gadugi", Font.PLAIN, 22));
										IPInType.setForeground(Color.GREEN);
										Display.getContentPane().add(IPInType);

										panel = new JPanel();
										panel.setBounds(70, 250, 800, 350);
										Display.getContentPane().add(panel);

										DefaultTableModel tableStore = new DefaultTableModel(20, 10);
										table = new JTable(tableStore);
										table.setBounds(30, 70, 880, 100);
										panel.add(table);

										table.setValueAt("Product_ID", 0, 0);
										table.setValueAt("Product", 0, 1);
										table.setValueAt("Color", 0, 2);
										table.setValueAt("Brand", 0, 3);
										table.setValueAt("Type", 0, 4);
										table.setValueAt("Store Code", 0, 5);
										table.setValueAt("Size", 0, 6);
										table.setValueAt("Price", 0, 7);
										table.setValueAt("Discount", 0, 8);
										table.setValueAt("Quantity", 0, 9);


										BtnTypeBack = new JButton("Back");
										BtnTypeBack.setBounds(420, 610, 100, 40);
										BtnTypeBack.setBackground(Color.RED);
										BtnTypeBack.setFont(new Font("Gadugi",Font.BOLD,20));
										BtnTypeBack.setForeground(Color.WHITE);
										BtnTypeBack.setFocusPainted(false);
										BtnTypeBack.setBorderPainted(false);
										BtnTypeBack.addActionListener(new ActionListener() 
										{
											public void actionPerformed(ActionEvent e) 
											{     
												Display.setVisible(false);
												InUserMenu.setVisible(true);
											};
										});
										Display.getContentPane().add(BtnTypeBack);

										DefaultTableCellRenderer render7 = new DefaultTableCellRenderer();
										render7.setForeground(Color.BLUE);
										table.getColumnModel().getColumn(5).setCellRenderer(render7);

										BtnTypeSrch = new JButton("Search");
										BtnTypeSrch.setBounds(420, 185, 100, 40);
										BtnTypeSrch.setBackground(Color.BLACK);
										BtnTypeSrch.setFont(new Font("Gadugi",Font.BOLD,20));
										BtnTypeSrch.setForeground(Color.RED);
										BtnTypeSrch.setFocusPainted(false);
										BtnTypeSrch.setBorderPainted(false);
										BtnTypeSrch.addActionListener(new ActionListener() 
										{
											public void actionPerformed(ActionEvent e) 
											{     
												LLNode<String>currentBrand=reference;
												int j=2;
												int i=0;
												int flag=0;
												while(currentBrand!=null) 
												{	
													if(IPInType.getText().equals(currentBrand.getStoreCode()))
													{	
														flag=1;
														table.setValueAt(currentBrand.getProduct_ID(), j, i);
														table.setValueAt(currentBrand.getProduct(), j, i+1);
														table.setValueAt(currentBrand.getColor() , j, i+2);
														table.setValueAt(currentBrand.getBrand(), j, i+3);
														table.setValueAt(currentBrand.getType(), j, i+4);
														table.setValueAt(currentBrand.getStoreCode(), j, i+5);
														table.setValueAt(currentBrand.getSize() , j, i+6);
														table.setValueAt(currentBrand.getPrice(), j, i+7);
														table.setValueAt(currentBrand.getDiscount(), j, i+8);
														table.setValueAt(currentBrand.getQuantity() , j, i+9);
														j=j+1;
													}
													currentBrand=currentBrand.getLink();
												}
												if(flag==0)
												{
													JOptionPane.showConfirmDialog(null,"Store Code is Not Found! \n Please Enter From Available Store Code",
															"ERROR MESSAGE",JOptionPane.PLAIN_MESSAGE);
												}
											};
										});
										Display.getContentPane().add(BtnTypeSrch);
										break;
									}
								};
							});
							InUserMenu.getContentPane().add(BtnInDEI);

//List Garments
							InUserLOpt = new JLabel("List Garment By:");
							InUserLOpt.setBounds(540, 300, 200, 30);
							InUserLOpt.setFont(new Font("Bell MT", Font.BOLD, 20));
							InUserLOpt.setForeground(Color.ORANGE);
							InUserMenu.getContentPane().add(InUserLOpt);

							String[] ListGarments = {"Price", "Size", "Availabilty", "Discount"};
							JComboBox listcomboBox = new JComboBox(ListGarments);
							listcomboBox.setBounds(740, 300, 150, 30);
							listcomboBox.setBackground(Color.BLACK);
							listcomboBox.setFont(new Font("Bell MT", Font.BOLD, 20));
							listcomboBox.setForeground(Color.ORANGE);
							InUserMenu.getContentPane().add(listcomboBox);

							BtnInListGrmt = new JButton("Search");
							BtnInListGrmt.setBounds(565, 350, 100, 30);
							BtnInListGrmt.setBackground(Color.BLACK);
							BtnInListGrmt.setFont(new Font("Gadugi", Font.BOLD, 20));
							BtnInListGrmt.setForeground(Color.GREEN);
							BtnInListGrmt.setFocusPainted(false);
							BtnInListGrmt.setBorderPainted(false);
							InUserMenu.getContentPane().add(BtnInListGrmt);
//list garment menu
							BtnInListGrmt.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									int s = listcomboBox.getSelectedIndex();

									InUserMenu.setVisible(false);

									Display = new JFrame();
									Display.setTitle("SEARCHED RESULTS");
									Display.setBounds(250, 120, 950, 700);
									Display.getContentPane().setBackground(Color.BLACK);
									Display.setResizable(false);
									Display.getContentPane().setLayout(null);
									Display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									Display.setVisible(true);
//switch cases for list inventory
									switch (s) {
									case 0: //List inventory by price

										ListByPrice = new JLabel("~ Inventory Sorted By Price ~");
										ListByPrice.setBounds(180, 50, 800, 50);
										ListByPrice.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
										ListByPrice.setForeground(Color.MAGENTA);
										Display.getContentPane().add(ListByPrice);

										panel = new JPanel();
										panel.setBounds(70, 150, 800, 350);
										Display.getContentPane().add(panel);

										DefaultTableModel tableModel = new DefaultTableModel(20, 10);
										table = new JTable(tableModel);
										table.setBounds(30, 70, 880, 100);
										panel.add(table);

										table.setValueAt("Product_ID", 0, 0);
										table.setValueAt("Product", 0, 1);
										table.setValueAt("Color", 0, 2);
										table.setValueAt("Brand", 0, 3);
										table.setValueAt("Type", 0, 4);
										table.setValueAt("Store Code", 0, 5);
										table.setValueAt("Size", 0, 6);
										table.setValueAt("Price", 0, 7);
										table.setValueAt("Discount", 0, 8);
										table.setValueAt("Quantity", 0, 9);

										DefaultTableCellRenderer render1 = new DefaultTableCellRenderer();
										render1.setForeground(Color.BLUE);
										table.getColumnModel().getColumn(7).setCellRenderer(render1);

										new LLNode_Function().listByPrice(list);
										LLNode<String> current = list;
										int j = 2;
										int i = 0;
										while (current != null) {
											table.setValueAt(current.getProduct_ID(), j, i);
											table.setValueAt(current.getProduct(), j, i + 1);
											table.setValueAt(current.getColor(), j, i + 2);
											table.setValueAt(current.getBrand(), j, i + 3);
											table.setValueAt(current.getType(), j, i + 4);
											table.setValueAt(current.getStoreCode(), j, i + 5);
											table.setValueAt(current.getSize(), j, i + 6);
											table.setValueAt(current.getPrice(), j, i + 7);
											table.setValueAt(current.getDiscount(), j, i + 8);
											table.setValueAt(current.getQuantity(), j, i + 9);
											j = j + 1;
											current = current.getLink();
										}

										BtnEIBack = new JButton("Back");
										BtnEIBack.setBounds(400, 550, 175, 50);
										BtnEIBack.setBackground(Color.RED);
										BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnEIBack.setForeground(Color.WHITE);
										BtnEIBack.setFocusPainted(false);
										BtnEIBack.setBorderPainted(false);
										BtnEIBack.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												Display.setVisible(false);
												InUserMenu.setVisible(true);
											}
										});
										Display.getContentPane().add(BtnEIBack);
										break;

									case 1: //List Inventory by size
										ListBySize = new JLabel("~ Inventory Sorted By Size ~");
										ListBySize.setBounds(180, 50, 800, 50);
										ListBySize.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
										ListBySize.setForeground(Color.MAGENTA);
										Display.getContentPane().add(ListBySize);

										panel = new JPanel();
										panel.setBounds(70, 150, 800, 350);
										Display.getContentPane().add(panel);

										DefaultTableModel tableBrand = new DefaultTableModel(20, 10);
										table = new JTable(tableBrand);
										table.setBounds(30, 70, 880, 100);
										panel.add(table);

										table.setValueAt("Product_ID", 0, 0);
										table.setValueAt("Product", 0, 1);
										table.setValueAt("Color", 0, 2);
										table.setValueAt("Brand", 0, 3);
										table.setValueAt("Type", 0, 4);
										table.setValueAt("Store Code", 0, 5);
										table.setValueAt("Size", 0, 6);
										table.setValueAt("Price", 0, 7);
										table.setValueAt("Discount", 0, 8);
										table.setValueAt("Quantity", 0, 9);

										DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
										render2.setForeground(Color.BLUE);
										table.getColumnModel().getColumn(6).setCellRenderer(render2);

										new LLNode_Function().listBySize(list);
										LLNode<String> current1 = list;
										int j1 = 2;
										int i1 = 0;
										while (current1 != null) {
											table.setValueAt(current1.getProduct_ID(), j1, i1);
											table.setValueAt(current1.getProduct(), j1, i1 + 1);
											table.setValueAt(current1.getColor(), j1, i1 + 2);
											table.setValueAt(current1.getBrand(), j1, i1 + 3);
											table.setValueAt(current1.getType(), j1, i1 + 4);
											table.setValueAt(current1.getStoreCode(), j1, i1 + 5);
											table.setValueAt(current1.getSize(), j1, i1 + 6);
											table.setValueAt(current1.getPrice(), j1, i1 + 7);
											table.setValueAt(current1.getDiscount(), j1, i1 + 8);
											table.setValueAt(current1.getQuantity(), j1, i1 + 9);
											j1 = j1 + 1;
											current1 = current1.getLink();
										}

										BtnEIBack = new JButton("Back");
										BtnEIBack.setBounds(400, 550, 175, 50);
										BtnEIBack.setBackground(Color.RED);
										BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnEIBack.setForeground(Color.WHITE);
										BtnEIBack.setFocusPainted(false);
										BtnEIBack.setBorderPainted(false);
										BtnEIBack.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												Display.setVisible(false);
												InUserMenu.setVisible(true);
											}
										});
										Display.getContentPane().add(BtnEIBack);
										break;

									case 2: //List Inventory by availability
										ListByAvailability = new JLabel("~ Inventory Sorted By Availability ~");
										ListByAvailability.setBounds(120, 50, 800, 50);
										ListByAvailability.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
										ListByAvailability.setForeground(Color.MAGENTA);
										Display.getContentPane().add(ListByAvailability);

										panel = new JPanel();
										panel.setBounds(70, 150, 800, 350);
										Display.getContentPane().add(panel);

										DefaultTableModel tableAvailability = new DefaultTableModel(20, 10);
										table = new JTable(tableAvailability);
										table.setBounds(30, 70, 880, 100);
										panel.add(table);

										table.setValueAt("Product_ID", 0, 0);
										table.setValueAt("Product", 0, 1);
										table.setValueAt("Color", 0, 2);
										table.setValueAt("Brand", 0, 3);
										table.setValueAt("Type", 0, 4);
										table.setValueAt("Store Code", 0, 5);
										table.setValueAt("Size", 0, 6);
										table.setValueAt("Price", 0, 7);
										table.setValueAt("Discount", 0, 8);
										table.setValueAt("Quantity", 0, 9);

										DefaultTableCellRenderer render3 = new DefaultTableCellRenderer();
										render3.setForeground(Color.BLUE);
										table.getColumnModel().getColumn(9).setCellRenderer(render3);

										new LLNode_Function().listByAvailability(list);
										
										LLNode<String> current2 = list;
										int j2 = 2;
										int i2 = 0;
										while (current2 != null) {
											if(current2.getQuantity()>0) {
											table.setValueAt(current2.getProduct_ID(), j2, i2);
											table.setValueAt(current2.getProduct(), j2, i2 + 1);
											table.setValueAt(current2.getColor(), j2, i2 + 2);
											table.setValueAt(current2.getBrand(), j2, i2 + 3);
											table.setValueAt(current2.getType(), j2, i2 + 4);
											table.setValueAt(current2.getStoreCode(), j2, i2 + 5);
											table.setValueAt(current2.getSize(), j2, i2 + 6);
											table.setValueAt(current2.getPrice(), j2, i2 + 7);
											table.setValueAt(current2.getDiscount(), j2, i2 + 8);
											table.setValueAt(current2.getQuantity(), j2, i2 + 9);
											j2 = j2 + 1;
											}
											current2 = current2.getLink();
										}

										BtnEIBack = new JButton("Back");
										BtnEIBack.setBounds(400, 550, 175, 50);
										BtnEIBack.setBackground(Color.RED);
										BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnEIBack.setForeground(Color.WHITE);
										BtnEIBack.setFocusPainted(false);
										BtnEIBack.setBorderPainted(false);
										BtnEIBack.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												Display.setVisible(false);
												InUserMenu.setVisible(true);
											}
										});
										Display.getContentPane().add(BtnEIBack);
										break;

									case 3: //List inventory by discount

										ListByDiscount = new JLabel("~ Products On Discount ~");
										ListByDiscount.setBounds(250, 50, 800, 50);
										ListByDiscount.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
										ListByDiscount.setForeground(Color.MAGENTA);
										Display.getContentPane().add(ListByDiscount);

										panel = new JPanel();
										panel.setBounds(70, 150, 800, 350);
										Display.getContentPane().add(panel);

										DefaultTableModel tableDiscount = new DefaultTableModel(20, 10);
										table = new JTable(tableDiscount);
										table.setBounds(30, 70, 880, 100);
										panel.add(table);

										table.setValueAt("Product_ID", 0, 0);
										table.setValueAt("Product", 0, 1);
										table.setValueAt("Color", 0, 2);
										table.setValueAt("Brand", 0, 3);
										table.setValueAt("Type", 0, 4);
										table.setValueAt("Store Code", 0, 5);
										table.setValueAt("Size", 0, 6);
										table.setValueAt("Price", 0, 7);
										table.setValueAt("Discount", 0, 8);
										table.setValueAt("Quantity", 0, 9);

										DefaultTableCellRenderer render4 = new DefaultTableCellRenderer();
										render4.setForeground(Color.BLUE);
										table.getColumnModel().getColumn(8).setCellRenderer(render4);

										new LLNode_Function().displayByDiscount(list);
										LLNode<String> current3 = list;
										int j3 = 2;
										int i3 = 0;
										while (current3 != null) {
											if(current3.getDiscount()>0.0 && current3.getQuantity()>0) {
												table.setValueAt(current3.getProduct_ID(), j3, i3);
												table.setValueAt(current3.getProduct(), j3, i3 + 1);
												table.setValueAt(current3.getColor(), j3, i3 + 2);
												table.setValueAt(current3.getBrand(), j3, i3 + 3);
												table.setValueAt(current3.getType(), j3, i3 + 4);
												table.setValueAt(current3.getStoreCode(), j3, i3 + 5);
												table.setValueAt(current3.getSize(), j3, i3 + 6);
												table.setValueAt(current3.getPrice(), j3, i3 + 7);
												table.setValueAt(current3.getDiscount(), j3, i3 + 8);
												table.setValueAt(current3.getQuantity(), j3, i3 + 9);
												j3 = j3 + 1;
											}
											current3 = current3.getLink();
										}

										BtnEIBack = new JButton("Back");
										BtnEIBack.setBounds(400, 550, 175, 50);
										BtnEIBack.setBackground(Color.RED);
										BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnEIBack.setForeground(Color.WHITE);
										BtnEIBack.setFocusPainted(false);
										BtnEIBack.setBorderPainted(false);
										BtnEIBack.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												Display.setVisible(false);
												InUserMenu.setVisible(true);
											}
										});
										Display.getContentPane().add(BtnEIBack);
										break;
									}
								};
							});

//Modify Inventory
							InUserEOpt = new JLabel("Modify Garments:");
							InUserEOpt.setBounds(540, 450, 200, 30);
							InUserEOpt.setFont(new Font("Bell MT", Font.BOLD, 20));
							InUserEOpt.setForeground(Color.ORANGE);
							InUserMenu.getContentPane().add(InUserEOpt);

							String[] ModifyGarments = {"Add", "Update", "Delete"};
							JComboBox modifycomboBox = new JComboBox(ModifyGarments);
							modifycomboBox.setBounds(740, 450, 150, 30);
							modifycomboBox.setBackground(Color.BLACK);
							modifycomboBox.setFont(new Font("Bell MT", Font.BOLD, 20));
							modifycomboBox.setForeground(Color.ORANGE);
							InUserMenu.getContentPane().add(modifycomboBox);

							BtnInEdit = new JButton("Search");
							BtnInEdit.setBounds(565, 500, 100, 30);
							BtnInEdit.setBackground(Color.BLACK);
							BtnInEdit.setFont(new Font("Gadugi", Font.BOLD, 20));
							BtnInEdit.setForeground(Color.GREEN);
							BtnInEdit.setFocusPainted(false);
							BtnInEdit.setBorderPainted(false);
							BtnInEdit.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									int s = modifycomboBox.getSelectedIndex();

									InUserMenu.setVisible(false);

									Modify = new JFrame();
									Modify.setTitle("MODIFIED RESULTS");
									Modify.setBounds(250, 120, 950, 700);
									Modify.getContentPane().setBackground(Color.BLACK);
									Modify.setResizable(false);
									Modify.getContentPane().setLayout(null);
									Modify.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									Modify.setVisible(true);
//switch cases for modify inventory
									switch (s) {
									case 0: //Add New Inventory

										AddInv = new JLabel("~ Add New Inventory ~");
										AddInv.setBounds(250, 50, 800, 50);
										AddInv.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
										AddInv.setForeground(Color.MAGENTA);
										Modify.getContentPane().add(AddInv);

										AddDetails = new JLabel("Please Enter Inventory Details Below");
										AddDetails.setBounds(275, 100, 500, 50);
										AddDetails.setFont(new Font("Bell MT", Font.BOLD, 25));
										AddDetails.setForeground(Color.ORANGE);
										Modify.getContentPane().add(AddDetails);

										//Pid
										AddPid = new JLabel("Product Id: ");
										AddPid.setBounds(310, 160, 200, 30);
										AddPid.setFont(new Font("Gadugi", Font.BOLD, 20));
										AddPid.setForeground(Color.RED);
										Modify.getContentPane().add(AddPid);

										InAddPid = new JTextField(10);
										InAddPid.setBounds(470, 160, 200, 30);
										InAddPid.setEditable(true);
										InAddPid.setBackground(Color.BLACK);
										InAddPid.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InAddPid.setForeground(Color.WHITE);
										Modify.getContentPane().add(InAddPid);

										//Name
										AddName = new JLabel("Name: ");
										AddName.setBounds(310, 195, 200, 30);
										AddName.setFont(new Font("Gadugi", Font.BOLD, 20));
										AddName.setForeground(Color.RED);
										Modify.getContentPane().add(AddName);

										InAddName = new JTextField(10);
										InAddName.setBounds(470, 195, 200, 30);
										InAddName.setEditable(true);
										InAddName.setBackground(Color.BLACK);
										InAddName.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InAddName.setForeground(Color.WHITE);
										Modify.getContentPane().add(InAddName);

										//Color
										AddColor = new JLabel("Color: ");
										AddColor.setBounds(310, 230, 200, 30);
										AddColor.setFont(new Font("Gadugi", Font.BOLD, 20));
										AddColor.setForeground(Color.RED);
										Modify.getContentPane().add(AddColor);

										InAddColor = new JTextField(10);
										InAddColor.setBounds(470, 230, 200, 30);
										InAddColor.setEditable(true);
										InAddColor.setBackground(Color.BLACK);
										InAddColor.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InAddColor.setForeground(Color.WHITE);
										Modify.getContentPane().add(InAddColor);

										//Brand
										AddBrand = new JLabel("Brand: ");
										AddBrand.setBounds(310, 265, 200, 30);
										AddBrand.setFont(new Font("Gadugi", Font.BOLD, 20));
										AddBrand.setForeground(Color.RED);
										Modify.getContentPane().add(AddBrand);

										InAddBrand = new JTextField(10);
										InAddBrand.setBounds(470, 265, 200, 30);
										InAddBrand.setEditable(true);
										InAddBrand.setBackground(Color.BLACK);
										InAddBrand.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InAddBrand.setForeground(Color.WHITE);
										Modify.getContentPane().add(InAddBrand);

										//Type
										AddType = new JLabel("Type: ");
										AddType.setBounds(310, 305, 200, 30);
										AddType.setFont(new Font("Gadugi", Font.BOLD, 20));
										AddType.setForeground(Color.RED);
										Modify.getContentPane().add(AddType);

										InAddType = new JTextField(10);
										InAddType.setBounds(470, 305, 200, 30);
										InAddType.setEditable(true);
										InAddType.setBackground(Color.BLACK);
										InAddType.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InAddType.setForeground(Color.WHITE);
										Modify.getContentPane().add(InAddType);

										//Store Code
										AddSC = new JLabel("Store Code: ");
										AddSC.setBounds(310, 340, 200, 30);
										AddSC.setFont(new Font("Gadugi", Font.BOLD, 20));
										AddSC.setForeground(Color.RED);
										Modify.getContentPane().add(AddSC);

										InAddSC = new JTextField(10);
										InAddSC.setBounds(470, 340, 200, 30);
										InAddSC.setEditable(true);
										InAddSC.setBackground(Color.BLACK);
										InAddSC.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InAddSC.setForeground(Color.WHITE);
										Modify.getContentPane().add(InAddSC);

										//Size
										AddSize = new JLabel("Size: ");
										AddSize.setBounds(310, 375, 200, 30);
										AddSize.setFont(new Font("Gadugi", Font.BOLD, 20));
										AddSize.setForeground(Color.RED);
										Modify.getContentPane().add(AddSize);

										InAddSize = new JTextField(10);
										InAddSize.setBounds(470, 375, 200, 30);
										InAddSize.setEditable(true);
										InAddSize.setBackground(Color.BLACK);
										InAddSize.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InAddSize.setForeground(Color.WHITE);
										Modify.getContentPane().add(InAddSize);

										//Price
										AddPrice = new JLabel("Price: ");
										AddPrice.setBounds(310, 410, 200, 30);
										AddPrice.setFont(new Font("Gadugi", Font.BOLD, 20));
										AddPrice.setForeground(Color.RED);
										Modify.getContentPane().add(AddPrice);

										InAddPrice = new JTextField(10);
										InAddPrice.setBounds(470, 410, 200, 30);
										InAddPrice.setEditable(true);
										InAddPrice.setBackground(Color.BLACK);
										InAddPrice.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InAddPrice.setForeground(Color.WHITE);
										Modify.getContentPane().add(InAddPrice);

										//Discount
										AddDiscount = new JLabel("Discount: ");
										AddDiscount.setBounds(310, 445, 200, 30);
										AddDiscount.setFont(new Font("Gadugi", Font.BOLD, 20));
										AddDiscount.setForeground(Color.RED);
										Modify.getContentPane().add(AddDiscount);

										InAddDiscount = new JTextField(10);
										InAddDiscount.setBounds(470, 445, 200, 30);
										InAddDiscount.setEditable(true);
										InAddDiscount.setBackground(Color.BLACK);
										InAddDiscount.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InAddDiscount.setForeground(Color.WHITE);
										Modify.getContentPane().add(InAddDiscount);

										//Quantity
										AddQuantity = new JLabel("Quantity: ");
										AddQuantity.setBounds(310, 480, 200, 30);
										AddQuantity.setFont(new Font("Gadugi", Font.BOLD, 20));
										AddQuantity.setForeground(Color.RED);
										Modify.getContentPane().add(AddQuantity);

										InAddQuantity = new JTextField(10);
										InAddQuantity.setBounds(470, 480, 200, 30);
										InAddQuantity.setEditable(true);
										InAddQuantity.setBackground(Color.BLACK);
										InAddQuantity.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InAddQuantity.setForeground(Color.WHITE);
										Modify.getContentPane().add(InAddQuantity);

										BtnEIBack = new JButton("Back");
										BtnEIBack.setBounds(500, 550, 175, 50);
										BtnEIBack.setBackground(Color.RED);
										BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnEIBack.setForeground(Color.WHITE);
										BtnEIBack.setFocusPainted(false);
										BtnEIBack.setBorderPainted(false);
										BtnEIBack.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												Modify.setVisible(false);
												InUserMenu.setVisible(true);
											}
										});
										Modify.getContentPane().add(BtnEIBack);


										BtnAdd = new JButton("Add");
										BtnAdd.setBounds(310, 550, 175, 50);
										BtnAdd.setBackground(Color.GREEN);
										BtnAdd.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnAdd.setForeground(Color.BLACK);
										BtnAdd.setFocusPainted(false);
										BtnAdd.setBorderPainted(false);
										BtnAdd.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {												

												Modify.setVisible(false);

												Added = new JFrame();
												Added.setTitle("ADDED RESULTS");
												Added.setBounds(250, 120, 950, 700);
												Added.getContentPane().setBackground(Color.BLACK);
												Added.setResizable(false);
												Added.getContentPane().setLayout(null);
												Added.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
												Added.setVisible(true);

												AddedInv = new JLabel("~ Newly Added Inventory ~");
												AddedInv.setBounds(180, 50, 800, 50);
												AddedInv.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
												AddedInv.setForeground(Color.MAGENTA);
												Added.getContentPane().add(AddedInv);

												String productID=InAddPid.getText();
												String Product=InAddName.getText();
												String PColor=InAddColor.getText();
												String Brand=InAddBrand.getText();
												String Type=InAddType.getText();
												String StoreCode=InAddSC.getText();
												String Size=InAddSize.getText();
												double Price=Double.parseDouble(InAddPrice.getText());
												double Discount=Double.parseDouble(InAddDiscount.getText());
												int Quantity=Integer.parseInt(InAddQuantity.getText());

												LLNode<String>newItem=new LLNode<>();
												newItem.setInfo(productID, Product, PColor, Brand, Type, StoreCode, Size, Price, Discount, Quantity);
												new LLNode_Function().addRecord(list15,newItem);

												panel = new JPanel();
												panel.setBounds(70, 150, 800, 350);
												Added.getContentPane().add(panel);

												DefaultTableModel tableModel = new DefaultTableModel(20, 10);
												table = new JTable(tableModel);
												table.setBounds(30, 70, 880, 100);
												panel.add(table);

												table.setValueAt("Product_ID", 0, 0);
												table.setValueAt("Product", 0, 1);
												table.setValueAt("Color", 0, 2);
												table.setValueAt("Brand", 0, 3);
												table.setValueAt("Type", 0, 4);
												table.setValueAt("Store Code", 0, 5);
												table.setValueAt("Size", 0, 6);
												table.setValueAt("Price", 0, 7);
												table.setValueAt("Discount", 0, 8);
												table.setValueAt("Quantity", 0, 9);

												LLNode<String>current=list;
												int j=2;
												int i=0;
												while(current!=null) 
												{	
													table.setValueAt(current.getProduct_ID(), j, i);
													table.setValueAt(current.getProduct(), j, i+1);
													table.setValueAt(current.getColor() , j, i+2);
													table.setValueAt(current.getBrand(), j, i+3);
													table.setValueAt(current.getType(), j, i+4);
													table.setValueAt(current.getStoreCode(), j, i+5);
													table.setValueAt(current.getSize() , j, i+6);
													table.setValueAt(current.getPrice(), j, i+7);
													table.setValueAt(current.getDiscount(), j, i+8);
													table.setValueAt(current.getQuantity() , j, i+9);
													j=j+1;
													current=current.getLink();
												}

												BtnEIBack = new JButton("Back");
												BtnEIBack.setBounds(400, 550, 175, 50);
												BtnEIBack.setBackground(Color.RED);
												BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
												BtnEIBack.setForeground(Color.WHITE);
												BtnEIBack.setFocusPainted(false);
												BtnEIBack.setBorderPainted(false);
												BtnEIBack.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														Added.setVisible(false);
														Modify.setVisible(true);
													}
												});
												Added.getContentPane().add(BtnEIBack);
											}
										});
										Modify.getContentPane().add(BtnAdd);
//back from add inventory window
										BtnEIBack = new JButton("Back");
										BtnEIBack.setBounds(500, 550, 175, 50);
										BtnEIBack.setBackground(Color.RED);
										BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnEIBack.setForeground(Color.WHITE);
										BtnEIBack.setFocusPainted(false);
										BtnEIBack.setBorderPainted(false);
										BtnEIBack.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												Added.setVisible(false);
												Modify.setVisible(true);
											}
										});
										Modify.getContentPane().add(BtnEIBack);

										break;

									case 1: //Update Inventory

										UpInv = new JLabel("~ Update Inventory ~");
										UpInv.setBounds(260, 50, 800, 50);
										UpInv.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
										UpInv.setForeground(Color.MAGENTA);
										Modify.getContentPane().add(UpInv);

										UpDetails = new JLabel("Please Enter Inventory Details Below");
										UpDetails.setBounds(275, 100, 500, 50);
										UpDetails.setFont(new Font("Bell MT", Font.BOLD, 25));
										UpDetails.setForeground(Color.ORANGE);
										Modify.getContentPane().add(UpDetails);

										//Pid
										UpPid = new JLabel("Product Id: ");
										UpPid.setBounds(310, 160, 200, 30);
										UpPid.setFont(new Font("Gadugi", Font.BOLD, 20));
										UpPid.setForeground(Color.RED);
										Modify.getContentPane().add(UpPid);

										InUpPid = new JTextField(10);
										InUpPid.setBounds(470, 160, 200, 30);
										InUpPid.setEditable(true);
										InUpPid.setBackground(Color.BLACK);
										InUpPid.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InUpPid.setForeground(Color.WHITE);
										Modify.getContentPane().add(InUpPid);

										//Name
										UpName = new JLabel("Name: ");
										UpName.setBounds(310, 195, 200, 30);
										UpName.setFont(new Font("Gadugi", Font.BOLD, 20));
										UpName.setForeground(Color.RED);
										Modify.getContentPane().add(UpName);

										InUpName = new JTextField(10);
										InUpName.setBounds(470, 195, 200, 30);
										InUpName.setEditable(true);
										InUpName.setBackground(Color.BLACK);
										InUpName.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InUpName.setForeground(Color.WHITE);
										Modify.getContentPane().add(InUpName);

										//Color
										UpColor = new JLabel("Color: ");
										UpColor.setBounds(310, 230, 200, 30);
										UpColor.setFont(new Font("Gadugi", Font.BOLD, 20));
										UpColor.setForeground(Color.RED);
										Modify.getContentPane().add(UpColor);

										InUpColor = new JTextField(10);
										InUpColor.setBounds(470, 230, 200, 30);
										InUpColor.setEditable(true);
										InUpColor.setBackground(Color.BLACK);
										InUpColor.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InUpColor.setForeground(Color.WHITE);
										Modify.getContentPane().add(InUpColor);

										//Brand
										UpBrand = new JLabel("Brand: ");
										UpBrand.setBounds(310, 265, 200, 30);
										UpBrand.setFont(new Font("Gadugi", Font.BOLD, 20));
										UpBrand.setForeground(Color.RED);
										Modify.getContentPane().add(UpBrand);

										InUpBrand = new JTextField(10);
										InUpBrand.setBounds(470, 265, 200, 30);
										InUpBrand.setEditable(true);
										InUpBrand.setBackground(Color.BLACK);
										InUpBrand.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InUpBrand.setForeground(Color.WHITE);
										Modify.getContentPane().add(InUpBrand);

										//Type
										UpType = new JLabel("Type: ");
										UpType.setBounds(310, 305, 200, 30);
										UpType.setFont(new Font("Gadugi", Font.BOLD, 20));
										UpType.setForeground(Color.RED);
										Modify.getContentPane().add(UpType);

										InUpType = new JTextField(10);
										InUpType.setBounds(470, 305, 200, 30);
										InUpType.setEditable(true);
										InUpType.setBackground(Color.BLACK);
										InUpType.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InUpType.setForeground(Color.WHITE);
										Modify.getContentPane().add(InUpType);

										//Store Code
										UpSC = new JLabel("Store Code: ");
										UpSC.setBounds(310, 340, 200, 30);
										UpSC.setFont(new Font("Gadugi", Font.BOLD, 20));
										UpSC.setForeground(Color.RED);
										Modify.getContentPane().add(UpSC);

										InUpSC = new JTextField(10);
										InUpSC.setBounds(470, 340, 200, 30);
										InUpSC.setEditable(true);
										InUpSC.setBackground(Color.BLACK);
										InUpSC.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InUpSC.setForeground(Color.WHITE);
										Modify.getContentPane().add(InUpSC);

										//Size
										UpSize = new JLabel("Size: ");
										UpSize.setBounds(310, 375, 200, 30);
										UpSize.setFont(new Font("Gadugi", Font.BOLD, 20));
										UpSize.setForeground(Color.RED);
										Modify.getContentPane().add(UpSize);

										InUpSize = new JTextField(10);
										InUpSize.setBounds(470, 375, 200, 30);
										InUpSize.setEditable(true);
										InUpSize.setBackground(Color.BLACK);
										InUpSize.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InUpSize.setForeground(Color.WHITE);
										Modify.getContentPane().add(InUpSize);

										//Price
										UpPrice = new JLabel("Price: ");
										UpPrice.setBounds(310, 410, 200, 30);
										UpPrice.setFont(new Font("Gadugi", Font.BOLD, 20));
										UpPrice.setForeground(Color.RED);
										Modify.getContentPane().add(UpPrice);

										InUpPrice = new JTextField(10);
										InUpPrice.setBounds(470, 410, 200, 30);
										InUpPrice.setEditable(true);
										InUpPrice.setBackground(Color.BLACK);
										InUpPrice.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InUpPrice.setForeground(Color.WHITE);
										Modify.getContentPane().add(InUpPrice);

										//Discount
										UpDiscount = new JLabel("Discount: ");
										UpDiscount.setBounds(310, 445, 200, 30);
										UpDiscount.setFont(new Font("Gadugi", Font.BOLD, 20));
										UpDiscount.setForeground(Color.RED);
										Modify.getContentPane().add(UpDiscount);

										InUpDiscount = new JTextField(10);
										InUpDiscount.setBounds(470, 445, 200, 30);
										InUpDiscount.setEditable(true);
										InUpDiscount.setBackground(Color.BLACK);
										InUpDiscount.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InUpDiscount.setForeground(Color.WHITE);
										Modify.getContentPane().add(InUpDiscount);

										//Quantity
										UpQuantity = new JLabel("Quantity: ");
										UpQuantity.setBounds(310, 480, 200, 30);
										UpQuantity.setFont(new Font("Gadugi", Font.BOLD, 20));
										UpQuantity.setForeground(Color.RED);
										Modify.getContentPane().add(UpQuantity);

										InUpQuantity = new JTextField(10);
										InUpQuantity.setBounds(470, 480, 200, 30);
										InUpQuantity.setEditable(true);
										InUpQuantity.setBackground(Color.BLACK);
										InUpQuantity.setFont(new Font("Gadugi", Font.PLAIN, 18));
										InUpQuantity.setForeground(Color.WHITE);
										Modify.getContentPane().add(InUpQuantity);

										BtnEIBack = new JButton("Back");
										BtnEIBack.setBounds(500, 550, 175, 50);
										BtnEIBack.setBackground(Color.RED);
										BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnEIBack.setForeground(Color.WHITE);
										BtnEIBack.setFocusPainted(false);
										BtnEIBack.setBorderPainted(false);
										BtnEIBack.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												Modify.setVisible(false);
												InUserMenu.setVisible(true);
											}
										});
										Modify.getContentPane().add(BtnEIBack);


										BtnAdd = new JButton("Update");
										BtnAdd.setBounds(310, 550, 175, 50);
										BtnAdd.setBackground(Color.GREEN);
										BtnAdd.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnAdd.setForeground(Color.BLACK);
										BtnAdd.setFocusPainted(false);
										BtnAdd.setBorderPainted(false);
										BtnAdd.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {

												int flag=0;
												LLNode<String>UpCurrent = list;
												while(UpCurrent!=null)
												{
													if(UpCurrent.getProduct_ID().equals(InUpPid.getText()))
													{
														flag=1;
													}
													UpCurrent=UpCurrent.getLink();
												}

												if(flag==1)
												{

													Modify.setVisible(false);

													Updated = new JFrame();
													Updated.setTitle("UPDATE RESULTS");
													Updated.setBounds(250, 120, 950, 700);
													Updated.getContentPane().setBackground(Color.BLACK);
													Updated.setResizable(false);
													Updated.getContentPane().setLayout(null);
													Updated.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
													Updated.setVisible(true);

													AddedInv = new JLabel("~ Updated Inventory ~");
													AddedInv.setBounds(250, 50, 800, 50);
													AddedInv.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
													AddedInv.setForeground(Color.MAGENTA);
													Updated.getContentPane().add(AddedInv);

													new LLNode_Function().updateNameByProductId(list, InUpPid.getText(), InUpName.getText());
													new LLNode_Function().updateColorByProductId(list, InUpPid.getText(), InUpColor.getText());
													new LLNode_Function().updateBrandByProductId(list, InUpPid.getText(), InUpBrand.getText());
													new LLNode_Function().updateTypeByProductId(list, InUpPid.getText(), InUpType.getText());
													new LLNode_Function().updateStoreCodeByProductId(list, InUpPid.getText(), InUpSC.getText());
													new LLNode_Function().updateSizeByProductId(list, InUpPid.getText(), InUpSize.getText());
													new LLNode_Function().updatePriceByProductId(list, InUpPid.getText(), Double.parseDouble(InUpPrice.getText()));
													new LLNode_Function().updateDiscountByProductId(list, InUpPid.getText(), Double.parseDouble(InUpDiscount.getText()));
													new LLNode_Function().updateQuantityByProductId(list, InUpPid.getText(), Integer.parseInt(InUpQuantity.getText()));


													panel = new JPanel();
													panel.setBounds(70, 150, 800, 350);
													Updated.getContentPane().add(panel);

													DefaultTableModel tableModel = new DefaultTableModel(20, 10);
													table = new JTable(tableModel);
													table.setBounds(30, 70, 880, 100);
													panel.add(table);

													table.setValueAt("Product_ID", 0, 0);
													table.setValueAt("Product", 0, 1);
													table.setValueAt("Color", 0, 2);
													table.setValueAt("Brand", 0, 3);
													table.setValueAt("Type", 0, 4);
													table.setValueAt("Store Code", 0, 5);
													table.setValueAt("Size", 0, 6);
													table.setValueAt("Price", 0, 7);
													table.setValueAt("Discount", 0, 8);
													table.setValueAt("Quantity", 0, 9);

													LLNode<String>current=list;
													int j=2;
													int i=0;
													while(current!=null) 
													{	
														table.setValueAt(current.getProduct_ID(), j, i);
														table.setValueAt(current.getProduct(), j, i+1);
														table.setValueAt(current.getColor() , j, i+2);
														table.setValueAt(current.getBrand(), j, i+3);
														table.setValueAt(current.getType(), j, i+4);
														table.setValueAt(current.getStoreCode(), j, i+5);
														table.setValueAt(current.getSize() , j, i+6);
														table.setValueAt(current.getPrice(), j, i+7);
														table.setValueAt(current.getDiscount(), j, i+8);
														table.setValueAt(current.getQuantity() , j, i+9);
														j=j+1;
														current=current.getLink();
													}

													BtnEIBack = new JButton("Back");
													BtnEIBack.setBounds(400, 550, 175, 50);
													BtnEIBack.setBackground(Color.RED);
													BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
													BtnEIBack.setForeground(Color.WHITE);
													BtnEIBack.setFocusPainted(false);
													BtnEIBack.setBorderPainted(false);
													BtnEIBack.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															Updated.setVisible(false);
															Modify.setVisible(true);
														}
													});
													Updated.getContentPane().add(BtnEIBack);
												}
												else
												{
													JOptionPane.showConfirmDialog(null, "Please Enter Correct Product ID",
															"ERROR MESSAGE", JOptionPane.PLAIN_MESSAGE);
												}

											}
										});
										Modify.getContentPane().add(BtnAdd);
//back from update inventory window
										BtnEIBack = new JButton("Back");
										BtnEIBack.setBounds(500, 550, 175, 50);
										BtnEIBack.setBackground(Color.RED);
										BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnEIBack.setForeground(Color.WHITE);
										BtnEIBack.setFocusPainted(false);
										BtnEIBack.setBorderPainted(false);
										BtnEIBack.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												Updated.setVisible(false);
												Modify.setVisible(true);
											}
										});
										Modify.getContentPane().add(BtnEIBack);

										break;
										
									case 2: //Delete Inventory

										UpInv = new JLabel("~ Delete Inventory ~");
										UpInv.setBounds(260, 50, 800, 50);
										UpInv.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
										UpInv.setForeground(Color.MAGENTA);
										Modify.getContentPane().add(UpInv);

										UpDetails = new JLabel("Please Enter Inventory Details Below");
										UpDetails.setBounds(275, 150, 500, 50);
										UpDetails.setFont(new Font("Bell MT", Font.BOLD, 25));
										UpDetails.setForeground(Color.ORANGE);
										Modify.getContentPane().add(UpDetails);

										//Pid
										UpPid = new JLabel("Product Id: ");
										UpPid.setBounds(310, 250, 200, 50);
										UpPid.setFont(new Font("Gadugi", Font.BOLD, 22));
										UpPid.setForeground(Color.RED);
										Modify.getContentPane().add(UpPid);

										InUpPid = new JTextField(10);
										InUpPid.setBounds(470, 250, 200, 50);
										InUpPid.setEditable(true);
										InUpPid.setBackground(Color.BLACK);
										InUpPid.setFont(new Font("Gadugi", Font.PLAIN, 22));
										InUpPid.setForeground(Color.WHITE);
										Modify.getContentPane().add(InUpPid);

										BtnEIBack = new JButton("Back");
										BtnEIBack.setBounds(500, 550, 175, 50);
										BtnEIBack.setBackground(Color.RED);
										BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnEIBack.setForeground(Color.WHITE);
										BtnEIBack.setFocusPainted(false);
										BtnEIBack.setBorderPainted(false);
										BtnEIBack.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												Modify.setVisible(false);
												InUserMenu.setVisible(true);
											}
										});
										Modify.getContentPane().add(BtnEIBack);


										BtnAdd = new JButton("Remove");
										BtnAdd.setBounds(310, 550, 175, 50);
										BtnAdd.setBackground(Color.GREEN);
										BtnAdd.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnAdd.setForeground(Color.BLACK);
										BtnAdd.setFocusPainted(false);
										BtnAdd.setBorderPainted(false);
										BtnAdd.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {

												int flag=0;
												LLNode<String>UpCurrent = list;
												while(UpCurrent!=null)
												{
													if(UpCurrent.getProduct_ID().equals(InUpPid.getText()))
													{
														flag=1;
													}
													UpCurrent=UpCurrent.getLink();
												}

												if(flag==1)
												{

													Modify.setVisible(false);

													Updated = new JFrame();
													Updated.setTitle("DELETED RESULTS");
													Updated.setBounds(250, 120, 950, 700);
													Updated.getContentPane().setBackground(Color.BLACK);
													Updated.setResizable(false);
													Updated.getContentPane().setLayout(null);
													Updated.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
													Updated.setVisible(true);

													AddedInv = new JLabel("~ Delete Inventory ~");
													AddedInv.setBounds(250, 50, 800, 50);
													AddedInv.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
													AddedInv.setForeground(Color.MAGENTA);
													Updated.getContentPane().add(AddedInv);

													new LLNode_Function().deletebyproductid(list, InUpPid.getText());

													panel = new JPanel();
													panel.setBounds(70, 150, 800, 350);
													Updated.getContentPane().add(panel);

													DefaultTableModel tableModel = new DefaultTableModel(20, 10);
													table = new JTable(tableModel);
													table.setBounds(30, 70, 880, 100);
													panel.add(table);

													table.setValueAt("Product_ID", 0, 0);
													table.setValueAt("Product", 0, 1);
													table.setValueAt("Color", 0, 2);
													table.setValueAt("Brand", 0, 3);
													table.setValueAt("Type", 0, 4);
													table.setValueAt("Store Code", 0, 5);
													table.setValueAt("Size", 0, 6);
													table.setValueAt("Price", 0, 7);
													table.setValueAt("Discount", 0, 8);
													table.setValueAt("Quantity", 0, 9);

													LLNode<String>current=list;
													int j=2;
													int i=0;
													while(current!=null) 
													{	
														table.setValueAt(current.getProduct_ID(), j, i);
														table.setValueAt(current.getProduct(), j, i+1);
														table.setValueAt(current.getColor() , j, i+2);
														table.setValueAt(current.getBrand(), j, i+3);
														table.setValueAt(current.getType(), j, i+4);
														table.setValueAt(current.getStoreCode(), j, i+5);
														table.setValueAt(current.getSize() , j, i+6);
														table.setValueAt(current.getPrice(), j, i+7);
														table.setValueAt(current.getDiscount(), j, i+8);
														table.setValueAt(current.getQuantity() , j, i+9);
														j=j+1;
														current=current.getLink();
													}

													BtnEIBack = new JButton("Back");
													BtnEIBack.setBounds(400, 550, 175, 50);
													BtnEIBack.setBackground(Color.RED);
													BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
													BtnEIBack.setForeground(Color.WHITE);
													BtnEIBack.setFocusPainted(false);
													BtnEIBack.setBorderPainted(false);
													BtnEIBack.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															Updated.setVisible(false);
															Modify.setVisible(true);
														}
													});
													Updated.getContentPane().add(BtnEIBack);
												}
												else
												{
													JOptionPane.showConfirmDialog(null, "Please Enter Correct Product ID",
															"ERROR MESSAGE", JOptionPane.PLAIN_MESSAGE);
												}

											}
										});
										Modify.getContentPane().add(BtnAdd);

										BtnEIBack = new JButton("Back");
										BtnEIBack.setBounds(500, 550, 175, 50);
										BtnEIBack.setBackground(Color.RED);
										BtnEIBack.setFont(new Font("Gadugi", Font.BOLD, 20));
										BtnEIBack.setForeground(Color.WHITE);
										BtnEIBack.setFocusPainted(false);
										BtnEIBack.setBorderPainted(false);
										BtnEIBack.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												Updated.setVisible(false);
												Modify.setVisible(true);
											}
										});
										Modify.getContentPane().add(BtnEIBack);

										break;

									}
								};
							});
							InUserMenu.getContentPane().add(BtnInEdit);

//Exit to Main Menu
							BtnInExit = new JButton("Exit");
							BtnInExit.setBounds(425, 575, 100, 40);
							BtnInExit.setBackground(Color.RED);
							BtnInExit.setFont(new Font("Gadugi", Font.BOLD, 20));
							BtnInExit.setForeground(Color.WHITE);
							BtnInExit.setFocusPainted(false);
							BtnInExit.setBorderPainted(false);
							BtnInExit.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									int reply = JOptionPane.showConfirmDialog(null,
											"Thank You For Using Rainbow Inventory \n Do You Want to Go Back to Main Menu ? \n ",
											"EXIT TO MAIN MENU", JOptionPane.YES_NO_OPTION);
									if (reply == JOptionPane.YES_OPTION) {
										InUserLogin.setVisible(false);
										InUserMenu.setVisible(false);
										MainMenu.setVisible(true);
									}
									;
								}
							});
							InUserMenu.getContentPane().add(BtnInExit);

						} else {
							JOptionPane.showConfirmDialog(null, "Access Denied! \n User Credentials are Incorrect",
									"ERROR MESSAGE", JOptionPane.PLAIN_MESSAGE);
						}
					}
				});
				InUserLogin.getContentPane().add(BtnInLogin);
//back from delete window
				BtnInBack = new JButton("BACK");
				BtnInBack.setBounds(500, 420, 150, 50);
				BtnInBack.setBackground(Color.RED);
				BtnInBack.setFont(new Font("Gadugi", Font.BOLD, 15));
				BtnInBack.setForeground(Color.WHITE);
				BtnInBack.setFocusPainted(false);
				BtnInBack.setBorderPainted(false);
				BtnInBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int reply = JOptionPane.showConfirmDialog(null,
								"Thank You For Using Rainbow Inventory \n Do You Want to Go Back to Main Menu ? \n ",
								"EXIT TO MAIN MENU", JOptionPane.YES_NO_OPTION);
						if (reply == JOptionPane.YES_OPTION) {
							InUserLogin.setVisible(false);
							MainMenu.setVisible(true);
						};
					}
				});
				InUserLogin.getContentPane().add(BtnInBack);
			}
		});
		MainMenu.getContentPane().add(BtnInUser);
//exit from main menu button
		BtnMainExit = new JButton("Exit");
		BtnMainExit.setBounds(400, 450, 175, 50);
		BtnMainExit.setBackground(Color.RED);
		BtnMainExit.setFont(new Font("Gadugi", Font.BOLD, 20));
		BtnMainExit.setForeground(Color.WHITE);
		BtnMainExit.setFocusPainted(false);
		BtnMainExit.setBorderPainted(false);
		BtnMainExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int reply = JOptionPane.showConfirmDialog(null, "Thank You! Happy To Help You. \n Do You Want to Exit ? \n ", "EXIT APPLICATION", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION) System.exit(0);
			}
		});
		MainMenu.getContentPane().add(BtnMainExit);

	}
}

//end of GUI Code
