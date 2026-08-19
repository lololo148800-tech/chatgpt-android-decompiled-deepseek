package p109E3;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Size;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.InterfaceC11112u;
import com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1;
import com.revenuecat.purchases.interfaces.Callback;
import fo.C13711h;
import io.sentry.C15358g1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.protocol.C15426F;
import io.sentry.protocol.C15427G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p001A.C0072l;
import p001A.RunnableC0074m;
import p007A5.C0376k;
import p049Bm.InterfaceC1436k;
import p1009s9.C19506i;
import p1020t7.C19805c;
import p1020t7.InterfaceC19806d;
import p1035u7.C20144b;
import p1035u7.RunnableC20147e;
import p1035u7.RunnableC20148f;
import p1048uo.AbstractC20397d;
import p155G.C2953e;
import p178H.C3112E;
import p178H.C3123P;
import p178H.C3142e0;
import p178H.C3163p;
import p178H.C3176v0;
import p178H.InterfaceC3108A;
import p221Ii.C3727f;
import p228J.AbstractC3817T;
import p228J.C3814P;
import p228J.C3815Q;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3835f0;
import p228J.InterfaceC3818U;
import p283L5.AbstractC4941g;
import p301M.RunnableC5220b;
import p468T2.RunnableC7220l;
import p523V9.AbstractC7889G0;
import p536W.C8406b;
import p536W.C8408d;
import p569X7.EnumC9072a;
import p594Y9.AbstractC9900h3;
import p658b5.C11234e;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p720e6.C13287b;
import p720e6.C13288c;
import p784hb.C14438g;
import p823j3.C16084f;
import p826j6.AbstractC16148b;
import p826j6.C16155i;
import p893n.AbstractActivityC17375g;
import p893n.C17368E;
import p909nm.AbstractC17681o;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: E3.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2301y implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7136Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f7137Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f7138o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f7139p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f7140q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f7141r0;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC2301y(PreviewView previewView, InterfaceC3108A interfaceC3108A, C3163p c3163p, C14438g c14438g, InterfaceC1436k interfaceC1436k) {
        this.f7136Y = 3;
        this.f7137Z = previewView;
        this.f7138o0 = interfaceC3108A;
        this.f7139p0 = c3163p;
        this.f7140q0 = c14438g;
        this.f7141r0 = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnableC7220l;
        int i10 = 14;
        int i11 = 1;
        switch (this.f7136Y) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) this.f7137Z;
                C13288c c13288c = (C13288c) this.f7138o0;
                Handler handler = (Handler) this.f7139p0;
                C2269J c2269j = (C2269J) this.f7140q0;
                C0376k c0376k = (C0376k) this.f7141r0;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (c13288c != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC0074m(c13288c, i10, c2269j));
                    }
                    c0376k.m1015h();
                    synchronized (C2268I.f6938m0) {
                        try {
                            int i12 = C2268I.f6940o0 - 1;
                            C2268I.f6940o0 = i12;
                            if (i12 == 0) {
                                C2268I.f6939n0.shutdown();
                                C2268I.f6939n0 = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    if (c13288c != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC0074m(c13288c, i10, c2269j));
                    }
                    c0376k.m1015h();
                    synchronized (C2268I.f6938m0) {
                        try {
                            int i13 = C2268I.f6940o0 - 1;
                            C2268I.f6940o0 = i13;
                            if (i13 == 0) {
                                C2268I.f6939n0.shutdown();
                                C2268I.f6939n0 = null;
                            }
                            throw th3;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            case 1:
                PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingSetupFinished$lambda$1((AtomicBoolean) this.f7137Z, (C16155i) this.f7138o0, (Callback) this.f7139p0, (AbstractC16148b) this.f7140q0, (List) this.f7141r0);
                return;
            case 2:
                AtomicReference atomicReference = (AtomicReference) this.f7137Z;
                View view = (View) this.f7138o0;
                List list = (List) this.f7139p0;
                CountDownLatch countDownLatch = (CountDownLatch) this.f7140q0;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    C15426F c15426f = new C15426F("android_view_system", arrayList);
                    C15427G c15427gM16415c = ViewHierarchyEventProcessor.m16415c(view);
                    arrayList.add(c15427gM16415c);
                    ViewHierarchyEventProcessor.m16414b(view, c15427gM16415c, list);
                    atomicReference.set(c15426f);
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th5) {
                    ((InterfaceC15127H) this.f7141r0).mo16297h(EnumC15375i1.ERROR, "Failed to process view hierarchy.", th5);
                    return;
                }
            case 3:
                final PreviewView previewView = (PreviewView) this.f7137Z;
                final C3163p c3163p = (C3163p) this.f7139p0;
                final C14438g this$0 = (C14438g) this.f7140q0;
                AbstractC16544l.m18094g(this$0, "this$0");
                final ?? r13 = (AbstractC16546n) this.f7141r0;
                if (previewView.isAttachedToWindow()) {
                    Context context = previewView.getContext();
                    AbstractC16544l.m18093f(context, "getContext(...)");
                    AbstractActivityC17375g abstractActivityC17375gM21062d = AbstractC20397d.m21062d(context);
                    if (abstractActivityC17375gM21062d == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    C17368E c17368eM19054q = abstractActivityC17375gM21062d.m19054q();
                    if (c17368eM19054q != null && !c17368eM19054q.f55427p) {
                        c17368eM19054q.f55427p = true;
                        c17368eM19054q.m19045g(false);
                    }
                    final int rotation = previewView.getDisplay().getRotation();
                    final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    Context context2 = previewView.getContext();
                    C8408d c8408d = C8408d.f26139g;
                    final RunnableC5220b runnableC5220bM10565b = AbstractC9900h3.m10565b(context2);
                    final InterfaceC3108A interfaceC3108A = (InterfaceC3108A) this.f7138o0;
                    runnableC5220bM10565b.mo5766a(new Runnable(rotation, interfaceC3108A, executorServiceNewSingleThreadExecutor, previewView, c3163p, this$0, r13) { // from class: pj.w

                        /* JADX INFO: renamed from: Z */
                        public final /* synthetic */ int f58941Z;

                        /* JADX INFO: renamed from: o0 */
                        public final /* synthetic */ InterfaceC3108A f58942o0;

                        /* JADX INFO: renamed from: p0 */
                        public final /* synthetic */ ExecutorService f58943p0;

                        /* JADX INFO: renamed from: q0 */
                        public final /* synthetic */ PreviewView f58944q0;

                        /* JADX INFO: renamed from: r0 */
                        public final /* synthetic */ C3163p f58945r0;

                        /* JADX INFO: renamed from: s0 */
                        public final /* synthetic */ C14438g f58946s0;

                        /* JADX INFO: renamed from: t0 */
                        public final /* synthetic */ AbstractC16546n f58947t0;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.f58947t0 = (AbstractC16546n) r13;
                        }

                        /* JADX WARN: Type inference failed for: r8v0, types: [Bm.k, kotlin.jvm.internal.n] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            RunnableC5220b runnableC5220b = this.f58940Y;
                            int i14 = this.f58941Z;
                            InterfaceC3108A interfaceC3108A2 = this.f58942o0;
                            ExecutorService executorService = this.f58943p0;
                            PreviewView previewView2 = this.f58944q0;
                            C3163p c3163p2 = this.f58945r0;
                            C14438g this$1 = this.f58946s0;
                            ?? r10 = this.f58947t0;
                            AbstractC16544l.m18094g(this$1, "this$0");
                            C8408d c8408d2 = (C8408d) runnableC5220b.get();
                            C2953e c2953e = new C2953e(2);
                            C3828c c3828c = InterfaceC3818U.f11564m;
                            Integer numValueOf = Integer.valueOf(i14);
                            C3825a0 c3825a0 = c2953e.f8836Z;
                            c3825a0.m4561x(c3828c, numValueOf);
                            c3825a0.m4561x(InterfaceC3818U.f11565n, Integer.valueOf(i14));
                            C3142e0 c3142e0M3778a = c2953e.m3778a();
                            C3176v0 c3176v0 = new C3176v0();
                            c3176v0.f9584a.add(c3142e0M3778a);
                            C13287b c13287b = new C13287b(11);
                            ((C3825a0) c13287b.f42000Z).m4561x(C3815Q.f11548Z, 1);
                            ((C3825a0) c13287b.f42000Z).m4561x(c3828c, Integer.valueOf(i14));
                            C3123P c3123pM14901e = c13287b.m14901e();
                            c3176v0.f9584a.add(c3123pM14901e);
                            if (interfaceC3108A2 != null) {
                                C19506i c19506i = new C19506i(9, (byte) 0);
                                ((C3825a0) c19506i.f61960Z).m4561x(C3814P.f11542o0, 0);
                                ((C3825a0) c19506i.f61960Z).m4561x(InterfaceC3818U.f11567p, new Size(2000, 2000));
                                ((C3825a0) c19506i.f61960Z).m4561x(c3828c, Integer.valueOf(i14));
                                C3814P c3814p = new C3814P(C3835f0.m4568a((C3825a0) c19506i.f61960Z));
                                AbstractC3817T.m4557e(c3814p);
                                C3112E c3112e = new C3112E(c3814p);
                                synchronized (c3112e.f9354p) {
                                    try {
                                        c3112e.f9353o.m3952i(executorService, new C0072l(interfaceC3108A2, 25));
                                        if (c3112e.f9355q == null) {
                                            c3112e.m4017m();
                                        }
                                        c3112e.f9355q = interfaceC3108A2;
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                                c3176v0.f9584a.add(c3112e);
                            }
                            c8408d2.m8961g();
                            try {
                                Context context3 = previewView2.getContext();
                                AbstractC16544l.m18093f(context3, "getContext(...)");
                                AbstractActivityC17375g abstractActivityC17375gM21062d2 = AbstractC20397d.m21062d(context3);
                                if (abstractActivityC17375gM21062d2 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                ArrayList arrayList2 = c3176v0.f9584a;
                                AbstractC4941g.m5554M("UseCase must not be empty.", !arrayList2.isEmpty());
                                ArrayList arrayList3 = c3176v0.f9585b;
                                Iterator it = arrayList3.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                                C8406b c8406bM8958d = c8408d2.m8958d(abstractActivityC17375gM21062d2, c3163p2, new C11234e(arrayList2, 7, arrayList3));
                                this$1.f45414Y = new C13711h(c8406bM8958d, c3123pM14901e, C14438g.m15961h(c8406bM8958d), 25);
                                Object context4 = previewView2.getContext();
                                AbstractC16544l.m18092e(context4, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                                ((InterfaceC11112u) context4).mo7809i().mo7806a(new C3727f(executorService, 5));
                                c3142e0M3778a.m3983C(previewView2.getSurfaceProvider());
                            } catch (IllegalArgumentException unused) {
                                r10.invoke(new C18445S());
                            }
                        }
                    }, AbstractC17803d.m19557d(previewView.getContext()));
                    return;
                }
                return;
            default:
                C20144b this$1 = (C20144b) this.f7137Z;
                AbstractC16544l.m18094g(this$1, "this$0");
                InterfaceC19806d previousOrchestrator = (InterfaceC19806d) this.f7139p0;
                AbstractC16544l.m18094g(previousOrchestrator, "$previousOrchestrator");
                EnumC9072a newConsent = (EnumC9072a) this.f7140q0;
                AbstractC16544l.m18094g(newConsent, "$newConsent");
                InterfaceC19806d newOrchestrator = (InterfaceC19806d) this.f7141r0;
                AbstractC16544l.m18094g(newOrchestrator, "$newOrchestrator");
                C15358g1 c15358g1 = this$1.f63809o0;
                EnumC9072a enumC9072a = (EnumC9072a) this.f7138o0;
                C17309l c17309l = new C17309l(enumC9072a, newConsent);
                EnumC9072a enumC9072a2 = EnumC9072a.f27785o0;
                boolean zEquals = c17309l.equals(new C17309l(null, enumC9072a2));
                EnumC9072a enumC9072a3 = EnumC9072a.f27783Y;
                boolean zEquals2 = zEquals ? true : c17309l.equals(new C17309l(null, enumC9072a3));
                EnumC9072a enumC9072a4 = EnumC9072a.f27784Z;
                boolean zEquals3 = zEquals2 ? true : c17309l.equals(new C17309l(null, enumC9072a4)) ? true : c17309l.equals(new C17309l(enumC9072a2, enumC9072a4));
                C19805c c19805c = (C19805c) c15358g1.f47945Y;
                InterfaceC11256c interfaceC11256c = (InterfaceC11256c) c15358g1.f47946Z;
                if (zEquals3) {
                    runnableC7220l = new RunnableC20148f(previousOrchestrator.mo12597r(), c19805c, interfaceC11256c);
                } else if (c17309l.equals(new C17309l(enumC9072a3, enumC9072a2)) ? true : c17309l.equals(new C17309l(enumC9072a4, enumC9072a2))) {
                    runnableC7220l = new RunnableC20148f(newOrchestrator.mo12597r(), c19805c, interfaceC11256c);
                } else if (c17309l.equals(new C17309l(enumC9072a2, enumC9072a3))) {
                    runnableC7220l = new RunnableC20147e(previousOrchestrator.mo12597r(), newOrchestrator.mo12597r(), c19805c, interfaceC11256c);
                } else if (c17309l.equals(new C17309l(enumC9072a2, enumC9072a2)) ? true : c17309l.equals(new C17309l(enumC9072a3, enumC9072a3)) ? true : c17309l.equals(new C17309l(enumC9072a3, enumC9072a4)) ? true : c17309l.equals(new C17309l(enumC9072a4, enumC9072a4)) ? true : c17309l.equals(new C17309l(enumC9072a4, enumC9072a3))) {
                    runnableC7220l = new RunnableC7220l(i11);
                } else {
                    AbstractC7889G0.m8185c((InterfaceC11256c) c15358g1.f47946Z, 4, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C16084f(enumC9072a, 17, newConsent), null, 56);
                    runnableC7220l = new RunnableC7220l(i11);
                }
                runnableC7220l.run();
                this$1.f63812r0 = newOrchestrator;
                return;
        }
    }

    public /* synthetic */ RunnableC2301y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f7136Y = i10;
        this.f7137Z = obj;
        this.f7138o0 = obj2;
        this.f7139p0 = obj3;
        this.f7140q0 = obj4;
        this.f7141r0 = obj5;
    }
}
