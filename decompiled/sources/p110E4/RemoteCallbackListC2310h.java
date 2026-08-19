package p110E4;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: E4.h */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteCallbackListC2310h extends RemoteCallbackList {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MultiInstanceInvalidationService f7175a;

    public RemoteCallbackListC2310h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f7175a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        C2306d callback = (C2306d) iInterface;
        AbstractC16544l.m18094g(callback, "callback");
        AbstractC16544l.m18094g(cookie, "cookie");
        this.f7175a.f33687Z.remove((Integer) cookie);
    }
}
