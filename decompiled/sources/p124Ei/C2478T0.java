package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1155zi.C21891A;
import p204I1.C3578I;
import p349O0.InterfaceC5985X;
import p552Wg.C8852n;
import p759g1.C13800b;

/* JADX INFO: renamed from: Ei.T0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2478T0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7722Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f7723Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f7724o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2478T0(InterfaceC1436k interfaceC1436k, InterfaceC5985X interfaceC5985X, int i10) {
        super(1);
        this.f7722Y = i10;
        this.f7723Z = interfaceC1436k;
        this.f7724o0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        switch (this.f7722Y) {
            case 0:
                long j10 = ((C13800b) obj).f43584a;
                this.f7724o0.setValue(Boolean.TRUE);
                this.f7723Z.invoke(new C2546u0(true));
                return C17296C.f55119a;
            case 1:
                C21891A account = (C21891A) obj;
                AbstractC16544l.m18094g(account, "account");
                this.f7723Z.invoke(account);
                this.f7724o0.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 2:
                String value = (String) obj;
                AbstractC16544l.m18094g(value, "value");
                this.f7724o0.setValue(value);
                this.f7723Z.invoke(value);
                return C17296C.f55119a;
            case 3:
                String newName = (String) obj;
                AbstractC16544l.m18094g(newName, "newName");
                this.f7723Z.invoke(new C8852n(newName));
                this.f7724o0.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 4:
                C3578I it = (C3578I) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f7724o0.setValue(it);
                this.f7723Z.invoke(it);
                return C17296C.f55119a;
            case 5:
                long j11 = ((C13800b) obj).f43584a;
                C3578I c3578i = (C3578I) this.f7724o0.getValue();
                if (c3578i != null) {
                    this.f7723Z.invoke(Integer.valueOf(c3578i.f10893b.m4313e(j11)));
                }
                return C17296C.f55119a;
            default:
                long j12 = ((C13800b) obj).f43584a;
                C3578I c3578i2 = (C3578I) this.f7724o0.getValue();
                if (c3578i2 != null) {
                    zBooleanValue = ((Boolean) this.f7723Z.invoke(Integer.valueOf(c3578i2.f10893b.m4313e(j12)))).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                return Boolean.valueOf(zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2478T0(InterfaceC5985X interfaceC5985X, InterfaceC1436k interfaceC1436k, int i10) {
        super(1);
        this.f7722Y = i10;
        this.f7724o0 = interfaceC5985X;
        this.f7723Z = interfaceC1436k;
    }
}
