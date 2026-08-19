package p239Ja;

import android.text.Editable;
import za.AbstractC21827j;

/* JADX INFO: renamed from: Ja.m */
/* JADX INFO: loaded from: classes.dex */
public final class C4310m extends AbstractC21827j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4313p f14013Y;

    public C4310m(C4313p c4313p) {
        this.f14013Y = c4313p;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f14013Y.m5108b().mo5041a();
    }

    @Override // za.AbstractC21827j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f14013Y.m5108b().mo5120b();
    }
}
