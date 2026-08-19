package p774h1;

import android.graphics.ColorFilter;
import com.google.protobuf.AbstractC12107L1;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import mm.C17321x;

/* JADX INFO: renamed from: h1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C14356l {

    /* JADX INFO: renamed from: a */
    public final ColorFilter f45044a;

    /* JADX INFO: renamed from: b */
    public final long f45045b;

    /* JADX INFO: renamed from: c */
    public final int f45046c;

    public C14356l(long j10, int i10, ColorFilter colorFilter) {
        this.f45044a = colorFilter;
        this.f45045b = j10;
        this.f45046c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14356l)) {
            return false;
        }
        C14356l c14356l = (C14356l) obj;
        return C14365u.m15775c(this.f45045b, c14356l.f45045b) && AbstractC14334L.m15639q(this.f45046c, c14356l.f45046c);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return (C17321x.m18981a(this.f45045b) * 31) + this.f45046c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC12107L1.m13828s(this.f45045b, HJrCuD.YOYX, sb2);
        int i10 = this.f45046c;
        if (AbstractC14334L.m15639q(i10, 0)) {
            str = "Clear";
        } else if (AbstractC14334L.m15639q(i10, 1)) {
            str = "Src";
        } else if (AbstractC14334L.m15639q(i10, 2)) {
            str = "Dst";
        } else if (AbstractC14334L.m15639q(i10, 3)) {
            str = "SrcOver";
        } else if (AbstractC14334L.m15639q(i10, 4)) {
            str = "DstOver";
        } else if (AbstractC14334L.m15639q(i10, 5)) {
            str = "SrcIn";
        } else if (AbstractC14334L.m15639q(i10, 6)) {
            str = "DstIn";
        } else if (AbstractC14334L.m15639q(i10, 7)) {
            str = "SrcOut";
        } else if (AbstractC14334L.m15639q(i10, 8)) {
            str = "DstOut";
        } else if (AbstractC14334L.m15639q(i10, 9)) {
            str = "SrcAtop";
        } else if (AbstractC14334L.m15639q(i10, 10)) {
            str = "DstAtop";
        } else if (AbstractC14334L.m15639q(i10, 11)) {
            str = "Xor";
        } else if (AbstractC14334L.m15639q(i10, 12)) {
            str = "Plus";
        } else if (AbstractC14334L.m15639q(i10, 13)) {
            str = "Modulate";
        } else if (AbstractC14334L.m15639q(i10, 14)) {
            str = "Screen";
        } else if (AbstractC14334L.m15639q(i10, 15)) {
            str = "Overlay";
        } else if (AbstractC14334L.m15639q(i10, 16)) {
            str = "Darken";
        } else if (AbstractC14334L.m15639q(i10, 17)) {
            str = "Lighten";
        } else if (AbstractC14334L.m15639q(i10, 18)) {
            str = "ColorDodge";
        } else if (AbstractC14334L.m15639q(i10, 19)) {
            str = "ColorBurn";
        } else if (AbstractC14334L.m15639q(i10, 20)) {
            str = "HardLight";
        } else if (AbstractC14334L.m15639q(i10, 21)) {
            str = "Softlight";
        } else if (AbstractC14334L.m15639q(i10, 22)) {
            str = "Difference";
        } else if (AbstractC14334L.m15639q(i10, 23)) {
            str = "Exclusion";
        } else if (AbstractC14334L.m15639q(i10, 24)) {
            str = "Multiply";
        } else if (AbstractC14334L.m15639q(i10, 25)) {
            str = "Hue";
        } else if (AbstractC14334L.m15639q(i10, 26)) {
            str = "Saturation";
        } else if (AbstractC14334L.m15639q(i10, 27)) {
            str = "Color";
        } else {
            str = AbstractC14334L.m15639q(i10, 28) ? "Luminosity" : "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
