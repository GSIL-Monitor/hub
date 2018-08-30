package sjms.zuhe;


import java.util.List;

/**
 * Created by songweiliang on 2017/11/21.
 */
public interface AbstractFile {
    public void killVirus();
}

class ImageFile implements  AbstractFile{
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.print("正在查杀图片"+name);
    }
}

class File implements  AbstractFile{
    private List<AbstractFile> files;
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("现在查杀文件夹"+name);
        for (AbstractFile file:files){
            file.killVirus();
        }
    }
    public void add(AbstractFile file){
        files.add(file);
    }

}
