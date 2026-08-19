package p227Io;

import java.util.Iterator;
import java.util.List;
import p027Ap.C0693a;
import p078Co.InterfaceC1760b;
import p523V9.AbstractC8038Z3;
import p544W9.AbstractC8740x3;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Io.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3790a implements InterfaceC1760b {

    /* JADX INFO: renamed from: b */
    public static final C3790a f11453b = new C3790a(0);

    /* JADX INFO: renamed from: c */
    public static final C3790a f11454c = new C3790a(1);

    /* JADX INFO: renamed from: d */
    public static final C3790a f11455d = new C3790a(2);

    /* JADX INFO: renamed from: e */
    public static final C3790a f11456e = new C3790a(3);

    /* JADX INFO: renamed from: f */
    public static final C3790a f11457f = new C3790a(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11458a;

    public /* synthetic */ C3790a(int i10) {
        this.f11458a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static Object m4460a(List list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return AbstractC17680n.m19343S(list);
        }
        if (size != 2) {
            if (size != 3) {
                return AbstractC8740x3.m9475a(AbstractC17680n.m19343S(list)) ? AbstractC17680n.m19344T(1, list) : m4460a(list.subList(2, list.size()));
            }
            return AbstractC8740x3.m9475a(AbstractC17680n.m19343S(list)) ? AbstractC17680n.m19344T(1, list) : AbstractC17680n.m19344T(2, list);
        }
        if (AbstractC8740x3.m9475a(AbstractC17680n.m19343S(list))) {
            return AbstractC17680n.m19344T(1, list);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        boolean z6;
        switch (this.f11458a) {
            case 0:
                C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
                List list = c0693aM8396e.f2015Y;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!(it.next() instanceof Boolean)) {
                            for (Object obj3 : list) {
                                if (!AbstractC8740x3.m9475a(obj3)) {
                                    if (obj3 == null) {
                                        return AbstractC17680n.m19351a0(c0693aM8396e);
                                    }
                                    return obj3;
                                }
                            }
                            obj3 = null;
                            if (obj3 == null) {
                                return AbstractC17680n.m19351a0(c0693aM8396e);
                            }
                            return obj3;
                        }
                    }
                }
                boolean z10 = true;
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (!AbstractC8740x3.m9475a(it2.next())) {
                            z10 = false;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            case 1:
                return Boolean.valueOf(AbstractC8740x3.m9475a(AbstractC17680n.m19343S(AbstractC8038Z3.m8396e(obj))));
            case 2:
                return m4460a(AbstractC8038Z3.m8396e(obj));
            case 3:
                return Boolean.valueOf(!AbstractC8740x3.m9475a(AbstractC17680n.m19343S(AbstractC8038Z3.m8396e(obj))));
            default:
                C0693a c0693aM8396e2 = AbstractC8038Z3.m8396e(obj);
                List list2 = c0693aM8396e2.f2015Y;
                Object obj4 = null;
                if (!list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (!(it3.next() instanceof Boolean)) {
                            for (Object obj5 : list2) {
                                if (AbstractC8740x3.m9475a(obj5)) {
                                    obj4 = obj5;
                                    if (obj4 == null) {
                                        return AbstractC17680n.m19351a0(c0693aM8396e2);
                                    }
                                    return obj4;
                                }
                            }
                            if (obj4 == null) {
                                return AbstractC17680n.m19351a0(c0693aM8396e2);
                            }
                            return obj4;
                        }
                    }
                }
                for (Object obj6 : list2) {
                    if (AbstractC8740x3.m9475a(obj6)) {
                        obj4 = obj6;
                        if (obj4 != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        return Boolean.valueOf(z6);
                    }
                }
                if (obj4 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
        }
    }
}
