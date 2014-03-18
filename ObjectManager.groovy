

class ObjectManager { 



     static   boolean store(object){ 

       DBConn con =  new DBConn()
       def sql=con.getConnection()
       sql.execute(object.insertSql())
       }
  


  static String generateID(String salt){ 

      return TextUtils.generateMD5(salt)
    
  }  
      
}