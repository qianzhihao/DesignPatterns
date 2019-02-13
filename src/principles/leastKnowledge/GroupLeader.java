package principles.leastKnowledge;

import java.util.List;

public class GroupLeader {
    private List<Girl> listGirls;
    public GroupLeader(List<Girl> _listGirls) {
        this.listGirls = _listGirls;
    }
    //清查女生数量
    public void countGirls() {
        System.out.println("女生数量是："+this.listGirls.size());
    }
}
