package HW_1.InMemoryModel;

//Интерфейс смены модели
public interface IModelChanger {
    public void NotifyChange(IModelChanger sender);
}
