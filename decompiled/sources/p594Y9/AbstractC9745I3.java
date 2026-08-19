package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import androidx.compose.foundation.layout.AbstractC10842a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p156G1.AbstractC2965l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p547Wc.C8760D;
import p547Wc.C8786c;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p919o8.AbstractC17976h1;
import p919o8.C17884B1;
import p919o8.C17887C1;
import p919o8.C17911K1;
import p919o8.C17920N1;
import p919o8.C17931R1;
import p919o8.C17934S1;
import p919o8.C17937T1;
import p919o8.C17940U1;
import p919o8.C17946W1;
import p919o8.C18000p1;
import p919o8.C18006r1;
import p919o8.C18012t1;
import p919o8.C18015u1;
import p919o8.C18021w1;
import p919o8.C18030z1;

/* JADX INFO: renamed from: Y9.I3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9745I3 {
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m10335a(String text, InterfaceC10459q interfaceC10459q, long j10, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        long j11;
        InterfaceC10459q interfaceC10459q3;
        long j12;
        int i13;
        InterfaceC10459q interfaceC10459q4;
        long j13;
        InterfaceC10459q interfaceC10459q5;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(text, "text");
        c6021p.m6526U(1931854635);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if ((i11 & 4) == 0) {
                    j11 = j10;
                    int i15 = c6021p.m6540e(j11) ? 256 : 128;
                    i12 |= i15;
                } else {
                    j11 = j10;
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            if ((i12 & 147) == 146 || !c6021p.m6562y()) {
                c6021p.m6519N();
                if ((i10 & 1) != 0 || c6021p.m6561x()) {
                    if (i14 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        j12 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12235q;
                    } else {
                        j12 = j11;
                    }
                    InterfaceC10459q interfaceC10459q6 = interfaceC10459q3;
                    i13 = i12;
                    interfaceC10459q4 = interfaceC10459q6;
                } else {
                    c6021p.m6517L();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    i13 = i12;
                    interfaceC10459q4 = interfaceC10459q2;
                    j12 = j11;
                }
                c6021p.m6554q();
                AbstractC4124r4.m4768b(text, AbstractC10842a.m11233k(AbstractC2965l.m3789a(interfaceC10459q4, false, C8786c.f26852p0), AbstractC7313q.f23201f), j12, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12158n, c6021p, i13 & 910, 0, 65528);
                j13 = j12;
                interfaceC10459q5 = interfaceC10459q4;
            } else {
                c6021p.m6517L();
                interfaceC10459q5 = interfaceC10459q2;
                j13 = j11;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C8760D(text, interfaceC10459q5, j13, i10, i11, 0);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                j11 = j10;
                if (c6021p.m6540e(j11)) {
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            i12 |= i15;
        } else {
            j11 = j10;
        }
        if ((i12 & 147) == 146) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    j12 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12235q;
                } else {
                    j12 = j11;
                }
                InterfaceC10459q interfaceC10459q7 = interfaceC10459q3;
                i13 = i12;
                interfaceC10459q4 = interfaceC10459q7;
            } else {
                if (i14 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    j12 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12235q;
                } else {
                    j12 = j11;
                }
                InterfaceC10459q interfaceC10459q8 = interfaceC10459q3;
                i13 = i12;
                interfaceC10459q4 = interfaceC10459q8;
            }
            c6021p.m6554q();
            AbstractC4124r4.m4768b(text, AbstractC10842a.m11233k(AbstractC2965l.m3789a(interfaceC10459q4, false, C8786c.f26852p0), AbstractC7313q.f23201f), j12, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12158n, c6021p, i13 & 910, 0, 65528);
            j13 = j12;
            interfaceC10459q5 = interfaceC10459q4;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    j12 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12235q;
                } else {
                    j12 = j11;
                }
                InterfaceC10459q interfaceC10459q9 = interfaceC10459q3;
                i13 = i12;
                interfaceC10459q4 = interfaceC10459q9;
            } else {
                if (i14 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    j12 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12235q;
                } else {
                    j12 = j11;
                }
                InterfaceC10459q interfaceC10459q10 = interfaceC10459q3;
                i13 = i12;
                interfaceC10459q4 = interfaceC10459q10;
            }
            c6021p.m6554q();
            AbstractC4124r4.m4768b(text, AbstractC10842a.m11233k(AbstractC2965l.m3789a(interfaceC10459q4, false, C8786c.f26852p0), AbstractC7313q.f23201f), j12, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12158n, c6021p, i13 & 910, 0, 65528);
            j13 = j12;
            interfaceC10459q5 = interfaceC10459q4;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8760D(text, interfaceC10459q5, j13, i10, i11, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17946W1 m10336b(C3676s jsonObject) {
        String str;
        String strMo4384r;
        String strMo4384r2;
        String str2 = "Unable to parse json into type ViewEvent";
        AbstractC16544l.m18094g(jsonObject, "jsonObject");
        try {
            try {
                long jMo4382p = jsonObject.m4395w("date").mo4382p();
                C18000p1 c18000p1M10317b = AbstractC9727F3.m10317b(jsonObject.m4395w(SIPServerTransaction.CONTENT_TYPE_APPLICATION).m4390m());
                AbstractC3673p abstractC3673pM4395w = jsonObject.m4395w(ReferencesHeader.SERVICE);
                if (abstractC3673pM4395w != null) {
                    try {
                        strMo4384r = abstractC3673pM4395w.mo4384r();
                    } catch (IllegalStateException e10) {
                        e = e10;
                        throw new C3677t(str2, e);
                    } catch (NumberFormatException e11) {
                        e = e11;
                        throw new C3677t(str2, e);
                    }
                } else {
                    strMo4384r = null;
                }
                AbstractC3673p abstractC3673pM4395w2 = jsonObject.m4395w("version");
                String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
                AbstractC3673p abstractC3673pM4395w3 = jsonObject.m4395w("build_version");
                String strMo4384r4 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
                AbstractC3673p abstractC3673pM4395w4 = jsonObject.m4395w("build_id");
                String strMo4384r5 = abstractC3673pM4395w4 != null ? abstractC3673pM4395w4.mo4384r() : null;
                C17937T1 c17937t1M10599b = AbstractC9937n4.m10599b(jsonObject.m4395w(ParameterNames.SESSION).m4390m());
                AbstractC3673p abstractC3673pM4395w5 = jsonObject.m4395w("source");
                int i10 = 0;
                if (abstractC3673pM4395w5 != null && (strMo4384r2 = abstractC3673pM4395w5.mo4384r()) != null) {
                    int[] iArrM27k = AbstractC0010F.m27k(8);
                    int length = iArrM27k.length;
                    while (true) {
                        if (i10 >= length) {
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                        int i11 = iArrM27k[i10];
                        if (AbstractC17976h1.m19671f(i11).equals(strMo4384r2)) {
                            i10 = i11;
                            break;
                        }
                        i10++;
                    }
                }
                C17940U1 c17940u1M10603b = AbstractC9943o4.m10603b(jsonObject.m4395w("view").m4390m());
                AbstractC3673p abstractC3673pM4395w6 = jsonObject.m4395w("usr");
                C17934S1 c17934s1M10592b = abstractC3673pM4395w6 != null ? AbstractC9931m4.m10592b(abstractC3673pM4395w6.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w7 = jsonObject.m4395w("connectivity");
                C18012t1 c18012t1M10359b = abstractC3673pM4395w7 != null ? AbstractC9757K3.m10359b(abstractC3673pM4395w7.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w8 = jsonObject.m4395w("display");
                C17887C1 c17887c1M10439c = abstractC3673pM4395w8 != null ? AbstractC9810T3.m10439c(abstractC3673pM4395w8.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w9 = jsonObject.m4395w("synthetics");
                C17931R1 c17931r1M10583b = abstractC3673pM4395w9 != null ? AbstractC9925l4.m10583b(abstractC3673pM4395w9.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w10 = jsonObject.m4395w("ci_test");
                C18006r1 c18006r1M10329d = abstractC3673pM4395w10 != null ? AbstractC9739H3.m10329d(abstractC3673pM4395w10.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w11 = jsonObject.m4395w("os");
                C17911K1 c17911k1M10504a = abstractC3673pM4395w11 != null ? AbstractC9853a4.m10504a(abstractC3673pM4395w11.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w12 = jsonObject.m4395w("device");
                C17884B1 c17884b1M10427a = abstractC3673pM4395w12 != null ? AbstractC9804S3.m10427a(abstractC3673pM4395w12.m4390m()) : null;
                C18030z1 c18030z1M10412b = AbstractC9793Q3.m10412b(jsonObject.m4395w("_dd").m4390m());
                AbstractC3673p abstractC3673pM4395w13 = jsonObject.m4395w("context");
                C18021w1 c18021w1M10382b = abstractC3673pM4395w13 != null ? AbstractC9775N3.m10382b(abstractC3673pM4395w13.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w14 = jsonObject.m4395w("container");
                C18015u1 c18015u1M10367b = abstractC3673pM4395w14 != null ? AbstractC9763L3.m10367b(abstractC3673pM4395w14.m4390m()) : null;
                String strMo4384r6 = jsonObject.m4395w("type").mo4384r();
                str = "Unable to parse json into type ViewEvent";
                try {
                    AbstractC3673p abstractC3673pM4395w15 = jsonObject.m4395w("feature_flags");
                    C18021w1 c18021w1M10382b2 = abstractC3673pM4395w15 != null ? AbstractC9775N3.m10382b(abstractC3673pM4395w15.m4390m()) : null;
                    AbstractC3673p abstractC3673pM4395w16 = jsonObject.m4395w("privacy");
                    C17920N1 c17920n1M10521a = abstractC3673pM4395w16 != null ? AbstractC9867c4.m10521a(abstractC3673pM4395w16.m4390m()) : null;
                    if (AbstractC16544l.m18089b(strMo4384r6, "view")) {
                        return new C17946W1(jMo4382p, c18000p1M10317b, strMo4384r, strMo4384r3, strMo4384r4, strMo4384r5, c17937t1M10599b, i10, c17940u1M10603b, c17934s1M10592b, c18012t1M10359b, c17887c1M10439c, c17931r1M10583b, c18006r1M10329d, c17911k1M10504a, c17884b1M10427a, c18030z1M10412b, c18021w1M10382b, c18015u1M10367b, c18021w1M10382b2, c17920n1M10521a);
                    }
                    throw new IllegalStateException("Check failed.");
                } catch (IllegalStateException e12) {
                    e = e12;
                    str2 = str;
                    throw new C3677t(str2, e);
                } catch (NullPointerException e13) {
                    e = e13;
                    throw new C3677t(str, e);
                } catch (NumberFormatException e14) {
                    e = e14;
                    str2 = str;
                    throw new C3677t(str2, e);
                }
            } catch (NullPointerException e15) {
                e = e15;
                str = "Unable to parse json into type ViewEvent";
            }
        } catch (IllegalStateException e16) {
            e = e16;
        } catch (NumberFormatException e17) {
            e = e17;
        }
    }
}
