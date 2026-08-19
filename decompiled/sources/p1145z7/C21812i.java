package p1145z7;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: z7.i */
/* JADX INFO: loaded from: classes.dex */
public final class C21812i {

    /* JADX INFO: renamed from: a */
    public final boolean f69180a;

    /* JADX INFO: renamed from: b */
    public final int f69181b;

    /* JADX INFO: renamed from: c */
    public final boolean f69182c;

    /* JADX INFO: renamed from: d */
    public final boolean f69183d;

    public /* synthetic */ C21812i() {
        this(-1, false, false, false);
    }

    /* JADX INFO: renamed from: a */
    public static C21812i m22290a(C21812i c21812i, boolean z6, int i10, boolean z10, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            z6 = c21812i.f69180a;
        }
        if ((i11 & 2) != 0) {
            i10 = c21812i.f69181b;
        }
        if ((i11 & 4) != 0) {
            z10 = c21812i.f69182c;
        }
        if ((i11 & 8) != 0) {
            z11 = c21812i.f69183d;
        }
        c21812i.getClass();
        return new C21812i(i10, z6, z10, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21812i)) {
            return false;
        }
        C21812i c21812i = (C21812i) obj;
        return this.f69180a == c21812i.f69180a && this.f69181b == c21812i.f69181b && this.f69182c == c21812i.f69182c && this.f69183d == c21812i.f69183d;
    }

    public final int hashCode() {
        return ((((((this.f69180a ? 1231 : 1237) * 31) + this.f69181b) * 31) + (this.f69182c ? 1231 : 1237)) * 31) + (this.f69183d ? 1231 : 1237);
    }

    public final String toString() {
        return "SystemInfo(batteryFullOrCharging=" + this.f69180a + ", batteryLevel=" + this.f69181b + ", powerSaveMode=" + this.f69182c + ", onExternalPowerSource=" + this.f69183d + Separators.RPAREN;
    }

    public C21812i(int i10, boolean z6, boolean z10, boolean z11) {
        this.f69180a = z6;
        this.f69181b = i10;
        this.f69182c = z10;
        this.f69183d = z11;
    }
}
