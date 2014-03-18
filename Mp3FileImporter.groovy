



class Mp3FileImporter {  



    void scanDir(String root){ 


      File fNode = new File(root)
      
      FileNode node = new FileNode("mp3")
      node.descend(fNode)
      List results = node.results
      results.each { f -> 
	Map  id3values = Mp3Utils.extract(f)
        Track track = new Track(id3values)
	track.path=f.getAbsolutePath()
	track.init(id3values)
        track.store() 
      }
    }
}