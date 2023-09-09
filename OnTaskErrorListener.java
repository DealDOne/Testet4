package JavaHomeWork1Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String errorResult);
}