package p040Bd;

import androidx.glance.appwidget.protobuf.C11043g0;
import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.G4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0928G4 {
    public static final C0904C4 Companion = new C0904C4();

    /* JADX INFO: renamed from: a */
    public final String f2674a;

    /* JADX INFO: renamed from: b */
    public final String f2675b;

    /* JADX INFO: renamed from: c */
    public final String f2676c;

    /* JADX INFO: renamed from: d */
    public final C0922F4 f2677d;

    /* JADX INFO: renamed from: e */
    public final String f2678e;

    public /* synthetic */ C0928G4(int i10, String str, String str2, String str3, C0922F4 c0922f4, String str4) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C0898B4.f2625a.getDescriptor());
            throw null;
        }
        this.f2674a = str;
        if ((i10 & 2) == 0) {
            this.f2675b = null;
        } else {
            this.f2675b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f2676c = null;
        } else {
            this.f2676c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f2677d = null;
        } else {
            this.f2677d = c0922f4;
        }
        if ((i10 & 16) == 0) {
            this.f2678e = C11043g0.m12021a(str);
        } else {
            this.f2678e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0928G4)) {
            return false;
        }
        C0928G4 c0928g4 = (C0928G4) obj;
        return AbstractC16544l.m18089b(this.f2674a, c0928g4.f2674a) && AbstractC16544l.m18089b(this.f2675b, c0928g4.f2675b) && AbstractC16544l.m18089b(this.f2676c, c0928g4.f2676c) && AbstractC16544l.m18089b(this.f2677d, c0928g4.f2677d);
    }

    public final int hashCode() {
        int iHashCode = this.f2674a.hashCode() * 31;
        String str = this.f2675b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2676c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C0922F4 c0922f4 = this.f2677d;
        return iHashCode3 + (c0922f4 != null ? c0922f4.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
