package p742f6;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import io.sentry.internal.debugmeta.C15384c;
import p003A1.C0284r0;
import p520V5.C7781j;
import p764g6.AbstractC13821a;
import p779h6.AbstractC14417f;
import p779h6.AbstractC14418g;
import p802i6.C14935a;

/* JADX INFO: renamed from: f6.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13563o {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f42907a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final C15384c f42908b = C15384c.m16635u("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: c */
    public static final C15384c f42909c = C15384c.m16635u("x", "y");

    /* JADX INFO: renamed from: a */
    public static BaseInterpolator m15095a(PointF pointF, PointF pointF2) {
        pointF.x = AbstractC14417f.m15925b(pointF.x, -1.0f, 1.0f);
        pointF.y = AbstractC14417f.m15925b(pointF.y, -100.0f, 100.0f);
        pointF2.x = AbstractC14417f.m15925b(pointF2.x, -1.0f, 1.0f);
        float fM15925b = AbstractC14417f.m15925b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fM15925b;
        C0284r0 c0284r0 = AbstractC14418g.f45308a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, fM15925b);
        } catch (IllegalArgumentException e10) {
            return "The Path cannot loop back on itself.".equals(e10.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020b  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    /* JADX INFO: renamed from: b */
    public static C14935a m15096b(AbstractC13821a abstractC13821a, C7781j c7781j, float f10, InterfaceC13548D interfaceC13548D, boolean z6, boolean z10) {
        Object obj;
        BaseInterpolator baseInterpolatorM15095a;
        BaseInterpolator baseInterpolatorM15095a2;
        BaseInterpolator baseInterpolatorM15095a3;
        Object obj2;
        C14935a c14935a;
        C15384c c15384c;
        PointF pointF;
        Object obj3;
        PointF pointF2;
        LinearInterpolator linearInterpolator = f42907a;
        C15384c c15384c2 = f42908b;
        if (!z6 || !z10) {
            C15384c c15384c3 = c15384c2;
            if (!z6) {
                return new C14935a(interfaceC13548D.mo3879a(abstractC13821a, f10));
            }
            abstractC13821a.mo15430e();
            Object objMo3879a = null;
            PointF pointFM15092b = null;
            boolean z11 = false;
            float fMo15423O = 0.0f;
            PointF pointFM15092b2 = null;
            PointF pointFM15092b3 = null;
            PointF pointFM15092b4 = null;
            Object objMo3879a2 = null;
            while (abstractC13821a.hasNext()) {
                C15384c c15384c4 = c15384c3;
                switch (abstractC13821a.mo15427T(c15384c4)) {
                    case 0:
                        fMo15423O = (float) abstractC13821a.mo15423O();
                        break;
                    case 1:
                        objMo3879a = interfaceC13548D.mo3879a(abstractC13821a, f10);
                        break;
                    case 2:
                        objMo3879a2 = interfaceC13548D.mo3879a(abstractC13821a, f10);
                        break;
                    case 3:
                        pointFM15092b2 = AbstractC13562n.m15092b(abstractC13821a, 1.0f);
                        break;
                    case 4:
                        pointFM15092b = AbstractC13562n.m15092b(abstractC13821a, 1.0f);
                        break;
                    case 5:
                        z11 = abstractC13821a.mo15431g0() == 1;
                        break;
                    case 6:
                        pointFM15092b3 = AbstractC13562n.m15092b(abstractC13821a, f10);
                        break;
                    case 7:
                        pointFM15092b4 = AbstractC13562n.m15092b(abstractC13821a, f10);
                        break;
                    default:
                        abstractC13821a.mo15421D();
                        break;
                }
                c15384c3 = c15384c4;
            }
            abstractC13821a.mo15434m();
            if (!z11) {
                if (pointFM15092b2 == null || pointFM15092b == null) {
                    obj = objMo3879a2;
                } else {
                    baseInterpolatorM15095a = m15095a(pointFM15092b2, pointFM15092b);
                    obj = objMo3879a2;
                }
                C14935a c14935a2 = new C14935a(c7781j, objMo3879a, obj, baseInterpolatorM15095a, fMo15423O, (Float) null);
                c14935a2.f46538o = pointFM15092b3;
                c14935a2.f46539p = pointFM15092b4;
                return c14935a2;
            }
            obj = objMo3879a;
            baseInterpolatorM15095a = linearInterpolator;
            C14935a c14935a3 = new C14935a(c7781j, objMo3879a, obj, baseInterpolatorM15095a, fMo15423O, (Float) null);
            c14935a3.f46538o = pointFM15092b3;
            c14935a3.f46539p = pointFM15092b4;
            return c14935a3;
        }
        abstractC13821a.mo15430e();
        PointF pointF3 = null;
        PointF pointFM15092b5 = null;
        PointF pointFM15092b6 = null;
        boolean z12 = false;
        PointF pointFM15092b7 = null;
        PointF pointFM15092b8 = null;
        PointF pointF4 = null;
        Object objMo3879a3 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        float fMo15423O2 = 0.0f;
        Object objMo3879a4 = null;
        while (abstractC13821a.hasNext()) {
            int iMo15427T = abstractC13821a.mo15427T(c15384c2);
            C15384c c15384c5 = f42909c;
            linearInterpolator = linearInterpolator;
            switch (iMo15427T) {
                case 0:
                    c15384c = c15384c2;
                    pointF = pointFM15092b5;
                    fMo15423O2 = (float) abstractC13821a.mo15423O();
                    c15384c2 = c15384c;
                    pointFM15092b5 = pointF;
                    break;
                case 1:
                    pointF = pointFM15092b5;
                    objMo3879a3 = interfaceC13548D.mo3879a(abstractC13821a, f10);
                    pointFM15092b5 = pointF;
                    break;
                case 2:
                    pointF = pointFM15092b5;
                    objMo3879a4 = interfaceC13548D.mo3879a(abstractC13821a, f10);
                    pointFM15092b5 = pointF;
                    break;
                case 3:
                    C15384c c15384c6 = c15384c2;
                    pointF = pointFM15092b5;
                    PointF pointF7 = pointFM15092b6;
                    boolean z13 = z12;
                    if (abstractC13821a.mo15424P() == 3) {
                        abstractC13821a.mo15430e();
                        float fMo15423O3 = 0.0f;
                        float fMo15423O4 = 0.0f;
                        float fMo15423O5 = 0.0f;
                        float fMo15423O6 = 0.0f;
                        while (abstractC13821a.hasNext()) {
                            int iMo15427T2 = abstractC13821a.mo15427T(c15384c5);
                            if (iMo15427T2 == 0) {
                                obj3 = objMo3879a3;
                                if (abstractC13821a.mo15424P() == 7) {
                                    fMo15423O5 = (float) abstractC13821a.mo15423O();
                                    objMo3879a3 = obj3;
                                    fMo15423O3 = fMo15423O5;
                                } else {
                                    abstractC13821a.mo15429a();
                                    fMo15423O3 = (float) abstractC13821a.mo15423O();
                                    fMo15423O5 = abstractC13821a.mo15424P() == 7 ? (float) abstractC13821a.mo15423O() : fMo15423O3;
                                    abstractC13821a.mo15433k();
                                    objMo3879a3 = obj3;
                                }
                            } else if (iMo15427T2 != 1) {
                                abstractC13821a.mo15421D();
                            } else if (abstractC13821a.mo15424P() == 7) {
                                fMo15423O6 = (float) abstractC13821a.mo15423O();
                                objMo3879a3 = objMo3879a3;
                                fMo15423O4 = fMo15423O6;
                            } else {
                                obj3 = objMo3879a3;
                                abstractC13821a.mo15429a();
                                fMo15423O4 = (float) abstractC13821a.mo15423O();
                                fMo15423O6 = abstractC13821a.mo15424P() == 7 ? (float) abstractC13821a.mo15423O() : fMo15423O4;
                                abstractC13821a.mo15433k();
                                objMo3879a3 = obj3;
                            }
                        }
                        pointF4 = new PointF(fMo15423O3, fMo15423O4);
                        pointF5 = new PointF(fMo15423O5, fMo15423O6);
                        abstractC13821a.mo15434m();
                    } else {
                        pointFM15092b7 = AbstractC13562n.m15092b(abstractC13821a, f10);
                    }
                    z12 = z13;
                    c15384c2 = c15384c6;
                    pointFM15092b6 = pointF7;
                    pointFM15092b5 = pointF;
                    break;
                case 4:
                    c15384c = c15384c2;
                    if (abstractC13821a.mo15424P() == 3) {
                        abstractC13821a.mo15430e();
                        float fMo15423O7 = 0.0f;
                        float fMo15423O8 = 0.0f;
                        float fMo15423O9 = 0.0f;
                        float fMo15423O10 = 0.0f;
                        while (abstractC13821a.hasNext()) {
                            PointF pointF8 = pointFM15092b6;
                            int iMo15427T3 = abstractC13821a.mo15427T(c15384c5);
                            if (iMo15427T3 != 0) {
                                pointF2 = pointFM15092b5;
                                if (iMo15427T3 != 1) {
                                    abstractC13821a.mo15421D();
                                } else if (abstractC13821a.mo15424P() == 7) {
                                    fMo15423O10 = (float) abstractC13821a.mo15423O();
                                    fMo15423O8 = fMo15423O10;
                                } else {
                                    abstractC13821a.mo15429a();
                                    fMo15423O8 = (float) abstractC13821a.mo15423O();
                                    fMo15423O10 = abstractC13821a.mo15424P() == 7 ? (float) abstractC13821a.mo15423O() : fMo15423O8;
                                    abstractC13821a.mo15433k();
                                }
                                pointFM15092b6 = pointF8;
                                pointFM15092b5 = pointF2;
                            } else {
                                pointF2 = pointFM15092b5;
                                z12 = z12;
                                if (abstractC13821a.mo15424P() == 7) {
                                    fMo15423O7 = (float) abstractC13821a.mo15423O();
                                    fMo15423O9 = fMo15423O7;
                                } else {
                                    abstractC13821a.mo15429a();
                                    fMo15423O7 = (float) abstractC13821a.mo15423O();
                                    fMo15423O9 = abstractC13821a.mo15424P() == 7 ? (float) abstractC13821a.mo15423O() : fMo15423O7;
                                    abstractC13821a.mo15433k();
                                }
                            }
                            z12 = z12;
                            pointFM15092b6 = pointF8;
                            pointFM15092b5 = pointF2;
                        }
                        pointF = pointFM15092b5;
                        PointF pointF9 = new PointF(fMo15423O7, fMo15423O8);
                        PointF pointF10 = new PointF(fMo15423O9, fMo15423O10);
                        abstractC13821a.mo15434m();
                        pointF3 = pointF10;
                        pointF6 = pointF9;
                    } else {
                        pointF = pointFM15092b5;
                        pointFM15092b8 = AbstractC13562n.m15092b(abstractC13821a, f10);
                    }
                    c15384c2 = c15384c;
                    pointFM15092b5 = pointF;
                    break;
                case 5:
                    z12 = abstractC13821a.mo15431g0() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFM15092b5 = AbstractC13562n.m15092b(abstractC13821a, f10);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFM15092b6 = AbstractC13562n.m15092b(abstractC13821a, f10);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    abstractC13821a.mo15421D();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        BaseInterpolator baseInterpolatorM15095a4 = linearInterpolator;
        PointF pointF11 = pointFM15092b5;
        PointF pointF12 = pointFM15092b6;
        boolean z14 = z12;
        Object obj4 = objMo3879a3;
        abstractC13821a.mo15434m();
        if (z14) {
            obj2 = obj4;
        } else {
            if (pointFM15092b7 == null || pointFM15092b8 == null) {
                if (pointF4 != null && pointF5 != null && pointF6 != null && pointF3 != null) {
                    baseInterpolatorM15095a2 = m15095a(pointF4, pointF6);
                    baseInterpolatorM15095a3 = m15095a(pointF5, pointF3);
                    obj2 = objMo3879a4;
                    baseInterpolatorM15095a4 = null;
                }
                if (baseInterpolatorM15095a2 != null || baseInterpolatorM15095a3 == null) {
                    c14935a = new C14935a(c7781j, obj4, obj2, baseInterpolatorM15095a4, fMo15423O2, (Float) null);
                } else {
                    c14935a = new C14935a(c7781j, obj4, obj2, baseInterpolatorM15095a2, baseInterpolatorM15095a3, fMo15423O2);
                }
                c14935a.f46538o = pointF11;
                c14935a.f46539p = pointF12;
                return c14935a;
            }
            baseInterpolatorM15095a4 = m15095a(pointFM15092b7, pointFM15092b8);
            obj2 = objMo3879a4;
        }
        baseInterpolatorM15095a2 = null;
        baseInterpolatorM15095a3 = null;
        if (baseInterpolatorM15095a2 != null) {
            c14935a = new C14935a(c7781j, obj4, obj2, baseInterpolatorM15095a4, fMo15423O2, (Float) null);
        } else {
            c14935a = new C14935a(c7781j, obj4, obj2, baseInterpolatorM15095a4, fMo15423O2, (Float) null);
        }
        c14935a.f46538o = pointF11;
        c14935a.f46539p = pointF12;
        return c14935a;
    }
}
