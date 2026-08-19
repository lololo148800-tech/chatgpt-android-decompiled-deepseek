package p132F2;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: renamed from: F2.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2645i {

    /* JADX INFO: renamed from: a */
    public final Bundle f8158a;

    /* JADX INFO: renamed from: b */
    public final Bundle f8159b;

    /* JADX INFO: renamed from: c */
    public final Set f8160c;

    public AbstractC2645i(Bundle bundle, Bundle bundle2, boolean z6, Set set, int i10) {
        this.f8158a = bundle;
        this.f8159b = bundle2;
        this.f8160c = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z6);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z6);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i10);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i10);
    }
}
