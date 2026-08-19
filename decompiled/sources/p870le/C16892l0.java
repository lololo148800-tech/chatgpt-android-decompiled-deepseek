package p870le;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: le.l0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16892l0 {
    public static final C16890k0 Companion = new C16890k0();

    /* JADX INFO: renamed from: a */
    public final String f54240a;

    /* JADX INFO: renamed from: b */
    public final String f54241b;

    /* JADX INFO: renamed from: c */
    public final String f54242c;

    /* JADX INFO: renamed from: d */
    public final String f54243d;

    public C16892l0(String str, String str2, String deviceId, String str3) {
        AbstractC16544l.m18094g(deviceId, "deviceId");
        this.f54240a = str;
        this.f54241b = str2;
        this.f54242c = deviceId;
        this.f54243d = str3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16892l0)) {
            return false;
        }
        C16892l0 c16892l0 = (C16892l0) obj;
        if (!AbstractC16544l.m18089b(this.f54240a, c16892l0.f54240a)) {
            return false;
        }
        String str = this.f54241b;
        String str2 = c16892l0.f54241b;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        if (!zM18089b || !AbstractC16544l.m18089b(this.f54242c, c16892l0.f54242c)) {
            return false;
        }
        String str3 = this.f54243d;
        String str4 = c16892l0.f54243d;
        if (str3 == null) {
            if (str4 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str4 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str3, str4);
        }
        return zM18089b2;
    }

    public final int hashCode() {
        String str = this.f54240a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f54241b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f54242c);
        String str3 = this.f54243d;
        return iM527p + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C16892l0(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C16888j0.f54229a.getDescriptor());
            throw null;
        }
        this.f54240a = str;
        this.f54241b = str2;
        this.f54242c = str3;
        this.f54243d = str4;
    }
}
