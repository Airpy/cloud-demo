package com.asiainfo.clouddemo.clouddemo.util;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.util.StringUtils;

import javax.persistence.MappedSuperclass;

/**
 * @author : zhenfeng.liu
 * @date : 2019/8/1 21:36
 */
@MappedSuperclass
public class HibernatePhysicalNamingStrategy extends PhysicalNamingStrategyStandardImpl {

    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context){
        return new Identifier(name.getText(),name.isQuoted());
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier identifier, JdbcEnvironment jdbcEnv){
        return convert(identifier);
    }

    private Identifier convert (Identifier identifier){
        if(identifier ==null || !StringUtils.hasText(identifier.getText())){
            return  identifier;
        }
        String regex = "([a-z])([A-Z])";
        String replacement ="$1_$2";
        String newName = identifier.getText().replaceAll(regex,replacement).toLowerCase();
        return  Identifier.toIdentifier(newName);
    }
}
