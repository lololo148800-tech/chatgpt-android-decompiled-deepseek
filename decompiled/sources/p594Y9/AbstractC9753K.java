package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11111t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p001A.AbstractC0010F;
import p007A5.C0368c;
import p025An.C0624m;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p496U5.C7563e;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9382v4;
import p571X9.AbstractC9388w4;
import p919o8.AbstractC17962d;
import p919o8.C17947X;
import p919o8.C17957b0;
import p919o8.C17969f0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Y9.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9753K {
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m10354a(AbstractC11105n abstractC11105n, AbstractC19687c abstractC19687c) throws Throwable {
        C7563e c7563e;
        AbstractC11105n abstractC11105n2;
        C16525B c16525b;
        Throwable th2;
        InterfaceC11111t interfaceC11111t;
        InterfaceC11111t interfaceC11111t2;
        if (abstractC19687c instanceof C7563e) {
            c7563e = (C7563e) abstractC19687c;
            int i10 = c7563e.f23966p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7563e.f23966p0 = i10 - Integer.MIN_VALUE;
            } else {
                c7563e = new C7563e(abstractC19687c);
            }
        } else {
            c7563e = new C7563e(abstractC19687c);
        }
        Object obj = c7563e.f23965o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7563e.f23966p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16525b = c7563e.f23964Z;
            abstractC11105n2 = c7563e.f23963Y;
            try {
                AbstractC9233X.m9807c(obj);
                interfaceC11111t2 = (InterfaceC11111t) c16525b.f51262Y;
                if (interfaceC11111t2 != null) {
                    abstractC11105n2.mo7808c(interfaceC11111t2);
                }
                return c17296c;
            } catch (Throwable th3) {
                th2 = th3;
                interfaceC11111t = (InterfaceC11111t) c16525b.f51262Y;
                if (interfaceC11111t != null) {
                    abstractC11105n2.mo7808c(interfaceC11111t);
                }
                throw th2;
            }
        }
        AbstractC9233X.m9807c(obj);
        if (abstractC11105n.mo7807b().compareTo(EnumC11104m.f33477p0) >= 0) {
            return c17296c;
        }
        C16525B c16525b2 = new C16525B();
        try {
            c7563e.f23963Y = abstractC11105n;
            c7563e.f23964Z = c16525b2;
            c7563e.f23966p0 = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c7563e));
            c0624m.m1262r();
            C0368c c0368c = new C0368c(c0624m, 1);
            c16525b2.f51262Y = c0368c;
            abstractC11105n.mo7806a(c0368c);
            if (c0624m.m1261q() == enumC19250a) {
                return enumC19250a;
            }
            abstractC11105n2 = abstractC11105n;
            c16525b = c16525b2;
            interfaceC11111t2 = (InterfaceC11111t) c16525b.f51262Y;
            if (interfaceC11111t2 != null) {
                abstractC11105n2.mo7808c(interfaceC11111t2);
            }
            return c17296c;
        } catch (Throwable th4) {
            abstractC11105n2 = abstractC11105n;
            c16525b = c16525b2;
            th2 = th4;
            interfaceC11111t = (InterfaceC11111t) c16525b.f51262Y;
            if (interfaceC11111t != null) {
                abstractC11105n2.mo7808c(interfaceC11111t);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17947X m10355b(C3676s c3676s) {
        String str;
        String strMo4384r;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String strMo4384r2;
        String strMo4384r3;
        String strMo4384r4;
        String str2 = "Unable to parse json into type Error";
        try {
            try {
                AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(ParameterNames.f31999ID);
                if (abstractC3673pM4395w != null) {
                    try {
                        strMo4384r = abstractC3673pM4395w.mo4384r();
                    } catch (IllegalStateException e10) {
                        e = e10;
                    } catch (NumberFormatException e11) {
                        e = e11;
                        throw new C3677t(str2, e);
                    }
                } else {
                    strMo4384r = null;
                }
                String message = c3676s.m4395w("message").mo4384r();
                String strMo4384r5 = c3676s.m4395w("source").mo4384r();
                AbstractC16544l.m18093f(strMo4384r5, "jsonObject.get(\"source\").asString");
                try {
                    for (int i13 : AbstractC0010F.m27k(8)) {
                        if (AbstractC17962d.m19644e(i13).equals(strMo4384r5)) {
                            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("stack");
                            String strMo4384r6 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
                            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("causes");
                            if (abstractC3673pM4395w3 != null) {
                                ArrayList arrayList4 = abstractC3673pM4395w3.m4389j().f11172Y;
                                ArrayList arrayList5 = new ArrayList(arrayList4.size());
                                Iterator it = arrayList4.iterator();
                                while (it.hasNext()) {
                                    arrayList5.add(AbstractC9388w4.m9967j(((AbstractC3673p) it.next()).m4390m()));
                                }
                                arrayList = arrayList5;
                            } else {
                                arrayList = null;
                            }
                            AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("is_crash");
                            Boolean boolValueOf = abstractC3673pM4395w4 != null ? Boolean.valueOf(abstractC3673pM4395w4.mo4380f()) : null;
                            AbstractC3673p abstractC3673pM4395w5 = c3676s.m4395w("fingerprint");
                            String strMo4384r7 = abstractC3673pM4395w5 != null ? abstractC3673pM4395w5.mo4384r() : null;
                            AbstractC3673p abstractC3673pM4395w6 = c3676s.m4395w("type");
                            String strMo4384r8 = abstractC3673pM4395w6 != null ? abstractC3673pM4395w6.mo4384r() : null;
                            AbstractC3673p abstractC3673pM4395w7 = c3676s.m4395w("category");
                            if (abstractC3673pM4395w7 == null || (strMo4384r4 = abstractC3673pM4395w7.mo4384r()) == null) {
                                i10 = 0;
                            } else {
                                int[] iArrM27k = AbstractC0010F.m27k(5);
                                int length = iArrM27k.length;
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= length) {
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                    i10 = iArrM27k[i14];
                                    int i15 = length;
                                    if (AbstractC17962d.m19612C(i10).equals(strMo4384r4)) {
                                        break;
                                    }
                                    i14++;
                                    length = i15;
                                }
                            }
                            AbstractC3673p abstractC3673pM4395w8 = c3676s.m4395w(ParameterNames.HANDLING);
                            if (abstractC3673pM4395w8 == null || (strMo4384r3 = abstractC3673pM4395w8.mo4384r()) == null) {
                                i11 = 0;
                            } else {
                                int[] iArrM27k2 = AbstractC0010F.m27k(2);
                                int length2 = iArrM27k2.length;
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= length2) {
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                    i11 = iArrM27k2[i16];
                                    int[] iArr = iArrM27k2;
                                    if (AbstractC17962d.m19645f(i11).equals(strMo4384r3)) {
                                        break;
                                    }
                                    i16++;
                                    iArrM27k2 = iArr;
                                }
                            }
                            AbstractC3673p abstractC3673pM4395w9 = c3676s.m4395w("handling_stack");
                            String strMo4384r9 = abstractC3673pM4395w9 != null ? abstractC3673pM4395w9.mo4384r() : null;
                            AbstractC3673p abstractC3673pM4395w10 = c3676s.m4395w("source_type");
                            if (abstractC3673pM4395w10 == null || (strMo4384r2 = abstractC3673pM4395w10.mo4384r()) == null) {
                                i12 = 0;
                            } else {
                                int[] iArrM27k3 = AbstractC0010F.m27k(9);
                                int length3 = iArrM27k3.length;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= length3) {
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                    i12 = iArrM27k3[i17];
                                    int[] iArr2 = iArrM27k3;
                                    if (AbstractC17962d.m19649j(i12).equals(strMo4384r2)) {
                                        break;
                                    }
                                    i17++;
                                    iArrM27k3 = iArr2;
                                }
                            }
                            AbstractC3673p abstractC3673pM4395w11 = c3676s.m4395w("resource");
                            C17969f0 c17969f0M10407a = abstractC3673pM4395w11 != null ? AbstractC9789Q.m10407a(abstractC3673pM4395w11.m4390m()) : null;
                            AbstractC3673p abstractC3673pM4395w12 = c3676s.m4395w("threads");
                            if (abstractC3673pM4395w12 != null) {
                                ArrayList arrayList6 = abstractC3673pM4395w12.m4389j().f11172Y;
                                ArrayList arrayList7 = new ArrayList(arrayList6.size());
                                Iterator it2 = arrayList6.iterator();
                                while (it2.hasNext()) {
                                    arrayList7.add(AbstractC9806T.m10432b(((AbstractC3673p) it2.next()).m4390m()));
                                }
                                arrayList2 = arrayList7;
                            } else {
                                arrayList2 = null;
                            }
                            AbstractC3673p abstractC3673pM4395w13 = c3676s.m4395w("binary_images");
                            if (abstractC3673pM4395w13 != null) {
                                ArrayList arrayList8 = abstractC3673pM4395w13.m4389j().f11172Y;
                                ArrayList arrayList9 = new ArrayList(arrayList8.size());
                                Iterator it3 = arrayList8.iterator();
                                while (it3.hasNext()) {
                                    arrayList9.add(AbstractC9382v4.m9956b(((AbstractC3673p) it3.next()).m4390m()));
                                }
                                arrayList3 = arrayList9;
                            } else {
                                arrayList3 = null;
                            }
                            AbstractC3673p abstractC3673pM4395w14 = c3676s.m4395w("was_truncated");
                            Boolean boolValueOf2 = abstractC3673pM4395w14 != null ? Boolean.valueOf(abstractC3673pM4395w14.mo4380f()) : null;
                            AbstractC3673p abstractC3673pM4395w15 = c3676s.m4395w("meta");
                            C17957b0 c17957b0M10378b = abstractC3673pM4395w15 != null ? AbstractC9771N.m10378b(abstractC3673pM4395w15.m4390m()) : null;
                            AbstractC3673p abstractC3673pM4395w16 = c3676s.m4395w("time_since_app_start");
                            Long lValueOf = abstractC3673pM4395w16 != null ? Long.valueOf(abstractC3673pM4395w16.mo4382p()) : null;
                            AbstractC16544l.m18093f(message, "message");
                            return new C17947X(strMo4384r, message, i13, strMo4384r6, arrayList, boolValueOf, strMo4384r7, strMo4384r8, i10, i11, strMo4384r9, i12, c17969f0M10407a, arrayList2, arrayList3, boolValueOf2, c17957b0M10378b, lValueOf);
                        }
                        try {
                            str = "Unable to parse json into type Error";
                        } catch (IllegalStateException e12) {
                            e = e12;
                        } catch (NullPointerException e13) {
                            e = e13;
                            throw new C3677t(str, e);
                        } catch (NumberFormatException e14) {
                            e = e14;
                            str2 = str;
                            throw new C3677t(str2, e);
                        }
                        str2 = str;
                        throw new C3677t(str2, e);
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (IllegalStateException e15) {
                    e = e15;
                    str = "Unable to parse json into type Error";
                } catch (NumberFormatException e16) {
                    e = e16;
                    str = "Unable to parse json into type Error";
                }
            } catch (NullPointerException e17) {
                e = e17;
                str = "Unable to parse json into type Error";
            }
        } catch (IllegalStateException e18) {
            e = e18;
        } catch (NumberFormatException e19) {
            e = e19;
        }
    }
}
