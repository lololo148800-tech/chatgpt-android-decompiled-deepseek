package p001A;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p049Bm.InterfaceC1436k;
import p057C3.C1526D;
import p057C3.SurfaceHolderCallbackC1523A;
import p1016t3.InterfaceC19759I;
import p1073w3.AbstractC20817s;
import p1073w3.InterfaceC20806h;
import p109E3.C2292p;
import p1139z0.C21585H;
import p155G.C2951c;
import p301M.AbstractC5229k;
import p610Z1.C10142i;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0098y implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f422Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f423Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f424o0;

    public /* synthetic */ RunnableC0098y(Object obj, boolean z6, int i10) {
        this.f422Y = i10;
        this.f424o0 = obj;
        this.f423Z = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f422Y) {
            case 0:
                C0018J c0018j = (C0018J) this.f424o0;
                boolean z6 = this.f423Z;
                c0018j.f84O0 = z6;
                if (z6 && c0018j.f89T0 == 4) {
                    c0018j.m101K(false);
                    break;
                }
                break;
            case 1:
                C21585H c21585h = (C21585H) this.f424o0;
                c21585h.getClass();
                int i10 = AbstractC20817s.f66106a;
                C1526D c1526d = ((SurfaceHolderCallbackC1523A) c21585h.f68345o0).f4046Y;
                boolean z10 = c1526d.f4082f1;
                final boolean z11 = this.f423Z;
                if (z10 != z11) {
                    c1526d.f4082f1 = z11;
                    c1526d.f4100y0.m10694e(23, new InterfaceC20806h() { // from class: C3.z
                        @Override // p1073w3.InterfaceC20806h
                        public final void invoke(Object obj) {
                            ((InterfaceC19759I) obj).mo2771s(z11);
                        }
                    });
                    break;
                }
                break;
            case 2:
                C2951c c2951c = (C2951c) this.f424o0;
                boolean z12 = c2951c.f8827a;
                boolean z13 = this.f423Z;
                if (z12 != z13) {
                    c2951c.f8827a = z13;
                    if (!z13) {
                        C2292p c2292p = new C2292p("The camera control has became inactive.");
                        C10142i c10142i = c2951c.f8833g;
                        if (c10142i != null) {
                            c10142i.m10748b(c2292p);
                            c2951c.f8833g = null;
                        }
                    } else if (c2951c.f8828b) {
                        C0088t c0088t = c2951c.f8829c;
                        c0088t.getClass();
                        AbstractC5229k.m5780d(AbstractC16347a.m17947b(new C0072l(c0088t, 0))).mo5766a(new RunnableC0000A(c2951c, 14), c2951c.f8830d);
                        c2951c.f8828b = false;
                    }
                    break;
                }
                break;
            default:
                C16525B onFocusBackgroundChange = (C16525B) this.f424o0;
                AbstractC16544l.m18094g(onFocusBackgroundChange, "$onFocusBackgroundChange");
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) onFocusBackgroundChange.f51262Y;
                if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(Boolean.valueOf(this.f423Z));
                }
                break;
        }
    }
}
