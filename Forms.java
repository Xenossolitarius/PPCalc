import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Forms {

	private JFrame frmPpCalcBy;
	private JTextField buyer;
	private JTextField vehiclemod;
	private JTextField vehicleprice;
	private JTextField oldprice;
	private JTextField pp;
	private JTextField newcarprice;
	private JTextField pdv;
	private JTextField co2;
	private JTextField enginepow;
	private JTextField enginecc;
	private ButtonGroup fuel = new ButtonGroup();
	private ButtonGroup speciality = new ButtonGroup();
	private ButtonGroup emclass = new ButtonGroup();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forms window = new Forms();
					window.frmPpCalcBy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Forms() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPpCalcBy = new JFrame();
		frmPpCalcBy.setTitle("PP CALC by Ivan Pe\u0161i\u0107");
		frmPpCalcBy.setBounds(100, 100, 800, 600);
		frmPpCalcBy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPpCalcBy.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 764, 205);
		frmPpCalcBy.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBuyer = new JLabel("Buyer");
		lblBuyer.setBounds(10, 11, 46, 14);
		panel.add(lblBuyer);
		
		buyer = new JTextField();
		buyer.setHorizontalAlignment(SwingConstants.LEFT);
		buyer.setBounds(124, 8, 125, 20);
		panel.add(buyer);
		buyer.setColumns(10);
		
		JLabel lblCarModel = new JLabel("Vehicle model");
		lblCarModel.setBounds(10, 42, 104, 14);
		panel.add(lblCarModel);
		
		vehiclemod = new JTextField();
		vehiclemod.setHorizontalAlignment(SwingConstants.LEFT);
		vehiclemod.setColumns(10);
		vehiclemod.setBounds(124, 39, 125, 20);
		panel.add(vehiclemod);
		
		JLabel lblCarPrice = new JLabel("Vehicle price");
		lblCarPrice.setBounds(10, 72, 79, 14);
		panel.add(lblCarPrice);
		
		vehicleprice = new JTextField();
		vehicleprice.setHorizontalAlignment(SwingConstants.RIGHT);
		vehicleprice.setColumns(10);
		vehicleprice.setBounds(124, 70, 125, 20);
		panel.add(vehicleprice);
		
		JLabel lblOldVehiclePrice = new JLabel("Old price");
		lblOldVehiclePrice.setBounds(10, 100, 79, 14);
		panel.add(lblOldVehiclePrice);
		
		oldprice = new JTextField();
		oldprice.setHorizontalAlignment(SwingConstants.RIGHT);
		oldprice.setText("0");
		oldprice.setColumns(10);
		oldprice.setBounds(124, 97, 125, 20);
		panel.add(oldprice);
		
		JLabel lblPpValue = new JLabel("PP value");
		lblPpValue.setBounds(471, 14, 79, 14);
		panel.add(lblPpValue);
		
		JLabel lblNewCarPrice = new JLabel("New car price");
		lblNewCarPrice.setBounds(471, 45, 112, 14);
		panel.add(lblNewCarPrice);
		
		JLabel lblPdv = new JLabel("PDV");
		lblPdv.setBounds(471, 78, 46, 14);
		panel.add(lblPdv);
		
		pp = new JTextField();
		pp.setHorizontalAlignment(SwingConstants.RIGHT);
		pp.setBounds(572, 11, 125, 20);
		panel.add(pp);
		pp.setColumns(10);
		
		newcarprice = new JTextField();
		newcarprice.setHorizontalAlignment(SwingConstants.RIGHT);
		newcarprice.setColumns(10);
		newcarprice.setBounds(572, 42, 125, 20);
		panel.add(newcarprice);
		
		pdv = new JTextField();
		pdv.setHorizontalAlignment(SwingConstants.RIGHT);
		pdv.setColumns(10);
		pdv.setBounds(572, 72, 125, 20);
		panel.add(pdv);
		
		JLabel lblKn = new JLabel("kn");
		lblKn.setBounds(259, 72, 46, 14);
		panel.add(lblKn);
		
		JLabel label = new JLabel("kn");
		label.setBounds(259, 100, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("kn");
		label_1.setBounds(707, 14, 46, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("kn");
		label_2.setBounds(707, 42, 46, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("kn");
		label_3.setBounds(707, 72, 46, 14);
		panel.add(label_3);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 227, 764, 323);
		frmPpCalcBy.getContentPane().add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Car", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblCoEmission = new JLabel("CO2 Emission");
		lblCoEmission.setBounds(10, 27, 141, 14);
		panel_1.add(lblCoEmission);
		
		co2 = new JTextField();
		co2.setHorizontalAlignment(SwingConstants.RIGHT);
		co2.setBounds(10, 48, 86, 20);
		panel_1.add(co2);
		co2.setColumns(10);
		
		JRadioButton petrol = new JRadioButton("Petrol");
		petrol.setSelected(true);
		petrol.setBounds(10, 125, 109, 23);
		panel_1.add(petrol);
		
		JRadioButton diesel = new JRadioButton("Diesel");
		diesel.setBounds(10, 151, 109, 23);
		panel_1.add(diesel);
		
		JRadioButton none = new JRadioButton("None");
		none.setSelected(true);
		none.setBounds(190, 95, 109, 23);
		panel_1.add(none);
		
		JRadioButton seat9 = new JRadioButton("9-seat");
		seat9.setBounds(190, 125, 109, 23);
		panel_1.add(seat9);
		
		JRadioButton seat8 = new JRadioButton("8-seat");
		seat8.setBounds(190, 151, 109, 23);
		panel_1.add(seat8);
		
		JRadioButton camper = new JRadioButton("Camper");
		camper.setBounds(190, 177, 109, 23);
		panel_1.add(camper);
		
		JLabel lblSpecialCategory = new JLabel("Special category");
		lblSpecialCategory.setBounds(191, 74, 123, 14);
		panel_1.add(lblSpecialCategory);
		
		JLabel lblFuelType = new JLabel("Fuel type");
		lblFuelType.setBounds(10, 104, 70, 14);
		panel_1.add(lblFuelType);
		
		JButton btnCalculate1 = new JButton("Calculate");
		btnCalculate1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(vehicleprice.getText().isEmpty() ){
					JOptionPane.showMessageDialog(null, 
                            "Vehicle price field is empty", 
                            "Error", 
                            JOptionPane.WARNING_MESSAGE);
					
				return;
					
					
					
				}
				
				if(co2.getText().isEmpty() ){
					JOptionPane.showMessageDialog(null, 
                            "CO2 field is empty", 
                            "Error", 
                            JOptionPane.WARNING_MESSAGE);
					
					return;
				}
				
					
					double carprice=Double.parseDouble(vehicleprice.getText());
					int carco2= Integer.parseInt(co2.getText());
					double pc;
					double carpdv=0.0;
					int en=0;
					int on=0;
					double pcpercent=0.0;
					double popust=0.0;
					double koef=0.0;
					double oldcarprice=Double.parseDouble(oldprice.getText());
					
					//JOptionPane.showMessageDialog(null, carprice,"Error",JOptionPane.WARNING_MESSAGE);
					if(carprice<0.0) {
						JOptionPane.showMessageDialog(null, 
	                            "You are cheap dear Sir!", 
	                            "Error", 
	                            JOptionPane.WARNING_MESSAGE);
						return;
					} 
					
					if(carprice>0.0 && carprice <= 100000.0){
						pcpercent=1.0;
					}else if(carprice>100000.01 && carprice <=150000.0){
						pcpercent = 2.0;
					}else if(carprice>150000.01 && carprice <=200000.0){
						pcpercent = 4.0;
					}else if(carprice>200000.01 && carprice <=250000.0){
						pcpercent = 6.0;
					}else if(carprice>250000.01 && carprice <=300000.0){
						pcpercent = 7.0;
					}else if(carprice>300000.01 && carprice <=350000.0){
						pcpercent=8.0;
					}else if(carprice>350000.01 && carprice <=400000.0){
						pcpercent=9.0;
					}else if(carprice>400000.01 && carprice <=500000.0){
						pcpercent=15.0;
					}else if(carprice>500000.01 && carprice <=600000.0){
						pcpercent=20.0;
					}else if(carprice>600000.01){
						pcpercent = 25.0;
					}
					
					pc=carprice/100.0;
					pc=pc*pcpercent;
					
					/*JOptionPane.showMessageDialog(null, 
                            pc, 
                            "Error", 
                            JOptionPane.WARNING_MESSAGE);*/
					
					if(diesel.isSelected()){
						if(carco2<70){
							en=0;
							on=0;
						}else if(carco2>=70 && carco2<85){
							on=185;
							en=(carco2-70)*55;
						}else if(carco2>=85 && carco2<120){
							on=1010;
							en=(carco2-85)*175;
						}else if(carco2>=120 && carco2<140){
							on=7135;
							en=(carco2-120)*1150;
						}else if(carco2>=140 && carco2<170){
							on=30135;
							en=(carco2-140)*1250;
						}else if(carco2>=170 && carco2<200){
							on=67635;
							en=(carco2-170)*1350;
						}else if(carco2>=200){
							on=108135;
							en=(carco2-200)*1450;
						}
					}else if(petrol.isSelected()){
					  if(carco2<75){
						  on=0;
						  en=0;
					  }else if(carco2>=75 && carco2<90){
						  on=95;
						  en=(carco2-75)*35;
					  }else if(carco2>=90 && carco2<120){
						  on=620;
						  en=(carco2-90)*135;
					  }else if(carco2>=120 && carco2<140){
						  on=4670;
						  en=(carco2-120)*450;
					  }else if(carco2>=140 && carco2<170){
						  on=13670;
						  en=(carco2-140)*700;
					  }else if(carco2>=170 && carco2<200){
						  on=34670;
						  en=(carco2-170)*1200;
					  }else if(carco2>=200){
						  on=70670;
						  en=(carco2-200)*1300;
					  }
					
					
					}
						
					pc = pc + (double)on + (double)en;
					
				   if(none.isSelected()){
					   
				   }else if(seat9.isSelected()){
				    pc = pc - (pc*75.0/100.0);
				   }else if(seat8.isSelected()){
					pc = pc - (pc*50.0/100.0);
				   }else if(camper.isSelected()){
					pc = pc - (pc*85.0/100.0);
				   }
				   
				   
				
				   
				   
					
				if(oldcarprice != 0.0){
					koef=carprice/oldcarprice;
					pc=pc*koef;
					}
				
				
				pp.setText(String.valueOf(pc));
				
				carpdv = carprice*25.0/100.0;
				pdv.setText(String.valueOf(carpdv));
				
				newcarprice.setText(String.valueOf(carprice+pc));
				
				
						
						
						
						
						
					}	
		});
		btnCalculate1.setBounds(84, 245, 89, 23);
		panel_1.add(btnCalculate1);
		
		JLabel lblNewLabel = new JLabel("g/km");
		lblNewLabel.setBounds(105, 51, 46, 14);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Pickup", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnCalculate2 = new JButton("Calculate");
		btnCalculate2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				if(vehicleprice.getText().isEmpty() ){
					JOptionPane.showMessageDialog(null, 
                            "Vehicle price field is empty", 
                            "Error", 
                            JOptionPane.WARNING_MESSAGE);
					
				return;
				}
				
				
				if(enginepow.getText().isEmpty() ){
					JOptionPane.showMessageDialog(null, 
                            "Engine power field is empty", 
                            "Error", 
                            JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				double carprice=Double.parseDouble(vehicleprice.getText());
				double pc;
				double carpdv=0.0;
				double oldcarprice=Double.parseDouble(oldprice.getText());
				double koef=0.0;
				double carenginepow=Double.parseDouble(enginepow.getText());
				
				
				pc=carenginepow*225.0;
				
		
				
				if(oldcarprice != 0.0){
					koef=carprice/oldcarprice;
					pc=pc*koef;
					}
				
				
				pp.setText(String.valueOf(pc));
				
				carpdv = carprice*25.0/100.0;
				pdv.setText(String.valueOf(carpdv));
				
				newcarprice.setText(String.valueOf(carprice+pc));
				
				
				
				
				
				
				
				
			}
		});
		btnCalculate2.setBounds(84, 245, 89, 23);
		panel_2.add(btnCalculate2);
		
		JLabel lblEnginePower = new JLabel("Engine power");
		lblEnginePower.setBounds(10, 36, 81, 14);
		panel_2.add(lblEnginePower);
		
		enginepow = new JTextField();
		enginepow.setHorizontalAlignment(SwingConstants.RIGHT);
		enginepow.setBounds(10, 61, 110, 20);
		panel_2.add(enginepow);
		enginepow.setColumns(10);
		
		JLabel lblKw = new JLabel("kW");
		lblKw.setBounds(130, 64, 46, 14);
		panel_2.add(lblKw);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Motorcycle/ATV", null, panel_3, null);
		panel_3.setLayout(null);
		
		JRadioButton euro_4 = new JRadioButton("EURO IV");
		euro_4.setSelected(true);
		euro_4.setBounds(254, 54, 109, 23);
		panel_3.add(euro_4);
		
		JRadioButton euro_3 = new JRadioButton("EURO III");
		euro_3.setBounds(254, 80, 109, 23);
		panel_3.add(euro_3);
		
		JRadioButton euro_2 = new JRadioButton("EURO II");
		euro_2.setBounds(254, 106, 109, 23);
		panel_3.add(euro_2);
		
		JRadioButton euro_1 = new JRadioButton("EURO I");
		euro_1.setBounds(254, 131, 109, 23);
		panel_3.add(euro_1);
		
		JButton btnCalculate3 = new JButton("Calculate");
		btnCalculate3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(vehicleprice.getText().isEmpty() ){
					JOptionPane.showMessageDialog(null, 
                            "Vehicle price field is empty", 
                            "Error", 
                            JOptionPane.WARNING_MESSAGE);
					
				return;
				}
				
				
				if(enginecc.getText().isEmpty() ){
					JOptionPane.showMessageDialog(null, 
                            "Engine cc field is empty", 
                            "Error", 
                            JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				double carprice=Double.parseDouble(vehicleprice.getText());
				double pc = 0.0;
				double carpdv=0.0;
				double oldcarprice=Double.parseDouble(oldprice.getText());
				int koef=0;
				double koefraz = 0.0;
				double carenginecc=Double.parseDouble(enginecc.getText());
				
				if(carenginecc<=50 ){
					koef=0;
				}else if (carenginecc>=51 && carenginecc <=125){
					koef = 4;	
				}else if (carenginecc>=126 && carenginecc <=300){
					 koef = 6;	
				}else if (carenginecc>=301 && carenginecc <=700){
					 koef = 7;	
				}else if (carenginecc>=701 && carenginecc <=1000){
					 koef = 8;	
				}else if (carenginecc>=1001){
					 koef = 10;	
				}
				
				
				if(euro_1.isSelected()){
				    koef = koef+15;
				}else if(euro_2.isSelected()){
					koef = koef + 10;
				}else if(euro_3.isSelected()){
					koef = koef + 5;
				}else if(euro_4.isSelected()){
					
				}
				
				pc=carenginecc*(double)koef;
				
				
				
		
				
				if(oldcarprice != 0.0){
					koefraz=carprice/oldcarprice;
					pc=pc*koefraz;
					}
				
				
				pp.setText(String.valueOf(pc));
				
				carpdv = carprice*25.0/100.0;
				pdv.setText(String.valueOf(carpdv));
				
				newcarprice.setText(String.valueOf(carprice+pc));
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnCalculate3.setBounds(84, 245, 89, 23);
		panel_3.add(btnCalculate3);
		
		JLabel lblNewLabel_1 = new JLabel("Engine volume displacement ");
		lblNewLabel_1.setBounds(10, 30, 202, 14);
		panel_3.add(lblNewLabel_1);
		
		enginecc = new JTextField();
		enginecc.setHorizontalAlignment(SwingConstants.RIGHT);
		enginecc.setBounds(20, 55, 122, 20);
		panel_3.add(enginecc);
		enginecc.setColumns(10);
		
		JLabel lblCm = new JLabel("cm");
		lblCm.setBounds(152, 58, 46, 14);
		panel_3.add(lblCm);
		
		JLabel label_4 = new JLabel("3");
		label_4.setBounds(166, 55, 46, 14);
		panel_3.add(label_4);
		
	
		
		JLabel lblEmissionClass = new JLabel("Emission class");
		lblEmissionClass.setBounds(255, 30, 108, 14);
		panel_3.add(lblEmissionClass);
		frmPpCalcBy.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{buyer, vehiclemod, vehicleprice, oldprice, tabbedPane, panel_1, co2, petrol, diesel, none, seat9, seat8, camper, btnCalculate1, panel_2, enginepow, btnCalculate2, panel_3, enginecc, euro_4, euro_3, euro_2, euro_1, btnCalculate3}));
	
		fuel.add(petrol);
		fuel.add(diesel);
		
		speciality.add(none);
		speciality.add(seat9);
		speciality.add(seat8);
		speciality.add(camper);
		
		emclass.add(euro_4);
		emclass.add(euro_3);
		emclass.add(euro_2);
		emclass.add(euro_1);
	}
}
