package p1085wh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1064vh.AbstractC20618c;
import p1107xh.AbstractC21240c;
import p1107xh.AbstractC21241d;
import p1107xh.AbstractC21251n;
import p571X9.AbstractC9136G3;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p917o6.C17859l;
import p917o6.C17860m;
import p917o6.C17864q;

/* JADX INFO: renamed from: wh.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20957e {

    /* JADX INFO: renamed from: a */
    public static final List f66747a;

    /* JADX INFO: renamed from: b */
    public static final List f66748b;

    /* JADX INFO: renamed from: c */
    public static final List f66749c;

    static {
        C17864q c17864qM9676b = AbstractC9136G3.m9676b(AbstractC21240c.f67592i);
        C17689w c17689w = C17689w.f56480Y;
        C17859l c17859l = new C17859l("__typename", c17864qM9676b, c17689w, c17689w, c17689w);
        List listM9974d = AbstractC9393x3.m9974d("Gizmo");
        List selections = AbstractC20618c.f65452b;
        AbstractC16544l.m18094g(selections, "selections");
        List listM19382k = AbstractC17681o.m19382k(c17859l, new C17860m("Gizmo", listM9974d, selections));
        f66747a = listM19382k;
        List listM9974d2 = AbstractC9393x3.m9974d(new C17859l("gizmo", AbstractC9136G3.m9676b(AbstractC21241d.f67594a), c17689w, c17689w, listM19382k));
        f66748b = listM9974d2;
        f66749c = AbstractC9393x3.m9974d(new C17859l("gizmoBootstrap", AbstractC9136G3.m9676b(AbstractC9136G3.m9675a(AbstractC9136G3.m9676b(AbstractC21251n.f67611a))), c17689w, c17689w, listM9974d2));
    }
}
