package p003A1;

import androidx.compose.p650ui.node.Owner;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6014l0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p537W0.C8410b;

/* JADX INFO: renamed from: A1.M0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0187M0 {

    /* JADX INFO: renamed from: a */
    public static final C5984W0 f699a = new C5984W0(C0244e0.f929u0);

    /* JADX INFO: renamed from: b */
    public static final C5984W0 f700b = new C5984W0(C0244e0.f930v0);

    /* JADX INFO: renamed from: c */
    public static final C5984W0 f701c = new C5984W0(C0244e0.f931w0);

    /* JADX INFO: renamed from: d */
    public static final C5984W0 f702d = new C5984W0(C0244e0.f932x0);

    /* JADX INFO: renamed from: e */
    public static final C5984W0 f703e = new C5984W0(C0244e0.f908C0);

    /* JADX INFO: renamed from: f */
    public static final C5984W0 f704f = new C5984W0(C0244e0.f933y0);

    /* JADX INFO: renamed from: g */
    public static final C5984W0 f705g = new C5984W0(C0244e0.f934z0);

    /* JADX INFO: renamed from: h */
    public static final C5984W0 f706h = new C5984W0(C0244e0.f907B0);

    /* JADX INFO: renamed from: i */
    public static final C5984W0 f707i = new C5984W0(C0244e0.f906A0);

    /* JADX INFO: renamed from: j */
    public static final C5984W0 f708j = new C5984W0(C0244e0.f909D0);

    /* JADX INFO: renamed from: k */
    public static final C5984W0 f709k = new C5984W0(C0244e0.f910E0);

    /* JADX INFO: renamed from: l */
    public static final C5984W0 f710l = new C5984W0(C0244e0.f911F0);

    /* JADX INFO: renamed from: m */
    public static final C5984W0 f711m = new C5984W0(C0244e0.f915J0);

    /* JADX INFO: renamed from: n */
    public static final C5984W0 f712n = new C5984W0(C0244e0.f914I0);

    /* JADX INFO: renamed from: o */
    public static final C5984W0 f713o = new C5984W0(C0244e0.f916K0);

    /* JADX INFO: renamed from: p */
    public static final C5984W0 f714p = new C5984W0(C0244e0.f917L0);

    /* JADX INFO: renamed from: q */
    public static final C5984W0 f715q = new C5984W0(C0244e0.f918M0);

    /* JADX INFO: renamed from: r */
    public static final C5984W0 f716r = new C5984W0(C0244e0.f919N0);

    /* JADX INFO: renamed from: s */
    public static final C5984W0 f717s = new C5984W0(C0244e0.f912G0);

    /* JADX INFO: renamed from: t */
    public static final C6037x f718t = new C6037x(C0244e0.f913H0, C5975S.f19448r0);

    /* JADX INFO: renamed from: a */
    public static final void m568a(Owner owner, InterfaceC0309z1 interfaceC0309z1, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(874662829);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(owner) : c6021p.m6545h(owner) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(interfaceC0309z1) : c6021p.m6545h(interfaceC0309z1) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C6014l0 c6014l0Mo6405a = f699a.mo6405a(owner.getAccessibilityManager());
            C6014l0 c6014l0Mo6405a2 = f700b.mo6405a(owner.getAutofill());
            C6014l0 c6014l0Mo6405a3 = f701c.mo6405a(owner.getAutofillTree());
            C6014l0 c6014l0Mo6405a4 = f702d.mo6405a(owner.getClipboardManager());
            C6014l0 c6014l0Mo6405a5 = f704f.mo6405a(owner.getDensity());
            C6014l0 c6014l0Mo6405a6 = f705g.mo6405a(owner.getFocusOwner());
            C6014l0 c6014l0Mo6405a7 = f706h.mo6405a(owner.getFontLoader());
            c6014l0Mo6405a7.f19520f = false;
            C6014l0 c6014l0Mo6405a8 = f707i.mo6405a(owner.getFontFamilyResolver());
            c6014l0Mo6405a8.f19520f = false;
            C5997d.m6442b(new C6014l0[]{c6014l0Mo6405a, c6014l0Mo6405a2, c6014l0Mo6405a3, c6014l0Mo6405a4, c6014l0Mo6405a5, c6014l0Mo6405a6, c6014l0Mo6405a7, c6014l0Mo6405a8, f708j.mo6405a(owner.getHapticFeedBack()), f709k.mo6405a(owner.getInputModeManager()), f710l.mo6405a(owner.getLayoutDirection()), f711m.mo6405a(owner.getTextInputService()), f712n.mo6405a(owner.getSoftwareKeyboardController()), f713o.mo6405a(owner.getTextToolbar()), f714p.mo6405a(interfaceC0309z1), f715q.mo6405a(owner.getViewConfiguration()), f716r.mo6405a(owner.getWindowInfo()), f717s.mo6405a(owner.getPointerIconService()), f703e.mo6405a(owner.getGraphicsContext())}, c8410b, c6021p, ((i11 >> 3) & 112) | 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(owner, interfaceC0309z1, c8410b, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m569b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
