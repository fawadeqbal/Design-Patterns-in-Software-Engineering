/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid;

/**
 *
 * @author fawad
 */
interface Readable {
    void read();
}

interface Writable {
    void write();
}

class FileHandler implements Readable, Writable {
    @Override
    public void read() {
        // Logic for reading
    }

    @Override
    public void write() {
        // Logic for writing
    }
}

