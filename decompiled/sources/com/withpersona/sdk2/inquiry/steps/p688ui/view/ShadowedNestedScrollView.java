package com.withpersona.sdk2.inquiry.steps.p688ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p581Xj.AbstractC9523a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getSolidColor", "()I", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ShadowedNestedScrollView extends NestedScrollView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowedNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC16544l.m18094g(context, "context");
    }

    @Override // android.view.View
    public int getSolidColor() {
        Context context = getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC9523a.f28662c, 0, 0);
        AbstractC16544l.m18093f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        return typedArrayObtainStyledAttributes.getColor(24, -3355444);
    }
}
