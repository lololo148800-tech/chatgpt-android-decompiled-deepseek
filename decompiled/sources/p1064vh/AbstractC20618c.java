package p1064vh;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import p1107xh.AbstractC21240c;
import p1107xh.AbstractC21260w;
import p1107xh.EnumC21219I;
import p571X9.AbstractC9136G3;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p917o6.C17859l;
import p917o6.C17864q;
import p917o6.C17868u;

/* JADX INFO: renamed from: vh.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20618c {

    /* JADX INFO: renamed from: a */
    public static final List f65451a;

    /* JADX INFO: renamed from: b */
    public static final List f65452b;

    static {
        C17868u c17868u = AbstractC21240c.f67592i;
        C17864q c17864qM9676b = AbstractC9136G3.m9676b(c17868u);
        C17689w c17689w = C17689w.f56480Y;
        List listM19382k = AbstractC17681o.m19382k(new C17859l(DiagnosticsEntry.NAME_KEY, c17864qM9676b, c17689w, c17689w, c17689w), new C17859l("profilePictureUrl", c17868u, c17689w, c17689w, c17689w));
        f65451a = listM19382k;
        C17859l c17859l = new C17859l(ParameterNames.f31999ID, AbstractC9136G3.m9676b(AbstractC21240c.f67590g), c17689w, c17689w, c17689w);
        C17859l c17859l2 = new C17859l("legacyId", AbstractC9136G3.m9676b(c17868u), c17689w, c17689w, c17689w);
        C17859l c17859l3 = new C17859l("display", AbstractC9136G3.m9676b(AbstractC21260w.f67631a), c17689w, c17689w, listM19382k);
        EnumC21219I.f67500Z.getClass();
        f65452b = AbstractC17681o.m19382k(c17859l, c17859l2, c17859l3, new C17859l("tags", AbstractC9136G3.m9676b(AbstractC9136G3.m9675a(AbstractC9136G3.m9676b(EnumC21219I.f67501o0))), c17689w, c17689w, c17689w), new C17859l("gizmoType", c17868u, c17689w, c17689w, c17689w));
    }
}
