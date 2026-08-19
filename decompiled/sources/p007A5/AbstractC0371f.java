package p007A5;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.openai.chatgpt.R;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17348o;
import p025An.C0644w;
import p1075w5.ViewOnAttachStateChangeListenerC20842t;
import p1098x5.C21122a;
import p1098x5.EnumC21128g;
import p1113xn.AbstractC21322p;
import p523V9.AbstractC7870D5;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: A5.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0371f {

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config f1262a;

    /* JADX INFO: renamed from: b */
    public static final C17348o f1263b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap.Config unused = Bitmap.Config.RGBA_F16;
        } else {
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        }
        f1262a = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f1263b = new C17348o((String[]) new ArrayList(20).toArray(new String[0]));
    }

    /* JADX INFO: renamed from: a */
    public static final void m1001a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m1002b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || AbstractC21322p.m21681O(str)) {
            return null;
        }
        String strM21708p0 = AbstractC21322p.m21708p0(AbstractC21322p.m21708p0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(AbstractC21322p.m21703k0('.', AbstractC21322p.m21703k0('/', strM21708p0, strM21708p0), ""));
    }

    /* JADX INFO: renamed from: c */
    public static final ViewOnAttachStateChangeListenerC20842t m1003c(ImageView imageView) {
        Object tag = imageView.getTag(R.id.coil_request_manager);
        ViewOnAttachStateChangeListenerC20842t viewOnAttachStateChangeListenerC20842t = tag instanceof ViewOnAttachStateChangeListenerC20842t ? (ViewOnAttachStateChangeListenerC20842t) tag : null;
        if (viewOnAttachStateChangeListenerC20842t == null) {
            synchronized (imageView) {
                try {
                    Object tag2 = imageView.getTag(R.id.coil_request_manager);
                    ViewOnAttachStateChangeListenerC20842t viewOnAttachStateChangeListenerC20842t2 = tag2 instanceof ViewOnAttachStateChangeListenerC20842t ? (ViewOnAttachStateChangeListenerC20842t) tag2 : null;
                    if (viewOnAttachStateChangeListenerC20842t2 != null) {
                        viewOnAttachStateChangeListenerC20842t = viewOnAttachStateChangeListenerC20842t2;
                    } else {
                        viewOnAttachStateChangeListenerC20842t = new ViewOnAttachStateChangeListenerC20842t(imageView);
                        imageView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC20842t);
                        imageView.setTag(R.id.coil_request_manager, viewOnAttachStateChangeListenerC20842t);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return viewOnAttachStateChangeListenerC20842t;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m1004d(Uri uri) {
        return AbstractC16544l.m18089b(uri.getScheme(), "file") && AbstractC16544l.m18089b((String) AbstractC17680n.m19343S(uri.getPathSegments()), "android_asset");
    }

    /* JADX INFO: renamed from: e */
    public static final int m1005e(AbstractC7870D5 abstractC7870D5, EnumC21128g enumC21128g) {
        if (abstractC7870D5 instanceof C21122a) {
            return ((C21122a) abstractC7870D5).f67118b;
        }
        int iOrdinal = enumC21128g.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new C0644w();
    }
}
