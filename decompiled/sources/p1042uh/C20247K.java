package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: uh.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C20247K implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20247K f64060Y = new C20247K();

    /* JADX INFO: renamed from: Z */
    public static final List f64061Z = AbstractC9393x3.m9974d("node");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20282r value = (C20282r) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("node");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20253Q.f64068Y, false)).mo369f(writer, customScalarAdapters, value.f64133a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e interfaceC19455e, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(interfaceC19455e, sVDIzpC.WBKCbUoJVoIx);
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C20287w c20287w = null;
        while (interfaceC19455e.mo20558B0(f64061Z) == 0) {
            c20287w = (C20287w) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20253Q.f64068Y, false)).mo373j(interfaceC19455e, customScalarAdapters);
        }
        return new C20282r(c20287w);
    }
}
