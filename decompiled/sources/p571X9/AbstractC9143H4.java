package p571X9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p102Dm.AbstractC2119a;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p397Q5.C6579h;
import p397Q5.EnumC6578g;
import p496U5.AbstractC7568j;
import p509Uk.lpqL.SfpOlmlMATQ;
import p523V9.AbstractC8198t4;
import p919o8.AbstractC17962d;
import p919o8.C17941V;

/* JADX INFO: renamed from: X9.H4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9143H4 {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (p523V9.AbstractC8198t4.m8800c(r0.getWidth(), r0.getHeight(), (int) (r4 >> 32), (int) (r4 & 4294967295L), r11) == 1.0d) goto L16;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m9687a(Drawable drawable, Bitmap.Config config, C6579h c6579h, EnumC6578g enumC6578g, boolean z6) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap.getConfig() == ((config == null || AbstractC9131F4.m9673b(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z6) {
                    long jM8799b = AbstractC8198t4.m8799b(bitmap.getWidth(), bitmap.getHeight(), c6579h, enumC6578g, C6579h.f21264c);
                }
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iM7916b = AbstractC7568j.m7916b(drawableMutate);
        if (iM7916b <= 0) {
            iM7916b = 512;
        }
        int iM7915a = AbstractC7568j.m7915a(drawableMutate);
        int i10 = iM7915a > 0 ? iM7915a : 512;
        long jM8799b2 = AbstractC8198t4.m8799b(iM7916b, i10, c6579h, enumC6578g, C6579h.f21264c);
        double dM8800c = AbstractC8198t4.m8800c(iM7916b, i10, (int) (jM8799b2 >> 32), (int) (4294967295L & jM8799b2), enumC6578g);
        int iM3194h = AbstractC2119a.m3194h(((double) iM7916b) * dM8800c);
        int iM3194h2 = AbstractC2119a.m3194h(dM8800c * ((double) i10));
        if (config == null || AbstractC9131F4.m9673b(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM3194h, iM3194h2, config);
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iM3194h, iM3194h2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static C17941V m9688b(C3676s c3676s) {
        try {
            String strMo4384r = c3676s.m4395w("type").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"type\").asString");
            for (int i10 : AbstractC0010F.m27k(7)) {
                if (AbstractC17962d.m19613D(i10).equals(strMo4384r)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(SfpOlmlMATQ.rMbpUT);
                    String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("model");
                    String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("brand");
                    String strMo4384r4 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("architecture");
                    return new C17941V(i10, strMo4384r2, strMo4384r3, strMo4384r4, abstractC3673pM4395w4 != null ? abstractC3673pM4395w4.mo4384r() : null);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Device", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Device", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Device", e12);
        }
    }
}
