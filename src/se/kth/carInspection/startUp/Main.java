package se.kth.carInspection.startUp;


import se.kth.carInspection.control.Control;
import se.kth.carInspection.integration.Printer;
import se.kth.carInspection.integration.RegistryCreator;
import se.kth.carInspection.model.InspectionList;
import se.kth.carInspection.model.VehicleComponent;
import se.kth.carInspection.view.View;

public class Main {

	
	public static void main(String[] args) {
		Printer printer = new Printer();
		InspectionList inspectionlist = new InspectionList();
		/////fill the list
		VehicleComponent c1 = new VehicleComponent("Wheels");
		VehicleComponent c2 = new VehicleComponent("Oil");
		VehicleComponent c3 = new VehicleComponent("Engine");
		VehicleComponent c4 = new VehicleComponent("Steering");
		VehicleComponent c5 = new VehicleComponent("AC");
		
		inspectionlist.addComponentToCheckList(c1);
		inspectionlist.addComponentToCheckList(c2);
		inspectionlist.addComponentToCheckList(c3);
		inspectionlist.addComponentToCheckList(c4);
		inspectionlist.addComponentToCheckList(c5);
		
		
		RegistryCreator register = new RegistryCreator();
		
		Control control = new Control(printer,inspectionlist,register);
		View viewb = new View(control);
		//viewb.StartPrintingEvents();
                
                		
		
                
                
          //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View(control).setVisible(true);
            }
        });
		
		

	}

}
