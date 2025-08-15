package misc;

import java.util.List;

public enum Speed {

    SLOW, NORMAL, FAST, FASTER, FASTEST;

    public static List<Speed> getBasicOnes() {
        return List.of(NORMAL, FAST, FASTEST);
    }
}
