package p958q5;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC16544l;
import p899n5.EnumC17488e;

/* JADX INFO: renamed from: q5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18629d extends AbstractC18630e {

    /* JADX INFO: renamed from: a */
    public final Drawable f59353a;

    /* JADX INFO: renamed from: b */
    public final boolean f59354b;

    /* JADX INFO: renamed from: c */
    public final EnumC17488e f59355c;

    public C18629d(Drawable drawable, boolean z6, EnumC17488e enumC17488e) {
        this.f59353a = drawable;
        this.f59354b = z6;
        this.f59355c = enumC17488e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18629d) {
            C18629d c18629d = (C18629d) obj;
            if (AbstractC16544l.m18089b(this.f59353a, c18629d.f59353a) && this.f59354b == c18629d.f59354b && this.f59355c == c18629d.f59355c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f59355c.hashCode() + (((this.f59353a.hashCode() * 31) + (this.f59354b ? 1231 : 1237)) * 31);
    }
}
