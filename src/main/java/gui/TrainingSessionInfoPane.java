package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import models.Employee;
import models.TrainingInfo;
import models.TrainingSession;
 
public class TrainingSessionInfoPane extends JPanel {
	
	private JButton btnBack;
	private JTextArea txtGeneralInfo;
	private JTextArea txtExamInfo;
	private JTextArea txtPaymentInfo;
	private JButton btnCancelTrainingSession;
	private JLabel lblTrainingSessionTitle;
	private JButton btnInfo;
	private JButton btnEnlistedPeople;
	private JButton btnBooks;
	private JButton btnTraining;
	private JButton btnEmployees;
	private JButton btnStatistics;
	private JButton btnTrainingsession;
	private JButton btnMaps;
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
	ConcurrentMap<Integer, TrainingSession> listTrainingssessions=dataAccess.Cache.trainingSessionCache.asMap();
	ConcurrentMap<Integer, TrainingInfo> listTraingInfo=dataAccess.Cache.trainingInfoCache.asMap();	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Create the panel.
	 */
	public TrainingSessionInfoPane() {
		
		
		setBorder(new EmptyBorder(20, 20, 20, 20));
		setLayout(null);
		
		  Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
	        
		  btnTraining = new JButton("Training"); 
		  btnTraining.setBackground(Color.WHITE);
		  btnTraining.setHorizontalAlignment(SwingConstants.CENTER);
		  btnTraining.setOpaque(true);
		  btnTraining.setActionCommand("TrainingMenu");
		  btnTraining.setBounds(124, 0, 264, 75);
	        add(btnTraining);
	        
	        btnTrainingsession = new JButton("Training session");
	        btnTrainingsession.setBackground(Color.WHITE);
	        btnTrainingsession.setHorizontalAlignment(SwingConstants.CENTER);
	        btnTrainingsession.setOpaque(true);
	        btnTrainingsession.setActionCommand("TrainingSessionMenu");
	        btnTrainingsession.setBounds(387, 0, 264, 75);
	        add(btnTrainingsession);
	        
	        btnEmployees = new JButton("Employees");
	        btnEmployees.setBackground(Color.WHITE);
	        btnEmployees.setHorizontalAlignment(SwingConstants.CENTER);
	        btnEmployees.setOpaque(true);
	        btnEmployees.setActionCommand("EmployeesMenu");
	        btnEmployees.setBounds(650, 0, 264, 75);
	        add(btnEmployees);
	        
	        btnStatistics = new JButton("Statistics");
	        btnStatistics.setBackground(Color.WHITE);
	        btnStatistics.setHorizontalAlignment(SwingConstants.CENTER);
	        btnStatistics.setOpaque(true);
	        btnStatistics.setActionCommand("StatisticsMenu");
	        btnStatistics.setBounds(912, 0, 264, 75);
	        add(btnStatistics);
	        
	        JLabel lblNewLabel = new JLabel("logo");
	        lblNewLabel.setBounds(0, 0, 133, 75);
	        lblNewLabel.setOpaque(true);
	        add(lblNewLabel);
	        
	        JLabel lblNewLabel_1 = new JLabel("Profiel");
	        lblNewLabel_1.setBounds(1186, 0, 85, 75);
	        lblNewLabel_1.setOpaque(true);
	        add(lblNewLabel_1);
		
		btnBack = new JButton("<-  Back");
		btnBack.setBounds(30, 100, 110, 50);
		btnBack.setActionCommand("BackToTrainingSessoin");
		add(btnBack);
		
		lblTrainingSessionTitle = new JLabel("Training session title");
		lblTrainingSessionTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTrainingSessionTitle.setBounds(175, 115, 300, 25);
		add(lblTrainingSessionTitle);
		
		btnCancelTrainingSession = new JButton("Cancel training session");
		btnCancelTrainingSession.setBounds(1039, 100, 200, 50);
		btnCancelTrainingSession.setActionCommand("CancelTrainingSession");
		add(btnCancelTrainingSession);
		
		btnInfo = new JButton("Info");
		btnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInfo.setHorizontalAlignment(SwingConstants.CENTER);
		btnInfo.setOpaque(true);
		btnInfo.setBounds(440, 165, 100, 50);
		btnInfo.setActionCommand("Info");
		add(btnInfo);
		
		btnEnlistedPeople = new JButton("Enlisted people");
		btnEnlistedPeople.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEnlistedPeople.setHorizontalAlignment(SwingConstants.CENTER);
		btnEnlistedPeople.setOpaque(true);
		btnEnlistedPeople.setBounds(540, 165, 200, 50);
		btnEnlistedPeople.setActionCommand("EnlistedPeople");
		add(btnEnlistedPeople);
		
		btnBooks = new JButton("Books");
		btnBooks.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBooks.setBounds(740, 165, 100, 50);
		btnBooks.setHorizontalAlignment(SwingConstants.CENTER);
		btnBooks.setOpaque(true);
		btnBooks.setActionCommand("Books");
		add(btnBooks);
		
		btnMaps = new JButton("Map");
		btnMaps.setOpaque(true);
		btnMaps.setHorizontalAlignment(SwingConstants.CENTER);
		btnMaps.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMaps.setActionCommand("Map");
		btnMaps.setBounds(840, 165, 100, 50);
		add(btnMaps);
		
		JLabel lblGeneralInfo = new JLabel("General info");
		lblGeneralInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGeneralInfo.setBounds(30, 230, 150, 20);
		add(lblGeneralInfo);
		
		txtGeneralInfo = new JTextArea();
		txtGeneralInfo.setEditable(false);
		txtGeneralInfo.setBounds(30, 264, 390, 400);
		add(txtGeneralInfo);
		
		JLabel lblExamInfo = new JLabel("Exam info");
		lblExamInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblExamInfo.setBounds(435, 230, 150, 20);
		add(lblExamInfo);
		
		txtExamInfo = new JTextArea();
		txtExamInfo.setEditable(false);
		txtExamInfo.setBounds(435, 264, 390, 400);
		add(txtExamInfo);
		
		JLabel lblPaymentInfo = new JLabel("Payment info");
		lblPaymentInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPaymentInfo.setBounds(840, 233, 100, 14);
		add(lblPaymentInfo);
		
		txtPaymentInfo = new JTextArea();
		txtPaymentInfo.setEditable(false);
		txtPaymentInfo.setBounds(840, 264, 390, 400);
		add(txtPaymentInfo);
		
		JLabel lblBackBorder = new JLabel("");
		lblBackBorder.setBounds(20, 220, 1220, 450);
		lblBackBorder.setBorder(border);
		add(lblBackBorder);
	}
	
