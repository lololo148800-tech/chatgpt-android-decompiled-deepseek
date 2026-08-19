package p155G;

import p001A.C0072l;
import p001A.C0088t;
import p001A.RunnableC0000A;
import p109E3.C2292p;
import p301M.AbstractC5229k;
import p610Z1.C10142i;
import p610Z1.InterfaceC10143j;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: G.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2949a implements InterfaceC10143j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8822Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2951c f8823Z;

    public /* synthetic */ C2949a(C2951c c2951c, int i10) {
        this.f8822Y = i10;
        this.f8823Z = c2951c;
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public final Object mo169b(final C10142i c10142i) {
        switch (this.f8822Y) {
            case 0:
                final C2951c c2951c = this.f8823Z;
                c2951c.getClass();
                final int i10 = 1;
                c2951c.f8830d.execute(new Runnable() { // from class: G.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                C10142i c10142i2 = c10142i;
                                C2951c c2951c2 = c2951c;
                                c2951c2.f8828b = true;
                                C2292p c2292p = new C2292p("Camera2CameraControl was updated with new options.");
                                C10142i c10142i3 = c2951c2.f8833g;
                                if (c10142i3 != null) {
                                    c10142i3.m10748b(c2292p);
                                    c2951c2.f8833g = null;
                                }
                                c2951c2.f8833g = c10142i2;
                                if (c2951c2.f8827a) {
                                    C0088t c0088t = c2951c2.f8829c;
                                    c0088t.getClass();
                                    AbstractC5229k.m5780d(AbstractC16347a.m17947b(new C0072l(c0088t, 0))).mo5766a(new RunnableC0000A(c2951c2, 14), c2951c2.f8830d);
                                    c2951c2.f8828b = false;
                                }
                                break;
                            default:
                                C10142i c10142i4 = c10142i;
                                C2951c c2951c3 = c2951c;
                                c2951c3.f8828b = true;
                                C2292p c2292p2 = new C2292p("Camera2CameraControl was updated with new options.");
                                C10142i c10142i5 = c2951c3.f8833g;
                                if (c10142i5 != null) {
                                    c10142i5.m10748b(c2292p2);
                                    c2951c3.f8833g = null;
                                }
                                c2951c3.f8833g = c10142i4;
                                if (c2951c3.f8827a) {
                                    C0088t c0088t2 = c2951c3.f8829c;
                                    c0088t2.getClass();
                                    AbstractC5229k.m5780d(AbstractC16347a.m17947b(new C0072l(c0088t2, 0))).mo5766a(new RunnableC0000A(c2951c3, 14), c2951c3.f8830d);
                                    c2951c3.f8828b = false;
                                }
                                break;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final C2951c c2951c2 = this.f8823Z;
                c2951c2.getClass();
                final int i11 = 0;
                c2951c2.f8830d.execute(new Runnable() { // from class: G.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                C10142i c10142i2 = c10142i;
                                C2951c c2951c3 = c2951c2;
                                c2951c3.f8828b = true;
                                C2292p c2292p = new C2292p("Camera2CameraControl was updated with new options.");
                                C10142i c10142i3 = c2951c3.f8833g;
                                if (c10142i3 != null) {
                                    c10142i3.m10748b(c2292p);
                                    c2951c3.f8833g = null;
                                }
                                c2951c3.f8833g = c10142i2;
                                if (c2951c3.f8827a) {
                                    C0088t c0088t = c2951c3.f8829c;
                                    c0088t.getClass();
                                    AbstractC5229k.m5780d(AbstractC16347a.m17947b(new C0072l(c0088t, 0))).mo5766a(new RunnableC0000A(c2951c3, 14), c2951c3.f8830d);
                                    c2951c3.f8828b = false;
                                }
                                break;
                            default:
                                C10142i c10142i4 = c10142i;
                                C2951c c2951c4 = c2951c2;
                                c2951c4.f8828b = true;
                                C2292p c2292p2 = new C2292p("Camera2CameraControl was updated with new options.");
                                C10142i c10142i5 = c2951c4.f8833g;
                                if (c10142i5 != null) {
                                    c10142i5.m10748b(c2292p2);
                                    c2951c4.f8833g = null;
                                }
                                c2951c4.f8833g = c10142i4;
                                if (c2951c4.f8827a) {
                                    C0088t c0088t2 = c2951c4.f8829c;
                                    c0088t2.getClass();
                                    AbstractC5229k.m5780d(AbstractC16347a.m17947b(new C0072l(c0088t2, 0))).mo5766a(new RunnableC0000A(c2951c4, 14), c2951c4.f8830d);
                                    c2951c4.f8828b = false;
                                }
                                break;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
