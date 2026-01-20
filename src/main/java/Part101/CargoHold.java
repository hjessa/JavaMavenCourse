package Part101;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CargoHold {

    private final List<Cargo> cargoList = new ArrayList<>();

    public void addCargo(Cargo cargo) {
        cargoList.add(cargo);
    }

    // TODO:
    // Return the total weight of all cargo using streams
    public double getTotalWeight() {
        return (double) cargoList.stream()
                .map(cargo -> cargo.getWeight())
                .reduce(0.0, (previousSum, value) -> previousSum + value);
    }

    // TODO:
    // Return a list of cargo names that are heavier than the given weight
    public List<String> getHeavyCargoNames(double minWeight) {
        // TODO implement using streams
        return cargoList.stream()
                .filter(cargo -> cargo.getWeight() > minWeight)
                .map(cargo -> cargo.getName())
                .collect(Collectors.toCollection(ArrayList::new));
        //czemu nie mogłem tu użyc List::new
    }

    // TODO:
    // Check if all cargo items are below the given max weight
    public boolean isCargoSafe(double maxWeight) {
        // TODO implement using streams
        return cargoList.stream()
                .allMatch(cargo -> cargo.getWeight() <maxWeight);

    }

    // TODO:
    // Return the heaviest cargo item
    public Cargo getHeaviestCargo() {
        // TODO implement using streams
        return cargoList.stream()
                .max(Comparator.comparing(cargo -> cargo.getWeight()))
                .orElse(null);
    }
}
