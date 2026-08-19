package p001A;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p1016t3.C19760J;
import p1016t3.InterfaceC19759I;
import p105E.C2222a;
import p1073w3.InterfaceC20806h;
import p1138z.C21572a;
import p178H.InterfaceC3125S;
import p178H.InterfaceC3127U;
import p228J.C3799E;
import p228J.C3825a0;
import p228J.C3835f0;
import p228J.InterfaceC3854p;
import p301M.C5233o;
import p301M.InterfaceC5219a;
import p326N.C5561c;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8577W2;
import p593Y8.C9682i;
import p723e9.C13350h;
import p747fb.InterfaceFutureC13608b;
import p767g9.InterfaceC13831b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.U */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0039U implements InterfaceC5219a, InterfaceC20806h, InterfaceC13831b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f198Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f199Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f200o0;

    public /* synthetic */ C0039U(int i10, C19760J c19760j, C19760J c19760j2) {
        this.f198Y = i10;
        this.f199Z = c19760j;
        this.f200o0 = c19760j2;
    }

    @Override // p767g9.InterfaceC13831b
    /* JADX INFO: renamed from: a */
    public Object mo197a() {
        ((C13350h) this.f199Z).f42355d.m14938a((C9682i) this.f200o0, this.f198Y + 1, false);
        return null;
    }

    @Override // p301M.InterfaceC5219a
    public InterfaceFutureC13608b apply(Object obj) {
        int i10;
        InterfaceC3127U interfaceC3127U;
        C0047Y c0047y = (C0047Y) this.f199Z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) this.f200o0).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C0088t c0088t = c0047y.f224d;
            if (!zHasNext) {
                c0088t.m312s(arrayList2);
                return new C5233o(new ArrayList(arrayList), true, AbstractC8577W2.m9240b());
            }
            C3799E c3799e = (C3799E) it.next();
            C0063g0 c0063g0 = new C0063g0(c3799e);
            InterfaceC3854p interfaceC3854p = null;
            int i11 = c3799e.f11484c;
            if (i11 == 5) {
                C0048Y0 c0048y0 = c0088t.f378w0;
                if (!c0048y0.f233d && !c0048y0.f232c) {
                    try {
                        interfaceC3127U = (InterfaceC3127U) c0048y0.f231b.m12618w();
                    } catch (NoSuchElementException unused) {
                        AbstractC8072d6.m8487d("ZslControlImpl", "dequeueImageFromBuffer no such element");
                        interfaceC3127U = null;
                    }
                    if (interfaceC3127U != null) {
                        C0048Y0 c0048y1 = c0088t.f378w0;
                        c0048y1.getClass();
                        Image imageMo3971w0 = interfaceC3127U.mo3971w0();
                        ImageWriter imageWriter = c0048y1.f239j;
                        if (imageWriter != null && imageMo3971w0 != null) {
                            try {
                                imageWriter.queueInputImage(imageMo3971w0);
                                InterfaceC3125S interfaceC3125SMo3968k0 = interfaceC3127U.mo3968k0();
                                if (interfaceC3125SMo3968k0 instanceof C5561c) {
                                    interfaceC3854p = ((C5561c) interfaceC3125SMo3968k0).f18029a;
                                }
                            } catch (IllegalStateException e10) {
                                AbstractC8072d6.m8487d("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
                            }
                        }
                    }
                }
            }
            if (interfaceC3854p != null) {
                c0063g0.f290h = interfaceC3854p;
            } else {
                if (c0047y.f221a != 3 || c0047y.f226f) {
                    i10 = (i11 == -1 || i11 == 5) ? 2 : -1;
                } else {
                    i10 = 4;
                }
                if (i10 != -1) {
                    c0063g0.f283a = i10;
                }
            }
            C2222a c2222a = c0047y.f225e;
            if (c2222a.f6806b && this.f198Y == 0 && c2222a.f6805a) {
                C3825a0 c3825a0M4558d = C3825a0.m4558d();
                c3825a0M4558d.m4561x(C21572a.m21847d0(CaptureRequest.CONTROL_AE_MODE), 3);
                c0063g0.m243c(new C21572a(C3835f0.m4568a(c3825a0M4558d), 8));
            }
            arrayList.add(AbstractC16347a.m17947b(new C0072l(c0047y, 5, c0063g0)));
            arrayList2.add(c0063g0.m244d());
        }
    }

    @Override // p1073w3.InterfaceC20806h
    public void invoke(Object obj) {
        InterfaceC19759I interfaceC19759I = (InterfaceC19759I) obj;
        interfaceC19759I.getClass();
        interfaceC19759I.mo2763k(this.f198Y, (C19760J) this.f199Z, (C19760J) this.f200o0);
    }

    public /* synthetic */ C0039U(Object obj, int i10, Object obj2) {
        this.f199Z = obj;
        this.f200o0 = obj2;
        this.f198Y = i10;
    }
}
