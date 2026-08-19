package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p084D4.AbstractC1900Y;
import p084D4.AbstractC1905b0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.k */
/* JADX INFO: loaded from: classes.dex */
public final class C12046k extends AbstractC1905b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C12056u f36572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialButton f36573b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C12048m f36574c;

    public C12046k(C12048m c12048m, C12056u c12056u, MaterialButton materialButton) {
        this.f36574c = c12048m;
        this.f36572a = c12056u;
        this.f36573b = materialButton;
    }

    @Override // p084D4.AbstractC1905b0
    /* JADX INFO: renamed from: a */
    public final void mo3014a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f36573b.getText());
        }
    }

    @Override // p084D4.AbstractC1905b0
    /* JADX INFO: renamed from: b */
    public final void mo3015b(RecyclerView recyclerView, int i10, int i11) {
        int iM12226J0;
        String dateTime;
        C12048m c12048m = this.f36574c;
        if (i10 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c12048m.f36583o1.getLayoutManager();
            View viewM12228L0 = linearLayoutManager.m12228L0(0, linearLayoutManager.m2985v(), false);
            iM12226J0 = viewM12228L0 == null ? -1 : AbstractC1900Y.m2917F(viewM12228L0);
        } else {
            iM12226J0 = ((LinearLayoutManager) c12048m.f36583o1.getLayoutManager()).m12226J0();
        }
        C12037b c12037b = this.f36572a.f36630d;
        Calendar calendarM13638a = AbstractC12060y.m13638a(c12037b.f36552Y.f36614Y);
        calendarM13638a.add(2, iM12226J0);
        c12048m.f36579k1 = new C12052q(calendarM13638a);
        Calendar calendarM13638a2 = AbstractC12060y.m13638a(c12037b.f36552Y.f36614Y);
        calendarM13638a2.add(2, iM12226J0);
        calendarM13638a2.set(5, 1);
        Calendar calendarM13638a3 = AbstractC12060y.m13638a(calendarM13638a2);
        calendarM13638a3.get(2);
        calendarM13638a3.get(1);
        calendarM13638a3.getMaximum(7);
        calendarM13638a3.getActualMaximum(5);
        calendarM13638a3.getTimeInMillis();
        long timeInMillis = calendarM13638a3.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = AbstractC12060y.f36634a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            dateTime = instanceForSkeleton.format(new Date(timeInMillis));
        } else {
            dateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.f36573b.setText(dateTime);
    }
}
