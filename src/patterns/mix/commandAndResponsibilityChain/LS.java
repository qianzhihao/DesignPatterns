package patterns.mix.commandAndResponsibilityChain;

public class LS extends AbstractLS {

    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls(vo.formatData());
    }

    @Override
    protected String getOperateParam() {
        return super.DEFAULT_PARAM;
    }

}
