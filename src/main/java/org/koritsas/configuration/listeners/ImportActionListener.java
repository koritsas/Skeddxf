package org.koritsas.configuration.listeners;


import org.springframework.context.annotation.Configuration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Configuration("importActionListener")
public  class ImportActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("Listener injected");

    }
}
