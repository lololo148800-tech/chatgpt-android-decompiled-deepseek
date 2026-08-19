package p341Ni;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p013Ab.C0420b;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0624m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p057C3.C1526D;
import p057C3.C1566k;
import p057C3.C1568m;
import p057C3.C1570o;
import p057C3.C1572q;
import p1016t3.C19778e;
import p1073w3.AbstractC20800b;
import p153Fn.AbstractC2935m;
import p153Fn.C2925c;
import p201Hn.C3516e;
import p292Lg.C5034f;
import p523V9.AbstractC8154o0;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C5785i {

    /* JADX INFO: renamed from: a */
    public final C2925c f18875a;

    /* JADX INFO: renamed from: b */
    public final C1526D f18876b;

    public C5785i(Context context, InterfaceC0571F parentScope, InterfaceC1436k onAudioData, boolean z6) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(parentScope, "parentScope");
        AbstractC16544l.m18094g(onAudioData, "onAudioData");
        C3516e c3516e = AbstractC0593T.f1824a;
        C2925c c2925cM1158F = AbstractC0575H.m1158F(parentScope, AbstractC2935m.f8797a);
        this.f18875a = c2925cM1158F;
        C1572q c1572q = new C1572q(context, new C1568m(new C1566k(context, new C0420b(c2925cM1158F, onAudioData)), 1), new C1570o(context, 0));
        if (z6) {
            C19778e c19778e = new C19778e(1, 2);
            AbstractC20800b.m21320h(!c1572q.f4415s);
            c1572q.f4407k = c19778e;
        }
        AbstractC20800b.m21320h(!c1572q.f4415s);
        c1572q.f4415s = true;
        this.f18876b = new C1526D(c1572q);
    }

    /* JADX INFO: renamed from: a */
    public final Object m6187a(int i10, AbstractC19694j abstractC19694j) {
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(abstractC19694j));
        c0624m.m1262r();
        C5773c c5773c = new C5773c(i10, this, c0624m);
        c0624m.m1264u(new C5034f(this, 7, c5773c));
        C1526D c1526d = this.f18876b;
        c1526d.getClass();
        c1526d.f4100y0.m10690a(c5773c);
        Object objM1261q = c0624m.m1261q();
        return objM1261q == EnumC19250a.f61036Y ? objM1261q : C17296C.f55119a;
    }
}
