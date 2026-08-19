package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C20259X implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20259X f64077Y = new C20259X();

    /* JADX INFO: renamed from: Z */
    public static final List f64078Z = AbstractC9393x3.m9974d("numConversationsStr");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20239C value = (C20239C) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("numConversationsStr");
        AbstractC17850c.f56907e.mo369f(writer, customScalarAdapters, value.f64033a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.mo20558B0(f64078Z) == 0) {
            str = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
        }
        return new C20239C(str);
    }
}
