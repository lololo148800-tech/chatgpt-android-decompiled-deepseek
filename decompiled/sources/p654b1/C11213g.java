package p654b1;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* JADX INFO: renamed from: b1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C11213g extends AutofillManager$AutofillCallback {

    /* JADX INFO: renamed from: a */
    public static final C11213g f33886a = new C11213g();

    /* JADX INFO: renamed from: a */
    public final void m12437a(C11207a c11207a) {
        c11207a.f33882c.registerCallback(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m12438b(C11207a c11207a) {
        c11207a.f33882c.unregisterCallback(this);
    }

    public final void onAutofillEvent(View view, int i10, int i11) {
        String str;
        super.onAutofillEvent(view, i10, i11);
        if (i11 == 1) {
            str = "Autofill popup was shown.";
        } else if (i11 != 2) {
            str = i11 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        } else {
            str = "Autofill popup was hidden.";
        }
        Log.d("Autofill Status", str);
    }
}
