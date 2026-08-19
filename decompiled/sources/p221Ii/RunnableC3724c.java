package p221Ii;

import android.app.ApplicationExitInfo;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.javax.sip.C10808o;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.C11069E;
import com.auth0.android.provider.AuthenticationActivity;
import com.auth0.android.request.internal.C11845d;
import com.auth0.android.request.internal.C11846e;
import com.auth0.android.request.internal.RunnableC11843b;
import com.auth0.android.result.Credentials;
import io.sentry.internal.debugmeta.C15384c;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.C0017I0;
import p001A.C0072l;
import p001A.C0083q0;
import p001A.C0100z;
import p004A2.InterfaceC0310a;
import p042Bf.C1268j;
import p049Bm.InterfaceC1436k;
import p057C3.C1526D;
import p057C3.C1556e;
import p057C3.C1580y;
import p057C3.SurfaceHolderCallbackC1523A;
import p083D3.C1863a;
import p083D3.C1868f;
import p1009s9.C19506i;
import p1016t3.C19773X;
import p1073w3.AbstractC20817s;
import p178H.C3147h;
import p178H.C3170s0;
import p214Ib.C3676s;
import p226In.C3780b;
import p226In.C3785g;
import p226In.InterfaceC3786h;
import p228J.AbstractC3810L;
import p228J.C3822Y;
import p228J.C3823Z;
import p232J3.C4213M;
import p232J3.C4253y;
import p260K6.C4547b;
import p277L.ScheduledExecutorServiceC4831d;
import p308M6.InterfaceC5300b;
import p326N.C5562d;
import p341Ni.C5801u;
import p372P3.C6338t;
import p372P3.InterfaceC6310B;
import p414R.C6767a;
import p414R.C6771e;
import p414R.C6773g;
import p414R.C6779m;
import p421R6.C6815a;
import p439S.C6972c;
import p439S.C6974e;
import p446S6.C7023b;
import p465T.AbstractC7173i;
import p470T4.C7241f;
import p470T4.C7246k;
import p470T4.InterfaceC7238c;
import p470T4.RunnableC7256u;
import p472T6.C7258a;
import p472T6.C7259b;
import p477Tb.C7296c;
import p495U4.C7558d;
import p497U6.InterfaceC7569a;
import p521V6.AbstractC7807J;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC7933L4;
import p523V9.AbstractC8072d6;
import p561X.C9005s;
import p590Y4.C9645b;
import p594Y9.AbstractC9750J2;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p613Z4.AbstractC10159f;
import p642a8.C10518a;
import p642a8.C10519b;
import p642a8.C10525h;
import p642a8.InterfaceC10520c;
import p658b5.C11232c;
import p658b5.C11239j;
import p661b7.EnumC11255b;
import p670c1.C11558b;
import p670c1.ViewOnAttachStateChangeListenerC11560d;
import p673c4.C11646b;
import p674c5.RunnableC11660m;
import p697d5.C13018a;
import p697d5.C13027j;
import p720e6.C13287b;
import p743f7.InterfaceC13575a;
import p765g7.InterfaceC13823a;
import p849k7.C16360m;
import p855kj.AbstractC16428g;
import p855kj.C16432k;
import p909nm.C17690x;
import p919o8.C17946W1;

