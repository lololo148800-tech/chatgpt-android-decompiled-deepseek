package p160G5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC16544l;
import p033B5.AbstractC0833q;
import p033B5.C0816A;
import p033B5.C0840x;
import p374P5.C6361n;
import p496U5.AbstractC7568j;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: G5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2995a implements InterfaceC3000f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9016a;

    public /* synthetic */ C2995a(int i10) {
        this.f9016a = i10;
    }

    @Override // p160G5.InterfaceC3000f
    /* JADX INFO: renamed from: a */
    public final InterfaceC3001g mo3828a(Object obj, C6361n c6361n, C0840x c0840x) {
        int i10 = 0;
        int i11 = 1;
        int i12 = 2;
        int i13 = 3;
        switch (this.f9016a) {
            case 0:
                C0816A c0816a = (C0816A) obj;
                Bitmap.Config[] configArr = AbstractC7568j.f23971a;
                if (AbstractC16544l.m18089b(c0816a.f2278c, "file") && AbstractC16544l.m18089b(AbstractC17680n.m19343S(AbstractC0833q.m1894g(c0816a)), "android_asset")) {
                    return new C2996b(c0816a, c6361n, i10);
                }
                return null;
            case 1:
                return new C2997c((Bitmap) obj, c6361n, i10);
            case 2:
                return new C2997c((byte[]) obj, c6361n, i11);
            case 3:
                return new C2997c((ByteBuffer) obj, c6361n, i12);
            case 4:
                C0816A c0816a2 = (C0816A) obj;
                if (AbstractC16544l.m18089b(c0816a2.f2278c, "content")) {
                    return new C2996b(c0816a2, c6361n, i11);
                }
                return null;
            case 5:
                return new C2997c((Drawable) obj, c6361n, i13);
            case 6:
                C0816A c0816a3 = (C0816A) obj;
                String str = c0816a3.f2278c;
                if ((str != null && !str.equals("file")) || c0816a3.f2280e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = AbstractC7568j.f23971a;
                if (AbstractC16544l.m18089b(c0816a3.f2278c, "file") && AbstractC16544l.m18089b(AbstractC17680n.m19343S(AbstractC0833q.m1894g(c0816a3)), "android_asset")) {
                    return null;
                }
                return new C2996b(c0816a3, c6361n, i12);
            case 7:
                C0816A c0816a4 = (C0816A) obj;
                if (AbstractC16544l.m18089b(c0816a4.f2278c, "jar:file")) {
                    return new C2996b(c0816a4, c6361n, i13);
                }
                return null;
            default:
                C0816A c0816a5 = (C0816A) obj;
                if (AbstractC16544l.m18089b(c0816a5.f2278c, "android.resource")) {
                    return new C2996b(c0816a5, c6361n, 4);
                }
                return null;
        }
    }
}
