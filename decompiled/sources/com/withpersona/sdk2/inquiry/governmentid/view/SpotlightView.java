package com.withpersona.sdk2.inquiry.governmentid.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1156zj.AbstractC22145c1;
import p197Hj.C3457c;
import p594Y9.AbstractC9722E4;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/view/SpotlightView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p0", TokenNames.f32011F, "getRadius", "()F", "setRadius", "(F)V", "radius", "government-id_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SpotlightView extends View {

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ int f40653r0 = 0;

    /* JADX INFO: renamed from: o0 */
    public final int f40654o0;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public float radius;

    /* JADX INFO: renamed from: q0 */
    public Path f40656q0;

    public SpotlightView(Context context, AttributeSet attributeSet) {
        Resources.Theme theme;
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet);
        if (context == null || (theme = context.getTheme()) == null || (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, AbstractC22145c1.f70006a, 0, 0)) == null) {
            return;
        }
        try {
            this.f40654o0 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            this.radius = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC16544l.m18094g(canvas, "canvas");
        Path path = this.f40656q0;
        if (path == null) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public final float getRadius() {
        return this.radius;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        AbstractC9722E4.m10313a(new C3457c(this, 0), this);
    }

    public final void setRadius(float f10) {
        this.radius = f10;
    }
}
