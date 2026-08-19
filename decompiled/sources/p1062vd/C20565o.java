package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p492U1.C7543h;

/* JADX INFO: renamed from: vd.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C20565o extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65277Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f65278Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20541V f65279o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20565o(InterfaceC1436k interfaceC1436k, C20541V c20541v) {
        super(1);
        this.f65278Z = interfaceC1436k;
        this.f65279o0 = c20541v;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f65277Y) {
            case 0:
                long j10 = ((C7543h) obj).f23897a;
                String str = this.f65279o0.f65169a.f21380b;
                if (str != null) {
                    this.f65278Z.invoke(new C20523C(str));
                }
                break;
            default:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f65278Z.invoke(new C20535O(this.f65279o0.f65169a, it));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20565o(C20541V c20541v, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f65279o0 = c20541v;
        this.f65278Z = interfaceC1436k;
    }
}
