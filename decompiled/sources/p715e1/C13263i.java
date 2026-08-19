package p715e1;

import p523V9.AbstractC8111i5;
import p692d0.C12949B;
import p774h1.InterfaceC14324B;
import p843k1.C16308b;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: e1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C13263i implements InterfaceC14324B {

    /* JADX INFO: renamed from: a */
    public C12949B f41880a;

    /* JADX INFO: renamed from: b */
    public InterfaceC14324B f41881b;

    @Override // p774h1.InterfaceC14324B
    /* JADX INFO: renamed from: a */
    public final void mo14859a(C16308b c16308b) {
        InterfaceC14324B interfaceC14324B = this.f41881b;
        if (interfaceC14324B != null) {
            interfaceC14324B.mo14859a(c16308b);
        }
    }

    @Override // p774h1.InterfaceC14324B
    /* JADX INFO: renamed from: b */
    public final C16308b mo14860b() {
        InterfaceC14324B interfaceC14324B = this.f41881b;
        if (interfaceC14324B == null) {
            AbstractC8111i5.m8592c("GraphicsContext not provided");
            throw null;
        }
        C16308b c16308bMo14860b = interfaceC14324B.mo14860b();
        C12949B c12949b = this.f41880a;
        if (c12949b == null) {
            C12949B c12949b2 = new C12949B(1);
            c12949b2.m14607a(c16308bMo14860b);
            this.f41880a = c12949b2;
        } else {
            c12949b.m14607a(c16308bMo14860b);
        }
        return c16308bMo14860b;
    }

    /* JADX INFO: renamed from: c */
    public final void m14861c() {
        C12949B c12949b = this.f41880a;
        if (c12949b != null) {
            Object[] objArr = c12949b.f41115a;
            int i10 = c12949b.f41116b;
            for (int i11 = 0; i11 < i10; i11++) {
                mo14859a((C16308b) objArr[i11]);
            }
            AbstractC17678l.m19311r(c12949b.f41115a, null, 0, c12949b.f41116b);
            c12949b.f41116b = 0;
        }
    }
}
