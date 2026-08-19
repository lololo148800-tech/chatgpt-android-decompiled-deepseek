package androidx.appcompat.view;

import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p030B2.C0750c0;
import p523V9.AbstractC8162p0;

/* JADX INFO: renamed from: androidx.appcompat.view.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10827j {

    /* JADX INFO: renamed from: c */
    public BaseInterpolator f32140c;

    /* JADX INFO: renamed from: d */
    public AbstractC8162p0 f32141d;

    /* JADX INFO: renamed from: e */
    public boolean f32142e;

    /* JADX INFO: renamed from: b */
    public long f32139b = -1;

    /* JADX INFO: renamed from: f */
    public final C10826i f32143f = new C10826i(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f32138a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m11118a() {
        if (this.f32142e) {
            Iterator it = this.f32138a.iterator();
            while (it.hasNext()) {
                ((C0750c0) it.next()).m1600b();
            }
            this.f32142e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11119b() {
        View view;
        if (this.f32142e) {
            return;
        }
        for (C0750c0 c0750c0 : this.f32138a) {
            long j10 = this.f32139b;
            if (j10 >= 0) {
                c0750c0.m1601c(j10);
            }
            BaseInterpolator baseInterpolator = this.f32140c;
            if (baseInterpolator != null && (view = (View) c0750c0.f2123a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f32141d != null) {
                c0750c0.m1602d(this.f32143f);
            }
            View view2 = (View) c0750c0.f2123a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f32142e = true;
    }
}
