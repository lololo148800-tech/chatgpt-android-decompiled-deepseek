package p1085wh;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1064vh.AbstractC20618c;
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
import p917o6.C17864q;
import p917o6.C17866s;

/* JADX INFO: renamed from: wh.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20953a {

    /* JADX INFO: renamed from: a */
    public static final List f66734a;

    /* JADX INFO: renamed from: b */
    public static final List f66735b;

    static {
        C17864q c17864qM9676b = AbstractC9136G3.m9676b(AbstractC21240c.f67592i);
        C17689w c17689w = C17689w.f56480Y;
        C17859l c17859l = new C17859l("__typename", c17864qM9676b, c17689w, c17689w, c17689w);
        List listM9974d = AbstractC9393x3.m9974d("Gizmo");
        List selections = AbstractC20618c.f65452b;
        AbstractC16544l.m18094g(selections, "selections");
        List listM19382k = AbstractC17681o.m19382k(c17859l, new C17860m("Gizmo", listM9974d, selections));
        f66734a = listM19382k;
        C17840H type = AbstractC21241d.f67594a;
        AbstractC16544l.m18094g(type, "type");
        f66735b = AbstractC9393x3.m9974d(new C17859l("gizmoLegacy", type, c17689w, AbstractC9393x3.m9974d(new C17858k(AbstractC21239b0.f67562a, new C17844L(new C17866s(ParameterNames.f31999ID)))), listM19382k));
    }
}
