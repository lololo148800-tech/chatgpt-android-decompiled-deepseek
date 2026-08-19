package p228J;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import p001A.C0026N;
import p001A.C0063g0;
import p001A.C0071k0;
import p001A.C0075m0;
import p001A.C0077n0;
import p079D.AbstractC1762b;
import p105E.AbstractC2225d;
import p1138z.C21572a;
import p117Eb.C2392v;
import p155G.C2953e;
import p178H.C3175v;

/* JADX INFO: renamed from: J.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3857q0 extends AbstractC3855p0 {
    /* JADX INFO: renamed from: d */
    public static C3857q0 m4583d(InterfaceC3800E0 interfaceC3800E0, Size size) {
        if (interfaceC3800E0.mo47n() == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC3800E0.mo51v(interfaceC3800E0.toString()));
        }
        C3857q0 c3857q0 = new C3857q0();
        C3865u0 c3865u0Mo50u = interfaceC3800E0.mo50u();
        C3835f0 c3835f0 = C3835f0.f11603o0;
        int i10 = C3865u0.m4590a().f11683g.f11484c;
        if (c3865u0Mo50u != null) {
            i10 = c3865u0Mo50u.f11683g.f11484c;
            for (CameraDevice.StateCallback stateCallback : c3865u0Mo50u.f11679c) {
                ArrayList arrayList = c3857q0.f11657c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : c3865u0Mo50u.f11680d) {
                ArrayList arrayList2 = c3857q0.f11658d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            c3857q0.f11656b.m241a(c3865u0Mo50u.f11683g.f11486e);
            c3835f0 = c3865u0Mo50u.f11683g.f11483b;
        }
        C0063g0 c0063g0 = c3857q0.f11656b;
        c0063g0.getClass();
        c0063g0.f287e = C3825a0.m4559o(c3835f0);
        if (interfaceC3800E0 instanceof C3837g0) {
            Rational rational = AbstractC2225d.f6811a;
            if (((PreviewPixelHDRnetQuirk) AbstractC1762b.f5032a.m4579f(PreviewPixelHDRnetQuirk.class)) != null && !AbstractC2225d.f6811a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                C3825a0 c3825a0M4558d = C3825a0.m4558d();
                c3825a0M4558d.m4561x(C21572a.m21847d0(CaptureRequest.TONEMAP_MODE), 2);
                c3857q0.f11656b.m243c(new C21572a(C3835f0.m4568a(c3825a0M4558d), 8));
            }
        }
        c3857q0.f11656b.f283a = ((Integer) interfaceC3800E0.mo36M(C21572a.f68305p0, Integer.valueOf(i10))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) interfaceC3800E0.mo36M(C21572a.f68307r0, new C0075m0());
        ArrayList arrayList3 = c3857q0.f11657c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) interfaceC3800E0.mo36M(C21572a.f68308s0, new C0071k0());
        ArrayList arrayList4 = c3857q0.f11658d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        C0077n0 c0077n0 = new C0077n0((CameraCaptureSession.CaptureCallback) interfaceC3800E0.mo36M(C21572a.f68309t0, new C0026N()));
        c3857q0.f11656b.m242b(c0077n0);
        ArrayList arrayList5 = c3857q0.f11659e;
        if (!arrayList5.contains(c0077n0)) {
            arrayList5.add(c0077n0);
        }
        int iMo32E = interfaceC3800E0.mo32E();
        if (iMo32E != 0) {
            C0063g0 c0063g1 = c3857q0.f11656b;
            c0063g1.getClass();
            if (iMo32E != 0) {
                ((C3825a0) c0063g1.f287e).m4561x(InterfaceC3800E0.f11495J, Integer.valueOf(iMo32E));
            }
        }
        int iMo35K = interfaceC3800E0.mo35K();
        if (iMo35K != 0) {
            C0063g0 c0063g2 = c3857q0.f11656b;
            c0063g2.getClass();
            if (iMo35K != 0) {
                ((C3825a0) c0063g2.f287e).m4561x(InterfaceC3800E0.f11494H, Integer.valueOf(iMo35K));
            }
        }
        C3825a0 c3825a0M4558d2 = C3825a0.m4558d();
        C3828c c3828c = C21572a.f68310u0;
        c3825a0M4558d2.m4561x(c3828c, (String) interfaceC3800E0.mo36M(c3828c, null));
        C3828c c3828c2 = C21572a.f68306q0;
        Long l4 = (Long) interfaceC3800E0.mo36M(c3828c2, -1L);
        l4.getClass();
        c3825a0M4558d2.m4561x(c3828c2, l4);
        c3857q0.f11656b.m243c(c3825a0M4558d2);
        c3857q0.f11656b.m243c(C2953e.m3777c(interfaceC3800E0).m3779b());
        return c3857q0;
    }

    /* JADX INFO: renamed from: a */
    public final void m4584a(InterfaceC3805H interfaceC3805H) {
        this.f11656b.m243c(interfaceC3805H);
    }

    /* JADX INFO: renamed from: b */
    public final void m4585b(AbstractC3810L abstractC3810L, C3175v c3175v, int i10) {
        C2392v c2392vM4567a = C3832e.m4567a(abstractC3810L);
        if (c3175v == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        c2392vM4567a.f7440r0 = c3175v;
        c2392vM4567a.f7438p0 = Integer.valueOf(i10);
        this.f11655a.add(c2392vM4567a.m3556m());
        ((HashSet) this.f11656b.f286d).add(abstractC3810L);
    }

    /* JADX INFO: renamed from: c */
    public final C3865u0 m4586c() {
        return new C3865u0(new ArrayList(this.f11655a), new ArrayList(this.f11657c), new ArrayList(this.f11658d), new ArrayList(this.f11659e), this.f11656b.m244d(), this.f11660f, this.f11661g, this.f11662h);
    }
}
