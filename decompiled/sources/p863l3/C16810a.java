package p863l3;

import com.google.protobuf.AbstractC12107L1;
import p637a3.C10495l;
import p637a3.InterfaceC10492i;
import p637a3.InterfaceC10497n;

/* JADX INFO: renamed from: l3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16810a implements InterfaceC10492i {

    /* JADX INFO: renamed from: b */
    public C16813d f53939b;

    /* JADX INFO: renamed from: a */
    public String f53938a = "";

    /* JADX INFO: renamed from: c */
    public int f53940c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public InterfaceC10497n f53941d = C10495l.f31097a;

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: a */
    public final InterfaceC10492i mo10955a() {
        C16810a c16810a = new C16810a();
        c16810a.f53941d = this.f53941d;
        c16810a.f53938a = this.f53938a;
        c16810a.f53939b = this.f53939b;
        c16810a.f53940c = this.f53940c;
        return c16810a;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: b */
    public final InterfaceC10497n mo10956b() {
        return this.f53941d;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: c */
    public final void mo10957c(InterfaceC10497n interfaceC10497n) {
        this.f53941d = interfaceC10497n;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmittableText(");
        sb2.append(this.f53938a);
        sb2.append(", style=");
        sb2.append(this.f53939b);
        sb2.append(", modifier=");
        sb2.append(this.f53941d);
        sb2.append(", maxLines=");
        return AbstractC12107L1.m13826q(sb2, this.f53940c, ')');
    }
}
