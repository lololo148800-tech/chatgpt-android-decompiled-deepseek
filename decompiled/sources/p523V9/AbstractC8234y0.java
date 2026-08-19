package p523V9;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.C11078N;
import androidx.lifecycle.EnumC11104m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p027Ap.C0693a;
import p049Bm.InterfaceC1439n;
import p343Nk.C5817a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: V9.y0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8234y0 {
    /* JADX INFO: renamed from: a */
    public static final Object m8873a(AbstractC11105n abstractC11105n, EnumC11104m enumC11104m, InterfaceC1439n interfaceC1439n, AbstractC19694j abstractC19694j) {
        Object objM1183l;
        if (enumC11104m == EnumC11104m.f33475Z) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        EnumC11104m enumC11104mMo7807b = abstractC11105n.mo7807b();
        EnumC11104m enumC11104m2 = EnumC11104m.f33474Y;
        C17296C c17296c = C17296C.f55119a;
        return (enumC11104mMo7807b != enumC11104m2 && (objM1183l = AbstractC0575H.m1183l(new C11078N(abstractC11105n, enumC11104m, interfaceC1439n, null), abstractC19694j)) == EnumC19250a.f61036Y) ? objM1183l : c17296c;
    }

    /* JADX INFO: renamed from: b */
    public static void m8874b(Drawable drawable, int i10) {
        drawable.setTint(i10);
    }

    /* JADX INFO: renamed from: c */
    public static List m8875c(C0693a c0693a, Object obj, C5817a evaluator) {
        AbstractC16544l.m18094g(evaluator, "evaluator");
        Object objM8876d = m8876d(AbstractC17680n.m19343S(c0693a), obj, evaluator);
        if (objM8876d instanceof List) {
            return (List) objM8876d;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Object m8876d(Object obj, Object obj2, C5817a c5817a) {
        if (!(obj instanceof List)) {
            if (!AbstractC8038Z3.m8398g(obj)) {
                return obj;
            }
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            c5817a.getClass();
            return c5817a.m6216b((Map) obj, obj2);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m8876d(it.next(), obj2, c5817a));
        }
        return arrayList;
    }
}
