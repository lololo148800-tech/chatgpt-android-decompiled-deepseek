package p084D4;

import android.graphics.Rect;
import android.view.View;
import cn.UfGr.EhBykzn;
import p468T2.C7212d;
import p468T2.InterfaceC7217i;

/* JADX INFO: renamed from: D4.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1888L {

    /* JADX INFO: renamed from: a */
    public int f5517a;

    /* JADX INFO: renamed from: b */
    public final Object f5518b;

    /* JADX INFO: renamed from: c */
    public final Object f5519c;

    public AbstractC1888L(AbstractC1900Y abstractC1900Y) {
        this.f5517a = Integer.MIN_VALUE;
        this.f5519c = new Rect();
        this.f5518b = abstractC1900Y;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo2876b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo2877c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo2878d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo2879e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo2880f();

    /* JADX INFO: renamed from: g */
    public abstract int mo2881g();

    /* JADX INFO: renamed from: h */
    public abstract int mo2882h();

    /* JADX INFO: renamed from: i */
    public abstract int mo2883i();

    /* JADX INFO: renamed from: j */
    public abstract int mo2884j();

    /* JADX INFO: renamed from: k */
    public abstract int mo2885k();

    /* JADX INFO: renamed from: l */
    public abstract int mo2886l();

    /* JADX INFO: renamed from: m */
    public int m2891m() {
        if (Integer.MIN_VALUE == this.f5517a) {
            return 0;
        }
        return mo2886l() - this.f5517a;
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo2887n(View view);

    /* JADX INFO: renamed from: o */
    public abstract int mo2888o(View view);

    /* JADX INFO: renamed from: p */
    public abstract void mo2889p(int i10);

    /* JADX INFO: renamed from: a */
    public static AbstractC1888L m2890a(AbstractC1900Y abstractC1900Y, int i10) {
        if (i10 == 0) {
            return new C1887K(abstractC1900Y, 0);
        }
        if (i10 == 1) {
            return new C1887K(abstractC1900Y, 1);
        }
        throw new IllegalArgumentException(EhBykzn.dpJPGfX);
    }

    public AbstractC1888L(InterfaceC7217i interfaceC7217i) {
        this.f5517a = 0;
        this.f5519c = new C7212d();
        this.f5518b = interfaceC7217i;
    }
}
