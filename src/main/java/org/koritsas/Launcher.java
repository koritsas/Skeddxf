package org.koritsas;

import org.koritsas.UI.SkeddxfUI;
import org.springframework.beans.factory.annotation.Autowired;

public class Launcher {

    @Autowired
    SkeddxfUI skeddDXF;

    public void launch(){

        skeddDXF.setVisible(true);
    }

}
