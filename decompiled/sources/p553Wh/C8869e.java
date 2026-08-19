package p553Wh;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p229J0.C3940K3;
import p229J0.C3952M3;
import p229J0.EnumC3898D3;
import p229J0.EnumC4001W3;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wh.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C8869e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f27142Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8870f f27143Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f27144o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f27145p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ EnumC3898D3 f27146q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1426a f27147r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8869e(C8870f c8870f, String str, String str2, EnumC3898D3 enumC3898D3, InterfaceC1426a interfaceC1426a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f27143Z = c8870f;
        this.f27144o0 = str;
        this.f27145p0 = str2;
        this.f27146q0 = enumC3898D3;
        this.f27147r0 = interfaceC1426a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8869e(this.f27143Z, this.f27144o0, this.f27145p0, this.f27146q0, this.f27147r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8869e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f27142Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C3952M3 c3952m3 = this.f27143Z.f27150c;
            this.f27142Y = 1;
            c3952m3.getClass();
            obj = c3952m3.m4658a(new C3940K3(this.f27144o0, this.f27145p0, this.f27146q0), this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        if (AbstractC8868d.f27141a[((EnumC4001W3) obj).ordinal()] == 1) {
            this.f27147r0.invoke();
        }
        return C17296C.f55119a;
    }
}
