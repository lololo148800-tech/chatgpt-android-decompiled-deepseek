package p1067vm;

/* JADX INFO: renamed from: vm.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20643a {

    /* JADX INFO: renamed from: a */
    public static final Integer f65519a;

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
        f65519a = num2;
    }
}
