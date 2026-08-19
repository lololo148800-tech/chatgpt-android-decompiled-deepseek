package p196Hi;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7987S3;
import p523V9.AbstractC8192s6;

/* JADX INFO: renamed from: Hi.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C3446p extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10474Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f10475Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f10476o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f10477p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3446p(InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, int i10) {
        super(2);
        this.f10476o0 = interfaceC1426a;
        this.f10475Z = interfaceC1436k;
        this.f10477p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10474Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC8192s6.m8792a(C5997d.m6447d0(this.f10477p0 | 1), this.f10476o0, this.f10475Z, c6021p);
                break;
            default:
                AbstractC7987S3.m8290c(C5997d.m6447d0(this.f10477p0 | 1), this.f10476o0, this.f10475Z, c6021p);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3446p(InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, int i10) {
        super(2);
        this.f10475Z = interfaceC1436k;
        this.f10476o0 = interfaceC1426a;
        this.f10477p0 = i10;
    }
}
