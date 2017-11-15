package composite.exercise_01;

public class File extends AbstractFile {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        for (int i = 0; i < getDepth(); i++) {
            System.out.println("\t");
        }
        System.out.println("[File] " + getName() + ", Size:" + size);
    }
}
