package p193Hf;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Hf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3361f implements InterfaceC3364g {

    /* JADX INFO: renamed from: a */
    public final String f10266a;

    /* JADX INFO: renamed from: b */
    public final Uri f10267b;

    public C3361f(Uri uri, String content) {
        AbstractC16544l.m18094g(content, "content");
        AbstractC16544l.m18094g(uri, "uri");
        this.f10266a = content;
        this.f10267b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3361f)) {
            return false;
        }
        C3361f c3361f = (C3361f) obj;
        return AbstractC16544l.m18089b(this.f10266a, c3361f.f10266a) && AbstractC16544l.m18089b(this.f10267b, c3361f.f10267b);
    }

    public final int hashCode() {
        return this.f10267b.hashCode() + (this.f10266a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
