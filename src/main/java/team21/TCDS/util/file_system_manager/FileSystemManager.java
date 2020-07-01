package team21.TCDS.util.file_system_manager;

/**
 * 
 * <h2>TCDS文件系统管理器</h2>
 * <p>
 * 该管理器用于提供本地文件系统相关操作（例如文件的导入导出）。为确保操作安全，其中的所有方法在同一时刻应只有一个被调用。
 * 该类被设计为单例模式，请使用静态方法getInstance()获取其唯一实例。当您第一次获取它时，该工具将加载资源并开启数据库链接
 * （可能会有一定的耗时）。
 * 每次使用前都请手动调用team21.TCDS.server.util.FileNodeUtil.initNodeTableToDataBase()方法以确保节点链接最新。
 * </p>
 * 
 * @author 高级软件21组(team21)
 * @version 1.0
 */
public class FileSystemManager {

}
