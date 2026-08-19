package p172Gi;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1135yn.C21555b;
import p1155zi.EnumC22033m2;

/* JADX INFO: renamed from: Gi.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C3061C {

    /* JADX INFO: renamed from: a */
    public final C21555b f9229a;

    /* JADX INFO: renamed from: b */
    public final String f9230b;

    /* JADX INFO: renamed from: c */
    public final EnumC3062D f9231c;

    /* JADX INFO: renamed from: d */
    public final EnumC22033m2 f9232d;

    /* JADX INFO: renamed from: e */
    public final EnumC3068a f9233e;

    /* JADX INFO: renamed from: f */
    public final boolean f9234f;

    public C3061C(C21555b c21555b, String voiceSessionId, EnumC3062D surface, EnumC22033m2 mode, EnumC3068a enumC3068a, boolean z6) {
        AbstractC16544l.m18094g(voiceSessionId, "voiceSessionId");
        AbstractC16544l.m18094g(surface, "surface");
        AbstractC16544l.m18094g(mode, "mode");
        this.f9229a = c21555b;
        this.f9230b = voiceSessionId;
        this.f9231c = surface;
        this.f9232d = mode;
        this.f9233e = enumC3068a;
        this.f9234f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3061C)) {
            return false;
        }
        C3061C c3061c = (C3061C) obj;
        return AbstractC16544l.m18089b(this.f9229a, c3061c.f9229a) && AbstractC16544l.m18089b(this.f9230b, c3061c.f9230b) && this.f9231c == c3061c.f9231c && this.f9232d == c3061c.f9232d && this.f9233e == c3061c.f9233e && this.f9234f == c3061c.f9234f;
    }

    public final int hashCode() {
        C21555b c21555b = this.f9229a;
        int iHashCode = (this.f9232d.hashCode() + ((this.f9231c.hashCode() + AbstractC0168G.m527p((c21555b == null ? 0 : C21555b.m21837g(c21555b.f68263Y)) * 31, 31, this.f9230b)) * 31)) * 31;
        EnumC3068a enumC3068a = this.f9233e;
        return ((iHashCode + (enumC3068a != null ? enumC3068a.hashCode() : 0)) * 31) + (this.f9234f ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
