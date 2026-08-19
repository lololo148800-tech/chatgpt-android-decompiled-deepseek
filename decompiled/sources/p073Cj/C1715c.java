package p073Cj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0130g;
import p099Dj.C2065c;
import p544W9.AbstractC8682o;

/* JADX INFO: renamed from: Cj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1715c {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f4901a;

    /* JADX INFO: renamed from: b */
    public C2065c f4902b;

    /* JADX INFO: renamed from: c */
    public boolean f4903c;

    /* JADX INFO: renamed from: d */
    public boolean f4904d;

    /* JADX INFO: renamed from: e */
    public View f4905e;

    public C1715c(ViewGroup contentView) {
        AbstractC16544l.m18094g(contentView, "contentView");
        this.f4901a = contentView;
    }

    /* JADX INFO: renamed from: a */
    public final void m2513a() {
        C2065c c2065c = this.f4902b;
        if (c2065c == null) {
            return;
        }
        boolean z6 = this.f4903c;
        FrameLayout frameLayout = c2065c.f6315a;
        if (z6) {
            AbstractC16544l.m18093f(frameLayout, "getRoot(...)");
            AbstractC8682o.m9380c(new C0130g(c2065c, 16), frameLayout);
        } else {
            AbstractC16544l.m18093f(frameLayout, "getRoot(...)");
            AbstractC8682o.m9380c(null, frameLayout);
        }
    }
}
