package io.sentry.android.replay;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p030B2.C0790w0;
import p030B2.C0794y0;
import p049Bm.InterfaceC1436k;
import p979r2.C18862c;

/* JADX INFO: renamed from: io.sentry.android.replay.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C15309v extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47824Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ View f47825Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15309v(View view, int i10) {
        super(1);
        this.f47824Y = i10;
        this.f47825Z = view;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f47824Y) {
            case 0:
                WeakReference it = (WeakReference) obj;
                AbstractC16544l.m18094g(it, "it");
                return Boolean.valueOf(AbstractC16544l.m18089b(it.get(), this.f47825Z));
            case 1:
                WeakReference it2 = (WeakReference) obj;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(AbstractC16544l.m18089b(it2.get(), this.f47825Z));
            default:
                C0794y0 insets = (C0794y0) obj;
                AbstractC16544l.m18094g(insets, "insets");
                C0790w0 c0790w0 = insets.f2209a;
                C18862c c18862cMo1755g = c0790w0.mo1755g(7);
                AbstractC16544l.m18093f(c18862cMo1755g, "getInsetsIgnoringVisibility(...)");
                C18862c c18862cMo1754f = c0790w0.mo1754f(8);
                AbstractC16544l.m18093f(c18862cMo1754f, "getInsets(...)");
                int iMax = Math.max(c18862cMo1755g.f60089d, c18862cMo1754f.f60089d);
                View view = this.f47825Z;
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iMax);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = c18862cMo1755g.f60087b;
                view.setLayoutParams(marginLayoutParams);
                return C17296C.f55119a;
        }
    }
}
