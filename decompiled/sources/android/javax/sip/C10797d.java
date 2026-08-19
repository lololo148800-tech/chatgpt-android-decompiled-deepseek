package android.javax.sip;

import java.io.Serializable;

/* JADX INFO: renamed from: android.javax.sip.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10797d implements Serializable {

    /* JADX INFO: renamed from: Z */
    public static final C10797d[] f32032Z = new C10797d[4];

    /* JADX INFO: renamed from: o0 */
    public static final C10797d f32033o0 = new C10797d(0);

    /* JADX INFO: renamed from: p0 */
    public static final C10797d f32034p0 = new C10797d(1);

    /* JADX INFO: renamed from: q0 */
    public static final C10797d f32035q0;

    /* JADX INFO: renamed from: Y */
    public final int f32036Y;

    static {
        new C10797d(2);
        f32035q0 = new C10797d(3);
    }

    public C10797d(int i10) {
        this.f32036Y = i10;
        f32032Z[i10] = this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C10797d) && ((C10797d) obj).f32036Y == this.f32036Y;
    }

    public final int hashCode() {
        return this.f32036Y;
    }

    public final String toString() {
        int i10 = this.f32036Y;
        if (i10 == 0) {
            return "Early Dialog";
        }
        if (i10 == 1) {
            return "Confirmed Dialog";
        }
        if (i10 != 2) {
            return i10 != 3 ? "Error while printing Dialog State" : "Terminated Dialog";
        }
        return "Completed Dialog";
    }
}
