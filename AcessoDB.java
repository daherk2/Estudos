package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;



	 

public class AcessoDB {


	    Connection con;
	    Statement stmt;
	    ResultSet rs;
	    public boolean testa=false; 
	   /*
	    //porta 9000
	    String url=locali;
	    String user="root";
	    String password="";
	    String driver="com.mysql.jdbc.Driver";
	   */
	   String url;
	   String user;
     String password;
     String driver="com.mysql.jdbc.Driver"; 
    
	    public AcessoDB(){
	    	
	    	try {
	    	
				@SuppressWarnings("resource")
				BufferedReader br = new BufferedReader(
	    		new FileReader("logger.bin.txt"));
	    		String devstr = br.readLine();
	    		String a [] = new String[5];
		    	a = devstr.split(",");
	    //	JOptionPane.showMessageDialog(null,a[0]+"  "+a[1]+"   "+a[2]);
	    	
		       url = a[0];
		       user = a[1];
		       password = a[2];//"f1234567";
		    	
	    		} catch (IOException e) {
	    		}	
	    	
	    	
	    
	    	
	    }
	    
	    
	    
	    
	    
	    public void conecta()
	    {
	        try
	        {
	            Class.forName(driver);
	            con=DriverManager.getConnection(url,user,password);
	             stmt=con.createStatement();
	            
	             testa = true;
	             
	         //    JOptionPane.showMessageDialog(null,"Conexão foi estabelecida","Mensagem do Sistema",JOptionPane.PLAIN_MESSAGE);
	      	        }
	        catch (Exception e)
	        {
	       //     JOptionPane.showMessageDialog(null,"Erro na conexão com o banco de dados","Erro",JOptionPane.ERROR_MESSAGE);
	        
	        }
	       
	    
	    }
	   
	    public void grava(String texto)
	    {
	        try
	        {
	           stmt = con.createStatement();
	           stmt.execute(texto);
	           
	           stmt.close();
	           con.close();
	          //JOptionPane.showMessageDialog(null,"Salvo");
	           
	        }
	        catch(SQLException erro)
	        {
	           JOptionPane.showMessageDialog(null,"Erro no comando SQL","Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
	           System.out.println(erro);
	        }
	      }
	    
	    
	
	
	
	
	
	
	
	    public ResultSet Consulta(String comandosql) 
	    {
	    	try
	    	{
	    		stmt=con.createStatement();
	    		rs=stmt.executeQuery(comandosql);
	    		 // JOptionPane.showMessageDialog(null,"Salvo");
	    	}
	    	catch(SQLException erro)
	    	{
	    	//	JOptionPane.showMessageDialog(null,"Erro no comando SQL","Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
	    		//System.exit(0);
	    	}
	    		    
	    	return rs;
	      }      
	    
	 
	    
	    public void Atualiza(String sql) {
	    	
	    	try {
				stmt=con.createStatement();
				stmt.executeUpdate(sql);
				
							
				  JOptionPane.showMessageDialog(null,"Atualizado");
		           
			} catch (SQLException e) {
				// TODO Auto-generated catch block
			//	JOptionPane.showMessageDialog(null,"Erro no comando SQL","Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
	    
	    	
	    }
	    




}

