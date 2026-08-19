package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.openai.chatgpt.R;
import java.util.Calendar;
import p084D4.AbstractC1893Q;
import p084D4.AbstractC1933p0;
import p084D4.C1901Z;
import p594Y9.C9895g4;

/* JADX INFO: renamed from: com.google.android.material.datepicker.u */
/* JADX INFO: loaded from: classes.dex */
public final class C12056u extends AbstractC1893Q {

    /* JADX INFO: renamed from: d */
    public final C12037b f36630d;

    /* JADX INFO: renamed from: e */
    public final C9895g4 f36631e;

    /* JADX INFO: renamed from: f */
    public final int f36632f;

    public C12056u(ContextThemeWrapper contextThemeWrapper, C12037b c12037b, C9895g4 c9895g4) {
        C12052q c12052q = c12037b.f36552Y;
        C12052q c12052q2 = c12037b.f36555p0;
        if (c12052q.f36614Y.compareTo(c12052q2.f36614Y) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c12052q2.f36614Y.compareTo(c12037b.f36553Z.f36614Y) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f36632f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C12053r.f36621d) + (C12050o.m13629T(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f36630d = c12037b;
        this.f36631e = c9895g4;
        if (this.f5529a.m2903a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f5530b = true;
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: a */
    public final int mo2898a() {
        return this.f36630d.f36558s0;
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: b */
    public final long mo2899b(int i10) {
        Calendar calendarM13638a = AbstractC12060y.m13638a(this.f36630d.f36552Y.f36614Y);
        calendarM13638a.add(2, i10);
        calendarM13638a.set(5, 1);
        Calendar calendarM13638a2 = AbstractC12060y.m13638a(calendarM13638a);
        calendarM13638a2.get(2);
        calendarM13638a2.get(1);
        calendarM13638a2.getMaximum(7);
        calendarM13638a2.getActualMaximum(5);
        calendarM13638a2.getTimeInMillis();
        return calendarM13638a2.getTimeInMillis();
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: d */
    public final void mo2901d(AbstractC1933p0 abstractC1933p0, int i10) {
        C12055t c12055t = (C12055t) abstractC1933p0;
        C12037b c12037b = this.f36630d;
        Calendar calendarM13638a = AbstractC12060y.m13638a(c12037b.f36552Y.f36614Y);
        calendarM13638a.add(2, i10);
        C12052q c12052q = new C12052q(calendarM13638a);
        c12055t.f36628u.setText(c12052q.m13633c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c12055t.f36629v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m13625a() == null || !c12052q.equals(materialCalendarGridView.m13625a().f36623a)) {
            new C12053r(c12052q, c12037b);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m13625a().getClass();
        throw null;
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: e */
    public final AbstractC1933p0 mo2902e(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C12050o.m13629T(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C12055t(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C1901Z(-1, this.f36632f));
        return new C12055t(linearLayout, true);
    }
}
