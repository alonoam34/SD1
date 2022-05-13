package il.ac.technion.cs.softwaredesign

import il.ac.technion.cs.softwaredesign.storage.SecureStorage
import il.ac.technion.cs.softwaredesign.storage.SecureStorageFactory

class Storage @Inject constructor(SecureStorage){
    val db =SecureStorage("db")
    fun Storage(){
       var secureStorageFactory = SecureStorageFactory( dbName);
        db = secureStorageFactory.open()
    }

}