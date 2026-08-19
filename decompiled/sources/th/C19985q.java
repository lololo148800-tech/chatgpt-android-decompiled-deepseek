package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19642t;

/* JADX INFO: renamed from: th.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C19985q implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19985q f63289Y = new C19985q();

    /* JADX INFO: renamed from: Z */
    public static final List f63290Z = AbstractC9393x3.m9974d("gizmoActionOperationUpdate");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19642t value = (C19642t) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("gizmoActionOperationUpdate");
        AbstractC17850c.f56909g.mo369f(writer, customScalarAdapters, value.f62290a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        Boolean bool = null;
        while (reader.mo20558B0(f63290Z) == 0) {
            bool = (Boolean) AbstractC17850c.f56909g.mo373j(reader, customScalarAdapters);
        }
        return new C19642t(bool);
    }
}
