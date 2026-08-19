package p1085wh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1064vh.AbstractC20617b;
import p1107xh.AbstractC21214D;
import p1107xh.AbstractC21215E;
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

/* JADX INFO: renamed from: wh.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20963k {

    /* JADX INFO: renamed from: a */
    public static final List f66762a;

    /* JADX INFO: renamed from: b */
    public static final List f66763b;

    /* JADX INFO: renamed from: c */
    public static final List f66764c;

    /* JADX INFO: renamed from: d */
    public static final List f66765d;

    /* JADX INFO: renamed from: e */
    public static final List f66766e;

    static {
        C17868u type = AbstractC21240c.f67585b;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List listM19382k = AbstractC17681o.m19382k(new C17859l("endCursor", type, c17689w, c17689w, c17689w), new C17859l("hasNextPage", AbstractC9136G3.m9676b(AbstractC21240c.f67588e), c17689w, c17689w, c17689w));
        f66762a = listM19382k;
        C17859l c17859l = new C17859l("__typename", AbstractC9136G3.m9676b(AbstractC21240c.f67592i), c17689w, c17689w, c17689w);
        List listM9974d = AbstractC9393x3.m9974d("Gizmo");
        List selections = AbstractC20617b.f65450p;
        AbstractC16544l.m18094g(selections, "selections");
        List listM19382k2 = AbstractC17681o.m19382k(c17859l, new C17860m("Gizmo", listM9974d, selections));
        f66763b = listM19382k2;
        C17840H type2 = AbstractC21241d.f67594a;
        AbstractC16544l.m18094g(type2, "type");
        List listM9974d2 = AbstractC9393x3.m9974d(new C17859l("node", type2, c17689w, c17689w, listM19382k2));
        f66764c = listM9974d2;
        List listM19382k3 = AbstractC17681o.m19382k(new C17859l("pageInfo", AbstractC9136G3.m9676b(AbstractC21235Z.f67553a), c17689w, c17689w, listM19382k), new C17859l("edges", AbstractC9136G3.m9675a(AbstractC21215E.f67488a), c17689w, c17689w, listM9974d2));
        f66765d = listM19382k3;
        C17840H type3 = AbstractC21214D.f67487a;
        AbstractC16544l.m18094g(type3, "type");
        f66766e = AbstractC9393x3.m9974d(new C17859l("gizmoSearch", type3, c17689w, AbstractC17681o.m19382k(new C17858k(AbstractC21239b0.f67565d, new C17844L(new C17866s("after"))), new C17858k(AbstractC21239b0.f67564c, new C17844L(new C17866s("first"))), new C17858k(AbstractC21239b0.f67563b, new C17844L(new C17866s("query")))), listM19382k3));
    }
}
