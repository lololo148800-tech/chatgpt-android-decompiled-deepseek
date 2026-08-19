package p544W9;

import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.draw.AbstractC10861a;
import ge.C14111x0;
import io.sentry.android.replay.capture.C15272c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1051v0.AbstractC20417e;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1082wd.C20909b;
import p124Ei.C2463L0;
import p124Ei.C2509g;
import p156G1.AbstractC2965l;
import p169Gf.C3043g;
import p169Gf.C3046j;
import p193Hf.C3310H0;
import p193Hf.C3331S0;
import p229J0.AbstractC3896D1;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC4152w2;
import p229J0.C4158x2;
import p269Kh.C4675b;
import p269Kh.C4676c;
import p269Kh.C4679f;
import p269Kh.C4688o;
import p296Lk.C5110g;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8079e5;
import p537W0.AbstractC8411c;
import p547Wc.C8805o;
import p571X9.AbstractC9262b4;
import p587Y1.C9588n;
import p594Y9.AbstractC9746I4;
import p594Y9.AbstractC9973t4;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.C13498p;
import p759g1.C13801c;
import p774h1.C14365u;
import p823j3.C16084f;
import p842k0.C16299h;
import p870le.AbstractC16885i;
import p870le.C16876d0;
import p870le.C16880f0;
import p870le.C16882g0;
import p870le.C16883h;
import p870le.C16884h0;
import p870le.C16886i0;

