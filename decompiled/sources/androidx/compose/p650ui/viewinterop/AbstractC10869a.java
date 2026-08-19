package androidx.compose.p650ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.p650ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p017Af.C0492w;
import p038Ba.AbstractC0865o;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21672S;
import p1140z1.C21658D;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.C21711p0;
import p1140z1.InterfaceC21700k;
import p183H4.InterfaceC3232g;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6017n;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8111i5;
import p562X0.AbstractC9018m;
import p562X0.InterfaceC9016k;
import p563X1.C9021a;
import p563X1.C9032l;
import p563X1.C9033m;
import p563X1.C9034n;
import p563X1.C9037q;
import p635a1.AbstractC10443a;
import p635a1.AbstractC10458p;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p737f1.C13526r;
import p914o3.AbstractC17814e;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10869a {
    /* JADX INFO: renamed from: a */
    public static final void m11355a(InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, InterfaceC1436k interfaceC1436k4, C6021p c6021p, int i10) {
        int i11;
        InterfaceC1436k interfaceC1436k5;
        c6021p.m6526U(-180024211);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1436k) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k4) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC1436k5 = interfaceC1436k2;
        } else {
            int i13 = c6021p.f19564P;
            InterfaceC10459q interfaceC10459qMo428M = interfaceC10459q.mo428M(FocusGroupPropertiesElement.f32834Y);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new AbstractC21672S() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                @Override // p1140z1.AbstractC21672S
                /* JADX INFO: renamed from: a */
                public final AbstractC10458p mo11196a() {
                    return new C13526r();
                }

                public final boolean equals(Object obj) {
                    return obj == this;
                }

                public final int hashCode() {
                    return 1739042953;
                }

                @Override // p1140z1.AbstractC21672S
                /* JADX INFO: renamed from: i */
                public final /* bridge */ /* synthetic */ void mo11197i(AbstractC10458p abstractC10458p) {
                }
            };
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M.mo428M(focusTargetNode$FocusTargetElement).mo428M(FocusTargetPropertiesElement.f32835Y).mo428M(focusTargetNode$FocusTargetElement));
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            EnumC7546k enumC7546k = (EnumC7546k) c6021p.m6548k(AbstractC0187M0.f710l);
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC11112u interfaceC11112u = (InterfaceC11112u) c6021p.m6548k(AbstractC17814e.f56807a);
            InterfaceC3232g interfaceC3232g = (InterfaceC3232g) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32828e);
            AbstractC0865o abstractC0865o = c6021p.f19565a;
            c6021p.m6524S(608726777);
            int i14 = i12 & 14;
            int i15 = c6021p.f19564P;
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            C6017n c6017nM6434U = C5997d.m6434U(c6021p);
            InterfaceC9016k interfaceC9016k = (InterfaceC9016k) c6021p.m6548k(AbstractC9018m.f27517a);
            View view = (View) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32829f);
            boolean zM6545h = c6021p.m6545h(context) | ((((i14 & 14) ^ 6) > 4 && c6021p.m6542f(interfaceC1436k)) || (i14 & 6) == 4) | c6021p.m6545h(c6017nM6434U) | c6021p.m6545h(interfaceC9016k) | c6021p.m6538d(i15) | c6021p.m6545h(view);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                Object c9034n = new C9034n(context, interfaceC1436k, c6017nM6434U, interfaceC9016k, i15, view);
                c6021p.m6537c0(c9034n);
                objM6514H = c9034n;
            }
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H;
            if (!(abstractC0865o instanceof C21711p0)) {
                C5997d.m6425L();
                throw null;
            }
            c6021p.m6522Q();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            InterfaceC21700k.f68875m0.getClass();
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C5997d.m6439Z(C9033m.f27576p0, c6021p, interfaceC10459qM10923d);
            C5997d.m6439Z(C9033m.f27577q0, c6021p, interfaceC7537b);
            C5997d.m6439Z(C9033m.f27578r0, c6021p, interfaceC11112u);
            C5997d.m6439Z(C9033m.f27579s0, c6021p, interfaceC3232g);
            C5997d.m6439Z(C9033m.f27580t0, c6021p, enumC7546k);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C9033m.f27574Z, c6021p, interfaceC1436k4);
            C5997d.m6439Z(C9033m.f27575o0, c6021p, interfaceC1436k3);
            c6021p.m6553p(true);
            c6021p.m6553p(false);
            interfaceC1436k5 = null;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(interfaceC1436k, interfaceC10459q, interfaceC1436k5, interfaceC1436k3, interfaceC1436k4, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x003b  */
    /* JADX WARN: Code duplicated, block: B:27:0x003f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x0049  */
    /* JADX WARN: Code duplicated, block: B:34:0x0052  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0064  */
    /* JADX WARN: Code duplicated, block: B:43:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:0x006b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m11356b(InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k2, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        InterfaceC10459q interfaceC10459q2;
        C9021a c9021a;
        InterfaceC1436k interfaceC1436k3;
        InterfaceC1436k interfaceC1436k4;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(-1783766393);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(interfaceC1436k) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    if (c6021p.m6545h(interfaceC1436k2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i12 & 147) == 146 || !c6021p.m6562y()) {
                    if (i15 != 0) {
                        interfaceC10459q2 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q2 = interfaceC10459q;
                    }
                    c9021a = C9021a.f27522q0;
                    if (i13 != 0) {
                        interfaceC1436k3 = c9021a;
                    } else {
                        interfaceC1436k3 = interfaceC1436k2;
                    }
                    m11355a(interfaceC1436k, interfaceC10459q2, null, c9021a, interfaceC1436k3, c6021p, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344));
                    interfaceC10459q = interfaceC10459q2;
                    interfaceC1436k4 = interfaceC1436k3;
                } else {
                    c6021p.m6517L();
                    interfaceC1436k4 = interfaceC1436k2;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C9032l(interfaceC1436k, interfaceC10459q, interfaceC1436k4, i10, i11, 0);
                }
            }
            i12 |= 384;
            if ((i12 & 147) == 146) {
                if (i15 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                } else {
                    interfaceC10459q2 = interfaceC10459q;
                }
                c9021a = C9021a.f27522q0;
                if (i13 != 0) {
                    interfaceC1436k3 = c9021a;
                } else {
                    interfaceC1436k3 = interfaceC1436k2;
                }
                m11355a(interfaceC1436k, interfaceC10459q2, null, c9021a, interfaceC1436k3, c6021p, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344));
                interfaceC10459q = interfaceC10459q2;
                interfaceC1436k4 = interfaceC1436k3;
            } else {
                if (i15 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                } else {
                    interfaceC10459q2 = interfaceC10459q;
                }
                c9021a = C9021a.f27522q0;
                if (i13 != 0) {
                    interfaceC1436k3 = c9021a;
                } else {
                    interfaceC1436k3 = interfaceC1436k2;
                }
                m11355a(interfaceC1436k, interfaceC10459q2, null, c9021a, interfaceC1436k3, c6021p, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344));
                interfaceC10459q = interfaceC10459q2;
                interfaceC1436k4 = interfaceC1436k3;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C9032l(interfaceC1436k, interfaceC10459q, interfaceC1436k4, i10, i11, 0);
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                if (c6021p.m6545h(interfaceC1436k2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & 147) == 146) {
                if (i15 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                } else {
                    interfaceC10459q2 = interfaceC10459q;
                }
                c9021a = C9021a.f27522q0;
                if (i13 != 0) {
                    interfaceC1436k3 = c9021a;
                } else {
                    interfaceC1436k3 = interfaceC1436k2;
                }
                m11355a(interfaceC1436k, interfaceC10459q2, null, c9021a, interfaceC1436k3, c6021p, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344));
                interfaceC10459q = interfaceC10459q2;
                interfaceC1436k4 = interfaceC1436k3;
            } else {
                if (i15 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                } else {
                    interfaceC10459q2 = interfaceC10459q;
                }
                c9021a = C9021a.f27522q0;
                if (i13 != 0) {
                    interfaceC1436k3 = c9021a;
                } else {
                    interfaceC1436k3 = interfaceC1436k2;
                }
                m11355a(interfaceC1436k, interfaceC10459q2, null, c9021a, interfaceC1436k3, c6021p, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344));
                interfaceC10459q = interfaceC10459q2;
                interfaceC1436k4 = interfaceC1436k3;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C9032l(interfaceC1436k, interfaceC10459q, interfaceC1436k4, i10, i11, 0);
            }
        }
        i12 |= 384;
        if ((i12 & 147) == 146) {
            if (i15 != 0) {
                interfaceC10459q2 = C10456n.f30959Y;
            } else {
                interfaceC10459q2 = interfaceC10459q;
            }
            c9021a = C9021a.f27522q0;
            if (i13 != 0) {
                interfaceC1436k3 = c9021a;
            } else {
                interfaceC1436k3 = interfaceC1436k2;
            }
            m11355a(interfaceC1436k, interfaceC10459q2, null, c9021a, interfaceC1436k3, c6021p, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344));
            interfaceC10459q = interfaceC10459q2;
            interfaceC1436k4 = interfaceC1436k3;
        } else {
            if (i15 != 0) {
                interfaceC10459q2 = C10456n.f30959Y;
            } else {
                interfaceC10459q2 = interfaceC10459q;
            }
            c9021a = C9021a.f27522q0;
            if (i13 != 0) {
                interfaceC1436k3 = c9021a;
            } else {
                interfaceC1436k3 = interfaceC1436k2;
            }
            m11355a(interfaceC1436k, interfaceC10459q2, null, c9021a, interfaceC1436k3, c6021p, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344));
            interfaceC10459q = interfaceC10459q2;
            interfaceC1436k4 = interfaceC1436k3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C9032l(interfaceC1436k, interfaceC10459q, interfaceC1436k4, i10, i11, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C9037q m11357c(C21658D c21658d) {
        C9037q c9037q = c21658d.f68659v0;
        if (c9037q != null) {
            return c9037q;
        }
        AbstractC8111i5.m8593d("Required value was null.");
        throw null;
    }
}
