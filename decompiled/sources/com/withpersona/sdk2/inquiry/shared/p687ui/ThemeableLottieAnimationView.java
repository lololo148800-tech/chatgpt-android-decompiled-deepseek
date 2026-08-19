package com.withpersona.sdk2.inquiry.shared.p687ui;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p153Fn.C2925c;
import p730ek.C13438c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "shared_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ThemeableLottieAnimationView extends LottieAnimationView {

    /* JADX INFO: renamed from: H0 */
    public static final /* synthetic */ int f40894H0 = 0;

    /* JADX INFO: renamed from: F0 */
    public final LinkedHashMap f40895F0;

    /* JADX INFO: renamed from: G0 */
    public final C2925c f40896G0;

    public ThemeableLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40895F0 = new LinkedHashMap();
        this.f40896G0 = AbstractC0575H.m1174c(AbstractC0593T.f1824a);
        m13141c(new C13438c(this, 1));
    }

    /* JADX INFO: renamed from: i */
    public final void m14575i(int i10, int i11) {
        this.f40895F0.put(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0575H.m1180i(this.f40896G0, null);
    }
}
