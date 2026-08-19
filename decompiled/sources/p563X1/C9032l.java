package p563X1;

import androidx.compose.p650ui.viewinterop.AbstractC10869a;
import ge.AbstractC14085k0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: X1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9032l extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27568Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f27569Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f27570o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f27571p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f27572q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f27573r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9032l(InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k2, int i10, int i11, int i12) {
        super(2);
        this.f27568Y = i12;
        this.f27569Z = interfaceC1436k;
        this.f27570o0 = interfaceC10459q;
        this.f27571p0 = interfaceC1436k2;
        this.f27572q0 = i10;
        this.f27573r0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27568Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f27572q0 | 1);
                InterfaceC1436k interfaceC1436k = this.f27569Z;
                AbstractC10869a.m11356b(interfaceC1436k, this.f27570o0, this.f27571p0, (C6021p) obj, iM6447d0, this.f27573r0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f27572q0 | 1);
                InterfaceC1436k interfaceC1436k2 = this.f27569Z;
                AbstractC14085k0.m15486a(interfaceC1436k2, this.f27570o0, this.f27571p0, (C6021p) obj, iM6447d1, this.f27573r0);
                break;
        }
        return C17296C.f55119a;
    }
}
