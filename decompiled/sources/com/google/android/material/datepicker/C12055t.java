package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p030B2.C0725F;
import p084D4.AbstractC1933p0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.t */
/* JADX INFO: loaded from: classes.dex */
public final class C12055t extends AbstractC1933p0 {

    /* JADX INFO: renamed from: u */
    public final TextView f36628u;

    /* JADX INFO: renamed from: v */
    public final MaterialCalendarGridView f36629v;

    public C12055t(LinearLayout linearLayout, boolean z6) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f36628u = textView;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        new C0725F(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m1540f(textView, Boolean.TRUE);
        this.f36629v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z6) {
            return;
        }
        textView.setVisibility(8);
    }
}
