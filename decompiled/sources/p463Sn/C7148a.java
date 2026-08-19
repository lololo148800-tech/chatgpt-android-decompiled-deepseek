package p463Sn;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3756d;
import p324Mn.AbstractC5539i;
import p324Mn.AbstractC5546p;
import p324Mn.C5541k;
import p324Mn.C5543m;
import p324Mn.C5545o;
import p559Wn.C8974f;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: Sn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7148a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C7148a f22732Z = new C7148a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7148a f22733o0 = new C7148a(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C7148a f22734p0 = new C7148a(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C7148a f22735q0 = new C7148a(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C7148a f22736r0 = new C7148a(0, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22737Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7148a(int i10, int i11) {
        super(i10);
        this.f22737Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f22737Y) {
            case 0:
                C16527D c16527d = AbstractC16526C.f51263a;
                return new C8974f("kotlinx.datetime.DateTimeUnit.DateBased", c16527d.mo5693b(AbstractC5539i.class), new InterfaceC3756d[]{c16527d.mo5693b(C5541k.class), c16527d.mo5693b(C5543m.class)}, new KSerializer[]{C7154g.f22750a, C7160m.f22762a});
            case 1:
                C16527D c16527d2 = AbstractC16526C.f51263a;
                return new C8974f("kotlinx.datetime.DateTimeUnit", c16527d2.mo5693b(AbstractC5546p.class), new InterfaceC3756d[]{c16527d2.mo5693b(C5541k.class), c16527d2.mo5693b(C5543m.class), c16527d2.mo5693b(C5545o.class)}, new KSerializer[]{C7154g.f22750a, C7160m.f22762a, C7161n.f22764a});
            case 2:
                return AbstractC11336c.m12773c("kotlinx.datetime.DayBased", new SerialDescriptor[0], C7153f.f22746Z);
            case 3:
                return AbstractC11336c.m12773c("kotlinx.datetime.MonthBased", new SerialDescriptor[0], C7153f.f22747o0);
            default:
                return AbstractC11336c.m12773c("kotlinx.datetime.TimeBased", new SerialDescriptor[0], C7153f.f22748p0);
        }
    }
}
