package p1085wh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1064vh.AbstractC20616a;
import p1107xh.AbstractC21239b0;
import p1107xh.AbstractC21240c;
import p1107xh.AbstractC21253p;
import p1107xh.AbstractC21258u;
import p571X9.AbstractC9136G3;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p917o6.C17840H;
import p917o6.C17844L;
import p917o6.C17858k;
import p917o6.C17859l;
import p917o6.C17860m;
import p917o6.C17864q;
import p917o6.C17866s;

/* JADX INFO: renamed from: wh.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20960h {

    /* JADX INFO: renamed from: a */
    public static final List f66755a;

    /* JADX INFO: renamed from: b */
    public static final List f66756b;

    /* JADX INFO: renamed from: c */
    public static final List f66757c;

    static {
        C17864q c17864qM9676b = AbstractC9136G3.m9676b(AbstractC21240c.f67592i);
        C17689w c17689w = C17689w.f56480Y;
        C17859l c17859l = new C17859l("__typename", c17864qM9676b, c17689w, c17689w, c17689w);
        List listM9974d = AbstractC9393x3.m9974d("GizmoDiscoveryCut");
        List selections = AbstractC20616a.f65434f;
        AbstractC16544l.m18094g(selections, "selections");
        List listM19382k = AbstractC17681o.m19382k(c17859l, new C17860m("GizmoDiscoveryCut", listM9974d, selections));
        f66755a = listM19382k;
        List listM9974d2 = AbstractC9393x3.m9974d(new C17859l("cuts", AbstractC9136G3.m9676b(AbstractC9136G3.m9675a(AbstractC9136G3.m9676b(AbstractC21253p.f67617a))), c17689w, c17689w, listM19382k));
        f66756b = listM9974d2;
        C17840H type = AbstractC21258u.f67629a;
        AbstractC16544l.m18094g(type, "type");
        f66757c = AbstractC9393x3.m9974d(new C17859l("gizmoDiscovery", type, c17689w, AbstractC17681o.m19382k(new C17858k(AbstractC21239b0.f67569h, new C17844L(new C17866s("first"))), new C17858k(AbstractC21239b0.f67568g, new C17844L(new C17866s("locale")))), listM9974d2));
    }
}
