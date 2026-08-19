package p017Af;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C1126m1;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Af.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C0458E extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1478Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f1479Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1126m1 f1480o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f1481p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f1482q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f1483r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC10459q f1484s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ int f1485t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0458E(List list, C1126m1 c1126m1, long j10, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f1478Y = i11;
        this.f1479Z = list;
        this.f1480o0 = c1126m1;
        this.f1481p0 = j10;
        this.f1482q0 = z6;
        this.f1483r0 = interfaceC1436k;
        this.f1484s0 = interfaceC10459q;
        this.f1485t0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1478Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f1485t0 | 1);
                boolean z6 = this.f1482q0;
                InterfaceC1436k interfaceC1436k = this.f1483r0;
                AbstractC0462I.m1114d(this.f1479Z, this.f1480o0, this.f1481p0, z6, interfaceC1436k, this.f1484s0, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f1485t0 | 1);
                boolean z10 = this.f1482q0;
                InterfaceC1436k interfaceC1436k2 = this.f1483r0;
                AbstractC0462I.m1114d(this.f1479Z, this.f1480o0, this.f1481p0, z10, interfaceC1436k2, this.f1484s0, (C6021p) obj, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
