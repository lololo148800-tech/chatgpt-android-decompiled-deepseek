package p1085wh;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1064vh.AbstractC20617b;
import p1107xh.AbstractC21239b0;
import p1107xh.AbstractC21240c;
import p1107xh.AbstractC21241d;
import p1107xh.AbstractC21242e;
import p1107xh.AbstractC21243f;
import p1107xh.AbstractC21247j;
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
import p917o6.C17868u;

/* JADX INFO: renamed from: wh.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20955c {

    /* JADX INFO: renamed from: a */
    public static final List f66738a;

    /* JADX INFO: renamed from: b */
    public static final List f66739b;

    /* JADX INFO: renamed from: c */
    public static final List f66740c;

    /* JADX INFO: renamed from: d */
    public static final List f66741d;

    /* JADX INFO: renamed from: e */
    public static final List f66742e;

    /* JADX INFO: renamed from: f */
    public static final List f66743f;

    /* JADX INFO: renamed from: g */
    public static final List f66744g;

    /* JADX INFO: renamed from: h */
    public static final List f66745h;

    static {
        C17868u c17868u = AbstractC21240c.f67592i;
        C17864q c17864qM9676b = AbstractC9136G3.m9676b(c17868u);
        C17689w c17689w = C17689w.f56480Y;
        C17859l c17859l = new C17859l("__typename", c17864qM9676b, c17689w, c17689w, c17689w);
        List listM9974d = AbstractC9393x3.m9974d("Gizmo");
        List selections = AbstractC20617b.f65450p;
        AbstractC16544l.m18094g(selections, "selections");
        List listM19382k = AbstractC17681o.m19382k(c17859l, new C17860m("Gizmo", listM9974d, selections));
        f66738a = listM19382k;
        List listM19382k2 = AbstractC17681o.m19382k(new C17859l(UiComponentConfig.Title.type, AbstractC9136G3.m9676b(c17868u), c17689w, c17689w, c17689w), new C17859l("subtitle", AbstractC9136G3.m9676b(c17868u), c17689w, c17689w, c17689w));
        f66739b = listM19382k2;
        List listM19382k3 = AbstractC17681o.m19382k(new C17859l("avg", AbstractC9136G3.m9676b(c17868u), c17689w, c17689w, c17689w), new C17859l("countStr", AbstractC9136G3.m9676b(c17868u), c17689w, c17689w, c17689w));
        f66740c = listM19382k3;
        C17859l c17859l2 = new C17859l("categoryStr", AbstractC9136G3.m9676b(c17868u), c17689w, c17689w, c17689w);
        C17868u type = AbstractC21240c.f67591h;
        AbstractC16544l.m18094g(type, "type");
        List listM19382k4 = AbstractC17681o.m19382k(c17859l2, new C17859l("categoryRanking", type, c17689w, c17689w, c17689w));
        f66741d = listM19382k4;
        List listM19382k5 = AbstractC17681o.m19382k(new C17859l("__typename", AbstractC9136G3.m9676b(c17868u), c17689w, c17689w, c17689w), new C17860m("GizmoAboutGenericTitleSubtitleBlock", AbstractC9393x3.m9974d("GizmoAboutGenericTitleSubtitleBlock"), listM19382k2), new C17860m("GizmoAboutRatingBlock", AbstractC9393x3.m9974d("GizmoAboutRatingBlock"), listM19382k3), new C17860m("GizmoAboutCategoryBlock", AbstractC9393x3.m9974d("GizmoAboutCategoryBlock"), listM19382k4));
        f66742e = listM19382k5;
        List listM9974d2 = AbstractC9393x3.m9974d(new C17859l("byRating", AbstractC9136G3.m9676b(AbstractC9136G3.m9675a(AbstractC9136G3.m9676b(AbstractC21240c.f67589f))), c17689w, c17689w, c17689w));
        f66743f = listM9974d2;
        C17859l c17859l3 = new C17859l("gizmo", AbstractC9136G3.m9676b(AbstractC21241d.f67594a), c17689w, c17689w, listM19382k);
        C17859l c17859l4 = new C17859l("aboutBlocks", AbstractC9136G3.m9676b(AbstractC9136G3.m9675a(AbstractC9136G3.m9676b(AbstractC21243f.f67596a))), c17689w, c17689w, listM19382k5);
        C17840H type2 = AbstractC21247j.f67600a;
        AbstractC16544l.m18094g(type2, "type");
        List listM19382k6 = AbstractC17681o.m19382k(c17859l3, c17859l4, new C17859l("reviewStats", type2, c17689w, c17689w, listM9974d2));
        f66744g = listM19382k6;
        C17840H type3 = AbstractC21242e.f67595a;
        AbstractC16544l.m18094g(type3, "type");
        f66745h = AbstractC9393x3.m9974d(new C17859l("gizmoAboutLegacy", type3, c17689w, AbstractC9393x3.m9974d(new C17858k(AbstractC21239b0.f67576o, new C17844L(new C17866s(ParameterNames.f31999ID)))), listM19382k6));
    }
}
