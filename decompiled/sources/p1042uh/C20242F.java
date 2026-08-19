package p1042uh;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1107xh.EnumC21238b;
import p571X9.AbstractC9118D3;
import p594Y9.C9895g4;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17849b;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C20242F implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20242F f64050Y = new C20242F();

    /* JADX INFO: renamed from: Z */
    public static final List f64051Z = AbstractC17681o.m19382k("type", "acceptedMimeTypes", "imageMimeTypes");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20277m value = (C20277m) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("type");
        writer.mo20544L(value.f64116a.f67561Y);
        writer.mo20545M0("acceptedMimeTypes");
        C17849b c17849b = AbstractC17850c.f56903a;
        AbstractC17850c.m19593a(new C9895g4(c17849b)).mo369f(writer, customScalarAdapters, value.f64117b);
        writer.mo20545M0("imageMimeTypes");
        AbstractC17850c.m19593a(new C9895g4(c17849b)).mo369f(writer, customScalarAdapters, value.f64118c);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        Object next;
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        EnumC21238b enumC21238b = null;
        List list = null;
        List list2 = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64051Z);
            if (iMo20558B0 == 0) {
                String strMo20582x = reader.mo20582x();
                AbstractC16544l.m18091d(strMo20582x);
                EnumC21238b.f67556Z.getClass();
                Iterator it = EnumC21238b.f67560r0.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((EnumC21238b) next).f67561Y.equals(strMo20582x));
                EnumC21238b enumC21238b2 = (EnumC21238b) next;
                enumC21238b = enumC21238b2 == null ? EnumC21238b.UNKNOWN__ : enumC21238b2;
            } else if (iMo20558B0 == 1) {
                list = (List) AbstractC17850c.m19593a(new C9895g4(AbstractC17850c.f56903a)).mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 2) {
                    break;
                }
                list2 = (List) AbstractC17850c.m19593a(new C9895g4(AbstractC17850c.f56903a)).mo373j(reader, customScalarAdapters);
            }
        }
        if (enumC21238b != null) {
            return new C20277m(enumC21238b, list, list2);
        }
        AbstractC9118D3.m9646a(reader, "type");
        throw null;
    }
}
