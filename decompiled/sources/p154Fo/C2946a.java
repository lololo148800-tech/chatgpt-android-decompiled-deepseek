package p154Fo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0227a;
import p027Ap.C0693a;
import p049Bm.InterfaceC1439n;
import p078Co.InterfaceC1759a;
import p130Eo.C2617b;
import p343Nk.C5817a;
import p523V9.AbstractC8025X4;
import p523V9.AbstractC8039Z4;
import p523V9.AbstractC8234y0;
import p544W9.AbstractC8740x3;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: Fo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2946a implements InterfaceC1759a, InterfaceC2948c {

    /* JADX INFO: renamed from: b */
    public static final C2946a f8815b = new C2946a(0);

    /* JADX INFO: renamed from: c */
    public static final C2946a f8816c = new C2946a(1);

    /* JADX INFO: renamed from: d */
    public static final C2946a f8817d = new C2946a(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8818a;

    public /* synthetic */ C2946a(int i10) {
        this.f8818a = i10;
    }

    @Override // p052Bp.InterfaceC1465a
    /* JADX INFO: renamed from: b */
    public final List mo2076b(List list, Object obj, C5817a evaluator) {
        switch (this.f8818a) {
            case 0:
                AbstractC16544l.m18094g(evaluator, "evaluator");
                break;
            case 1:
                AbstractC16544l.m18094g(evaluator, "evaluator");
                break;
            default:
                AbstractC16544l.m18094g(evaluator, "evaluator");
                break;
        }
        return AbstractC8234y0.m8875c((C0693a) list, obj, evaluator);
    }

    @Override // p078Co.InterfaceC1759a
    /* JADX INFO: renamed from: c */
    public final Object mo2569c(Object obj, Object obj2, C5817a evaluator) {
        switch (this.f8818a) {
            case 0:
                AbstractC16544l.m18094g(evaluator, "evaluator");
                break;
            case 1:
                AbstractC16544l.m18094g(evaluator, "evaluator");
                break;
            default:
                AbstractC16544l.m18094g(evaluator, "evaluator");
                break;
        }
        return m3773f(obj, obj2, evaluator, new C0227a(this, 8));
    }

    @Override // p130Eo.InterfaceC2616a
    /* JADX INFO: renamed from: d */
    public final C2617b mo3618d(List list, Object obj, C5817a evaluator) {
        switch (this.f8818a) {
            case 0:
                AbstractC16544l.m18094g(evaluator, "evaluator");
                break;
            case 1:
                AbstractC16544l.m18094g(evaluator, "evaluator");
                break;
            default:
                AbstractC16544l.m18094g(evaluator, "evaluator");
                break;
        }
        return AbstractC8025X4.m8368c(this, (C0693a) list, obj, evaluator);
    }

    @Override // p130Eo.InterfaceC2616a
    /* JADX INFO: renamed from: e */
    public final Object mo3619e(Map map, C0693a c0693a) {
        switch (this.f8818a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return Boolean.TRUE;
            default:
                return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m3773f(Object obj, Object obj2, C5817a evaluator, InterfaceC1439n interfaceC1439n) {
        switch (this.f8818a) {
            case 0:
                AbstractC16544l.m18094g(evaluator, "evaluator");
                break;
            case 1:
                AbstractC16544l.m18094g(evaluator, "evaluator");
                break;
            default:
                AbstractC16544l.m18094g(evaluator, "evaluator");
                break;
        }
        return AbstractC8039Z4.m8403e(this, obj, obj2, evaluator, (C0227a) interfaceC1439n);
    }

    @Override // p154Fo.InterfaceC2948c
    /* JADX INFO: renamed from: a */
    public final Object mo3772a(C2947b data, C5817a evaluator) {
        switch (this.f8818a) {
            case 0:
                AbstractC16544l.m18094g(data, "data");
                AbstractC16544l.m18094g(evaluator, suYVq.AGZJLLvGYOwsTd);
                Iterator it = data.f8819a.iterator();
                while (it.hasNext()) {
                    if (!AbstractC8740x3.m9475a(evaluator.m6215a(data.f8820b, it.next()))) {
                        return data.f8821c;
                    }
                }
                return Boolean.TRUE;
            case 1:
                AbstractC16544l.m18094g(data, "data");
                AbstractC16544l.m18094g(evaluator, "evaluator");
                Iterator it2 = data.f8819a.iterator();
                while (it2.hasNext()) {
                    if (AbstractC8740x3.m9475a(evaluator.m6215a(data.f8820b, it2.next()))) {
                        return Boolean.FALSE;
                    }
                }
                return data.f8821c;
            default:
                AbstractC16544l.m18094g(data, "data");
                AbstractC16544l.m18094g(evaluator, "evaluator");
                Iterator it3 = data.f8819a.iterator();
                while (it3.hasNext()) {
                    if (AbstractC8740x3.m9475a(evaluator.m6215a(data.f8820b, it3.next()))) {
                        return Boolean.TRUE;
                    }
                }
                return data.f8821c;
        }
    }
}
