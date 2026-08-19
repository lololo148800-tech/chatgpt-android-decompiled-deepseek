package p896n2;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* JADX INFO: renamed from: n2.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17461n {
    /* JADX INFO: renamed from: a */
    public static void m19156a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    /* JADX INFO: renamed from: b */
    public static void m19157b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static void m19158c(Notification.BigPictureStyle bigPictureStyle, boolean z6) {
        bigPictureStyle.showBigPictureWhenCollapsed(z6);
    }
}
