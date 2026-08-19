package p925oe;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p016Ae.C0439a;
import p016Ae.C0452n;
import p025An.C0644w;
import p041Be.C1210C;
import p041Be.C1213F;
import p041Be.C1219L;
import p086D6.C1970n;
import p094De.C2029l;
import p103Dn.AbstractC2124C;
import p1111xl.C21296a;
import p1126yd.C21406A0;
import p1126yd.C21495r0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21941M1;
import p1155zi.C21952P1;
import p1155zi.C22011h0;
import p195Hh.C3430e;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p228J.AbstractC3794B0;
import p324Mn.C5551u;
import p364Oh.AbstractC6224C;
import p403Qd.C6636i;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C18077B {

    /* JADX INFO: renamed from: a */
    public final C0452n f57655a;

    /* JADX INFO: renamed from: b */
    public final C1219L f57656b;

    /* JADX INFO: renamed from: c */
    public final C2029l f57657c;

    /* JADX INFO: renamed from: d */
    public final C3430e f57658d = AbstractC8168p6.m8749b("ConversationRepository", null);

    public C18077B(C0452n c0452n, C1219L c1219l, C2029l c2029l) {
        this.f57655a = c0452n;
        this.f57656b = c1219l;
        this.f57657c = c2029l;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m19696a(C6636i c6636i, String str, boolean z6, AbstractC19687c abstractC19687c) throws Throwable {
        C18130s c18130s;
        C18077B c18077b;
        boolean z10;
        C18077B c18077b2;
        AbstractC21955Q1 abstractC21955Q1;
        AbstractC21955Q1 abstractC21955Q2;
        if (abstractC19687c instanceof C18130s) {
            c18130s = (C18130s) abstractC19687c;
            int i10 = c18130s.f57840s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18130s.f57840s0 = i10 - Integer.MIN_VALUE;
            } else {
                c18130s = new C18130s(this, abstractC19687c);
            }
        } else {
            c18130s = new C18130s(this, abstractC19687c);
        }
        Object objM1093a = c18130s.f57838q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18130s.f57840s0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM1093a);
            if (str != null) {
                c18130s.f57834Y = this;
                c18130s.f57835Z = c6636i;
                c18130s.f57836o0 = str;
                c18130s.f57837p0 = z6;
                c18130s.f57840s0 = 1;
                objM1093a = this.f57655a.m1093a(str, z6, c18130s);
                if (objM1093a == enumC19250a) {
                    return enumC19250a;
                }
                c18077b = this;
            } else {
                c18077b = this;
            }
            if (c6636i == null && str != null) {
                C1970n c1970nM3175d = c18077b.f57657c.m3175d(str);
                c18130s.f57834Y = c18077b;
                c18130s.f57835Z = null;
                c18130s.f57836o0 = null;
                c18130s.f57837p0 = z6;
                c18130s.f57840s0 = 2;
                objM1093a = AbstractC2124C.m3221t(c1970nM3175d, c18130s);
                if (objM1093a == enumC19250a) {
                    return enumC19250a;
                }
                z10 = z6;
                c18077b2 = c18077b;
                c18077b = c18077b2;
                z6 = z10;
                c6636i = (C6636i) objM1093a;
            }
            if (c6636i == null) {
                return new C21952P1(c17296c);
            }
            if (z6) {
                C2029l c2029l = c18077b.f57657c;
                c18130s.f57834Y = null;
                c18130s.f57835Z = null;
                c18130s.f57836o0 = null;
                c18130s.f57840s0 = 3;
                objM1093a = c2029l.m3173b(c6636i, c18130s);
                if (objM1093a == enumC19250a) {
                    return enumC19250a;
                }
                abstractC21955Q1 = (AbstractC21955Q1) objM1093a;
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    return (AbstractC21933K1) abstractC21955Q1;
                }
                return new C21952P1(c17296c);
            }
            C2029l c2029l2 = c18077b.f57657c;
            c18130s.f57834Y = null;
            c18130s.f57835Z = null;
            c18130s.f57836o0 = null;
            c18130s.f57840s0 = 4;
            objM1093a = c2029l2.m3176e(c6636i, true, c18130s);
            if (objM1093a == enumC19250a) {
                return enumC19250a;
            }
            abstractC21955Q2 = (AbstractC21955Q1) objM1093a;
            if (abstractC21955Q2 instanceof AbstractC21933K1) {
                return (AbstractC21933K1) abstractC21955Q2;
            }
            return new C21952P1(c17296c);
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    AbstractC9233X.m9807c(objM1093a);
                    abstractC21955Q1 = (AbstractC21955Q1) objM1093a;
                    if (abstractC21955Q1 instanceof AbstractC21933K1) {
                        return (AbstractC21933K1) abstractC21955Q1;
                    }
                    return new C21952P1(c17296c);
                }
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM1093a);
                abstractC21955Q2 = (AbstractC21955Q1) objM1093a;
                if (abstractC21955Q2 instanceof AbstractC21933K1) {
                    return (AbstractC21933K1) abstractC21955Q2;
                }
                return new C21952P1(c17296c);
            }
            z10 = c18130s.f57837p0;
            c18077b2 = c18130s.f57834Y;
            AbstractC9233X.m9807c(objM1093a);
            c18077b = c18077b2;
            z6 = z10;
            c6636i = (C6636i) objM1093a;
            if (c6636i == null) {
                return new C21952P1(c17296c);
            }
            if (z6) {
                C2029l c2029l3 = c18077b.f57657c;
                c18130s.f57834Y = null;
                c18130s.f57835Z = null;
                c18130s.f57836o0 = null;
                c18130s.f57840s0 = 3;
                objM1093a = c2029l3.m3173b(c6636i, c18130s);
                if (objM1093a == enumC19250a) {
                    return enumC19250a;
                }
                abstractC21955Q1 = (AbstractC21955Q1) objM1093a;
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    return (AbstractC21933K1) abstractC21955Q1;
                }
                return new C21952P1(c17296c);
            }
            C2029l c2029l4 = c18077b.f57657c;
            c18130s.f57834Y = null;
            c18130s.f57835Z = null;
            c18130s.f57836o0 = null;
            c18130s.f57840s0 = 4;
            objM1093a = c2029l4.m3176e(c6636i, true, c18130s);
            if (objM1093a == enumC19250a) {
                return enumC19250a;
            }
            abstractC21955Q2 = (AbstractC21955Q1) objM1093a;
            if (abstractC21955Q2 instanceof AbstractC21933K1) {
                return (AbstractC21933K1) abstractC21955Q2;
            }
            return new C21952P1(c17296c);
        }
        z6 = c18130s.f57837p0;
        str = c18130s.f57836o0;
        c6636i = c18130s.f57835Z;
        c18077b = c18130s.f57834Y;
        AbstractC9233X.m9807c(objM1093a);
        AbstractC21955Q1 abstractC21955Q3 = (AbstractC21955Q1) objM1093a;
        if (abstractC21955Q3 instanceof AbstractC21933K1) {
            return (AbstractC21933K1) abstractC21955Q3;
        }
        if (c6636i == null) {
            C1970n c1970nM3175d2 = c18077b.f57657c.m3175d(str);
            c18130s.f57834Y = c18077b;
            c18130s.f57835Z = null;
            c18130s.f57836o0 = null;
            c18130s.f57837p0 = z6;
            c18130s.f57840s0 = 2;
            objM1093a = AbstractC2124C.m3221t(c1970nM3175d2, c18130s);
            if (objM1093a == enumC19250a) {
                return enumC19250a;
            }
            z10 = z6;
            c18077b2 = c18077b;
            c18077b = c18077b2;
            z6 = z10;
            c6636i = (C6636i) objM1093a;
        }
        if (c6636i == null) {
            return new C21952P1(c17296c);
        }
        if (z6) {
            C2029l c2029l5 = c18077b.f57657c;
            c18130s.f57834Y = null;
            c18130s.f57835Z = null;
            c18130s.f57836o0 = null;
            c18130s.f57840s0 = 3;
            objM1093a = c2029l5.m3173b(c6636i, c18130s);
            if (objM1093a == enumC19250a) {
                return enumC19250a;
            }
            abstractC21955Q1 = (AbstractC21955Q1) objM1093a;
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                return (AbstractC21933K1) abstractC21955Q1;
            }
            return new C21952P1(c17296c);
        }
        C2029l c2029l6 = c18077b.f57657c;
        c18130s.f57834Y = null;
        c18130s.f57835Z = null;
        c18130s.f57836o0 = null;
        c18130s.f57840s0 = 4;
        objM1093a = c2029l6.m3176e(c6636i, true, c18130s);
        if (objM1093a == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q2 = (AbstractC21955Q1) objM1093a;
        if (abstractC21955Q2 instanceof AbstractC21933K1) {
            return (AbstractC21933K1) abstractC21955Q2;
        }
        return new C21952P1(c17296c);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m19698c(String str, AbstractC19687c abstractC19687c) {
        C18132u c18132u;
        C18077B c18077b;
        AbstractC21955Q1 abstractC21955Q1;
        AbstractC21955Q1 abstractC21955Q2;
        if (abstractC19687c instanceof C18132u) {
            c18132u = (C18132u) abstractC19687c;
            int i10 = c18132u.f57850p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18132u.f57850p0 = i10 - Integer.MIN_VALUE;
            } else {
                c18132u = new C18132u(this, abstractC19687c);
            }
        } else {
            c18132u = new C18132u(this, abstractC19687c);
        }
        Object objM1098f = c18132u.f57848Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18132u.f57850p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c18077b = (C18077B) c18132u.f57847Y;
                AbstractC9233X.m9807c(objM1098f);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q2 = (AbstractC21955Q1) c18132u.f57847Y;
                AbstractC9233X.m9807c(objM1098f);
            }
            abstractC21955Q1 = abstractC21955Q2;
            if (abstractC21955Q1 instanceof C21952P1) {
                return new C21952P1(C17296C.f55119a);
            }
            if ((abstractC21955Q1 instanceof C21929J1) && !(abstractC21955Q1 instanceof AbstractC21933K1)) {
                throw new C0644w();
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM1098f);
        c18132u.f57847Y = this;
        c18132u.f57850p0 = 1;
        objM1098f = this.f57655a.m1098f(str, str, c18132u);
        if (objM1098f == enumC19250a) {
            return enumC19250a;
        }
        c18077b = this;
        abstractC21955Q1 = (AbstractC21955Q1) objM1098f;
        if (abstractC21955Q1 instanceof C21952P1) {
            C6636i c6636i = (C6636i) ((C21952P1) abstractC21955Q1).f69511a;
            C2029l c2029l = c18077b.f57657c;
            c18132u.f57847Y = abstractC21955Q1;
            c18132u.f57850p0 = 2;
            if (c2029l.m3176e(c6636i, true, c18132u) == enumC19250a) {
                return enumC19250a;
            }
            abstractC21955Q2 = abstractC21955Q1;
            abstractC21955Q1 = abstractC21955Q2;
        }
        if (abstractC21955Q1 instanceof C21952P1) {
            return new C21952P1(C17296C.f55119a);
        }
        if (abstractC21955Q1 instanceof C21929J1) {
            return abstractC21955Q1;
        }
        throw new C0644w();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d */
    public final Object m19699d(String str, String str2, AbstractC19687c abstractC19687c) {
        C18133v c18133v;
        C18077B c18077b;
        AbstractC21955Q1 abstractC21955Q1;
        Object objM3221t;
        String str3;
        C21495r0 c21495r0;
        C6636i c6636i;
        C2029l c2029l;
        C6636i c6636iM7162a;
        AbstractC21955Q1 abstractC21955Q2;
        String str4 = str;
        if (abstractC19687c instanceof C18133v) {
            c18133v = (C18133v) abstractC19687c;
            int i10 = c18133v.f57857s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18133v.f57857s0 = i10 - Integer.MIN_VALUE;
            } else {
                c18133v = new C18133v(this, abstractC19687c);
            }
        } else {
            c18133v = new C18133v(this, abstractC19687c);
        }
        Object objM1101i = c18133v.f57855q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18133v.f57857s0;
        if (i11 != 0) {
            if (i11 == 1) {
                str4 = c18133v.f57852Z;
                C18077B c18077b2 = (C18077B) c18133v.f57851Y;
                AbstractC9233X.m9807c(objM1101i);
                c18077b = c18077b2;
            } else {
                if (i11 == 2) {
                    c21495r0 = c18133v.f57854p0;
                    C21952P1 c21952p1 = c18133v.f57853o0;
                    String str5 = c18133v.f57852Z;
                    c18077b = (C18077B) c18133v.f57851Y;
                    AbstractC9233X.m9807c(objM1101i);
                    objM3221t = objM1101i;
                    abstractC21955Q1 = c21952p1;
                    str3 = str5;
                    c6636i = (C6636i) objM3221t;
                    if (c6636i != null) {
                        c2029l = c18077b.f57657c;
                        C5551u.Companion.getClass();
                        c6636iM7162a = C6636i.m7162a(c6636i, null, null, new C5551u(AbstractC3794B0.m4501z("instant(...)")), null, c21495r0.f68108a, null, null, null, null, null, null, null, false, null, null, 2097111);
                        c18133v.f57851Y = abstractC21955Q1;
                        c18133v.f57852Z = null;
                        c18133v.f57853o0 = null;
                        c18133v.f57854p0 = null;
                        c18133v.f57857s0 = 3;
                        if (c2029l.m3176e(c6636iM7162a, true, c18133v) == enumC19250a) {
                            return enumC19250a;
                        }
                        abstractC21955Q2 = abstractC21955Q1;
                    } else {
                        AbstractC8160o6.m8728c(c18077b.f57658d, AbstractC9306j0.m9889h("Conversation is missing in the cache: ", C22011h0.m22343a(str3)), null, null, 6);
                    }
                    if (abstractC21955Q1 instanceof C21952P1) {
                        return new C21952P1(C17296C.f55119a);
                    }
                    if ((abstractC21955Q1 instanceof C21929J1) && !(abstractC21955Q1 instanceof AbstractC21933K1)) {
                        throw new C0644w();
                    }
                    return abstractC21955Q1;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q2 = (AbstractC21955Q1) c18133v.f57851Y;
                AbstractC9233X.m9807c(objM1101i);
            }
            abstractC21955Q1 = abstractC21955Q2;
            if (abstractC21955Q1 instanceof C21952P1) {
                return new C21952P1(C17296C.f55119a);
            }
            if (abstractC21955Q1 instanceof C21929J1) {
                return abstractC21955Q1;
            }
            throw new C0644w();
        }
        AbstractC9233X.m9807c(objM1101i);
        c18133v.f57851Y = this;
        c18133v.f57852Z = str4;
        c18133v.f57857s0 = 1;
        objM1101i = this.f57655a.m1101i(str4, str2, c18133v);
        if (objM1101i == enumC19250a) {
            return enumC19250a;
        }
        c18077b = this;
        abstractC21955Q1 = (AbstractC21955Q1) objM1101i;
        if (abstractC21955Q1 instanceof C21952P1) {
            C21495r0 c21495r1 = (C21495r0) ((C21952P1) abstractC21955Q1).f69511a;
            if (c21495r1.f68108a != null) {
                C1970n c1970nM3175d = c18077b.f57657c.m3175d(str4);
                c18133v.f57851Y = c18077b;
                c18133v.f57852Z = str4;
                c18133v.f57853o0 = (C21952P1) abstractC21955Q1;
                c18133v.f57854p0 = c21495r1;
                c18133v.f57857s0 = 2;
                objM3221t = AbstractC2124C.m3221t(c1970nM3175d, c18133v);
                if (objM3221t == enumC19250a) {
                    return enumC19250a;
                }
                str3 = str4;
                c21495r0 = c21495r1;
                c6636i = (C6636i) objM3221t;
                if (c6636i != null) {
                    c2029l = c18077b.f57657c;
                    C5551u.Companion.getClass();
                    c6636iM7162a = C6636i.m7162a(c6636i, null, null, new C5551u(AbstractC3794B0.m4501z("instant(...)")), null, c21495r0.f68108a, null, null, null, null, null, null, null, false, null, null, 2097111);
                    c18133v.f57851Y = abstractC21955Q1;
                    c18133v.f57852Z = null;
                    c18133v.f57853o0 = null;
                    c18133v.f57854p0 = null;
                    c18133v.f57857s0 = 3;
                    if (c2029l.m3176e(c6636iM7162a, true, c18133v) == enumC19250a) {
                        return enumC19250a;
                    }
                    abstractC21955Q2 = abstractC21955Q1;
                    abstractC21955Q1 = abstractC21955Q2;
                } else {
                    AbstractC8160o6.m8728c(c18077b.f57658d, AbstractC9306j0.m9889h("Conversation is missing in the cache: ", C22011h0.m22343a(str3)), null, null, 6);
                }
            } else {
                String str6 = c21495r1.f68109b;
                if (str6 != null) {
                    AbstractC8160o6.m8726a(c18077b.f57658d, "Title generation message: ".concat(str6), null, 6);
                }
            }
        }
        if (abstractC21955Q1 instanceof C21952P1) {
            return new C21952P1(C17296C.f55119a);
        }
        if (abstractC21955Q1 instanceof C21929J1) {
            return abstractC21955Q1;
        }
        throw new C0644w();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: e */
    public final Object m19700e(C6636i c6636i, AbstractC19687c abstractC19687c) {
        C18134w c18134w;
        InterfaceC3777y interfaceC3777yM18075c;
        C18077B c18077b;
        C6636i c6636i2 = c6636i;
        if (abstractC19687c instanceof C18134w) {
            c18134w = (C18134w) abstractC19687c;
            int i10 = c18134w.f57862q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18134w.f57862q0 = i10 - Integer.MIN_VALUE;
            } else {
                c18134w = new C18134w(this, abstractC19687c);
            }
        } else {
            c18134w = new C18134w(this, abstractC19687c);
        }
        Object objM9690b = c18134w.f57860o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18134w.f57862q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            String str = c6636i2.f21379a;
            c18134w.f57858Y = this;
            c18134w.f57859Z = c6636i2;
            c18134w.f57862q0 = 1;
            C1219L c1219l = this.f57656b;
            C1210C c1210c = new C1210C(str, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            objM9690b = AbstractC9144I.m9690b(c1219l.f3217b, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c1210c, c18134w);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
            c18077b = this;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) c18134w.f57858Y;
                AbstractC9233X.m9807c(objM9690b);
                return abstractC21955Q1;
            }
            c6636i2 = c18134w.f57859Z;
            c18077b = (C18077B) c18134w.f57858Y;
            AbstractC9233X.m9807c(objM9690b);
        }
        C6636i c6636i3 = c6636i2;
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) objM9690b).m6735b();
        if (!(abstractC21955Q1M6735b instanceof C21952P1)) {
            return abstractC21955Q1M6735b;
        }
        C2029l c2029l = c18077b.f57657c;
        C6636i c6636iM7162a = C6636i.m7162a(c6636i3, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 2080767);
        c18134w.f57858Y = abstractC21955Q1M6735b;
        c18134w.f57859Z = null;
        c18134w.f57862q0 = 2;
        return c2029l.m3176e(c6636iM7162a, true, c18134w) == enumC19250a ? enumC19250a : abstractC21955Q1M6735b;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: f */
    public final Object m19701f(String str, String str2, AbstractC19687c abstractC19687c) {
        C18135x c18135x;
        C18077B c18077b;
        AbstractC21955Q1 abstractC21955Q1;
        String str3;
        AbstractC21955Q1 abstractC21955Q2;
        C6636i c6636i;
        C2029l c2029l;
        C6636i c6636iM7162a;
        String str4 = str;
        String str5 = str2;
        if (abstractC19687c instanceof C18135x) {
            c18135x = (C18135x) abstractC19687c;
            int i10 = c18135x.f57868r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18135x.f57868r0 = i10 - Integer.MIN_VALUE;
            } else {
                c18135x = new C18135x(this, abstractC19687c);
            }
        } else {
            c18135x = new C18135x(this, abstractC19687c);
        }
        Object objM1102j = c18135x.f57866p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18135x.f57868r0;
        if (i11 != 0) {
            if (i11 == 1) {
                String str6 = (String) c18135x.f57865o0;
                String str7 = c18135x.f57864Z;
                c18077b = (C18077B) c18135x.f57863Y;
                AbstractC9233X.m9807c(objM1102j);
                str5 = str6;
                str4 = str7;
            } else if (i11 == 2) {
                abstractC21955Q2 = (AbstractC21955Q1) c18135x.f57865o0;
                String str8 = c18135x.f57864Z;
                c18077b = (C18077B) c18135x.f57863Y;
                AbstractC9233X.m9807c(objM1102j);
                str3 = str8;
                c6636i = (C6636i) objM1102j;
                if (c6636i != null) {
                    c2029l = c18077b.f57657c;
                    c6636iM7162a = C6636i.m7162a(c6636i, null, null, null, null, null, null, null, null, str3, null, null, null, false, null, null, 2096127);
                    c18135x.f57863Y = abstractC21955Q2;
                    c18135x.f57864Z = null;
                    c18135x.f57865o0 = null;
                    c18135x.f57868r0 = 3;
                    if (c2029l.m3176e(c6636iM7162a, true, c18135x) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q2 = (AbstractC21955Q1) c18135x.f57863Y;
                AbstractC9233X.m9807c(objM1102j);
            }
            abstractC21955Q1 = abstractC21955Q2;
            if (abstractC21955Q1 instanceof C21952P1) {
                return new C21952P1(C17296C.f55119a);
            }
            if ((abstractC21955Q1 instanceof C21929J1) && !(abstractC21955Q1 instanceof AbstractC21933K1)) {
                throw new C0644w();
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM1102j);
        c18135x.f57863Y = this;
        c18135x.f57864Z = str4;
        c18135x.f57865o0 = str5;
        c18135x.f57868r0 = 1;
        objM1102j = this.f57655a.m1102j(str4, str5, c18135x);
        if (objM1102j == enumC19250a) {
            return enumC19250a;
        }
        c18077b = this;
        abstractC21955Q1 = (AbstractC21955Q1) objM1102j;
        if (abstractC21955Q1 instanceof C21952P1) {
            C1970n c1970nM3175d = c18077b.f57657c.m3175d(str4);
            c18135x.f57863Y = c18077b;
            c18135x.f57864Z = str5;
            c18135x.f57865o0 = abstractC21955Q1;
            c18135x.f57868r0 = 2;
            Object objM3221t = AbstractC2124C.m3221t(c1970nM3175d, c18135x);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            str3 = str5;
            objM1102j = objM3221t;
            abstractC21955Q2 = abstractC21955Q1;
            c6636i = (C6636i) objM1102j;
            if (c6636i != null) {
                c2029l = c18077b.f57657c;
                c6636iM7162a = C6636i.m7162a(c6636i, null, null, null, null, null, null, null, null, str3, null, null, null, false, null, null, 2096127);
                c18135x.f57863Y = abstractC21955Q2;
                c18135x.f57864Z = null;
                c18135x.f57865o0 = null;
                c18135x.f57868r0 = 3;
                if (c2029l.m3176e(c6636iM7162a, true, c18135x) == enumC19250a) {
                    return enumC19250a;
                }
            }
            abstractC21955Q1 = abstractC21955Q2;
        }
        if (abstractC21955Q1 instanceof C21952P1) {
            return new C21952P1(C17296C.f55119a);
        }
        if (abstractC21955Q1 instanceof C21929J1) {
            return abstractC21955Q1;
        }
        throw new C0644w();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m19702g(C21406A0 c21406a0, AbstractC19687c abstractC19687c) {
        C18136y c18136y;
        if (abstractC19687c instanceof C18136y) {
            c18136y = (C18136y) abstractC19687c;
            int i10 = c18136y.f57871o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18136y.f57871o0 = i10 - Integer.MIN_VALUE;
            } else {
                c18136y = new C18136y(this, abstractC19687c);
            }
        } else {
            c18136y = new C18136y(this, abstractC19687c);
        }
        Object objM9690b = c18136y.f57869Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18136y.f57871o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            c18136y.f57871o0 = 1;
            C1219L c1219l = this.f57656b;
            InterfaceC3777y interfaceC3777yM18075c = null;
            C1213F c1213f = new C1213F(c21406a0, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
            } catch (Throwable unused) {
            }
            objM9690b = AbstractC9144I.m9690b(c1219l.f3217b, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c1213f, c18136y);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM9690b);
        }
        return ((AbstractC6224C) objM9690b).m6735b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: h */
    public final Object m19703h(C6636i c6636i, String str, AbstractC19687c abstractC19687c) throws Throwable {
        C18137z c18137z;
        if (abstractC19687c instanceof C18137z) {
            c18137z = (C18137z) abstractC19687c;
            int i10 = c18137z.f57874o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18137z.f57874o0 = i10 - Integer.MIN_VALUE;
            } else {
                c18137z = new C18137z(this, abstractC19687c);
            }
        } else {
            c18137z = new C18137z(this, abstractC19687c);
        }
        Object objM3176e = c18137z.f57872Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18137z.f57874o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3176e);
            C5551u.Companion.getClass();
            C6636i c6636iM7162a = C6636i.m7162a(c6636i, null, null, new C5551u(AbstractC3794B0.m4501z("instant(...)")), null, str, null, null, null, null, null, null, null, false, null, null, 2097111);
            c18137z.f57874o0 = 1;
            objM3176e = this.f57657c.m3176e(c6636iM7162a, true, c18137z);
            if (objM3176e == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM3176e);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM3176e;
        if (abstractC21955Q1 instanceof C21952P1) {
            ((C22011h0) ((C21952P1) abstractC21955Q1).f69511a).getClass();
            return new C21952P1(C17296C.f55119a);
        }
        if ((abstractC21955Q1 instanceof C21929J1) || (abstractC21955Q1 instanceof AbstractC21933K1)) {
            return abstractC21955Q1;
        }
        throw new C0644w();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m19704i(String str, String str2, AbstractC19687c abstractC19687c) throws Throwable {
        C18076A c18076a;
        Object obj;
        String str3;
        C18077B c18077b;
        String str4;
        C6636i c6636i;
        if (abstractC19687c instanceof C18076A) {
            c18076a = (C18076A) abstractC19687c;
            int i10 = c18076a.f57654r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18076a.f57654r0 = i10 - Integer.MIN_VALUE;
            } else {
                c18076a = new C18076A(this, abstractC19687c);
            }
        } else {
            c18076a = new C18076A(this, abstractC19687c);
        }
        Object objM19703h = c18076a.f57652p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18076a.f57654r0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                String str5 = c18076a.f57651o0;
                str = c18076a.f57650Z;
                C18077B c18077b2 = c18076a.f57649Y;
                AbstractC9233X.m9807c(objM19703h);
                str3 = str5;
                c18077b = c18077b2;
                obj = objM19703h;
            } else if (i11 == 2) {
                str4 = c18076a.f57650Z;
                c18077b = c18076a.f57649Y;
                AbstractC9233X.m9807c(objM19703h);
                c6636i = (C6636i) objM19703h;
                if (c6636i == null) {
                    return new C21952P1(c17296c);
                }
                c18076a.f57649Y = null;
                c18076a.f57650Z = null;
                c18076a.f57654r0 = 3;
                objM19703h = c18077b.m19703h(c6636i, str4, c18076a);
                if (objM19703h == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM19703h);
            }
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19703h;
            return abstractC21955Q1 instanceof AbstractC21933K1 ? (AbstractC21933K1) abstractC21955Q1 : new C21952P1(c17296c);
        }
        AbstractC9233X.m9807c(objM19703h);
        if (str == null) {
            return new C21941M1(new C0439a("Conversation has no remoteId"));
        }
        c18076a.f57649Y = this;
        c18076a.f57650Z = str;
        c18076a.f57651o0 = str2;
        c18076a.f57654r0 = 1;
        Object objM1104l = this.f57655a.m1104l(str, str2, c18076a);
        if (objM1104l == enumC19250a) {
            return enumC19250a;
        }
        obj = objM1104l;
        str3 = str2;
        c18077b = this;
        AbstractC21955Q1 abstractC21955Q2 = (AbstractC21955Q1) obj;
        if (abstractC21955Q2 instanceof AbstractC21933K1) {
            return (AbstractC21933K1) abstractC21955Q2;
        }
        C1970n c1970nM3175d = c18077b.f57657c.m3175d(str);
        c18076a.f57649Y = c18077b;
        c18076a.f57650Z = str3;
        c18076a.f57651o0 = null;
        c18076a.f57654r0 = 2;
        Object objM3221t = AbstractC2124C.m3221t(c1970nM3175d, c18076a);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        String str6 = str3;
        objM19703h = objM3221t;
        str4 = str6;
        c6636i = (C6636i) objM19703h;
        if (c6636i == null) {
            return new C21952P1(c17296c);
        }
        c18076a.f57649Y = null;
        c18076a.f57650Z = null;
        c18076a.f57654r0 = 3;
        objM19703h = c18077b.m19703h(c6636i, str4, c18076a);
        if (objM19703h == enumC19250a) {
            return enumC19250a;
        }
        AbstractC21955Q1 abstractC21955Q3 = (AbstractC21955Q1) objM19703h;
        if (abstractC21955Q3 instanceof AbstractC21933K1) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m19697b(C6636i c6636i, String str, AbstractC19687c abstractC19687c) {
        C18131t c18131t;
        C18077B c18077b;
        C18077B c18077b2;
        if (abstractC19687c instanceof C18131t) {
            c18131t = (C18131t) abstractC19687c;
            int i10 = c18131t.f57846r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18131t.f57846r0 = i10 - Integer.MIN_VALUE;
            } else {
                c18131t = new C18131t(this, abstractC19687c);
            }
        } else {
            c18131t = new C18131t(this, abstractC19687c);
        }
        Object objM1096d = c18131t.f57844p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18131t.f57846r0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                str = c18131t.f57843o0;
                c6636i = c18131t.f57842Z;
                c18077b = c18131t.f57841Y;
                AbstractC9233X.m9807c(objM1096d);
            } else if (i11 == 2) {
                c18077b2 = c18131t.f57841Y;
                AbstractC9233X.m9807c(objM1096d);
                c18077b = c18077b2;
                c6636i = (C6636i) objM1096d;
                if (c6636i == null) {
                    return new C21952P1(c17296c);
                }
                C2029l c2029l = c18077b.f57657c;
                c18131t.f57841Y = null;
                c18131t.f57842Z = null;
                c18131t.f57843o0 = null;
                c18131t.f57846r0 = 3;
                objM1096d = c2029l.m3173b(c6636i, c18131t);
                if (objM1096d == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException(tpXhEMGxfXFVSh.CtnFmCEgIUEDZo);
                }
                AbstractC9233X.m9807c(objM1096d);
            }
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM1096d;
            return abstractC21955Q1 instanceof AbstractC21933K1 ? (AbstractC21933K1) abstractC21955Q1 : new C21952P1(c17296c);
        }
        AbstractC9233X.m9807c(objM1096d);
        if (str != null) {
            c18131t.f57841Y = this;
            c18131t.f57842Z = c6636i;
            c18131t.f57843o0 = str;
            c18131t.f57846r0 = 1;
            objM1096d = this.f57655a.m1096d(str, c18131t);
            if (objM1096d == enumC19250a) {
                return enumC19250a;
            }
            c18077b = this;
        } else {
            c18077b = this;
        }
        if (c6636i == null && str != null) {
            C1970n c1970nM3175d = c18077b.f57657c.m3175d(str);
            c18131t.f57841Y = c18077b;
            c18131t.f57842Z = null;
            c18131t.f57843o0 = null;
            c18131t.f57846r0 = 2;
            objM1096d = AbstractC2124C.m3221t(c1970nM3175d, c18131t);
            if (objM1096d == enumC19250a) {
                return enumC19250a;
            }
            c18077b2 = c18077b;
            c18077b = c18077b2;
            c6636i = (C6636i) objM1096d;
        }
        if (c6636i == null) {
            return new C21952P1(c17296c);
        }
        C2029l c2029l2 = c18077b.f57657c;
        c18131t.f57841Y = null;
        c18131t.f57842Z = null;
        c18131t.f57843o0 = null;
        c18131t.f57846r0 = 3;
        objM1096d = c2029l2.m3173b(c6636i, c18131t);
        if (objM1096d == enumC19250a) {
            return enumC19250a;
        }
        AbstractC21955Q1 abstractC21955Q2 = (AbstractC21955Q1) objM1096d;
        if (abstractC21955Q2 instanceof AbstractC21933K1) {
        }
        AbstractC21955Q1 abstractC21955Q3 = (AbstractC21955Q1) objM1096d;
        if (abstractC21955Q3 instanceof AbstractC21933K1) {
            return (AbstractC21933K1) abstractC21955Q3;
        }
        if (c6636i == null) {
            C1970n c1970nM3175d2 = c18077b.f57657c.m3175d(str);
            c18131t.f57841Y = c18077b;
            c18131t.f57842Z = null;
            c18131t.f57843o0 = null;
            c18131t.f57846r0 = 2;
            objM1096d = AbstractC2124C.m3221t(c1970nM3175d2, c18131t);
            if (objM1096d == enumC19250a) {
                return enumC19250a;
            }
            c18077b2 = c18077b;
            c18077b = c18077b2;
            c6636i = (C6636i) objM1096d;
        }
        if (c6636i == null) {
            return new C21952P1(c17296c);
        }
        C2029l c2029l3 = c18077b.f57657c;
        c18131t.f57841Y = null;
        c18131t.f57842Z = null;
        c18131t.f57843o0 = null;
        c18131t.f57846r0 = 3;
        objM1096d = c2029l3.m3173b(c6636i, c18131t);
        if (objM1096d == enumC19250a) {
            return enumC19250a;
        }
        AbstractC21955Q1 abstractC21955Q4 = (AbstractC21955Q1) objM1096d;
        if (abstractC21955Q4 instanceof AbstractC21933K1) {
        }
    }
}
