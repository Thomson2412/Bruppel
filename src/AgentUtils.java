import java.util.Map;

public class AgentUtils {

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static float getRandomFreq(Map<String, Float> scale, int octMin, int octMax){
        int rand = AgentUtils.getRandomNumber(0, scale.size());
        String key = scale.keySet().toArray()[rand].toString();
        return scale.get(key) * AgentUtils.getRandomNumber(octMin, octMax);
    }
}
