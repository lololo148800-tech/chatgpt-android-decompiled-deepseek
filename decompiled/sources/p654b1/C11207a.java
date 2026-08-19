package p654b1;

import android.view.autofill.AutofillManager;
import androidx.compose.p650ui.platform.AndroidComposeView;
import p230J1.AbstractC4179f;

/* JADX INFO: renamed from: b1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11207a implements InterfaceC11209c {

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f33880a;

    /* JADX INFO: renamed from: b */
    public final C11215i f33881b;

    /* JADX INFO: renamed from: c */
    public final AutofillManager f33882c;

    public C11207a(AndroidComposeView androidComposeView, C11215i c11215i) {
        this.f33880a = androidComposeView;
        this.f33881b = c11215i;
        AutofillManager autofillManagerM4809e = AbstractC4179f.m4809e(androidComposeView.getContext().getSystemService(AbstractC4179f.m4812h()));
        if (autofillManagerM4809e == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f33882c = autofillManagerM4809e;
        androidComposeView.setImportantForAutofill(1);
    }
}
