package cf;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p042Bf.C1276r;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p204I1.C3598n;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.C3941K4;
import p229J0.C4135t3;
import p246Ji.C4364d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p362Of.C6186a;
import p467T1.C7199i;
import p478Tc.AbstractC7306j;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8079e5;
import p594Y9.AbstractC9746I4;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17792x;
import p911o0.C17756f;
import p911o0.C17764j;

/* JADX INFO: renamed from: cf.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11728d {

    /* JADX INFO: renamed from: a */
    public static final float f35567a;

    static {
        float f10 = AbstractC7312p.f23184a;
        f35567a = AbstractC7312p.f23188e / 1.5f;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m13033a(String gizmoId, InterfaceC1436k onStarSelect, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        boolean z6;
        boolean z10;
        Object objM6514H;
        InterfaceC10459q interfaceC10459q4;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        AbstractC16544l.m18094g(onStarSelect, "onStarSelect");
        c6021p.m6526U(17586629);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(gizmoId) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(onStarSelect) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            if ((i12 & 147) == 146 || !c6021p.m6562y()) {
                if (i13 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(AbstractC10842a.m11234l(interfaceC10459q3, AbstractC7313q.f23201f, AbstractC7313q.f23199d), ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13379c);
                c6021p.m6524S(-334446061);
                if ((i12 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z10 = z6 | ((i12 & 14) == 4);
                objM6514H = c6021p.m6514H();
                if (z10 || objM6514H == C6013l.f19514a) {
                    objM6514H = new C6186a(2, gizmoId, onStarSelect);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC3914G1.m4611a(AbstractC11726b.f35561a, AbstractC10833a.m11209d(interfaceC10459qM8501a, false, null, (InterfaceC1426a) objM6514H, 7), null, null, AbstractC11726b.f35562b, AbstractC11726b.f35563c, null, AbstractC7306j.f23143a, 0.0f, c6021p, 221190, 332);
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1276r((Object) gizmoId, (Object) onStarSelect, interfaceC10459q4, i10, i11, 10);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        if ((i12 & 147) == 146) {
            if (i13 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            InterfaceC10459q interfaceC10459qM8501a2 = AbstractC8079e5.m8501a(AbstractC10842a.m11234l(interfaceC10459q3, AbstractC7313q.f23201f, AbstractC7313q.f23199d), ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13379c);
            c6021p.m6524S(-334446061);
            if ((i12 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            z10 = z6 | ((i12 & 14) == 4);
            objM6514H = c6021p.m6514H();
            if (z10) {
                objM6514H = new C6186a(2, gizmoId, onStarSelect);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C6186a(2, gizmoId, onStarSelect);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(AbstractC11726b.f35561a, AbstractC10833a.m11209d(interfaceC10459qM8501a2, false, null, (InterfaceC1426a) objM6514H, 7), null, null, AbstractC11726b.f35562b, AbstractC11726b.f35563c, null, AbstractC7306j.f23143a, 0.0f, c6021p, 221190, 332);
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            if (i13 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            InterfaceC10459q interfaceC10459qM8501a3 = AbstractC8079e5.m8501a(AbstractC10842a.m11234l(interfaceC10459q3, AbstractC7313q.f23201f, AbstractC7313q.f23199d), ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13379c);
            c6021p.m6524S(-334446061);
            if ((i12 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            z10 = z6 | ((i12 & 14) == 4);
            objM6514H = c6021p.m6514H();
            if (z10) {
                objM6514H = new C6186a(2, gizmoId, onStarSelect);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C6186a(2, gizmoId, onStarSelect);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(AbstractC11726b.f35561a, AbstractC10833a.m11209d(interfaceC10459qM8501a3, false, null, (InterfaceC1426a) objM6514H, 7), null, null, AbstractC11726b.f35562b, AbstractC11726b.f35563c, null, AbstractC7306j.f23143a, 0.0f, c6021p, 221190, 332);
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r((Object) gizmoId, (Object) onStarSelect, interfaceC10459q4, i10, i11, 10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13034b(int i10, InterfaceC1436k onRatingChange, InterfaceC10459q interfaceC10459q, int i11, C6021p c6021p, int i12) {
        int i13;
        int i14;
        boolean z6;
        int i15;
        int i16;
        int i17;
        AbstractC16544l.m18094g(onRatingChange, "onRatingChange");
        c6021p.m6526U(-1433106567);
        if ((i12 & 48) == 0) {
            i13 = (c6021p.m6538d(i10) ? 32 : 16) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 384) == 0) {
            i13 |= c6021p.m6545h(onRatingChange) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        int i18 = i13 | 24576;
        if ((i18 & 9361) == 9360 && c6021p.m6562y()) {
            c6021p.m6517L();
            i17 = i11;
        } else {
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
            c6021p.m6524S(-1815691510);
            boolean z10 = ((i18 & 112) == 32) | ((57344 & i18) == 16384) | ((i18 & 896) == 256);
            Object objM6514H = c6021p.m6514H();
            if (z10 || objM6514H == C6013l.f19514a) {
                objM6514H = new C3598n(5, i10, onRatingChange);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9746I4.m10338b(interfaceC10459q, null, null, false, c17764jM19500g, null, null, false, (InterfaceC1436k) objM6514H, c6021p, (i18 >> 9) & 14, 238);
            if (i10 == 1) {
                i14 = 5;
                z6 = false;
                i15 = -1815632172;
                i16 = R.string.gizmo_rating_one_star;
            } else if (i10 == 2) {
                i14 = 5;
                z6 = false;
                i15 = -1815630091;
                i16 = R.string.gizmo_rating_two_stars;
            } else if (i10 == 3) {
                i14 = 5;
                z6 = false;
                i15 = -1815627977;
                i16 = R.string.gizmo_rating_three_stars;
            } else if (i10 != 4) {
                i14 = 5;
                if (i10 != 5) {
                    i15 = -1815621420;
                    i16 = R.string.gizmo_rating_no_stars;
                    z6 = false;
                } else {
                    z6 = false;
                    i15 = -1815623658;
                    i16 = R.string.gizmo_rating_five_stars;
                }
            } else {
                i14 = 5;
                z6 = false;
                i15 = -1815625802;
                i16 = R.string.gizmo_rating_four_stars;
            }
            AbstractC4124r4.m4768b(AbstractC17792x.m19533p(c6021p, i15, i16, c6021p, z6), null, 0L, 0L, null, null, null, 0L, null, new C7199i(i14), 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12154j, c6021p, 0, 0, 65022);
            i17 = i14;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4364d(i10, onRatingChange, interfaceC10459q, i17, i12, 1);
        }
    }
}
