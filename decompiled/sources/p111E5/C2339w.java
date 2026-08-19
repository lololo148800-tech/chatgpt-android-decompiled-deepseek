package p111E5;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import kotlin.jvm.internal.C16556x;
import p033B5.AbstractC0833q;
import p1009s9.C19506i;
import p102Dm.AbstractC2119a;
import p374P5.AbstractC6355h;
import p374P5.AbstractC6356i;
import p374P5.C6361n;
import p397Q5.C6579h;
import p397Q5.EnumC6575d;
import p523V9.AbstractC8198t4;
import p571X9.AbstractC9131F4;
import p654b1.AbstractC11212f;

/* JADX INFO: renamed from: E5.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2339w implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2340x f7262a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C16556x f7263b;

    public C2339w(C2340x c2340x, C16556x c16556x) {
        this.f7262a = c2340x;
        this.f7263b = c16556x;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        C6361n c6361n = this.f7262a.f7266c;
        long jM8799b = AbstractC8198t4.m8799b(width, height, c6361n.f20698b, c6361n.f20699c, (C6579h) AbstractC0833q.m1892e(c6361n, AbstractC6355h.f20682a));
        int i10 = (int) (jM8799b >> 32);
        int i11 = (int) (jM8799b & 4294967295L);
        if (width > 0 && height > 0 && (width != i10 || height != i11)) {
            double dM8800c = AbstractC8198t4.m8800c(width, height, i10, i11, this.f7262a.f7266c.f20699c);
            C16556x c16556x = this.f7263b;
            boolean z6 = dM8800c < 1.0d;
            c16556x.f51285Y = z6;
            if (z6 || this.f7262a.f7266c.f20700d == EnumC6575d.f21258Y) {
                imageDecoder.setTargetSize(AbstractC2119a.m3194h(((double) width) * dM8800c), AbstractC2119a.m3194h(dM8800c * ((double) height)));
            }
        }
        C2340x c2340x = this.f7262a;
        imageDecoder.setOnPartialImageListener(new C2336t());
        C6361n c6361n2 = c2340x.f7266c;
        imageDecoder.setAllocator(AbstractC9131F4.m9673b(AbstractC6356i.m6975b(c6361n2)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) AbstractC0833q.m1892e(c6361n2, AbstractC6356i.f20692i)).booleanValue() ? 1 : 0);
        C19506i c19506i = AbstractC6356i.f20687d;
        if (AbstractC11212f.m12421k(AbstractC0833q.m1892e(c6361n2, c19506i)) != null) {
            imageDecoder.setTargetColorSpace(AbstractC11212f.m12421k(AbstractC0833q.m1892e(c6361n2, c19506i)));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) AbstractC0833q.m1892e(c6361n2, AbstractC6356i.f20688e)).booleanValue());
    }
}
