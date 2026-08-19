package p130Eo;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0295v;
import p027Ap.C0693a;
import p078Co.InterfaceC1759a;
import p343Nk.C5817a;
import p523V9.AbstractC8025X4;
import p523V9.AbstractC8039Z4;
import p523V9.AbstractC8234y0;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Eo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C2619d implements InterfaceC1759a, InterfaceC2621f {

    /* JADX INFO: renamed from: a */
    public static final C2619d f8108a = new C2619d();

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
        return AbstractC8039Z4.m8403e(this, obj, obj2, evaluator, new C0295v(2, this, C2619d.class, "mapOrEmptyList", "mapOrEmptyList(Loperations/array/ArrayOperationInputData;LLogicEvaluator;)Ljava/util/List;", 0, 3));
    }

    @Override // p130Eo.InterfaceC2616a
    /* JADX INFO: renamed from: d */
    public final C2617b mo3618d(List list, Object obj, C5817a evaluator) {
        AbstractC16544l.m18094g(evaluator, "evaluator");
        return AbstractC8025X4.m8368c(this, (C0693a) list, obj, evaluator);
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
