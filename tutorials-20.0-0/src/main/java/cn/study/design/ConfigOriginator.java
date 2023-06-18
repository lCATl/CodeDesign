package cn.study.design;

/**
 * @author CAT
 * @description 记录者
 * @Copyright CodeDesign
 */
public class ConfigOriginator {

    private ConfigFile configFile;

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }

    public ConfigMemento saveMemento(){
        return new ConfigMemento(this.configFile);
    }

    public void getMemento(ConfigMemento configMemento){
        this.configFile = configMemento.getConfigFile();
    }

}
