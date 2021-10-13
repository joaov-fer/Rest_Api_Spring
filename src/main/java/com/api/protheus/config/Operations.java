
package com.api.protheus.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Operations {
    
    
    public String readFileIps() {
		
        String ips = "";
    
        try{
            File f = new File("configs/acess.txt");
                        
            if(!f.exists()) { 

                File folder = new File("configs");
                folder.mkdir();
                f.createNewFile();

                try (FileWriter writer = new FileWriter(f, true)) {
                    writer.write("--Linhas com '--' serão ignoradas! \n0:0:0:0:0:0:0:1");
                }

            }
            
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                String linha;
                String or = "";
                
                while ((linha = br.readLine()) != null) {
                    linha = linha.trim();
                    if (!linha.contains("--") && !linha.isEmpty()){
                        
                        linha = "\n" + or + "hasIpAddress('" + linha + "') and isAuthenticated()";
                        ips = ips.concat(linha);
                        or = "or ";
                    }
                } 
            }
           
        
        }catch (IOException e){
        }
        
        System.out.println(ips);
        return ips;
    }

	
	
        public Conexao getConexao() {
		
        Conexao conexao = new Conexao();


        File f = new File("configs/conexao.properties");
        if(!f.exists()) { 
            
            
            try {
                File folder = new File("configs");
                folder.mkdir();
                f.createNewFile();

                try (FileWriter writer = new FileWriter("configs/conexao.properties", true)) {
                    writer.write("ip= \nporta= \nbanco= \nuser= \nsenha= \nuserAPI= \nsenhaAPI= \ntimeUpdateFiles");
                }
                } catch (IOException e) {
                }
        
        } 

        try {							
            Properties prop = new Properties();
            prop.load(new FileInputStream("configs/conexao.properties"));
            conexao.setIp(prop.getProperty("ip"));
            conexao.setPorta(prop.getProperty("porta"));
            conexao.setBanco(prop.getProperty("banco"));
            conexao.setUser(prop.getProperty("user"));
            conexao.setSenha(prop.getProperty("senha"));
            conexao.setUserAPI(prop.getProperty("userAPI"));
            conexao.setSenhaAPI(prop.getProperty("senhaAPI"));
            conexao.setTimeUpdateFiles(prop.getProperty("timeUpdateFiles"));


                }catch (IOException e) {
                }
        
        return conexao;
    }

}
		