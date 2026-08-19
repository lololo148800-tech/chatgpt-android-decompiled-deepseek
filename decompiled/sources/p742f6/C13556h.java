package p742f6;

import android.graphics.PointF;
import io.sentry.internal.debugmeta.C15384c;
import p001A.AbstractC0010F;
import p640a6.C10507b;
import p764g6.AbstractC13821a;

/* JADX INFO: renamed from: f6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C13556h implements InterfaceC13548D {

    /* JADX INFO: renamed from: Y */
    public static final C13556h f42889Y = new C13556h();

    /* JADX INFO: renamed from: Z */
    public static final C15384c f42890Z = C15384c.m16635u("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // p742f6.InterfaceC13548D
    /* JADX INFO: renamed from: a */
    public final Object mo3879a(AbstractC13821a abstractC13821a, float f10) {
        String str;
        abstractC13821a.mo15430e();
        String strMo15435x = null;
        float fMo15423O = 0.0f;
        float fMo15423O2 = 0.0f;
        float fMo15423O3 = 0.0f;
        float fMo15423O4 = 0.0f;
        int iMo15431g0 = 0;
        int iM15091a = 0;
        int iM15091a2 = 0;
        boolean zMo15426S0 = true;
        int i10 = 3;
        String strMo15435x2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (abstractC13821a.hasNext()) {
            switch (abstractC13821a.mo15427T(f42890Z)) {
                case 0:
                    strMo15435x = abstractC13821a.mo15435x();
                    continue;
                case 1:
                    str = strMo15435x;
                    strMo15435x2 = abstractC13821a.mo15435x();
                    break;
                case 2:
                    str = strMo15435x;
                    fMo15423O = (float) abstractC13821a.mo15423O();
                    break;
                case 3:
                    str = strMo15435x;
                    int iMo15431g1 = abstractC13821a.mo15431g0();
                    i10 = (iMo15431g1 <= 2 && iMo15431g1 >= 0) ? AbstractC0010F.m27k(3)[iMo15431g1] : 3;
                    break;
                case 4:
                    iMo15431g0 = abstractC13821a.mo15431g0();
                    continue;
                case 5:
                    fMo15423O2 = (float) abstractC13821a.mo15423O();
                    continue;
                case 6:
                    fMo15423O3 = (float) abstractC13821a.mo15423O();
                    continue;
                case 7:
                    iM15091a = AbstractC13562n.m15091a(abstractC13821a);
                    continue;
                case 8:
                    iM15091a2 = AbstractC13562n.m15091a(abstractC13821a);
                    continue;
                case 9:
                    fMo15423O4 = (float) abstractC13821a.mo15423O();
                    continue;
                case 10:
                    zMo15426S0 = abstractC13821a.mo15426S0();
                    continue;
                case 11:
                    abstractC13821a.mo15429a();
                    pointF = new PointF(((float) abstractC13821a.mo15423O()) * f10, ((float) abstractC13821a.mo15423O()) * f10);
                    abstractC13821a.mo15433k();
                    continue;
                case 12:
                    abstractC13821a.mo15429a();
                    str = strMo15435x;
                    pointF2 = new PointF(((float) abstractC13821a.mo15423O()) * f10, ((float) abstractC13821a.mo15423O()) * f10);
                    abstractC13821a.mo15433k();
                    break;
                default:
                    abstractC13821a.mo15428W();
                    abstractC13821a.mo15421D();
                    continue;
            }
            strMo15435x = str;
        }
        abstractC13821a.mo15434m();
        C10507b c10507b = new C10507b();
        c10507b.f31128a = strMo15435x;
        c10507b.f31129b = strMo15435x2;
        c10507b.f31130c = fMo15423O;
        c10507b.f31131d = i10;
        c10507b.f31132e = iMo15431g0;
        c10507b.f31133f = fMo15423O2;
        c10507b.f31134g = fMo15423O3;
        c10507b.f31135h = iM15091a;
        c10507b.f31136i = iM15091a2;
        c10507b.f31137j = fMo15423O4;
        c10507b.f31138k = zMo15426S0;
        c10507b.f31139l = pointF;
        c10507b.f31140m = pointF2;
        return c10507b;
    }
}
