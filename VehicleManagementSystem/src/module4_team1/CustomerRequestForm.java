package module4_team1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import module4_team1.controller.RequestFormController;
import module4_team1.dao.CustomerTableDao;
import module4_team1.dao.DealerTableDao;
import module4_team1.dao.LeadTableDao;
import module4_team1.dao.VehicleTableDao;

public class CustomerRequestForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String BLUE_CODE = "#CDE7FB";
	private static final String BLACK_CODE = "#000000";
	private static final String RED_CODE = "#F08080";

	private DealerDetails dealerDetails;
	private VehicleDetails carDetails;
	
	private JLabel firstNameLabel, lastNameLabel, emailLabel, phoneNumLabel, carsDetailLabel, messageLabel,
			dealerInfoLabel, interestedPeopleLabel;
	private JTextField firstNameField, lastNameField, emailField, phoneNumField;
	private JButton submitButton;
	private JTextArea messageArea, dealerDetailsField, carDetailsField;

	private CustomerRequestForm(RequestFormController requestFormController, VehicleDetails carDetails,
			DealerDetails dealerDetails, int interestedPeopleCount) {
		this.carDetails = carDetails;
		this.dealerDetails = dealerDetails;
		create(carDetails, dealerDetails, interestedPeopleCount);
		addPanel();
	}

	private void create(VehicleDetails carDetails, DealerDetails dealerDetails, int interestedPeopleCount) {
		firstNameLabel = createJLabel("First Name  ", BLACK_CODE);
		lastNameLabel = createJLabel("   Last Name   ", BLACK_CODE);
		emailLabel = createJLabel("     Email       ", BLACK_CODE);
		phoneNumLabel = createJLabel("Phone Number", BLACK_CODE);
		carsDetailLabel = createJLabel(
				"Car Detail                                                                                       ",
				BLACK_CODE);
		dealerInfoLabel = createJLabel(
				"Dealer Information                                                                           ",
				BLACK_CODE);
		messageLabel = createJLabel("Write any message to the dealer in below box                               ",
				BLACK_CODE);
		interestedPeopleLabel = createJLabel(
				String.format("%d people viewed this Car                                     ", interestedPeopleCount),
				RED_CODE);

		carDetailsField = new JTextArea(3, 36);
		carDetailsField.setText(carDetails.getDetails());
		carDetailsField.setEditable(false);

		dealerDetailsField = new JTextArea(3, 36);
		dealerDetailsField.setText(dealerDetails.getDetails());
		dealerDetailsField.setEditable(false);

		firstNameField = new JTextField(10);
		lastNameField = new JTextField(10);
		emailField = new JTextField(10);
		phoneNumField = new JTextField(10);

		messageArea = new JTextArea(6, 36);

		submitButton = new JButton("Submit");
		submitButton.setAlignmentX(RIGHT_ALIGNMENT);

	}

	private void addPanel() {
		Container con = getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		con.setBackground(Color.decode(BLUE_CODE));

		addInformationPanel(con);
		addCarDealerPanel(con);
		addMessagePanel(con);
		addSubmitPanel(con);
	}

	private void addInformationPanel(Container con) {
		JPanel customerInfoPanel = new JPanel();
		customerInfoPanel.setLayout(new BoxLayout(customerInfoPanel, BoxLayout.Y_AXIS));
		setBackGround(customerInfoPanel);

		JPanel phoneEmailPanel = new JPanel();
		addPanel(phoneEmailPanel, phoneNumLabel, phoneNumField, emailLabel, emailField);
		setBackGround(phoneEmailPanel);
		customerInfoPanel.add(phoneEmailPanel);

		JPanel customerNamePanel = new JPanel();
		setBackGround(customerNamePanel);
		addPanel(customerNamePanel, firstNameLabel, firstNameField, lastNameLabel, lastNameField);
		customerInfoPanel.add(customerNamePanel);

		con.add(customerInfoPanel);
		con.add(Box.createVerticalGlue());
	}

	/**
	 * Function to add car and dealer panel
	 * 
	 * @param con
	 */
	private void addCarDealerPanel(Container con) {
		JPanel informationPanel = new JPanel();
		informationPanel.setLayout(new BoxLayout(informationPanel, BoxLayout.Y_AXIS));
		setBackGround(informationPanel);

		JPanel carDetailsTitle = new JPanel();
		addPanel(carDetailsTitle, carsDetailLabel);
		informationPanel.add(carDetailsTitle);

		JPanel carDetailsFieldPanel = new JPanel();
		addPanel(carDetailsFieldPanel, carDetailsField);
		informationPanel.add(carDetailsFieldPanel);

		JPanel dealerInfoLabelPanel = new JPanel();
		addPanel(dealerInfoLabelPanel, dealerInfoLabel);
		informationPanel.add(dealerInfoLabelPanel);

		JPanel dealerDetailsFieldPanel = new JPanel();
		addPanel(dealerDetailsFieldPanel, dealerDetailsField);
		informationPanel.add(dealerDetailsFieldPanel);

		con.add(informationPanel);
		con.add(Box.createVerticalGlue());
	}

	private void addMessagePanel(Container con) {
		JPanel messagePanel = new JPanel();
		messagePanel.setLayout(new BoxLayout(messagePanel, BoxLayout.Y_AXIS));
		setBackGround(messagePanel);

		JPanel messageLabelPanel = new JPanel();
		setBackGround(messageLabelPanel);
		messageLabelPanel.add(messageLabel);
		messagePanel.add(messageLabelPanel);

		JPanel messageAreaPanel = new JPanel();
		setBackGround(messageAreaPanel);
		messageAreaPanel.add(messageArea);
		messagePanel.add(messageAreaPanel);

		con.add(messagePanel);
		con.add(Box.createVerticalGlue());
	}

	/**
	 * Function to add Submit button Panel
	 * 
	 * @param con
	 */
	private void addSubmitPanel(Container con) {
		addPanel(con, interestedPeopleLabel, submitButton);
	}

	private void addPanel(JPanel panel, Component a) {
		setBackGround(panel);
		panel.add(a);
	}

	private void addPanel(Container con, Component a, Component b) {
		JPanel panel = new JPanel();
		setBackGround(panel);
		panel.add(a);
		panel.add(b);
		con.add(panel);
	}

	private void addPanel(JPanel panel, Component a, Component b, Component c, Component d) {
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
	}

	private JLabel createJLabel(String text, String colorCode) {
		JLabel label = new JLabel(text);
		label.setForeground(Color.decode(colorCode));
		label.setFont(new Font("Aerial", Font.BOLD, 12));
		label.setHorizontalTextPosition(JLabel.LEFT);
		return label;
	}

	private void setBackGround(JPanel panel) {
		panel.setBackground(Color.decode(BLUE_CODE));
	}

	public void addActionListener() {
		submitButton.addActionListener((ActionEvent ae) -> {
			UserOperations.getInstance().addUserDetailsToDB(firstNameField.getText(), lastNameField.getText(),
					emailField.getText(), phoneNumField.getText(), messageArea.getText(), dealerDetails.getId(),
					carDetails.getId());
			System.exit(0);
		});
	}

	public static void main(String[] args) {
		RequestFormController controller = new RequestFormController(new VehicleTableDao(), new DealerTableDao(),
				new CustomerTableDao(), new LeadTableDao());
		JFrame f = controller.createRequestForm("CARID", "DEALERID");
		f.setTitle("Customer Request Form");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600, 600);
		f.setVisible(true);
	}

	public static class RequestFormBuilder {
		private VehicleDetails vehicleDetails;
		private DealerDetails dealerDetails;
		private int interestedPeopleCount;
		private RequestFormController requestFormController;

		public RequestFormBuilder withCarDetails(VehicleDetails carDetails) {
			this.vehicleDetails = carDetails;
			return this;
		}

		public RequestFormBuilder withDealerDetails(DealerDetails dealerDetails) {
			this.dealerDetails = dealerDetails;
			return this;
		}

		public RequestFormBuilder withInterestedPeopleCount(int interestedPeopleCount) {
			this.interestedPeopleCount = interestedPeopleCount;
			return this;
		}

		public RequestFormBuilder withRequestFormController(RequestFormController requestFormController) {
			this.requestFormController = requestFormController;
			return this;
		}

		public CustomerRequestForm build() {
			return new CustomerRequestForm(requestFormController, vehicleDetails, dealerDetails, interestedPeopleCount);
		}
	}
}