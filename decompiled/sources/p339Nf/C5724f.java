package p339Nf;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Nf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C5724f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18537Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f18538Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f18539o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ List f18540p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Map f18541q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f18542r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC10459q f18543s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ int f18544t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5724f(String str, String str2, List list, Map map, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f18537Y = i11;
        this.f18538Z = str;
        this.f18539o0 = str2;
        this.f18540p0 = list;
        this.f18541q0 = map;
        this.f18542r0 = interfaceC1436k;
        this.f18543s0 = interfaceC10459q;
        this.f18544t0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18537Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f18544t0 | 1);
                List list = this.f18540p0;
                Map map = this.f18541q0;
                AbstractC5741w.m6160c(this.f18538Z, this.f18539o0, list, map, this.f18542r0, this.f18543s0, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f18544t0 | 1);
                List list2 = this.f18540p0;
                Map map2 = this.f18541q0;
                AbstractC5741w.m6160c(this.f18538Z, this.f18539o0, list2, map2, this.f18542r0, this.f18543s0, (C6021p) obj, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
