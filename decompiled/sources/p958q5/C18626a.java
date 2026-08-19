package p958q5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC16544l;
import p007A5.AbstractC0371f;
import p1075w5.C20835m;

/* JADX INFO: renamed from: q5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18626a implements InterfaceC18631f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59346a;

    public /* synthetic */ C18626a(int i10) {
        this.f59346a = i10;
    }

    @Override // p958q5.InterfaceC18631f
    /* JADX INFO: renamed from: a */
    public final InterfaceC18632g mo19984a(Object obj, C20835m c20835m) {
        switch (this.f59346a) {
            case 0:
                Uri uri = (Uri) obj;
                if (AbstractC0371f.m1004d(uri)) {
                    return new C18627b(uri, c20835m, 0);
                }
                return null;
            case 1:
                return new C18628c((Bitmap) obj, c20835m, 0);
            case 2:
                return new C18628c((ByteBuffer) obj, c20835m, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (AbstractC16544l.m18089b(uri2.getScheme(), "content")) {
                    return new C18627b(uri2, c20835m, 1);
                }
                return null;
            case 4:
                return new C18628c((Drawable) obj, c20835m, 2);
            case 5:
                return new C18633h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (AbstractC16544l.m18089b(uri3.getScheme(), "android.resource")) {
                    return new C18627b(uri3, c20835m, 2);
                }
                return null;
        }
    }
}
