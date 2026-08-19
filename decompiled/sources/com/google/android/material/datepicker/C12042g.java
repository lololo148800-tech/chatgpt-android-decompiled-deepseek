package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.datepicker.g */
/* JADX INFO: loaded from: classes.dex */
public final class C12042g extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f36562d;

    /* JADX INFO: renamed from: a */
    public final Calendar f36563a;

    /* JADX INFO: renamed from: b */
    public final int f36564b;

    /* JADX INFO: renamed from: c */
    public final int f36565c;

    static {
        f36562d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C12042g() {
        Calendar calendarM13640c = AbstractC12060y.m13640c(null);
        this.f36563a = calendarM13640c;
        this.f36564b = calendarM13640c.getMaximum(7);
        this.f36565c = calendarM13640c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f36564b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f36564b;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f36565c;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f36565c;
        int i12 = this.f36564b;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f36563a;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f36562d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C12042g(int i10) {
        Calendar calendarM13640c = AbstractC12060y.m13640c(null);
        this.f36563a = calendarM13640c;
        this.f36564b = calendarM13640c.getMaximum(7);
        this.f36565c = i10;
    }
}
