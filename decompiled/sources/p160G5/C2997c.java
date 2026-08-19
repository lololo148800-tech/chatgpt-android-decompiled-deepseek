package p160G5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import p026Ao.AbstractC0668b;
import p026Ao.C0675i;
import p033B5.AbstractC0833q;
import p111E5.C2322f;
import p111E5.C2335s;
import p111E5.EnumC2324h;
import p353O4.C6130q;
import p374P5.AbstractC6356i;
import p374P5.C6361n;
import p397Q5.EnumC6575d;
import p496U5.AbstractC7568j;
import p571X9.AbstractC9143H4;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: G5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2997c implements InterfaceC3001g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9020a;

    /* JADX INFO: renamed from: b */
    public final C6361n f9021b;

    /* JADX INFO: renamed from: c */
    public final Object f9022c;

    public /* synthetic */ C2997c(Object obj, C6361n c6361n, int i10) {
        this.f9020a = i10;
        this.f9022c = obj;
        this.f9021b = c6361n;
    }

    @Override // p160G5.InterfaceC3001g
    /* JADX INFO: renamed from: a */
    public final Object mo3829a(AbstractC19687c abstractC19687c) {
        C6361n c6361n = this.f9021b;
        Object obj = this.f9022c;
        switch (this.f9020a) {
            case 0:
                return new C3002h(AbstractC0833q.m1890c(new BitmapDrawable(c6361n.f20697a.getResources(), (Bitmap) obj)), false, EnumC2324h.f7225Z);
            case 1:
                C0675i c0675i = new C0675i();
                c0675i.m1433d1((byte[]) obj);
                return new C3003i(new C2335s(c0675i, c6361n.f20702f, null), null, EnumC2324h.f7225Z);
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new C3003i(new C2335s(AbstractC0668b.m1403c(new C2998d(byteBuffer)), c6361n.f20702f, new C2322f(byteBuffer)), null, EnumC2324h.f7225Z);
            default:
                Bitmap.Config[] configArr = AbstractC7568j.f23971a;
                Drawable bitmapDrawable = (Drawable) obj;
                boolean z6 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof C6130q);
                if (z6) {
                    bitmapDrawable = new BitmapDrawable(c6361n.f20697a.getResources(), AbstractC9143H4.m9687a(bitmapDrawable, AbstractC6356i.m6975b(c6361n), c6361n.f20698b, c6361n.f20699c, c6361n.f20700d == EnumC6575d.f21259Z));
                }
                return new C3002h(AbstractC0833q.m1890c(bitmapDrawable), z6, EnumC2324h.f7225Z);
        }
    }
}
