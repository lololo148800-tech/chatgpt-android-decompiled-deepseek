package p002A0;

import p211I8.lPE.sRXLFOsOgS;
import p228J.AbstractC3794B0;
import p467T1.EnumC7198h;
import p759g1.C13800b;

/* JADX INFO: renamed from: A0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0126c {

    /* JADX INFO: renamed from: e */
    public static final C0126c f535e = new C0126c(false, 9205357640488583168L, EnumC7198h.f22859Y, false);

    /* JADX INFO: renamed from: a */
    public final boolean f536a;

    /* JADX INFO: renamed from: b */
    public final long f537b;

    /* JADX INFO: renamed from: c */
    public final EnumC7198h f538c;

    /* JADX INFO: renamed from: d */
    public final boolean f539d;

    public C0126c(boolean z6, long j10, EnumC7198h enumC7198h, boolean z10) {
        this.f536a = z6;
        this.f537b = j10;
        this.f538c = enumC7198h;
        this.f539d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0126c)) {
            return false;
        }
        C0126c c0126c = (C0126c) obj;
        return this.f536a == c0126c.f536a && C13800b.m15303d(this.f537b, c0126c.f537b) && this.f538c == c0126c.f538c && this.f539d == c0126c.f539d;
    }

    public final int hashCode() {
        return ((this.f538c.hashCode() + ((C13800b.m15308i(this.f537b) + ((this.f536a ? 1231 : 1237) * 31)) * 31)) * 31) + (this.f539d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextFieldHandleState(visible=");
        sb2.append(this.f536a);
        sb2.append(", position=");
        sb2.append((Object) C13800b.m15313n(this.f537b));
        sb2.append(", direction=");
        sb2.append(this.f538c);
        sb2.append(sRXLFOsOgS.uhEiSsIx);
        return AbstractC3794B0.m4499x(sb2, this.f539d, ')');
    }
}
