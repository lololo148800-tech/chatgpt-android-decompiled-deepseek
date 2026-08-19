package p817j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.g */
/* JADX INFO: loaded from: classes4.dex */
final class C15688g extends C15693l {

    /* JADX INFO: renamed from: e */
    final C15693l[] f48909e;

    C15688g(C15693l[] c15693lArr) {
        super(-1, null, null);
        this.f48909e = c15693lArr;
    }

    @Override // p817j$.util.concurrent.C15693l
    /* JADX INFO: renamed from: a */
    final C15693l mo17321a(int i10, Object obj) {
        int length;
        C15693l c15693lM17302k;
        Object obj2;
        C15693l[] c15693lArr = this.f48909e;
        loop0: while (obj != null && c15693lArr != null && (length = c15693lArr.length) != 0 && (c15693lM17302k = ConcurrentHashMap.m17302k(c15693lArr, (length - 1) & i10)) != null) {
            do {
                int i11 = c15693lM17302k.f48916a;
                if (i11 == i10 && ((obj2 = c15693lM17302k.f48917b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c15693lM17302k;
                }
                if (i11 < 0) {
                    if (c15693lM17302k instanceof C15688g) {
                        c15693lArr = ((C15688g) c15693lM17302k).f48909e;
                    } else {
                        return c15693lM17302k.mo17321a(i10, obj);
                    }
                } else {
                    c15693lM17302k = c15693lM17302k.f48919d;
                }
            } while (c15693lM17302k != null);
        }
        return null;
    }
}
