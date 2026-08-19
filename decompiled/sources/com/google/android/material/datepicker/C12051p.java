package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.google.android.material.datepicker.p */
/* JADX INFO: loaded from: classes.dex */
public final class C12051p<S> extends AbstractC12057v {

    /* JADX INFO: renamed from: i1 */
    public int f36612i1;

    /* JADX INFO: renamed from: j1 */
    public C12037b f36613j1;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: A */
    public final View mo5181A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m11752o(), this.f36612i1));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: G */
    public final void mo10178G(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f36612i1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f36613j1);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: z */
    public final void mo5187z(Bundle bundle) {
        super.mo5187z(bundle);
        if (bundle == null) {
            bundle = this.f33156r0;
        }
        this.f36612i1 = bundle.getInt("THEME_RES_ID_KEY");
        this.f36613j1 = (C12037b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
