package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import p030B2.AbstractC0738T;
import p084D4.C1890N;
import p084D4.C1939s0;
import p108E2.C2247f;
import p189Ha.C3271e;
import p468T2.RunnableC7216h;
import p548Wd.p549VF.zakks;
import p594Y9.C9895g4;

/* JADX INFO: renamed from: com.google.android.material.datepicker.m */
/* JADX INFO: loaded from: classes.dex */
public final class C12048m<S> extends AbstractC12057v {

    /* JADX INFO: renamed from: i1 */
    public int f36577i1;

    /* JADX INFO: renamed from: j1 */
    public C12037b f36578j1;

    /* JADX INFO: renamed from: k1 */
    public C12052q f36579k1;

    /* JADX INFO: renamed from: l1 */
    public int f36580l1;

    /* JADX INFO: renamed from: m1 */
    public C12038c f36581m1;

    /* JADX INFO: renamed from: n1 */
    public RecyclerView f36582n1;

    /* JADX INFO: renamed from: o1 */
    public RecyclerView f36583o1;

    /* JADX INFO: renamed from: p1 */
    public View f36584p1;

    /* JADX INFO: renamed from: q1 */
    public View f36585q1;

    /* JADX INFO: renamed from: r1 */
    public View f36586r1;

    /* JADX INFO: renamed from: s1 */
    public View f36587s1;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: G */
    public final void mo10178G(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f36577i1);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f36578j1);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f36579k1);
    }

    /* JADX INFO: renamed from: Q */
    public final void m13626Q(C12052q c12052q) {
        C12056u c12056u = (C12056u) this.f36583o1.getAdapter();
        int iM13634d = c12056u.f36630d.f36552Y.m13634d(c12052q);
        int iM13634d2 = iM13634d - c12056u.f36630d.f36552Y.m13634d(this.f36579k1);
        boolean z6 = Math.abs(iM13634d2) > 3;
        boolean z10 = iM13634d2 > 0;
        this.f36579k1 = c12052q;
        if (z6 && z10) {
            this.f36583o1.m12283g0(iM13634d - 3);
            this.f36583o1.post(new RunnableC7216h(this, iM13634d, 2));
        } else if (!z6) {
            this.f36583o1.post(new RunnableC7216h(this, iM13634d, 2));
        } else {
            this.f36583o1.m12283g0(iM13634d + 3);
            this.f36583o1.post(new RunnableC7216h(this, iM13634d, 2));
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m13627R(int i10) {
        this.f36580l1 = i10;
        if (i10 == 2) {
            this.f36582n1.getLayoutManager().mo2968m0(this.f36579k1.f36616o0 - ((C12035A) this.f36582n1.getAdapter()).f36548d.f36578j1.f36552Y.f36616o0);
            this.f36586r1.setVisibility(0);
            this.f36587s1.setVisibility(8);
            this.f36584p1.setVisibility(8);
            this.f36585q1.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            this.f36586r1.setVisibility(8);
            this.f36587s1.setVisibility(0);
            this.f36584p1.setVisibility(0);
            this.f36585q1.setVisibility(0);
            m13626Q(this.f36579k1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: z */
    public final void mo5187z(Bundle bundle) {
        super.mo5187z(bundle);
        if (bundle == null) {
            bundle = this.f33156r0;
        }
        this.f36577i1 = bundle.getInt("THEME_RES_ID_KEY");
        this.f36578j1 = (C12037b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f36579k1 = (C12052q) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: A */
    public final View mo5181A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i10;
        int i11;
        C1890N c1890n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m11752o(), this.f36577i1);
        this.f36581m1 = new C12038c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C12052q c12052q = this.f36578j1.f36552Y;
        if (C12050o.m13629T(contextThemeWrapper, R.attr.windowFullscreen)) {
            i10 = com.openai.chatgpt.R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = com.openai.chatgpt.R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        Resources resources = m11743M().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.openai.chatgpt.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.openai.chatgpt.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.openai.chatgpt.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.openai.chatgpt.R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = C12053r.f36621d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.openai.chatgpt.R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(com.openai.chatgpt.R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(com.openai.chatgpt.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.openai.chatgpt.R.id.mtrl_calendar_days_of_week);
        AbstractC0738T.m1584l(gridView, new C2247f(1));
        int i13 = this.f36578j1.f36556q0;
        gridView.setAdapter((ListAdapter) (i13 > 0 ? new C12042g(i13) : new C12042g()));
        gridView.setNumColumns(c12052q.f36617p0);
        gridView.setEnabled(false);
        this.f36583o1 = (RecyclerView) viewInflate.findViewById(com.openai.chatgpt.R.id.mtrl_calendar_months);
        this.f36583o1.setLayoutManager(new C12044i(this, i11, i11));
        this.f36583o1.setTag(zakks.JaSKACkc);
        C12056u c12056u = new C12056u(contextThemeWrapper, this.f36578j1, new C9895g4(this));
        this.f36583o1.setAdapter(c12056u);
        int integer = contextThemeWrapper.getResources().getInteger(com.openai.chatgpt.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.openai.chatgpt.R.id.mtrl_calendar_year_selector_frame);
        this.f36582n1 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f36582n1.setLayoutManager(new GridLayoutManager(integer));
            this.f36582n1.setAdapter(new C12035A(this));
            this.f36582n1.m12286i(new C12045j(this));
        }
        if (viewInflate.findViewById(com.openai.chatgpt.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.openai.chatgpt.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC0738T.m1584l(materialButton, new C3271e(this, 1));
            View viewFindViewById = viewInflate.findViewById(com.openai.chatgpt.R.id.month_navigation_previous);
            this.f36584p1 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.openai.chatgpt.R.id.month_navigation_next);
            this.f36585q1 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f36586r1 = viewInflate.findViewById(com.openai.chatgpt.R.id.mtrl_calendar_year_selector_frame);
            this.f36587s1 = viewInflate.findViewById(com.openai.chatgpt.R.id.mtrl_calendar_day_selector_frame);
            m13627R(1);
            materialButton.setText(this.f36579k1.m13633c());
            this.f36583o1.m12288j(new C12046k(this, c12056u, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC12047l(this, 0));
            this.f36585q1.setOnClickListener(new ViewOnClickListenerC12043h(this, c12056u, 1));
            this.f36584p1.setOnClickListener(new ViewOnClickListenerC12043h(this, c12056u, 0));
        }
        if (!C12050o.m13629T(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c1890n = new C1890N()).f5522a) != (recyclerView = this.f36583o1)) {
            C1939s0 c1939s0 = c1890n.f5523b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f33651t1;
                if (arrayList != null) {
                    arrayList.remove(c1939s0);
                }
                c1890n.f5522a.setOnFlingListener(null);
            }
            c1890n.f5522a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c1890n.f5522a.m12288j(c1939s0);
                c1890n.f5522a.setOnFlingListener(c1890n);
                new Scroller(c1890n.f5522a.getContext(), new DecelerateInterpolator());
                c1890n.m2897f();
            }
        }
        this.f36583o1.m12283g0(c12056u.f36630d.f36552Y.m13634d(this.f36579k1));
        AbstractC0738T.m1584l(this.f36583o1, new C2247f(2));
        return viewInflate;
    }
}
