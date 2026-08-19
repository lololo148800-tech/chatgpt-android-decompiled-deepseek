package p215Ic;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.datadog.android.rum.DdRumContentProvider;
import fo.C13711h;
import gd.C13871L0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import io.opentracing.util.GlobalTracer;
import io.sentry.internal.debugmeta.C15384c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p030B2.AbstractC0719B0;
import p049Bm.InterfaceC1439n;
import p071Ch.C1676g;
import p087D7.AbstractC1976c;
import p1021t8.C19812c;
import p1021t8.C19814e;
import p1059v8.C20477a;
import p1113xn.AbstractC21322p;
import p1155zi.C21891A;
import p1155zi.C22013h2;
import p1155zi.EnumC21895B;
import p221Ii.RunnableC3724c;
import p289Lc.C4993a;
import p289Lc.C4994b;
import p336Nc.C5706b;
import p523V9.AbstractC7889G0;
import p544W9.AbstractC8639g4;
import p571X9.AbstractC9233X;
import p592Y7.AbstractC9667b;
import p592Y7.C9666a;
import p592Y7.C9669d;
import p592Y7.InterfaceC9670e;
import p592Y7.InterfaceC9672g;
import p641a7.AbstractC10516b;
import p642a8.C10518a;
import p642a8.C10525h;
import p658b5.C11234e;
import p661b7.C11254a;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p714e0.C13254b;
import p722e8.C13338v;
import p743f7.InterfaceC13575a;
import p765g7.InterfaceC13823a;
import p804i8.C14943b;
import p902n8.InterfaceC17524k;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p984r8.C18889c;
import p996rm.EnumC19250a;
import sj.hJY.CsqksqyPE;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ic.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3687d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f11188Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f11189Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3688e f11190o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3687d(C3688e c3688e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11190o0 = c3688e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3687d c3687d = new C3687d(this.f11190o0, interfaceC18770c);
        c3687d.f11189Z = obj;
        return c3687d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3687d) create((C21891A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0250 A[LOOP:0: B:80:0x024a->B:82:0x0250, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM15482b;
        C13711h c13711hM5644f;
        ApplicationExitInfo applicationExitInfoM1508c;
        Object next;
        InterfaceC9670e interfaceC9670eM10254a;
        InterfaceC11256c interfaceC11256cMo15463s;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f11188Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21891A c21891a = (C21891A) this.f11189Z;
            C5706b c5706b = (C5706b) this.f11190o0.f11195q0;
            String str = c21891a.f69416b.f69655a;
            String strM22322a = c21891a.m22322a();
            if (strM22322a == null) {
                strM22322a = null;
            }
            String deviceId = ((C1676g) this.f11190o0.f11197s0).m2506a();
            C22013h2 c22013h2 = c21891a.f69416b;
            String str2 = c22013h2.f69656b;
            String str3 = c22013h2.f69657c;
            String strM22328g = c21891a.m22328g();
            c5706b.getClass();
            AbstractC16544l.m18094g(deviceId, "deviceId");
            EnumC21895B enumC21895B = EnumC21895B.f69419Z;
            EnumC21895B enumC21895B2 = c5706b.f18492Y;
            if (enumC21895B2 == enumC21895B) {
                str2 = null;
            }
            C17309l c17309l = new C17309l("account_id", strM22322a);
            C17309l c17309l2 = new C17309l("device_id", deviceId);
            C17309l c17309l3 = new C17309l("plan_type", strM22328g);
            if (enumC21895B2 == enumC21895B) {
                str3 = null;
            }
            AbstractC10516b.m10971a(null).mo15447c(str, null, str2, AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, new C17309l("phone_number", str3)));
            InterfaceC13849E interfaceC13849E = this.f11190o0.f11192Z;
            C13871L0 c13871l0 = C13871L0.f43909c;
            this.f11188Y = 1;
            objM15482b = ((C14005w2) interfaceC13849E).m15482b(c13871l0, this);
            if (objM15482b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            objM15482b = obj;
        }
        boolean zBooleanValue = ((Boolean) objM15482b).booleanValue();
        C5706b c5706b2 = (C5706b) this.f11190o0.f11195q0;
        if (zBooleanValue) {
            zBooleanValue = zBooleanValue;
            c5706b2.getClass();
        } else {
            C9669d rumConfiguration = c5706b2.f18495p0;
            InterfaceC13823a interfaceC13823aM10971a = AbstractC10516b.m10971a(null);
            AbstractC16544l.m18094g(rumConfiguration, "rumConfiguration");
            boolean z6 = interfaceC13823aM10971a instanceof InterfaceC13823a;
            if (!z6) {
                InterfaceC13823a interfaceC13823a = z6 ? interfaceC13823aM10971a : null;
                if (interfaceC13823a == null || (interfaceC11256cMo15463s = interfaceC13823a.mo15463s()) == null) {
                    InterfaceC11256c.f34102a.getClass();
                    interfaceC11256cMo15463s = C11254a.f34097b;
                }
                AbstractC7889G0.m8184b(interfaceC11256cMo15463s, 5, EnumC11255b.f34098Y, C9666a.f29143o0, null, false, 56);
            } else if (AbstractC21322p.m21681O("c9880c8d-14b8-4540-aefd-e4a07e9216b4")) {
                AbstractC7889G0.m8184b(interfaceC13823aM10971a.mo15463s(), 5, EnumC11255b.f34098Y, C9666a.f29144p0, null, false, 56);
            } else {
                InterfaceC13823a interfaceC13823a2 = interfaceC13823aM10971a;
                if (interfaceC13823a2.mo15458n("rum") != null) {
                    AbstractC7889G0.m8184b(interfaceC13823a2.mo15463s(), 4, EnumC11255b.f34098Y, C9666a.f29145q0, null, false, 56);
                } else {
                    C10525h c10525h = new C10525h(interfaceC13823a2, rumConfiguration.f29155a);
                    interfaceC13823a2.mo15457m(c10525h);
                    C15384c c15384c = new C15384c(interfaceC13823a2.mo15463s());
                    float f10 = c10525h.f31226r0;
                    InterfaceC13575a interfaceC13575a = c10525h.f31224p0;
                    Handler handler = new Handler(Looper.getMainLooper());
                    C18889c c18889c = new C18889c(interfaceC13823a2, new C11234e(c10525h.f31227s0), new C11234e(c10525h.f31228t0), c15384c);
                    C13254b c13254bMo15464t = interfaceC13823a2.mo15464t();
                    InterfaceC17524k interfaceC17524k = c10525h.f31234z0;
                    InterfaceC17524k interfaceC17524k2 = c10525h.f31210A0;
                    InterfaceC17524k interfaceC17524k3 = c10525h.f31211B0;
                    boolean z10 = c10525h.f31229u0;
                    boolean z11 = c10525h.f31230v0;
                    InterfaceC9672g interfaceC9672g = c10525h.f31212C0;
                    ExecutorService executorServiceMo15465u = interfaceC13823a2.mo15465u("rum-pipeline");
                    C14943b c14943b = new C14943b(interfaceC13823a2, f10, z10, z11, interfaceC13575a, handler, c18889c, c15384c, c13254bMo15464t, interfaceC17524k, interfaceC17524k2, interfaceC17524k3, interfaceC9672g, executorServiceMo15465u);
                    if (Build.VERSION.SDK_INT >= 30) {
                        Context context = c10525h.f31216G0;
                        if (context == null) {
                            AbstractC16544l.m18103p(CsqksqyPE.aoawxcTN);
                            throw null;
                        }
                        Object systemService = context.getSystemService("activity");
                        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                        try {
                            List historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(null, 0, 0);
                            AbstractC16544l.m18093f(historicalProcessExitReasons, "activityManager.getHisto…ssExitReasons(null, 0, 0)");
                            Iterator it = historicalProcessExitReasons.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (AbstractC0719B0.m1508c(next).getReason() != 6);
                            applicationExitInfoM1508c = AbstractC0719B0.m1508c(next);
                        } catch (RuntimeException e10) {
                            AbstractC7889G0.m8184b(interfaceC13823a2.mo15463s(), 5, EnumC11255b.f34099Z, C10518a.f31178u0, e10, false, 48);
                            applicationExitInfoM1508c = null;
                        }
                        if (applicationExitInfoM1508c != null) {
                            AbstractC1976c.m3152i(executorServiceMo15465u, "Send fatal ANR", interfaceC13823a2.mo15463s(), new RunnableC3724c(c10525h, 25, applicationExitInfoM1508c));
                        }
                    }
                    LinkedHashMap linkedHashMap = AbstractC9667b.f29147a;
                    synchronized (linkedHashMap) {
                        try {
                            if (linkedHashMap.containsKey(interfaceC13823aM10971a)) {
                                AbstractC7889G0.m8184b(interfaceC13823aM10971a.mo15463s(), 4, EnumC11255b.f34098Y, C9666a.f29142Z, null, false, 56);
                            } else {
                                linkedHashMap.put(interfaceC13823aM10971a, c14943b);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    c14943b.m16110w(new C13338v(DdRumContentProvider.f35997Y == 100));
                }
                LinkedHashMap linkedHashMap2 = AbstractC9667b.f29147a;
                interfaceC9670eM10254a = AbstractC9667b.m10254a(AbstractC10516b.m10971a(null));
                for (Map.Entry entry : C5706b.f18491q0.entrySet()) {
                    interfaceC9670eM10254a.mo10265u(entry.getValue(), (String) entry.getKey());
                }
                C19814e traceConfiguration = c5706b2.f18494o0;
                InterfaceC13823a interfaceC13823aM10971a2 = AbstractC10516b.m10971a(null);
                AbstractC16544l.m18094g(traceConfiguration, "traceConfiguration");
                InterfaceC13823a interfaceC13823a3 = interfaceC13823aM10971a2;
                interfaceC13823a3.mo15457m(new C20477a(interfaceC13823a3, traceConfiguration.f62863a));
                C19812c c19812c = new C19812c(AbstractC10516b.m10971a(null));
                c19812c.f62855e = AbstractC8639g4.m9297a(c5706b2.f18492Y);
                c19812c.f62854d = true;
                GlobalTracer.m16232a(c19812c.m20768a());
            }
            LinkedHashMap linkedHashMap3 = AbstractC9667b.f29147a;
            interfaceC9670eM10254a = AbstractC9667b.m10254a(AbstractC10516b.m10971a(null));
            while (r1.hasNext()) {
                interfaceC9670eM10254a.mo10265u(entry.getValue(), (String) entry.getKey());
            }
            C19814e traceConfiguration2 = c5706b2.f18494o0;
            InterfaceC13823a interfaceC13823aM10971a3 = AbstractC10516b.m10971a(null);
            AbstractC16544l.m18094g(traceConfiguration2, "traceConfiguration");
            InterfaceC13823a interfaceC13823a4 = interfaceC13823aM10971a3;
            interfaceC13823a4.mo15457m(new C20477a(interfaceC13823a4, traceConfiguration2.f62863a));
            C19812c c19812c2 = new C19812c(AbstractC10516b.m10971a(null));
            c19812c2.f62855e = AbstractC8639g4.m9297a(c5706b2.f18492Y);
            c19812c2.f62854d = true;
            GlobalTracer.m16232a(c19812c2.m20768a());
        }
        C4994b c4994b = (C4994b) this.f11190o0.f11196r0;
        if (zBooleanValue) {
            C4993a c4993a = C4993a.f16299o0;
            c4994b.getClass();
            c13711hM5644f = C4994b.m5644f(c4993a);
        } else {
            c13711hM5644f = c4994b.f16302b;
        }
        c4994b.f16303c = c13711hM5644f;
        return C17296C.f55119a;
    }
}
