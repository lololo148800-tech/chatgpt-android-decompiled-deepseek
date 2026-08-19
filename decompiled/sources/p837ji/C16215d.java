package p837ji;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p544W9.AbstractC8543Q3;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: ji.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C16215d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ArrayList f50316Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f50317Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Double f50318o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Double f50319p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ double f50320q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ boolean f50321r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ float f50322s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1436k f50323t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f50324u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f50325v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16215d(ArrayList arrayList, InterfaceC10459q interfaceC10459q, Double d10, Double d11, double d12, boolean z6, float f10, InterfaceC1436k interfaceC1436k, int i10, int i11) {
        super(2);
        this.f50316Y = arrayList;
        this.f50317Z = interfaceC10459q;
        this.f50318o0 = d10;
        this.f50319p0 = d11;
        this.f50320q0 = d12;
        this.f50321r0 = z6;
        this.f50322s0 = f10;
        this.f50323t0 = interfaceC1436k;
        this.f50324u0 = i10;
        this.f50325v0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f50324u0 | 1);
        ArrayList arrayList = this.f50316Y;
        boolean z6 = this.f50321r0;
        AbstractC8543Q3.m9203a(arrayList, this.f50317Z, this.f50318o0, this.f50319p0, this.f50320q0, z6, this.f50322s0, this.f50323t0, (C6021p) obj, iM6447d0, this.f50325v0);
        return C17296C.f55119a;
    }
}
