package p917o6;

import kotlin.jvm.internal.AbstractC16544l;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p1006s6.EnumC19454d;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;

/* JADX INFO: renamed from: o6.G */
/* JADX INFO: loaded from: classes.dex */
public final class C17839G implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC17848a f56898Y;

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        if (obj == null) {
            writer.mo20543I0();
        } else {
            this.f56898Y.mo369f(writer, customScalarAdapters, obj);
        }
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        if (reader.peek() != EnumC19454d.f61743v0) {
            return this.f56898Y.mo373j(reader, customScalarAdapters);
        }
        reader.mo20559D();
        return null;
    }

    public C17839G(InterfaceC17848a interfaceC17848a) {
        AbstractC16544l.m18094g(interfaceC17848a, QzvfuIgrngtl.ZgnLWwlDSv);
        this.f56898Y = interfaceC17848a;
        if (interfaceC17848a instanceof C17839G) {
            throw new IllegalStateException("The adapter is already nullable");
        }
    }
}
