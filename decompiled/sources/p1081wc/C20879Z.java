package p1081wc;

import ao.C11131E;
import ao.C11181o0;
import bo.AbstractC11516d;
import bo.AbstractC11523k;
import com.segment.analytics.kotlin.core.TrackEvent;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.JsonNull;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p1155zi.EnumC21895B;
import p117Eb.C2392v;
import p153Fn.C2925c;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p523V9.AbstractC8215v5;
import p530Vi.C8305a;
import p530Vi.C8307c;
import p530Vi.C8312h;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9816U3;
import p594Y9.C9895g4;
import p646aj.AbstractC10623c;
import p646aj.AbstractC10628h;

/* JADX INFO: renamed from: wc.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C20879Z implements InterfaceC20904w {

    /* JADX INFO: renamed from: a */
    public final C8312h f66492a;

    /* JADX INFO: renamed from: b */
    public final EnumC21895B f66493b;

    /* JADX INFO: renamed from: c */
    public final C3430e f66494c = AbstractC8168p6.m8749b("SegmentAnalyticsService", "Segment");

    public C20879Z(C8312h c8312h, EnumC21895B enumC21895B) {
        this.f66492a = c8312h;
        this.f66493b = enumC21895B;
        C8305a c8305a = C8312h.Companion;
        C9895g4 c9895g4 = new C9895g4(this);
        c8305a.getClass();
        C8312h.f25901t0 = c9895g4;
    }

    @Override // p1081wc.InterfaceC20904w
    /* JADX INFO: renamed from: a */
    public final void mo21447a(AbstractC20892k event, Map properties) {
        AbstractC16544l.m18094g(event, "event");
        AbstractC16544l.m18094g(properties, "properties");
        AbstractC8160o6.m8726a(this.f66494c, "SegmentAnalytics track event: " + event + ", properties: " + properties, null, 6);
        if (this.f66493b == EnumC21895B.f69418Y) {
            for (Object obj : properties.values()) {
                if (AbstractC16544l.m18089b(AbstractC10628h.m11002d(obj), JsonNull.INSTANCE)) {
                    String strMo4448c = AbstractC16526C.f51263a.mo5693b(obj.getClass()).mo4448c();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append(" of type ");
                    sb2.append(strMo4448c);
                    sb2.append(" for event ");
                    throw new IllegalArgumentException(AbstractC9306j0.m9891j(event.f66564a, " could not be serialized for analytics. This property will not get saved unless it is converted to a serializable type.", sb2).toString());
                }
            }
        }
        String name = event.toString();
        C11131E c11131e = new C11131E(C11181o0.f33827a, AbstractC9816U3.m10451b(AbstractC10623c.f31524a.f34844b, AbstractC16526C.f51263a.mo5693b(Object.class)), 1);
        C8312h c8312h = this.f66492a;
        AbstractC16544l.m18094g(name, "name");
        c8312h.m8934d(new TrackEvent(name, AbstractC11523k.m12917j(AbstractC11516d.f34842d.m12904c(c11131e, properties))), null);
    }

    @Override // p1081wc.InterfaceC20904w
    /* JADX INFO: renamed from: b */
    public final void mo21448b(AbstractC20892k abstractC20892k, Object obj, Map map) {
        AbstractC8215v5.m8845g(this, abstractC20892k, obj, map);
    }

    /* JADX INFO: renamed from: c */
    public final void m21450c(boolean z6) {
        C8312h c8312h = this.f66492a;
        c8312h.f25907r0 = z6;
        C2392v c2392v = c8312h.f25903Z;
        AbstractC0575H.m1156D((C2925c) c2392v.f7437o0, (C0611f0) c2392v.f7438p0, null, new C8307c(c8312h, z6, null), 2);
        AbstractC8160o6.m8726a(this.f66494c, "SegmentAnalytics set to " + c8312h.f25907r0, null, 6);
    }
}
