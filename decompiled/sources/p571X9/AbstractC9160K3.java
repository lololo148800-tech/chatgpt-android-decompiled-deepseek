package p571X9;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.C19461k;
import p784hb.C14438g;
import p917o6.C17867t;
import p917o6.InterfaceC17842J;

/* JADX INFO: renamed from: X9.K3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9160K3 {
    /* JADX INFO: renamed from: a */
    public static final boolean m9708a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m9709b(int i10) {
        if (m9708a(i10, 1)) {
            return "Clip";
        }
        if (m9708a(i10, 2)) {
            return "Ellipsis";
        }
        return m9708a(i10, 3) ? "Visible" : "Invalid";
    }

    /* JADX INFO: renamed from: c */
    public static final C14438g m9710c(InterfaceC17842J interfaceC17842J, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(interfaceC17842J, "<this>");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19461k c19461k = new C19461k();
        c19461k.mo20554o();
        interfaceC17842J.mo19592e(c19461k, customScalarAdapters);
        c19461k.mo20551j();
        Object objM20589e = c19461k.m20589e();
        AbstractC16544l.m18092e(objM20589e, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return new C14438g((Map) objM20589e);
    }
}
