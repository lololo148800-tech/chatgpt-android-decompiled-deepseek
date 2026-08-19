package p1121y5;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import p1144z5.InterfaceC21803g;

/* JADX INFO: renamed from: y5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21388a implements InterfaceC21803g, DefaultLifecycleObserver, InterfaceC21389b {

    /* JADX INFO: renamed from: Y */
    public boolean f67897Y;

    /* JADX INFO: renamed from: Z */
    public final ImageView f67898Z;

    public C21388a(ImageView imageView) {
        this.f67898Z = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final void m21770a() {
        Object drawable = this.f67898Z.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f67897Y) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21771b(Drawable drawable) {
        ImageView imageView = this.f67898Z;
        Object drawable2 = imageView.getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        m21770a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21388a) {
            if (AbstractC16544l.m18089b(this.f67898Z, ((C21388a) obj).f67898Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f67898Z.hashCode();
    }

    @Override // p1121y5.InterfaceC21389b
    /* JADX INFO: renamed from: k */
    public final void mo10667k(Drawable drawable) {
        m21771b(drawable);
    }

    @Override // p1121y5.InterfaceC21389b
    /* JADX INFO: renamed from: l */
    public final void mo10668l(Drawable drawable) {
        m21771b(drawable);
    }

    @Override // p1121y5.InterfaceC21389b
    /* JADX INFO: renamed from: n */
    public final void mo10669n(Drawable drawable) {
        m21771b(drawable);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12153a(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12154b(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12156d(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC11112u interfaceC11112u) {
        this.f67897Y = true;
        m21770a();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC11112u interfaceC11112u) {
        this.f67897Y = false;
        m21770a();
    }

    @Override // p1144z5.InterfaceC21803g
    /* JADX INFO: renamed from: q */
    public final Drawable mo18920q() {
        return this.f67898Z.getDrawable();
    }
}
