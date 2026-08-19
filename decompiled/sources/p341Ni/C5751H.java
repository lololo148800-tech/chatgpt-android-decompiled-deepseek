package p341Ni;

import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p148Fi.C2757C0;
import p148Fi.C2761E0;

/* JADX INFO: renamed from: Ni.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C5751H extends MediaSession.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5784h0 f18711a;

    public C5751H(C5784h0 c5784h0) {
        this.f18711a = c5784h0;
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent mediaButtonIntent) {
        int keyCode;
        AbstractC16544l.m18094g(mediaButtonIntent, "mediaButtonIntent");
        if ("android.intent.action.MEDIA_BUTTON".equals(mediaButtonIntent.getAction())) {
            KeyEvent keyEvent = Build.VERSION.SDK_INT >= 33 ? (KeyEvent) mediaButtonIntent.getParcelableExtra("android.intent.extra.KEY_EVENT", KeyEvent.class) : (KeyEvent) mediaButtonIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && ((keyCode = keyEvent.getKeyCode()) == 6 || keyCode == 127 || keyCode == 85 || keyCode == 86)) {
                C2761E0 c2761e0 = this.f18711a.f18852d;
                c2761e0.getClass();
                AbstractC0575H.m1156D(c2761e0.f8460b, null, null, new C2757C0(c2761e0, null), 3);
                return true;
            }
        }
        return super.onMediaButtonEvent(mediaButtonIntent);
    }
}
