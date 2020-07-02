package team21.TCDS.server.pojo;

import team21.TCDS.server.model.Folder;
import team21.TCDS.server.model.Node;

import java.util.List;

/**
 * <h2>加载后续文件列表数据所用的封装类</h2>
 * <p>该类用于封装文件视图（列表）的后续数据，以便页面进行分段加载。相当于文件夹视图的“尾巴”。</p>
 *
 * @author 高级软件21组(team21)
 * @version 1.0
 */
public class RemainingFolderView {

    private List<Folder> folderList;
    private List<Node> fileList;

    public List<Folder> getFolderList() {
        return folderList;
    }

    public void setFolderList(List<Folder> folderList) {
        this.folderList = folderList;
    }

    public List<Node> getFileList() {
        return fileList;
    }

    public void setFileList(List<Node> fileList) {
        this.fileList = fileList;
    }
}
