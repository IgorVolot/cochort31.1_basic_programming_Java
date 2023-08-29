package practice.abstract_class;

public class HouseImpl implements House{
    @Override
    public boolean addPet() {
        return false;
    }

    @Override
    public Pet removePet(Pet pet) {
        return null;
    }
}
