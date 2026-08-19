package fk;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.AbstractC16544l;
import p229J0.C4144v0;

/* JADX INFO: renamed from: fk.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C13689j implements TextWatcher {

    /* JADX INFO: renamed from: Y */
    public String f43187Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4144v0 f43188Z;

    public C13689j(C4144v0 c4144v0) {
        this.f43188Z = c4144v0;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strValueOf = String.valueOf(editable);
        String str = this.f43187Y;
        if (str == null) {
            AbstractC16544l.m18103p("oldText");
            throw null;
        }
        if (strValueOf.equals(str)) {
            return;
        }
        this.f43188Z.invoke(String.valueOf(editable));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f43187Y = String.valueOf(charSequence);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
