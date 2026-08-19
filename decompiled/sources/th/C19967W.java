package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1042uh.AbstractC20267c0;
import p1042uh.C20263a0;
import p571X9.AbstractC9118D3;
import p571X9.AbstractC9393x3;
import p582Xk.HXHG.TfazcFv;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19631k0;

/* JADX INFO: renamed from: th.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C19967W implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19967W f63261Y = new C19967W();

    /* JADX INFO: renamed from: Z */
    public static final List f63262Z = AbstractC9393x3.m9974d("__typename");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.mo20558B0(f63262Z) == 0) {
            str = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
        }
        reader.mo20560D0();
        C20263a0 c20263a0M21023a = AbstractC20267c0.m21023a(reader, customScalarAdapters);
        if (str != null) {
            return new C19631k0(str, c20263a0M21023a);
        }
        AbstractC9118D3.m9646a(reader, "__typename");
        throw null;
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19631k0 c19631k0 = (C19631k0) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(c19631k0, TfazcFv.EAphBTfAK);
        writer.mo20545M0("__typename");
        AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, c19631k0.f62265a);
        List list = AbstractC20267c0.f64098Y;
        AbstractC20267c0.m21024b(writer, customScalarAdapters, c19631k0.f62266b);
    }
}
