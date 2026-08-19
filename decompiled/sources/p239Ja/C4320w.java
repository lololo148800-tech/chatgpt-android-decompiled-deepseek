package p239Ja;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.openai.chatgpt.R;
import p021Aj.ViewOnClickListenerC0529n;

/* JADX INFO: renamed from: Ja.w */
/* JADX INFO: loaded from: classes.dex */
public final class C4320w extends AbstractC4314q {

    /* JADX INFO: renamed from: e */
    public final int f14085e;

    /* JADX INFO: renamed from: f */
    public EditText f14086f;

    /* JADX INFO: renamed from: g */
    public final ViewOnClickListenerC0529n f14087g;

    public C4320w(C4313p c4313p, int i10) {
        super(c4313p);
        this.f14085e = R.drawable.design_password_eye;
        this.f14087g = new ViewOnClickListenerC0529n(this, 5);
        if (i10 != 0) {
            this.f14085e = i10;
        }
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: b */
    public final void mo5120b() {
        m5122q();
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: c */
    public final int mo5042c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: d */
    public final int mo5043d() {
        return this.f14085e;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo5045f() {
        return this.f14087g;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: k */
    public final boolean mo5121k() {
        return true;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: l */
    public final boolean mo5062l() {
        EditText editText = this.f14086f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: m */
    public final void mo5047m(EditText editText) {
        this.f14086f = editText;
        m5122q();
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: r */
    public final void mo5049r() {
        EditText editText = this.f14086f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f14086f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: s */
    public final void mo5050s() {
        EditText editText = this.f14086f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
