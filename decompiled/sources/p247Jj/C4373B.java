package p247Jj;

import android.content.Context;
import android.view.Window;
import androidx.fragment.app.AbstractActivityC11001b;
import kotlin.jvm.internal.AbstractC16544l;
import p248Jk.InterfaceC4473d;
import p720e6.C13287b;

/* JADX INFO: renamed from: Jj.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C4373B implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14240a;

    /* JADX INFO: renamed from: b */
    public final C13287b f14241b;

    public /* synthetic */ C4373B(C13287b c13287b, int i10) {
        this.f14240a = i10;
        this.f14241b = c13287b;
    }

    /* JADX INFO: renamed from: a */
    public static Context m5169a(C13287b c13287b) {
        Context applicationContext = ((AbstractActivityC11001b) c13287b.f42000Z).getApplicationContext();
        AbstractC16544l.m18093f(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f14240a) {
            case 0:
                return m5169a(this.f14241b);
            default:
                Window window = ((AbstractActivityC11001b) this.f14241b.f42000Z).getWindow();
                AbstractC16544l.m18093f(window, "getWindow(...)");
                return window;
        }
    }
}
