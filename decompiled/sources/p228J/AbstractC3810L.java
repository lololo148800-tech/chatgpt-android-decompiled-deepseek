package p228J;

import android.gov.nist.core.Separators;
import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;
import p221Ii.RunnableC3724c;
import p301M.C5231m;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8577W2;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p610Z1.InterfaceC10143j;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: J.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3810L {

    /* JADX INFO: renamed from: k */
    public static final Size f11522k = new Size(0, 0);

    /* JADX INFO: renamed from: l */
    public static final boolean f11523l = AbstractC8072d6.m8489f("DeferrableSurface");

    /* JADX INFO: renamed from: m */
    public static final AtomicInteger f11524m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n */
    public static final AtomicInteger f11525n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final Object f11526a = new Object();

    /* JADX INFO: renamed from: b */
    public int f11527b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f11528c = false;

    /* JADX INFO: renamed from: d */
    public C10142i f11529d;

    /* JADX INFO: renamed from: e */
    public final C10145l f11530e;

    /* JADX INFO: renamed from: f */
    public C10142i f11531f;

    /* JADX INFO: renamed from: g */
    public final C10145l f11532g;

    /* JADX INFO: renamed from: h */
    public final Size f11533h;

    /* JADX INFO: renamed from: i */
    public final int f11534i;

    /* JADX INFO: renamed from: j */
    public Class f11535j;

    public AbstractC3810L(Size size, int i10) {
        this.f11533h = size;
        this.f11534i = i10;
        final int i11 = 0;
        C10145l c10145lM17947b = AbstractC16347a.m17947b(new InterfaceC10143j(this) { // from class: J.J

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ AbstractC3810L f11520Z;

            {
                this.f11520Z = this;
            }

            /* JADX INFO: renamed from: a */
            private final Object m4506a(C10142i c10142i) {
                AbstractC3810L abstractC3810L = this.f11520Z;
                synchronized (abstractC3810L.f11526a) {
                    abstractC3810L.f11529d = c10142i;
                }
                return "DeferrableSurface-termination(" + abstractC3810L + Separators.RPAREN;
            }

            @Override // p610Z1.InterfaceC10143j
            /* JADX INFO: renamed from: b */
            public final Object mo169b(C10142i c10142i) {
                switch (i11) {
                    case 0:
                        return m4506a(c10142i);
                    default:
                        AbstractC3810L abstractC3810L = this.f11520Z;
                        synchronized (abstractC3810L.f11526a) {
                            abstractC3810L.f11531f = c10142i;
                            break;
                        }
                        return "DeferrableSurface-close(" + abstractC3810L + Separators.RPAREN;
                }
            }
        });
        this.f11530e = c10145lM17947b;
        final int i12 = 1;
        this.f11532g = AbstractC16347a.m17947b(new InterfaceC10143j(this) { // from class: J.J

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ AbstractC3810L f11520Z;

            {
                this.f11520Z = this;
            }

            /* JADX INFO: renamed from: a */
            private final Object m4506a(C10142i c10142i) {
                AbstractC3810L abstractC3810L = this.f11520Z;
                synchronized (abstractC3810L.f11526a) {
                    abstractC3810L.f11529d = c10142i;
                }
                return "DeferrableSurface-termination(" + abstractC3810L + Separators.RPAREN;
            }

            @Override // p610Z1.InterfaceC10143j
            /* JADX INFO: renamed from: b */
            public final Object mo169b(C10142i c10142i) {
                switch (i12) {
                    case 0:
                        return m4506a(c10142i);
                    default:
                        AbstractC3810L abstractC3810L = this.f11520Z;
                        synchronized (abstractC3810L.f11526a) {
                            abstractC3810L.f11531f = c10142i;
                            break;
                        }
                        return "DeferrableSurface-close(" + abstractC3810L + Separators.RPAREN;
                }
            }
        });
        if (AbstractC8072d6.m8489f("DeferrableSurface")) {
            m4511e(f11525n.incrementAndGet(), f11524m.get(), "Surface created");
            c10145lM17947b.f30070Z.mo5766a(new RunnableC3724c(this, 2, Log.getStackTraceString(new Exception())), AbstractC8577W2.m9240b());
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo4507a() {
        C10142i c10142i;
        synchronized (this.f11526a) {
            try {
                if (this.f11528c) {
                    c10142i = null;
                } else {
                    this.f11528c = true;
                    this.f11531f.m10747a(null);
                    if (this.f11527b == 0) {
                        c10142i = this.f11529d;
                        this.f11529d = null;
                    } else {
                        c10142i = null;
                    }
                    if (AbstractC8072d6.m8489f("DeferrableSurface")) {
                        AbstractC8072d6.m8486c("DeferrableSurface", "surface closed,  useCount=" + this.f11527b + " closed=true " + this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c10142i != null) {
            c10142i.m10747a(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4508b() {
        C10142i c10142i;
        synchronized (this.f11526a) {
            try {
                int i10 = this.f11527b;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i11 = i10 - 1;
                this.f11527b = i11;
                if (i11 == 0 && this.f11528c) {
                    c10142i = this.f11529d;
                    this.f11529d = null;
                } else {
                    c10142i = null;
                }
                if (AbstractC8072d6.m8489f("DeferrableSurface")) {
                    AbstractC8072d6.m8486c("DeferrableSurface", "use count-1,  useCount=" + this.f11527b + " closed=" + this.f11528c + Separators.f31991SP + this);
                    if (this.f11527b == 0) {
                        m4511e(f11525n.get(), f11524m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c10142i != null) {
            c10142i.m10747a(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceFutureC13608b m4509c() {
        synchronized (this.f11526a) {
            try {
                if (this.f11528c) {
                    return new C5231m(new C3809K("DeferrableSurface already closed.", this), 1);
                }
                return mo3992f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4510d() {
        synchronized (this.f11526a) {
            try {
                int i10 = this.f11527b;
                if (i10 == 0 && this.f11528c) {
                    throw new C3809K("Cannot begin use on a closed surface.", this);
                }
                this.f11527b = i10 + 1;
                if (AbstractC8072d6.m8489f("DeferrableSurface")) {
                    if (this.f11527b == 1) {
                        m4511e(f11525n.get(), f11524m.incrementAndGet(), "New surface in use");
                    }
                    AbstractC8072d6.m8486c("DeferrableSurface", "use count+1, useCount=" + this.f11527b + Separators.f31991SP + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4511e(int i10, int i11, String str) {
        if (!f11523l && AbstractC8072d6.m8489f("DeferrableSurface")) {
            AbstractC8072d6.m8486c("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        AbstractC8072d6.m8486c("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    /* JADX INFO: renamed from: f */
    public abstract InterfaceFutureC13608b mo3992f();
}
