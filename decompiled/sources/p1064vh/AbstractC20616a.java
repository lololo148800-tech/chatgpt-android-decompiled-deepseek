package p1064vh;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1107xh.AbstractC21235Z;
import p1107xh.AbstractC21240c;
import p1107xh.AbstractC21241d;
import p1107xh.AbstractC21255r;
import p1107xh.AbstractC21256s;
import p1107xh.AbstractC21257t;
import p1107xh.EnumC21254q;
import p571X9.AbstractC9136G3;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p917o6.C17840H;
import p917o6.C17859l;
import p917o6.C17860m;
import p917o6.C17864q;
import p917o6.C17868u;
import p917o6.C17871x;

/* JADX INFO: renamed from: vh.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20616a {

    /* JADX INFO: renamed from: a */
    public static final List f65429a;

    /* JADX INFO: renamed from: b */
    public static final List f65430b;

    /* JADX INFO: renamed from: c */
    public static final List f65431c;

    /* JADX INFO: renamed from: d */
    public static final List f65432d;

    /* JADX INFO: renamed from: e */
    public static final List f65433e;

    /* JADX INFO: renamed from: f */
    public static final List f65434f;

    static {
        C17868u c17868u = AbstractC21240c.f67592i;
        C17864q c17864qM9676b = AbstractC9136G3.m9676b(c17868u);
        C17689w c17689w = C17689w.f56480Y;
        C17859l c17859l = new C17859l(ParameterNames.f31999ID, c17864qM9676b, c17689w, c17689w, c17689w);
        C17859l c17859l2 = new C17859l(UiComponentConfig.Title.type, AbstractC9136G3.m9676b(c17868u), c17689w, c17689w, c17689w);
        C17859l c17859l3 = new C17859l("description", c17868u, c17689w, c17689w, c17689w);
        EnumC21254q.f67618Z.getClass();
        C17871x type = EnumC21254q.f67619o0;
        AbstractC16544l.m18094g(type, "type");
        List listM19382k = AbstractC17681o.m19382k(c17859l, c17859l2, c17859l3, new C17859l("displayType", type, c17689w, c17689w, c17689w), new C17859l("displayGroup", c17868u, c17689w, c17689w, c17689w));
        f65429a = listM19382k;
        C17868u type2 = AbstractC21240c.f67585b;
        AbstractC16544l.m18094g(type2, "type");
        List listM19382k2 = AbstractC17681o.m19382k(new C17859l("endCursor", type2, c17689w, c17689w, c17689w), new C17859l("hasNextPage", AbstractC9136G3.m9676b(AbstractC21240c.f67588e), c17689w, c17689w, c17689w));
        f65430b = listM19382k2;
        C17859l c17859l4 = new C17859l("__typename", AbstractC9136G3.m9676b(c17868u), c17689w, c17689w, c17689w);
        List listM9974d = AbstractC9393x3.m9974d("Gizmo");
        List selections = AbstractC20617b.f65450p;
        AbstractC16544l.m18094g(selections, "selections");
        List listM19382k3 = AbstractC17681o.m19382k(c17859l4, new C17860m("Gizmo", listM9974d, selections));
        f65431c = listM19382k3;
        C17840H type3 = AbstractC21241d.f67594a;
        AbstractC16544l.m18094g(type3, "type");
        List listM9974d2 = AbstractC9393x3.m9974d(new C17859l("node", type3, c17689w, c17689w, listM19382k3));
        f65432d = listM9974d2;
        List listM19382k4 = AbstractC17681o.m19382k(new C17859l("pageInfo", AbstractC9136G3.m9676b(AbstractC21235Z.f67553a), c17689w, c17689w, listM19382k2), new C17859l("edges", AbstractC9136G3.m9675a(AbstractC21257t.f67628a), c17689w, c17689w, listM9974d2));
        f65433e = listM19382k4;
        C17859l c17859l5 = new C17859l(ParameterNames.INFO, AbstractC9136G3.m9676b(AbstractC21255r.f67626a), c17689w, c17689w, listM19382k);
        C17840H type4 = AbstractC21256s.f67627a;
        AbstractC16544l.m18094g(type4, "type");
        f65434f = AbstractC17681o.m19382k(c17859l5, new C17859l("items", type4, c17689w, c17689w, listM19382k4));
    }
}
