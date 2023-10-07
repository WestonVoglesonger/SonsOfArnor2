package Game.Player.RelationshipSheet;

public class RelationSheetImpl implements RelationSheet {
    private EcounteredChars _characters;

    public RelationSheetImpl(EncounteredCharsImpl characters) {
        _characters = characters;
    }


    // Getters

    public EncounteredChars getChars() {
        return _characters;
    }

}
