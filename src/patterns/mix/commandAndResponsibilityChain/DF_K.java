package patterns.mix.commandAndResponsibilityChain;

public class DF_K extends AbstractDF {
    @Override
    protected String getOperateParam() {
        return super.K_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return DiskManager.df();
    }
}
