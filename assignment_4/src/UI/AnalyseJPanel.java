/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.House;
import model.Community;
import model.Patient;
import model.PatientDirectory;
import model.VitalSigns;
import model.Person;
import model.EncounterHistory;
import model.Encounter;
import model.PersonDirectory;

/**
 *
 * @author sindhusrinivas
 */
public class AnalyseJPanel extends javax.swing.JPanel {

    PersonDirectory personDirectory;
    PatientDirectory pd;
    HashMap<String, Patient> map = pd.map;
    VitalSigns vitalSigns;
    Map<String, VitalSigns> vitalMap = new HashMap();
    String Name;

    /**
     * Creates new form AnalyseJPanel
     */
    public AnalyseJPanel(PersonDirectory personDirectory) {
        initComponents();
//        setDefaultOptions2();
        this.personDirectory = personDirectory;
        setDefaultOptions2();
        //populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnalyse = new javax.swing.JButton();
        btnAnalyseCommunity = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        paneviewvitals = new javax.swing.JPanel();
        panecrudvitals = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        paneAnalyseCommunity = new javax.swing.JPanel();
        dropdown = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        analyze = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(213, 77, 77));

        btnAnalyse.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAnalyse.setText("BY PERSON");
        btnAnalyse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyseActionPerformed(evt);
            }
        });

        btnAnalyseCommunity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAnalyseCommunity.setText("BY COMMUNITY");
        btnAnalyseCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyseCommunityActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ANALYSE");

        paneviewvitals.setBackground(new java.awt.Color(213, 77, 77));

        panecrudvitals.setBackground(new java.awt.Color(213, 77, 77));

        javax.swing.GroupLayout panecrudvitalsLayout = new javax.swing.GroupLayout(panecrudvitals);
        panecrudvitals.setLayout(panecrudvitalsLayout);
        panecrudvitalsLayout.setHorizontalGroup(
            panecrudvitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panecrudvitalsLayout.setVerticalGroup(
            panecrudvitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout paneviewvitalsLayout = new javax.swing.GroupLayout(paneviewvitals);
        paneviewvitals.setLayout(paneviewvitalsLayout);
        paneviewvitalsLayout.setHorizontalGroup(
            paneviewvitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneviewvitalsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panecrudvitals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        paneviewvitalsLayout.setVerticalGroup(
            paneviewvitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneviewvitalsLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(panecrudvitals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(835, Short.MAX_VALUE))
        );

        txtSearch.setBackground(new java.awt.Color(204, 204, 204));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        paneAnalyseCommunity.setBackground(new java.awt.Color(255, 255, 255));

        dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City..." }));
        dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownActionPerformed(evt);
            }
        });

        analyze.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        analyze.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "COMMUNITY", "TOTAL PEOPLE", "TOTAL ABNORMAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(analyze);

        javax.swing.GroupLayout paneAnalyseCommunityLayout = new javax.swing.GroupLayout(paneAnalyseCommunity);
        paneAnalyseCommunity.setLayout(paneAnalyseCommunityLayout);
        paneAnalyseCommunityLayout.setHorizontalGroup(
            paneAnalyseCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAnalyseCommunityLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(paneAnalyseCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneAnalyseCommunityLayout.setVerticalGroup(
            paneAnalyseCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAnalyseCommunityLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PATIENT_ID", "PATIENT NAME", "DATE", "HEART RATE", "RESPIRATORY RATE", "BP", "WEIGHT", "RESULTS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAnalyse)
                                        .addGap(289, 289, 289)
                                        .addComponent(btnAnalyseCommunity))
                                    .addComponent(paneviewvitals, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paneAnalyseCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnalyse)
                    .addComponent(btnAnalyseCommunity))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnSearch))
                .addGap(65, 65, 65)
                .addComponent(paneAnalyseCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneviewvitals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalyseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyseActionPerformed
        // TODO add your handling code here:
        setDefaultOptions2();
        paneviewvitals.setVisible(true);
        panecrudvitals.setVisible(false);


    }//GEN-LAST:event_btnAnalyseActionPerformed

    private void populate() {
        System.out.println("Inside");
        DefaultTableModel model12 = (DefaultTableModel) analyze.getModel();
        model12.setRowCount(0);
        for (int j = 0; j < 10; j++) {
            Object[] row = new Object[3];
            row[0] = "dsds";
            row[1] = "DSJJDG";
            row[2] = "DSkdhjkdh";
            model12.addRow(row);
        }
    }

    private void populateTable(Set<String> communityName, List peopleCount, List Patientcount) {
        DefaultTableModel model12 = (DefaultTableModel) analyze.getModel();
        model12.setRowCount(0);
        int selectedRow = jTable1.getSelectedRow();

        int i = 0;
        System.out.println("Community Name: " + communityName.size());
        for (String temp : communityName) {
            Object[] row = new Object[3];
            row[0] = String.valueOf(temp);
            row[1] = peopleCount.get(i);
            row[2] = Patientcount.get(i);
            model12.addRow(row);
            i++;
        }

    }


    private void btnAnalyseCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyseCommunityActionPerformed
        setDefaultOptions2();
        paneAnalyseCommunity.setVisible(true);
        dropdown.setVisible(true);
        analyzeRecords();

    }//GEN-LAST:event_btnAnalyseCommunityActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        Name = txtSearch.getText();
        if (personDirectory.getPersonDirectory() == null) {
            System.out.println("null value");
        } else {
            ArrayList<Person> as = personDirectory.getPersonDirectory();
//            for (int i = 0; i < as.size() - 1; i++) {
//                System.out.println("Patient Names  " + as.get(i).getPatient().getEncounterHistory().getList());
//            }

            jTable1.setVisible(true);
            panecrudvitals.setVisible(true);

            ArrayList<Person> p = personDirectory.searchPatient(Name);

            Person tp = p.get(0);
            String patientAge = tp.getAgeGroup();
//            vitalSigns.VitalSigns(patientAge);
            String patientId = tp.getPatient().getPid();
            ArrayList<Encounter> ph = tp.getPatient().getEncounterHistory().getList();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            
            ArrayList<Encounter> patientHistory = ph;
            int i = 1;

            for (Encounter data : patientHistory) {
                Object[] row = new Object[10];
                try {
                    VitalSigns s = patientHistory.get(i).getVs();

                    row[0] = patientId;
                    row[1] = Name;
                    row[2] = patientHistory.get(i).getVisitedDate();
                    row[3] = patientHistory.get(i).getVs().getHeartRate();
                    row[4] = patientHistory.get(i).getVs().getRespiratoryRate();
                    row[5] = patientHistory.get(i).getVs().getBloodPressure();
                    row[6] = patientHistory.get(i).getVs().getWeightPounds();
                    row[7] = getEncounterResult(s, patientAge);
                } catch (ArrayIndexOutOfBoundsException e) {
                    
                }

                i++;
                model.addRow(row);

            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private String getEncounterResult(VitalSigns s, String patientAge) {
        VitalSigns v = new VitalSigns(patientAge);
        if (s.getHeartRate() >= v.gethLB() && s.getHeartRate() < v.gethUB()
                && s.getRespiratoryRate() >= v.getrLB() && s.getRespiratoryRate() < v.getrUB()
                && s.getBloodPressure() >= v.getBpLB() && s.getBloodPressure() <= v.getBpUB()
                && s.getWeightPounds() >= v.getWpLB() && s.getWeightPounds() < v.getWpUB()) {
            return "Normal";
        } else {
            return "Abnormal";
        }

    }

    private void viewVitals() {

    }


    private void dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownActionPerformed
        String CitySelected = dropdown.getSelectedItem().toString();
        List<Community> Communitylist = City.getCitymap().get(CitySelected);
        System.out.println(CitySelected);
        ArrayList<Person> as = personDirectory.getPersonDirectory();
        Set<String> commName = new HashSet<String>();
        List<Integer> TotalPer = new ArrayList<Integer>();
        List<Integer> TotalPat = new ArrayList<Integer>();
        int CommunityCount = 0;
        for (Community C : Communitylist) {
            commName.add(City.getCitymap().get(CitySelected).get(CommunityCount).getCommunityName());
            Map<String, List<House>> list1 = Communitylist.get(CommunityCount).getCommunitymap();
            List<House> h = list1.get(City.getCitymap().get(CitySelected).get(CommunityCount).getCommunityName());

            int TotalPerson = 0;
            int TotalPatients = 0;
            for (House h1 : h) {
                TotalPerson++;
                String patientResult = getEncounterResult(h1.getSetPerson().getVitalSign(), h1.getSetPerson().getAgeGroup());
                if (patientResult == "Abnormal") {
                    TotalPatients++;
                }
            }
            TotalPer.add(TotalPerson);
            TotalPat.add(TotalPatients);
            CommunityCount++;

        }
        System.out.println("Dropdown Value: " + CitySelected);
        populateTable(commName, TotalPer, TotalPat);
    }

    public boolean checVitals(Person b, Patient p) {

//        VitalSigns v1 = vitalSigns.VitalSigns("ADOLESCENT");
        if (b.getVitalSign().getBloodPressure() >= 50
                && b.getVitalSign().getBloodPressure() < 100) {
            if (b.getVitalSign().getBloodPressure() >= 60
                    && b.getVitalSign().getBloodPressure() < 100) {
                return true;
            } else {
                return false;
            }
        }
        return false;


    }//GEN-LAST:event_dropdownActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed
    public void analyzeRecords() {

//        System.out.println("Enter Choose the city below to analyze");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Choose the city below ");
//        System.out.println(City.getCitymap().keySet());
        Set<String> set = new HashSet<String>();
        for (String temp : City.getCitymap().keySet()) {
            if (!set.contains(set)) {
                set.add(temp);
                dropdown.addItem(temp);
            }
        }
//        String s1 = sc.nextLine();

//        System.out.println("This city has " + list.size() + " communities ");
//        int count = 0;
//        int pc = 0;
//        for (int i = 0; i < Communitylist.size(); i++) {
//            //System.out.println("COmmunity Names "+ City.getCitymap().get(s1).get(i).getCommunityName());
//            Map<String, List<House>> list1 = Communitylist.get(i).getCommunitymap();
//            List<House> h = list1.get(City.getCitymap().get(CitySelected).get(i).getCommunityName());
//            for (House h1 : h) {
//                pc++;
//                //System.out.println("SSS "+ h1.getSetPerson().getEncounterHistory().getList().get(0).getVs().getSystolicBloodPressure());
//                for (int k = 0; k < h1.getSetPerson().getPatient().getEncounterHistory().getList().size(); k++) {
//                    if (checkVitals(h1.getSetPerson(), map.get(h1.getSetPerson().getPersonName()))) {
//                        System.out.println("Normal for " + h1.getSetPerson().getPersonName());
//
//                    } else {
//                        System.out.println("Abnormal for " + h1.getSetPerson().getPersonName());
//                        count++;
//                    }
//                }
//
//            }
//        }
//        System.out.println("There are " + Communitylist.size() + " communities in this city and of total of " + pc + " patients. " + count + " Paitient has abnormal vital ranges for a given city ");
//
//    }
//    public boolean checkVitals(Person v, Patient p) {
//
//        VitalSigns v1 = new VitalSigns("ADOLESCENT");
//
////            if (v.getSystolicBloodPressure() >= v1.getSysBloodPressureLB()&& 
////                    v.getSystolicBloodPressure() < v1.getSysBloodPressureUB())
//        if (v.getVitalSign().getBloodPressure() >= 60
//                && v.getVitalSign().getBloodPressure() < 100) {
//            return true;
//        } else {
//            return false;
//        }
    }

    protected void setDefaultOptions2() {

        paneviewvitals.setVisible(false);
        panecrudvitals.setVisible(false);
        dropdown.setVisible(false);
        paneAnalyseCommunity.setVisible(false);
       
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable analyze;
    private javax.swing.JButton btnAnalyse;
    private javax.swing.JButton btnAnalyseCommunity;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> dropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel paneAnalyseCommunity;
    private javax.swing.JPanel panecrudvitals;
    private javax.swing.JPanel paneviewvitals;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
