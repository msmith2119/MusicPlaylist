

import org.jaudiotagger.audio.AudioFileIO
import org.jaudiotagger.audio.AudioFile
import org.jaudiotagger.audio.mp3.MP3File
import org.jaudiotagger.tag.Tag
import org.jaudiotagger.audio.AudioHeader
import org.jaudiotagger.tag.FieldKey



class Mp3Utils { 



static  Map extract(File froot) { 

MP3File f      = (MP3File)AudioFileIO.read(froot);
Tag tag        = f.getTag();

String artist =   tag.getFirst(FieldKey.ARTIST)
String title = tag.getFirst(FieldKey.TITLE)
String album = tag.getFirst(FieldKey.ALBUM)
Map params = new HashMap()
params["artist"]  =  tag.getFirst(FieldKey.ARTIST)
params["title"] = tag.getFirst(FieldKey.TITLE)
params["album"] = tag.getFirst(FieldKey.ALBUM)
return params
}

  

}

