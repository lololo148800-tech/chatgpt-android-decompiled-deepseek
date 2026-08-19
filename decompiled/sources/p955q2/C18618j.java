package p955q2;

import android.content.res.Resources;
import p817j$.util.Objects;

/* JADX INFO: renamed from: q2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C18618j {

    /* JADX INFO: renamed from: a */
    public final Resources f59297a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f59298b;

    public C18618j(Resources resources, Resources.Theme theme) {
        this.f59297a = resources;
        this.f59298b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18618j.class != obj.getClass()) {
            return false;
        }
        C18618j c18618j = (C18618j) obj;
        return this.f59297a.equals(c18618j.f59297a) && Objects.equals(this.f59298b, c18618j.f59298b);
    }

    public final int hashCode() {
        return Objects.hash(this.f59297a, this.f59298b);
    }
}
