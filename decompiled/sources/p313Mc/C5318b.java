package p313Mc;

import hm.InterfaceC14539d;
import io.opentracing.util.GlobalTracer;
import kotlin.jvm.internal.AbstractC16544l;
import p1130yi.EnumC21542a;
import p195Hh.C3430e;
import p336Nc.C5706b;
import p523V9.AbstractC8168p6;

/* JADX INFO: renamed from: Mc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5318b {

    /* JADX INFO: renamed from: a */
    public final C3430e f17504a;

    public C5318b(C5706b datadogConfig) {
        AbstractC16544l.m18094g(datadogConfig, "datadogConfig");
        this.f17504a = AbstractC8168p6.m8749b("DatadogTracer", null);
    }

    /* JADX INFO: renamed from: a */
    public final C5317a m5877a(EnumC21542a enumC21542a, C5317a c5317a) {
        GlobalTracer globalTracer = GlobalTracer.f46995Y;
        InterfaceC14539d interfaceC14539dMo16040J = GlobalTracer.f46996Z.mo16040J(enumC21542a.toString());
        AbstractC16544l.m18093f(interfaceC14539dMo16040J, "buildSpan(...)");
        if (!(c5317a instanceof C5317a)) {
            c5317a = null;
        }
        return new C5317a(interfaceC14539dMo16040J, c5317a);
    }
}
