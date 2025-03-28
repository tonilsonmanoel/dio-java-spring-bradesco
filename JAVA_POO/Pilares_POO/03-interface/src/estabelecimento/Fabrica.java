package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
   
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();
        
        Impressora impressoraDesk  = deskjet;
        
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
    
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
