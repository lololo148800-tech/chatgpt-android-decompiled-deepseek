package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19596L;

/* JADX INFO: renamed from: th.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C19949D implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19949D f63225Y = new C19949D();

    /* JADX INFO: renamed from: Z */
    public static final List f63226Z = AbstractC9393x3.m9974d("rating");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19596L value = (C19596L) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("rating");
        AbstractC17850c.f56908f.mo369f(writer, customScalarAdapters, value.f62207a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        while (reader.mo20558B0(f63226Z) == 0) {
            num = (Integer) AbstractC17850c.f56908f.mo373j(reader, customScalarAdapters);
        }
        return new C19596L(num);
    }
}
