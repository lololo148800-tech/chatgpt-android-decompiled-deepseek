package p889m9;

import java.util.Arrays;
import p1022t9.InterfaceC19817b;
import p1060v9.AbstractC20502t;
import p1139z0.C21585H;

/* JADX INFO: renamed from: m9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17200b implements InterfaceC19817b {

    /* JADX INFO: renamed from: o0 */
    public static final C17200b f54908o0;

    /* JADX INFO: renamed from: Y */
    public final boolean f54909Y;

    /* JADX INFO: renamed from: Z */
    public final String f54910Z;

    static {
        C21585H c21585h = new C21585H(16, (byte) 0);
        c21585h.f68344Z = Boolean.FALSE;
        f54908o0 = new C17200b(c21585h);
    }

    public C17200b(C21585H c21585h) {
        this.f54909Y = ((Boolean) c21585h.f68344Z).booleanValue();
        this.f54910Z = (String) c21585h.f68345o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17200b)) {
            return false;
        }
        C17200b c17200b = (C17200b) obj;
        c17200b.getClass();
        return AbstractC20502t.m21161l(null, null) && this.f54909Y == c17200b.f54909Y && AbstractC20502t.m21161l(this.f54910Z, c17200b.f54910Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f54909Y), this.f54910Z});
    }
}
