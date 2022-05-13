import il.ac.technion.cs.softwaredesign.storage.SecureStorage
import il.ac.technion.cs.softwaredesign.storage.SecureStorageFactory
import java.util.*

class DummyStorage(storageName: ByteArray): SecureStorage{
    val storageName: ByteArray
    val storage = mutableMapOf<ByteArray, ByteArray>()
    init{

           this.storageName = storageName
    }
    override fun write(key: ByteArray, value: ByteArray) {
        storage.put(key, value)
    }

    override fun read(key: ByteArray): ByteArray?{
        return storage[key]
    }
}
class DummyStorageFactory : SecureStorageFactory {
    override fun open(name: ByteArray): SecureStorage{
        return DummyStorage(name)
    }
}