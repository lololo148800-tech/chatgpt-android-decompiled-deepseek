package p1090wm;

/* JADX INFO: renamed from: wm.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21019a {

    /* JADX INFO: renamed from: a */
    public static final Integer f66885a;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        f66885a = num2;
    }
}
