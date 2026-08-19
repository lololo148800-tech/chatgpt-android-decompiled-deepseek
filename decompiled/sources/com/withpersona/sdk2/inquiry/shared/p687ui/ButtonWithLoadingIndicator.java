package com.withpersona.sdk2.inquiry.shared.p687ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.material.button.MaterialButton;
import hk.C14525c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View$OnClickListener;", "l", "Lmm/C;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", "enabled", "setEnabled", "(Z)V", "isLoading", "setIsLoading", "Lcom/google/android/material/button/MaterialButton;", "q0", "Lcom/google/android/material/button/MaterialButton;", "getButton", "()Lcom/google/android/material/button/MaterialButton;", "button", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "shared_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ButtonWithLoadingIndicator extends FrameLayout {

    /* JADX INFO: renamed from: o0 */
    public final C14525c f40889o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f40890p0;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public final MaterialButton button;

    public ButtonWithLoadingIndicator(Context context, int i10) {
        super(context);
        this.f40889o0 = C14525c.m16034b(LayoutInflater.from(getContext()), this);
        MaterialButton materialButtonM14573a = m14573a(Integer.valueOf(i10));
        this.button = materialButtonM14573a;
        getProgressBar().setIndeterminateTintList(ColorStateList.valueOf(materialButtonM14573a.getCurrentTextColor()));
    }

    /* JADX INFO: renamed from: a */
    public final MaterialButton m14573a(Integer num) {
        MaterialButton materialButton = num.intValue() == 0 ? new MaterialButton(getContext(), null) : new MaterialButton(getContext(), null, num.intValue());
        addView(materialButton, 0);
        return materialButton;
    }

    /* JADX INFO: renamed from: b */
    public final void m14574b() {
        boolean z6 = this.f40890p0;
        MaterialButton materialButton = this.button;
        if (z6) {
            materialButton.setTextScaleX(0.0f);
            getProgressBar().setVisibility(0);
        } else {
            materialButton.setTextScaleX(1.0f);
            getProgressBar().setVisibility(8);
        }
    }

    public final MaterialButton getButton() {
        return this.button;
    }

    public final ProgressBar getProgressBar() {
        ProgressBar progressBar = (ProgressBar) this.f40889o0.f45778c;
        AbstractC16544l.m18093f(progressBar, "progressBar");
        return progressBar;
    }

    public final CharSequence getText() {
        CharSequence text = this.button.getText();
        AbstractC16544l.m18093f(text, "getText(...)");
        return text;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (isEnabled() == enabled) {
            return;
        }
        super.setEnabled(enabled);
        this.button.setEnabled(enabled);
        m14574b();
    }

    public final void setIsLoading(boolean isLoading) {
        if (this.f40890p0 == isLoading) {
            return;
        }
        this.f40890p0 = isLoading;
        this.button.setActivated(isLoading);
        m14574b();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l4) {
        this.button.setOnClickListener(l4);
    }

    public final void setText(CharSequence value) {
        AbstractC16544l.m18094g(value, "value");
        this.button.setText(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC16544l.m18094g(context, "context");
        this.f40889o0 = C14525c.m16034b(LayoutInflater.from(getContext()), this);
        MaterialButton materialButtonM14573a = m14573a(0);
        this.button = materialButtonM14573a;
        getProgressBar().setIndeterminateTintList(ColorStateList.valueOf(materialButtonM14573a.getCurrentTextColor()));
    }
}
