package p817j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.p */
/* JADX INFO: loaded from: classes4.dex */
class C15697p {

    /* JADX INFO: renamed from: a */
    C15693l[] f48924a;

    /* JADX INFO: renamed from: b */
    C15693l f48925b = null;

    /* JADX INFO: renamed from: c */
    C15696o f48926c;

    /* JADX INFO: renamed from: d */
    C15696o f48927d;

    /* JADX INFO: renamed from: e */
    int f48928e;

    /* JADX INFO: renamed from: f */
    int f48929f;

    /* JADX INFO: renamed from: g */
    int f48930g;

    /* JADX INFO: renamed from: h */
    final int f48931h;

    C15697p(C15693l[] c15693lArr, int i10, int i11, int i12) {
        this.f48924a = c15693lArr;
        this.f48931h = i10;
        this.f48928e = i11;
        this.f48929f = i11;
        this.f48930g = i12;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[LOOP:1: B:34:0x005f->B:38:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0082 A[EDGE_INSN: B:70:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0082 A[EDGE_INSN: B:71:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    final C15693l m17322a() {
        C15693l[] c15693lArr;
        int length;
        int i10;
        C15696o c15696o;
        int i11;
        int i12;
        int i13;
        int i14;
        C15693l c15693l = this.f48925b;
        if (c15693l != null) {
            c15693l = c15693l.f48919d;
        }
        while (c15693l == null) {
            if (this.f48929f >= this.f48930g || (c15693lArr = this.f48924a) == null || (length = c15693lArr.length) <= (i10 = this.f48928e) || i10 < 0) {
                this.f48925b = null;
                return null;
            }
            C15693l c15693lM17302k = ConcurrentHashMap.m17302k(c15693lArr, i10);
            if (c15693lM17302k != null && c15693lM17302k.f48916a < 0) {
                if (c15693lM17302k instanceof C15688g) {
                    this.f48924a = ((C15688g) c15693lM17302k).f48909e;
                    C15696o c15696o2 = this.f48927d;
                    if (c15696o2 == null) {
                        c15696o2 = new C15696o();
                    } else {
                        this.f48927d = c15696o2.f48923d;
                    }
                    c15696o2.f48922c = c15693lArr;
                    c15696o2.f48920a = length;
                    c15696o2.f48921b = i10;
                    c15696o2.f48923d = this.f48926c;
                    this.f48926c = c15696o2;
                    c15693l = null;
                } else {
                    c15693l = c15693lM17302k instanceof C15698q ? ((C15698q) c15693lM17302k).f48935f : null;
                    if (this.f48926c != null) {
                        while (true) {
                            c15696o = this.f48926c;
                            if (c15696o != null) {
                                break;
                                break;
                            }
                            int i15 = this.f48928e;
                            i12 = c15696o.f48920a;
                            i13 = i15 + i12;
                            this.f48928e = i13;
                            if (i13 >= length) {
                                break;
                                break;
                            }
                            this.f48928e = c15696o.f48921b;
                            this.f48924a = c15696o.f48922c;
                            c15696o.f48922c = null;
                            C15696o c15696o3 = c15696o.f48923d;
                            c15696o.f48923d = this.f48927d;
                            this.f48926c = c15696o3;
                            this.f48927d = c15696o;
                            length = i12;
                        }
                        if (c15696o == null) {
                            i11 = this.f48928e + this.f48931h;
                            this.f48928e = i11;
                            if (i11 >= length) {
                                int i16 = this.f48929f + 1;
                                this.f48929f = i16;
                                this.f48928e = i16;
                            }
                        }
                    } else {
                        i14 = i10 + this.f48931h;
                        this.f48928e = i14;
                        if (i14 >= length) {
                            int i17 = this.f48929f + 1;
                            this.f48929f = i17;
                            this.f48928e = i17;
                        }
                    }
                }
            } else {
                c15693l = c15693lM17302k;
                if (this.f48926c != null) {
                    while (true) {
                        c15696o = this.f48926c;
                        if (c15696o != null) {
                            break;
                        }
                        int i18 = this.f48928e;
                        i12 = c15696o.f48920a;
                        i13 = i18 + i12;
                        this.f48928e = i13;
                        if (i13 >= length) {
                            break;
                        }
                        this.f48928e = c15696o.f48921b;
                        this.f48924a = c15696o.f48922c;
                        c15696o.f48922c = null;
                        C15696o c15696o4 = c15696o.f48923d;
                        c15696o.f48923d = this.f48927d;
                        this.f48926c = c15696o4;
                        this.f48927d = c15696o;
                        length = i12;
                    }
                    if (c15696o == null) {
                        i11 = this.f48928e + this.f48931h;
                        this.f48928e = i11;
                        if (i11 >= length) {
                            int i19 = this.f48929f + 1;
                            this.f48929f = i19;
                            this.f48928e = i19;
                        }
                    }
                } else {
                    i14 = i10 + this.f48931h;
                    this.f48928e = i14;
                    if (i14 >= length) {
                        int i110 = this.f48929f + 1;
                        this.f48929f = i110;
                        this.f48928e = i110;
                    }
                }
            }
        }
        this.f48925b = c15693l;
        return c15693l;
    }
}
