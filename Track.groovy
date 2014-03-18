

class Track
{ 
String id
String path
String title
String artist
String album
String genre
String year



  String  insertSql(){
    
    id  = TextUtils.generateMD5(path+title+artist)
    return  sprintf("insert  into tracks values('%s','%s','%s','%s','%s','%s','%s')",id,path,title,artist,album,genre,year)
  }
  


   void init(Map values){ 

      title=values['title']
      artist=values['artist']
      album=values['album']
      year=values['year']
      year=values['year']

   }


   void store(){ 

     ObjectManager.store(this)

   }


   
}
