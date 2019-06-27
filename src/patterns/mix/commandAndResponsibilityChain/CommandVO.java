package patterns.mix.commandAndResponsibilityChain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CommandVO {
    public final static String DIVIDE_FLAG = " ";
    public final static String PREFIX = "-";
    private String commandName = "";
    private ArrayList<String> paramList = new ArrayList<String>();
    private ArrayList<String> dataList = new ArrayList<String>();

    public CommandVO(String commandStr) {
        if (commandStr != null && commandStr.length() != 0) {
            String[] complexStr = commandStr.split(CommandVO.DIVIDE_FLAG);
            this.commandName = complexStr[0];
            for (int i = 0; i < complexStr.length; i++) {
                String str = complexStr[i];
                if (str.indexOf(CommandVO.PREFIX) == 0) {
                    this.paramList.add(str.replace(CommandVO.PREFIX, "").trim());
                } else {
                    this.dataList.add(str.trim());
                }
            }
        } else {
            System.out.println("Command fail!");
        }
    }

    public String getCommandName() {
        return this.commandName;
    }

    public ArrayList<String> getParam() {

        if (this.paramList.size() == 0) {
            this.paramList.add("");
        }

        return new ArrayList(new HashSet(this.paramList));
    }

    public ArrayList<String> getData() {
        return this.dataList;
    }

    public String formatData() {
        String str = "";
        ArrayList<String> strList = this.dataList;
        for (String string: strList
             ) {
            str += string;
        }
        return str;
    }
}