	public void addActionListener(ActionListener listener) {
		btnTraining.addActionListener(listener);
		btnStatistics.addActionListener(listener);
		btnEmployees.addActionListener(listener);
		btnTrainingsession.addActionListener(listener);
		btnInfo.addActionListener(listener);
		btnEnlistedPeople.addActionListener(listener);
		btnBooks.addActionListener(listener);
		btnBack.addActionListener(listener);
		btnCancelTrainingSession.addActionListener(listener);
		btnMaps.addActionListener(listener);
    }
	
	public String getGeneralInfo() {
        return txtGeneralInfo.getText();
    }
	public void setGeneralInfo(int id) {
		for (Map.Entry<Integer, TrainingSession>  entry : listTrainingssessions.entrySet()) {
			if (entry.getValue().getTrainingSessionId()==id) {
				for (Map.Entry<Integer, TrainingInfo>  entry2 : listTraingInfo.entrySet()) {
					if (entry2.getValue().getTrainingId()==entry.getValue().getTrainingId()) {
						txtGeneralInfo.setText(entry2.getValue().getInfoGeneral());
					}
				}		
			}
		}
    }
	public String getExamInfo() {
        return txtExamInfo.getText();
    }
	public void setExamInfo(int id) {
		for (Map.Entry<Integer, TrainingSession>  entry : listTrainingssessions.entrySet()) {
			if (entry.getValue().getTrainingSessionId()==id) {
				for (Map.Entry<Integer, TrainingInfo>  entry2 : listTraingInfo.entrySet()) {
					if (entry2.getValue().getTrainingId()==entry.getValue().getTrainingId()) {
						txtExamInfo.setText(entry2.getValue().getInfoExam());
					}
				}		
			}
		}
    }
	public String getPaymentInfo() {
        return txtPaymentInfo.getText();
    }
	public void setPaymentInfo(int id) {
		for (Map.Entry<Integer, TrainingSession>  entry : listTrainingssessions.entrySet()) {
			if (entry.getValue().getTrainingSessionId()==id) {
				for (Map.Entry<Integer, TrainingInfo>  entry2 : listTraingInfo.entrySet()) {
					if (entry2.getValue().getTrainingId()==entry.getValue().getTrainingId()) {
						txtPaymentInfo.setText(entry2.getValue().getInfoPayment());
					}
				}		
			}
		}
    }
}
