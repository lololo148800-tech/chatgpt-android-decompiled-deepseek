package p810ig;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p544W9.AbstractC8626e3;

/* JADX INFO: renamed from: ig.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C14987f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ char f46651Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f46652Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f46653o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14987f(char c9, boolean z6, int i10) {
        super(2);
        this.f46651Y = c9;
        this.f46652Z = z6;
        this.f46653o0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f46653o0 | 1);
        AbstractC8626e3.m9275d(this.f46651Y, this.f46652Z, (C6021p) obj, iM6447d0);
        return C17296C.f55119a;
    }
}
