package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p537W0.AbstractC8411c;
import p547Wc.C8765I;
import p547Wc.C8766J;
import p547Wc.C8767K;
import p909nm.C17689w;
import p919o8.C18018v1;
import p936p0.C18280t;

/* JADX INFO: renamed from: Y9.M3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9769M3 {
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:76:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x0159  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m10374a(List items, InterfaceC1440o interfaceC1440o, Object obj, InterfaceC1426a onDismiss, InterfaceC1436k onSelect, List list, InterfaceC1439n interfaceC1439n, C6021p c6021p, int i10, int i11) {
        int i12;
        List list2;
        int i13;
        List list3;
        Object objM6514H;
        C5975S c5975s;
        Object objM530s;
        C18280t c18280t;
        Object objM530s2;
        List list4;
        C6018n0 c6018n0M6555r;
        int i14;
        AbstractC16544l.m18094g(items, "items");
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(onSelect, "onSelect");
        c6021p.m6526U(-1518664778);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(items) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC1440o) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? c6021p.m6542f(obj) : c6021p.m6545h(obj) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(onDismiss) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6545h(onSelect) ? 16384 : 8192;
        }
        int i15 = i11 & 32;
        if (i15 == 0) {
            if ((196608 & i10) == 0) {
                list2 = list;
                i12 |= c6021p.m6545h(list2) ? 131072 : 65536;
            }
            if ((1572864 & i10) == 0) {
                if (c6021p.m6545h(interfaceC1439n)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            i13 = i12;
            if ((i13 & 599187) == 599186 || !c6021p.m6562y()) {
                if (i15 != 0) {
                    list3 = C17689w.f56480Y;
                } else {
                    list3 = list2;
                }
                c6021p.m6524S(-1349285397);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = C5997d.m6430Q(obj, C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
                objM530s = AbstractC0168G.m530s(-1349283554, c6021p, false);
                if (objM530s == c5975s) {
                    objM530s = new C18280t(0, 0);
                    c6021p.m6537c0(objM530s);
                }
                c18280t = (C18280t) objM530s;
                objM530s2 = AbstractC0168G.m530s(-1349281805, c6021p, false);
                if (objM530s2 == c5975s) {
                    objM530s2 = C5997d.m6421H(new C8767K(c18280t, 0));
                    c6021p.m6537c0(objM530s2);
                }
                c6021p.m6553p(false);
                AbstractC9973t4.m10617b(onDismiss, null, AbstractC8411c.m8969c(-758897345, c6021p, new C8765I(c18280t, items, list3, interfaceC1440o, onDismiss, onSelect, interfaceC1439n, (InterfaceC5982V0) objM530s2, interfaceC5985X, i13, 1)), c6021p, ((i13 >> 9) & 14) | 384, 2);
                list4 = list3;
            } else {
                c6021p.m6517L();
                list4 = list2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C8766J(items, interfaceC1440o, obj, onDismiss, onSelect, list4, interfaceC1439n, i10, i11);
            }
        }
        i12 |= 196608;
        list2 = list;
        if ((1572864 & i10) == 0) {
            if (c6021p.m6545h(interfaceC1439n)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i12 |= i14;
        }
        i13 = i12;
        if ((i13 & 599187) == 599186) {
            if (i15 != 0) {
                list3 = C17689w.f56480Y;
            } else {
                list3 = list2;
            }
            c6021p.m6524S(-1349285397);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(obj, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM6514H;
            objM530s = AbstractC0168G.m530s(-1349283554, c6021p, false);
            if (objM530s == c5975s) {
                objM530s = new C18280t(0, 0);
                c6021p.m6537c0(objM530s);
            }
            c18280t = (C18280t) objM530s;
            objM530s2 = AbstractC0168G.m530s(-1349281805, c6021p, false);
            if (objM530s2 == c5975s) {
                objM530s2 = C5997d.m6421H(new C8767K(c18280t, 0));
                c6021p.m6537c0(objM530s2);
            }
            c6021p.m6553p(false);
            AbstractC9973t4.m10617b(onDismiss, null, AbstractC8411c.m8969c(-758897345, c6021p, new C8765I(c18280t, items, list3, interfaceC1440o, onDismiss, onSelect, interfaceC1439n, (InterfaceC5982V0) objM530s2, interfaceC5985X2, i13, 1)), c6021p, ((i13 >> 9) & 14) | 384, 2);
            list4 = list3;
        } else {
            if (i15 != 0) {
                list3 = C17689w.f56480Y;
            } else {
                list3 = list2;
            }
            c6021p.m6524S(-1349285397);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(obj, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X3 = (InterfaceC5985X) objM6514H;
            objM530s = AbstractC0168G.m530s(-1349283554, c6021p, false);
            if (objM530s == c5975s) {
                objM530s = new C18280t(0, 0);
                c6021p.m6537c0(objM530s);
            }
            c18280t = (C18280t) objM530s;
            objM530s2 = AbstractC0168G.m530s(-1349281805, c6021p, false);
            if (objM530s2 == c5975s) {
                objM530s2 = C5997d.m6421H(new C8767K(c18280t, 0));
                c6021p.m6537c0(objM530s2);
            }
            c6021p.m6553p(false);
            AbstractC9973t4.m10617b(onDismiss, null, AbstractC8411c.m8969c(-758897345, c6021p, new C8765I(c18280t, items, list3, interfaceC1440o, onDismiss, onSelect, interfaceC1439n, (InterfaceC5982V0) objM530s2, interfaceC5985X3, i13, 1)), c6021p, ((i13 >> 9) & 14) | 384, 2);
            list4 = list3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8766J(items, interfaceC1440o, obj, onDismiss, onSelect, list4, interfaceC1439n, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C18018v1 m10375b(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C18018v1(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ContainerView", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ContainerView", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ContainerView", e12);
        }
    }
}
