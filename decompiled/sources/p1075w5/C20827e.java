package p1075w5;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: w5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C20827e extends AbstractC20832j {

    /* JADX INFO: renamed from: a */
    public final Drawable f66180a;

    /* JADX INFO: renamed from: b */
    public final C20831i f66181b;

    /* JADX INFO: renamed from: c */
    public final Throwable f66182c;

    public C20827e(Drawable drawable, C20831i c20831i, Throwable th2) {
        this.f66180a = drawable;
        this.f66181b = c20831i;
        this.f66182c = th2;
    }

    @Override // p1075w5.AbstractC20832j
    /* JADX INFO: renamed from: a */
    public final Drawable mo21433a() {
        return this.f66180a;
    }

    @Override // p1075w5.AbstractC20832j
    /* JADX INFO: renamed from: b */
    public final C20831i mo21434b() {
        return this.f66181b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20827e) {
            C20827e c20827e = (C20827e) obj;
            if (AbstractC16544l.m18089b(this.f66180a, c20827e.f66180a)) {
                if (AbstractC16544l.m18089b(this.f66181b, c20827e.f66181b) && AbstractC16544l.m18089b(this.f66182c, c20827e.f66182c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f66180a;
        return this.f66182c.hashCode() + ((this.f66181b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
