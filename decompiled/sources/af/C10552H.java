package af;

import android.net.Uri;
import bf.C11349D;
import bf.C11363S;
import bf.C11364T;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1025te.AbstractC19883n;
import p1025te.C19874e;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8090g0;
import p523V9.AbstractC8098h0;
import p635a1.InterfaceC10459q;
import re.C18973z;

/* JADX INFO: renamed from: af.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C10552H extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31316Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f31317Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f31318o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f31319p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f31320q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f31321r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f31322s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f31323t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10552H(InterfaceC1439n interfaceC1439n, InterfaceC1426a interfaceC1426a, C18973z c18973z, boolean z6, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f31320q0 = interfaceC1439n;
        this.f31321r0 = interfaceC1426a;
        this.f31322s0 = c18973z;
        this.f31317Z = z6;
        this.f31323t0 = interfaceC10459q;
        this.f31318o0 = i10;
        this.f31319p0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31316Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f31319p0 | 1);
                int i10 = this.f31318o0;
                boolean z6 = this.f31317Z;
                AbstractC8090g0.m8542a((C11364T) this.f31320q0, (C11349D) this.f31321r0, (InterfaceC1436k) this.f31322s0, (C11363S) this.f31323t0, i10, z6, (C6021p) obj, iM6447d0);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f31318o0 | 1);
                C18973z c18973z = (C18973z) this.f31322s0;
                boolean z10 = this.f31317Z;
                AbstractC8098h0.m8573e((InterfaceC1439n) this.f31320q0, (InterfaceC1426a) this.f31321r0, c18973z, z10, (InterfaceC10459q) this.f31323t0, (C6021p) obj, iM6447d1, this.f31319p0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d2 = C5997d.m6447d0(this.f31318o0 | 1);
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f31322s0;
                AbstractC19883n.m20786a((Uri) this.f31320q0, (C19874e) this.f31321r0, interfaceC1436k, (InterfaceC10459q) this.f31323t0, this.f31317Z, (C6021p) obj, iM6447d2, this.f31319p0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10552H(Uri uri, C19874e c19874e, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, boolean z6, int i10, int i11) {
        super(2);
        this.f31320q0 = uri;
        this.f31321r0 = c19874e;
        this.f31322s0 = interfaceC1436k;
        this.f31323t0 = interfaceC10459q;
        this.f31317Z = z6;
        this.f31318o0 = i10;
        this.f31319p0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10552H(C11364T c11364t, C11349D c11349d, InterfaceC1436k interfaceC1436k, C11363S c11363s, int i10, boolean z6, int i11) {
        super(2);
        this.f31320q0 = c11364t;
        this.f31321r0 = c11349d;
        this.f31322s0 = interfaceC1436k;
        this.f31323t0 = c11363s;
        this.f31318o0 = i10;
        this.f31317Z = z6;
        this.f31319p0 = i11;
    }
}
