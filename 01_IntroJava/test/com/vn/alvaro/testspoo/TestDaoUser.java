/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.alvaro.testspoo;

import com.vn.dao.DaoUserList;
import com.vn.dao.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class TestDaoUser {
    
    public TestDaoUser() {
    }

    
     @Test
     public void testUsuarios() {
         DaoUserList dull = new DaoUserList();
         dull.create("patogp9", 21);
         dull.create("arrobensen",3);
         dull.create("LunaKi", 9);
         
         System.out.println(dull.returnByName("LunaKi").getNombre()+" "+dull.returnByName("LunaKi").getEdad());
         System.out.println(dull.returnByIndex(1).getNombre()+" "+dull.returnByIndex(1).getEdad());
         
         dull.modify(new User("Robinson",33), 1);
         System.out.println(dull.returnByIndex(1).getNombre()+" "+dull.returnByIndex(1).getEdad());
         
         
     }
}
