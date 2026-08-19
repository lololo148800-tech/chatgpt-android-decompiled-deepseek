package p025An;

import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: An.t0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0639t0 implements InterfaceC0617i0 {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1888Z = AtomicIntegerFieldUpdater.newUpdater(C0639t0.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1889o0 = AtomicReferenceFieldUpdater.newUpdater(C0639t0.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1890p0 = AtomicReferenceFieldUpdater.newUpdater(C0639t0.class, Object.class, "_exceptionsHolder$volatile");

    /* JADX INFO: renamed from: Y */
    public final C0645w0 f1891Y;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    public C0639t0(C0645w0 c0645w0, Throwable th2) {
        this.f1891Y = c0645w0;
        this._rootCause$volatile = th2;
    }

    @Override // p025An.InterfaceC0617i0
    /* JADX INFO: renamed from: a */
    public final boolean mo1220a() {
        return m1283d() == null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1282b(Throwable th2) {
        Throwable thM1283d = m1283d();
        if (thM1283d == null) {
            f1889o0.set(this, th2);
            return;
        }
        if (th2 == thM1283d) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1890p0;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th2);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th2);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th2 == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th2);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // p025An.InterfaceC0617i0
    /* JADX INFO: renamed from: c */
    public final C0645w0 mo1221c() {
        return this.f1891Y;
    }

    /* JADX INFO: renamed from: d */
    public final Throwable m1283d() {
        return (Throwable) f1889o0.get(this);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1284e() {
        return m1283d() != null;
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m1285f(Throwable th2) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1890p0;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM1283d = m1283d();
        if (thM1283d != null) {
            arrayList.add(0, thM1283d);
        }
        if (th2 != null && !th2.equals(thM1283d)) {
            arrayList.add(th2);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0575H.f1803h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(YladLSetV.ZLCPxHkuYwZg);
        sb2.append(m1284e());
        sb2.append(", completing=");
        sb2.append(f1888Z.get(this) == 1);
        sb2.append(", rootCause=");
        sb2.append(m1283d());
        sb2.append(", exceptions=");
        sb2.append(f1890p0.get(this));
        sb2.append(", list=");
        sb2.append(this.f1891Y);
        sb2.append(']');
        return sb2.toString();
    }
}
