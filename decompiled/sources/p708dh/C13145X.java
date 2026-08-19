package p708dh;

import af.C10564U;
import mm.C17296C;
import ni.C17641o;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p1149zc.AbstractC21864z;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.C22013h2;
import p195Hh.C3430e;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p790hh.C14514c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C13145X {

    /* JADX INFO: renamed from: a */
    public final C13146Y f41733a;

    /* JADX INFO: renamed from: b */
    public final AbstractC21864z f41734b;

    /* JADX INFO: renamed from: c */
    public final C14514c f41735c;

    /* JADX INFO: renamed from: d */
    public final C3430e f41736d = AbstractC8168p6.m8749b("UserRepository", null);

    /* JADX INFO: renamed from: e */
    public final C2127D0 f41737e = AbstractC2124C.m3203b(1, 0, null, 6);

    public C13145X(C13146Y c13146y, AbstractC21864z abstractC21864z, C14514c c14514c, C17641o c17641o) {
        this.f41733a = c13146y;
        this.f41734b = abstractC21864z;
        this.f41735c = c14514c;
        AbstractC0575H.m1156D(c17641o, null, null, new C13143V(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8 A[PHI: r2 r3
      0x00d8: PHI (r2v5 dh.X) = (r2v3 dh.X), (r2v7 dh.X) binds: [B:42:0x00b3, B:47:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r3v8 zi.Q1) = (r3v5 zi.Q1), (r3v11 zi.Q1) binds: [B:42:0x00b3, B:47:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0121  */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    /* JADX WARN: Code duplicated, block: B:73:0x0140  */
    /* JADX WARN: Code duplicated, block: B:77:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m14819a(AbstractC19687c abstractC19687c) {
        C13144W c13144w;
        C13145X c13145x;
        AbstractC6224C abstractC6224C;
        C13146Y c13146y;
        C10564U c10564u;
        C13145X c13145x2;
        AbstractC21955Q1 abstractC21955Q1;
        AbstractC21933K1 abstractC21933K1;
        Object objM3221t;
        AbstractC21955Q1 abstractC21955Q2;
        AbstractC21933K1 abstractC21933K2;
        AbstractC21955Q1 abstractC21955Q3;
        C2127D0 c2127d0;
        C13145X c13145x3;
        AbstractC21933K1 abstractC21933K3;
        AbstractC21955Q1 abstractC21955Q4;
        if (abstractC19687c instanceof C13144W) {
            c13144w = (C13144W) abstractC19687c;
            int i10 = c13144w.f41732r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13144w.f41732r0 = i10 - Integer.MIN_VALUE;
            } else {
                c13144w = new C13144W(this, abstractC19687c);
            }
        } else {
            c13144w = new C13144W(this, abstractC19687c);
        }
        Object objM22317a = c13144w.f41730p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13144w.f41732r0;
        AbstractC21955Q1 abstractC21955Q1M6734a = C21929J1.f69476a;
        if (i11 != 0) {
            if (i11 == 1) {
                c13145x = c13144w.f41727Y;
                AbstractC9233X.m9807c(objM22317a);
            } else {
                if (i11 == 2) {
                    c13145x = c13144w.f41727Y;
                    AbstractC9233X.m9807c(objM22317a);
                    abstractC6224C = (AbstractC6224C) objM22317a;
                    if (abstractC6224C instanceof C6223B) {
                        abstractC21955Q1M6734a = new C21952P1(((C6223B) abstractC6224C).f20258a);
                    } else if (!(abstractC6224C instanceof C6248v)) {
                        if (abstractC6224C instanceof AbstractC6249w) {
                            throw new C0644w();
                        }
                        abstractC6224C.getClass();
                        abstractC21955Q1M6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
                    }
                    if (abstractC21955Q1M6734a instanceof C21952P1) {
                        C22013h2 c22013h2 = (C22013h2) ((C21952P1) abstractC21955Q1M6734a).f69511a;
                        c13146y = c13145x.f41733a;
                        c10564u = new C10564U(c22013h2, 20);
                        c13144w.f41727Y = c13145x;
                        c13144w.f41728Z = abstractC21955Q1M6734a;
                        c13144w.f41732r0 = 3;
                        if (c13146y.m21029b(c10564u, c13144w) == enumC19250a) {
                            return enumC19250a;
                        }
                        AbstractC21955Q1 abstractC21955Q5 = abstractC21955Q1M6734a;
                        c13145x2 = c13145x;
                        abstractC21955Q1 = abstractC21955Q5;
                        C13145X c13145x4 = c13145x2;
                        abstractC21955Q1M6734a = abstractC21955Q1;
                        c13145x = c13145x4;
                        if (abstractC21955Q1M6734a instanceof AbstractC21933K1) {
                            abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1M6734a;
                            C13146Y c13146y2 = c13145x.f41733a;
                            c13144w.f41727Y = c13145x;
                            c13144w.f41728Z = abstractC21955Q1M6734a;
                            c13144w.f41729o0 = abstractC21933K1;
                            c13144w.f41732r0 = 4;
                            objM3221t = AbstractC2124C.m3221t(c13146y2.f64176f, c13144w);
                            if (objM3221t == enumC19250a) {
                                return enumC19250a;
                            }
                            abstractC21955Q2 = abstractC21955Q1M6734a;
                            abstractC21933K2 = abstractC21933K1;
                            objM22317a = objM3221t;
                            abstractC21955Q3 = abstractC21955Q2;
                            if (((C22013h2) objM22317a) == null) {
                                c2127d0 = c13145x.f41737e;
                                c13144w.f41727Y = c13145x;
                                c13144w.f41728Z = abstractC21955Q3;
                                c13144w.f41729o0 = abstractC21933K2;
                                c13144w.f41732r0 = 5;
                                if (c2127d0.mo395a(abstractC21933K2, c13144w) == enumC19250a) {
                                    return enumC19250a;
                                }
                                c13145x3 = c13145x;
                                abstractC21933K3 = abstractC21933K2;
                                abstractC21955Q4 = abstractC21955Q3;
                            }
                            AbstractC8160o6.m8731f(c13145x.f41736d, "Error fetching profile", abstractC21933K2.f69485a, null, 4);
                            abstractC21955Q1M6734a = abstractC21955Q3;
                        }
                    } else if (abstractC21955Q1M6734a instanceof AbstractC21933K1) {
                        abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1M6734a;
                        C13146Y c13146y3 = c13145x.f41733a;
                        c13144w.f41727Y = c13145x;
                        c13144w.f41728Z = abstractC21955Q1M6734a;
                        c13144w.f41729o0 = abstractC21933K1;
                        c13144w.f41732r0 = 4;
                        objM3221t = AbstractC2124C.m3221t(c13146y3.f64176f, c13144w);
                        if (objM3221t == enumC19250a) {
                            return enumC19250a;
                        }
                        abstractC21955Q2 = abstractC21955Q1M6734a;
                        abstractC21933K2 = abstractC21933K1;
                        objM22317a = objM3221t;
                        abstractC21955Q3 = abstractC21955Q2;
                        if (((C22013h2) objM22317a) == null) {
                            c2127d0 = c13145x.f41737e;
                            c13144w.f41727Y = c13145x;
                            c13144w.f41728Z = abstractC21955Q3;
                            c13144w.f41729o0 = abstractC21933K2;
                            c13144w.f41732r0 = 5;
                            if (c2127d0.mo395a(abstractC21933K2, c13144w) == enumC19250a) {
                                return enumC19250a;
                            }
                            c13145x3 = c13145x;
                            abstractC21933K3 = abstractC21933K2;
                            abstractC21955Q4 = abstractC21955Q3;
                        }
                        AbstractC8160o6.m8731f(c13145x.f41736d, "Error fetching profile", abstractC21933K2.f69485a, null, 4);
                        abstractC21955Q1M6734a = abstractC21955Q3;
                    }
                    if (abstractC21955Q1M6734a instanceof C21952P1) {
                        return new C21952P1(C17296C.f55119a);
                    }
                    if (abstractC21955Q1M6734a instanceof C21929J1) {
                        return abstractC21955Q1M6734a;
                    }
                    throw new C0644w();
                }
                if (i11 == 3) {
                    abstractC21955Q1 = c13144w.f41728Z;
                    c13145x2 = c13144w.f41727Y;
                    AbstractC9233X.m9807c(objM22317a);
                    C13145X c13145x5 = c13145x2;
                    abstractC21955Q1M6734a = abstractC21955Q1;
                    c13145x = c13145x5;
                    if (abstractC21955Q1M6734a instanceof AbstractC21933K1) {
                        abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1M6734a;
                        C13146Y c13146y4 = c13145x.f41733a;
                        c13144w.f41727Y = c13145x;
                        c13144w.f41728Z = abstractC21955Q1M6734a;
                        c13144w.f41729o0 = abstractC21933K1;
                        c13144w.f41732r0 = 4;
                        objM3221t = AbstractC2124C.m3221t(c13146y4.f64176f, c13144w);
                        if (objM3221t == enumC19250a) {
                            return enumC19250a;
                        }
                        abstractC21955Q2 = abstractC21955Q1M6734a;
                        abstractC21933K2 = abstractC21933K1;
                        objM22317a = objM3221t;
                        abstractC21955Q3 = abstractC21955Q2;
                        if (((C22013h2) objM22317a) == null) {
                            c2127d0 = c13145x.f41737e;
                            c13144w.f41727Y = c13145x;
                            c13144w.f41728Z = abstractC21955Q3;
                            c13144w.f41729o0 = abstractC21933K2;
                            c13144w.f41732r0 = 5;
                            if (c2127d0.mo395a(abstractC21933K2, c13144w) == enumC19250a) {
                                return enumC19250a;
                            }
                            c13145x3 = c13145x;
                            abstractC21933K3 = abstractC21933K2;
                            abstractC21955Q4 = abstractC21955Q3;
                        }
                        AbstractC8160o6.m8731f(c13145x.f41736d, "Error fetching profile", abstractC21933K2.f69485a, null, 4);
                        abstractC21955Q1M6734a = abstractC21955Q3;
                    }
                    if (abstractC21955Q1M6734a instanceof C21952P1) {
                        return new C21952P1(C17296C.f55119a);
                    }
                    if (abstractC21955Q1M6734a instanceof C21929J1) {
                        return abstractC21955Q1M6734a;
                    }
                    throw new C0644w();
                }
                if (i11 == 4) {
                    AbstractC21933K1 abstractC21933K4 = c13144w.f41729o0;
                    AbstractC21955Q1 abstractC21955Q6 = c13144w.f41728Z;
                    C13145X c13145x6 = c13144w.f41727Y;
                    AbstractC9233X.m9807c(objM22317a);
                    abstractC21955Q2 = abstractC21955Q6;
                    abstractC21933K2 = abstractC21933K4;
                    c13145x = c13145x6;
                    abstractC21955Q3 = abstractC21955Q2;
                    if (((C22013h2) objM22317a) == null) {
                        c2127d0 = c13145x.f41737e;
                        c13144w.f41727Y = c13145x;
                        c13144w.f41728Z = abstractC21955Q3;
                        c13144w.f41729o0 = abstractC21933K2;
                        c13144w.f41732r0 = 5;
                        if (c2127d0.mo395a(abstractC21933K2, c13144w) == enumC19250a) {
                            return enumC19250a;
                        }
                        c13145x3 = c13145x;
                        abstractC21933K3 = abstractC21933K2;
                        abstractC21955Q4 = abstractC21955Q3;
                    }
                    AbstractC8160o6.m8731f(c13145x.f41736d, "Error fetching profile", abstractC21933K2.f69485a, null, 4);
                    abstractC21955Q1M6734a = abstractC21955Q3;
                    if (abstractC21955Q1M6734a instanceof C21952P1) {
                        return new C21952P1(C17296C.f55119a);
                    }
                    if ((abstractC21955Q1M6734a instanceof C21929J1) && !(abstractC21955Q1M6734a instanceof AbstractC21933K1)) {
                        throw new C0644w();
                    }
                    return abstractC21955Q1M6734a;
                }
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21933K3 = c13144w.f41729o0;
                abstractC21955Q4 = c13144w.f41728Z;
                c13145x3 = c13144w.f41727Y;
                AbstractC9233X.m9807c(objM22317a);
            }
            abstractC21933K2 = abstractC21933K3;
            abstractC21955Q3 = abstractC21955Q4;
            c13145x = c13145x3;
            AbstractC8160o6.m8731f(c13145x.f41736d, "Error fetching profile", abstractC21933K2.f69485a, null, 4);
            abstractC21955Q1M6734a = abstractC21955Q3;
            if (abstractC21955Q1M6734a instanceof C21952P1) {
                return new C21952P1(C17296C.f55119a);
            }
            if (abstractC21955Q1M6734a instanceof C21929J1) {
                return abstractC21955Q1M6734a;
            }
            throw new C0644w();
        }
        AbstractC9233X.m9807c(objM22317a);
        c13144w.f41727Y = this;
        c13144w.f41732r0 = 1;
        objM22317a = this.f41734b.m22317a(c13144w);
        if (objM22317a == enumC19250a) {
            return enumC19250a;
        }
        c13145x = this;
        if (!((Boolean) objM22317a).booleanValue()) {
            return abstractC21955Q1M6734a;
        }
        C14514c c14514c = c13145x.f41735c;
        c13144w.f41727Y = c13145x;
        c13144w.f41732r0 = 2;
        objM22317a = c14514c.m16006a(c13144w);
        if (objM22317a == enumC19250a) {
            return enumC19250a;
        }
        abstractC6224C = (AbstractC6224C) objM22317a;
        if (abstractC6224C instanceof C6223B) {
            abstractC21955Q1M6734a = new C21952P1(((C6223B) abstractC6224C).f20258a);
        } else if (!(abstractC6224C instanceof C6248v)) {
            if (abstractC6224C instanceof AbstractC6249w) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            abstractC21955Q1M6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        if (abstractC21955Q1M6734a instanceof C21952P1) {
            C22013h2 c22013h3 = (C22013h2) ((C21952P1) abstractC21955Q1M6734a).f69511a;
            c13146y = c13145x.f41733a;
            c10564u = new C10564U(c22013h3, 20);
            c13144w.f41727Y = c13145x;
            c13144w.f41728Z = abstractC21955Q1M6734a;
            c13144w.f41732r0 = 3;
            if (c13146y.m21029b(c10564u, c13144w) == enumC19250a) {
                return enumC19250a;
            }
            AbstractC21955Q1 abstractC21955Q7 = abstractC21955Q1M6734a;
            c13145x2 = c13145x;
            abstractC21955Q1 = abstractC21955Q7;
            C13145X c13145x7 = c13145x2;
            abstractC21955Q1M6734a = abstractC21955Q1;
            c13145x = c13145x7;
            if (abstractC21955Q1M6734a instanceof AbstractC21933K1) {
                abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1M6734a;
                C13146Y c13146y5 = c13145x.f41733a;
                c13144w.f41727Y = c13145x;
                c13144w.f41728Z = abstractC21955Q1M6734a;
                c13144w.f41729o0 = abstractC21933K1;
                c13144w.f41732r0 = 4;
                objM3221t = AbstractC2124C.m3221t(c13146y5.f64176f, c13144w);
                if (objM3221t == enumC19250a) {
                    return enumC19250a;
                }
                abstractC21955Q2 = abstractC21955Q1M6734a;
                abstractC21933K2 = abstractC21933K1;
                objM22317a = objM3221t;
                abstractC21955Q3 = abstractC21955Q2;
                if (((C22013h2) objM22317a) == null) {
                    c2127d0 = c13145x.f41737e;
                    c13144w.f41727Y = c13145x;
                    c13144w.f41728Z = abstractC21955Q3;
                    c13144w.f41729o0 = abstractC21933K2;
                    c13144w.f41732r0 = 5;
                    if (c2127d0.mo395a(abstractC21933K2, c13144w) == enumC19250a) {
                        return enumC19250a;
                    }
                    c13145x3 = c13145x;
                    abstractC21933K3 = abstractC21933K2;
                    abstractC21955Q4 = abstractC21955Q3;
                    abstractC21933K2 = abstractC21933K3;
                    abstractC21955Q3 = abstractC21955Q4;
                    c13145x = c13145x3;
                }
                AbstractC8160o6.m8731f(c13145x.f41736d, "Error fetching profile", abstractC21933K2.f69485a, null, 4);
                abstractC21955Q1M6734a = abstractC21955Q3;
            }
        } else if (abstractC21955Q1M6734a instanceof AbstractC21933K1) {
            abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1M6734a;
            C13146Y c13146y6 = c13145x.f41733a;
            c13144w.f41727Y = c13145x;
            c13144w.f41728Z = abstractC21955Q1M6734a;
            c13144w.f41729o0 = abstractC21933K1;
            c13144w.f41732r0 = 4;
            objM3221t = AbstractC2124C.m3221t(c13146y6.f64176f, c13144w);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            abstractC21955Q2 = abstractC21955Q1M6734a;
            abstractC21933K2 = abstractC21933K1;
            objM22317a = objM3221t;
            abstractC21955Q3 = abstractC21955Q2;
            if (((C22013h2) objM22317a) == null) {
                c2127d0 = c13145x.f41737e;
                c13144w.f41727Y = c13145x;
                c13144w.f41728Z = abstractC21955Q3;
                c13144w.f41729o0 = abstractC21933K2;
                c13144w.f41732r0 = 5;
                if (c2127d0.mo395a(abstractC21933K2, c13144w) == enumC19250a) {
                    return enumC19250a;
                }
                c13145x3 = c13145x;
                abstractC21933K3 = abstractC21933K2;
                abstractC21955Q4 = abstractC21955Q3;
                abstractC21933K2 = abstractC21933K3;
                abstractC21955Q3 = abstractC21955Q4;
                c13145x = c13145x3;
            }
            AbstractC8160o6.m8731f(c13145x.f41736d, "Error fetching profile", abstractC21933K2.f69485a, null, 4);
            abstractC21955Q1M6734a = abstractC21955Q3;
        }
        if (abstractC21955Q1M6734a instanceof C21952P1) {
            return new C21952P1(C17296C.f55119a);
        }
        if (abstractC21955Q1M6734a instanceof C21929J1) {
            return abstractC21955Q1M6734a;
        }
        throw new C0644w();
    }
}
