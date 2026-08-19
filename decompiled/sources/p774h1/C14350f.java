package p774h1;

import android.os.Build;
import androidx.compose.p650ui.platform.AndroidComposeView;
import com.openai.chatgpt.R;
import p821j1.C16037b;
import p843k1.C16308b;
import p843k1.C16311e;
import p843k1.C16313g;
import p843k1.C16315i;
import p843k1.InterfaceC16310d;
import p861l1.AbstractC16800a;
import p861l1.C16801b;

/* JADX INFO: renamed from: h1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C14350f implements InterfaceC14324B {

    /* JADX INFO: renamed from: d */
    public static boolean f45032d = true;

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f45033a;

    /* JADX INFO: renamed from: b */
    public final Object f45034b = new Object();

    /* JADX INFO: renamed from: c */
    public C16801b f45035c;

    public C14350f(AndroidComposeView androidComposeView) {
        this.f45033a = androidComposeView;
    }

    @Override // p774h1.InterfaceC14324B
    /* JADX INFO: renamed from: a */
    public final void mo14859a(C16308b c16308b) {
        synchronized (this.f45034b) {
            if (!c16308b.f50536r) {
                c16308b.f50536r = true;
                c16308b.m17832b();
            }
        }
    }

    @Override // p774h1.InterfaceC14324B
    /* JADX INFO: renamed from: b */
    public final C16308b mo14860b() {
        InterfaceC16310d c16315i;
        C16308b c16308b;
        synchronized (this.f45034b) {
            try {
                AndroidComposeView androidComposeView = this.f45033a;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    AbstractC14349e.m15726a(androidComposeView);
                }
                if (i10 >= 29) {
                    c16315i = new C16313g();
                } else if (f45032d) {
                    try {
                        c16315i = new C16311e(this.f45033a, new C14363s(), new C16037b());
                    } catch (Throwable unused) {
                        f45032d = false;
                        c16315i = new C16315i(m15727c(this.f45033a));
                    }
                } else {
                    c16315i = new C16315i(m15727c(this.f45033a));
                }
                c16308b = new C16308b(c16315i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c16308b;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC16800a m15727c(AndroidComposeView androidComposeView) {
        C16801b c16801b = this.f45035c;
        if (c16801b != null) {
            return c16801b;
        }
        C16801b c16801b2 = new C16801b(androidComposeView.getContext());
        c16801b2.setClipChildren(false);
        c16801b2.setClipToPadding(false);
        c16801b2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        androidComposeView.addView(c16801b2, -1);
        this.f45035c = c16801b2;
        return c16801b2;
    }
}
