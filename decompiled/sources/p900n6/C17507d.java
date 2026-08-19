package p900n6;

import bo.C11534v;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p005A3.C0326m;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p086D6.C1962f;
import p1061vb.C20513d;
import p140Fa.C2690j;
import p162G6.InterfaceC3004a;
import p185H6.C3245a;
import p185H6.C3258n;
import p185H6.C3260p;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p209I6.C3632j;
import p209I6.C3637o;
import p209I6.C3645w;
import p265Kb.C4613f;
import p477Tb.C7296c;
import p917o6.C17867t;
import p917o6.InterfaceC17835C;

/* JADX INFO: renamed from: n6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17507d implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final C17510g f55995Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC3004a f55996Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC3004a f55997o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f55998p0;

    /* JADX INFO: renamed from: q0 */
    public final C17867t f55999q0;

    /* JADX INFO: renamed from: r0 */
    public final ArrayList f56000r0;

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC17835C f56001s0;

    /* JADX INFO: renamed from: t0 */
    public final Boolean f56002t0;

    /* JADX INFO: renamed from: u0 */
    public final C1962f f56003u0;

    public C17507d(C2690j c2690j) {
        InterfaceC3004a c3645w;
        this.f55998p0 = (ArrayList) c2690j.f8263c;
        this.f55999q0 = ((C11534v) c2690j.f8261a).m12926b();
        this.f56000r0 = (ArrayList) c2690j.f8267g;
        this.f56001s0 = (InterfaceC17835C) c2690j.f8268h;
        this.f56002t0 = (Boolean) c2690j.f8269i;
        ArrayList interceptors = (ArrayList) c2690j.f8265e;
        if (((String) c2690j.f8270j) == null) {
            throw new IllegalStateException("Apollo: 'serverUrl' is required");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = (String) c2690j.f8270j;
        AbstractC16544l.m18091d(str);
        Object c3258n = (C3260p) c2690j.f8271k;
        c3258n = c3258n == null ? null : c3258n;
        AbstractC16544l.m18094g(interceptors, "interceptors");
        arrayList.clear();
        arrayList.addAll(interceptors);
        C4613f c4613f = new C4613f(str, 3);
        if (!arrayList2.isEmpty()) {
            arrayList.add(new C3245a(arrayList2, 2));
        }
        c3258n = c3258n == null ? new C3258n(StatsigLoggerKt.FLUSH_TIMER_MS) : c3258n;
        C0326m c0326m = new C0326m();
        c0326m.f1140b = c4613f;
        c0326m.f1141c = c3258n;
        c0326m.f1142d = arrayList;
        c0326m.f1139a = false;
        c0326m.f1143e = new C3245a(c0326m, 1);
        this.f55996Z = c0326m;
        String str2 = (String) c2690j.f8270j;
        if (str2 == null) {
            c3645w = c0326m;
        } else {
            ArrayList arrayList3 = new ArrayList();
            C3637o c3637o = new C3637o(str2, null);
            C20513d c20513d = (C20513d) c2690j.f8272l;
            C20513d c20513d2 = c20513d != null ? c20513d : null;
            c3645w = new C3645w(c3637o, arrayList3, new C7296c(14), StatsigLoggerKt.FLUSH_TIMER_MS, c20513d2 == null ? new C3632j() : c20513d2, null);
        }
        this.f55997o0 = c3645w;
        C3516e c3516e = AbstractC0593T.f1824a;
        ExecutorC3515d executorC3515d = ExecutorC3515d.f10633Z;
        this.f55995Y = new C17510g(executorC3515d, AbstractC0575H.m1174c(executorC3515d));
        this.f56003u0 = new C1962f(c0326m, c3645w);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC0575H.m1180i(this.f55995Y.f56007b, null);
        this.f55996Z.dispose();
        this.f55997o0.dispose();
    }
}
