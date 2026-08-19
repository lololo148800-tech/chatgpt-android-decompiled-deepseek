package p736f0;

import androidx.compose.animation.AbstractC10831a;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: f0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C13497o extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42724Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f42725Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f42726o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13467E f42727p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C13468F f42728q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ String f42729r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C8410b f42730s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ int f42731t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f42732u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13497o(boolean z6, InterfaceC10459q interfaceC10459q, C13467E c13467e, C13468F c13468f, String str, C8410b c8410b, int i10, int i11, int i12) {
        super(2);
        this.f42724Y = i12;
        this.f42725Z = z6;
        this.f42726o0 = interfaceC10459q;
        this.f42727p0 = c13467e;
        this.f42728q0 = c13468f;
        this.f42729r0 = str;
        this.f42730s0 = c8410b;
        this.f42731t0 = i10;
        this.f42732u0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42724Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f42731t0 | 1);
                C8410b c8410b = this.f42730s0;
                C13468F c13468f = this.f42728q0;
                AbstractC10831a.m11201d(this.f42725Z, this.f42726o0, this.f42727p0, c13468f, this.f42729r0, c8410b, (C6021p) obj, iM6447d0, this.f42732u0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f42731t0 | 1);
                C8410b c8410b2 = this.f42730s0;
                C13468F c13468f2 = this.f42728q0;
                AbstractC10831a.m11202e(this.f42725Z, this.f42726o0, this.f42727p0, c13468f2, this.f42729r0, c8410b2, (C6021p) obj, iM6447d1, this.f42732u0);
                break;
        }
        return C17296C.f55119a;
    }
}
