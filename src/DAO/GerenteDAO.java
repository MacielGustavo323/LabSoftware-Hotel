/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;

import Modelo.Gerente;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Gustavo Maciel
 */
public class GerenteDAO extends ExecuteSQL{
    public GerenteDAO (Connection con){
    
        super(con);
        
        
    }
}
