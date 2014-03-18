

import groovy.sql.Sql



class DBConn { 

 def getConnection() { 

def  sql = Sql.newInstance("jdbc:derby:music")


}

}

