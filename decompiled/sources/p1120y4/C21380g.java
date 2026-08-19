package p1120y4;

import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p117Eb.C2391u;
import p165G9.C3024j;
import p902n8.C17518e;

/* JADX INFO: renamed from: y4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C21380g {

    /* JADX INFO: renamed from: a */
    public final C17518e f67872a;

    /* JADX INFO: renamed from: b */
    public final C21382i f67873b;

    /* JADX INFO: renamed from: c */
    public boolean f67874c;

    /* JADX INFO: renamed from: d */
    public final float f67875d;

    public C21380g(Window window, C17518e c17518e) {
        this.f67872a = c17518e;
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            throw new IllegalStateException("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
        }
        ViewParent parent = viewPeekDecorView.getParent();
        View view = viewPeekDecorView;
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        Object tag = view.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new C21387n();
            view.setTag(R.id.metricsStateHolder, tag);
        }
        C21387n c21387n = (C21387n) tag;
        if (c21387n.f67896a == null) {
            c21387n.f67896a = new C2391u(21);
        }
        int i10 = Build.VERSION.SDK_INT;
        C21382i c21386m = i10 >= 31 ? new C21386m(this, viewPeekDecorView, window) : i10 >= 26 ? new C21385l(this, viewPeekDecorView, window) : i10 >= 24 ? new C21384k(this, viewPeekDecorView, window) : new C21382i(this, viewPeekDecorView);
        this.f67873b = c21386m;
        c21386m.mo21764c(true);
        this.f67874c = true;
        this.f67875d = 2.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m21760a(C21377d volatileFrameData) {
        AbstractC16544l.m18094g(volatileFrameData, "volatileFrameData");
        C17518e c17518e = this.f67872a;
        double d10 = volatileFrameData.f67867c;
        if (d10 > 0.0d) {
            double d11 = C17518e.f56031w0;
            double d12 = d11 / d10;
            int i10 = ((C3024j) c17518e.f56036q0).f9112Z;
            if (i10 >= 31) {
                c17518e.f56035p0 = d11 / c17518e.f56041v0;
            } else if (i10 == 30) {
                Display display = c17518e.f56039t0;
                c17518e.f56035p0 = display != null ? display.getRefreshRate() : 60.0d;
            }
            double d13 = (60.0d / c17518e.f56035p0) * d12;
            double d14 = d13 <= 60.0d ? d13 : 60.0d;
            if (d14 > 1.0d) {
                c17518e.f56032Y.mo19201b(d14);
            }
        }
    }
}
