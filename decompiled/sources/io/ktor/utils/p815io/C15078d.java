package io.ktor.utils.p815io;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0624m;
import p523V9.AbstractC7966P5;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: io.ktor.utils.io.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15078d implements InterfaceC15079e {

    /* JADX INFO: renamed from: b */
    public final C0624m f46843b;

    /* JADX INFO: renamed from: c */
    public final Throwable f46844c;

    public C15078d(C0624m c0624m) {
        this.f46843b = c0624m;
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            return;
        }
        int iHashCode = c0624m.hashCode();
        AbstractC7966P5.m8254b(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC16544l.m18093f(string, "toString(...)");
        Throwable th2 = new Throwable("ReadTask 0x".concat(string));
        AbstractC9221V.m9790b(th2);
        this.f46844c = th2;
    }

    @Override // io.ktor.utils.p815io.InterfaceC15079e
    /* JADX INFO: renamed from: a */
    public final void mo16196a() {
        InterfaceC18770c interfaceC18770cM16199d = m16199d();
        InterfaceC15081g.f46847a.getClass();
        ((C0624m) interfaceC18770cM16199d).resumeWith(C17296C.f55119a);
    }

    @Override // io.ktor.utils.p815io.InterfaceC15079e
    /* JADX INFO: renamed from: b */
    public final void mo16197b(Throwable th2) {
        Object objM9806b;
        InterfaceC18770c interfaceC18770cM16199d = m16199d();
        if (th2 != null) {
            objM9806b = AbstractC9233X.m9806b(th2);
        } else {
            InterfaceC15081g.f46847a.getClass();
            objM9806b = C17296C.f55119a;
        }
        ((C0624m) interfaceC18770cM16199d).resumeWith(objM9806b);
    }

    @Override // io.ktor.utils.p815io.InterfaceC15079e
    /* JADX INFO: renamed from: c */
    public final Throwable mo16198c() {
        return this.f46844c;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC18770c m16199d() {
        return this.f46843b;
    }
}
