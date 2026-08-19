package p1036u9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicInteger;
import p063C9.AbstractC1616b;
import p1009s9.C19499b;
import p1009s9.C19502e;
import p1022t9.AbstractC19821f;
import p1060v9.C20481D;
import p1060v9.C20491i;
import p1060v9.C20492j;
import p1060v9.C20493k;
import p1102x9.C21158b;
import p115E9.AbstractC2359a;
import p377P9.AbstractC6377c;
import p377P9.HandlerC6378d;
import p692d0.C12967f;
import p817j$.util.concurrent.ConcurrentHashMap;
import sk.C19662a;

/* JADX INFO: renamed from: u9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C20159e implements Handler.Callback {

    /* JADX INFO: renamed from: B0 */
    public static final Status f63852B0 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: C0 */
    public static final Status f63853C0 = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: D0 */
    public static final Object f63854D0 = new Object();

    /* JADX INFO: renamed from: E0 */
    public static C20159e f63855E0;

    /* JADX INFO: renamed from: A0 */
    public volatile boolean f63856A0;

    /* JADX INFO: renamed from: Y */
    public long f63857Y;

    /* JADX INFO: renamed from: Z */
    public boolean f63858Z;

    /* JADX INFO: renamed from: o0 */
    public C20493k f63859o0;

    /* JADX INFO: renamed from: p0 */
    public C21158b f63860p0;

    /* JADX INFO: renamed from: q0 */
    public final Context f63861q0;

    /* JADX INFO: renamed from: r0 */
    public final C19502e f63862r0;

    /* JADX INFO: renamed from: s0 */
    public final C19662a f63863s0;

    /* JADX INFO: renamed from: t0 */
    public final AtomicInteger f63864t0;

    /* JADX INFO: renamed from: u0 */
    public final AtomicInteger f63865u0;

    /* JADX INFO: renamed from: v0 */
    public final ConcurrentHashMap f63866v0;

    /* JADX INFO: renamed from: w0 */
    public DialogInterfaceOnCancelListenerC20169o f63867w0;

    /* JADX INFO: renamed from: x0 */
    public final C12967f f63868x0;

    /* JADX INFO: renamed from: y0 */
    public final C12967f f63869y0;

    /* JADX INFO: renamed from: z0 */
    public final HandlerC6378d f63870z0;

    public C20159e(Context context, Looper looper) {
        C19502e c19502e = C19502e.f61950d;
        this.f63857Y = 10000L;
        this.f63858Z = false;
        this.f63864t0 = new AtomicInteger(1);
        this.f63865u0 = new AtomicInteger(0);
        this.f63866v0 = new ConcurrentHashMap(5, 0.75f, 1);
        this.f63867w0 = null;
        this.f63868x0 = new C12967f(0);
        this.f63869y0 = new C12967f(0);
        this.f63856A0 = true;
        this.f63861q0 = context;
        HandlerC6378d handlerC6378d = new HandlerC6378d(looper, this);
        Looper.getMainLooper();
        this.f63870z0 = handlerC6378d;
        this.f63862r0 = c19502e;
        this.f63863s0 = new C19662a(4);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC1616b.f4573e == null) {
            AbstractC1616b.f4573e = Boolean.valueOf(AbstractC1616b.m2472d() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC1616b.f4573e.booleanValue()) {
            this.f63856A0 = false;
        }
        handlerC6378d.sendMessage(handlerC6378d.obtainMessage(6));
    }

    /* JADX INFO: renamed from: a */
    public static void m20977a() {
        synchronized (f63854D0) {
            try {
                C20159e c20159e = f63855E0;
                if (c20159e != null) {
                    c20159e.f63865u0.incrementAndGet();
                    HandlerC6378d handlerC6378d = c20159e.f63870z0;
                    handlerC6378d.sendMessageAtFrontOfQueue(handlerC6378d.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static Status m20978e(C20155a c20155a, C19499b c19499b) {
        return new Status(17, AbstractC10763a.m11055m("API: ", (String) c20155a.f63844b.f33997Z, " is not available on this device. Connection failed with: ", String.valueOf(c19499b)), c19499b.f61941o0, c19499b);
    }

    /* JADX INFO: renamed from: g */
    public static C20159e m20979g(Context context) {
        C20159e c20159e;
        synchronized (f63854D0) {
            try {
                if (f63855E0 == null) {
                    Looper looper = C20481D.m21129a().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = C19502e.f61949c;
                    f63855E0 = new C20159e(applicationContext, looper);
                }
                c20159e = f63855E0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c20159e;
    }

    /* JADX INFO: renamed from: b */
    public final void m20980b(DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o) {
        synchronized (f63854D0) {
            try {
                if (this.f63867w0 != dialogInterfaceOnCancelListenerC20169o) {
                    this.f63867w0 = dialogInterfaceOnCancelListenerC20169o;
                    this.f63868x0.clear();
                }
                this.f63868x0.addAll(dialogInterfaceOnCancelListenerC20169o.f63881r0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20981c() {
        if (this.f63858Z) {
            return false;
        }
        C20492j c20492j = (C20492j) C20491i.m21138a().f65068Y;
        if (c20492j != null && !c20492j.f65070Z) {
            return false;
        }
        int i10 = ((SparseIntArray) this.f63863s0.f62320Y).get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m20982d(C19499b c19499b, int i10) {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        C19502e c19502e = this.f63862r0;
        Context context = this.f63861q0;
        c19502e.getClass();
        synchronized (AbstractC2359a.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                Context context2 = AbstractC2359a.f7315a;
                if (context2 == null || (bool = AbstractC2359a.f7316b) == null || context2 != applicationContext) {
                    AbstractC2359a.f7316b = null;
                    if (AbstractC1616b.m2472d()) {
                        AbstractC2359a.f7316b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                    } else {
                        try {
                            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                            AbstractC2359a.f7316b = Boolean.TRUE;
                        } catch (ClassNotFoundException unused) {
                            AbstractC2359a.f7316b = Boolean.FALSE;
                        }
                    }
                    AbstractC2359a.f7315a = applicationContext;
                    zBooleanValue = AbstractC2359a.f7316b.booleanValue();
                } else {
                    zBooleanValue = bool.booleanValue();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zBooleanValue) {
            return false;
        }
        int i11 = c19499b.f61940Z;
        if (i11 == 0 || (activity = c19499b.f61941o0) == null) {
            Intent intentM20601b = c19502e.m20601b(i11, context, null);
            activity = intentM20601b != null ? PendingIntent.getActivity(context, 0, intentM20601b, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i12 = c19499b.f61940Z;
        int i13 = GoogleApiActivity.f36043Z;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", true);
        c19502e.m20598g(context, i12, PendingIntent.getActivity(context, 0, intent, AbstractC6377c.f20773a | 134217728));
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final C20171q m20983f(AbstractC19821f abstractC19821f) {
        ConcurrentHashMap concurrentHashMap = this.f63866v0;
        C20155a c20155a = abstractC19821f.f62878e;
        C20171q c20171q = (C20171q) concurrentHashMap.get(c20155a);
        if (c20171q == null) {
            c20171q = new C20171q(this, abstractC19821f);
            concurrentHashMap.put(c20155a, c20171q);
        }
        if (c20171q.f63885b.mo13208m()) {
            this.f63869y0.add(c20155a);
        }
        c20171q.m21002l();
        return c20171q;
    }

    /* JADX INFO: renamed from: h */
    public final void m20984h(C19499b c19499b, int i10) {
        if (m20982d(c19499b, i10)) {
            return;
        }
        HandlerC6378d handlerC6378d = this.f63870z0;
        handlerC6378d.sendMessage(handlerC6378d.obtainMessage(5, i10, 0, c19499b));
    }

    /* JADX WARN: Code duplicated, block: B:141:0x031d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0323  */
    /* JADX WARN: Code duplicated, block: B:144:0x0349  */
    /* JADX WARN: Code duplicated, block: B:145:0x0354  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 u9.q, still in use, count: 2, list:
          (r2v10 u9.q) from 0x0315: IGET (r2v10 u9.q) A[WRAPPED] (LINE:791) u9.q.g int
          (r2v10 u9.q) from 0x031b: PHI (r2 I:??) = (r2v7 u9.q), (r2v10 u9.q) binds: [B:139:0x031a, B:188:0x031b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1036u9.C20159e.handleMessage(android.os.Message):boolean");
    }
}
