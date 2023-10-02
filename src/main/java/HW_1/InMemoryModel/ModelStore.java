package HW_1.InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import HW_1.ModelElements.Camera;
import HW_1.ModelElements.Flash;
import HW_1.ModelElements.PoligonalModel;
import HW_1.ModelElements.Scene;

//Хранилище модели
public class ModelStore implements IModelChanger {

    public ModelStore(List<IModelChangedObserver> changeObservers) throws Exception {
        this.ChangeObservers = changeObservers;
        this.Cameras = new ArrayList<>();
        this.Models = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Scenes = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
        Cameras.add(new Camera());
        Flashes.add(new Flash());
    }

    private List<IModelChangedObserver> ChangeObservers;
    public List<PoligonalModel> Models;
    public List<Camera> Cameras;
    public List<Flash> Flashes;
    public List<Scene> Scenes;




    //Регистрация изменений модели
    @Override
    public void NotifyChange(IModelChanger sender) {

    }

    public Scene GetScena(int ID){
        return null;
    }

}
