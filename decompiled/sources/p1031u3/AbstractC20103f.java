package p1031u3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: u3.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20103f implements InterfaceC20101d {

    /* JADX INFO: renamed from: b */
    public C20099b f63647b;

    /* JADX INFO: renamed from: c */
    public C20099b f63648c;

    /* JADX INFO: renamed from: d */
    public C20099b f63649d;

    /* JADX INFO: renamed from: e */
    public C20099b f63650e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f63651f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f63652g;

    /* JADX INFO: renamed from: h */
    public boolean f63653h;

    public AbstractC20103f() {
        ByteBuffer byteBuffer = InterfaceC20101d.f63646a;
        this.f63651f = byteBuffer;
        this.f63652g = byteBuffer;
        C20099b c20099b = C20099b.f63641e;
        this.f63649d = c20099b;
        this.f63650e = c20099b;
        this.f63647b = c20099b;
        this.f63648c = c20099b;
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: a */
    public boolean mo3352a() {
        return this.f63650e != C20099b.f63641e;
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: b */
    public ByteBuffer mo3363b() {
        ByteBuffer byteBuffer = this.f63652g;
        this.f63652g = InterfaceC20101d.f63646a;
        return byteBuffer;
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: c */
    public final void mo20936c() {
        flush();
        this.f63651f = InterfaceC20101d.f63646a;
        C20099b c20099b = C20099b.f63641e;
        this.f63649d = c20099b;
        this.f63650e = c20099b;
        this.f63647b = c20099b;
        this.f63648c = c20099b;
        mo3357k();
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: d */
    public final C20099b mo20937d(C20099b c20099b) {
        this.f63649d = c20099b;
        this.f63650e = mo3354h(c20099b);
        return mo3352a() ? this.f63650e : C20099b.f63641e;
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: f */
    public final void mo20938f() {
        this.f63653h = true;
        mo3356j();
    }

    @Override // p1031u3.InterfaceC20101d
    public final void flush() {
        this.f63652g = InterfaceC20101d.f63646a;
        this.f63653h = false;
        this.f63647b = this.f63649d;
        this.f63648c = this.f63650e;
        mo3355i();
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: g */
    public boolean mo3364g() {
        return this.f63653h && this.f63652g == InterfaceC20101d.f63646a;
    }

    /* JADX INFO: renamed from: h */
    public abstract C20099b mo3354h(C20099b c20099b);

    /* JADX INFO: renamed from: l */
    public final ByteBuffer m20939l(int i10) {
        if (this.f63651f.capacity() < i10) {
            this.f63651f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f63651f.clear();
        }
        ByteBuffer byteBuffer = this.f63651f;
        this.f63652g = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: renamed from: i */
    public void mo3355i() {
    }

    /* JADX INFO: renamed from: j */
    public void mo3356j() {
    }

    /* JADX INFO: renamed from: k */
    public void mo3357k() {
    }
}
