package p911o0;

import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1440o;
import p1095x1.InterfaceC21056J;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6021p;

/* JADX INFO: renamed from: o0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C17736P extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C17736P f56638Z = new C17736P(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C17736P f56639o0 = new C17736P(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C17736P f56640p0 = new C17736P(3, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56641Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17736P(int i10, int i11) {
        super(i10);
        this.f56641Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C5975S c5975s = C6013l.f19514a;
        switch (this.f56641Y) {
            case 0:
                ((Number) obj2).intValue();
                return Integer.valueOf(((InterfaceC21056J) obj).mo21532o(((Number) obj3).intValue()));
            case 1:
                ((Number) obj2).intValue();
                return Integer.valueOf(((InterfaceC21056J) obj).mo21529G(((Number) obj3).intValue()));
            case 2:
                ((Number) obj2).intValue();
                return Integer.valueOf(((InterfaceC21056J) obj).mo21531l(((Number) obj3).intValue()));
            case 3:
                C6021p c6021p = (C6021p) obj2;
                ((Number) obj3).intValue();
                c6021p.m6524S(359872873);
                WeakHashMap weakHashMap = C17718B0.f56555v;
                C17718B0 c17718b0M19480f = C17756f.m19480f(c6021p);
                boolean zM6542f = c6021p.m6542f(c17718b0M19480f);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == c5975s) {
                    objM6514H = new C17744Y(c17718b0M19480f.f56558c);
                    c6021p.m6537c0(objM6514H);
                }
                C17744Y c17744y = (C17744Y) objM6514H;
                c6021p.m6553p(false);
                return c17744y;
            case 4:
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                c6021p2.m6524S(359872873);
                WeakHashMap weakHashMap2 = C17718B0.f56555v;
                C17718B0 c17718b0M19480f2 = C17756f.m19480f(c6021p2);
                boolean zM6542f2 = c6021p2.m6542f(c17718b0M19480f2);
                Object objM6514H2 = c6021p2.m6514H();
                if (zM6542f2 || objM6514H2 == c5975s) {
                    objM6514H2 = new C17744Y(c17718b0M19480f2.f56560e);
                    c6021p2.m6537c0(objM6514H2);
                }
                C17744Y c17744y2 = (C17744Y) objM6514H2;
                c6021p2.m6553p(false);
                return c17744y2;
            default:
                C6021p c6021p3 = (C6021p) obj2;
                ((Number) obj3).intValue();
                c6021p3.m6524S(359872873);
                WeakHashMap weakHashMap3 = C17718B0.f56555v;
                C17718B0 c17718b0M19480f3 = C17756f.m19480f(c6021p3);
                boolean zM6542f3 = c6021p3.m6542f(c17718b0M19480f3);
                Object objM6514H3 = c6021p3.m6514H();
                if (zM6542f3 || objM6514H3 == c5975s) {
                    objM6514H3 = new C17744Y(c17718b0M19480f3.f56561f);
                    c6021p3.m6537c0(objM6514H3);
                }
                C17744Y c17744y3 = (C17744Y) objM6514H3;
                c6021p3.m6553p(false);
                return c17744y3;
        }
    }
}
