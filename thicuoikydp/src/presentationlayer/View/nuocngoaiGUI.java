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

public class nuocngoaiGUI extends JFrame {
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel tablennmodel;
	private JTextField manntxt;
	private JTextField tennntxt;
	private JTextField slnntxt;
	private JTextField dgnntxt;
	private JTextField timnntxt;
	private JTextField tongslnntxt;
	private JTextField qtnntext;
	private JTextField tbttnntext;
	private JTextField ttnntxt;
	private JMenuItem vn,exit;
	private JMenuBar menuBar;
	private JScrollPane scrollPane;
	private JButton xoabtmnn,suabtmnn,thembtmnn;
	private JComboBox comboBoxthangnn,comboBoxngaynn,comboBoxnamnn1,comboBoxnamnn2,comboBoxxuatthangnn;
	private JLabel lblNewLabel,lblHTn,lblNgyRaHa,lblSLng,lblnGi,lblXutHan,lblTmKim,lblTngSLng,lblQucTch,lblTrungBnhThnh,lblThnhTin;
	
	public nuocngoaiGUI() {
		this.setTitle("khách hàng nước ngoài");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 919, 22);
		contentPane.add(menuBar);
		
		vn = new JMenuItem("vn");
		menuBar.add(vn);
		
		exit = new JMenuItem("exit");		
		menuBar.add(exit);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 25, 909, 174);
		contentPane.add(scrollPane);
		
		table = new JTable(tablennmodel);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"mã", "họ tên", "ngày ra hóa đơn", "quốc tịch", "số lượng", "đơn giá","thành tiền"
			}
		));
		
		manntxt = new JTextField();
		manntxt.setBounds(110, 220, 134, 30);
		contentPane.add(manntxt);
		manntxt.setColumns(10);
		
		tennntxt = new JTextField();
		tennntxt.setColumns(10);
		tennntxt.setBounds(110, 260, 134, 30);
		contentPane.add(tennntxt);
		
		slnntxt = new JTextField();
		slnntxt.setColumns(10);
		slnntxt.setBounds(428, 220, 134, 30);
		contentPane.add(slnntxt);
		
		dgnntxt = new JTextField();
		dgnntxt.setColumns(10);
		dgnntxt.setBounds(428, 260, 134, 30);
		contentPane.add(dgnntxt);
		
		comboBoxthangnn = new JComboBox();
		comboBoxthangnn.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxthangnn.setBounds(100, 330, 42, 21);
		contentPane.add(comboBoxthangnn);
		
		comboBoxngaynn = new JComboBox();
		comboBoxngaynn.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxngaynn.setBounds(50, 330, 41, 21);
		contentPane.add(comboBoxngaynn);
		
		comboBoxnamnn1 = new JComboBox();
		comboBoxnamnn1.setModel(new DefaultComboBoxModel(new String[] {"2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950"}));
		comboBoxnamnn1.setBounds(150, 330, 70, 21);
		contentPane.add(comboBoxnamnn1);
		
		thembtmnn = new JButton("th\u00EAm");
		thembtmnn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		thembtmnn.setBounds(250, 400, 100, 30);
		contentPane.add(thembtmnn);
		
		xoabtmnn = new JButton("x\u00F3a");
		xoabtmnn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		xoabtmnn.setBounds(400, 400, 100, 30);
		contentPane.add(xoabtmnn);
		
		suabtmnn = new JButton("s\u1EEDa");
		suabtmnn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		suabtmnn.setBounds(550, 400, 100, 30);
		contentPane.add(suabtmnn);
		
		timnntxt = new JTextField();
		timnntxt.setColumns(10);
		timnntxt.setBounds(734, 220, 134, 30);
		contentPane.add(timnntxt);
		
		tongslnntxt = new JTextField();
		tongslnntxt.setColumns(10);
		tongslnntxt.setBounds(734, 260, 134, 30);
		contentPane.add(tongslnntxt);
		
		comboBoxxuatthangnn = new JComboBox();
		comboBoxxuatthangnn.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxxuatthangnn.setBounds(500, 340, 62, 21);
		contentPane.add(comboBoxxuatthangnn);
		
		lblNewLabel = new JLabel("m\u00E3:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(50, 220, 62, 22);
		contentPane.add(lblNewLabel);
		
		lblHTn = new JLabel("h\u1ECD t\u00EAn:");
		lblHTn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHTn.setBounds(20, 260, 91, 22);
		contentPane.add(lblHTn);
		
		lblNgyRaHa = new JLabel("ng\u00E0y ra h\u00F3a \u0111\u01A1n:");
		lblNgyRaHa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNgyRaHa.setBounds(30, 300, 167, 22);
		contentPane.add(lblNgyRaHa);
		
		lblSLng = new JLabel("s\u1ED1 l\u01B0\u1EE3ng:");
		lblSLng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSLng.setBounds(320, 220, 110, 22);
		contentPane.add(lblSLng);
		
		lblnGi = new JLabel("\u0111\u01A1n gi\u00E1:");
		lblnGi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnGi.setBounds(320, 260, 101, 22);
		contentPane.add(lblnGi);
		
		lblXutHan = new JLabel("xu\u1EA5t h\u00F3a \u0111\u01A1n th\u00E1ng:");
		lblXutHan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblXutHan.setBounds(300, 340, 215, 22);
		contentPane.add(lblXutHan);
		
		lblTmKim = new JLabel("t\u00ECm ki\u1EBFm:");
		lblTmKim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTmKim.setBounds(620, 220, 110, 22);
		contentPane.add(lblTmKim);
		
		lblTngSLng = new JLabel("t\u1ED5ng s\u1ED1 l\u01B0\u1EE3ng:");
		lblTngSLng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTngSLng.setBounds(590, 260, 134, 22);
		contentPane.add(lblTngSLng);
		
		comboBoxnamnn2 = new JComboBox();
		comboBoxnamnn2.setModel(new DefaultComboBoxModel(new String[] {"2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950"}));
		comboBoxnamnn2.setBounds(575, 340, 70, 21);
		contentPane.add(comboBoxnamnn2);
	
		
		lblQucTch = new JLabel("quốc tịch:");
		lblQucTch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQucTch.setBounds(311, 300, 110, 22);
		contentPane.add(lblQucTch);
		
		qtnntext = new JTextField();
		qtnntext.setColumns(10);
		qtnntext.setBounds(428, 300, 134, 30);
		contentPane.add(qtnntext);
		
		lblTrungBnhThnh = new JLabel("trung bình thành tiền :");
		lblTrungBnhThnh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTrungBnhThnh.setBounds(596, 300, 237, 22);
		contentPane.add(lblTrungBnhThnh);
		
		tbttnntext = new JTextField();
		tbttnntext.setColumns(10);
		tbttnntext.setBounds(711, 332, 157, 30);
		contentPane.add(tbttnntext);
		lblThnhTin = new JLabel("thành tiền:");
		lblThnhTin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblThnhTin.setBounds(684, 380, 110, 22);
		contentPane.add(lblThnhTin);
		
		ttnntxt = new JTextField();
		ttnntxt.setColumns(10);
		ttnntxt.setBounds(711, 412, 157, 30);
		contentPane.add(ttnntxt);
		
	}

}
