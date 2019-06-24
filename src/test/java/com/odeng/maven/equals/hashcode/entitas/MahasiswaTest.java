/*
 * maven-equals-hashcode

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 24, 2019 6:39:04 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.equals.hashcode.entitas;

import com.odeng.maven.equals.hashcode.util.HibernateUtil;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author od3ng
 */
public class MahasiswaTest {

    @Test
    public void testEqualsHashcode() {
        Set<Mahasiswa> s = new HashSet<>();
        Mahasiswa m = new Mahasiswa("075410099", "Noprianto", 3.99F, "Teknologi Informasi");
        m.setId(1L);
        Mahasiswa m1 = new Mahasiswa("075410099", "Noprianto", 3.99F, "Teknologi Informasi");
        m1.setId(1L);
        
        s.add(m);
        s.add(m1);
        s.forEach((mhs) -> {
            System.out.println("" + mhs);
        });
        assertTrue(m.equals(m1));
    }

}
