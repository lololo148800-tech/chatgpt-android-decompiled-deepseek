package p911o0;

import com.google.protobuf.AbstractC12107L1;
import p030B2.C0794y0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p979r2.C18862c;

/* JADX INFO: renamed from: o0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17754e implements InterfaceC17716A0 {

    /* JADX INFO: renamed from: a */
    public final int f56688a;

    /* JADX INFO: renamed from: b */
    public final String f56689b;

    /* JADX INFO: renamed from: c */
    public final C6002f0 f56690c;

    /* JADX INFO: renamed from: d */
    public final C6002f0 f56691d;

    public C17754e(int i10, String str) {
        this.f56688a = i10;
        this.f56689b = str;
        C18862c c18862c = C18862c.f60085e;
        C5975S c5975s = C5975S.f19448r0;
        this.f56690c = C5997d.m6430Q(c18862c, c5975s);
        this.f56691d = C5997d.m6430Q(Boolean.TRUE, c5975s);
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: a */
    public final int mo5505a(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        return m19476e().f60086a;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: b */
    public final int mo5506b(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        return m19476e().f60088c;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: c */
    public final int mo5507c(InterfaceC7537b interfaceC7537b) {
        return m19476e().f60089d;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: d */
    public final int mo5508d(InterfaceC7537b interfaceC7537b) {
        return m19476e().f60087b;
    }

    /* JADX INFO: renamed from: e */
    public final C18862c m19476e() {
        return (C18862c) this.f56690c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17754e) {
            return this.f56688a == ((C17754e) obj).f56688a;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m19477f(C0794y0 c0794y0, int i10) {
        int i11 = this.f56688a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f56690c.setValue(c0794y0.f2209a.mo1754f(i11));
            this.f56691d.setValue(Boolean.valueOf(c0794y0.f2209a.mo1759p(i11)));
        }
    }

    public final int hashCode() {
        return this.f56688a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f56689b);
        sb2.append('(');
        sb2.append(m19476e().f60086a);
        sb2.append(", ");
        sb2.append(m19476e().f60087b);
        sb2.append(", ");
        sb2.append(m19476e().f60088c);
        sb2.append(", ");
        return AbstractC12107L1.m13826q(sb2, m19476e().f60089d, ')');
    }
}
