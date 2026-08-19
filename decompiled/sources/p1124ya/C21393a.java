package p1124ya;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import p140Fa.C2687g;

/* JADX INFO: renamed from: ya.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21393a extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final Rect f67902a = new Rect();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C21394b f67903b;

    public C21393a(C21394b c21394b) {
        this.f67903b = c21394b;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C21394b c21394b = this.f67903b;
        if (c21394b.f67921z0 == null) {
            return;
        }
        if (c21394b.f67920y0 == null) {
            c21394b.f67920y0 = new C2687g(c21394b.f67921z0);
        }
        RectF rectF = c21394b.f67914s0;
        Rect rect = this.f67902a;
        rectF.round(rect);
        c21394b.f67920y0.setBounds(rect);
        c21394b.f67920y0.getOutline(outline);
    }
}
