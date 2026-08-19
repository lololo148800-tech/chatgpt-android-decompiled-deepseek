package p177Go;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p027Ap.C0693a;
import p078Co.InterfaceC1760b;
import p1113xn.AbstractC21322p;
import p523V9.AbstractC8038Z3;
import p523V9.AbstractC8046a4;
import p544W9.AbstractC8634g;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: Go.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3107a implements InterfaceC1760b {

    /* JADX INFO: renamed from: b */
    public static final C3107a f9347b = new C3107a(0);

    /* JADX INFO: renamed from: c */
    public static final C3107a f9348c = new C3107a(1);

    /* JADX INFO: renamed from: d */
    public static final C3107a f9349d = new C3107a(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9350a;

    public /* synthetic */ C3107a(int i10) {
        this.f9350a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static Object m3933a(List list, List list2) {
        String str = (String) AbstractC17680n.m19343S(list);
        if (str == null) {
            return null;
        }
        Object objM19344T = AbstractC17680n.m19344T((int) AbstractC8046a4.m8426e(str), list2);
        return objM19344T instanceof List ? m3933a(list.subList(1, list.size()), (List) objM19344T) : AbstractC17680n.m19344T((int) AbstractC8046a4.m8426e(str), list2);
    }

    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        Object objM19343S;
        String string;
        List listM21697e0;
        String string2;
        switch (this.f9350a) {
            case 0:
                C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : c0693aM8396e.f2015Y) {
                    Object objMo2570d = f9349d.mo2570d(obj3, obj2);
                    if (objMo2570d != null && (!(objMo2570d instanceof String) || ((CharSequence) objMo2570d).length() != 0)) {
                        obj3 = null;
                    }
                    if (obj3 != null) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 1:
                boolean z6 = obj instanceof List;
                List list = z6 ? (List) obj : null;
                long jM8426e = (list == null || (objM19343S = AbstractC17680n.m19343S(list)) == null || (string = objM19343S.toString()) == null) ? 0L : (long) AbstractC8046a4.m8426e(string);
                List list2 = z6 ? (List) obj : null;
                Object objM19344T = list2 != null ? AbstractC17680n.m19344T(1, list2) : null;
                List list3 = objM19344T instanceof List ? (List) objM19344T : null;
                C17689w c17689w = C17689w.f56480Y;
                if (list3 == null) {
                    list3 = c17689w;
                }
                C0693a c0693aM8396e2 = AbstractC8038Z3.m8396e(list3);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : c0693aM8396e2.f2015Y) {
                    Object objMo2570d2 = f9349d.mo2570d(obj4, obj2);
                    if (objMo2570d2 != null && (!(objMo2570d2 instanceof String) || ((CharSequence) objMo2570d2).length() != 0)) {
                        obj4 = null;
                    }
                    if (obj4 != null) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = ((long) (list3.size() - arrayList2.size())) < jM8426e ? arrayList2 : null;
                return arrayList3 == null ? c17689w : arrayList3;
            default:
                Object objM9296j = AbstractC8634g.m9296j(AbstractC8038Z3.m8396e(obj));
                if (objM9296j instanceof List) {
                    listM21697e0 = null;
                } else {
                    listM21697e0 = (objM9296j == null || (string2 = objM9296j.toString()) == null) ? null : AbstractC21322p.m21697e0(string2, new String[]{Separators.DOT}, 0, 6);
                    if (listM21697e0 == null) {
                        listM21697e0 = C17689w.f56480Y;
                    }
                }
                if (listM21697e0 == null) {
                    return null;
                }
                if (!listM21697e0.isEmpty()) {
                    if (obj2 instanceof List) {
                        if (listM21697e0.size() == 1) {
                            String str = (String) AbstractC17680n.m19341Q(listM21697e0);
                            AbstractC16544l.m18094g(str, "<this>");
                            obj2 = ((List) obj2).get((int) AbstractC8046a4.m8426e(str));
                        } else {
                            obj2 = m3933a(listM21697e0, (List) obj2);
                        }
                    } else if (obj2 instanceof Map) {
                        obj2 = ((Map) obj2).get(AbstractC17680n.m19341Q(listM21697e0));
                        for (String str2 : AbstractC17680n.m19336L(listM21697e0, 1)) {
                            Map map = obj2 instanceof Map ? (Map) obj2 : null;
                            obj2 = map != null ? map.get(str2) : null;
                        }
                    }
                }
                if ((AbstractC16544l.m18089b(obj2, obj) || obj2 == null) && (obj instanceof List)) {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        if (!(obj instanceof List)) {
                            list4 = null;
                        }
                        if (list4 != null) {
                            return AbstractC17680n.m19344T(1, list4);
                        }
                        return null;
                    }
                }
                return obj2;
        }
    }
}
