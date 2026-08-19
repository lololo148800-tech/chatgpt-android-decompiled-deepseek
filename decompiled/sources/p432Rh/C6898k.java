package p432Rh;

import bo.AbstractC11523k;
import com.segment.analytics.kotlin.core.AbstractC12776c;
import com.segment.analytics.kotlin.core.Settings;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p096Dg.C2046c;
import p103Dn.C2153Q0;
import p458Si.C7141c;
import p523V9.AbstractC8160o6;
import p530Vi.C8297E;
import p530Vi.C8299G;
import p530Vi.C8300H;
import p530Vi.C8304L;
import p972qm.InterfaceC18770c;
import si.C19649a;
import si.C19650b;
import sm.InterfaceC19693i;

/* JADX INFO: renamed from: Rh.k */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6898k extends AbstractC16541i implements InterfaceC1439n, InterfaceC19693i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22109Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6898k(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f22109Y = i12;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC16643b abstractC16643b;
        switch (this.f22109Y) {
            case 0:
                Throwable th2 = (Throwable) obj;
                C2046c c2046c = (C2046c) this.receiver;
                C2153Q0 c2153q0 = c2046c.f6263b;
                if (AbstractC16544l.m18089b(c2153q0.getValue(), C19649a.f62300a)) {
                    AbstractC8160o6.m8727b(c2046c.f6262a, "Network certificate error", th2, 4);
                }
                c2153q0.m3251l(null, C19650b.f62301a);
                return C17296C.f55119a;
            case 1:
                C7141c c7141c = (C7141c) this.receiver;
                c7141c.getClass();
                return AbstractC12776c.m14524b(c7141c, (C8304L) obj, (InterfaceC18770c) obj2);
            case 2:
                C7141c c7141c2 = (C7141c) this.receiver;
                c7141c2.getClass();
                return AbstractC12776c.m14523a(c7141c2, (C8297E) obj, (InterfaceC18770c) obj2);
            default:
                ((C8300H) this.receiver).getClass();
                Settings settings = ((C8297E) obj).f25854b;
                if (settings != null && (abstractC16643b = (AbstractC16643b) settings.f40502e.get("sampleRate")) != null) {
                    double d10 = Double.parseDouble(AbstractC11523k.m12918k(abstractC16643b).mo12922f());
                    C8300H.f25863Z = d10;
                    if (!C8300H.f25871v0 && d10 != 0.0d) {
                        C8300H.f25871v0 = true;
                        if (Math.random() > C8300H.f25863Z) {
                            C8300H.f25869t0.clear();
                            C8300H.f25870u0 = 0;
                        }
                        AbstractC0575H.m1156D(C8300H.f25874y0, C8300H.f25875z0, null, new C8299G(2, null), 2);
                    }
                }
                return C17296C.f55119a;
        }
    }
}
