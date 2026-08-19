package p1143z4;

import android.os.Bundle;

/* JADX INFO: renamed from: z4.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21767I {

    /* JADX INFO: renamed from: b */
    public static final C21761C f69040b = new C21761C(false, 5);

    /* JADX INFO: renamed from: c */
    public static final C21761C f69041c = new C21761C(true, 4);

    /* JADX INFO: renamed from: d */
    public static final C21761C f69042d = new C21761C(false, 7);

    /* JADX INFO: renamed from: e */
    public static final C21761C f69043e = new C21761C(true, 6);

    /* JADX INFO: renamed from: f */
    public static final C21761C f69044f = new C21761C(false, 3);

    /* JADX INFO: renamed from: g */
    public static final C21761C f69045g = new C21761C(true, 2);

    /* JADX INFO: renamed from: h */
    public static final C21761C f69046h = new C21761C(false, 1);

    /* JADX INFO: renamed from: i */
    public static final C21761C f69047i = new C21761C(true, 0);

    /* JADX INFO: renamed from: j */
    public static final C21761C f69048j = new C21761C(true, 9);

    /* JADX INFO: renamed from: k */
    public static final C21761C f69049k = new C21761C(true, 8);

    /* JADX INFO: renamed from: a */
    public final boolean f69050a;

    public AbstractC21767I(boolean z6) {
        this.f69050a = z6;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo5893a(String str, Bundle bundle);

    /* JADX INFO: renamed from: b */
    public abstract String mo5894b();

    /* JADX INFO: renamed from: c */
    public abstract Object mo5895c(String str);

    /* JADX INFO: renamed from: d */
    public Object mo22255d(String str, Object obj) {
        return mo5895c(str);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo5896e(Bundle bundle, String str, Object obj);

    /* JADX INFO: renamed from: f */
    public String mo5897f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return mo5894b();
    }
}
