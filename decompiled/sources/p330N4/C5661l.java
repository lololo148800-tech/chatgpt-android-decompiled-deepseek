package p330N4;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p311Ma.C5315c;

/* JADX INFO: renamed from: N4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5661l extends AbstractC5648N {
    public C5661l(int i10) {
        this.f18356J0 = i10;
    }

    @Override // p330N4.AbstractC5648N
    /* JADX INFO: renamed from: K */
    public final ObjectAnimator mo6081K(ViewGroup viewGroup, View view, C5640F c5640f, C5640F c5640f2) {
        Float f10;
        float fFloatValue = (c5640f == null || (f10 = (Float) c5640f.f18320a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f10.floatValue();
        return m6089M(view, fFloatValue != 1.0f ? fFloatValue : 0.0f, 1.0f);
    }

    @Override // p330N4.AbstractC5648N
    /* JADX INFO: renamed from: L */
    public final ObjectAnimator mo6082L(ViewGroup viewGroup, View view, C5640F c5640f) {
        Float f10;
        AbstractC5642H.f18332a.getClass();
        return m6089M(view, (c5640f == null || (f10 = (Float) c5640f.f18320a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f10.floatValue(), 0.0f);
    }

    /* JADX INFO: renamed from: M */
    public final ObjectAnimator m6089M(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        AbstractC5642H.f18332a.mo6077c(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC5642H.f18333b, f11);
        objectAnimatorOfFloat.addListener(new C5315c(view));
        m6098a(new C5660k(view, 0));
        return objectAnimatorOfFloat;
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: f */
    public final void mo6058f(C5640F c5640f) {
        AbstractC5648N.m6079I(c5640f);
        c5640f.f18320a.put("android:fade:transitionAlpha", Float.valueOf(AbstractC5642H.f18332a.mo6076b(c5640f.f18321b)));
    }
}
