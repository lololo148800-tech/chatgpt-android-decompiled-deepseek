package p003A1;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import mm.C17296C;
import p077Cn.C1743k;

/* JADX INFO: renamed from: A1.X1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0220X1 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1743k f849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0220X1(C1743k c1743k, Handler handler) {
        super(handler);
        this.f849a = c1743k;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6, Uri uri) {
        this.f849a.mo2524p(C17296C.f55119a);
    }
}
