package p1085wh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1064vh.AbstractC20618c;
import p1107xh.AbstractC21232W;
import p1107xh.AbstractC21233X;
import p1107xh.AbstractC21235Z;
import p1107xh.AbstractC21239b0;
import p1107xh.AbstractC21240c;
import p1107xh.AbstractC21241d;
import p571X9.AbstractC9136G3;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p917o6.C17840H;
import p917o6.C17844L;
import p917o6.C17858k;
import p917o6.C17859l;
import p917o6.C17860m;
import p917o6.C17866s;
import p917o6.C17868u;

/* JADX INFO: renamed from: wh.o */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20967o {

    /* JADX INFO: renamed from: a */
    public static final List f66774a;

    /* JADX INFO: renamed from: b */
    public static final List f66775b;

    /* JADX INFO: renamed from: c */
    public static final List f66776c;

    /* JADX INFO: renamed from: d */
    public static final List f66777d;

    /* JADX INFO: renamed from: e */
    public static final List f66778e;

    static {
        C17868u type = AbstractC21240c.f67585b;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List listM19382k = AbstractC17681o.m19382k(new C17859l("endCursor", type, c17689w, c17689w, c17689w), new C17859l("hasNextPage", AbstractC9136G3.m9676b(AbstractC21240c.f67588e), c17689w, c17689w, c17689w));
        f66774a = listM19382k;
        C17859l c17859l = new C17859l("__typename", AbstractC9136G3.m9676b(AbstractC21240c.f67592i), c17689w, c17689w, c17689w);
        List listM9974d = AbstractC9393x3.m9974d("Gizmo");
        List selections = AbstractC20618c.f65452b;
        AbstractC16544l.m18094g(selections, "selections");
        List listM19382k2 = AbstractC17681o.m19382k(c17859l, new C17860m("Gizmo", listM9974d, selections));
        f66775b = listM19382k2;
        C17840H type2 = AbstractC21241d.f67594a;
        AbstractC16544l.m18094g(type2, "type");
        List listM9974d2 = AbstractC9393x3.m9974d(new C17859l("node", type2, c17689w, c17689w, listM19382k2));
        f66776c = listM9974d2;
        List listM19382k3 = AbstractC17681o.m19382k(new C17859l("pageInfo", AbstractC9136G3.m9676b(AbstractC21235Z.f67553a), c17689w, c17689w, listM19382k), new C17859l("edges", AbstractC9136G3.m9675a(AbstractC21233X.f67541a), c17689w, c17689w, listM9974d2));
        f66777d = listM19382k3;
        C17840H type3 = AbstractC21232W.f67540a;
        AbstractC16544l.m18094g(type3, "type");
        f66778e = AbstractC9393x3.m9974d(new C17859l("gizmoWithMemory", type3, c17689w, AbstractC17681o.m19382k(new C17858k(AbstractC21239b0.f67566e, new C17844L(new C17866s("cursor"))), new C17858k(AbstractC21239b0.f67567f, new C17844L(new C17866s("limit")))), listM19382k3));
    }
}
