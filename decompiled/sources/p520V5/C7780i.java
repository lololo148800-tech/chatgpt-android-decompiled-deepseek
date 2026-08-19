package p520V5;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: V5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7780i implements InterfaceC7797z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24578a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f24579b;

    public C7780i(LottieAnimationView lottieAnimationView, int i10) {
        this.f24578a = i10;
        switch (i10) {
            case 1:
                this.f24579b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f24579b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // p520V5.InterfaceC7797z
    public final void onResult(Object obj) {
        switch (this.f24578a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f24579b.get();
                if (lottieAnimationView != null) {
                    int i10 = lottieAnimationView.f35935u0;
                    if (i10 != 0) {
                        lottieAnimationView.setImageResource(i10);
                    }
                    InterfaceC7797z interfaceC7797z = lottieAnimationView.f35934t0;
                    if (interfaceC7797z == null) {
                        interfaceC7797z = LottieAnimationView.f35927E0;
                    }
                    interfaceC7797z.onResult(th2);
                    break;
                }
                break;
            default:
                C7781j c7781j = (C7781j) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f24579b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(c7781j);
                    break;
                }
                break;
        }
    }
}
