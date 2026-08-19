package p796i0;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: i0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14895b {

    /* JADX INFO: renamed from: a */
    public final Uri f46387a;

    /* JADX INFO: renamed from: b */
    public final Bundle f46388b;

    public C14895b(Uri uri, Bundle bundle) {
        this.f46387a = uri;
        this.f46388b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14895b)) {
            return false;
        }
        C14895b c14895b = (C14895b) obj;
        return AbstractC16544l.m18089b(this.f46387a, c14895b.f46387a) && AbstractC16544l.m18089b(this.f46388b, c14895b.f46388b);
    }

    public final int hashCode() {
        Uri uri = this.f46387a;
        return this.f46388b.hashCode() + ((uri != null ? uri.hashCode() : 0) * 31);
    }

    public final String toString() {
        return "PlatformTransferableContent(linkUri=" + this.f46387a + ", extras=" + this.f46388b + ')';
    }
}
