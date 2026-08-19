package p938p2;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.HashSet;
import p001A.AbstractC0091u0;
import p082D2.AbstractC1854a;

/* JADX INFO: renamed from: p2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18287a {

    /* JADX INFO: renamed from: a */
    public Application f58377a;

    /* JADX INFO: renamed from: b */
    public String f58378b;

    /* JADX INFO: renamed from: c */
    public Intent[] f58379c;

    /* JADX INFO: renamed from: d */
    public CharSequence f58380d;

    /* JADX INFO: renamed from: e */
    public IconCompat f58381e;

    /* JADX INFO: renamed from: f */
    public HashSet f58382f;

    /* JADX INFO: renamed from: g */
    public boolean f58383g;

    /* JADX INFO: renamed from: h */
    public PersistableBundle f58384h;

    /* JADX INFO: renamed from: a */
    public final ShortcutInfo m19829a() {
        AbstractC1854a.m2720i();
        ShortcutInfo.Builder intents = AbstractC1854a.m2713b(this.f58377a, this.f58378b).setShortLabel(this.f58380d).setIntents(this.f58379c);
        IconCompat iconCompat = this.f58381e;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m11389g(this.f58377a));
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setLongLabel(null);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        HashSet hashSet = this.f58382f;
        if (hashSet != null) {
            intents.setCategories(hashSet);
        }
        intents.setRank(0);
        PersistableBundle persistableBundle = this.f58384h;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            intents.setLongLived(this.f58383g);
        } else {
            if (this.f58384h == null) {
                this.f58384h = new PersistableBundle();
            }
            this.f58384h.putBoolean("extraLongLived", this.f58383g);
            intents.setExtras(this.f58384h);
        }
        if (i10 >= 33) {
            AbstractC0091u0.m327e(intents);
        }
        return intents.build();
    }
}
