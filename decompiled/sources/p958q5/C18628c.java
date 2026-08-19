package p958q5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import p007A5.AbstractC0371f;
import p026Ao.C0675i;
import p1075w5.C20835m;
import p353O4.C6130q;
import p523V9.AbstractC8020X;
import p899n5.C17498o;
import p899n5.C17500q;
import p899n5.EnumC17488e;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: q5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18628c implements InterfaceC18632g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59350a;

    /* JADX INFO: renamed from: b */
    public final C20835m f59351b;

    /* JADX INFO: renamed from: c */
    public final Object f59352c;

    public /* synthetic */ C18628c(Object obj, C20835m c20835m, int i10) {
        this.f59350a = i10;
        this.f59352c = obj;
        this.f59351b = c20835m;
    }

    @Override // p958q5.InterfaceC18632g
    /* JADX INFO: renamed from: a */
    public final Object mo19985a(InterfaceC18770c interfaceC18770c) {
        boolean z6 = true;
        C20835m c20835m = this.f59351b;
        Object obj = this.f59352c;
        switch (this.f59350a) {
            case 0:
                return new C18629d(new BitmapDrawable(c20835m.f66238a.getResources(), (Bitmap) obj), false, EnumC17488e.f55952Z);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    C0675i c0675i = new C0675i();
                    c0675i.write(byteBuffer);
                    return new C18638m(new C17500q(c0675i, new C17498o(c20835m.f66238a, 1), null), null, EnumC17488e.f55952Z);
                } finally {
                    byteBuffer.position(0);
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config config = AbstractC0371f.f1262a;
                if (!(bitmapDrawable instanceof VectorDrawable) && !(bitmapDrawable instanceof C6130q)) {
                    z6 = false;
                }
                if (z6) {
                    bitmapDrawable = new BitmapDrawable(c20835m.f66238a.getResources(), AbstractC8020X.m8356f(bitmapDrawable, c20835m.f66239b, c20835m.f66241d, c20835m.f66242e, c20835m.f66243f));
                }
                return new C18629d(bitmapDrawable, z6, EnumC17488e.f55952Z);
        }
    }
}
