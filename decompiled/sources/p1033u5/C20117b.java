package p1033u5;

import android.graphics.Bitmap;
import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: u5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C20117b {

    /* JADX INFO: renamed from: a */
    public final Bitmap f63740a;

    /* JADX INFO: renamed from: b */
    public final Map f63741b;

    public C20117b(Bitmap bitmap, Map map) {
        this.f63740a = bitmap;
        this.f63741b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20117b) {
            C20117b c20117b = (C20117b) obj;
            if (AbstractC16544l.m18089b(this.f63740a, c20117b.f63740a) && AbstractC16544l.m18089b(this.f63741b, c20117b.f63741b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f63741b.hashCode() + (this.f63740a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Value(bitmap=");
        sb2.append(this.f63740a);
        sb2.append(", extras=");
        return AbstractC12107L1.m13827r(sb2, this.f63741b, ')');
    }
}
