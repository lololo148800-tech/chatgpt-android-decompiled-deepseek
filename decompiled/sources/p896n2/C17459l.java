package p896n2;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: n2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C17459l {

    /* JADX INFO: renamed from: a */
    public final Bundle f55811a;

    /* JADX INFO: renamed from: b */
    public IconCompat f55812b;

    /* JADX INFO: renamed from: c */
    public final AbstractC17473z[] f55813c;

    /* JADX INFO: renamed from: d */
    public final boolean f55814d;

    /* JADX INFO: renamed from: e */
    public final boolean f55815e;

    /* JADX INFO: renamed from: f */
    public final int f55816f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f55817g;

    /* JADX INFO: renamed from: h */
    public final PendingIntent f55818h;

    public C17459l(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, AbstractC17473z[] abstractC17473zArr, AbstractC17473z[] abstractC17473zArr2) {
        this.f55815e = true;
        this.f55812b = iconCompat;
        if (iconCompat != null && iconCompat.m11386d() == 2) {
            this.f55816f = iconCompat.m11385c();
        }
        this.f55817g = C17465r.m19163b(charSequence);
        this.f55818h = pendingIntent;
        this.f55811a = bundle;
        this.f55813c = abstractC17473zArr;
        this.f55814d = true;
        this.f55815e = true;
    }
}
