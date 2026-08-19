package p124Ei;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.VideoCapturer;
import mm.C17296C;
import p003A1.C0298w;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2149O0;
import p1160zp.AbstractC22225a;
import p349O0.C5994b0;
import p387Pl.C6500t;
import p387Pl.C6501u;
import p387Pl.EnumC6481b;
import p435Rl.C6924h;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9873d3;
import p758g0.C13756d;
import p867l8.C16831c;
import p909nm.AbstractC17678l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C2518j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C6501u f7821Y;

    /* JADX INFO: renamed from: Z */
    public int f7822Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6501u f7823o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13756d f7824p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C5994b0 f7825q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2518j(C6501u c6501u, C13756d c13756d, C5994b0 c5994b0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7823o0 = c6501u;
        this.f7824p0 = c13756d;
        this.f7825q0 = c5994b0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2518j(this.f7823o0, this.f7824p0, this.f7825q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2518j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:0x0132  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C6501u c6501u;
        EnumC6481b enumC6481b;
        C6500t c6500t;
        Object obj2;
        EnumC8397i enumC8397i;
        Float f10;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7822Z;
        C17296C c17296c = C17296C.f55119a;
        C13756d c13756d = this.f7824p0;
        if (i10 != 0) {
            if (i10 == 1) {
                c6501u = this.f7821Y;
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                AbstractC9233X.m9807c(obj);
                f10 = new Float(1.0f);
                this.f7822Z = 3;
                if (C13756d.m15222c(c13756d, f10, null, null, this, 14) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        C6501u c6501u2 = this.f7823o0;
        if (c6501u2 == null) {
            return c17296c;
        }
        Float f11 = new Float(0.0f);
        this.f7821Y = c6501u2;
        this.f7822Z = 1;
        if (C13756d.m15222c(c13756d, f11, null, null, this, 14) == enumC19250a) {
            return enumC19250a;
        }
        c6501u = c6501u2;
        C5994b0 c5994b0 = this.f7825q0;
        c5994b0.m6410h(c5994b0.m6409g() + 180.0f);
        EnumC6481b enumC6481b2 = c6501u.m7065l().f21099c;
        int i11 = enumC6481b2 == null ? -1 : AbstractC2515i.f7816a[enumC6481b2.ordinal()];
        if (i11 == -1 || i11 == 1) {
            enumC6481b = EnumC6481b.f21035Z;
        } else {
            if (i11 != 2) {
                throw new C0644w();
            }
            enumC6481b = EnumC6481b.f21034Y;
        }
        VideoCapturer videoCapturer = c6501u.f21089n;
        CameraVideoCapturer cameraVideoCapturer = videoCapturer instanceof CameraVideoCapturer ? (CameraVideoCapturer) videoCapturer : null;
        if (cameraVideoCapturer == null) {
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i2 = EnumC8397i.f26119p0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18571j(new Object[0]);
            }
        } else {
            C16525B c16525b = new C16525B();
            ArrayList arrayList = C6924h.f22195a;
            Context context = c6501u.f21086k;
            AbstractC16544l.m18094g(context, "context");
            CameraEnumerator cameraEnumeratorProvideEnumerator = C6924h.m7312d(context).provideEnumerator(context);
            String strM7310b = C6924h.m7310b(cameraEnumeratorProvideEnumerator, null, enumC6481b, false);
            c16525b.f51262Y = strM7310b;
            if (strM7310b == null) {
                String[] deviceNames = cameraEnumeratorProvideEnumerator.getDeviceNames();
                if (deviceNames.length < 2) {
                    C8395g c8395g2 = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i3 = EnumC8397i.f26119p0;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i3.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18571j(new Object[0]);
                    }
                } else {
                    c16525b.f51262Y = deviceNames[(AbstractC17678l.m19279B(c6501u.m7065l().f21098b, deviceNames) + 1) % deviceNames.length];
                    c6500t = new C6500t(cameraVideoCapturer, c6501u, c16525b, cameraEnumeratorProvideEnumerator);
                    obj2 = c16525b.f51262Y;
                    if (obj2 == null) {
                        C8395g c8395g3 = AbstractC8396h.Companion;
                        enumC8397i = EnumC8397i.f26119p0;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18571j(new Object[0]);
                        }
                    } else {
                        cameraVideoCapturer.switchCamera(c6500t, (String) obj2);
                    }
                }
            } else {
                c6500t = new C6500t(cameraVideoCapturer, c6501u, c16525b, cameraEnumeratorProvideEnumerator);
                obj2 = c16525b.f51262Y;
                if (obj2 == null) {
                    C8395g c8395g4 = AbstractC8396h.Companion;
                    enumC8397i = EnumC8397i.f26119p0;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0) {
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18571j(new Object[0]);
                    }
                } else {
                    cameraVideoCapturer.switchCamera(c6500t, (String) obj2);
                }
            }
        }
        InterfaceC2149O0 interfaceC2149O0M10529c = AbstractC9873d3.m10529c(new C0298w(0, 1, C6501u.class, c6501u, "options", "getOptions()Lio/livekit/android/room/track/LocalVideoTrackOptions;"));
        C2512h c2512h = new C2512h(enumC6481b, null);
        this.f7821Y = null;
        this.f7822Z = 2;
        if (AbstractC2124C.m3220s(interfaceC2149O0M10529c, c2512h, this) == enumC19250a) {
            return enumC19250a;
        }
        f10 = new Float(1.0f);
        this.f7822Z = 3;
        if (C13756d.m15222c(c13756d, f10, null, null, this, 14) == enumC19250a) {
            return enumC19250a;
        }
        return c17296c;
    }
}
