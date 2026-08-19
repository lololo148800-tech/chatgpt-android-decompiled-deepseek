package p654b1;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* JADX INFO: renamed from: b1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11211e {

    /* JADX INFO: renamed from: a */
    public static final C11211e f33885a = new C11211e();

    /* JADX INFO: renamed from: a */
    public final AutofillId m12398a(ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12399b(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12400c(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12401d(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12402e(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    /* JADX INFO: renamed from: f */
    public final void m12403f(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: g */
    public final void m12404g(ViewStructure viewStructure, AutofillId autofillId, int i10) {
        viewStructure.setAutofillId(autofillId, i10);
    }

    /* JADX INFO: renamed from: h */
    public final void m12405h(ViewStructure viewStructure, int i10) {
        viewStructure.setAutofillType(i10);
    }

    /* JADX INFO: renamed from: i */
    public final CharSequence m12406i(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
