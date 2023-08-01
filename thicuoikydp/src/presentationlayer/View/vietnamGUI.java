package presentationlayer.View;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class vietnamGUI extends JFrame{
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel tablevnmodel;
	private JTextField matxt;
	private JTextField dmtxt;
	private JTextField tentxt;
	private JTextField sltxt;
	private JTextField dgtxt;
	private JTextField timtxt;
	private JTextField tongsltxt;
	private JTextField tttxt;
	private JMenuBar menuBar;
	private JMenuItem nn,exit;
	private JScrollPane scrollPane;
	private JComboBox comboBoxdtkh,comboBoxthang,comboBoxngay,comboBoxnam1,comboBoxxuatthang,comboBoxnam2;
	private JButton thembtm,xoabtm,suabtm;
	private JLabel 	lblNewLabel,lblHTn,lbliTngKhch,lblNgyRaHa,lblSLng,lblnGi,lblnhMc,lblXutHan,lblTmKim,lblTngSLng,lblThnhTin;

	
	public vietnamGUI() {
		this.setTitle("khách hàng việt nam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 919, 22);
		contentPane.add(menuBar);
		
		nn = new JMenuItem("nn");
		menuBar.add(nn);
		
		exit = new JMenuItem("exit");
		menuBar.add(exit);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 25, 909, 174);
		contentPane.add(scrollPane);
		
		table = new JTable(tablevnmodel);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"mã", "họ tên", "ngày ra hóa đơn", "đối tượng kh", "số lượng", "đơn giá","định mức","thành tiền"
			}
		));
		
		matxt = new JTextField();
		matxt.setBounds(110, 220, 134, 30);
		contentPane.add(matxt);
		matxt.setColumns(10);
		
		dmtxt = new JTextField();
		dmtxt.setColumns(10);
		dmtxt.setBounds(110, 300, 134, 30);
		contentPane.add(dmtxt);
		
		tentxt = new JTextField();
		tentxt.setColumns(10);
		tentxt.setBounds(110, 260, 134, 30);
		contentPane.add(tentxt);
		
		sltxt = new JTextField();
		sltxt.setColumns(10);
		sltxt.setBounds(428, 220, 134, 30);
		contentPane.add(sltxt);
		
		dgtxt = new JTextField();
		dgtxt.setColumns(10);
		dgtxt.setBounds(428, 260, 134, 30);
		contentPane.add(dgtxt);
		
		comboBoxdtkh = new JComboBox();
		comboBoxdtkh.setModel(new DefaultComboBoxModel(new String[] {"sinh hoạt", "kinh doanh", "sản xuất"}));
		comboBoxdtkh.setBounds(528, 300, 91, 21);
		contentPane.add(comboBoxdtkh);
		
		comboBoxthang = new JComboBox();
		comboBoxthang.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxthang.setBounds(100, 374, 42, 21);
		contentPane.add(comboBoxthang);
		
		comboBoxngay = new JComboBox();
		comboBoxngay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxngay.setBounds(50, 374, 41, 21);
		contentPane.add(comboBoxngay);
		
		comboBoxnam1 = new JComboBox();
		comboBoxnam1.setModel(new DefaultComboBoxModel(new String[] {"2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950"}));
		comboBoxnam1.setBounds(150, 374, 70, 21);
		contentPane.add(comboBoxnam1);
		
		
		thembtm = new JButton("th\u00EAm");
		thembtm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		thembtm.setBounds(250, 400, 100, 30);
		contentPane.add(thembtm);
		
		xoabtm = new JButton("x\u00F3a");
		xoabtm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		xoabtm.setBounds(400, 400, 100, 30);
		contentPane.add(xoabtm);
		
		suabtm = new JButton("s\u1EEDa");
		suabtm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		suabtm.setBounds(550, 400, 100, 30);
		contentPane.add(suabtm);
		
		timtxt = new JTextField();
		timtxt.setColumns(10);
		timtxt.setBounds(734, 220, 134, 30);
		contentPane.add(timtxt);
		
		tongsltxt = new JTextField();
		tongsltxt.setColumns(10);
		tongsltxt.setBounds(734, 260, 134, 30);
		contentPane.add(tongsltxt);
		
		comboBoxxuatthang = new JComboBox();
		comboBoxxuatthang.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxxuatthang.setBounds(640, 330, 62, 21);
		contentPane.add(comboBoxxuatthang);
		
		lblNewLabel = new JLabel("m\u00E3:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(50, 220, 62, 22);
		contentPane.add(lblNewLabel);
		
		lblHTn = new JLabel("h\u1ECD t\u00EAn:");
		lblHTn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHTn.setBounds(20, 260, 91, 22);
		contentPane.add(lblHTn);
		
		lbliTngKhch = new JLabel("\u0111\u1ED1i t\u01B0\u1EE3ng kh\u00E1ch h\u00E0ng:");
		lbliTngKhch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbliTngKhch.setBounds(320, 300, 235, 22);
		contentPane.add(lbliTngKhch);
		
		lblNgyRaHa = new JLabel("ng\u00E0y ra h\u00F3a \u0111\u01A1n:");
		lblNgyRaHa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNgyRaHa.setBounds(30, 340, 167, 22);
		contentPane.add(lblNgyRaHa);
		
		lblSLng = new JLabel("s\u1ED1 l\u01B0\u1EE3ng:");
		lblSLng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSLng.setBounds(320, 220, 110, 22);
		contentPane.add(lblSLng);
		
		lblnGi = new JLabel("\u0111\u01A1n gi\u00E1:");
		lblnGi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnGi.setBounds(320, 260, 101, 22);
		contentPane.add(lblnGi);
		
		lblnhMc = new JLabel("\u0111\u1ECBnh m\u1EE9c:");
		lblnhMc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnhMc.setBounds(15, 300, 101, 22);
		contentPane.add(lblnhMc);
		
		lblXutHan = new JLabel("xu\u1EA5t h\u00F3a \u0111\u01A1n th\u00E1ng:");
		lblXutHan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblXutHan.setBounds(635, 300, 215, 22);
		contentPane.add(lblXutHan);
		
		lblTmKim = new JLabel("t\u00ECm ki\u1EBFm:");
		lblTmKim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTmKim.setBounds(620, 220, 110, 22);
		contentPane.add(lblTmKim);
		
		lblTngSLng = new JLabel("t\u1ED5ng s\u1ED1 l\u01B0\u1EE3ng:");
		lblTngSLng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTngSLng.setBounds(590, 260, 134, 22);
		contentPane.add(lblTngSLng);
		
		comboBoxnam2 = new JComboBox();
		comboBoxnam2.setModel(new DefaultComboBoxModel(new String[] {"2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950"}));
		comboBoxnam2.setBounds(725, 330, 70, 21);
		contentPane.add(comboBoxnam2);
		lblThnhTin = new JLabel("thành tiền:");
		lblThnhTin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblThnhTin.setBounds(699, 373, 110, 22);
		contentPane.add(lblThnhTin);
		
		tttxt = new JTextField();
		tttxt.setColumns(10);
		tttxt.setBounds(734, 410, 134, 30);
		contentPane.add(tttxt);
	}

}
