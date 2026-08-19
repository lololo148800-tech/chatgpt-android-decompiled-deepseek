package th;

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
import sh.C19628j;
import sh.C19630k;
import sh.C19634m;
import sh.C19636n;
import sh.C19637o;
import sh.C19638p;
import sh.C19639q;
import sh.InterfaceC19622g;

/* JADX INFO: renamed from: th.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C19973e implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19973e f63273Y = new C19973e();

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        InterfaceC19622g value = (InterfaceC19622g) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        if (value instanceof C19630k) {
            List list = AbstractC19977i.f63279a;
            C19630k c19630k = (C19630k) value;
            writer.mo20545M0("__typename");
            AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, c19630k.f62261a);
            List list2 = AbstractC19981m.f63284Y;
            AbstractC19981m.m20803b(writer, customScalarAdapters, c19630k.f62262b);
            C19638p c19638p = c19630k.f62263c;
            if (c19638p != null) {
                AbstractC19982n.m20805b(writer, customScalarAdapters, c19638p);
            }
            C19636n c19636n = c19630k.f62264d;
            if (c19636n != null) {
                AbstractC19980l.m20801b(writer, customScalarAdapters, c19636n);
                return;
            }
            return;
        }
        if (value instanceof C19634m) {
            List list3 = AbstractC19979k.f63282a;
            C19634m c19634m = (C19634m) value;
            writer.mo20545M0("__typename");
            AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, c19634m.f62272a);
            C19637o c19637o = c19634m.f62273b;
            if (c19637o != null) {
                AbstractC19981m.m20803b(writer, customScalarAdapters, c19637o);
            }
            List list4 = AbstractC19982n.f63285Y;
            AbstractC19982n.m20805b(writer, customScalarAdapters, c19634m.f62274c);
            C19636n c19636n2 = c19634m.f62275d;
            if (c19636n2 != null) {
                AbstractC19980l.m20801b(writer, customScalarAdapters, c19636n2);
                return;
            }
            return;
        }
        if (value instanceof C19628j) {
            List list5 = AbstractC19976h.f63278a;
            C19628j c19628j = (C19628j) value;
            writer.mo20545M0("__typename");
            AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, c19628j.f62255a);
            C19637o c19637o2 = c19628j.f62256b;
            if (c19637o2 != null) {
                AbstractC19981m.m20803b(writer, customScalarAdapters, c19637o2);
            }
            C19638p c19638p2 = c19628j.f62257c;
            if (c19638p2 != null) {
                AbstractC19982n.m20805b(writer, customScalarAdapters, c19638p2);
            }
            List list6 = AbstractC19980l.f63283Y;
            AbstractC19980l.m20801b(writer, customScalarAdapters, c19628j.f62258d);
            return;
        }
        if (value instanceof C19639q) {
            List list7 = AbstractC19983o.f63286a;
            C19639q c19639q = (C19639q) value;
            writer.mo20545M0("__typename");
            AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, c19639q.f62284a);
            C19637o c19637o3 = c19639q.f62285b;
            if (c19637o3 != null) {
                AbstractC19981m.m20803b(writer, customScalarAdapters, c19637o3);
            }
            C19638p c19638p3 = c19639q.f62286c;
            if (c19638p3 != null) {
                AbstractC19982n.m20805b(writer, customScalarAdapters, c19638p3);
            }
            C19636n c19636n3 = c19639q.f62287d;
            if (c19636n3 != null) {
                AbstractC19980l.m20801b(writer, customScalarAdapters, c19636n3);
            }
        }
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        C19637o c19637oM20802a;
        C19637o c19637oM20802a2;
        C19638p c19638pM20804a;
        C19637o c19637oM20802a3;
        C19638p c19638pM20804a2;
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String strM8146b = AbstractC7865D0.m8146b(reader);
        int iHashCode = strM8146b.hashCode();
        C19636n c19636nM20800a = null;
        C19636n c19636nM20800a2 = null;
        C19638p c19638pM20804a3 = null;
        C19636n c19636nM20800a3 = null;
        Set set = customScalarAdapters.f56962b;
        Set set2 = customScalarAdapters.f56961a;
        if (iHashCode != -1034961251) {
            if (iHashCode != -761925476) {
                if (iHashCode == 2081931521 && strM8146b.equals("GizmoAboutGenericTitleSubtitleBlock")) {
                    List list = AbstractC19977i.f63279a;
                    while (reader.mo20558B0(AbstractC19977i.f63279a) == 0) {
                        strM8146b = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
                    }
                    reader.mo20560D0();
                    C19637o c19637oM20802a4 = AbstractC19981m.m20802a(reader, customScalarAdapters);
                    if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoAboutRatingBlock"), set2, strM8146b, set)) {
                        reader.mo20560D0();
                        c19638pM20804a2 = AbstractC19982n.m20804a(reader, customScalarAdapters);
                    } else {
                        c19638pM20804a2 = null;
                    }
                    if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoAboutCategoryBlock"), set2, strM8146b, set)) {
                        reader.mo20560D0();
                        c19636nM20800a2 = AbstractC19980l.m20800a(reader, customScalarAdapters);
                    }
                    return new C19630k(strM8146b, c19637oM20802a4, c19638pM20804a2, c19636nM20800a2);
                }
            } else if (strM8146b.equals("GizmoAboutCategoryBlock")) {
                List list2 = AbstractC19976h.f63278a;
                while (reader.mo20558B0(AbstractC19976h.f63278a) == 0) {
                    strM8146b = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
                }
                if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoAboutGenericTitleSubtitleBlock"), set2, strM8146b, set)) {
                    reader.mo20560D0();
                    c19637oM20802a3 = AbstractC19981m.m20802a(reader, customScalarAdapters);
                } else {
                    c19637oM20802a3 = null;
                }
                if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoAboutRatingBlock"), set2, strM8146b, set)) {
                    reader.mo20560D0();
                    c19638pM20804a3 = AbstractC19982n.m20804a(reader, customScalarAdapters);
                }
                reader.mo20560D0();
                return new C19628j(strM8146b, c19637oM20802a3, c19638pM20804a3, AbstractC19980l.m20800a(reader, customScalarAdapters));
            }
        } else if (strM8146b.equals("GizmoAboutRatingBlock")) {
            List list3 = AbstractC19979k.f63282a;
            while (reader.mo20558B0(AbstractC19979k.f63282a) == 0) {
                strM8146b = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            }
            if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoAboutGenericTitleSubtitleBlock"), set2, strM8146b, set)) {
                reader.mo20560D0();
                c19637oM20802a = AbstractC19981m.m20802a(reader, customScalarAdapters);
            } else {
                c19637oM20802a = null;
            }
            reader.mo20560D0();
            C19638p c19638pM20804a4 = AbstractC19982n.m20804a(reader, customScalarAdapters);
            if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoAboutCategoryBlock"), set2, strM8146b, set)) {
                reader.mo20560D0();
                c19636nM20800a = AbstractC19980l.m20800a(reader, customScalarAdapters);
            }
            return new C19634m(strM8146b, c19637oM20802a, c19638pM20804a4, c19636nM20800a);
        }
        List list4 = AbstractC19983o.f63286a;
        while (reader.mo20558B0(AbstractC19983o.f63286a) == 0) {
            strM8146b = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
        }
        if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoAboutGenericTitleSubtitleBlock"), set2, strM8146b, set)) {
            reader.mo20560D0();
            c19637oM20802a2 = AbstractC19981m.m20802a(reader, customScalarAdapters);
        } else {
            c19637oM20802a2 = null;
        }
        if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoAboutRatingBlock"), set2, strM8146b, set)) {
            reader.mo20560D0();
            c19638pM20804a = AbstractC19982n.m20804a(reader, customScalarAdapters);
        } else {
            c19638pM20804a = null;
        }
        if (AbstractC9130F3.m9670b(AbstractC9130F3.m9671c("GizmoAboutCategoryBlock"), set2, strM8146b, set)) {
            reader.mo20560D0();
            c19636nM20800a3 = AbstractC19980l.m20800a(reader, customScalarAdapters);
        }
        return new C19639q(strM8146b, c19637oM20802a2, c19638pM20804a, c19636nM20800a3);
    }
}
