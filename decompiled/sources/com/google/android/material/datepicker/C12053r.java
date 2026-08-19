package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.r */
/* JADX INFO: loaded from: classes.dex */
public final class C12053r extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f36621d = AbstractC12060y.m13640c(null).getMaximum(4);

    /* JADX INFO: renamed from: e */
    public static final int f36622e = (AbstractC12060y.m13640c(null).getMaximum(7) + AbstractC12060y.m13640c(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a */
    public final C12052q f36623a;

    /* JADX INFO: renamed from: b */
    public C12038c f36624b;

    /* JADX INFO: renamed from: c */
    public final C12037b f36625c;

    public C12053r(C12052q c12052q, C12037b c12037b) {
        this.f36623a = c12052q;
        this.f36625c = c12037b;
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m13635a() {
        int firstDayOfWeek = this.f36625c.f36556q0;
        C12052q c12052q = this.f36623a;
        Calendar calendar = c12052q.f36614Y;
        int i10 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - firstDayOfWeek;
        return i11 < 0 ? i11 + c12052q.f36617p0 : i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 < m13635a() || i10 > m13637c()) {
            return null;
        }
        int iM13635a = (i10 - m13635a()) + 1;
        Calendar calendarM13638a = AbstractC12060y.m13638a(this.f36623a.f36614Y);
        calendarM13638a.set(5, iM13635a);
        return Long.valueOf(calendarM13638a.getTimeInMillis());
    }

    /* JADX INFO: renamed from: c */
    public final int m13637c() {
        return (m13635a() + this.f36623a.f36618q0) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f36622e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f36623a.f36617p0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f36624b == null) {
            this.f36624b = new C12038c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iM13635a = i10 - m13635a();
        if (iM13635a >= 0) {
            C12052q c12052q = this.f36623a;
            if (iM13635a >= c12052q.f36618q0) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(c12052q);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iM13635a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i10) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        AbstractC12060y.m13639b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
