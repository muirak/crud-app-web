/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManager;
import utilitarios.FabricaConexao;

/**
 *
 * @author RAVI
 */
public class PedidoDAO {
	private final EntityManager em = FabricaConexao.getConexao();
	
}
