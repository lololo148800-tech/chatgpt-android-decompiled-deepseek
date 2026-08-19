package p722e8;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p677c8.C11689a;

/* JADX INFO: renamed from: e8.X */
/* JADX INFO: loaded from: classes.dex */
public final class C13313X extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42134Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13315Z f42135Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11689a f42136o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13313X(C13315Z c13315z, C11689a c11689a, int i10) {
        super(1);
        this.f42134Y = i10;
        this.f42135Z = c13315z;
        this.f42136o0 = c11689a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f42134Y) {
            case 0:
                Map currentRumContext = (Map) obj;
                AbstractC16544l.m18094g(currentRumContext, "currentRumContext");
                Object obj2 = currentRumContext.get("session_id");
                C13315Z c13315z = this.f42135Z;
                if (AbstractC16544l.m18089b(obj2, c13315z.f42197p) && !AbstractC16544l.m18089b(currentRumContext.get("view_id"), c13315z.f42198q)) {
                    AbstractC7889G0.m8184b(c13315z.f42183b.mo15463s(), 2, EnumC11255b.f34099Z, C13322f.f42255r0, null, false, 56);
                } else {
                    currentRumContext.clear();
                    currentRumContext.putAll(this.f42136o0.m13026b());
                }
                break;
            default:
                Map currentRumContext2 = (Map) obj;
                AbstractC16544l.m18094g(currentRumContext2, "currentRumContext");
                Object obj3 = currentRumContext2.get("session_id");
                C13315Z c13315z2 = this.f42135Z;
                if (AbstractC16544l.m18089b(obj3, c13315z2.f42197p) && !AbstractC16544l.m18089b(currentRumContext2.get("view_id"), c13315z2.f42198q)) {
                    AbstractC7889G0.m8184b(c13315z2.f42183b.mo15463s(), 2, EnumC11255b.f34099Z, C13322f.f42257t0, null, false, 56);
                } else {
                    currentRumContext2.clear();
                    currentRumContext2.putAll(this.f42136o0.m13026b());
                }
                break;
        }
        return C17296C.f55119a;
    }
}
