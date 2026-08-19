package p1075w5;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC16544l;
import p1033u5.C20116a;
import p899n5.EnumC17488e;

/* JADX INFO: renamed from: w5.p */
/* JADX INFO: loaded from: classes.dex */
public final class C20838p extends AbstractC20832j {

    /* JADX INFO: renamed from: a */
    public final Drawable f66255a;

    /* JADX INFO: renamed from: b */
    public final C20831i f66256b;

    /* JADX INFO: renamed from: c */
    public final EnumC17488e f66257c;

    /* JADX INFO: renamed from: d */
    public final C20116a f66258d;

    /* JADX INFO: renamed from: e */
    public final String f66259e;

    /* JADX INFO: renamed from: f */
    public final boolean f66260f;

    /* JADX INFO: renamed from: g */
    public final boolean f66261g;

    public C20838p(Drawable drawable, C20831i c20831i, EnumC17488e enumC17488e, C20116a c20116a, String str, boolean z6, boolean z10) {
        this.f66255a = drawable;
        this.f66256b = c20831i;
        this.f66257c = enumC17488e;
        this.f66258d = c20116a;
        this.f66259e = str;
        this.f66260f = z6;
        this.f66261g = z10;
    }

    @Override // p1075w5.AbstractC20832j
    /* JADX INFO: renamed from: a */
    public final Drawable mo21433a() {
        return this.f66255a;
    }

    @Override // p1075w5.AbstractC20832j
    /* JADX INFO: renamed from: b */
    public final C20831i mo21434b() {
        return this.f66256b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20838p) {
            C20838p c20838p = (C20838p) obj;
            if (AbstractC16544l.m18089b(this.f66255a, c20838p.f66255a)) {
                if (AbstractC16544l.m18089b(this.f66256b, c20838p.f66256b) && this.f66257c == c20838p.f66257c && AbstractC16544l.m18089b(this.f66258d, c20838p.f66258d) && AbstractC16544l.m18089b(this.f66259e, c20838p.f66259e) && this.f66260f == c20838p.f66260f && this.f66261g == c20838p.f66261g) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f66257c.hashCode() + ((this.f66256b.hashCode() + (this.f66255a.hashCode() * 31)) * 31)) * 31;
        C20116a c20116a = this.f66258d;
        int iHashCode2 = (iHashCode + (c20116a != null ? c20116a.hashCode() : 0)) * 31;
        String str = this.f66259e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f66260f ? 1231 : 1237)) * 31) + (this.f66261g ? 1231 : 1237);
    }
}
