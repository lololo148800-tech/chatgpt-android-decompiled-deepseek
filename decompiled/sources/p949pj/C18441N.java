package p949pj;

import ac.C10539a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1048uo.AbstractC20405l;
import p1060v9.AbstractC20502t;
import p523V9.AbstractC7972Q3;

/* JADX INFO: renamed from: pj.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C18441N extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58834Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Image f58835Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f58836o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18441N(Image image, int i10, int i11) {
        super(0);
        this.f58834Y = i11;
        this.f58835Z = image;
        this.f58836o0 = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C10539a c10539a;
        int iLimit;
        switch (this.f58834Y) {
            case 0:
                return AbstractC20405l.m21072c(this.f58835Z, this.f58836o0);
            default:
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Image image = this.f58835Z;
                AbstractC20502t.m21158i(image, "Please provide a valid image");
                int i10 = this.f58836o0;
                C10539a.m10978b(i10);
                AbstractC20502t.m21150a("Only JPEG and YUV_420_888 are supported now", image.getFormat() == 256 || image.getFormat() == 35);
                Image.Plane[] planes = image.getPlanes();
                if (image.getFormat() == 256) {
                    iLimit = image.getPlanes()[0].getBuffer().limit();
                    AbstractC20502t.m21150a("Only JPEG is supported now", image.getFormat() == 256);
                    Image.Plane[] planes2 = image.getPlanes();
                    if (planes2 == null || planes2.length != 1) {
                        throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
                    }
                    ByteBuffer buffer = planes2[0].getBuffer();
                    buffer.rewind();
                    int iRemaining = buffer.remaining();
                    byte[] bArr = new byte[iRemaining];
                    buffer.get(bArr);
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
                    c10539a = new C10539a(AbstractC7972Q3.m8268i(bitmapDecodeByteArray, i10, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight()), 0);
                } else {
                    for (Image.Plane plane : planes) {
                        if (plane.getBuffer() != null) {
                            plane.getBuffer().rewind();
                        }
                    }
                    c10539a = new C10539a(image, image.getWidth(), image.getHeight(), i10);
                    iLimit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
                }
                C10539a c10539a2 = c10539a;
                C10539a.m10979c(image.getFormat(), 5, jElapsedRealtime, image.getHeight(), image.getWidth(), iLimit, i10);
                return c10539a2;
        }
    }
}
