package p239Ja;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import p056C2.C1512f;

/* JADX INFO: renamed from: Ja.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4314q {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f14042a;

    /* JADX INFO: renamed from: b */
    public final C4313p f14043b;

    /* JADX INFO: renamed from: c */
    public final Context f14044c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f14045d;

    public AbstractC4314q(C4313p c4313p) {
        this.f14042a = c4313p.f14030o0;
        this.f14043b = c4313p;
        this.f14044c = c4313p.getContext();
        this.f14045d = c4313p.f14036u0;
    }

    /* JADX INFO: renamed from: c */
    public int mo5042c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int mo5043d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public View.OnFocusChangeListener mo5044e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View.OnClickListener mo5045f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public View.OnFocusChangeListener mo5046g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public C4307j mo5059h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo5060i(int i10) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo5061j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo5121k() {
        return this instanceof C4309l;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo5062l() {
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m5122q() {
        this.f14043b.m5111e(false);
    }

    /* JADX INFO: renamed from: a */
    public void mo5041a() {
    }

    /* JADX INFO: renamed from: b */
    public void mo5120b() {
    }

    /* JADX INFO: renamed from: r */
    public void mo5049r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo5050s() {
    }

    /* JADX INFO: renamed from: m */
    public void mo5047m(EditText editText) {
    }

    /* JADX INFO: renamed from: n */
    public void mo5063n(C1512f c1512f) {
    }

    /* JADX INFO: renamed from: o */
    public void mo5064o(AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: p */
    public void mo5048p(boolean z6) {
    }
}
