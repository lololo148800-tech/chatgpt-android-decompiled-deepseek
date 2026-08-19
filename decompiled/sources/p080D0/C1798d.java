package p080D0;

import androidx.compose.p650ui.input.pointer.SuspendPointerInputElement;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p467T1.EnumC7198h;

/* JADX INFO: renamed from: D0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1798d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1818n f5155Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f5156Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC7198h f5157o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f5158p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f5159q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ SuspendPointerInputElement f5160r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f5161s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ int f5162t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1798d(InterfaceC1818n interfaceC1818n, boolean z6, EnumC7198h enumC7198h, boolean z10, long j10, SuspendPointerInputElement suspendPointerInputElement, int i10, int i11) {
        super(2);
        this.f5155Y = interfaceC1818n;
        this.f5156Z = z6;
        this.f5157o0 = enumC7198h;
        this.f5158p0 = z10;
        this.f5159q0 = j10;
        this.f5160r0 = suspendPointerInputElement;
        this.f5161s0 = i10;
        this.f5162t0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f5161s0 | 1);
        SuspendPointerInputElement suspendPointerInputElement = this.f5160r0;
        boolean z6 = this.f5158p0;
        AbstractC1807h0.m2616e(this.f5155Y, this.f5156Z, this.f5157o0, z6, this.f5159q0, suspendPointerInputElement, (C6021p) obj, iM6447d0, this.f5162t0);
        return C17296C.f55119a;
    }
}
