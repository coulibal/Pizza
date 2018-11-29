package de.thb.fim.pizzaPronto.gui.view;



import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import de.thb.fim.pizzaPronto.datenobjekt.Geschlecht;
import de.thb.fim.pizzaPronto.datenobjekt.KundeVO;

public class KundeGUIContentView extends Panel {
	private static final long serialVersionUID = 1L;
	private JPanel panelLabel = new JPanel(new GridLayout(9, 1, 5, 5));
//	private JPanel panelButons = new JPanel(new GridLayout(9, 1, 5, 5));
	private JLabel labelStrassennummer = new JLabel("Strassennummer");
	private JPanel panelText = new JPanel(new GridLayout(9, 1, 5, 5));

	private JLabel labelID = new JLabel("ID");;
	private JLabel labelNachname = new JLabel("Nachname");
	private JLabel labelVorname = new JLabel("Vorname");					
	private JLabel labelGeschlecht = new JLabel("Geschlecht");
	private JLabel labelGeburtsdatum = new JLabel("Geburtsdatum");
	private JLabel labelStrasse = new JLabel("Strasse");
	private JLabel labelAlter = new JLabel("Alter");
	private JLabel labelFehlermeldung = new JLabel("Fehlermeldung");
	Object[] geschlecht = new Object[] { "männlich", "weiblich", "unbekannt,Intersexuel" };
	private JComboBox<Geschlecht> comboBoxGeschlecht = new JComboBox<Geschlecht>();

	private JTextField TextFieldID = new JTextField("ID");
	private JTextField textFieldNachname = new JTextField("nachname");
	private JTextField TextFieldVorname = new JTextField("vorname");
	private JTextField TextFieldGeburtsdatum = new JTextField("GeburtsDatum");
	private JTextField TextFieldStrasse = new JTextField("strase");
	private JTextField TextFieldStrassennummer = new JTextField("Strassennumer");
	private JTextField TextFieldAlter = new JTextField("Alter");
	private JTextField TextFieldSpeisekarte = new JTextField("SpeiseKarte");
	private JTextField TextFieldFehlermeldung = new JTextField("Meldung fehler");
	private JButton buttonEingeben = new JButton("buttonEingeben");
//	private GridBagLayout gbl;
	private JLabel labelAktuelleKunden = new JLabel("aktuelleKunden");
	private JComboBox<KundeVO> comboBoxKunden = new JComboBox<KundeVO>();

	public KundeGUIContentView() {
		TextFieldStrasse.setVisible(true);
		TextFieldID.setVisible(true);
		TextFieldVorname.setVisible(true);
		textFieldNachname.setVisible(true);
		TextFieldAlter.setVisible(true);
		TextFieldStrassennummer.setVisible(true);
		TextFieldSpeisekarte.setVisible(true);
		TextFieldGeburtsdatum.setVisible(true);
		TextFieldFehlermeldung.setVisible(true);
		comboBoxGeschlecht.setVisible(true);
		buttonEingeben.setVisible(true);
		labelAktuelleKunden.setVisible(true);
		comboBoxGeschlecht.setVisible(true);
		comboBoxKunden.setVisible(true);
		panelLabel.setVisible(true);
		panelText.setVisible(true);
		labelAlter.setVisible(true);
		labelID.setVisible(true);
		labelNachname.setVisible(true);
		labelVorname.setVisible(true);
		labelFehlermeldung.setVisible(true);
		labelStrassennummer.setVisible(true);
		labelGeschlecht.setVisible(true);
		labelGeburtsdatum.setVisible(true);
		labelStrasse.setVisible(true);
	}
//
//	//private void initializeLabelText() {
////
//	}
//
//	private void setLayout(GridBagLayout gbl) {
//		gbl = new GridBagLayout();
//		this.setLayout(gbl);
//	}
//
//	private void initializeButtons() {
//		panelButons.setVisible(true);
//
//	}
//
//	private void initializeFehlermeldung() {
//		TextFieldGeburtsdatum.setInputVerifier(new InputVerifier() {
//			public boolean verify(JComponent input) {
//				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.y");
//				boolean res = true;
//				JTextComponent tc = (JTextComponent) input;
//				String newContent = tc.getText();
//				if (newContent.length() > 0) {
//					try {
//						LocalDate.parse(newContent, formatter);
//					} catch (DateTimeParseException ex) {
//						tc.selectAll();
//						res = false;
//					}
//				}
//				return res;
//			}
//		});
//
//	}

//	private void loadGeschlecht() {
//		comboBoxGeschlecht.removeAllItems();
//		comboBoxGeschlecht.addItem(Geschlecht.M);
//		comboBoxGeschlecht.addItem(Geschlecht.W);
//		comboBoxGeschlecht.addItem(Geschlecht.I);
//		comboBoxGeschlecht.addItem(Geschlecht.U);
//	}
//
//	private void addComponent(Component c, int x, int y, int width, int height, int weightx, double weighty) {
//		GridBagConstraints gbc = new GridBagConstraints();
//		gbc.fill = GridBagConstraints.BOTH;
//		gbc.insets = new Insets(10, 10, 10, 10);
//		gbc.gridx = x;
//		gbc.gridx = y;
//
//		gbc.gridwidth = width;
//		gbc.gridheight = height;
//		gbc.weightx = weightx;
//		gbc.weighty = weighty;
//		gbl.setConstraints(c, gbc);
//
//		this.add(c);
//	}

}
