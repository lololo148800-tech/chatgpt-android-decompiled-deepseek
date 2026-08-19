package p046Bk;

import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import java.util.Date;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8215v5;
import p571X9.AbstractC9233X;
import p729ej.C13421l;
import p729ej.InterfaceC13418i;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Bk.P0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1345P0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13421l f3553Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1360X0 f3554Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ GovernmentIdNfcScanComponent f3555o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f3556p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Date f3557q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Date f3558r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C1381f0 f3559s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C1383g0 f3560t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1345P0(C13421l c13421l, C1360X0 c1360x0, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, String str, Date date, Date date2, C1381f0 c1381f0, C1383g0 c1383g0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f3553Y = c13421l;
        this.f3554Z = c1360x0;
        this.f3555o0 = governmentIdNfcScanComponent;
        this.f3556p0 = str;
        this.f3557q0 = date;
        this.f3558r0 = date2;
        this.f3559s0 = c1381f0;
        this.f3560t0 = c1383g0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1345P0(this.f3553Y, this.f3554Z, this.f3555o0, this.f3556p0, this.f3557q0, this.f3558r0, this.f3559s0, this.f3560t0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C1345P0 c1345p0 = (C1345P0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c1345p0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC13418i interfaceC13418iMo3400l = this.f3553Y.f42503Y.mo3400l();
        Date date = this.f3557q0;
        Date date2 = this.f3558r0;
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = this.f3555o0;
        C1360X0 c1360x0 = this.f3554Z;
        interfaceC13418iMo3400l.mo3393B(AbstractC8215v5.m8839a(c1360x0, new C1343O0(governmentIdNfcScanComponent, c1360x0, this.f3556p0, date, date2, this.f3559s0, this.f3560t0)));
        return C17296C.f55119a;
    }
}
