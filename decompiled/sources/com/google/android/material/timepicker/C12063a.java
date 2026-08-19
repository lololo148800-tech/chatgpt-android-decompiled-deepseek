package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import za.AbstractC21827j;

/* JADX INFO: renamed from: com.google.android.material.timepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12063a extends AbstractC21827j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ChipTextInputComboView f36818Y;

    public C12063a(ChipTextInputComboView chipTextInputComboView) {
        this.f36818Y = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f36818Y;
        if (zIsEmpty) {
            chipTextInputComboView.f36786o0.setText(ChipTextInputComboView.m13684a(chipTextInputComboView, "00"));
            return;
        }
        String strM13684a = ChipTextInputComboView.m13684a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f36786o0;
        if (TextUtils.isEmpty(strM13684a)) {
            strM13684a = ChipTextInputComboView.m13684a(chipTextInputComboView, "00");
        }
        chip.setText(strM13684a);
    }
}
