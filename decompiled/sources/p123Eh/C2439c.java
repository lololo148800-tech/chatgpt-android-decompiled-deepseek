package p123Eh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Eh.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2439c {
    public static final C2438b Companion = new C2438b();

    /* JADX INFO: renamed from: a */
    public final String f7576a;

    /* JADX INFO: renamed from: b */
    public final String f7577b;

    /* JADX INFO: renamed from: c */
    public final String f7578c;

    /* JADX INFO: renamed from: d */
    public final String f7579d;

    public /* synthetic */ C2439c(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C2437a.f7575a.getDescriptor());
            throw null;
        }
        this.f7576a = str;
        this.f7577b = str2;
        this.f7578c = str3;
        this.f7579d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2439c)) {
            return false;
        }
        C2439c c2439c = (C2439c) obj;
        return AbstractC16544l.m18089b(this.f7576a, c2439c.f7576a) && AbstractC16544l.m18089b(this.f7577b, c2439c.f7577b) && AbstractC16544l.m18089b(this.f7578c, c2439c.f7578c) && AbstractC16544l.m18089b(this.f7579d, c2439c.f7579d);
    }

    public final int hashCode() {
        return this.f7579d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f7576a.hashCode() * 31, 31, this.f7577b), 31, this.f7578c);
    }

    public final String toString() {
        return "█";
    }

    public C2439c(String str, String nonce, String str2, String deviceId) {
        AbstractC16544l.m18094g(nonce, "nonce");
        AbstractC16544l.m18094g(deviceId, "deviceId");
        this.f7576a = str;
        this.f7577b = nonce;
        this.f7578c = str2;
        this.f7579d = deviceId;
    }
}