/* JADX INFO: renamed from: W9.x4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8741x4 {
    /* JADX INFO: renamed from: a */
    public static final void m9477a(C4679f c4679f, InterfaceC1426a onDismissRequest, C20909b conversationModelState, List list, ArrayList arrayList, InterfaceC1436k onModelSelect, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        AbstractC16544l.m18094g(conversationModelState, "conversationModelState");
        AbstractC16544l.m18094g(onModelSelect, "onModelSelect");
        c6021p.m6526U(366202155);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c4679f) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onDismissRequest) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? c6021p.m6542f(conversationModelState) : c6021p.m6545h(conversationModelState) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(list) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(arrayList) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(onModelSelect) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 1048576 : 524288;
        }
        int i12 = i11;
        if ((i12 & 599187) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C4676c.Companion.getClass();
            AbstractC9973t4.m10617b(onDismissRequest, new C9588n(6, true, false), AbstractC8411c.m8969c(1119594754, c6021p, new C3043g(interfaceC10459q, c4679f, conversationModelState, onModelSelect, onDismissRequest, C4675b.m5393a(c4679f, arrayList, list))), c6021p, ((i12 >> 3) & 14) | 432, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5110g(c4679f, onDismissRequest, conversationModelState, list, arrayList, onModelSelect, interfaceC10459q, i10, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9478b(C4679f c4679f, InterfaceC1426a onSelect, InterfaceC10459q interfaceC10459q, boolean z6, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        int i12 = 0;
        int i13 = 4;
        AbstractC16544l.m18094g(onSelect, "onSelect");
        c6021p.m6526U(-1145639106);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c4679f) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onSelect) ? 32 : 16;
        }
        int i14 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i14 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i14 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM9836a = AbstractC9262b4.m9836a(AbstractC10844c.m11244d(c10456n, 1.0f), z6);
            if (z6) {
                interfaceC10459qM9836a = AbstractC2965l.m3789a(interfaceC10459qM9836a, false, C16883h.f54197A0);
            }
            boolean z10 = !z6;
            c6021p.m6524S(-453929413);
            boolean z11 = ((i14 & 112) == 32) | ((i14 & 14) == 4);
            Object objM6514H = c6021p.m6514H();
            if (z11 || objM6514H == C6013l.f19514a) {
                objM6514H = new C16084f(c4679f, i13, onSelect);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459qM9836a, z10, null, (InterfaceC1426a) objM6514H, 6);
            float f10 = AbstractC3896D1.f11851a;
            interfaceC10459q2 = c10456n;
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(-1479284192, c6021p, new C16876d0(c4679f, i12)), interfaceC10459qM11209d, null, AbstractC8411c.m8969c(-623876483, c6021p, new C16876d0(c4679f, 1)), null, null, AbstractC3896D1.m4607a(C14365u.f45059i, 0L, 0L, 0L, c6021p, 510), 0.0f, 0.0f, c6021p, 3078, 436);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(c4679f, onSelect, interfaceC10459q2, z6, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:76:0x0107  */
    /* JADX WARN: Code duplicated, block: B:78:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m9479c(C4688o model, String str, InterfaceC1436k onModelSelect, InterfaceC10459q interfaceC10459q, boolean z6, String str2, String str3, C6021p c6021p, int i10, int i11) {
        int i12;
        String str4;
        int i13;
        String str5;
        int i14;
        InterfaceC20904w interfaceC20904w;
        InterfaceC10459q interfaceC10459qM9836a;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objM6514H;
        InterfaceC10459q interfaceC10459q2;
        String str6;
        String str7;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(model, "model");
        AbstractC16544l.m18094g(onModelSelect, "onModelSelect");
        c6021p.m6526U(-49531668);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(model) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(onModelSelect) ? 256 : 128;
        }
        int i15 = i12 | 3072;
        if ((i10 & 24576) == 0) {
            i15 |= c6021p.m6544g(z6) ? 16384 : 8192;
        }
        int i16 = i11 & 32;
        if (i16 == 0) {
            if ((196608 & i10) == 0) {
                str4 = str2;
                i15 |= c6021p.m6542f(str4) ? 131072 : 65536;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i15 |= 1572864;
                str5 = str3;
            } else {
                str5 = str3;
                if ((i10 & 1572864) == 0) {
                    if (c6021p.m6542f(str5)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i15 |= i14;
                }
            }
            if ((i15 & 599187) == 599186 || !c6021p.m6562y()) {
                C10456n c10456n = C10456n.f30959Y;
                if (i16 != 0) {
                    str4 = null;
                }
                if (i13 != 0) {
                    str5 = null;
                }
                boolean zM18089b = AbstractC16544l.m18089b(model.f15253b, str);
                interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                interfaceC10459qM9836a = AbstractC9262b4.m9836a(AbstractC10844c.m11244d(c10456n, 1.0f), z6);
                if (z6) {
                    interfaceC10459qM9836a = AbstractC2965l.m3789a(interfaceC10459qM9836a, false, C16883h.f54198B0);
                }
                boolean z13 = !z6;
                c6021p.m6524S(1769573967);
                boolean zM6545h = c6021p.m6545h(interfaceC20904w);
                String str8 = str4;
                if ((i15 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z14 = zM6545h | z10;
                if ((i15 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z14 | z11;
                objM6514H = c6021p.m6514H();
                if (z12 || objM6514H == C6013l.f19514a) {
                    objM6514H = new C15272c(interfaceC20904w, model, onModelSelect, 7);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459qM9836a, z13, null, (InterfaceC1426a) objM6514H, 6);
                float f10 = AbstractC3896D1.f11851a;
                interfaceC10459q2 = c10456n;
                String str9 = str5;
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1250750158, c6021p, new C8805o(str8, model, false, 21)), interfaceC10459qM11209d, null, AbstractC8411c.m8969c(2013918379, c6021p, new C3046j(str9, 16)), null, AbstractC8411c.m8969c(-1772270103, c6021p, new C2509g(zM18089b, 4)), AbstractC3896D1.m4607a(C14365u.f45059i, 0L, 0L, 0L, c6021p, 510), 0.0f, 0.0f, c6021p, 199686, 404);
                str6 = str8;
                str7 = str9;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                str6 = str4;
                str7 = str5;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C13498p(model, str, onModelSelect, interfaceC10459q2, z6, str6, str7, i10, i11);
            }
        }
        i15 |= 196608;
        str4 = str2;
        i13 = i11 & 64;
        if (i13 != 0) {
            i15 |= 1572864;
            str5 = str3;
        } else {
            str5 = str3;
            if ((i10 & 1572864) == 0) {
                if (c6021p.m6542f(str5)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i15 |= i14;
            }
        }
        if ((i15 & 599187) == 599186) {
            C10456n c10456n2 = C10456n.f30959Y;
            if (i16 != 0) {
                str4 = null;
            }
            if (i13 != 0) {
                str5 = null;
            }
            boolean zM18089b2 = AbstractC16544l.m18089b(model.f15253b, str);
            interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            interfaceC10459qM9836a = AbstractC9262b4.m9836a(AbstractC10844c.m11244d(c10456n2, 1.0f), z6);
            if (z6) {
                interfaceC10459qM9836a = AbstractC2965l.m3789a(interfaceC10459qM9836a, false, C16883h.f54198B0);
            }
            boolean z15 = !z6;
            c6021p.m6524S(1769573967);
            boolean zM6545h2 = c6021p.m6545h(interfaceC20904w);
            String str10 = str4;
            if ((i15 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z16 = zM6545h2 | z10;
            if ((i15 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z16 | z11;
            objM6514H = c6021p.m6514H();
            if (z12) {
                objM6514H = new C15272c(interfaceC20904w, model, onModelSelect, 7);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C15272c(interfaceC20904w, model, onModelSelect, 7);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11209d2 = AbstractC10833a.m11209d(interfaceC10459qM9836a, z15, null, (InterfaceC1426a) objM6514H, 6);
            float f11 = AbstractC3896D1.f11851a;
            interfaceC10459q2 = c10456n2;
            String str11 = str5;
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1250750158, c6021p, new C8805o(str10, model, false, 21)), interfaceC10459qM11209d2, null, AbstractC8411c.m8969c(2013918379, c6021p, new C3046j(str11, 16)), null, AbstractC8411c.m8969c(-1772270103, c6021p, new C2509g(zM18089b2, 4)), AbstractC3896D1.m4607a(C14365u.f45059i, 0L, 0L, 0L, c6021p, 510), 0.0f, 0.0f, c6021p, 199686, 404);
            str6 = str10;
            str7 = str11;
        } else {
            C10456n c10456n3 = C10456n.f30959Y;
            if (i16 != 0) {
                str4 = null;
            }
            if (i13 != 0) {
                str5 = null;
            }
            boolean zM18089b3 = AbstractC16544l.m18089b(model.f15253b, str);
            interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            interfaceC10459qM9836a = AbstractC9262b4.m9836a(AbstractC10844c.m11244d(c10456n3, 1.0f), z6);
            if (z6) {
                interfaceC10459qM9836a = AbstractC2965l.m3789a(interfaceC10459qM9836a, false, C16883h.f54198B0);
            }
            boolean z17 = !z6;
            c6021p.m6524S(1769573967);
            boolean zM6545h3 = c6021p.m6545h(interfaceC20904w);
            String str12 = str4;
            if ((i15 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z18 = zM6545h3 | z10;
            if ((i15 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z18 | z11;
            objM6514H = c6021p.m6514H();
            if (z12) {
                objM6514H = new C15272c(interfaceC20904w, model, onModelSelect, 7);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C15272c(interfaceC20904w, model, onModelSelect, 7);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11209d3 = AbstractC10833a.m11209d(interfaceC10459qM9836a, z17, null, (InterfaceC1426a) objM6514H, 6);
            float f12 = AbstractC3896D1.f11851a;
            interfaceC10459q2 = c10456n3;
            String str13 = str5;
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1250750158, c6021p, new C8805o(str12, model, false, 21)), interfaceC10459qM11209d3, null, AbstractC8411c.m8969c(2013918379, c6021p, new C3046j(str13, 16)), null, AbstractC8411c.m8969c(-1772270103, c6021p, new C2509g(zM18089b3, 4)), AbstractC3896D1.m4607a(C14365u.f45059i, 0L, 0L, 0L, c6021p, 510), 0.0f, 0.0f, c6021p, 199686, 404);
            str6 = str12;
            str7 = str13;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C13498p(model, str, onModelSelect, interfaceC10459q2, z6, str6, str7, i10, i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9480d(InterfaceC1426a onDismissRequest, C4676c models, C20909b conversationModelState, List list, List list2, InterfaceC1436k onModelSelect, InterfaceC1436k onInternalCategorySelect, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        AbstractC16544l.m18094g(models, "models");
        AbstractC16544l.m18094g(conversationModelState, "conversationModelState");
        AbstractC16544l.m18094g(onModelSelect, "onModelSelect");
        AbstractC16544l.m18094g(onInternalCategorySelect, "onInternalCategorySelect");
        c6021p.m6526U(892010309);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(models) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? c6021p.m6542f(conversationModelState) : c6021p.m6545h(conversationModelState) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(list) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6545h(list2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c6021p.m6545h(onModelSelect) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c6021p.m6545h(onInternalCategorySelect) ? 1048576 : 524288;
        }
        int i13 = i11 & 128;
        if (i13 != 0) {
            i12 |= 12582912;
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = interfaceC10459q;
            if ((i10 & 12582912) == 0) {
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 8388608 : 4194304;
            }
        }
        if ((i12 & 4793491) == 4793490 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q2;
        } else {
            InterfaceC10459q interfaceC10459q4 = i13 != 0 ? C10456n.f30959Y : interfaceC10459q2;
            float f10 = AbstractC7313q.f23200e;
            InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(interfaceC10459q4, AbstractC20417e.m21080b(f10, f10));
            c6021p.m6524S(2098659573);
            boolean zM6545h = ((i12 & 112) == 32) | c6021p.m6545h(list2) | c6021p.m6545h(list) | ((3670016 & i12) == 1048576) | ((i12 & 896) == 256 || ((i12 & 512) != 0 && c6021p.m6545h(conversationModelState))) | ((458752 & i12) == 131072) | ((i12 & 14) == 4);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                C16880f0 c16880f0 = new C16880f0(models, list2, list, onInternalCategorySelect, conversationModelState, onModelSelect, onDismissRequest);
                c6021p.m6537c0(c16880f0);
                objM6514H = c16880f0;
            }
            c6021p.m6553p(false);
            AbstractC9746I4.m10337a(interfaceC10459qM8501a, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p, 0, 254);
            interfaceC10459q3 = interfaceC10459q4;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C16882g0(onDismissRequest, models, conversationModelState, list, list2, onModelSelect, onInternalCategorySelect, interfaceC10459q3, i10, i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9481e(InterfaceC1426a onDismissRequest, C4676c models, C20909b conversationModelState, List list, ArrayList arrayList, InterfaceC1436k onModelSelect, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        AbstractC16544l.m18094g(models, "models");
        AbstractC16544l.m18094g(conversationModelState, "conversationModelState");
        AbstractC16544l.m18094g(onModelSelect, "onModelSelect");
        c6021p.m6526U(-409708962);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(models) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? c6021p.m6542f(conversationModelState) : c6021p.m6545h(conversationModelState) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(list) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(arrayList) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(onModelSelect) ? 131072 : 65536;
        }
        int i12 = i11 | 1572864;
        if ((599187 & i12) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-1868171841);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = C5997d.m6430Q(null, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            float f10 = AbstractC7313q.f23201f;
            AbstractC4152w2.m4780a(onDismissRequest, ((C4679f) interfaceC5985X.getValue()) != null ? AbstractC10861a.m11297c(c10456n, C16883h.f54199C0) : c10456n, null, 0.0f, AbstractC20417e.m21080b(f10, f10), 0L, 0L, 0.0f, 0L, AbstractC16885i.f54223a, null, new C4158x2(), AbstractC8411c.m8969c(2066087393, c6021p, new C16884h0(onDismissRequest, models, conversationModelState, list, arrayList, onModelSelect, c10456n, interfaceC5985X)), c6021p, (i12 & 14) | 805306368, 432, 1516);
            C4679f c4679f = (C4679f) interfaceC5985X.getValue();
            if (c4679f != null) {
                m9477a(c4679f, onDismissRequest, conversationModelState, list, arrayList, onModelSelect, c10456n, c6021p, ((i12 << 3) & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016));
            }
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5110g(onDismissRequest, models, conversationModelState, list, arrayList, onModelSelect, interfaceC10459q2, i10, 4);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9482f(C14111x0 c14111x0, C20909b modelState, boolean z6, InterfaceC1436k onModelSelectorToggle, InterfaceC1436k onModelSelect, boolean z10, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        boolean z11;
        int i12;
        AbstractC16544l.m18094g(modelState, "modelState");
        AbstractC16544l.m18094g(onModelSelectorToggle, "onModelSelectorToggle");
        AbstractC16544l.m18094g(onModelSelect, "onModelSelect");
        c6021p.m6526U(1557667000);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c14111x0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(modelState) : c6021p.m6545h(modelState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onModelSelectorToggle) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(onModelSelect) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i11 |= c6021p.m6544g(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 1048576 : 524288;
        }
        int i13 = i11;
        if ((599187 & i13) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC10831a.m11201d(z10, null, null, null, null, AbstractC8411c.m8969c(1843111648, c6021p, new C16299h(interfaceC10459q, onModelSelectorToggle, z6, c14111x0, modelState)), c6021p, ((i13 >> 15) & 14) | 196608, 30);
            if (z6) {
                c6021p.m6524S(-525544164);
                int i14 = i13 & 7168;
                boolean z12 = i14 == 2048;
                Object objM6514H = c6021p.m6514H();
                C5975S c5975s = C6013l.f19514a;
                if (z12 || objM6514H == c5975s) {
                    objM6514H = new C16886i0(0, onModelSelectorToggle);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H;
                c6021p.m6553p(false);
                List listM15497k = c14111x0.m15497k();
                ArrayList arrayList = c14111x0.f44429q0;
                c6021p.m6524S(-525534810);
                if ((57344 & i13) == 16384) {
                    i12 = 2048;
                    z11 = true;
                } else {
                    z11 = false;
                    i12 = 2048;
                }
                boolean z13 = z11 | (i14 == i12);
                Object objM6514H2 = c6021p.m6514H();
                if (z13 || objM6514H2 == c5975s) {
                    objM6514H2 = new C3331S0(onModelSelect, onModelSelectorToggle, 4);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                m9481e(interfaceC1426a, c14111x0.f44402d, modelState, listM15497k, arrayList, (InterfaceC1436k) objM6514H2, null, c6021p, (i13 << 3) & 896);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3310H0(c14111x0, modelState, z6, onModelSelectorToggle, onModelSelect, z10, interfaceC10459q, i10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m9483g(C13801c c13801c, float f10, float f11) {
        return f10 <= c13801c.f43588c && c13801c.f43586a <= f10 && f11 <= c13801c.f43589d && c13801c.f43587b <= f11;
    }
}
