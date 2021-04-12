package br.ufes.weatherdatadisplay.presenter;

import br.ufes.weatherdatadisplay.collection.TempoCollection;
import br.ufes.weatherdatadisplay.view.ConfiguracaoDoSistemaView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author pedroh
 */
public class ConfiguracaoDoSistemaPresenter {
    private final ConfiguracaoDoSistemaView configuracaoDoSistemaView;
    private final TempoCollection registrosTempo;

    public ConfiguracaoDoSistemaPresenter(ConfiguracaoDoSistemaView configuracaoDoSistemaView, TempoCollection registrosTempo) {
        this.configuracaoDoSistemaView = configuracaoDoSistemaView;
        this.registrosTempo = registrosTempo;
        
        this.configuracaoDoSistemaView.getBtnSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                salvar();
            }
        });
    }
    
    private void salvar(){
        
    }
    
}
