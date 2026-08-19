package p736f0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p349O0.InterfaceC5982V0;
import p492U1.C7545j;
import p492U1.EnumC7546k;
import p571X9.AbstractC9113C4;

/* JADX INFO: renamed from: f0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C13492j extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42707Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f42708Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13493k f42709o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13492j(InterfaceC1436k interfaceC1436k, C13493k c13493k, int i10) {
        super(1);
        this.f42707Y = i10;
        this.f42708Z = interfaceC1436k;
        this.f42709o0 = c13493k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f42707Y) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C13493k c13493k = this.f42709o0;
                return (Integer) this.f42708Z.invoke(Integer.valueOf(((int) (C13493k.m15003e(c13493k) >> 32)) - ((int) (C13493k.m15002d(c13493k, AbstractC9113C4.m9643a(iIntValue, iIntValue), C13493k.m15003e(c13493k)) >> 32))));
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                long jM9643a = AbstractC9113C4.m9643a(iIntValue2, iIntValue2);
                C13493k c13493k2 = this.f42709o0;
                return (Integer) this.f42708Z.invoke(Integer.valueOf((-((int) (C13493k.m15002d(c13493k2, jM9643a, C13493k.m15003e(c13493k2)) >> 32))) - iIntValue2));
            case 2:
                int iIntValue3 = ((Number) obj).intValue();
                C13493k c13493k3 = this.f42709o0;
                return (Integer) this.f42708Z.invoke(Integer.valueOf(((int) (C13493k.m15003e(c13493k3) & 4294967295L)) - ((int) (C13493k.m15002d(c13493k3, AbstractC9113C4.m9643a(iIntValue3, iIntValue3), C13493k.m15003e(c13493k3)) & 4294967295L))));
            case 3:
                int iIntValue4 = ((Number) obj).intValue();
                long jM9643a2 = AbstractC9113C4.m9643a(iIntValue4, iIntValue4);
                C13493k c13493k4 = this.f42709o0;
                return (Integer) this.f42708Z.invoke(Integer.valueOf((-((int) (C13493k.m15002d(c13493k4, jM9643a2, C13493k.m15003e(c13493k4)) & 4294967295L))) - iIntValue4));
            case 4:
                int iIntValue5 = ((Number) obj).intValue();
                C13493k c13493k5 = this.f42709o0;
                InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) c13493k5.f42714e.m14619e(c13493k5.f42710a.f43492d.getValue());
                return (Integer) this.f42708Z.invoke(Integer.valueOf((-((int) (c13493k5.f42711b.mo10925a(AbstractC9113C4.m9643a(iIntValue5, iIntValue5), interfaceC5982V0 != null ? ((C7545j) interfaceC5982V0.getValue()).f23903a : 0L, EnumC7546k.f23904Y) >> 32))) - iIntValue5));
            case 5:
                int iIntValue6 = ((Number) obj).intValue();
                C13493k c13493k6 = this.f42709o0;
                InterfaceC5982V0 interfaceC5982V1 = (InterfaceC5982V0) c13493k6.f42714e.m14619e(c13493k6.f42710a.f43492d.getValue());
                long j10 = interfaceC5982V1 != null ? ((C7545j) interfaceC5982V1.getValue()).f23903a : 0L;
                return (Integer) this.f42708Z.invoke(Integer.valueOf((-((int) (c13493k6.f42711b.mo10925a(AbstractC9113C4.m9643a(iIntValue6, iIntValue6), j10, EnumC7546k.f23904Y) >> 32))) + ((int) (j10 >> 32))));
            case 6:
                int iIntValue7 = ((Number) obj).intValue();
                C13493k c13493k7 = this.f42709o0;
                InterfaceC5982V0 interfaceC5982V2 = (InterfaceC5982V0) c13493k7.f42714e.m14619e(c13493k7.f42710a.f43492d.getValue());
                return (Integer) this.f42708Z.invoke(Integer.valueOf((-((int) (c13493k7.f42711b.mo10925a(AbstractC9113C4.m9643a(iIntValue7, iIntValue7), interfaceC5982V2 != null ? ((C7545j) interfaceC5982V2.getValue()).f23903a : 0L, EnumC7546k.f23904Y) & 4294967295L))) - iIntValue7));
            default:
                int iIntValue8 = ((Number) obj).intValue();
                C13493k c13493k8 = this.f42709o0;
                InterfaceC5982V0 interfaceC5982V3 = (InterfaceC5982V0) c13493k8.f42714e.m14619e(c13493k8.f42710a.f43492d.getValue());
                long j11 = interfaceC5982V3 != null ? ((C7545j) interfaceC5982V3.getValue()).f23903a : 0L;
                return (Integer) this.f42708Z.invoke(Integer.valueOf((-((int) (c13493k8.f42711b.mo10925a(AbstractC9113C4.m9643a(iIntValue8, iIntValue8), j11, EnumC7546k.f23904Y) & 4294967295L))) + ((int) (j11 & 4294967295L))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13492j(C13493k c13493k, InterfaceC1436k interfaceC1436k, int i10) {
        super(1);
        this.f42707Y = i10;
        this.f42709o0 = c13493k;
        this.f42708Z = interfaceC1436k;
    }
}
