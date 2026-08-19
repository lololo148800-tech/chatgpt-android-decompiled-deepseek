package p293Lh;

import com.openai.viewmodel.BaseViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1441p;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.C8410b;
import p544W9.AbstractC8662k3;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Lh.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C5061g extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ BaseViewModel f16540Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f16541Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f16542o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f16543p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f16544q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1441p f16545r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean f16546s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C8410b f16547t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f16548u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5061g(BaseViewModel baseViewModel, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, InterfaceC10459q interfaceC10459q2, long j10, InterfaceC1441p interfaceC1441p, boolean z6, C8410b c8410b, int i10) {
        super(2);
        this.f16540Y = baseViewModel;
        this.f16541Z = interfaceC1436k;
        this.f16542o0 = interfaceC10459q;
        this.f16543p0 = interfaceC10459q2;
        this.f16544q0 = j10;
        this.f16545r0 = interfaceC1441p;
        this.f16546s0 = z6;
        this.f16547t0 = c8410b;
        this.f16548u0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f16548u0 | 1);
        C8410b c8410b = this.f16547t0;
        long j10 = this.f16544q0;
        InterfaceC1441p interfaceC1441p = this.f16545r0;
        AbstractC8662k3.m9351b(this.f16540Y, this.f16541Z, this.f16542o0, this.f16543p0, j10, interfaceC1441p, this.f16546s0, c8410b, (C6021p) obj, iM6447d0);
        return C17296C.f55119a;
    }
}
