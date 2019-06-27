package patterns.mix.commandAndResponsibilityChain;

public abstract class CommandName {
    private CommandName nextOperator;
    public final String handleMessage(CommandVO vo) {
        String result = "";
        if (vo.getParam().size() == 0 || vo.getParam().contains(this.getOperateParam())) {
            result = this.echo(vo);
        } else {
            if (this.nextOperator != null) {
                result = this.nextOperator.handleMessage(vo);
            } else {
                result = "Command can't excute! ";
            }
        }
        return result;
    }

    public void setNext(CommandName _operator) {
        this.nextOperator = _operator;
    }

    protected abstract String getOperateParam();

    protected abstract String echo(CommandVO vo);
}