/* JADX INFO: renamed from: Ii.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3724c implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11293Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f11294Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f11295o0;

    public /* synthetic */ RunnableC3724c(Object obj, int i10, Object obj2) {
        this.f11293Y = i10;
        this.f11294Z = obj;
        this.f11295o0 = obj2;
    }

    /* JADX INFO: renamed from: a */
    private final void m4427a() {
        C11232c c11232c = (C11232c) this.f11294Z;
        C1556e c1556e = (C1556e) this.f11295o0;
        c11232c.getClass();
        synchronized (c1556e) {
        }
        SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A = (SurfaceHolderCallbackC1523A) c11232c.f33997Z;
        int i10 = AbstractC20817s.f66106a;
        C1868f c1868f = surfaceHolderCallbackC1523A.f4046Y.f4055E0;
        C1863a c1863aM2778z = c1868f.m2778z((C4253y) c1868f.f5367p0.f68q0);
        c1868f.m2748D(c1863aM2778z, 1020, new C0072l(c1863aM2778z, 17, c1556e));
    }

    /* JADX INFO: renamed from: b */
    private final void m4428b() {
        C7241f c7241f = (C7241f) this.f11294Z;
        C11239j c11239j = (C11239j) this.f11295o0;
        synchronized (c7241f.f22971k) {
            try {
                Iterator it = c7241f.f22970j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC7238c) it.next()).mo7639d(c11239j, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 2;
        int i11 = 0;
        switch (this.f11293Y) {
            case 0:
                InterfaceC1436k onDrawFrameListener = ((C3725d) this.f11294Z).getOnDrawFrameListener();
                if (onDrawFrameListener != null) {
                    onDrawFrameListener.invoke((InterfaceC5300b) this.f11295o0);
                    return;
                }
                return;
            case 1:
                ((C3785g) ((InterfaceC3786h) this.f11294Z)).m4459h((C3780b) this.f11295o0, C17296C.f55119a);
                return;
            case 2:
                AbstractC3810L abstractC3810L = (AbstractC3810L) this.f11294Z;
                String str = (String) this.f11295o0;
                abstractC3810L.getClass();
                try {
                    abstractC3810L.f11530e.get();
                    abstractC3810L.m4511e(AbstractC3810L.f11525n.decrementAndGet(), AbstractC3810L.f11524m.get(), "Surface terminated");
                    return;
                } catch (Exception e10) {
                    AbstractC8072d6.m8487d("DeferrableSurface", "Unexpected surface termination for " + abstractC3810L + "\nStack Trace:\n" + str);
                    synchronized (abstractC3810L.f11526a) {
                        try {
                            throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", abstractC3810L, Boolean.valueOf(abstractC3810L.f11528c), Integer.valueOf(abstractC3810L.f11527b)), e10);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            case 3:
                ((C11069E) ((C15384c) this.f11294Z).f47967Z).mo12121i((C3822Y) this.f11295o0);
                return;
            case 4:
                C3822Y c3822y = (C3822Y) this.f11294Z;
                if (c3822y.f11574Y.get()) {
                    C3823Z c3823z = (C3823Z) this.f11295o0;
                    c3823z.getClass();
                    c3822y.f11575Z.mo207A(c3823z.f11577a);
                    return;
                }
                return;
            case 5:
                C4213M c4213m = (C4213M) this.f11294Z;
                C11646b c11646b = c4213m.f13704D0;
                InterfaceC6310B interfaceC6310B = (InterfaceC6310B) this.f11295o0;
                c4213m.f13712L0 = c11646b == null ? interfaceC6310B : new C6338t(-9223372036854775807L);
                c4213m.f13713M0 = interfaceC6310B.mo4938l();
                boolean z6 = !c4213m.f13719S0 && interfaceC6310B.mo4938l() == -9223372036854775807L;
                c4213m.f13714N0 = z6;
                c4213m.f13715O0 = z6 ? 7 : 1;
                if (c4213m.f13708H0) {
                    c4213m.f13732s0.m4962t(c4213m.f13713M0, interfaceC6310B.mo6853d(), c4213m.f13714N0);
                    return;
                } else {
                    c4213m.m4953v();
                    return;
                }
            case 6:
                C4547b this$0 = (C4547b) this.f11294Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                InterfaceC5300b shaderParams = (InterfaceC5300b) this.f11295o0;
                AbstractC16544l.m18094g(shaderParams, "$shaderParams");
                InterfaceC1436k onDrawFrameListener2 = this$0.getOnDrawFrameListener();
                if (onDrawFrameListener2 == null) {
                    return;
                }
                onDrawFrameListener2.invoke(shaderParams);
                return;
            case 7:
                ((C10142i) this.f11294Z).m10747a(null);
                ((C10145l) this.f11295o0).cancel(true);
                return;
            case 8:
                C11232c c11232c = (C11232c) this.f11294Z;
                c11232c.getClass();
                int i12 = AbstractC20817s.f66106a;
                C1526D c1526d = ((SurfaceHolderCallbackC1523A) c11232c.f33997Z).f4046Y;
                c1526d.getClass();
                c1526d.f4100y0.m10694e(25, new C1580y((C19773X) this.f11295o0));
                return;
            case 9:
                m4427a();
                return;
            case 10:
                C16432k c16432k = ((C5801u) this.f11294Z).f18942g;
                if (c16432k != null) {
                    StringBuilder sb2 = new StringBuilder("Selected AudioDevice = ");
                    AbstractC16428g abstractC16428g = (AbstractC16428g) this.f11295o0;
                    sb2.append(abstractC16428g);
                    c16432k.f50981j.m1013f("AudioSwitch", sb2.toString());
                    c16432k.f50976e = abstractC16428g;
                    c16432k.m18015c(false, abstractC16428g);
                    return;
                }
                return;
            case 11:
                ((C6771e) this.f11294Z).f21733w0.add((C6767a) this.f11295o0);
                return;
            case 12:
                C6771e c6771e = (C6771e) this.f11294Z;
                ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d = c6771e.f21725o0;
                C6779m c6779m = (C6779m) this.f11295o0;
                Surface surfaceM7229e = c6779m.m7229e(scheduledExecutorServiceC4831d, new C5562d(c6771e, 1, c6779m));
                c6771e.f21723Y.m7217k(surfaceM7229e);
                c6771e.f21730t0.put(c6779m, surfaceM7229e);
                return;
            case 13:
                final C6771e c6771e2 = (C6771e) this.f11294Z;
                c6771e2.f21731u0++;
                C6773g c6773g = c6771e2.f21723Y;
                AbstractC7173i.m7546d((AtomicBoolean) c6773g.f21738o0, true);
                AbstractC7173i.m7545c((Thread) c6773g.f21740q0);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(c6773g.f21736Y);
                final C3170s0 c3170s0 = (C3170s0) this.f11295o0;
                Size size = c3170s0.f9535b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                C0100z c0100z = new C0100z(c6771e2, 19, c3170s0);
                ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d2 = c6771e2.f21725o0;
                c3170s0.m4000b(scheduledExecutorServiceC4831d2, c0100z);
                c3170s0.m3999a(surface, scheduledExecutorServiceC4831d2, new InterfaceC0310a() { // from class: R.d
                    @Override // p004A2.InterfaceC0310a
                    public final void accept(Object obj) {
                        C6771e c6771e3 = c6771e2;
                        C3170s0 c3170s1 = c3170s0;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        c6771e3.getClass();
                        synchronized (c3170s1.f9534a) {
                            c3170s1.f9546m = null;
                            c3170s1.f9547n = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        c6771e3.f21731u0--;
                        c6771e3.m7203c();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(c6771e2, c6771e2.f21726p0);
                return;
            case 14:
                C6779m c6779m2 = (C6779m) this.f11294Z;
                c6779m2.getClass();
                ((InterfaceC0310a) ((AtomicReference) this.f11295o0).get()).accept(new C3147h(c6779m2));
                return;
            case 15:
                final C6974e c6974e = (C6974e) this.f11294Z;
                c6974e.f22297q0++;
                C3170s0 c3170s1 = (C3170s0) this.f11295o0;
                C6972c c6972c = c6974e.f22293Y;
                AbstractC7173i.m7546d((AtomicBoolean) c6972c.f21738o0, true);
                AbstractC7173i.m7545c((Thread) c6972c.f21740q0);
                boolean z10 = c3170s1.f9538e;
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(z10 ? c6972c.f22289z0 : c6972c.f22286A0);
                Size size2 = c3170s1.f9535b;
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                c3170s1.m3999a(surface2, c6974e.f22295o0, new InterfaceC0310a() { // from class: S.d
                    @Override // p004A2.InterfaceC0310a
                    public final void accept(Object obj) {
                        C6974e c6974e2 = c6974e;
                        c6974e2.getClass();
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        c6974e2.f22297q0--;
                        c6974e2.m7335c();
                    }
                });
                if (z10) {
                    c6974e.f22301u0 = surfaceTexture2;
                    return;
                } else {
                    c6974e.f22302v0 = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(c6974e, c6974e.f22296p0);
                    return;
                }
            case 16:
                C6974e c6974e2 = (C6974e) this.f11294Z;
                ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d3 = c6974e2.f22295o0;
                C6779m c6779m3 = (C6779m) this.f11295o0;
                Surface surfaceM7229e2 = c6779m3.m7229e(scheduledExecutorServiceC4831d3, new C5562d(c6974e2, i10, c6779m3));
                c6974e2.f22293Y.m7217k(surfaceM7229e2);
                c6974e2.f22300t0.put(c6779m3, surfaceM7229e2);
                return;
            case 17:
                m4428b();
                return;
            case 18:
                RunnableC7256u runnableC7256u = (RunnableC7256u) this.f11294Z;
                C13027j c13027j = (C13027j) this.f11295o0;
                if (runnableC7256u.f23009B0.f41326Y instanceof C13018a) {
                    c13027j.cancel(true);
                    return;
                }
                return;
            case 19:
                C7258a this$1 = (C7258a) this.f11294Z;
                AbstractC16544l.m18094g(this$1, "this$0");
                C7296c c7296c = (C7296c) this.f11295o0;
                C17690x c17690x = C17690x.f56481Y;
                C10808o c10808o = this$1.f23027b;
                String strM11087u = c10808o.m11087u("com.auth0.access_token");
                String strM11087u2 = c10808o.m11087u("com.auth0.refresh_token");
                String strM11087u3 = c10808o.m11087u("com.auth0.id_token");
                String strM11087u4 = c10808o.m11087u("com.auth0.token_type");
                SharedPreferences sharedPreferences = (SharedPreferences) c10808o.f32040Z;
                Long lValueOf = !sharedPreferences.contains("com.auth0.expires_at") ? null : Long.valueOf(sharedPreferences.getLong("com.auth0.expires_at", 0L));
                String strM11087u5 = c10808o.m11087u("com.auth0.scope");
                if ((TextUtils.isEmpty(strM11087u) && TextUtils.isEmpty(strM11087u3)) || lValueOf == null) {
                    c7296c.mo7759f(new C7259b("No Credentials were previously set.", null));
                    return;
                }
                long j10 = 60;
                if (!this$1.m7708c(lValueOf.longValue(), j10)) {
                    c7296c.onSuccess(new Credentials(strM11087u3 == null ? "" : strM11087u3, strM11087u == null ? "" : strM11087u, strM11087u4 == null ? "" : strM11087u4, strM11087u2, new Date(lValueOf.longValue()), strM11087u5));
                    return;
                }
                if (strM11087u2 == null) {
                    c7296c.mo7759f(new C7259b("Credentials need to be renewed but no Refresh Token is available to renew them.", null));
                    return;
                }
                C0017I0 c0017i0M7417b = this$1.f23026a.m7417b(strM11087u2);
                c0017i0M7417b.m71e(c17690x);
                try {
                    Credentials credentials = (Credentials) c0017i0M7417b.m77m();
                    long time = credentials.getExpiresAt().getTime();
                    if (this$1.m7708c(time, j10)) {
                        c7296c.mo7759f(new C7259b(String.format(Locale.getDefault(), "The lifetime of the renewed Access Token (%d) is less than the minTTL requested (%d). Increase the 'Token Expiration' setting of your Auth0 API in the dashboard, or request a lower minTTL.", Arrays.copyOf(new Object[]{Long.valueOf(((time - System.currentTimeMillis()) - ((long) 60000)) / ((long) (-1000))), 60}, 2)), null));
                        return;
                    }
                    if (!TextUtils.isEmpty(credentials.getRefreshToken())) {
                        strM11087u2 = credentials.getRefreshToken();
                    }
                    Credentials credentials2 = new Credentials(credentials.getIdToken(), credentials.getAccessToken(), credentials.getType(), strM11087u2, credentials.getExpiresAt(), credentials.getScope());
                    this$1.m7707b(credentials2);
                    c7296c.onSuccess(credentials2);
                    return;
                } catch (C7023b e11) {
                    c7296c.mo7759f(new C7259b("An error occurred while trying to use the Refresh Token to renew the Credentials.", e11));
                    return;
                }
            case 20:
                C7558d this$2 = (C7558d) this.f11294Z;
                AbstractC16544l.m18094g(this$2, "this$0");
                C7246k token = (C7246k) this.f11295o0;
                AbstractC16544l.m18094g(token, "$token");
                this$2.f23950b.m12592M(token, 3);
                return;
            case 21:
                C19506i c19506i = (C19506i) this.f11294Z;
                C7023b c7023b = (C7023b) this.f11295o0;
                AuthenticationActivity authenticationActivity = (AuthenticationActivity) c19506i.f61960Z;
                authenticationActivity.getClass();
                AbstractC9750J2 abstractC9750J2 = AbstractC7807J.f24700b;
                AbstractC16544l.m18091d(abstractC9750J2);
                abstractC9750J2.mo8085a(c7023b);
                authenticationActivity.finish();
                return;
            case 22:
                ((PreviewView) ((C13287b) this.f11294Z).f42000Z).f32358z0.mo3482a((C3170s0) this.f11295o0);
                return;
            case 23:
                C9005s c9005s = (C9005s) this.f11294Z;
                C3170s0 c3170s2 = c9005s.f27477h;
                if (c3170s2 != null && c3170s2 == ((C3170s0) this.f11295o0)) {
                    c9005s.f27477h = null;
                    c9005s.f27476g = null;
                }
                C0083q0 c0083q0 = c9005s.f27481l;
                if (c0083q0 != null) {
                    c0083q0.m271f();
                    c9005s.f27481l = null;
                    return;
                }
                return;
            case 24:
                List listenersList = (List) this.f11294Z;
                AbstractC16544l.m18094g(listenersList, "$listenersList");
                AbstractC10159f this$3 = (AbstractC10159f) this.f11295o0;
                AbstractC16544l.m18094g(this$3, "this$0");
                Iterator it = listenersList.iterator();
                while (it.hasNext()) {
                    ((C9645b) it.next()).m10228a(this$3.f30092d);
                }
                return;
            case 25:
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) this.f11295o0;
                C10525h c10525h = (C10525h) this.f11294Z;
                InterfaceC13823a interfaceC13823a = c10525h.f31221Y;
                C3676s c3676sMo15467w = interfaceC13823a.mo15467w();
                EnumC11255b enumC11255b = EnumC11255b.f34098Y;
                if (c3676sMo15467w == null) {
                    AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 3, enumC11255b, C10518a.f31177t0, null, false, 56);
                    return;
                }
                InterfaceC10520c interfaceC10520c = (InterfaceC10520c) c10525h.f31217H0.getValue();
                InterfaceC13575a interfaceC13575a = c10525h.f31224p0;
                C10519b c10519b = (C10519b) interfaceC10520c;
                c10519b.getClass();
                Object objMo3913N = c10519b.f31183b.mo3913N(c3676sMo15467w);
                C17946W1 c17946w1 = objMo3913N instanceof C17946W1 ? (C17946W1) objMo3913N : null;
                if (c17946w1 != null && applicationExitInfo.getTimestamp() > c17946w1.f57234a) {
                    InterfaceC13823a interfaceC13823a2 = c10519b.f31182a;
                    C16360m c16360mMo15458n = interfaceC13823a2.mo15458n("rum");
                    if (c16360mMo15458n == null) {
                        AbstractC7889G0.m8184b(interfaceC13823a2.mo15463s(), 4, enumC11255b, C10518a.f31171Z, null, false, 56);
                        return;
                    } else {
                        AbstractC7933L4.m8226d(c16360mMo15458n, new C1268j(c17946w1, c10519b, applicationExitInfo, interfaceC13575a, 14));
                        return;
                    }
                }
                return;
            case 26:
                C11558b.m12952a((ViewOnAttachStateChangeListenerC11560d) this.f11294Z, (LongSparseArray) this.f11295o0);
                return;
            case 27:
                RunnableC11660m runnableC11660m = (RunnableC11660m) this.f11294Z;
                C13027j c13027j2 = (C13027j) this.f11295o0;
                if (runnableC11660m.f35310Y.f41326Y instanceof C13018a) {
                    c13027j2.cancel(true);
                    return;
                } else {
                    c13027j2.m14771m(runnableC11660m.f35313p0.mo7404a());
                    return;
                }
            case 28:
                C0017I0 this$4 = (C0017I0) this.f11294Z;
                AbstractC16544l.m18094g(this$4, "this$0");
                C11845d c11845d = (C11845d) this$4.f68q0;
                InterfaceC7569a interfaceC7569a = (InterfaceC7569a) this.f11295o0;
                try {
                    ((C11846e) c11845d.f35976a).m13162a(new RunnableC3724c(interfaceC7569a, 29, this$4.m77m()));
                    return;
                } catch (C6815a e12) {
                    ((C11846e) c11845d.f35976a).m13162a(new RunnableC11843b(interfaceC7569a, i11, e12));
                    return;
                }
            default:
                InterfaceC7569a callback = (InterfaceC7569a) this.f11294Z;
                AbstractC16544l.m18094g(callback, "$callback");
                callback.onSuccess(this.f11295o0);
                return;
        }
    }
}
