package InterfaceSegregationPrinciple;

public interface ComplexMediaPlayer extends SimpleMediaPlayer{
    void next();
    void previous();
    void shuffle();
}
