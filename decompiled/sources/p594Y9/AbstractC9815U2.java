package p594Y9;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import bf.C11349D;
import bf.C11380h;
import bf.InterfaceC11374b0;
import com.openai.chatgpt.R;
import com.openai.feature.gizmos.GizmoIconKt$GizmoIconItem$tintedFallback$1$1;
import java.util.Iterator;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17632f;
import p003A1.AbstractC0168G;
import p033B5.InterfaceC0832p;
import p042Bf.C1282x;
import p1042uh.C20263a0;
import p1051v0.AbstractC20417e;
import p1095x1.C21089j;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3959O0;
import p229J0.C3949M0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p382Pf.C6401d;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8095g5;
import p523V9.AbstractC8126k4;
import p527Ve.C8273j;
import p527Ve.C8274k;
import p527Ve.C8275l;
import p537W0.AbstractC8411c;
import p579Xh.InterfaceC9514a;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14356l;
import p774h1.C14358n;
import p821j1.InterfaceC16039d;
import p882m1.AbstractC17140a;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17780r;
import p919o8.C17913L0;

/* JADX INFO: renamed from: Y9.U2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9815U2 {
    /* JADX INFO: renamed from: a */
    public static final void m10442a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-6455557);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.design_logo_assistant, c6021p, 0), null, C10843b.f32509a.m11240a(AbstractC10844c.f32512c, C10444b.f30938q0), 0L, c6021p, 48, 8);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q, i10, 20);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10443b(C11349D c11349d, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C11380h c11380h;
        c6021p.m6526U(-995317043);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c11349d) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            String str = null;
            String str2 = c11349d != null ? c11349d.f34319b : null;
            if (c11349d != null && (c11380h = c11349d.f34326i) != null) {
                str = c11380h.f34387a;
            }
            m10446e(str2, str, interfaceC10459q, 0L, 0, c6021p, (i11 << 3) & 896, 24);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8273j(c11349d, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10444c(C11349D gizmo, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(gizmo, "gizmo");
        c6021p.m6526U(-1449008982);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(gizmo) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            m10446e(gizmo.f34319b, gizmo.f34326i.f34387a, interfaceC10459q, 0L, 0, c6021p, (i11 << 3) & 896, 24);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8273j(gizmo, interfaceC10459q, i10, 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m10445d(C20263a0 c20263a0, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1741737874);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c20263a0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            m10446e(c20263a0 != null ? c20263a0.f64086c.f64081a : null, c20263a0 != null ? c20263a0.f64086c.f64082b : null, interfaceC10459q, 0L, 0, c6021p, (i11 << 3) & 896, 24);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(c20263a0, interfaceC10459q, i10, 5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m10446e(String str, String str2, InterfaceC10459q interfaceC10459q, long j10, int i10, C6021p c6021p, int i11, int i12) {
        int i13;
        long j11;
        int i14;
        int i15;
        long j12;
        Object next;
        Object objM19235b;
        InterfaceC0832p interfaceC0832pMo3165c;
        c6021p.m6526U(1258727842);
        if ((i11 & 6) == 0) {
            i13 = (c6021p.m6542f(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6542f(str2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            j11 = j10;
            i13 |= ((i12 & 8) == 0 && c6021p.m6540e(j11)) ? 2048 : 1024;
        } else {
            j11 = j10;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                i14 = i10;
                int i16 = c6021p.m6538d(i14) ? 16384 : 8192;
                i13 |= i16;
            } else {
                i14 = i10;
            }
            i13 |= i16;
        } else {
            i14 = i10;
        }
        if ((i13 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            i15 = i14;
            j12 = j11;
        } else {
            c6021p.m6519N();
            if ((i11 & 1) == 0 || c6021p.m6561x()) {
                if ((i12 & 8) != 0) {
                    j11 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s;
                    i13 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    i14 = R.drawable.gizmo_placeholder;
                }
            } else {
                c6021p.m6517L();
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                }
            }
            int i17 = i14;
            final long j13 = j11;
            c6021p.m6554q();
            if (str != null) {
                c6021p.m6524S(1177083601);
                final AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(i17, c6021p, (i13 >> 12) & 14);
                c6021p.m6524S(-1763140707);
                boolean z6 = true;
                boolean z10 = (((57344 & i13) ^ 24576) > 16384 && c6021p.m6538d(i17)) || (i13 & 24576) == 16384;
                if ((((i13 & 7168) ^ 3072) <= 2048 || !c6021p.m6540e(j13)) && (i13 & 3072) != 2048) {
                    z6 = false;
                }
                boolean z11 = z10 | z6;
                Object objM6514H = c6021p.m6514H();
                if (z11 || objM6514H == C6013l.f19514a) {
                    objM6514H = new AbstractC17140a() { // from class: com.openai.feature.gizmos.GizmoIconKt$GizmoIconItem$tintedFallback$1$1
                        @Override // p882m1.AbstractC17140a
                        /* JADX INFO: renamed from: h */
                        public final long getF38830r0() {
                            return abstractC17140aM8631b.getF38830r0();
                        }

                        @Override // p882m1.AbstractC17140a
                        /* JADX INFO: renamed from: i */
                        public final void mo11310i(InterfaceC16039d interfaceC16039d) {
                            AbstractC16544l.m18094g(interfaceC16039d, "<this>");
                            long jMo17602i = interfaceC16039d.mo17602i();
                            int i18 = Build.VERSION.SDK_INT;
                            long j14 = j13;
                            abstractC17140aM8631b.m18904g(interfaceC16039d, jMo17602i, 1.0f, new C14356l(j14, 5, i18 >= 29 ? C14358n.f45047a.m15769a(j14, 5) : new PorterDuffColorFilter(AbstractC14334L.m15617F(j14), AbstractC14334L.m15621J(5))));
                        }
                    };
                    c6021p.m6537c0(objM6514H);
                }
                GizmoIconKt$GizmoIconItem$tintedFallback$1$1 gizmoIconKt$GizmoIconItem$tintedFallback$1$1 = (GizmoIconKt$GizmoIconItem$tintedFallback$1$1) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(617413469);
                Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof InterfaceC9514a));
                if (next != null) {
                    objM19235b = (InterfaceC9514a) next;
                    c6021p.m6553p(false);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                    c6021p.m6553p(false);
                }
                InterfaceC9514a interfaceC9514a = (InterfaceC9514a) objM19235b;
                if (interfaceC9514a == null || (interfaceC0832pMo3165c = interfaceC9514a.mo3165c()) == null) {
                    throw new IllegalStateException("No ImageLoader");
                }
                AbstractC7881F0.m8163b(str2, str, interfaceC0832pMo3165c, AbstractC8079e5.m8501a(interfaceC10459q.mo428M(AbstractC10844c.f32512c), AbstractC20417e.f64539a), null, null, gizmoIconKt$GizmoIconItem$tintedFallback$1$1, null, null, null, C21089j.f67011Z, null, c6021p, ((i13 >> 3) & 14) | ((i13 << 3) & 112), 48, 63408);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(1178072470);
                m10442a(AbstractC8079e5.m8501a(AbstractC8095g5.m8566c(interfaceC10459q, 0.55f).mo428M(AbstractC10844c.f32512c), AbstractC20417e.f64539a), c6021p, 0);
                c6021p.m6553p(false);
            }
            i15 = i17;
            j12 = j13;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8274k(str, str2, interfaceC10459q, j12, i15, i11, i12);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m10447f(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-316668825);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.design_logo_assistant, c6021p, 0), null, AbstractC10844c.m11252l(interfaceC10459q, 40), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12187A, c6021p, 48, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q, i10, 21);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m10448g(InterfaceC11374b0 snorlax, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(snorlax, "snorlax");
        c6021p.m6526U(-1326639232);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(snorlax) : c6021p.m6545h(snorlax) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC17758g.m19481a(interfaceC10459q, null, false, AbstractC8411c.m8969c(507995862, c6021p, new C8275l(snorlax, 0)), c6021p, ((i11 >> 3) & 14) | 3072, 6);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(snorlax, interfaceC10459q, i10, 6);
        }
    }

    /* JADX INFO: renamed from: h */
    public static C17913L0 m10449h(C3676s c3676s) {
        try {
            String testExecutionId = c3676s.m4395w("test_execution_id").mo4384r();
            AbstractC16544l.m18093f(testExecutionId, "testExecutionId");
            return new C17913L0(testExecutionId);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type CiTest", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type CiTest", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type CiTest", e12);
        }
    }
}
