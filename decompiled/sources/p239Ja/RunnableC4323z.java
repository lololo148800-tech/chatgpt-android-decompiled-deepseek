package p239Ja;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: Ja.z */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4323z implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14100Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ TextInputLayout f14101Z;

    public /* synthetic */ RunnableC4323z(TextInputLayout textInputLayout, int i10) {
        this.f14100Y = i10;
        this.f14101Z = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14100Y) {
            case 0:
                CheckableImageButton checkableImageButton = this.f14101Z.f36766q0.f14036u0;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                break;
            default:
                this.f14101Z.f36768r0.requestLayout();
                break;
        }
    }
}
