package p896n2;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC11079O;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.FragmentC11081Q;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.InterfaceC0769m;
import p523V9.AbstractC8154o0;

/* JADX INFO: renamed from: n2.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC17454g extends Activity implements InterfaceC11112u, InterfaceC0769m {

    /* JADX INFO: renamed from: Y */
    public final C11114w f55801Y = new C11114w(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        AbstractC16544l.m18094g(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView, "window.decorView");
        if (AbstractC8154o0.m8712c(decorView, event)) {
            return true;
        }
        return AbstractC8154o0.m8713d(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        AbstractC16544l.m18094g(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView, "window.decorView");
        if (AbstractC8154o0.m8712c(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // p030B2.InterfaceC0769m
    /* JADX INFO: renamed from: f */
    public final boolean mo1712f(KeyEvent event) {
        AbstractC16544l.m18094g(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = FragmentC11081Q.f33408Z;
        AbstractC11079O.m12127b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC16544l.m18094g(outState, "outState");
        this.f55801Y.m12172h(EnumC11104m.f33476o0);
        super.onSaveInstanceState(outState);
    }
}
