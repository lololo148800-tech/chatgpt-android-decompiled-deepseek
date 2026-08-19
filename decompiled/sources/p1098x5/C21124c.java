package p1098x5;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.AbstractC16544l;
import p864l5.C16823j;

/* JADX INFO: renamed from: x5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21124c implements InterfaceC21130i {

    /* JADX INFO: renamed from: Y */
    public final Context f67120Y;

    public C21124c(Context context) {
        this.f67120Y = context;
    }

    @Override // p1098x5.InterfaceC21130i
    /* JADX INFO: renamed from: a */
    public final Object mo10210a(C16823j c16823j) {
        DisplayMetrics displayMetrics = this.f67120Y.getResources().getDisplayMetrics();
        C21122a c21122a = new C21122a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new C21129h(c21122a, c21122a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21124c) {
            if (AbstractC16544l.m18089b(this.f67120Y, ((C21124c) obj).f67120Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f67120Y.hashCode();
    }
}
