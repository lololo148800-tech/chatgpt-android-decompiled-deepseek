package p1085wh;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1107xh.AbstractC21227Q;
import p1107xh.AbstractC21228S;
import p1107xh.AbstractC21239b0;
import p1107xh.AbstractC21240c;
import p1107xh.AbstractC21248k;
import p1107xh.EnumC21212B;
import p1107xh.EnumC21249l;
import p571X9.AbstractC9136G3;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p917o6.C17840H;
import p917o6.C17844L;
import p917o6.C17858k;
import p917o6.C17859l;
import p917o6.C17866s;
import p917o6.C17871x;

/* JADX INFO: renamed from: wh.n */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20966n {

    /* JADX INFO: renamed from: a */
    public static final List f66770a;

    /* JADX INFO: renamed from: b */
    public static final List f66771b;

    /* JADX INFO: renamed from: c */
    public static final List f66772c;

    /* JADX INFO: renamed from: d */
    public static final List f66773d;

    static {
        EnumC21249l.f67602Z.getClass();
        C17871x type = EnumC21249l.f67603o0;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List listM9974d = AbstractC9393x3.m9974d(new C17859l("all", type, c17689w, c17689w, c17689w));
        f66770a = listM9974d;
        C17859l c17859l = new C17859l("actionId", AbstractC9136G3.m9676b(AbstractC21240c.f67592i), c17689w, c17689w, c17689w);
        EnumC21212B.f67480Z.getClass();
        C17871x type2 = EnumC21212B.f67481o0;
        AbstractC16544l.m18094g(type2, "type");
        C17859l c17859l2 = new C17859l("oauthStatus", type2, c17689w, c17689w, c17689w);
        C17840H type3 = AbstractC21248k.f67601a;
        AbstractC16544l.m18094g(type3, "type");
        List listM19382k = AbstractC17681o.m19382k(c17859l, c17859l2, new C17859l("actionSettings", type3, c17689w, c17689w, listM9974d));
        f66771b = listM19382k;
        List listM9974d2 = AbstractC9393x3.m9974d(new C17859l("settings", AbstractC9136G3.m9676b(AbstractC9136G3.m9675a(AbstractC9136G3.m9676b(AbstractC21228S.f67531a))), c17689w, c17689w, listM19382k));
        f66772c = listM9974d2;
        C17840H type4 = AbstractC21227Q.f67530a;
        AbstractC16544l.m18094g(type4, "type");
        f66773d = AbstractC9393x3.m9974d(new C17859l("gizmoUserActionSettingsLegacy", type4, c17689w, AbstractC9393x3.m9974d(new C17858k(AbstractC21239b0.f67582u, new C17844L(new C17866s(ParameterNames.f31999ID)))), listM9974d2));
    }
}
