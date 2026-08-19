package p179H0;

import com.segment.analytics.kotlin.core.AbstractC12774a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16533a;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p117Eb.C2392v;
import p153Fn.C2925c;
import p349O0.C5994b0;
import p523V9.AbstractC8017W3;
import p530Vi.C8297E;
import p530Vi.C8312h;
import p554Wi.C8876c;
import p554Wi.C8877d;
import p554Wi.C8878e;
import p580Xi.C9519e;
import p580Xi.C9521g;
import p594Y9.AbstractC9758K4;
import p626Zi.InterfaceC10398b;
import sm.InterfaceC19693i;

/* JADX INFO: renamed from: H0.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3191i extends C16533a implements InterfaceC1439n, InterfaceC19693i {

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ int f9625t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3191i(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f9625t0 = i12;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9625t0) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                C3196n c3196n = (C3196n) this.f51270Y;
                float f10 = 0.0f;
                if (!c3196n.m4043b()) {
                    if (c3196n.m4042a() > c3196n.f9644g.m6409g()) {
                        ((InterfaceC1426a) c3196n.f9639b.getValue()).invoke();
                    }
                    AbstractC0575H.m1156D(c3196n.f9638a, null, null, new C3195m(c3196n, 0.0f, null), 3);
                    C5994b0 c5994b0 = c3196n.f9643f;
                    if (c5994b0.m6409g() == 0.0f || fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    c5994b0.m6410h(0.0f);
                    f10 = fFloatValue;
                }
                return new Float(f10);
            case 1:
                C8297E state = (C8297E) obj;
                C9519e c9519e = (C9519e) this.f51270Y;
                c9519e.getClass();
                AbstractC16544l.m18094g(state, "state");
                if (state.f25857e) {
                    C8878e c8878e = c9519e.f28649p0;
                    if (c8878e != null && !c8878e.f27178h) {
                        c8878e.f27178h = true;
                        if (c8878e.f27175e.m2535D() || c8878e.f27175e.mo2515d()) {
                            c8878e.f27175e = AbstractC8017W3.m8337a(Integer.MAX_VALUE, 6, null);
                            c8878e.f27176f = AbstractC8017W3.m8337a(Integer.MAX_VALUE, 6, null);
                        }
                        Iterator it = c8878e.f27173c.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            C8312h c8312h = c8878e.f27171a;
                            if (zHasNext) {
                                ((InterfaceC10398b) it.next()).mo10896d(c8312h);
                            } else {
                                C2392v c2392v = c8312h.f25903Z;
                                AbstractC0575H.m1156D((C2925c) c2392v.f7437o0, (C0611f0) c2392v.f7440r0, null, new C8877d(c8878e, null), 2);
                                AbstractC0575H.m1156D((C2925c) c8312h.f25903Z.f7437o0, (C0611f0) c8312h.f25903Z.f7439q0, null, new C8876c(c8878e, null), 2);
                            }
                        }
                    }
                } else {
                    C8878e c8878e2 = c9519e.f28649p0;
                    if (c8878e2 != null) {
                        c8878e2.m9553b();
                    }
                }
                return C17296C.f55119a;
            default:
                C8297E c8297e = (C8297E) obj;
                C9521g c9521g = (C9521g) this.f51270Y;
                AbstractC9758K4.m10361b(c9521g.mo7804c(), "Analytics starting = " + c8297e.f25855c);
                AtomicBoolean atomicBoolean = c9521g.f28656Z;
                atomicBoolean.set(c8297e.f25855c);
                if (atomicBoolean.get()) {
                    while (true) {
                        ConcurrentLinkedQueue concurrentLinkedQueue = c9521g.f28657o0;
                        if (!concurrentLinkedQueue.isEmpty()) {
                            AbstractC12774a abstractC12774a = (AbstractC12774a) concurrentLinkedQueue.poll();
                            if (abstractC12774a != null) {
                                c9521g.mo7804c().m8934d(abstractC12774a, null);
                            }
                        }
                    }
                }
                return C17296C.f55119a;
        }
    }
}
