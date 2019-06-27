package patterns.mix.commandAndResponsibilityChain;

public class Invoker {
    public String exec(String _commandStr) {
        String result = "";
        CommandVO vo = new CommandVO(_commandStr);
        if (CommandEnum.getNames().contains(vo.getCommandName())) {
            String className = CommandEnum.valueOf(vo.getCommandName()).getValue();
            Command command;
            try {
                command = (Command)Class.forName(className).newInstance();
                result = command.execute(vo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            result = "can't execute command";
        }
        return result;
    }
}
