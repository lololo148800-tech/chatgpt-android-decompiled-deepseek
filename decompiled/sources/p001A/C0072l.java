package p001A;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.InterfaceC11070F;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p030B2.AbstractC0738T;
import p030B2.C0751d;
import p030B2.InterfaceC0749c;
import p057C3.C1556e;
import p057C3.SurfaceHolderCallbackC1523A;
import p082D2.InterfaceC1860g;
import p082D2.InterfaceC1862i;
import p083D3.C1873k;
import p1016t3.AbstractC19756F;
import p1016t3.C19751A;
import p1016t3.C19753C;
import p1016t3.C19788o;
import p1016t3.InterfaceC19759I;
import p1053v3.C20422c;
import p1060v9.AbstractC20502t;
import p1073w3.InterfaceC20806h;
import p117Eb.AbstractC2367E;
import p117Eb.C2369G;
import p117Eb.C2392v;
import p138F8.vJO.vRJidSveZHcTw;
import p178H.C3124Q;
import p178H.C3132Z;
import p178H.C3152j0;
import p178H.InterfaceC3108A;
import p178H.InterfaceC3127U;
import p182H3.AbstractC3199A;
import p182H3.C3213n;
import p182H3.InterfaceC3225z;
import p202I.C3529e;
import p202I.C3535k;
import p228J.InterfaceC3819V;
import p228J.InterfaceC3820W;
import p301M.C5226h;
import p301M.C5231m;
import p301M.InterfaceC5219a;
import p477Tb.C7296c;
import p523V9.AbstractC8072d6;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p610Z1.InterfaceC10143j;
import p615Z6.C10252z0;
import p720e6.C13287b;
import p746fa.C13597f;
import p746fa.C13606o;
import p746fa.InterfaceC13592a;
import p746fa.InterfaceC13594c;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;
import p999s.C19376s;

