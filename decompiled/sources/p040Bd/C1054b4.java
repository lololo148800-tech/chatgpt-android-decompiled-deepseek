package p040Bd;

import androidx.glance.appwidget.protobuf.C11043g0;
import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.b4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1054b4 {
    public static final C1047a4 Companion = new C1047a4();

    /* JADX INFO: renamed from: a */
    public final String f2883a;

    /* JADX INFO: renamed from: b */
    public final String f2884b;

    /* JADX INFO: renamed from: c */
    public final String f2885c;

    /* JADX INFO: renamed from: d */
    public final C5551u f2886d;

    /* JADX INFO: renamed from: e */
    public final String f2887e;

    public /* synthetic */ C1054b4(int i10, C5551u c5551u, String str, String str2, String str3, String str4) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C1040Z3.f2867a.getDescriptor());
            throw null;
        }
        this.f2883a = str;
        if ((i10 & 2) == 0) {
            this.f2884b = null;
        } else {
            this.f2884b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f2885c = null;
        } else {
            this.f2885c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f2886d = null;
        } else {
            this.f2886d = c5551u;
        }
        if ((i10 & 16) == 0) {
            this.f2887e = C11043g0.m12021a(str);
        } else {
            this.f2887e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1054b4)) {
            return false;
        }
        C1054b4 c1054b4 = (C1054b4) obj;
        return AbstractC16544l.m18089b(this.f2883a, c1054b4.f2883a) && AbstractC16544l.m18089b(this.f2884b, c1054b4.f2884b) && AbstractC16544l.m18089b(this.f2885c, c1054b4.f2885c) && AbstractC16544l.m18089b(this.f2886d, c1054b4.f2886d);
    }

    public final int hashCode() {
        int iHashCode = this.f2883a.hashCode() * 31;
        String str = this.f2884b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2885c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C5551u c5551u = this.f2886d;
        return iHashCode3 + (c5551u != null ? c5551u.f18004Y.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
