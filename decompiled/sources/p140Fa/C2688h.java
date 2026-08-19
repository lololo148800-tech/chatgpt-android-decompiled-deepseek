package p140Fa;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: Fa.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2688h implements InterfaceC2683c {

    /* JADX INFO: renamed from: a */
    public final float f8260a;

    public C2688h(float f10) {
        this.f8260a = f10;
    }

    @Override // p140Fa.InterfaceC2683c
    /* JADX INFO: renamed from: a */
    public final float mo3657a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f8260a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2688h) && this.f8260a == ((C2688h) obj).f8260a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8260a)});
    }
}
