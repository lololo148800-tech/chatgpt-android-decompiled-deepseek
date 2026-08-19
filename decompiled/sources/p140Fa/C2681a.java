package p140Fa;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: Fa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2681a implements InterfaceC2683c {

    /* JADX INFO: renamed from: a */
    public final float f8217a;

    public C2681a(float f10) {
        this.f8217a = f10;
    }

    @Override // p140Fa.InterfaceC2683c
    /* JADX INFO: renamed from: a */
    public final float mo3657a(RectF rectF) {
        return this.f8217a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2681a) && this.f8217a == ((C2681a) obj).f8217a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8217a)});
    }
}
