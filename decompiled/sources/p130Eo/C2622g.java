package p130Eo;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p027Ap.C0693a;
import p078Co.InterfaceC1759a;
import p343Nk.C5817a;
import p523V9.AbstractC8025X4;
import p523V9.AbstractC8038Z3;
import p523V9.AbstractC8234y0;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Eo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C2622g implements InterfaceC1759a, InterfaceC2616a {

    /* JADX INFO: renamed from: a */
    public static final C2622g f8110a = new C2622g();

    @Override // p052Bp.InterfaceC1465a
    /* JADX INFO: renamed from: b */
    public final List mo2076b(List list, Object obj, C5817a evaluator) {
        AbstractC16544l.m18094g(evaluator, "evaluator");
        return AbstractC8234y0.m8875c((C0693a) list, obj, evaluator);
    }

    @Override // p078Co.InterfaceC1759a
    /* JADX INFO: renamed from: c */
    public final Object mo2569c(Object obj, Object obj2, C5817a evaluator) {
        AbstractC16544l.m18094g(evaluator, "evaluator");
        C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
        C2617b c2617bM8368c = AbstractC8025X4.m8368c(f8110a, c0693aM8396e, obj2, evaluator);
        Object objM19344T = AbstractC17680n.m19344T(2, c0693aM8396e);
        List list = c2617bM8368c.f8104a;
        if (list == null) {
            return objM19344T;
        }
        Object objM6216b = objM19344T;
        for (Object obj3 : list) {
            Map map = c2617bM8368c.f8105b;
            objM6216b = map != null ? evaluator.m6216b(map, AbstractC17659D.m19244f(new C17309l("accumulator", objM6216b), new C17309l("current", obj3))) : null;
            if (objM6216b == null) {
                return c2617bM8368c.f8106c;
            }
        }
        return objM6216b == null ? objM19344T : objM6216b;
    }

    @Override // p130Eo.InterfaceC2616a
    /* JADX INFO: renamed from: d */
    public final C2617b mo3618d(List list, Object obj, C5817a c5817a) {
        throw null;
    }

    @Override // p130Eo.InterfaceC2616a
    /* JADX INFO: renamed from: e */
    public final Object mo3619e(Map map, C0693a c0693a) {
        if (map == null) {
            return AbstractC17680n.m19344T(1, c0693a);
        }
        return null;
    }
}
