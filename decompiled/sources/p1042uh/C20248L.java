package p1042uh;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p523V9.AbstractC7865D0;
import p571X9.AbstractC9130F3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C20248L implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20248L f64062Y = new C20248L();

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        InterfaceC20283s value = (InterfaceC20283s) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        if (value instanceof C20285u) {
            List list = AbstractC20251O.f64065a;
            C20285u c20285u = (C20285u) value;
            writer.mo20545M0("__typename");
            AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, c20285u.f64137a);
            List list2 = AbstractC20255T.f64071Y;
            AbstractC20255T.m21022b(writer, customScalarAdapters, c20285u.f64138b);
            C20288x c20288x = c20285u.f64139c;
            if (c20288x != null) {
                AbstractC20254S.m21020b(writer, customScalarAdapters, c20288x);
                return;
            }
            return;
        }
        if (value instanceof C20284t) {
            List list3 = AbstractC20250N.f64064a;
            C20284t c20284t = (C20284t) value;
            writer.mo20545M0("__typename");
            AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, c20284t.f64134a);
            C20289y c20289y = c20284t.f64135b;
            if (c20289y != null) {
                AbstractC20255T.m21022b(writer, customScalarAdapters, c20289y);
            }
            List list4 = AbstractC20254S.f64070Y;
            AbstractC20254S.m21020b(writer, customScalarAdapters, c20284t.f64136c);
            return;
        }
        if (value instanceof C20290z) {
            List list5 = AbstractC20256U.f64072a;
            C20290z c20290z = (C20290z) value;
            writer.mo20545M0("__typename");
            AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, c20290z.f64153a);
            C20289y c20289y2 = c20290z.f64154b;
            if (c20289y2 != null) {
                AbstractC20255T.m21022b(writer, customScalarAdapters, c20289y2);
            }
            C20288x c20288x2 = c20290z.f64155c;
            if (c20288x2 != null) {
                AbstractC20254S.m21020b(writer, customScalarAdapters, c20288x2);
            }
        }
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        C20289y c20289yM21021a;
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String strM8146b = AbstractC7865D0.m8146b(reader);
        boolean zEquals = strM8146b.equals("GizmoLiveFile");
        C20288x c20288xM21019a = null;
        C20288x c20288xM21019a2 = null;
        C20289y c20289yM21021a2 = null;
        Set set = customScalarAdapters.f56962b;
        Set set2 = customScalarAdapters.f56961a;
        if (zEquals) {
            List list = AbstractC20251O.f64065a;
            while (reader.mo20558B0(AbstractC20251O.f64065a) == 0) {
                strM8146b = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            }
            reader.mo20560D0();
            C20289y c20289yM21021a3 = AbstractC20255T.m21021a(reader, customScalarAdapters);
            if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoFullFile"), set2, strM8146b, set)) {
                reader.mo20560D0();
                c20288xM21019a2 = AbstractC20254S.m21019a(reader, customScalarAdapters);
            }
            return new C20285u(strM8146b, c20289yM21021a3, c20288xM21019a2);
        }
        if (strM8146b.equals("GizmoFullFile")) {
            List list2 = AbstractC20250N.f64064a;
            while (reader.mo20558B0(AbstractC20250N.f64064a) == 0) {
                strM8146b = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            }
            if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoLiveFile"), set2, strM8146b, set)) {
                reader.mo20560D0();
                c20289yM21021a2 = AbstractC20255T.m21021a(reader, customScalarAdapters);
            }
            reader.mo20560D0();
            return new C20284t(strM8146b, c20289yM21021a2, AbstractC20254S.m21019a(reader, customScalarAdapters));
        }
        List list3 = AbstractC20256U.f64072a;
        while (reader.mo20558B0(AbstractC20256U.f64072a) == 0) {
            strM8146b = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
        }
        if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoLiveFile"), set2, strM8146b, set)) {
            reader.mo20560D0();
            c20289yM21021a = AbstractC20255T.m21021a(reader, customScalarAdapters);
        } else {
            c20289yM21021a = null;
        }
        if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoFullFile"), set2, strM8146b, set)) {
            reader.mo20560D0();
            c20288xM21019a = AbstractC20254S.m21019a(reader, customScalarAdapters);
        }
        return new C20290z(strM8146b, c20289yM21021a, c20288xM21019a);
    }
}
