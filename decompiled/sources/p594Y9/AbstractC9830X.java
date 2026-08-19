package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0178J0;
import p006A4.C0349j;
import p049Bm.InterfaceC1426a;
import p124Ei.C2535p;
import p193Hf.C3321N;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3984T1;
import p293Lh.C5062h;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p382Pf.C6401d;
import p482Tg.C7443a0;
import p507Uh.C7677c;
import p507Uh.InterfaceC7678d;
import p537W0.AbstractC8411c;
import p919o8.C17990m0;

/* JADX INFO: renamed from: Y9.X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9830X {
    /* JADX INFO: renamed from: a */
    public static final void m10472a(C7677c c7677c, InterfaceC1426a onDismiss, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        c6021p.m6526U(1626449571);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c7677c) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6538d(R.string.voice_permission_rationale) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onDismiss) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(1510697430);
            boolean z6 = (i11 & 896) == 256;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C2535p(20, onDismiss);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4682a((InterfaceC1426a) objM6514H, AbstractC8411c.m8969c(-28887829, c6021p, new C0349j(c7677c, 28, onDismiss)), null, AbstractC8411c.m8969c(1374981357, c6021p, new C3321N(7, onDismiss)), null, null, AbstractC8411c.m8969c(-814182160, c6021p, new C7443a0(c7677c, 1)), null, 0L, 0L, 0L, 0L, 0.0f, null, c6021p, 1575984, 0, 16308);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(c7677c, onDismiss, i10, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10473b(InterfaceC7678d permissionState, int i10, InterfaceC1426a onDismiss, C6021p c6021p, int i11) {
        int i12;
        AbstractC16544l.m18094g(permissionState, "permissionState");
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        c6021p.m6526U(-619183924);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(permissionState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6538d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6545h(onDismiss) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1397926234);
            boolean z6 = (i12 & 896) == 256;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C2535p(22, onDismiss);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4682a((InterfaceC1426a) objM6514H, AbstractC8411c.m8969c(-1106511484, c6021p, new C0349j(permissionState, 29, onDismiss)), null, AbstractC8411c.m8969c(-768223934, c6021p, new C3321N(8, onDismiss)), null, null, AbstractC8411c.m8969c(-260792609, c6021p, new C0178J0(i10, permissionState)), null, 0L, 0L, 0L, 0L, 0.0f, null, c6021p, 1575984, 0, 16308);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5062h(i10, i11, 3, permissionState, onDismiss);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C17990m0 m10474c(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C17990m0(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Application", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Application", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Application", e12);
        }
    }
}
