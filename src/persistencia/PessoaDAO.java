package persistencia;

import negocio.Pessoa;

import java.sql.PreparedStatement;

public class PessoaDAO {
    private BancoDeDados objBanco = new BancoDeDados();
    private PreparedStatement objExecucao = null;

    //Métodos da class
    public void persistir(Pessoa objPessoa) throws Exception {
        objBanco.conectar();

        objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO PES_PESSOA " +
                                                                    "(PES_NOME, PES_ENDERECO, PES_TELEFONE)"+
                                                                        "VALUES " +
                                                                        "(?, ?, ?)");
        objExecucao.setString(1, objPessoa.getNome());
        objExecucao.setString(2, objPessoa.getNome());
        objExecucao.setString(3, objPessoa.getNome());

        objExecucao.executeUpdate();

        objBanco.desconectar();
    }
}
