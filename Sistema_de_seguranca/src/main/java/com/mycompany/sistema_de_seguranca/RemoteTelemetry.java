/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_de_seguranca;

import com.microsoft.azure.eventhubs.ConnectionStringBuilder;
import com.microsoft.azure.eventhubs.EventData;
import com.microsoft.azure.eventhubs.EventHubClient;
import com.microsoft.azure.eventhubs.EventHubException;
import com.microsoft.azure.eventhubs.EventPosition;
import com.microsoft.azure.eventhubs.EventHubRuntimeInformation;
import com.microsoft.azure.eventhubs.PartitionReceiver;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.nio.charset.Charset;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexandre
 */
public class RemoteTelemetry extends javax.swing.JFrame {

    private static final String eventHubsCompatibleEndpoint = "sb://ihsuprodamres034dednamespace.servicebus.windows.net/";

    // az iot hub show --query properties.eventHubEndpoints.events.path --name {your IoT Hub name}
    private static final String eventHubsCompatiblePath = "iothub-ehub-smart-term-2569715-e80cc7c924";

    // az iot hub policy show --name service --query primaryKey --hub-name {your IoT Hub name}
    private static final String iotHubSasKey = "NXRB377phNtUYFPdJlRf/FNl6FOizuKNMT35rNgXx9Q=";
    private static final String iotHubSasKeyName = "service";

    // Track all the PartitionReciever instances created.
    private static ArrayList<PartitionReceiver> receivers = new ArrayList<PartitionReceiver>();
    private final ConnectionStringBuilder connStr;
    private final ScheduledExecutorService executorService;
    private final EventHubClient ehClient;
    private final EventHubRuntimeInformation eventHubInfo;

    /**
     * Creates new form RemoteTelemetry
     */
    public RemoteTelemetry() throws URISyntaxException, InterruptedException, ExecutionException, EventHubException, IOException {
        initComponents();

        connStr = new ConnectionStringBuilder()
                .setEndpoint(new URI(eventHubsCompatibleEndpoint))
                .setEventHubName(eventHubsCompatiblePath)
                .setSasKeyName(iotHubSasKeyName)
                .setSasKey(iotHubSasKey);

        // Create an EventHubClient instance to connect to the
        // IoT Hub Event Hubs-compatible endpoint.
        executorService = Executors.newSingleThreadScheduledExecutor();
        ehClient = EventHubClient.createFromConnectionStringSync(connStr.toString(), executorService);

        // Use the EventHubRunTimeInformation to find out how many partitions 
        // there are on the hub.
        eventHubInfo = ehClient.getRuntimeInformation().get();

        for (String partitionId : eventHubInfo.getPartitionIds()) {
            receiveMessages(ehClient, partitionId);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(RemoteTelemetry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoteTelemetry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoteTelemetry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoteTelemetry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RemoteTelemetry().setVisible(true);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(RemoteTelemetry.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RemoteTelemetry.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(RemoteTelemetry.class.getName()).log(Level.SEVERE, null, ex);
                } catch (EventHubException ex) {
                    Logger.getLogger(RemoteTelemetry.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(RemoteTelemetry.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
private void receiveMessages(EventHubClient ehClient, String partitionId) throws EventHubException {
        final ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Create the receiver using the default consumer group.
        // For the purposes of this sample, read only messages sent since 
        // the time the receiver is created. Typically, you don't want to skip any messages.
        ehClient.createReceiver(EventHubClient.DEFAULT_CONSUMER_GROUP_NAME, partitionId,
                EventPosition.fromEnqueuedTime(Instant.now())).thenAcceptAsync(receiver -> {
                   
                    //jTextArea1.append(String.format(Instant.now().toString()));

                    receivers.add(receiver);

                    while (true) {
                        try {
                            // Check for EventData - this methods times out if there is nothing to retrieve.
                            Iterable<EventData> receivedEvents = receiver.receiveSync(100);

                            // If there is data in the batch, process it.
                            if (receivedEvents != null) {
                                for (EventData receivedEvent : receivedEvents) {
                                    jTextArea1.append(new String(receivedEvent.getBytes())+"\n");
                                    //jTextArea1.append(String.format("Application properties (set by device):\n%s", receivedEvent.getProperties().toString()));
                                    //jTextArea1.append(String.format("System properties (set by IoT Hub):\n%s\n", receivedEvent.getSystemProperties().toString()));
                                }
                            }
                        } catch (EventHubException e) {
                            jTextArea1.append("Error reading EventData");
                        }
                    }
                }, executorService);
    }

}
