package p931ok;

import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p030B2.C0790w0;
import p030B2.C0794y0;
import p049Bm.InterfaceC1436k;
import p979r2.C18862c;

/* JADX INFO: renamed from: ok.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18221b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ View f58064Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f58065Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f58066o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f58067p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f58068q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18221b(View view, boolean z6, boolean z10, boolean z11, boolean z12) {
        super(1);
        this.f58064Y = view;
        this.f58065Z = z6;
        this.f58066o0 = z10;
        this.f58067p0 = z11;
        this.f58068q0 = z12;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C0794y0 insets = (C0794y0) obj;
        AbstractC16544l.m18094g(insets, "insets");
        C0790w0 c0790w0 = insets.f2209a;
        C18862c c18862cMo1755g = c0790w0.mo1755g(7);
        AbstractC16544l.m18093f(c18862cMo1755g, "getInsetsIgnoringVisibility(...)");
        C18862c c18862cMo1754f = c0790w0.mo1754f(8);
        AbstractC16544l.m18093f(c18862cMo1754f, "getInsets(...)");
        int iMax = Math.max(c18862cMo1755g.f60089d, c18862cMo1754f.f60089d);
        boolean z6 = this.f58065Z;
        View view = this.f58064Y;
        int paddingLeft = z6 ? c18862cMo1755g.f60086a : view.getPaddingLeft();
        int paddingTop = this.f58066o0 ? c18862cMo1755g.f60087b : view.getPaddingTop();
        int paddingRight = this.f58067p0 ? c18862cMo1755g.f60088c : view.getPaddingRight();
        if (!this.f58068q0) {
            iMax = view.getPaddingBottom();
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, iMax);
        return C17296C.f55119a;
    }
}
