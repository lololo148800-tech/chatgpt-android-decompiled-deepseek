package p911o0;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;

/* JADX INFO: renamed from: o0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17795y0 implements InterfaceC17716A0 {

    /* JADX INFO: renamed from: a */
    public final String f56778a;

    /* JADX INFO: renamed from: b */
    public final C6002f0 f56779b;

    public C17795y0(C17747a0 c17747a0, String str) {
        this.f56778a = str;
        this.f56779b = C5997d.m6430Q(c17747a0, C5975S.f19448r0);
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: a */
    public final int mo5505a(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        return m19545e().f56667a;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: b */
    public final int mo5506b(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        return m19545e().f56669c;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: c */
    public final int mo5507c(InterfaceC7537b interfaceC7537b) {
        return m19545e().f56670d;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: d */
    public final int mo5508d(InterfaceC7537b interfaceC7537b) {
        return m19545e().f56668b;
    }

    /* JADX INFO: renamed from: e */
    public final C17747a0 m19545e() {
        return (C17747a0) this.f56779b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17795y0) {
            return AbstractC16544l.m18089b(m19545e(), ((C17795y0) obj).m19545e());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m19546f(C17747a0 c17747a0) {
        this.f56779b.setValue(c17747a0);
    }

    public final int hashCode() {
        return this.f56778a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f56778a);
        sb2.append("(left=");
        sb2.append(m19545e().f56667a);
        sb2.append(", top=");
        sb2.append(m19545e().f56668b);
        sb2.append(", right=");
        sb2.append(m19545e().f56669c);
        sb2.append(", bottom=");
        return AbstractC12107L1.m13826q(sb2, m19545e().f56670d, ')');
    }
}
