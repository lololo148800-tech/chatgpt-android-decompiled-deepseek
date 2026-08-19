package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.openai.chatgpt.R;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: H0 */
    public static final /* synthetic */ int f36816H0 = 0;

    /* JADX INFO: renamed from: G0 */
    public final Chip f36817G0;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC12069g viewOnClickListenerC12069g = new ViewOnClickListenerC12069g(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f36487q0.add(new C12068f(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f36817G0 = chip2;
        ViewOnTouchListenerC12071i viewOnTouchListenerC12071i = new ViewOnTouchListenerC12071i(new GestureDetector(getContext(), new C12070h(this)));
        chip.setOnTouchListener(viewOnTouchListenerC12071i);
        chip2.setOnTouchListener(viewOnTouchListenerC12071i);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC12069g);
        chip2.setOnClickListener(viewOnClickListenerC12069g);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f36817G0.sendAccessibilityEvent(8);
        }
    }
}
