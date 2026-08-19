package p1036u9;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import p1009s9.C19501d;
import p1060v9.AbstractC20502t;
import sk.C19665d;

/* JADX INFO: renamed from: u9.r */
/* JADX INFO: loaded from: classes.dex */
public final class C20172r {

    /* JADX INFO: renamed from: a */
    public final C20155a f63897a;

    /* JADX INFO: renamed from: b */
    public final C19501d f63898b;

    public /* synthetic */ C20172r(C20155a c20155a, C19501d c19501d) {
        this.f63897a = c20155a;
        this.f63898b = c19501d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C20172r)) {
            C20172r c20172r = (C20172r) obj;
            if (AbstractC20502t.m21161l(this.f63897a, c20172r.f63897a) && AbstractC20502t.m21161l(this.f63898b, c20172r.f63898b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f63897a, this.f63898b});
    }

    public final String toString() {
        C19665d c19665d = new C19665d(this);
        c19665d.m20639a(this.f63897a, SubscriberAttributeKt.JSON_NAME_KEY);
        c19665d.m20639a(this.f63898b, "feature");
        return c19665d.toString();
    }
}
