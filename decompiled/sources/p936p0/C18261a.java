package p936p0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p594Y9.AbstractC9746I4;
import p635a1.C10450h;
import p635a1.InterfaceC10445c;
import p635a1.InterfaceC10459q;
import p860l0.InterfaceC16661B0;
import p911o0.InterfaceC17760h;
import p911o0.InterfaceC17763i0;
import p911o0.InterfaceC17766k;

/* JADX INFO: renamed from: p0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18261a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58209Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f58210Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18280t f58211o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC17763i0 f58212p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f58213q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC16661B0 f58214r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean f58215s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1436k f58216t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f58217u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f58218v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ Object f58219w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Object f58220x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18261a(InterfaceC10459q interfaceC10459q, C18280t c18280t, InterfaceC17763i0 interfaceC17763i0, boolean z6, Object obj, Object obj2, InterfaceC16661B0 interfaceC16661B0, boolean z10, InterfaceC1436k interfaceC1436k, int i10, int i11, int i12) {
        super(2);
        this.f58209Y = i12;
        this.f58210Z = interfaceC10459q;
        this.f58211o0 = c18280t;
        this.f58212p0 = interfaceC17763i0;
        this.f58213q0 = z6;
        this.f58219w0 = obj;
        this.f58220x0 = obj2;
        this.f58214r0 = interfaceC16661B0;
        this.f58215s0 = z10;
        this.f58216t0 = interfaceC1436k;
        this.f58217u0 = i10;
        this.f58218v0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58209Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f58217u0 | 1);
                InterfaceC16661B0 interfaceC16661B0 = this.f58214r0;
                AbstractC9746I4.m10337a(this.f58210Z, this.f58211o0, this.f58212p0, this.f58213q0, (InterfaceC17766k) this.f58219w0, (InterfaceC10445c) this.f58220x0, interfaceC16661B0, this.f58215s0, this.f58216t0, (C6021p) obj, iM6447d0, this.f58218v0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f58217u0 | 1);
                InterfaceC16661B0 interfaceC16661B1 = this.f58214r0;
                AbstractC9746I4.m10338b(this.f58210Z, this.f58211o0, this.f58212p0, this.f58213q0, (InterfaceC17760h) this.f58219w0, (C10450h) this.f58220x0, interfaceC16661B1, this.f58215s0, this.f58216t0, (C6021p) obj, iM6447d1, this.f58218v0);
                break;
        }
        return C17296C.f55119a;
    }
}
