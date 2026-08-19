package p1031u3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: u3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C20105h implements InterfaceC20101d {

    /* JADX INFO: renamed from: b */
    public int f63676b;

    /* JADX INFO: renamed from: c */
    public float f63677c;

    /* JADX INFO: renamed from: d */
    public float f63678d;

    /* JADX INFO: renamed from: e */
    public C20099b f63679e;

    /* JADX INFO: renamed from: f */
    public C20099b f63680f;

    /* JADX INFO: renamed from: g */
    public C20099b f63681g;

    /* JADX INFO: renamed from: h */
    public C20099b f63682h;

    /* JADX INFO: renamed from: i */
    public boolean f63683i;

    /* JADX INFO: renamed from: j */
    public C20104g f63684j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f63685k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f63686l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f63687m;

    /* JADX INFO: renamed from: n */
    public long f63688n;

    /* JADX INFO: renamed from: o */
    public long f63689o;

    /* JADX INFO: renamed from: p */
    public boolean f63690p;

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: a */
    public final boolean mo3352a() {
        return this.f63680f.f63642a != -1 && (Math.abs(this.f63677c - 1.0f) >= 1.0E-4f || Math.abs(this.f63678d - 1.0f) >= 1.0E-4f || this.f63680f.f63642a != this.f63679e.f63642a);
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: b */
    public final ByteBuffer mo3363b() {
        C20104g c20104g = this.f63684j;
        if (c20104g != null) {
            int i10 = c20104g.f63666m;
            int i11 = c20104g.f63655b;
            int i12 = i10 * i11 * 2;
            if (i12 > 0) {
                if (this.f63685k.capacity() < i12) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                    this.f63685k = byteBufferOrder;
                    this.f63686l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f63685k.clear();
                    this.f63686l.clear();
                }
                ShortBuffer shortBuffer = this.f63686l;
                int iMin = Math.min(shortBuffer.remaining() / i11, c20104g.f63666m);
                int i13 = iMin * i11;
                shortBuffer.put(c20104g.f63665l, 0, i13);
                int i14 = c20104g.f63666m - iMin;
                c20104g.f63666m = i14;
                short[] sArr = c20104g.f63665l;
                System.arraycopy(sArr, i13, sArr, 0, i14 * i11);
                this.f63689o += (long) i12;
                this.f63685k.limit(i12);
                this.f63687m = this.f63685k;
            }
        }
        ByteBuffer byteBuffer = this.f63687m;
        this.f63687m = InterfaceC20101d.f63646a;
        return byteBuffer;
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: c */
    public final void mo20936c() {
        this.f63677c = 1.0f;
        this.f63678d = 1.0f;
        C20099b c20099b = C20099b.f63641e;
        this.f63679e = c20099b;
        this.f63680f = c20099b;
        this.f63681g = c20099b;
        this.f63682h = c20099b;
        ByteBuffer byteBuffer = InterfaceC20101d.f63646a;
        this.f63685k = byteBuffer;
        this.f63686l = byteBuffer.asShortBuffer();
        this.f63687m = byteBuffer;
        this.f63676b = -1;
        this.f63683i = false;
        this.f63684j = null;
        this.f63688n = 0L;
        this.f63689o = 0L;
        this.f63690p = false;
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: d */
    public final C20099b mo20937d(C20099b c20099b) throws C20100c {
        if (c20099b.f63644c != 2) {
            throw new C20100c(c20099b);
        }
        int i10 = this.f63676b;
        if (i10 == -1) {
            i10 = c20099b.f63642a;
        }
        this.f63679e = c20099b;
        C20099b c20099b2 = new C20099b(i10, c20099b.f63643b, 2);
        this.f63680f = c20099b2;
        this.f63683i = true;
        return c20099b2;
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: e */
    public final void mo3353e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C20104g c20104g = this.f63684j;
            c20104g.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f63688n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = c20104g.f63655b;
            int i11 = iRemaining2 / i10;
            short[] sArrM20943c = c20104g.m20943c(c20104g.f63663j, c20104g.f63664k, i11);
            c20104g.f63663j = sArrM20943c;
            shortBufferAsShortBuffer.get(sArrM20943c, c20104g.f63664k * i10, ((i11 * i10) * 2) / 2);
            c20104g.f63664k += i11;
            c20104g.m20945f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: f */
    public final void mo20938f() {
        C20104g c20104g = this.f63684j;
        if (c20104g != null) {
            int i10 = c20104g.f63664k;
            float f10 = c20104g.f63656c;
            float f11 = c20104g.f63657d;
            int i11 = c20104g.f63666m + ((int) ((((i10 / (f10 / f11)) + c20104g.f63668o) / (c20104g.f63658e * f11)) + 0.5f));
            short[] sArr = c20104g.f63663j;
            int i12 = c20104g.f63661h * 2;
            c20104g.f63663j = c20104g.m20943c(sArr, i10, i12 + i10);
            int i13 = 0;
            while (true) {
                int i14 = c20104g.f63655b;
                if (i13 >= i12 * i14) {
                    break;
                }
                c20104g.f63663j[(i14 * i10) + i13] = 0;
                i13++;
            }
            c20104g.f63664k = i12 + c20104g.f63664k;
            c20104g.m20945f();
            if (c20104g.f63666m > i11) {
                c20104g.f63666m = i11;
            }
            c20104g.f63664k = 0;
            c20104g.f63671r = 0;
            c20104g.f63668o = 0;
        }
        this.f63690p = true;
    }

    @Override // p1031u3.InterfaceC20101d
    public final void flush() {
        if (mo3352a()) {
            C20099b c20099b = this.f63679e;
            this.f63681g = c20099b;
            C20099b c20099b2 = this.f63680f;
            this.f63682h = c20099b2;
            if (this.f63683i) {
                int i10 = c20099b.f63642a;
                this.f63684j = new C20104g(this.f63677c, this.f63678d, i10, c20099b.f63643b, c20099b2.f63642a);
            } else {
                C20104g c20104g = this.f63684j;
                if (c20104g != null) {
                    c20104g.f63664k = 0;
                    c20104g.f63666m = 0;
                    c20104g.f63668o = 0;
                    c20104g.f63669p = 0;
                    c20104g.f63670q = 0;
                    c20104g.f63671r = 0;
                    c20104g.f63672s = 0;
                    c20104g.f63673t = 0;
                    c20104g.f63674u = 0;
                    c20104g.f63675v = 0;
                }
            }
        }
        this.f63687m = InterfaceC20101d.f63646a;
        this.f63688n = 0L;
        this.f63689o = 0L;
        this.f63690p = false;
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: g */
    public final boolean mo3364g() {
        C20104g c20104g;
        return this.f63690p && ((c20104g = this.f63684j) == null || (c20104g.f63666m * c20104g.f63655b) * 2 == 0);
    }
}
