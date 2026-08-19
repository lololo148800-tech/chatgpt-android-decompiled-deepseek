package p140Fa;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: Fa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2682b implements InterfaceC2683c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2683c f8218a;

    /* JADX INFO: renamed from: b */
    public final float f8219b;

    public C2682b(float f10, InterfaceC2683c interfaceC2683c) {
        while (interfaceC2683c instanceof C2682b) {
            interfaceC2683c = ((C2682b) interfaceC2683c).f8218a;
            f10 += ((C2682b) interfaceC2683c).f8219b;
        }
        this.f8218a = interfaceC2683c;
        this.f8219b = f10;
    }

    @Override // p140Fa.InterfaceC2683c
    /* JADX INFO: renamed from: a */
    public final float mo3657a(RectF rectF) {
        return Math.max(0.0f, this.f8218a.mo3657a(rectF) + this.f8219b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2682b)) {
            return false;
        }
        C2682b c2682b = (C2682b) obj;
        return this.f8218a.equals(c2682b.f8218a) && this.f8219b == c2682b.f8219b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8218a, Float.valueOf(this.f8219b)});
    }
}
