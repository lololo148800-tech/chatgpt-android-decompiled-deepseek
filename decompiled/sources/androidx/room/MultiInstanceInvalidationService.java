package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p110E4.RemoteCallbackListC2310h;
import p238J9.BinderC4294b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, m18068k = 1, m18069mv = {1, 7, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: Y */
    public int f33686Y;

    /* JADX INFO: renamed from: Z */
    public final LinkedHashMap f33687Z = new LinkedHashMap();

    /* JADX INFO: renamed from: o0 */
    public final RemoteCallbackListC2310h f33688o0 = new RemoteCallbackListC2310h(this);

    /* JADX INFO: renamed from: p0 */
    public final BinderC4294b f33689p0 = new BinderC4294b(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC16544l.m18094g(intent, "intent");
        return this.f33689p0;
    }
}
