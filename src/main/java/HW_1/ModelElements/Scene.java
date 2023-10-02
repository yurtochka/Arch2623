package HW_1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {

    }

    public <Fla> Fla method1(Fla Flash) {
        return Flash;
    }

    public <Mod, Sce> Mod method2(Mod Model, Sce Scene) {
        return Model;
    }

}
