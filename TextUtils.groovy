
import java.security.MessageDigest 



class TextUtils  {  


 static  def generateMD5(String s) { 
    MessageDigest digest = MessageDigest.getInstance("MD5")
    digest.update(s.bytes);
    return new BigInteger(1, digest.digest()).toString(16).padLeft(32, '0')
  }



}
