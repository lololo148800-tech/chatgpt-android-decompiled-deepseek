package p847k5;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p027Ap.C0693a;
import p052Bp.InterfaceC1465a;
import p078Co.InterfaceC1759a;
import p343Nk.C5817a;
import p523V9.AbstractC8038Z3;
import p523V9.AbstractC8234y0;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: k5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16344b implements InterfaceC1759a, InterfaceC1465a {

    /* JADX INFO: renamed from: a */
    public static final C16344b f50720a = new C16344b();

    @Override // p052Bp.InterfaceC1465a
    /* JADX INFO: renamed from: b */
    public final List mo2076b(List list, Object obj, C5817a c5817a) {
        throw null;
    }

    @Override // p078Co.InterfaceC1759a
    /* JADX INFO: renamed from: c */
    public final Object mo2569c(Object obj, Object obj2, C5817a evaluator) {
        AbstractC16544l.m18094g(evaluator, "evaluator");
        C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
        List listM8875c = AbstractC8234y0.m8875c(c0693aM8396e, obj2, evaluator);
        Object objM19344T = AbstractC17680n.m19344T(1, c0693aM8396e);
        if (!AbstractC8038Z3.m8398g(objM19344T)) {
            objM19344T = null;
        }
        Map map = objM19344T instanceof Map ? (Map) objM19344T : null;
        if (map == null || listM8875c == null) {
            return null;
        }
        for (Object obj3 : listM8875c) {
            if (AbstractC16544l.m18089b(evaluator.m6216b(map, obj3), Boolean.TRUE)) {
                return obj3;
            }
        }
        return null;
    }
}
