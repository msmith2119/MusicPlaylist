

class TrackQuery
{ 


  List queryAll(){ 

    def results =  new ArrayList()
    DBConn con = new DBConn()
    def sql = con.getConnection()
    sql.eachRow("select * from tracks"){ row -> 
      
      Track track = new Track()
      
      track.id=row.id
      track.path=row.path
      track.name=row.name
      track.artist=row.artist
      track.album=row.album
      track.genre=row.genre
      track.release=row.release
      results.add(track)
      
    }

    return results

  }



}