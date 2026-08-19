package p033B5;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC16544l;
import p496U5.AbstractC7568j;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: B5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0824h implements InterfaceC0829m {

    /* JADX INFO: renamed from: a */
    public final Drawable f2304a;

    public C0824h(Drawable drawable) {
        this.f2304a = drawable;
    }

    @Override // p033B5.InterfaceC0829m
    /* JADX INFO: renamed from: b */
    public final long mo1876b() {
        Drawable drawable = this.f2304a;
        return AbstractC8301I.m8916g(((long) AbstractC7568j.m7916b(drawable)) * 4 * ((long) AbstractC7568j.m7915a(drawable)), 0L);
    }

    @Override // p033B5.InterfaceC0829m
    /* JADX INFO: renamed from: c */
    public final boolean mo1877c() {
        return false;
    }

    @Override // p033B5.InterfaceC0829m
    /* JADX INFO: renamed from: d */
    public final void mo1878d(Canvas canvas) {
        this.f2304a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0824h) {
            return AbstractC16544l.m18089b(this.f2304a, ((C0824h) obj).f2304a);
        }
        return false;
    }

    @Override // p033B5.InterfaceC0829m
    public final int getHeight() {
        return AbstractC7568j.m7915a(this.f2304a);
    }

    @Override // p033B5.InterfaceC0829m
    public final int getWidth() {
        return AbstractC7568j.m7916b(this.f2304a);
    }

    public final int hashCode() {
        return (this.f2304a.hashCode() * 31) + 1237;
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.f2304a + ", shareable=false)";
    }
}
