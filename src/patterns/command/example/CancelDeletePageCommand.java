package patterns.command.example;

/**
 * 撤销命令
 */
public class CancelDeletePageCommand extends Command{
    //撤销删除一个页面的命令
    public void execute() {
        super.pg.rollBack();
    }
}
