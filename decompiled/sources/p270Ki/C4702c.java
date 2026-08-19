package p270Ki;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p006A4.C0361v;
import p049Bm.InterfaceC1436k;
import p1025te.C19861L;
import p249Jl.SurfaceHolderCallbackC4482b;
import p349O0.C5950F;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9393x3;
import p909nm.C17689w;

/* JADX INFO: renamed from: Ki.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4702c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15287Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f15288Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f15289o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4702c(InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, int i10) {
        super(1);
        this.f15287Y = i10;
        this.f15288Z = interfaceC5985X;
        this.f15289o0 = interfaceC5985X2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f15287Y) {
            case 0:
                C5950F DisposableEffect = (C5950F) obj;
                AbstractC16544l.m18094g(DisposableEffect, "$this$DisposableEffect");
                SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b = (SurfaceHolderCallbackC4482b) this.f15288Z.getValue();
                if (surfaceHolderCallbackC4482b != null) {
                    surfaceHolderCallbackC4482b.setMirror(((Boolean) this.f15289o0.getValue()).booleanValue());
                }
                return new C0361v(1);
            case 1:
                List listM9974d = ((Boolean) obj).booleanValue() ? AbstractC9393x3.m9974d(this.f15288Z.getValue()) : C17689w.f56480Y;
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f15289o0.getValue();
                if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(new C19861L(listM9974d));
                }
                return C17296C.f55119a;
            default:
                List listM9974d2 = ((Boolean) obj).booleanValue() ? AbstractC9393x3.m9974d(this.f15288Z.getValue()) : C17689w.f56480Y;
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) this.f15289o0.getValue();
                if (interfaceC1436k2 != null) {
                    interfaceC1436k2.invoke(new C19861L(listM9974d2));
                }
                return C17296C.f55119a;
        }
    }
}
