package module4.team1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class CustomerRequestForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtLastName, txtFirstName, txtEmail, txtContactNumber, txtCarDetails, txtDealerDetails;
	private JLabel lblLastname, lblFirstName, lblEmail, lblContactNumber, lblCarDetails, lblDealerDetails, 
					lblMessage, lblPeopleInterestedIn;
	private JTextArea txtMessage;
	private JButton btnSubmit;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRequestForm frame = new CustomerRequestForm();
					frame.setTitle("Customer Request Form");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void create() {

		lblFirstName = new JLabel("First Name");
		lblLastname = new JLabel("Last Name");
		lblEmail = new JLabel("Email");
		lblContactNumber = new JLabel("Contact Number");
		lblCarDetails = new JLabel("Car Details");
		lblDealerDetails = new JLabel("Dealer Details");
		lblMessage = new JLabel("Message");
		lblPeopleInterestedIn = new JLabel("People Interested in car");
		
		txtLastName = new JTextField(10);
		txtFirstName = new JTextField(10);
		txtEmail = new JTextField(10);
		txtContactNumber = new JTextField(10);
		txtCarDetails = new JTextField(10);
		txtDealerDetails = new JTextField(10);
		txtMessage = new JTextArea();
		
		btnSubmit = new JButton("Submit");
	}
	
	
	/**
	 * Create the frame.
	 */
	public CustomerRequestForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		create();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		createHorizontalGroup(gl_contentPane);
		createVerticalGroup(gl_contentPane);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void createHorizontalGroup(GroupLayout gl_contentPane) {
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblCarDetails, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblContactNumber, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addComponent(lblDealerDetails, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
									.addComponent(lblMessage, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED))
							.addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(Alignment.LEADING, gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(2)
									.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
									.addComponent(lblLastname, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6))
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtMessage)
								.addComponent(txtContactNumber, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDealerDetails, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
								.addComponent(txtCarDetails)))
						.addGap(70))
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(19)
						.addComponent(lblPeopleInterestedIn, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
						.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addGap(48))
			);
	}
	
	private void createVerticalGroup(GroupLayout gl_contentPane) {
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(30)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblFirstName)
							.addComponent(lblLastname)
							.addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(26)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblEmail)
							.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(26)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblContactNumber)
							.addComponent(txtContactNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCarDetails)
							.addComponent(txtDealerDetails, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGap(20)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblDealerDetails)
							.addComponent(txtCarDetails, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
						.addGap(27)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(lblMessage)
							.addComponent(txtMessage, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
						.addGap(71)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnSubmit)
							.addComponent(lblPeopleInterestedIn))
						.addContainerGap(31, Short.MAX_VALUE))
			);
	}
	
}