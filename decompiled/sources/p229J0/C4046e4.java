package p229J0;

import androidx.compose.material3.AbstractC10859d;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: J0.e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4046e4 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12756Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f12757Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f12758o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f12759p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f12760q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f12761r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f12762s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1439n f12763t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Object f12764u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ Object f12765v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4046e4(C4154w4 c4154w4, C8410b c8410b, C3899D4 c3899d4, InterfaceC10459q interfaceC10459q, boolean z6, boolean z10, C8410b c8410b2, int i10, int i11) {
        super(2);
        this.f12762s0 = c4154w4;
        this.f12763t0 = c8410b;
        this.f12764u0 = c3899d4;
        this.f12757Z = interfaceC10459q;
        this.f12758o0 = z6;
        this.f12759p0 = z10;
        this.f12765v0 = c8410b2;
        this.f12760q0 = i10;
        this.f12761r0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12756Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f12760q0 | 1);
                boolean z6 = this.f12759p0;
                AbstractC10859d.m11284a(this.f12758o0, (InterfaceC1436k) this.f12762s0, this.f12757Z, this.f12763t0, z6, (C4040d4) this.f12764u0, (InterfaceC17406l) this.f12765v0, (C6021p) obj, iM6447d0, this.f12761r0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f12760q0 | 1);
                C8410b c8410b = (C8410b) this.f12765v0;
                C8410b c8410b2 = (C8410b) this.f12763t0;
                boolean z10 = this.f12758o0;
                AbstractC4166y4.m4789a((C4154w4) this.f12762s0, c8410b2, (C3899D4) this.f12764u0, this.f12757Z, z10, this.f12759p0, c8410b, (C6021p) obj, iM6447d1, this.f12761r0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4046e4(boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n, boolean z10, C4040d4 c4040d4, InterfaceC17406l interfaceC17406l, int i10, int i11) {
        super(2);
        this.f12758o0 = z6;
        this.f12762s0 = interfaceC1436k;
        this.f12757Z = interfaceC10459q;
        this.f12763t0 = interfaceC1439n;
        this.f12759p0 = z10;
        this.f12764u0 = c4040d4;
        this.f12765v0 = interfaceC17406l;
        this.f12760q0 = i10;
        this.f12761r0 = i11;
    }
}