/* JADX INFO: renamed from: A.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0072l implements InterfaceC10143j, InterfaceC11070F, InterfaceC5219a, InterfaceC3819V, InterfaceC20806h, InterfaceC1860g, InterfaceC13592a, InterfaceC13594c, InterfaceC3108A, InterfaceC3225z {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f309Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f310Z;

    public /* synthetic */ C0072l(Object obj, int i10) {
        this.f309Y = i10;
        this.f310Z = obj;
    }

    @Override // p182H3.InterfaceC3225z
    /* JADX INFO: renamed from: a */
    public int mo254a(Object obj) {
        C3213n c3213n = (C3213n) obj;
        c3213n.getClass();
        C19788o c19788o = (C19788o) this.f310Z;
        String str = c19788o.f62752m;
        String str2 = c3213n.f9704b;
        return ((str2.equals(str) || str2.equals(AbstractC3199A.m4045b(c19788o))) && c3213n.m4078c(c19788o, false)) ? 1 : 0;
    }

    @Override // p301M.InterfaceC5219a
    public InterfaceFutureC13608b apply(Object obj) {
        C0047Y c0047y = (C0047Y) this.f310Z;
        c0047y.getClass();
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return C5231m.f16977o0;
        }
        long j10 = c0047y.f227g;
        C0030P c0030p = new C0030P(2);
        long millis = TimeUnit.NANOSECONDS.toMillis(j10);
        C0051a0 c0051a0 = new C0051a0(c0030p);
        C0088t c0088t = c0047y.f224d;
        c0088t.m297a(c0051a0);
        RunnableC0074m runnableC0074m = new RunnableC0074m(c0088t, 7, c0051a0);
        C10145l c10145l = c0051a0.f241b;
        c10145l.f30070Z.mo5766a(runnableC0074m, c0088t.f369Z);
        return AbstractC16347a.m17947b(new C5226h(c10145l, c0047y.f223c, millis, 0));
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        switch (this.f309Y) {
            case 0:
                C0088t c0088t = (C0088t) this.f310Z;
                c0088t.getClass();
                c0088t.f369Z.execute(new RunnableC0074m(c0088t, 0, c10142i));
                return "updateSessionConfigAsync";
            case 1:
            case 2:
            case 6:
            default:
                C0084r c0084r = (C0084r) this.f310Z;
                c0084r.f336c = c10142i;
                return "RequestCompleteListener[" + c0084r + "]";
            case 3:
                C0032Q c0032q = (C0032Q) this.f310Z;
                c0032q.f157a.f374s0.m14e(c10142i);
                c0032q.f158b.f6806b = true;
                return "AePreCapture";
            case 4:
                ((C0037T) this.f310Z).f195b.f229i.mo172c();
                c10142i.m10747a(null);
                return "invokePostCaptureFuture";
            case 5:
                ((C0063g0) this.f310Z).m242b(new C0045X(c10142i, 0));
                return "submitStillCapture";
            case 7:
                ((C0051a0) this.f310Z).f240a = c10142i;
                return "waitFor3AResult";
            case 8:
                ((AtomicReference) this.f310Z).set(new C0053b0(c10142i, 0));
                return "OnScreenFlashUiApplied";
            case 9:
                C0007D0 c0007d0 = (C0007D0) this.f310Z;
                c0007d0.getClass();
                c0007d0.f24b.execute(new RunnableC0074m(c0007d0, 8, c10142i));
                return "triggerAePrecapture";
        }
    }

    @Override // p178H.InterfaceC3108A
    /* JADX INFO: renamed from: c */
    public void mo255c(C3152j0 c3152j0) {
        ((InterfaceC3108A) this.f310Z).mo255c(c3152j0);
    }

    @Override // p228J.InterfaceC3819V
    /* JADX INFO: renamed from: d */
    public void mo256d(InterfaceC3820W interfaceC3820W) throws Exception {
        switch (this.f309Y) {
            case 10:
                C0048Y0 c0048y0 = (C0048Y0) this.f310Z;
                c0048y0.getClass();
                try {
                    InterfaceC3127U interfaceC3127UMo342i = interfaceC3820W.mo342i();
                    if (interfaceC3127UMo342i != null) {
                        c0048y0.f231b.m12620y(interfaceC3127UMo342i);
                        return;
                    }
                    return;
                } catch (IllegalStateException e10) {
                    AbstractC8072d6.m8487d("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
                    return;
                }
            case 26:
                C3132Z c3132z = (C3132Z) this.f310Z;
                synchronized (c3132z.f9419Y) {
                    c3132z.f9421o0++;
                    break;
                }
                c3132z.m3975d(interfaceC3820W);
                return;
            default:
                C2392v c2392v = (C2392v) this.f310Z;
                try {
                    InterfaceC3127U interfaceC3127UMo342i2 = interfaceC3820W.mo342i();
                    if (interfaceC3127UMo342i2 != null) {
                        c2392v.m3530B(interfaceC3127UMo342i2);
                    } else {
                        C3535k c3535k = (C3535k) c2392v.f7436Z;
                        if (c3535k != null) {
                            c2392v.m3536H(new C3529e(c3535k.f10689a, new C3124Q("Failed to acquire latest image", null)));
                        }
                    }
                    return;
                } catch (IllegalStateException e11) {
                    C3535k c3535k2 = (C3535k) c2392v.f7436Z;
                    if (c3535k2 != null) {
                        c2392v.m3536H(new C3529e(c3535k2.f10689a, new C3124Q("Failed to acquire latest image", e11)));
                        return;
                    }
                    return;
                }
        }
    }

    @Override // p082D2.InterfaceC1860g
    /* JADX INFO: renamed from: e */
    public boolean mo257e(C13287b c13287b, int i10, Bundle bundle) {
        InterfaceC0749c c7296c;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                ((InterfaceC1862i) c13287b.f42000Z).mo2742f();
                Parcelable parcelable = (Parcelable) ((InterfaceC1862i) c13287b.f42000Z).mo2744j();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                AbstractC15256t.m16483u("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipDescription description = ((InterfaceC1862i) c13287b.f42000Z).getDescription();
        InterfaceC1862i interfaceC1862i = (InterfaceC1862i) c13287b.f42000Z;
        ClipData clipData = new ClipData(description, new ClipData.Item(interfaceC1862i.mo2741c()));
        if (i11 >= 31) {
            c7296c = new C7296c(clipData, 2);
        } else {
            C0751d c0751d = new C0751d();
            c0751d.f2125Z = clipData;
            c0751d.f2126o0 = 2;
            c7296c = c0751d;
        }
        c7296c.mo1597h(interfaceC1862i.mo2743g());
        c7296c.mo1596d(bundle);
        return AbstractC0738T.m1580h((C19376s) this.f310Z, c7296c.build()) == null;
    }

    @Override // p1073w3.InterfaceC20806h
    public void invoke(Object obj) {
        switch (this.f309Y) {
            case 11:
                ((InterfaceC19759I) obj).mo2755c((C19751A) this.f310Z);
                break;
            case 12:
                ((InterfaceC19759I) obj).mo2754b((C20422c) this.f310Z);
                break;
            case 13:
                ((InterfaceC19759I) obj).mo2755c(((SurfaceHolderCallbackC1523A) this.f310Z).f4046Y.f4073W0);
                break;
            case 14:
                ((InterfaceC19759I) obj).mo2756d((C19753C) this.f310Z);
                break;
            case 15:
            case 16:
            default:
                ((C1873k) obj).f5403n = (AbstractC19756F) this.f310Z;
                break;
            case 17:
                C1873k c1873k = (C1873k) obj;
                int i10 = c1873k.f5413x;
                C1556e c1556e = (C1556e) this.f310Z;
                c1873k.f5413x = i10 + c1556e.f4317g;
                c1873k.f5414y += c1556e.f4315e;
                break;
        }
    }

    @Override // p746fa.InterfaceC13594c
    /* JADX INFO: renamed from: t */
    public void mo258t(C13606o c13606o) {
        switch (this.f309Y) {
            case 22:
                AbstractC2367E.m3465b((Intent) this.f310Z);
                break;
            case 23:
                ((C2369G) this.f310Z).f7362b.m15116d(null);
                break;
            default:
                ((ScheduledFuture) this.f310Z).cancel(false);
                break;
        }
    }

    @Override // androidx.lifecycle.InterfaceC11070F
    /* JADX INFO: renamed from: u */
    public void mo259u(Object obj) {
        ((C0020K) this.f310Z).mo12122j(obj);
    }

    public /* synthetic */ C0072l(Object obj, int i10, Object obj2) {
        this.f309Y = i10;
        this.f310Z = obj2;
    }

    @Override // p746fa.InterfaceC13592a
    /* JADX INFO: renamed from: L */
    public Object mo253L(C13606o c13606o) throws IOException {
        Object obj;
        ((C10252z0) this.f310Z).getClass();
        synchronized (c13606o.f42982a) {
            AbstractC20502t.m21159j("Task is not yet complete", c13606o.f42984c);
            if (c13606o.f42985d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (IOException.class.isInstance(c13606o.f42987f)) {
                throw ((Throwable) IOException.class.cast(c13606o.f42987f));
            }
            Exception exc = c13606o.f42987f;
            if (exc != null) {
                throw new C13597f(exc);
            }
            obj = c13606o.f42986e;
        }
        Bundle bundle = (Bundle) obj;
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException(vRJidSveZHcTw.vhjskQEbnjkkfg);
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        AbstractC15256t.m16483u("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
