package p087D7;

/* JADX INFO: renamed from: D7.e */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1978e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f5850a;

    static {
        int[] iArr = new int[Thread.State.values().length];
        try {
            iArr[Thread.State.NEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Thread.State.BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Thread.State.RUNNABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Thread.State.TERMINATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Thread.State.TIMED_WAITING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Thread.State.WAITING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f5850a = iArr;
    }
}
