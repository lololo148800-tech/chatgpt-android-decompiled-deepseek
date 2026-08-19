package p842k0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p544W9.AbstractC8572V3;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: k0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16292a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50468Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16305n f50469Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f50470o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f50471p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC16546n f50472q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f50473r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16292a(C16305n c16305n, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k, int i10, int i11) {
        super(2);
        this.f50468Y = i11;
        switch (i11) {
            case 1:
                this.f50469Z = c16305n;
                this.f50470o0 = interfaceC1426a;
                this.f50471p0 = interfaceC10459q;
                this.f50472q0 = (AbstractC16546n) interfaceC1436k;
                this.f50473r0 = i10;
                super(2);
                break;
            default:
                this.f50469Z = c16305n;
                this.f50470o0 = interfaceC1426a;
                this.f50471p0 = interfaceC10459q;
                this.f50472q0 = (AbstractC16546n) interfaceC1436k;
                this.f50473r0 = i10;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r4v2, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f50468Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f50473r0 | 1);
                ?? r6 = this.f50472q0;
                AbstractC8572V3.m9236a(this.f50469Z, this.f50470o0, this.f50471p0, r6, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f50473r0 | 1);
                ?? r10 = this.f50472q0;
                AbstractC8572V3.m9236a(this.f50469Z, this.f50470o0, this.f50471p0, r10, (C6021p) obj, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
