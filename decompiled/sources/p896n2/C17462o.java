package p896n2;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import p228J.AbstractC3812N;
import p658b5.C11238i;

/* JADX INFO: renamed from: n2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C17462o extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public IconCompat f55819o0;

    /* JADX INFO: renamed from: p0 */
    public IconCompat f55820p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f55821q0;

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: A */
    public final String mo4512A() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: i */
    public final void mo4531i(C11238i c11238i) {
        Bitmap bitmapM11383a;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) c11238i.f34009Z).setBigContentTitle(null);
        IconCompat iconCompat = this.f55819o0;
        Context context = (Context) c11238i.f34008Y;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC17461n.m19156a(bigContentTitle, iconCompat.m11389g(context));
            } else if (iconCompat.m11386d() == 1) {
                IconCompat iconCompat2 = this.f55819o0;
                int i10 = iconCompat2.f32891a;
                if (i10 == -1) {
                    Object obj = iconCompat2.f32892b;
                    bitmapM11383a = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i10 == 1) {
                    bitmapM11383a = (Bitmap) iconCompat2.f32892b;
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapM11383a = IconCompat.m11383a((Bitmap) iconCompat2.f32892b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapM11383a);
            }
        }
        if (this.f55821q0) {
            IconCompat iconCompat3 = this.f55820p0;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC17460m.m19155a(bigContentTitle, iconCompat3.m11389g(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC17461n.m19158c(bigContentTitle, false);
            AbstractC17461n.m19157b(bigContentTitle, null);
        }
    }
}
