package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.Locale;
import p084D4.AbstractC1893Q;
import p084D4.AbstractC1933p0;
import p1061vb.C20513d;

/* JADX INFO: renamed from: com.google.android.material.datepicker.A */
/* JADX INFO: loaded from: classes.dex */
public final class C12035A extends AbstractC1893Q {

    /* JADX INFO: renamed from: d */
    public final C12048m f36548d;

    public C12035A(C12048m c12048m) {
        this.f36548d = c12048m;
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: a */
    public final int mo2898a() {
        return this.f36548d.f36578j1.f36557r0;
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: d */
    public final void mo2901d(AbstractC1933p0 abstractC1933p0, int i10) {
        C12048m c12048m = this.f36548d;
        int i11 = c12048m.f36578j1.f36552Y.f36616o0 + i10;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
        TextView textView = ((C12061z) abstractC1933p0).f36635u;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC12060y.m13639b().get(1) == i11 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11)));
        C12038c c12038c = c12048m.f36581m1;
        if (AbstractC12060y.m13639b().get(1) == i11) {
            C20513d c20513d = c12038c.f36560b;
        } else {
            C20513d c20513d2 = c12038c.f36559a;
        }
        throw null;
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: e */
    public final AbstractC1933p0 mo2902e(ViewGroup viewGroup, int i10) {
        return new C12061z((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
