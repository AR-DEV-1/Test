public class Map {
    private List<Structure> structures;

    public Map() {
        structures = new ArrayList<>();

        // Add some intact structures
        structures.add(new Structure("Bunker 1", 100));
        structures.add(new Structure("Bunker 2", 100));
        structures.add(new Structure("Base 1", 200));
        structures.add(new Structure("Base 2", 200));

        // Add some broken structures
        structures.add(new BrokenStructure("Broken Bunker 1", 50, true));
        structures.add(new BrokenStructure("Broken Bunker 2", 50, true));
        structures.add(new BrokenStructure("Ruined Base 1", 100, true));
        structures.add(new BrokenStructure("Ruined Base 2", 100, true));
    }

    // Rest of the class
}
