package p817j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import p817j$.sun.misc.C15532a;

/* JADX INFO: renamed from: j$.util.concurrent.q */
/* JADX INFO: loaded from: classes4.dex */
final class C15698q extends C15693l {

    /* JADX INFO: renamed from: h */
    private static final C15532a f48932h;

    /* JADX INFO: renamed from: i */
    private static final long f48933i;

    /* JADX INFO: renamed from: e */
    C15699r f48934e;

    /* JADX INFO: renamed from: f */
    volatile C15699r f48935f;

    /* JADX INFO: renamed from: g */
    volatile Thread f48936g;
    volatile int lockState;

    /* JADX INFO: renamed from: i */
    static int m17328i(Object obj, Object obj2) {
        int iCompareTo;
        if (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return iCompareTo;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b A[PHI: r7
      0x004b: PHI (r7v3 java.lang.Class<?>) = (r7v2 java.lang.Class<?>), (r7v4 java.lang.Class<?>) binds: [B:24:0x0049, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    C15698q(C15699r c15699r) {
        int iM17328i;
        super(-2, null, null);
        this.f48935f = c15699r;
        C15699r c15699r2 = null;
        while (c15699r != null) {
            C15699r c15699r3 = (C15699r) c15699r.f48919d;
            c15699r.f48939g = null;
            c15699r.f48938f = null;
            if (c15699r2 == null) {
                c15699r.f48937e = null;
                c15699r.f48941i = false;
            } else {
                Object obj = c15699r.f48917b;
                int i10 = c15699r.f48916a;
                C15699r c15699r4 = c15699r2;
                Class<?> clsM17298c = null;
                while (true) {
                    Object obj2 = c15699r4.f48917b;
                    int i11 = c15699r4.f48916a;
                    if (i11 > i10) {
                        iM17328i = -1;
                    } else if (i11 < i10) {
                        iM17328i = 1;
                    } else if (clsM17298c != null || (clsM17298c = ConcurrentHashMap.m17298c(obj)) != null) {
                        int i12 = ConcurrentHashMap.f48882g;
                        int iCompareTo = (obj2 == null || obj2.getClass() != clsM17298c) ? 0 : ((Comparable) obj).compareTo(obj2);
                        if (iCompareTo == 0) {
                            iM17328i = m17328i(obj, obj2);
                        } else {
                            iM17328i = iCompareTo;
                        }
                    } else {
                        iM17328i = m17328i(obj, obj2);
                    }
                    C15699r c15699r5 = iM17328i <= 0 ? c15699r4.f48938f : c15699r4.f48939g;
                    if (c15699r5 == null) {
                        break;
                    } else {
                        c15699r4 = c15699r5;
                    }
                }
                c15699r.f48937e = c15699r4;
                if (iM17328i <= 0) {
                    c15699r4.f48938f = c15699r;
                } else {
                    c15699r4.f48939g = c15699r;
                }
                c15699r = m17324c(c15699r2, c15699r);
            }
            c15699r2 = c15699r;
            c15699r = c15699r3;
        }
        this.f48934e = c15699r2;
    }

    /* JADX INFO: renamed from: d */
    private final void m17325d() {
        if (f48932h.m16757c(this, f48933i, 0, 1)) {
            return;
        }
        boolean z6 = false;
        while (true) {
            int i10 = this.lockState;
            if ((i10 & (-3)) == 0) {
                if (f48932h.m16757c(this, f48933i, i10, 1)) {
                    break;
                }
            } else if ((i10 & 2) == 0) {
                if (f48932h.m16757c(this, f48933i, i10, i10 | 2)) {
                    this.f48936g = Thread.currentThread();
                    z6 = true;
                }
            } else if (z6) {
                LockSupport.park(this);
            }
        }
        if (z6) {
            this.f48936g = null;
        }
    }

    @Override // p817j$.util.concurrent.C15693l
    /* JADX INFO: renamed from: a */
    final C15693l mo17321a(int i10, Object obj) {
        Object obj2;
        Thread thread;
        C15699r c15699rM17331b = null;
        if (obj != null) {
            C15693l c15693l = this.f48935f;
            while (c15693l != null) {
                int i11 = this.lockState;
                if ((i11 & 3) != 0) {
                    if (c15693l.f48916a == i10 && ((obj2 = c15693l.f48917b) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return c15693l;
                    }
                    c15693l = c15693l.f48919d;
                } else if (f48932h.m16757c(this, f48933i, i11, i11 + 4)) {
                    try {
                        C15699r c15699r = this.f48934e;
                        if (c15699r != null) {
                            c15699rM17331b = c15699r.m17331b(i10, obj, null);
                        }
                        return c15699rM17331b;
                    } finally {
                        if (f48932h.m16760f(this, f48933i) == 6 && (thread = this.f48936g) != null) {
                            LockSupport.unpark(thread);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7 A[LOOP:0: B:3:0x000c->B:61:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0081 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    final C15699r m17329e(int i10, Object obj, Object obj2) {
        int i11;
        int iM17328i;
        C15699r c15699r;
        C15699r c15699rM17331b;
        C15699r c15699r2;
        C15699r c15699r3;
        C15699r c15699r4;
        C15699r c15699r5 = this.f48934e;
        Class<?> clsM17298c = null;
        boolean z6 = false;
        while (c15699r5 != null) {
            int i12 = c15699r5.f48916a;
            if (i12 > i10) {
                iM17328i = -1;
            } else {
                if (i12 < i10) {
                    i11 = 1;
                } else {
                    Object obj3 = c15699r5.f48917b;
                    if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                        return c15699r5;
                    }
                    if (clsM17298c != null || (clsM17298c = ConcurrentHashMap.m17298c(obj)) != null) {
                        int i13 = ConcurrentHashMap.f48882g;
                        int iCompareTo = (obj3 == null || obj3.getClass() != clsM17298c) ? 0 : ((Comparable) obj).compareTo(obj3);
                        if (iCompareTo != 0) {
                            i11 = iCompareTo;
                        }
                    }
                    if (!z6) {
                        C15699r c15699r6 = c15699r5.f48938f;
                        if ((c15699r6 != null && (c15699rM17331b = c15699r6.m17331b(i10, obj, clsM17298c)) != null) || ((c15699r = c15699r5.f48939g) != null && (c15699rM17331b = c15699r.m17331b(i10, obj, clsM17298c)) != null)) {
                            return c15699rM17331b;
                        }
                        z6 = true;
                    }
                    iM17328i = m17328i(obj, obj3);
                }
                if (i11 <= 0) {
                    c15699r2 = c15699r5.f48938f;
                } else {
                    c15699r2 = c15699r5.f48939g;
                }
                if (c15699r2 == null) {
                    c15699r3 = this.f48935f;
                    c15699r4 = new C15699r(i10, obj, obj2, c15699r3, c15699r5);
                    this.f48935f = c15699r4;
                    if (c15699r3 != null) {
                        c15699r3.f48940h = c15699r4;
                    }
                    if (i11 <= 0) {
                        c15699r5.f48938f = c15699r4;
                    } else {
                        c15699r5.f48939g = c15699r4;
                    }
                    if (!c15699r5.f48941i) {
                        c15699r4.f48941i = true;
                    } else {
                        m17325d();
                        try {
                            this.f48934e = m17324c(this.f48934e, c15699r4);
                        } finally {
                            this.lockState = 0;
                        }
                    }
                    return null;
                }
                c15699r5 = c15699r2;
            }
            i11 = iM17328i;
            if (i11 <= 0) {
                c15699r2 = c15699r5.f48938f;
            } else {
                c15699r2 = c15699r5.f48939g;
            }
            if (c15699r2 == null) {
                c15699r3 = this.f48935f;
                c15699r4 = new C15699r(i10, obj, obj2, c15699r3, c15699r5);
                this.f48935f = c15699r4;
                if (c15699r3 != null) {
                    c15699r3.f48940h = c15699r4;
                }
                if (i11 <= 0) {
                    c15699r5.f48938f = c15699r4;
                } else {
                    c15699r5.f48939g = c15699r4;
                }
                if (!c15699r5.f48941i) {
                    c15699r4.f48941i = true;
                } else {
                    m17325d();
                    this.f48934e = m17324c(this.f48934e, c15699r4);
                }
                return null;
            }
            c15699r5 = c15699r2;
        }
        C15699r c15699r7 = new C15699r(i10, obj, obj2, null, null);
        this.f48934e = c15699r7;
        this.f48935f = c15699r7;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x008e A[PHI: r0
      0x008e: PHI (r0v4 j$.util.concurrent.r) = (r0v3 j$.util.concurrent.r), (r0v12 j$.util.concurrent.r) binds: [B:55:0x008a, B:51:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: f */
    final boolean m17330f(C15699r c15699r) {
        C15699r c15699r2;
        C15699r c15699r3;
        C15699r c15699r4 = (C15699r) c15699r.f48919d;
        C15699r c15699r5 = c15699r.f48940h;
        if (c15699r5 == null) {
            this.f48935f = c15699r4;
        } else {
            c15699r5.f48919d = c15699r4;
        }
        if (c15699r4 != null) {
            c15699r4.f48940h = c15699r5;
        }
        if (this.f48935f == null) {
            this.f48934e = null;
            return true;
        }
        C15699r c15699rM17323b = this.f48934e;
        if (c15699rM17323b == null || c15699rM17323b.f48939g == null || (c15699r2 = c15699rM17323b.f48938f) == null || c15699r2.f48938f == null) {
            return true;
        }
        m17325d();
        try {
            C15699r c15699r6 = c15699r.f48938f;
            C15699r c15699r7 = c15699r.f48939g;
            if (c15699r6 != null && c15699r7 != null) {
                C15699r c15699r8 = c15699r7;
                while (true) {
                    C15699r c15699r9 = c15699r8.f48938f;
                    if (c15699r9 == null) {
                        break;
                    }
                    c15699r8 = c15699r9;
                }
                boolean z6 = c15699r8.f48941i;
                c15699r8.f48941i = c15699r.f48941i;
                c15699r.f48941i = z6;
                C15699r c15699r10 = c15699r8.f48939g;
                C15699r c15699r11 = c15699r.f48937e;
                if (c15699r8 == c15699r7) {
                    c15699r.f48937e = c15699r8;
                    c15699r8.f48939g = c15699r;
                } else {
                    C15699r c15699r12 = c15699r8.f48937e;
                    c15699r.f48937e = c15699r12;
                    if (c15699r12 != null) {
                        if (c15699r8 == c15699r12.f48938f) {
                            c15699r12.f48938f = c15699r;
                        } else {
                            c15699r12.f48939g = c15699r;
                        }
                    }
                    c15699r8.f48939g = c15699r7;
                    c15699r7.f48937e = c15699r8;
                }
                c15699r.f48938f = null;
                c15699r.f48939g = c15699r10;
                if (c15699r10 != null) {
                    c15699r10.f48937e = c15699r;
                }
                c15699r8.f48938f = c15699r6;
                c15699r6.f48937e = c15699r8;
                c15699r8.f48937e = c15699r11;
                if (c15699r11 == null) {
                    c15699rM17323b = c15699r8;
                } else if (c15699r == c15699r11.f48938f) {
                    c15699r11.f48938f = c15699r8;
                } else {
                    c15699r11.f48939g = c15699r8;
                }
                if (c15699r10 != null) {
                    c15699r6 = c15699r10;
                } else {
                    c15699r6 = c15699r;
                }
            } else if (c15699r6 == null) {
                if (c15699r7 != null) {
                    c15699r6 = c15699r7;
                } else {
                    c15699r6 = c15699r;
                }
            }
            if (c15699r6 != c15699r) {
                C15699r c15699r13 = c15699r.f48937e;
                c15699r6.f48937e = c15699r13;
                if (c15699r13 == null) {
                    c15699rM17323b = c15699r6;
                } else if (c15699r == c15699r13.f48938f) {
                    c15699r13.f48938f = c15699r6;
                } else {
                    c15699r13.f48939g = c15699r6;
                }
                c15699r.f48937e = null;
                c15699r.f48939g = null;
                c15699r.f48938f = null;
            }
            if (!c15699r.f48941i) {
                c15699rM17323b = m17323b(c15699rM17323b, c15699r6);
            }
            this.f48934e = c15699rM17323b;
            if (c15699r == c15699r6 && (c15699r3 = c15699r.f48937e) != null) {
                if (c15699r == c15699r3.f48938f) {
                    c15699r3.f48938f = null;
                } else if (c15699r == c15699r3.f48939g) {
                    c15699r3.f48939g = null;
                }
                c15699r.f48937e = null;
            }
            return false;
        } finally {
            this.lockState = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    static C15699r m17326g(C15699r c15699r, C15699r c15699r2) {
        C15699r c15699r3;
        if (c15699r2 != null && (c15699r3 = c15699r2.f48939g) != null) {
            C15699r c15699r4 = c15699r3.f48938f;
            c15699r2.f48939g = c15699r4;
            if (c15699r4 != null) {
                c15699r4.f48937e = c15699r2;
            }
            C15699r c15699r5 = c15699r2.f48937e;
            c15699r3.f48937e = c15699r5;
            if (c15699r5 == null) {
                c15699r3.f48941i = false;
                c15699r = c15699r3;
            } else if (c15699r5.f48938f == c15699r2) {
                c15699r5.f48938f = c15699r3;
            } else {
                c15699r5.f48939g = c15699r3;
            }
            c15699r3.f48938f = c15699r2;
            c15699r2.f48937e = c15699r3;
        }
        return c15699r;
    }

    /* JADX INFO: renamed from: h */
    static C15699r m17327h(C15699r c15699r, C15699r c15699r2) {
        C15699r c15699r3;
        if (c15699r2 != null && (c15699r3 = c15699r2.f48938f) != null) {
            C15699r c15699r4 = c15699r3.f48939g;
            c15699r2.f48938f = c15699r4;
            if (c15699r4 != null) {
                c15699r4.f48937e = c15699r2;
            }
            C15699r c15699r5 = c15699r2.f48937e;
            c15699r3.f48937e = c15699r5;
            if (c15699r5 == null) {
                c15699r3.f48941i = false;
                c15699r = c15699r3;
            } else if (c15699r5.f48939g == c15699r2) {
                c15699r5.f48939g = c15699r3;
            } else {
                c15699r5.f48938f = c15699r3;
            }
            c15699r3.f48939g = c15699r2;
            c15699r2.f48937e = c15699r3;
        }
        return c15699r;
    }

    /* JADX INFO: renamed from: c */
    static C15699r m17324c(C15699r c15699r, C15699r c15699r2) {
        C15699r c15699r3;
        c15699r2.f48941i = true;
        while (true) {
            C15699r c15699r4 = c15699r2.f48937e;
            if (c15699r4 == null) {
                c15699r2.f48941i = false;
                return c15699r2;
            }
            if (!c15699r4.f48941i || (c15699r3 = c15699r4.f48937e) == null) {
                return c15699r;
            }
            C15699r c15699r5 = c15699r3.f48938f;
            if (c15699r4 == c15699r5) {
                C15699r c15699r6 = c15699r3.f48939g;
                if (c15699r6 != null && c15699r6.f48941i) {
                    c15699r6.f48941i = false;
                    c15699r4.f48941i = false;
                    c15699r3.f48941i = true;
                    c15699r2 = c15699r3;
                } else {
                    if (c15699r2 == c15699r4.f48939g) {
                        c15699r = m17326g(c15699r, c15699r4);
                        C15699r c15699r7 = c15699r4.f48937e;
                        c15699r3 = c15699r7 == null ? null : c15699r7.f48937e;
                        c15699r4 = c15699r7;
                        c15699r2 = c15699r4;
                    }
                    if (c15699r4 != null) {
                        c15699r4.f48941i = false;
                        if (c15699r3 != null) {
                            c15699r3.f48941i = true;
                            c15699r = m17327h(c15699r, c15699r3);
                        }
                    }
                }
            } else if (c15699r5 != null && c15699r5.f48941i) {
                c15699r5.f48941i = false;
                c15699r4.f48941i = false;
                c15699r3.f48941i = true;
                c15699r2 = c15699r3;
            } else {
                if (c15699r2 == c15699r4.f48938f) {
                    c15699r = m17327h(c15699r, c15699r4);
                    C15699r c15699r8 = c15699r4.f48937e;
                    c15699r3 = c15699r8 == null ? null : c15699r8.f48937e;
                    c15699r4 = c15699r8;
                    c15699r2 = c15699r4;
                }
                if (c15699r4 != null) {
                    c15699r4.f48941i = false;
                    if (c15699r3 != null) {
                        c15699r3.f48941i = true;
                        c15699r = m17326g(c15699r, c15699r3);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static C15699r m17323b(C15699r c15699r, C15699r c15699r2) {
        while (c15699r2 != null && c15699r2 != c15699r) {
            C15699r c15699r3 = c15699r2.f48937e;
            if (c15699r3 == null) {
                c15699r2.f48941i = false;
                return c15699r2;
            }
            if (c15699r2.f48941i) {
                c15699r2.f48941i = false;
                return c15699r;
            }
            C15699r c15699r4 = c15699r3.f48938f;
            if (c15699r4 == c15699r2) {
                C15699r c15699r5 = c15699r3.f48939g;
                if (c15699r5 != null && c15699r5.f48941i) {
                    c15699r5.f48941i = false;
                    c15699r3.f48941i = true;
                    c15699r = m17326g(c15699r, c15699r3);
                    c15699r3 = c15699r2.f48937e;
                    c15699r5 = c15699r3 == null ? null : c15699r3.f48939g;
                }
                if (c15699r5 != null) {
                    C15699r c15699r6 = c15699r5.f48938f;
                    C15699r c15699r7 = c15699r5.f48939g;
                    if ((c15699r7 == null || !c15699r7.f48941i) && (c15699r6 == null || !c15699r6.f48941i)) {
                        c15699r5.f48941i = true;
                    } else {
                        if (c15699r7 == null || !c15699r7.f48941i) {
                            if (c15699r6 != null) {
                                c15699r6.f48941i = false;
                            }
                            c15699r5.f48941i = true;
                            c15699r = m17327h(c15699r, c15699r5);
                            c15699r3 = c15699r2.f48937e;
                            c15699r5 = c15699r3 != null ? c15699r3.f48939g : null;
                        }
                        if (c15699r5 != null) {
                            c15699r5.f48941i = c15699r3 == null ? false : c15699r3.f48941i;
                            C15699r c15699r8 = c15699r5.f48939g;
                            if (c15699r8 != null) {
                                c15699r8.f48941i = false;
                            }
                        }
                        if (c15699r3 != null) {
                            c15699r3.f48941i = false;
                            c15699r = m17326g(c15699r, c15699r3);
                        }
                        c15699r2 = c15699r;
                    }
                }
                c15699r2 = c15699r3;
            } else {
                if (c15699r4 != null && c15699r4.f48941i) {
                    c15699r4.f48941i = false;
                    c15699r3.f48941i = true;
                    c15699r = m17327h(c15699r, c15699r3);
                    c15699r3 = c15699r2.f48937e;
                    c15699r4 = c15699r3 == null ? null : c15699r3.f48938f;
                }
                if (c15699r4 != null) {
                    C15699r c15699r9 = c15699r4.f48938f;
                    C15699r c15699r10 = c15699r4.f48939g;
                    if ((c15699r9 == null || !c15699r9.f48941i) && (c15699r10 == null || !c15699r10.f48941i)) {
                        c15699r4.f48941i = true;
                    } else {
                        if (c15699r9 == null || !c15699r9.f48941i) {
                            if (c15699r10 != null) {
                                c15699r10.f48941i = false;
                            }
                            c15699r4.f48941i = true;
                            c15699r = m17326g(c15699r, c15699r4);
                            c15699r3 = c15699r2.f48937e;
                            c15699r4 = c15699r3 != null ? c15699r3.f48938f : null;
                        }
                        if (c15699r4 != null) {
                            c15699r4.f48941i = c15699r3 == null ? false : c15699r3.f48941i;
                            C15699r c15699r11 = c15699r4.f48938f;
                            if (c15699r11 != null) {
                                c15699r11.f48941i = false;
                            }
                        }
                        if (c15699r3 != null) {
                            c15699r3.f48941i = false;
                            c15699r = m17327h(c15699r, c15699r3);
                        }
                        c15699r2 = c15699r;
                    }
                }
                c15699r2 = c15699r3;
            }
        }
        return c15699r;
    }

    static {
        C15532a c15532aM16753h = C15532a.m16753h();
        f48932h = c15532aM16753h;
        f48933i = c15532aM16753h.m16762j(C15698q.class, "lockState");
    }
}
