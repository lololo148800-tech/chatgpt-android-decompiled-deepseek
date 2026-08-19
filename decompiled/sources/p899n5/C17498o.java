package p899n5;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import p007A5.AbstractC0371f;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: n5.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17498o implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f55971Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f55972Z;

    public /* synthetic */ C17498o(Context context, int i10) {
        this.f55971Y = i10;
        this.f55972Z = context;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Context context = this.f55972Z;
        switch (this.f55971Y) {
            case 0:
                Bitmap.Config config = AbstractC0371f.f1262a;
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir.mkdirs();
                return cacheDir;
            default:
                Bitmap.Config config2 = AbstractC0371f.f1262a;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir2.mkdirs();
                return cacheDir2;
        }
    }
}
