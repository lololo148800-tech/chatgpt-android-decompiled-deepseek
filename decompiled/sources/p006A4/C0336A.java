package p006A4;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1143z4.C21792v;
import p1143z4.C21795y;
import p349O0.C5997d;
import p349O0.C6021p;
import p444S4.AbstractC6993A;
import p635a1.InterfaceC10446d;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: A4.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0336A extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1167Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21795y f1168Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21792v f1169o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f1170p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC10446d f1171q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f1172r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1436k f1173s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1436k f1174t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ InterfaceC1436k f1175u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f1176v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0336A(C21795y c21795y, C21792v c21792v, InterfaceC10459q interfaceC10459q, InterfaceC10446d interfaceC10446d, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, InterfaceC1436k interfaceC1436k4, int i10, int i11) {
        super(2);
        this.f1167Y = i11;
        this.f1168Z = c21795y;
        this.f1169o0 = c21792v;
        this.f1170p0 = interfaceC10459q;
        this.f1171q0 = interfaceC10446d;
        this.f1172r0 = interfaceC1436k;
        this.f1173s0 = interfaceC1436k2;
        this.f1174t0 = interfaceC1436k3;
        this.f1175u0 = interfaceC1436k4;
        this.f1176v0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1167Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f1176v0 | 1);
                InterfaceC1436k interfaceC1436k = this.f1172r0;
                InterfaceC1436k interfaceC1436k2 = this.f1173s0;
                AbstractC6993A.m7397c(this.f1168Z, this.f1169o0, this.f1170p0, this.f1171q0, interfaceC1436k, interfaceC1436k2, this.f1174t0, this.f1175u0, (C6021p) obj, iM6447d0);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f1176v0 | 1);
                InterfaceC1436k interfaceC1436k3 = this.f1172r0;
                InterfaceC1436k interfaceC1436k4 = this.f1173s0;
                AbstractC6993A.m7397c(this.f1168Z, this.f1169o0, this.f1170p0, this.f1171q0, interfaceC1436k3, interfaceC1436k4, this.f1174t0, this.f1175u0, (C6021p) obj, iM6447d1);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d2 = C5997d.m6447d0(this.f1176v0 | 1);
                InterfaceC1436k interfaceC1436k5 = this.f1172r0;
                InterfaceC1436k interfaceC1436k6 = this.f1173s0;
                AbstractC6993A.m7397c(this.f1168Z, this.f1169o0, this.f1170p0, this.f1171q0, interfaceC1436k5, interfaceC1436k6, this.f1174t0, this.f1175u0, (C6021p) obj, iM6447d2);
                break;
        }
        return C17296C.f55119a;
    }
}
