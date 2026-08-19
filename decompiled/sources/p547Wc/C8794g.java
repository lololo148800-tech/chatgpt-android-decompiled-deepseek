package p547Wc;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8098h0;
import p594Y9.AbstractC9715D3;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Wc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C8794g extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26902Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f26903Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f26904o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1426a f26905p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC10459q f26906q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f26907r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8794g(int i10, int i11, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, String str, boolean z6) {
        super(2);
        this.f26902Y = i11;
        this.f26903Z = str;
        this.f26904o0 = z6;
        this.f26905p0 = interfaceC1426a;
        this.f26906q0 = interfaceC10459q;
        this.f26907r0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26902Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC9715D3.m10307a(this.f26903Z, this.f26904o0, this.f26905p0, this.f26906q0, (C6021p) obj, C5997d.m6447d0(this.f26907r0 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f26907r0 | 1);
                boolean z6 = this.f26904o0;
                InterfaceC1426a interfaceC1426a = this.f26905p0;
                AbstractC8098h0.m8574f(this.f26903Z, z6, interfaceC1426a, this.f26906q0, (C6021p) obj, iM6447d0);
                break;
        }
        return C17296C.f55119a;
    }
}
