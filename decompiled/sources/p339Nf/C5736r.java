package p339Nf;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p229J0.C3880A3;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;
import p749fd.AbstractC13620e;
import p749fd.C13625j;
import p749fd.EnumC13617b;

/* JADX INFO: renamed from: Nf.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C5736r extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18643Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f18644Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f18645o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f18646p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f18647q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f18648r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f18649s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f18650t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Object f18651u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ Object f18652v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5736r(C13625j c13625j, String str, String str2, String str3, String str4, EnumC13617b enumC13617b, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f18643Y = 2;
        this.f18646p0 = c13625j;
        this.f18644Z = str;
        this.f18645o0 = str2;
        this.f18647q0 = str3;
        this.f18648r0 = str4;
        this.f18650t0 = enumC13617b;
        this.f18651u0 = interfaceC1436k;
        this.f18652v0 = interfaceC10459q;
        this.f18649s0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws Exception {
        switch (this.f18643Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f18649s0 | 1);
                List list = (List) this.f18646p0;
                List list2 = (List) this.f18648r0;
                List list3 = (List) this.f18650t0;
                AbstractC5741w.m6158a(this.f18644Z, this.f18645o0, list, (List) this.f18647q0, list2, list3, (C3880A3) this.f18651u0, (InterfaceC1426a) this.f18652v0, (C6021p) obj, iM6447d0);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f18649s0 | 1);
                List list4 = (List) this.f18646p0;
                List list5 = (List) this.f18648r0;
                Map map = (Map) this.f18650t0;
                AbstractC5741w.m6162e(this.f18644Z, this.f18645o0, list4, (List) this.f18647q0, list5, map, (InterfaceC1436k) this.f18651u0, (InterfaceC10459q) this.f18652v0, (C6021p) obj, iM6447d1);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d2 = C5997d.m6447d0(this.f18649s0 | 1);
                C13625j c13625j = (C13625j) this.f18646p0;
                String str = (String) this.f18648r0;
                EnumC13617b enumC13617b = (EnumC13617b) this.f18650t0;
                AbstractC13620e.m15142b(c13625j, this.f18644Z, this.f18645o0, (String) this.f18647q0, str, enumC13617b, (InterfaceC1436k) this.f18651u0, (InterfaceC10459q) this.f18652v0, (C6021p) obj, iM6447d2);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5736r(String str, String str2, List list, List list2, List list3, Object obj, Object obj2, Object obj3, int i10, int i11) {
        super(2);
        this.f18643Y = i11;
        this.f18644Z = str;
        this.f18645o0 = str2;
        this.f18646p0 = list;
        this.f18647q0 = list2;
        this.f18648r0 = list3;
        this.f18650t0 = obj;
        this.f18651u0 = obj2;
        this.f18652v0 = obj3;
        this.f18649s0 = i10;
    }
}
