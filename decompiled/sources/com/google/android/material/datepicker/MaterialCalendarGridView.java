package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import p030B2.AbstractC0738T;
import p108E2.C2247f;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: o0 */
    public final boolean f36549o0;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC12060y.m13640c(null);
        if (C12050o.m13629T(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.openai.chatgpt.R.id.cancel_button);
            setNextFocusRightId(com.openai.chatgpt.R.id.confirm_button);
        }
        this.f36549o0 = C12050o.m13629T(getContext(), com.openai.chatgpt.R.attr.nestedScrollable);
        AbstractC0738T.m1584l(this, new C2247f(3));
    }

    /* JADX INFO: renamed from: a */
    public final C12053r m13625a() {
        return (C12053r) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C12053r) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C12053r) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C12053r c12053r = (C12053r) super.getAdapter();
        c12053r.getClass();
        int iMax = Math.max(c12053r.m13635a(), getFirstVisiblePosition());
        int iMin = Math.min(c12053r.m13637c(), getLastVisiblePosition());
        c12053r.getItem(iMax);
        c12053r.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z6, int i10, Rect rect) {
        if (!z6) {
            super.onFocusChanged(false, i10, rect);
            return;
        }
        if (i10 == 33) {
            setSelection(((C12053r) super.getAdapter()).m13637c());
        } else if (i10 == 130) {
            setSelection(((C12053r) super.getAdapter()).m13635a());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C12053r) super.getAdapter()).m13635a()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(((C12053r) super.getAdapter()).m13635a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f36549o0) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i10) {
        if (i10 < ((C12053r) super.getAdapter()).m13635a()) {
            super.setSelection(((C12053r) super.getAdapter()).m13635a());
        } else {
            super.setSelection(i10);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C12053r) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C12053r)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C12053r.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
