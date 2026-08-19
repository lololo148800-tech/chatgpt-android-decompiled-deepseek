package p103Dn;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0624m;
import p077Cn.EnumC1733a;
import p129En.AbstractC2591b;
import p129En.AbstractC2592c;
import p129En.AbstractC2593d;
import p129En.InterfaceC2614y;
import p153Fn.C2942t;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Dn.Q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2153Q0 extends AbstractC2591b implements InterfaceC2213w0, InterfaceC2184i, InterfaceC2614y {

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6598r0 = AtomicReferenceFieldUpdater.newUpdater(C2153Q0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: q0 */
    public int f6599q0;

    public C2153Q0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p103Dn.InterfaceC2211v0, p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        setValue(obj);
        return C17296C.f55119a;
    }

    @Override // p129En.InterfaceC2614y
    /* JADX INFO: renamed from: b */
    public final InterfaceC2184i mo3229b(InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || enumC1733a != EnumC1733a.f4962Z) ? AbstractC2124C.m3225x(this, interfaceC18776i, i10, enumC1733a) : this;
    }

    @Override // p103Dn.InterfaceC2211v0
    /* JADX INFO: renamed from: e */
    public final void mo3230e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // p103Dn.InterfaceC2211v0
    /* JADX INFO: renamed from: f */
    public final boolean mo3231f(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // p129En.AbstractC2591b
    /* JADX INFO: renamed from: g */
    public final AbstractC2593d mo3232g() {
        return new C2154R0();
    }

    @Override // p103Dn.InterfaceC2149O0
    public final Object getValue() {
        C2942t c2942t = AbstractC2592c.f8037b;
        Object obj = f6598r0.get(this);
        if (obj == c2942t) {
            return null;
        }
        return obj;
    }

    @Override // p129En.AbstractC2591b
    /* JADX INFO: renamed from: h */
    public final AbstractC2593d[] mo3233h() {
        return new C2154R0[2];
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3250k(Object obj, Object obj2) {
        C2942t c2942t = AbstractC2592c.f8037b;
        if (obj == null) {
            obj = c2942t;
        }
        if (obj2 == null) {
            obj2 = c2942t;
        }
        return m3251l(obj, obj2);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3251l(Object obj, Object obj2) {
        int i10;
        AbstractC2593d[] abstractC2593dArr;
        C2942t c2942t;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6598r0;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC16544l.m18089b(obj3, obj)) {
                return false;
            }
            if (AbstractC16544l.m18089b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f6599q0;
            if ((i11 & 1) != 0) {
                this.f6599q0 = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f6599q0 = i12;
            AbstractC2593d[] abstractC2593dArr2 = this.f8032Y;
            while (true) {
                C2154R0[] c2154r0Arr = (C2154R0[]) abstractC2593dArr2;
                if (c2154r0Arr != null) {
                    for (C2154R0 c2154r0 : c2154r0Arr) {
                        if (c2154r0 != null) {
                            AtomicReference atomicReference = c2154r0.f6600a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (c2942t = AbstractC2124C.f6498e)) {
                                    break;
                                }
                                C2942t c2942t2 = AbstractC2124C.f6497d;
                                if (obj4 != c2942t2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, c2942t2)) {
                                            ((C0624m) obj4).resumeWith(C17296C.f55119a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, c2942t)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f6599q0;
                    if (i10 == i12) {
                        this.f6599q0 = i12 + 1;
                        return true;
                    }
                    abstractC2593dArr = this.f8032Y;
                }
                abstractC2593dArr2 = abstractC2593dArr;
                i12 = i10;
            }
        }
    }

    @Override // p103Dn.InterfaceC2213w0
    public final void setValue(Object obj) {
        if (obj == null) {
            obj = AbstractC2592c.f8037b;
        }
        m3251l(null, obj);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x010b A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x003b, B:37:0x009b, B:39:0x00a3, B:42:0x00aa, B:43:0x00ae, B:45:0x00b1, B:55:0x00d5, B:58:0x00e5, B:59:0x0102, B:65:0x0114, B:62:0x010b, B:64:0x0111, B:47:0x00b7, B:51:0x00be, B:21:0x0057, B:24:0x0062, B:36:0x008c), top: B:74:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:0: B:59:0x0102->B:79:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00e4 -> B:37:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final java.lang.Object mo3141d(p103Dn.InterfaceC2186j r17, p972qm.InterfaceC18770c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p103Dn.C2153Q0.mo3141d(Dn.j, qm.c):java.lang.Object");
    }
}
