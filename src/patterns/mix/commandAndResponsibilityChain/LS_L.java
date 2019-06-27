package patterns.mix.commandAndResponsibilityChain;

public class LS_L extends AbstractLS {

    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls_l(vo.formatData());
    }

    @Override
    protected String getOperateParam() {
        return super.L_PARAM;
    }

}
