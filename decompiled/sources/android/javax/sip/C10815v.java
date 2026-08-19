package android.javax.sip;

import java.io.Serializable;

/* JADX INFO: renamed from: android.javax.sip.v */
/* JADX INFO: loaded from: classes.dex */
public final class C10815v implements Serializable {

    /* JADX INFO: renamed from: Z */
    public static final C10815v[] f32045Z = new C10815v[6];

    /* JADX INFO: renamed from: o0 */
    public static final C10815v f32046o0 = new C10815v(0);

    /* JADX INFO: renamed from: p0 */
    public static final C10815v f32047p0 = new C10815v(1);

    /* JADX INFO: renamed from: q0 */
    public static final C10815v f32048q0 = new C10815v(2);

    /* JADX INFO: renamed from: r0 */
    public static final C10815v f32049r0 = new C10815v(3);

    /* JADX INFO: renamed from: s0 */
    public static final C10815v f32050s0 = new C10815v(4);

    /* JADX INFO: renamed from: t0 */
    public static final C10815v f32051t0 = new C10815v(5);

    /* JADX INFO: renamed from: Y */
    public final int f32052Y;

    public C10815v(int i10) {
        this.f32052Y = i10;
        f32045Z[i10] = this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C10815v) && ((C10815v) obj).f32052Y == this.f32052Y;
    }

    public final int hashCode() {
        return this.f32052Y;
    }

    public final String toString() {
        int i10 = this.f32052Y;
        if (i10 == 0) {
            return "Calling Transaction";
        }
        if (i10 == 1) {
            return "Trying Transaction";
        }
        if (i10 == 2) {
            return "Proceeding Transaction";
        }
        if (i10 == 3) {
            return "Completed Transaction";
        }
        if (i10 != 4) {
            return i10 != 5 ? "Error while printing Transaction State" : "Terminated Transaction";
        }
        return "Confirmed Transaction";
    }
}
