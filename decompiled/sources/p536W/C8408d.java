package p536W;

import android.content.Context;
import android.os.Trace;
import androidx.lifecycle.InterfaceC11112u;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0067i0;
import p001A.C0090u;
import p084D4.C1920j;
import p117Eb.C2392v;
import p178H.AbstractC3174u0;
import p178H.C3163p;
import p178H.C3169s;
import p178H.InterfaceC3161o;
import p228J.AbstractC3811M;
import p228J.AbstractC3860s;
import p228J.C3793B;
import p228J.C3830d;
import p228J.C3853o0;
import p228J.InterfaceC3866v;
import p228J.InterfaceC3870x;
import p326N.C5559a;
import p326N.C5565g;
import p544W9.AbstractC8447A3;
import p544W9.AbstractC8488H2;
import p610Z1.C10145l;
import p658b5.C11234e;
import p720e6.C13288c;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: W.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8408d {

    /* JADX INFO: renamed from: g */
    public static final C8408d f26139g = new C8408d();

    /* JADX INFO: renamed from: b */
    public C10145l f26141b;

    /* JADX INFO: renamed from: d */
    public C3169s f26143d;

    /* JADX INFO: renamed from: e */
    public Context f26144e;

    /* JADX INFO: renamed from: a */
    public final Object f26140a = new Object();

    /* JADX INFO: renamed from: c */
    public final C2392v f26142c = new C2392v(18);

    /* JADX INFO: renamed from: f */
    public final HashMap f26145f = new HashMap();

    /* JADX INFO: renamed from: a */
    public static final C13288c m8955a(C8408d c8408d, C3163p c3163p) {
        c8408d.getClass();
        for (Object obj : c3163p.f9513a) {
            AbstractC16544l.m18093f(obj, "cameraSelector.cameraFilterSet");
            InterfaceC3161o interfaceC3161o = (InterfaceC3161o) obj;
            if (!AbstractC16544l.m18089b(interfaceC3161o.mo3990a(), InterfaceC3161o.f9508a)) {
                C3830d c3830dMo3990a = interfaceC3161o.mo3990a();
                synchronized (AbstractC3811M.f11536a) {
                }
                AbstractC16544l.m18091d(c8408d.f26144e);
            }
        }
        return AbstractC3860s.f11670a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m8956b(C8408d c8408d, int i10) {
        C3169s c3169s = c8408d.f26143d;
        if (c3169s == null) {
            return;
        }
        C0090u c0090u = c3169s.f9528f;
        if (c0090u == null) {
            throw new IllegalStateException("CameraX not initialized yet.");
        }
        C1920j c1920j = c0090u.f392b;
        if (i10 != c1920j.f5617o0) {
            for (C3793B c3793b : (ArrayList) c1920j.f5616Z) {
                int i11 = c1920j.f5617o0;
                synchronized (c3793b.f11466b) {
                    boolean z6 = true;
                    c3793b.f11467c = i10 == 2 ? 2 : 1;
                    boolean z10 = i11 != 2 && i10 == 2;
                    if (i11 != 2 || i10 == 2) {
                        z6 = false;
                    }
                    if (z10 || z6) {
                        c3793b.m4463b();
                    }
                }
            }
        }
        if (c1920j.f5617o0 == 2 && i10 != 2) {
            ((ArrayList) c1920j.f5619q0).clear();
        }
        c1920j.f5617o0 = i10;
    }

    /* JADX INFO: renamed from: c */
    public final C8406b m8957c(InterfaceC11112u lifecycleOwner, C3163p cameraSelector, AbstractC3174u0... useCases) {
        int i10;
        AbstractC16544l.m18094g(lifecycleOwner, "lifecycleOwner");
        AbstractC16544l.m18094g(cameraSelector, "cameraSelector");
        AbstractC16544l.m18094g(useCases, "useCases");
        Trace.beginSection(AbstractC8447A3.m9053f("CX:bindToLifecycle"));
        try {
            C3169s c3169s = this.f26143d;
            if (c3169s == null) {
                i10 = 0;
            } else {
                C0090u c0090u = c3169s.f9528f;
                if (c0090u == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                i10 = c0090u.f392b.f5617o0;
            }
            if (i10 == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            m8956b(this, 1);
            C8406b c8406bM8959e = m8959e(lifecycleOwner, cameraSelector, C17689w.f56480Y, (AbstractC3174u0[]) Arrays.copyOf(useCases, useCases.length));
            Trace.endSection();
            return c8406bM8959e;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C8406b m8958d(AbstractActivityC17375g abstractActivityC17375g, C3163p c3163p, C11234e c11234e) {
        int i10;
        Trace.beginSection(AbstractC8447A3.m9053f("CX:bindToLifecycle-UseCaseGroup"));
        try {
            C3169s c3169s = this.f26143d;
            if (c3169s == null) {
                i10 = 0;
            } else {
                C0090u c0090u = c3169s.f9528f;
                if (c0090u == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                i10 = c0090u.f392b.f5617o0;
            }
            if (i10 == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            m8956b(this, 1);
            ArrayList arrayList = (ArrayList) c11234e.f34002o0;
            AbstractC16544l.m18093f(arrayList, "useCaseGroup.effects");
            ArrayList arrayList2 = (ArrayList) c11234e.f34001Z;
            AbstractC16544l.m18093f(arrayList2, "useCaseGroup.useCases");
            AbstractC3174u0[] abstractC3174u0Arr = (AbstractC3174u0[]) arrayList2.toArray(new AbstractC3174u0[0]);
            C8406b c8406bM8959e = m8959e(abstractActivityC17375g, c3163p, arrayList, (AbstractC3174u0[]) Arrays.copyOf(abstractC3174u0Arr, abstractC3174u0Arr.length));
            Trace.endSection();
            return c8406bM8959e;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C8406b m8959e(InterfaceC11112u lifecycleOwner, C3163p primaryCameraSelector, List effects, AbstractC3174u0... useCases) {
        C8406b c8406bM3560r;
        AbstractC16544l.m18094g(lifecycleOwner, "lifecycleOwner");
        AbstractC16544l.m18094g(primaryCameraSelector, "primaryCameraSelector");
        AbstractC16544l.m18094g(effects, "effects");
        AbstractC16544l.m18094g(useCases, "useCases");
        Trace.beginSection(AbstractC8447A3.m9053f("CX:bindToLifecycle-internal"));
        try {
            AbstractC8488H2.m9140a();
            C3169s c3169s = this.f26143d;
            AbstractC16544l.m18091d(c3169s);
            InterfaceC3870x interfaceC3870xM3995c = primaryCameraSelector.m3995c(c3169s.f9523a.m16584l());
            AbstractC16544l.m18093f(interfaceC3870xM3995c, "primaryCameraSelector.se…cameraRepository.cameras)");
            interfaceC3870xM3995c.mo121q(true);
            C3853o0 c3853o0M8960f = m8960f(primaryCameraSelector);
            C2392v c2392v = this.f26142c;
            C5559a c5559aM5954w = C5565g.m5954w(c3853o0M8960f, null);
            synchronized (c2392v.f7436Z) {
                c8406bM3560r = (C8406b) ((HashMap) c2392v.f7437o0).get(new C8405a(lifecycleOwner, c5559aM5954w));
            }
            Collection collectionM3565w = this.f26142c.m3565w();
            for (AbstractC3174u0 abstractC3174u0 : AbstractC17678l.m19315v(useCases)) {
                for (Object lifecycleCameras : collectionM3565w) {
                    AbstractC16544l.m18093f(lifecycleCameras, "lifecycleCameras");
                    C8406b c8406b = (C8406b) lifecycleCameras;
                    if (c8406b.m8951s(abstractC3174u0) && !c8406b.equals(c8406bM3560r)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{abstractC3174u0}, 1)));
                    }
                }
            }
            if (c8406bM3560r == null) {
                C2392v c2392v2 = this.f26142c;
                C3169s c3169s2 = this.f26143d;
                AbstractC16544l.m18091d(c3169s2);
                C0090u c0090u = c3169s2.f9528f;
                if (c0090u == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                C1920j c1920j = c0090u.f392b;
                C3169s c3169s3 = this.f26143d;
                AbstractC16544l.m18091d(c3169s3);
                C15358g1 c15358g1 = c3169s3.f9529g;
                if (c15358g1 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                C3169s c3169s4 = this.f26143d;
                AbstractC16544l.m18091d(c3169s4);
                C0067i0 c0067i0 = c3169s4.f9530h;
                if (c0067i0 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                c8406bM3560r = c2392v2.m3560r(lifecycleOwner, new C5565g(interfaceC3870xM3995c, null, c3853o0M8960f, null, c1920j, c15358g1, c0067i0));
            }
            if (useCases.length != 0) {
                C2392v c2392v3 = this.f26142c;
                List listM19382k = AbstractC17681o.m19382k(Arrays.copyOf(useCases, useCases.length));
                C3169s c3169s5 = this.f26143d;
                AbstractC16544l.m18091d(c3169s5);
                C0090u c0090u2 = c3169s5.f9528f;
                if (c0090u2 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                c2392v3.m3555l(c8406bM3560r, effects, listM19382k, c0090u2.f392b);
            }
            Trace.endSection();
            return c8406bM3560r;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final C3853o0 m8960f(C3163p cameraSelector) {
        Object c3853o0;
        AbstractC16544l.m18094g(cameraSelector, "cameraSelector");
        Trace.beginSection(AbstractC8447A3.m9053f("CX:getCameraInfo"));
        try {
            C3169s c3169s = this.f26143d;
            AbstractC16544l.m18091d(c3169s);
            InterfaceC3866v interfaceC3866vMo122r = cameraSelector.m3995c(c3169s.f9523a.m16584l()).mo122r();
            AbstractC16544l.m18093f(interfaceC3866vMo122r, "cameraSelector.select(mC…meras).cameraInfoInternal");
            C13288c c13288cM8955a = m8955a(this, cameraSelector);
            C5559a c5559a = new C5559a(interfaceC3866vMo122r.mo137b(), (C3830d) c13288cM8955a.f42001Y);
            synchronized (this.f26140a) {
                c3853o0 = this.f26145f.get(c5559a);
                if (c3853o0 == null) {
                    c3853o0 = new C3853o0(interfaceC3866vMo122r, c13288cM8955a);
                    this.f26145f.put(c5559a, c3853o0);
                }
            }
            C3853o0 c3853o1 = (C3853o0) c3853o0;
            Trace.endSection();
            return c3853o1;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8961g() {
        Trace.beginSection(AbstractC8447A3.m9053f("CX:unbindAll"));
        try {
            AbstractC8488H2.m9140a();
            m8956b(this, 0);
            this.f26142c.m3542N();
        } finally {
            Trace.endSection();
        }
    }
}
