

class FileNode { 

        List results 
        String ext

    FileNode(ext) { this.ext=ext ; results =  new ArrayList() } 

	void descend(File dir ) { 
		 File[] files = dir.listFiles()
		for(f in  files) { 
	
		   if(f.isDirectory()) { 
	
			descend(f) 
		  } 
	
		  else { 
	
			if(f.getName().endsWith(ext)) { 
			   results.add(f) 
			}
		}
		}
	}
}
