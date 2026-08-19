package p772h;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0093v0;
import p183H4.C3231f;
import p183H4.InterfaceC3232g;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;
import p544W9.AbstractC8748z;
import p741f5.RunnableC13542a;

/* JADX INFO: renamed from: h.k */
/* JADX INFO: loaded from: classes.dex */
public class DialogC14229k extends Dialog implements InterfaceC11112u, InterfaceC14216G, InterfaceC3232g {

    /* JADX INFO: renamed from: Y */
    public C11114w f44680Y;

    /* JADX INFO: renamed from: Z */
    public final C0093v0 f44681Z;

    /* JADX INFO: renamed from: o0 */
    public final C14215F f44682o0;

    public DialogC14229k(Context context, int i10) {
        super(context, i10);
        this.f44681Z = new C0093v0(this);
        this.f44682o0 = new C14215F(new RunnableC13542a(this, 2));
    }

    /* JADX INFO: renamed from: b */
    public static void m15534b(DialogC14229k this$0) {
        AbstractC16544l.m18094g(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // p772h.InterfaceC14216G
    /* JADX INFO: renamed from: a */
    public final C14215F mo10191a() {
        return this.f44682o0;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC16544l.m18094g(view, "view");
        m15536d();
        super.addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final C11114w m15535c() {
        C11114w c11114w = this.f44680Y;
        if (c11114w != null) {
            return c11114w;
        }
        C11114w c11114w2 = new C11114w(this, true);
        this.f44680Y = c11114w2;
        return c11114w2;
    }

    /* JADX INFO: renamed from: d */
    public final void m15536d() {
        Window window = getWindow();
        AbstractC16544l.m18091d(window);
        View decorView = window.getDecorView();
        AbstractC16544l.m18093f(decorView, "window!!.decorView");
        AbstractC7841A0.m8092d(decorView, this);
        Window window2 = getWindow();
        AbstractC16544l.m18091d(window2);
        View decorView2 = window2.getDecorView();
        AbstractC16544l.m18093f(decorView2, "window!!.decorView");
        AbstractC8748z.m9503d(decorView2, this);
        Window window3 = getWindow();
        AbstractC16544l.m18091d(window3);
        View decorView3 = window3.getDecorView();
        AbstractC16544l.m18093f(decorView3, "window!!.decorView");
        AbstractC8104h6.m8585d(decorView3, this);
    }

    @Override // p183H4.InterfaceC3232g
    /* JADX INFO: renamed from: h */
    public final C3231f mo4127h() {
        return (C3231f) this.f44681Z.f405p0;
    }

    @Override // androidx.lifecycle.InterfaceC11112u
    /* JADX INFO: renamed from: i */
    public final AbstractC11105n mo7809i() {
        return m15535c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f44682o0.m15518c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC16544l.m18093f(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C14215F c14215f = this.f44682o0;
            c14215f.getClass();
            c14215f.f44645e = onBackInvokedDispatcher;
            c14215f.m15519d(c14215f.f44647g);
        }
        this.f44681Z.m349s(bundle);
        m15535c().m12170f(EnumC11103l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC16544l.m18093f(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f44681Z.m351u(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m15535c().m12170f(EnumC11103l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m15535c().m12170f(EnumC11103l.ON_DESTROY);
        this.f44680Y = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        m15536d();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC16544l.m18094g(view, "view");
        m15536d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC16544l.m18094g(view, "view");
        m15536d();
        super.setContentView(view, layoutParams);
    }
}
