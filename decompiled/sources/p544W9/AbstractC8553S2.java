package p544W9;

import android.view.View;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p650ui.viewinterop.AbstractC10869a;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p002A0.C0146w;
import p003A1.AbstractC0168G;
import p003A1.C0248f0;
import p003A1.C0298w;
import p045Bj.C1307e;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.AbstractC19744u;
import p127El.C2577c;
import p229J0.C4171z3;
import p249Jl.SurfaceHolderCallbackC4482b;
import p270Ki.C4700a;
import p270Ki.C4701b;
import p270Ki.C4702c;
import p270Ki.C4703d;
import p270Ki.C4704e;
import p270Ki.C4705f;
import p273Kl.C4727J0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p387Pl.AbstractC6482b0;
import p387Pl.C6457D;
import p387Pl.C6501u;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9873d3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p895n1.C17425e;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: W9.S2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8553S2 {

    /* JADX INFO: renamed from: a */
    public static C17425e f26382a;

    /* JADX INFO: renamed from: a */
    public static final void m9211a(InterfaceC10459q interfaceC10459q, C6501u c6501u, C4727J0 c4727j0, C6021p c6021p, int i10) {
        int i11;
        InterfaceC5985X interfaceC5985X;
        InterfaceC5985X interfaceC5985X2;
        c6021p.m6526U(1430469058);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c6501u) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c4727j0) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-669986941);
            if (((View) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32829f)).isInEditMode()) {
                AbstractC17780r.m19507a(AbstractC10833a.m11207b(c10456n, C14365u.f45052b, AbstractC14334L.f44973a).mo428M(interfaceC10459q), c6021p, 0);
                c6021p.m6553p(false);
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C4701b(interfaceC10459q, c6501u, c4727j0, i10, 1);
                    return;
                }
                return;
            }
            if (c4727j0 == null || c6501u == null) {
                c6021p.m6553p(false);
                C6018n0 c6018n0M6555r2 = c6021p.m6555r();
                if (c6018n0M6555r2 != null) {
                    c6018n0M6555r2.f19536d = new C4701b(interfaceC10459q, c6501u, c4727j0, i10, 2);
                    return;
                }
                return;
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-669978082);
            boolean zM6542f = c6021p.m6542f(c4727j0) | c6021p.m6542f(c6501u);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                objM6514H = new C2577c(c6501u);
                c6021p.m6537c0(objM6514H);
            }
            C2577c c2577c = (C2577c) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-669975242);
            boolean zM6542f2 = c6021p.m6542f(c4727j0) | c6021p.m6542f(c6501u);
            Object objM6514H2 = c6021p.m6514H();
            Object obj2 = objM6514H2;
            if (zM6542f2 || objM6514H2 == obj) {
                C4700a c4700a = new C4700a();
                c4700a.f15280b = c4700a.mo5400b();
                c4700a.f15281c = c4700a.mo5401d();
                c6021p.m6537c0(c4700a);
                obj2 = c4700a;
            }
            C4700a c4700a2 = (C4700a) obj2;
            Object objM530s = AbstractC0168G.m530s(-669972750, c6021p, false);
            C5975S c5975s = C5975S.f19448r0;
            if (objM530s == obj) {
                objM530s = C5997d.m6430Q(null, c5975s);
                c6021p.m6537c0(objM530s);
            }
            InterfaceC5985X interfaceC5985X3 = (InterfaceC5985X) objM530s;
            Object objM530s2 = AbstractC0168G.m530s(-669970043, c6021p, false);
            if (objM530s2 == obj) {
                objM530s2 = C5997d.m6430Q(null, c5975s);
                c6021p.m6537c0(objM530s2);
            }
            InterfaceC5985X interfaceC5985X4 = (InterfaceC5985X) objM530s2;
            c6021p.m6553p(false);
            InterfaceC5985X interfaceC5985XM9805a = AbstractC9233X.m9805a(AbstractC9873d3.m10529c(new C0298w(0, 2, C6501u.class, c6501u, "options", "getOptions()Lio/livekit/android/room/track/LocalVideoTrackOptions;")), C4705f.f15298Y, c6021p, 48);
            SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b = (SurfaceHolderCallbackC4482b) interfaceC5985X4.getValue();
            Boolean bool = (Boolean) interfaceC5985XM9805a.getValue();
            bool.getClass();
            c6021p.m6524S(-669945407);
            boolean zM6542f3 = c6021p.m6542f(interfaceC5985XM9805a);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == obj) {
                interfaceC5985X = interfaceC5985X4;
                objM6514H3 = new C4702c(interfaceC5985X, interfaceC5985XM9805a, 0);
                c6021p.m6537c0(objM6514H3);
            } else {
                interfaceC5985X = interfaceC5985X4;
            }
            c6021p.m6553p(false);
            C5997d.m6446d(surfaceHolderCallbackC4482b, bool, (InterfaceC1436k) objM6514H3, c6021p);
            c6021p.m6524S(-669942091);
            boolean zM6545h = c6021p.m6545h(c4700a2);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h || objM6514H4 == obj) {
                interfaceC5985X2 = interfaceC5985X3;
                objM6514H4 = new C0146w(c4700a2, interfaceC5985X, interfaceC5985X2, 24);
                c6021p.m6537c0(objM6514H4);
            } else {
                interfaceC5985X2 = interfaceC5985X3;
            }
            c6021p.m6553p(false);
            C5997d.m6446d(c4727j0, c6501u, (InterfaceC1436k) objM6514H4, c6021p);
            String strValueOf = String.valueOf(c6021p.f19564P);
            c6021p.m6524S(-669936635);
            Object objM6514H5 = c6021p.m6514H();
            if (objM6514H5 == obj) {
                objM6514H5 = new C0248f0(interfaceC5985X, 19);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            C5997d.m6444c(strValueOf, (InterfaceC1436k) objM6514H5, c6021p);
            c6021p.m6524S(-669920172);
            boolean zM6545h2 = c6021p.m6545h(c4700a2);
            Object objM6514H6 = c6021p.m6514H();
            if (zM6545h2 || objM6514H6 == obj) {
                objM6514H6 = new C4171z3(c4700a2, 3);
                c6021p.m6537c0(objM6514H6);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11318d = AbstractC10868a.m11318d(interfaceC10459q, (InterfaceC1436k) objM6514H6);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(-669917429);
            boolean zM6545h3 = c6021p.m6545h(c2577c);
            Object objM6514H7 = c6021p.m6514H();
            if (zM6545h3 || objM6514H7 == obj) {
                objM6514H7 = new C4703d(c2577c, null);
                c6021p.m6537c0(objM6514H7);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM20694b = AbstractC19744u.m20694b(interfaceC10459qM11318d, c17296c, (InterfaceC1439n) objM6514H7);
            c6021p.m6524S(-669933148);
            boolean zM6545h4 = c6021p.m6545h(c4727j0) | c6021p.m6545h(c4700a2) | c6021p.m6545h(c6501u);
            Object objM6514H8 = c6021p.m6514H();
            if (zM6545h4 || objM6514H8 == obj) {
                Object c4704e = new C4704e(c4727j0, c6501u, c4700a2, interfaceC5985X2, interfaceC5985X);
                c6021p.m6537c0(c4704e);
                objM6514H8 = c4704e;
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H8;
            c6021p.m6553p(false);
            c6021p.m6524S(-669923570);
            boolean zM6545h5 = c6021p.m6545h(c4700a2) | c6021p.m6545h(c6501u);
            Object objM6514H9 = c6021p.m6514H();
            if (zM6545h5 || objM6514H9 == obj) {
                Object c1307e = new C1307e(c6501u, c4700a2, interfaceC5985X2, interfaceC5985X, 9);
                c6021p.m6537c0(c1307e);
                objM6514H9 = c1307e;
            }
            c6021p.m6553p(false);
            AbstractC10869a.m11356b(interfaceC1436k, interfaceC10459qM20694b, (InterfaceC1436k) objM6514H9, c6021p, 0, 0);
        }
        C6018n0 c6018n0M6555r3 = c6021p.m6555r();
        if (c6018n0M6555r3 != null) {
            c6018n0M6555r3.f19536d = new C4701b(interfaceC10459q, c6501u, c4727j0, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9212b(C4700a c4700a, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, AbstractC6482b0 abstractC6482b0, SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b) {
        AbstractC6482b0 abstractC6482b1;
        if (AbstractC16544l.m18089b((AbstractC6482b0) interfaceC5985X.getValue(), abstractC6482b0)) {
            return;
        }
        SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b2 = (SurfaceHolderCallbackC4482b) interfaceC5985X2.getValue();
        if (surfaceHolderCallbackC4482b2 != null && (abstractC6482b1 = (AbstractC6482b0) interfaceC5985X.getValue()) != null) {
            abstractC6482b1.mo7041i(surfaceHolderCallbackC4482b2);
        }
        interfaceC5985X.setValue(null);
        interfaceC5985X.setValue(abstractC6482b0);
        if (abstractC6482b0 instanceof C6457D) {
            ((C6457D) abstractC6482b0).m7042j(surfaceHolderCallbackC4482b, c4700a);
        } else {
            abstractC6482b0.mo7040g(surfaceHolderCallbackC4482b);
        }
    }
}
