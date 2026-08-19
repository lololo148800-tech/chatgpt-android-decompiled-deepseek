package androidx.glance.appwidget.action;

import android.app.Activity;
import android.os.Bundle;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p695d3.AbstractC13002g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/glance/appwidget/action/InvisibleActionTrampolineActivity;", "Landroid/app/Activity;", "<init>", "()V", "glance-appwidget_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InvisibleActionTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC13002g.m14736f(this, getIntent());
    }
}
