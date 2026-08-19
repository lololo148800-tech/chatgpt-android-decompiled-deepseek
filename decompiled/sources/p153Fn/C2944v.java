package p153Fn;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractRunnableC0601a0;
import p025An.C0603b0;

/* JADX INFO: renamed from: Fn.v */
/* JADX INFO: loaded from: classes2.dex */
public class C2944v {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8809b = AtomicIntegerFieldUpdater.newUpdater(C2944v.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public AbstractRunnableC0601a0[] f8810a;

    /* JADX INFO: renamed from: a */
    public final void m3767a(AbstractRunnableC0601a0 abstractRunnableC0601a0) {
        abstractRunnableC0601a0.m1230d((C0603b0) this);
        AbstractRunnableC0601a0[] abstractRunnableC0601a0Arr = this.f8810a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8809b;
        if (abstractRunnableC0601a0Arr == null) {
            abstractRunnableC0601a0Arr = new AbstractRunnableC0601a0[4];
            this.f8810a = abstractRunnableC0601a0Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC0601a0Arr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC0601a0Arr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
            abstractRunnableC0601a0Arr = (AbstractRunnableC0601a0[]) objArrCopyOf;
            this.f8810a = abstractRunnableC0601a0Arr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        abstractRunnableC0601a0Arr[i10] = abstractRunnableC0601a0;
        abstractRunnableC0601a0.f1835Z = i10;
        m3770d(i10);
    }

    /* JADX INFO: renamed from: b */
    public final void m3768b(AbstractRunnableC0601a0 abstractRunnableC0601a0) {
        synchronized (this) {
            if (abstractRunnableC0601a0.m1228a() != null) {
                m3769c(abstractRunnableC0601a0.f1835Z);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final AbstractRunnableC0601a0 m3769c(int i10) {
        int i11;
        int i12;
        Object[] objArr;
        int i13;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f8810a;
        AbstractC16544l.m18091d(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8809b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            m3771e(i10, atomicIntegerFieldUpdater.get(this));
            int i14 = (i10 - 1) / 2;
            if (i10 > 0) {
                AbstractRunnableC0601a0 abstractRunnableC0601a0 = objArr2[i10];
                AbstractC16544l.m18091d(abstractRunnableC0601a0);
                Object obj2 = objArr2[i14];
                AbstractC16544l.m18091d(obj2);
                if (abstractRunnableC0601a0.compareTo(obj2) < 0) {
                    m3771e(i10, i14);
                    m3770d(i14);
                } else {
                    while (true) {
                        i11 = i10 * 2;
                        i12 = i11 + 1;
                        if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f8810a;
                        AbstractC16544l.m18091d(objArr);
                        i13 = i11 + 2;
                        if (i13 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i13];
                            AbstractC16544l.m18091d(comparable3);
                            obj = objArr[i12];
                            AbstractC16544l.m18091d(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i13 = i12;
                            }
                        } else {
                            i13 = i12;
                        }
                        comparable = objArr[i10];
                        AbstractC16544l.m18091d(comparable);
                        comparable2 = objArr[i13];
                        AbstractC16544l.m18091d(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        m3771e(i10, i13);
                        i10 = i13;
                    }
                }
            } else {
                while (true) {
                    i11 = i10 * 2;
                    i12 = i11 + 1;
                    if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f8810a;
                    AbstractC16544l.m18091d(objArr);
                    i13 = i11 + 2;
                    if (i13 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i13];
                        AbstractC16544l.m18091d(comparable3);
                        obj = objArr[i12];
                        AbstractC16544l.m18091d(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i13 = i12;
                        }
                    } else {
                        i13 = i12;
                    }
                    comparable = objArr[i10];
                    AbstractC16544l.m18091d(comparable);
                    comparable2 = objArr[i13];
                    AbstractC16544l.m18091d(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    m3771e(i10, i13);
                    i10 = i13;
                }
            }
        }
        AbstractRunnableC0601a0 abstractRunnableC0601a1 = objArr2[atomicIntegerFieldUpdater.get(this)];
        AbstractC16544l.m18091d(abstractRunnableC0601a1);
        abstractRunnableC0601a1.m1230d(null);
        abstractRunnableC0601a1.f1835Z = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC0601a1;
    }

    /* JADX INFO: renamed from: d */
    public final void m3770d(int i10) {
        while (i10 > 0) {
            AbstractRunnableC0601a0[] abstractRunnableC0601a0Arr = this.f8810a;
            AbstractC16544l.m18091d(abstractRunnableC0601a0Arr);
            int i11 = (i10 - 1) / 2;
            AbstractRunnableC0601a0 abstractRunnableC0601a0 = abstractRunnableC0601a0Arr[i11];
            AbstractC16544l.m18091d(abstractRunnableC0601a0);
            AbstractRunnableC0601a0 abstractRunnableC0601a1 = abstractRunnableC0601a0Arr[i10];
            AbstractC16544l.m18091d(abstractRunnableC0601a1);
            if (abstractRunnableC0601a0.compareTo(abstractRunnableC0601a1) <= 0) {
                return;
            }
            m3771e(i10, i11);
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3771e(int i10, int i11) {
        AbstractRunnableC0601a0[] abstractRunnableC0601a0Arr = this.f8810a;
        AbstractC16544l.m18091d(abstractRunnableC0601a0Arr);
        AbstractRunnableC0601a0 abstractRunnableC0601a0 = abstractRunnableC0601a0Arr[i11];
        AbstractC16544l.m18091d(abstractRunnableC0601a0);
        AbstractRunnableC0601a0 abstractRunnableC0601a1 = abstractRunnableC0601a0Arr[i10];
        AbstractC16544l.m18091d(abstractRunnableC0601a1);
        abstractRunnableC0601a0Arr[i10] = abstractRunnableC0601a0;
        abstractRunnableC0601a0Arr[i11] = abstractRunnableC0601a1;
        abstractRunnableC0601a0.f1835Z = i10;
        abstractRunnableC0601a1.f1835Z = i11;
    }
}
