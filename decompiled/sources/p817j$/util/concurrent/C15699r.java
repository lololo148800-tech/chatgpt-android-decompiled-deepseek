package p817j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.r */
/* JADX INFO: loaded from: classes4.dex */
final class C15699r extends C15693l {

    /* JADX INFO: renamed from: e */
    C15699r f48937e;

    /* JADX INFO: renamed from: f */
    C15699r f48938f;

    /* JADX INFO: renamed from: g */
    C15699r f48939g;

    /* JADX INFO: renamed from: h */
    C15699r f48940h;

    /* JADX INFO: renamed from: i */
    boolean f48941i;

    C15699r(int i10, Object obj, Object obj2, C15693l c15693l, C15699r c15699r) {
        super(i10, obj, obj2, c15693l);
        this.f48937e = c15699r;
    }

    @Override // p817j$.util.concurrent.C15693l
    /* JADX INFO: renamed from: a */
    final C15693l mo17321a(int i10, Object obj) {
        return m17331b(i10, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0047 A[PHI: r8
      0x0047: PHI (r8v5 java.lang.Class) = (r8v4 java.lang.Class), (r8v6 java.lang.Class) binds: [B:29:0x0040, B:21:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x004d A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    final C15699r m17331b(int i10, Object obj, Class cls) {
        C15699r c15699rM17331b;
        if (obj == null) {
            return null;
        }
        C15699r c15699r = this;
        do {
            C15699r c15699r2 = c15699r.f48938f;
            C15699r c15699r3 = c15699r.f48939g;
            int i11 = c15699r.f48916a;
            if (i11 <= i10) {
                if (i11 >= i10) {
                    Object obj2 = c15699r.f48917b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return c15699r;
                    }
                    if (c15699r2 != null) {
                        if (c15699r3 != null) {
                            if (cls != null || (cls = ConcurrentHashMap.m17298c(obj)) != null) {
                                int i12 = ConcurrentHashMap.f48882g;
                                int iCompareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (iCompareTo == 0) {
                                    c15699rM17331b = c15699r3.m17331b(i10, obj, cls);
                                    if (c15699rM17331b != null) {
                                        return c15699rM17331b;
                                    }
                                } else if (iCompareTo >= 0) {
                                    c15699r2 = c15699r3;
                                }
                            } else {
                                c15699rM17331b = c15699r3.m17331b(i10, obj, cls);
                                if (c15699rM17331b != null) {
                                    return c15699rM17331b;
                                }
                            }
                        }
                        c15699r = c15699r2;
                    }
                }
                c15699r = c15699r3;
            } else {
                c15699r = c15699r2;
            }
        } while (c15699r != null);
        return null;
    }
}
