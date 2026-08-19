package p530Vi;

import bo.AbstractC11516d;
import bo.C11515c;
import com.segment.analytics.kotlin.core.AbstractC12774a;
import com.segment.analytics.kotlin.core.TrackEvent;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.C16644c;
import mm.C17314q;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p1114xp.InterfaceC21347r;
import p117Eb.C2392v;
import p153Fn.C2925c;
import p228J.AbstractC3794B0;
import p402Qc.C6593i;
import p525Vb.C8258a;
import p554Wi.C8884k;
import p554Wi.InterfaceC8882i;
import p571X9.AbstractC9227W;
import p580Xi.C9516b;
import p580Xi.C9521g;
import p580Xi.C9522h;
import p594Y9.AbstractC9758K4;
import p594Y9.AbstractC9961r4;
import p602Yi.InterfaceC10066b;
import p646aj.AbstractC10630j;
import p646aj.C10629i;

/* JADX INFO: renamed from: Vi.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C8312h implements InterfaceC21347r {

    /* JADX INFO: renamed from: s0 */
    public static boolean f25900s0;

    /* JADX INFO: renamed from: Y */
    public final C8317m f25902Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2392v f25903Z;

    /* JADX INFO: renamed from: o0 */
    public final C17314q f25904o0;

    /* JADX INFO: renamed from: p0 */
    public final C17314q f25905p0;

    /* JADX INFO: renamed from: q0 */
    public final C8304L f25906q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f25907r0;
    public static final C8305a Companion = new C8305a();

    /* JADX INFO: renamed from: t0 */
    public static InterfaceC10066b f25901t0 = new C8258a();

    public C8312h(C8317m c8317m) {
        C2392v c2392v = new C2392v(17);
        this.f25902Y = c8317m;
        this.f25903Z = c2392v;
        this.f25904o0 = AbstractC9227W.m9800c(new C8311g(this, 1));
        this.f25905p0 = AbstractC9227W.m9800c(new C8311g(this, 0));
        C8302J c8302j = C8304L.Companion;
        InterfaceC8294B storage = m8932b();
        c8302j.getClass();
        AbstractC16544l.m18094g(storage, "storage");
        String strMo7525b = storage.mo7525b(1);
        C11515c c11515c = AbstractC11516d.f34842d;
        String strMo7525b2 = storage.mo7525b(2);
        strMo7525b2 = strMo7525b2 == null ? "{}" : strMo7525b2;
        c11515c.getClass();
        C16644c c16644c = (C16644c) c11515c.m12903b(strMo7525b2, AbstractC9961r4.m10615b(C16644c.Companion.serializer()));
        String strMo7525b3 = storage.mo7525b(3);
        this.f25906q0 = new C8304L(strMo7525b3 == null ? AbstractC3794B0.m4498w("randomUUID().toString()") : strMo7525b3, strMo7525b, c16644c);
        this.f25907r0 = true;
        if (AbstractC21322p.m21681O(c8317m.f25915a) || c8317m.f25916b == null) {
            throw new IllegalArgumentException("invalid configuration");
        }
        m8931a(new C9521g());
        m8931a(new C9516b());
        m8931a(new C9522h(0));
        C8300H.f25862Y.m8909c("analytics_mobile.invoke", new C6593i(this, 12));
        AbstractC0575H.m1156D((C2925c) c2392v.f7437o0, (C0611f0) c2392v.f7438p0, null, new C8306b(this, null), 2);
    }

    /* JADX INFO: renamed from: e */
    public static void m8930e(C8312h c8312h, String str, C16644c properties, int i10) {
        if ((i10 & 2) != 0) {
            properties = AbstractC8320p.f25941a;
        }
        AbstractC16544l.m18094g(properties, "properties");
        c8312h.m8934d(new TrackEvent(str, properties), null);
    }

    /* JADX INFO: renamed from: a */
    public final void m8931a(InterfaceC8882i plugin) {
        AbstractC16544l.m18094g(plugin, "plugin");
        m8933c().m9554a(plugin);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC8294B m8932b() {
        return (InterfaceC8294B) this.f25905p0.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final C8884k m8933c() {
        return (C8884k) this.f25904o0.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m8934d(AbstractC12774a abstractC12774a, InterfaceC1436k interfaceC1436k) {
        if (this.f25907r0) {
            AbstractC10630j.Companion.getClass();
            abstractC12774a.mo14518o(C10629i.m11003a());
            abstractC12774a.mo14515l(AbstractC8320p.f25941a);
            String string = UUID.randomUUID().toString();
            AbstractC16544l.m18093f(string, "randomUUID().toString()");
            abstractC12774a.mo14517n(string);
            AbstractC9758K4.m10361b(this, "applying base attributes on " + Thread.currentThread().getName());
            C2392v c2392v = this.f25903Z;
            AbstractC0575H.m1156D((C2925c) c2392v.f7437o0, (C0611f0) c2392v.f7438p0, null, new C8310f(abstractC12774a, this, interfaceC1436k, null), 2);
        }
    }
}
