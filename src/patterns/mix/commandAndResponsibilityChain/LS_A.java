package patterns.mix.commandAndResponsibilityChain;

public class LS_A extends AbstractLS {

    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls_a(vo.formatData());
    }

    @Override
    protected String getOperateParam() {
        return super.A_PARAM;
    }

}
