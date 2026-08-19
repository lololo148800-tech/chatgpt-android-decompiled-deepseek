package p1041uf;

import android.net.Uri;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21907E;
import p1155zi.C21952P1;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p480Te.C7392q;
import p571X9.AbstractC9233X;
import p991rh.C19003l;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import wf.C20942b;
import wf.C20943c;
import wf.C20945e;

/* JADX INFO: renamed from: uf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20217f {

    /* JADX INFO: renamed from: a */
    public final C20945e f64009a;

    /* JADX INFO: renamed from: b */
    public final C7392q f64010b;

    public C20217f(C20945e c20945e, C7392q c7392q) {
        this.f64009a = c20945e;
        this.f64010b = c7392q;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6 A[PHI: r6 r8
      0x00d6: PHI (r6v15 Bm.n) = (r6v11 Bm.n), (r6v18 Bm.n) binds: [B:33:0x00bb, B:38:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r8v6 zi.Q1) = (r8v5 zi.Q1), (r8v8 zi.Q1) binds: [B:33:0x00bb, B:38:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m21014a(String str, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2, AbstractC19687c abstractC19687c) throws Throwable {
        C20214c c20214c;
        C20217f c20217f;
        AbstractC6224C abstractC6224C;
        String str2;
        InterfaceC1436k interfaceC1436k2;
        InterfaceC1439n interfaceC1439n3;
        AbstractC21955Q1 abstractC21955Q1;
        InterfaceC1439n interfaceC1439n4;
        AbstractC21955Q1 abstractC21955Q2;
        if (abstractC19687c instanceof C20214c) {
            c20214c = (C20214c) abstractC19687c;
            int i10 = c20214c.f64003t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20214c.f64003t0 = i10 - Integer.MIN_VALUE;
            } else {
                c20214c = new C20214c(this, abstractC19687c);
            }
        } else {
            c20214c = new C20214c(this, abstractC19687c);
        }
        Object objM7792b = c20214c.f64001r0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20214c.f64003t0;
        C17296C c17296c = C17296C.f55119a;
        switch (i11) {
            case 0:
                AbstractC9233X.m9807c(objM7792b);
                if (!z6) {
                    C20215d c20215d = new C20215d(interfaceC1436k, null);
                    C20216e c20216e = new C20216e(interfaceC1439n, null);
                    c20214c.f64003t0 = 6;
                    return m21015b(str, c20215d, c20216e, c20214c) == enumC19250a ? enumC19250a : c17296c;
                }
                String strM22337a = C21907E.m22337a(str);
                c20214c.f63996Y = this;
                c20214c.f63997Z = str;
                c20214c.f63998o0 = interfaceC1436k;
                c20214c.f63999p0 = interfaceC1439n;
                c20214c.f64000q0 = interfaceC1439n2;
                c20214c.f64003t0 = 1;
                objM7792b = this.f64010b.m7792b(strM22337a, c20214c);
                if (objM7792b == enumC19250a) {
                    return enumC19250a;
                }
                c20217f = this;
                abstractC6224C = (AbstractC6224C) objM7792b;
                if (abstractC6224C instanceof C6223B) {
                    str2 = ((C19003l) ((C6223B) abstractC6224C).f20258a).f60582b;
                    if (str2 != null) {
                        C20945e c20945e = c20217f.f64009a;
                        c20214c.f63996Y = interfaceC1436k;
                        c20214c.f63997Z = interfaceC1439n;
                        c20214c.f63998o0 = null;
                        c20214c.f63999p0 = null;
                        c20214c.f64000q0 = null;
                        c20214c.f64003t0 = 2;
                        C3516e c3516e = AbstractC0593T.f1824a;
                        objM7792b = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C20942b(str, c20945e, str2, null), c20214c);
                        if (objM7792b == enumC19250a) {
                            return enumC19250a;
                        }
                        interfaceC1436k2 = interfaceC1436k;
                        interfaceC1439n3 = interfaceC1439n;
                        abstractC21955Q1 = (AbstractC21955Q1) objM7792b;
                        if (abstractC21955Q1 instanceof C21952P1) {
                            c20214c.f63996Y = interfaceC1439n3;
                            c20214c.f63997Z = abstractC21955Q1;
                            c20214c.f64003t0 = 3;
                            if (interfaceC1436k2.invoke(c20214c) == enumC19250a) {
                                return enumC19250a;
                            }
                            interfaceC1439n4 = interfaceC1439n3;
                            abstractC21955Q2 = abstractC21955Q1;
                            abstractC21955Q1 = abstractC21955Q2;
                            interfaceC1439n3 = interfaceC1439n4;
                            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                                c20214c.f63996Y = abstractC21955Q1;
                                c20214c.f63997Z = null;
                                c20214c.f64003t0 = 4;
                                if (interfaceC1439n3.invoke((AbstractC21933K1) abstractC21955Q1, c20214c) == enumC19250a) {
                                    return enumC19250a;
                                }
                            }
                        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                            c20214c.f63996Y = abstractC21955Q1;
                            c20214c.f63997Z = null;
                            c20214c.f64003t0 = 4;
                            if (interfaceC1439n3.invoke((AbstractC21933K1) abstractC21955Q1, c20214c) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    }
                } else if (abstractC6224C instanceof AbstractC6249w) {
                    c20214c.f63996Y = null;
                    c20214c.f63997Z = null;
                    c20214c.f63998o0 = null;
                    c20214c.f63999p0 = null;
                    c20214c.f64000q0 = null;
                    c20214c.f64003t0 = 5;
                    if (interfaceC1439n2.invoke((AbstractC6249w) abstractC6224C, c20214c) == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (!(abstractC6224C instanceof C6248v)) {
                    throw new C0644w();
                }
                return c17296c;
            case 1:
                interfaceC1439n2 = c20214c.f64000q0;
                interfaceC1439n = c20214c.f63999p0;
                interfaceC1436k = c20214c.f63998o0;
                str = (String) c20214c.f63997Z;
                c20217f = (C20217f) c20214c.f63996Y;
                AbstractC9233X.m9807c(objM7792b);
                abstractC6224C = (AbstractC6224C) objM7792b;
                if (abstractC6224C instanceof C6223B) {
                    str2 = ((C19003l) ((C6223B) abstractC6224C).f20258a).f60582b;
                    if (str2 != null) {
                        C20945e c20945e2 = c20217f.f64009a;
                        c20214c.f63996Y = interfaceC1436k;
                        c20214c.f63997Z = interfaceC1439n;
                        c20214c.f63998o0 = null;
                        c20214c.f63999p0 = null;
                        c20214c.f64000q0 = null;
                        c20214c.f64003t0 = 2;
                        C3516e c3516e2 = AbstractC0593T.f1824a;
                        objM7792b = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C20942b(str, c20945e2, str2, null), c20214c);
                        if (objM7792b == enumC19250a) {
                            return enumC19250a;
                        }
                        interfaceC1436k2 = interfaceC1436k;
                        interfaceC1439n3 = interfaceC1439n;
                        abstractC21955Q1 = (AbstractC21955Q1) objM7792b;
                        if (abstractC21955Q1 instanceof C21952P1) {
                            c20214c.f63996Y = interfaceC1439n3;
                            c20214c.f63997Z = abstractC21955Q1;
                            c20214c.f64003t0 = 3;
                            if (interfaceC1436k2.invoke(c20214c) == enumC19250a) {
                                return enumC19250a;
                            }
                            interfaceC1439n4 = interfaceC1439n3;
                            abstractC21955Q2 = abstractC21955Q1;
                            abstractC21955Q1 = abstractC21955Q2;
                            interfaceC1439n3 = interfaceC1439n4;
                            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                                c20214c.f63996Y = abstractC21955Q1;
                                c20214c.f63997Z = null;
                                c20214c.f64003t0 = 4;
                                if (interfaceC1439n3.invoke((AbstractC21933K1) abstractC21955Q1, c20214c) == enumC19250a) {
                                    return enumC19250a;
                                }
                            }
                        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                            c20214c.f63996Y = abstractC21955Q1;
                            c20214c.f63997Z = null;
                            c20214c.f64003t0 = 4;
                            if (interfaceC1439n3.invoke((AbstractC21933K1) abstractC21955Q1, c20214c) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    }
                } else if (abstractC6224C instanceof AbstractC6249w) {
                    c20214c.f63996Y = null;
                    c20214c.f63997Z = null;
                    c20214c.f63998o0 = null;
                    c20214c.f63999p0 = null;
                    c20214c.f64000q0 = null;
                    c20214c.f64003t0 = 5;
                    if (interfaceC1439n2.invoke((AbstractC6249w) abstractC6224C, c20214c) == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (!(abstractC6224C instanceof C6248v)) {
                    throw new C0644w();
                }
                return c17296c;
            case 2:
                interfaceC1439n3 = (InterfaceC1439n) c20214c.f63997Z;
                interfaceC1436k2 = (InterfaceC1436k) c20214c.f63996Y;
                AbstractC9233X.m9807c(objM7792b);
                abstractC21955Q1 = (AbstractC21955Q1) objM7792b;
                if (abstractC21955Q1 instanceof C21952P1) {
                    c20214c.f63996Y = interfaceC1439n3;
                    c20214c.f63997Z = abstractC21955Q1;
                    c20214c.f64003t0 = 3;
                    if (interfaceC1436k2.invoke(c20214c) == enumC19250a) {
                        return enumC19250a;
                    }
                    interfaceC1439n4 = interfaceC1439n3;
                    abstractC21955Q2 = abstractC21955Q1;
                    abstractC21955Q1 = abstractC21955Q2;
                    interfaceC1439n3 = interfaceC1439n4;
                    if (abstractC21955Q1 instanceof AbstractC21933K1) {
                        c20214c.f63996Y = abstractC21955Q1;
                        c20214c.f63997Z = null;
                        c20214c.f64003t0 = 4;
                        if (interfaceC1439n3.invoke((AbstractC21933K1) abstractC21955Q1, c20214c) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    c20214c.f63996Y = abstractC21955Q1;
                    c20214c.f63997Z = null;
                    c20214c.f64003t0 = 4;
                    if (interfaceC1439n3.invoke((AbstractC21933K1) abstractC21955Q1, c20214c) == enumC19250a) {
                        return enumC19250a;
                    }
                }
                return c17296c;
            case 3:
                abstractC21955Q2 = (AbstractC21955Q1) c20214c.f63997Z;
                interfaceC1439n4 = (InterfaceC1439n) c20214c.f63996Y;
                AbstractC9233X.m9807c(objM7792b);
                abstractC21955Q1 = abstractC21955Q2;
                interfaceC1439n3 = interfaceC1439n4;
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    c20214c.f63996Y = abstractC21955Q1;
                    c20214c.f63997Z = null;
                    c20214c.f64003t0 = 4;
                    if (interfaceC1439n3.invoke((AbstractC21933K1) abstractC21955Q1, c20214c) == enumC19250a) {
                        return enumC19250a;
                    }
                }
                return c17296c;
            case 4:
            case 5:
                AbstractC9233X.m9807c(objM7792b);
                return c17296c;
            case 6:
                AbstractC9233X.m9807c(objM7792b);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m21015b(String str, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2, AbstractC19687c abstractC19687c) throws Throwable {
        C20213b c20213b;
        AbstractC21955Q1 abstractC21955Q1;
        InterfaceC1439n interfaceC1439n3;
        if (abstractC19687c instanceof C20213b) {
            c20213b = (C20213b) abstractC19687c;
            int i10 = c20213b.f63995q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20213b.f63995q0 = i10 - Integer.MIN_VALUE;
            } else {
                c20213b = new C20213b(this, abstractC19687c);
            }
        } else {
            c20213b = new C20213b(this, abstractC19687c);
        }
        Object objM1168P = c20213b.f63993o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20213b.f63995q0;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC1439n2 = (InterfaceC1439n) c20213b.f63992Z;
                interfaceC1439n = (InterfaceC1439n) c20213b.f63991Y;
                AbstractC9233X.m9807c(objM1168P);
            } else if (i11 == 2) {
                abstractC21955Q1 = (AbstractC21955Q1) c20213b.f63992Z;
                interfaceC1439n3 = (InterfaceC1439n) c20213b.f63991Y;
                AbstractC9233X.m9807c(objM1168P);
                interfaceC1439n2 = interfaceC1439n3;
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    c20213b.f63991Y = abstractC21955Q1;
                    c20213b.f63992Z = null;
                    c20213b.f63995q0 = 3;
                    if (interfaceC1439n2.invoke((AbstractC21933K1) abstractC21955Q1, c20213b) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM1168P);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(objM1168P);
        c20213b.f63991Y = interfaceC1439n;
        c20213b.f63992Z = interfaceC1439n2;
        c20213b.f63995q0 = 1;
        C20945e c20945e = this.f64009a;
        C3516e c3516e = AbstractC0593T.f1824a;
        objM1168P = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C20943c(str, c20945e, null), c20213b);
        if (objM1168P == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = (AbstractC21955Q1) objM1168P;
        if (abstractC21955Q1 instanceof C21952P1) {
            Uri uri = (Uri) ((C21952P1) abstractC21955Q1).f69511a;
            c20213b.f63991Y = interfaceC1439n2;
            c20213b.f63992Z = abstractC21955Q1;
            c20213b.f63995q0 = 2;
            if (interfaceC1439n.invoke(uri, c20213b) == enumC19250a) {
                return enumC19250a;
            }
            interfaceC1439n3 = interfaceC1439n2;
            interfaceC1439n2 = interfaceC1439n3;
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                c20213b.f63991Y = abstractC21955Q1;
                c20213b.f63992Z = null;
                c20213b.f63995q0 = 3;
                if (interfaceC1439n2.invoke((AbstractC21933K1) abstractC21955Q1, c20213b) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            c20213b.f63991Y = abstractC21955Q1;
            c20213b.f63992Z = null;
            c20213b.f63995q0 = 3;
            if (interfaceC1439n2.invoke((AbstractC21933K1) abstractC21955Q1, c20213b) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
