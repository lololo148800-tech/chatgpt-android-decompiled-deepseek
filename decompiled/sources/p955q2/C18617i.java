package p955q2;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: q2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C18617i {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f59294a;

    /* JADX INFO: renamed from: b */
    public final Configuration f59295b;

    /* JADX INFO: renamed from: c */
    public final int f59296c;

    public C18617i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f59294a = colorStateList;
        this.f59295b = configuration;
        this.f59296c = theme == null ? 0 : theme.hashCode();
    }
}
