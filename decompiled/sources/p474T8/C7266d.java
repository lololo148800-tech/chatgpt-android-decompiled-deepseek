package p474T8;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p349O0.C5950F;
import p795i.C14893g;

/* JADX INFO: renamed from: T8.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7266d implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23043Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7268f f23044Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14893g f23045o0;

    public /* synthetic */ C7266d(C7268f c7268f, C14893g c14893g, int i10) {
        this.f23043Y = i10;
        this.f23044Z = c7268f;
        this.f23045o0 = c14893g;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C5950F DisposableEffect = (C5950F) obj;
        switch (this.f23043Y) {
            case 0:
                AbstractC16544l.m18094g(DisposableEffect, "$this$DisposableEffect");
                C7268f c7268f = this.f23044Z;
                c7268f.f23052e = this.f23045o0;
                return new C7267e(c7268f, 0);
            default:
                AbstractC16544l.m18094g(DisposableEffect, "$this$DisposableEffect");
                C7268f c7268f2 = this.f23044Z;
                c7268f2.f23052e = this.f23045o0;
                return new C7267e(c7268f2, 1);
        }
    }
}
