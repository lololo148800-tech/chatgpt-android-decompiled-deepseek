package androidx.glance.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p167Gb.C3032c;
import p672c3.C11596b0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m18067d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "c3/b0", "glance-appwidget_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GlanceRemoteViewsService extends RemoteViewsService {

    /* JADX INFO: renamed from: Y */
    public static final C3032c f33219Y = new C3032c(27);

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("No app widget id was present in the intent");
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            throw new IllegalStateException("No view id was present in the intent");
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra == null || stringExtra.length() == 0) {
            throw new IllegalStateException("No size info was present in the intent");
        }
        return new C11596b0(this, intExtra, intExtra2, stringExtra);
    }
}
