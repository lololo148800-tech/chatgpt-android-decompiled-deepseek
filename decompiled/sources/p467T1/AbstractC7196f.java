package p467T1;

/* JADX INFO: renamed from: T1.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7196f {

    /* JADX INFO: renamed from: a */
    public static final float f22853a;

    /* JADX INFO: renamed from: b */
    public static final float f22854b;

    /* JADX INFO: renamed from: c */
    public static final float f22855c;

    static {
        m7595a(0.0f);
        m7595a(0.5f);
        f22853a = 0.5f;
        m7595a(-1.0f);
        f22854b = -1.0f;
        m7595a(1.0f);
        f22855c = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public static void m7595a(float f10) {
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }
}
